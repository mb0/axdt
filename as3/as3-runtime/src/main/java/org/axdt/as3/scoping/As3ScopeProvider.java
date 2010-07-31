package org.axdt.as3.scoping;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.axdt.as3.As3EFactory;
import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3AccessExpression;
import org.axdt.as3.model.As3Class;
import org.axdt.as3.model.As3Executable;
import org.axdt.as3.model.As3ExpressionList;
import org.axdt.as3.model.As3FieldBinding;
import org.axdt.as3.model.As3Program;
import org.axdt.as3.model.As3PropertyIdentifier;
import org.axdt.as3.model.As3PropertyOperator;
import org.axdt.as3.model.As3WithStatement;
import org.axdt.as3.model.IExpression;
import org.axdt.as3.model.IIdentifier;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmField;
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.scoping.AvmElementScope;
import org.axdt.avm.scoping.AvmPropertyScope;
import org.axdt.avm.scoping.AvmTypeScope;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractScopeProvider;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.Tuples;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

/**
 * This class contains custom scoping description.
 * 
 * @author mb0
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 */
public class As3ScopeProvider extends AbstractScopeProvider {

	public final Logger logger = Logger.getLogger(getClass());

	@Inject
	@Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
	private IScopeProvider delegate;

	@Inject(optional = true)
	@Named(AbstractDeclarativeScopeProvider.NAMED_ERROR_HANDLER)
	private PolymorphicDispatcher.ErrorHandler<IScope> errorHandler = new PolymorphicDispatcher.NullErrorHandler<IScope>();

	@Inject
	private IResourceScopeCache cache = IResourceScopeCache.NullImpl.INSTANCE;
	
	public void setCache(IResourceScopeCache cache) {
		this.cache = cache;
	}
	
	protected IScope delegateGetScope(EObject context, EReference reference) {
		return getDelegate().getScope(context, reference);
	}

	public void setDelegate(IScopeProvider delegate) {
		this.delegate = delegate;
	}

	public IScopeProvider getDelegate() {
		return delegate;
	}

	public void setErrorHandler(
			PolymorphicDispatcher.ErrorHandler<IScope> errorHandler) {
		this.errorHandler = errorHandler;
	}

	public PolymorphicDispatcher.ErrorHandler<IScope> getErrorHandler() {
		return errorHandler;
	}

	protected Predicate<Method> getPredicate(EObject context, EClass type) {
		String methodName = "scope_" + type.getName();
		return PolymorphicDispatcher.Predicates.forName(methodName, 3);
	}

	public IScope getScope(EObject context, EReference reference) {
		IScope scope = polymorphicFindScopeForClassName(context, reference);
		if (scope == null)
			scope = delegateGetScope(context, reference);
		return scope;
	}

	private IScope polymorphicFindScopeForClassName(EObject context,
			EReference reference) {
		IScope scope = null;
		PolymorphicDispatcher<IScope> dispatcher = new PolymorphicDispatcher<IScope>(
				Collections.singletonList(this), getPredicate(context,
						reference.getEReferenceType()), errorHandler);
		EObject current = context;
		while (scope == null && current != null) {
			scope = dispatcher.invoke(current, context, reference);
			current = current.eContainer();
		}
		return scope;
	}

	IScope getCachedScope(EObject ctx, EReference ref, Provider<IScope> provider) {
		return cache.get(getCacheKey(ctx, ref), ctx.eResource(), provider);
	}
	<T extends EObject> IScope getCachedScope(final T ctx, final EReference ref, final Class<? extends AvmElementScope<T>> type) {
		return getCachedScope(ctx, ref, new Provider<IScope>() {
			@SuppressWarnings("unchecked")
			public IScope get() {
				try {
					Constructor<IScope> constructor = type.getConstructors()[0];
					return constructor.newInstance(ctx, ref, As3ScopeProvider.this);
				} catch (Exception e) {
					logger.warn("error creating avm element scope", e);
					return null;
				}
			}
		});
	}
	Object getCacheKey(EObject ctx, EReference ref) {
		return Tuples.create(As3ScopeProvider.class, ctx, ref);
	}

	IScope scope_AvmType(AvmTypeReference ctx, EObject initial, EReference ref) {
		return delegateGetScope(ctx, ref);
	}

	IScope scope_AvmReferable(As3Program ctx, EObject initial, EReference ref) {
		return getCachedScope(ctx, ref, As3ProgramScope.class);
	}

	IScope scope_AvmReferable(As3Class ctx, EObject initial, EReference ref) {
		return getCachedScope(ctx, ref, AvmTypeScope.class);
	}

	IScope scope_AvmReferable(As3Executable ctx, EObject initial, EReference ref) {
		return getCachedScope(ctx, ref, As3ExecutableScope.class);
	}
	
	IScope scope_AvmReferable(final As3WithStatement ctx, final EObject initial, final EReference ref) {
		EObject current = initial;
		while (current != null) {
			if (ctx.equals(current.eContainer())) {
				if (current.eContainingFeature() == As3EPackage.eINSTANCE
						.getAs3WithStatement_Statement())
					return getCachedScope(ctx, ref, new Provider<IScope>() {
						public IScope get() {
							return new As3WithScope(ctx, initial, ref, As3ScopeProvider.this);
						}
					});
				break;
			}
			current = current.eContainer();
		}
		return null;
	}
	IScope scope_AvmReferable(As3PropertyOperator ctx, EObject initial, EReference ref) {
		if (ctx.getIdentifier() != null
				&& ctx.eContainingFeature() == As3EPackage.eINSTANCE.getAs3AccessExpression_Operator()) {
			As3AccessExpression access = (As3AccessExpression) ctx.eContainer();
			return getCachedScope(access, ref, As3PropertyScope.class);
		}
		return null;
	}
}

class As3ProgramScope extends AvmElementScope<As3Program> {

	public As3ProgramScope(As3Program element, EReference ref,
			IScopeProvider scopeProvider) {
		super(element, ref, scopeProvider);
	}

	@Override
	protected Iterable<? extends AvmReferable> getCandidates() {
		return Iterables.concat(element.getMembers(), element.getTypes());
	}

	@Override
	protected IScope createParentScope() {
		if (scopeProvider instanceof As3ScopeProvider) {
			As3ScopeProvider provider = (As3ScopeProvider) scopeProvider;
			return provider.delegateGetScope(element, ref);
		}
		return IScope.NULLSCOPE;
	}
}

class As3ExecutableScope extends AvmElementScope<As3Executable> {

	public As3ExecutableScope(As3Executable element, EReference ref,
			IScopeProvider scopeProvider) {
		super(element, ref, scopeProvider);
	}

	@Override
	protected Iterable<? extends AvmReferable> getCandidates() {
		return Iterables.concat(element.getParameters(),
				element.getDeclarations());
	}
}

class As3PropertyScope extends AvmPropertyScope<As3AccessExpression> {

	public As3PropertyScope(As3AccessExpression element, EReference ref,
			IScopeProvider scopeProvider) {
		super(element, ref, scopeProvider);
	}

	@Override
	protected AvmType getQualifierType() {
		return element.getExpression().resolveType();
	}

	@Override
	protected EObject getReference() {
		IIdentifier identifier = element.getOperator().getIdentifier();
		return identifier instanceof As3PropertyIdentifier ? identifier : null;
	}

	@Override
	protected AvmField createDynamicField(String name) {
		As3FieldBinding field = As3EFactory.eINSTANCE.createAs3FieldBinding();
		field.setName(name);
		return field;
	}

	@Override
	public IScope getOuterScope() {
		return IScope.NULLSCOPE;
	}
}

class As3WithScope extends AvmPropertyScope<As3WithStatement> {

	protected final EObject ctx;

	public As3WithScope(As3WithStatement element, EObject initial,
			EReference ref, IScopeProvider scopeProvider) {
		super(element, ref, scopeProvider);
		this.ctx = initial;
	}

	@Override
	protected AvmType getQualifierType() {
		As3ExpressionList target = element.getTarget();
		EList<IExpression> list = target.getExpressions();
		if (!list.isEmpty()) {
			IExpression expression = list.get(list.size() - 1);
			return expression.resolveType();
		}
		return AvmEFactory.eINSTANCE.createAvmNull();
	}

	@Override
	protected EObject getReference() {
		return ctx instanceof As3PropertyIdentifier ? ctx : null;
	}

	@Override
	protected AvmField createDynamicField(String name) {
		As3FieldBinding field = As3EFactory.eINSTANCE.createAs3FieldBinding();
		field.setName(name);
		return field;
	}
}