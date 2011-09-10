/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.scoping;

import java.lang.reflect.Method;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.axdt.as3.As3EFactory;
import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3AccessExpression;
import org.axdt.as3.model.As3AttributeQualifiedIdentifier;
import org.axdt.as3.model.As3CatchClause;
import org.axdt.as3.model.As3Class;
import org.axdt.as3.model.As3Executable;
import org.axdt.as3.model.As3ExpressionList;
import org.axdt.as3.model.As3FieldBinding;
import org.axdt.as3.model.As3Program;
import org.axdt.as3.model.As3PropertyIdentifier;
import org.axdt.as3.model.As3PropertyOperator;
import org.axdt.as3.model.As3QueryExpression;
import org.axdt.as3.model.As3QueryOperator;
import org.axdt.as3.model.As3WithStatement;
import org.axdt.as3.model.IExpression;
import org.axdt.as3.model.IIdentifier;
import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.model.AsdocClass;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmDeclaredTypeReference;
import org.axdt.avm.model.AvmField;
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.scoping.AvmElementScope;
import org.axdt.avm.scoping.AvmGenericScope;
import org.axdt.avm.scoping.AvmPropertyScope;
import org.axdt.avm.scoping.AvmTypeScope;
import org.axdt.avm.util.AvmTypeAccess;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractScopeProvider;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.Tuples;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * This class contains custom scoping description.
 * 
 * @author mb0 see :
 *         http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 *         on
 */
public class As3ScopeProvider extends AbstractScopeProvider {

	public final Logger logger = Logger.getLogger(getClass());

	@Inject
	@Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
	private IScopeProvider delegate;

	@Inject(optional = true)
	@Named(AbstractDeclarativeScopeProvider.NAMED_ERROR_HANDLER)
	private PolymorphicDispatcher.ErrorHandler<IScope> errorHandler = new PolymorphicDispatcher.NullErrorHandler<IScope>();

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
		return getScope(context, context, reference);
	}

	public IScope getScope(EObject context, EObject current,
			EReference reference) {
		IScope scope = polymorphicFindScopeForClassName(context, current,
				reference);
		if (scope == null)
			scope = delegateGetScope(current, reference);
		return scope;
	}

	private IScope polymorphicFindScopeForClassName(EObject context,
			EObject current, EReference reference) {
		IScope scope = null;
		PolymorphicDispatcher<IScope> dispatcher = new PolymorphicDispatcher<IScope>(
				Collections.singletonList(this), getPredicate(context,
						reference.getEReferenceType()), errorHandler);
		while (scope == null && current != null) {
			scope = dispatcher.invoke(current, context, reference);
			current = current.eContainer();
		}
		return scope;
	}

	Object getCacheKey(EObject ctx, EReference ref) {
		return Tuples.create(As3ScopeProvider.class, ctx, ref);
	}

	IScope scope_AvmType(AvmTypeReference ctx, EObject initial, EReference ref) {
		// TODO: what is with package local types
		return delegateGetScope(ctx, ref);
	}

	IScope scope_AvmReferable(As3Program ctx, EObject initial, EReference ref) {
		return new As3ProgramScope(delegateGetScope(ctx, ref), ctx, ref);
	}

	IScope scope_AvmReferable(As3Class ctx, EObject initial, EReference ref) {
		return new As3TypeScope(getScope(ctx, ctx.eContainer(), ref), ctx,
				initial, ref);
	}

	IScope scope_AvmReferable(As3Executable ctx, EObject initial, EReference ref) {
		return new As3ExecutableScope(getScope(ctx, ctx.eContainer(), ref),
				ctx, ref);
	}

	IScope scope_AvmReferable(final As3WithStatement ctx,
			final EObject initial, final EReference ref) {
		EObject current = initial;
		while (current != null) {
			if (ctx.equals(current.eContainer())) {
				if (current.eContainingFeature() == As3EPackage.eINSTANCE
						.getAs3WithStatement_Target())
					return null;
			}
			current = current.eContainer();
		}
		IScope parent = getScope(ctx, ctx.eContainer(), ref);
		return new As3WithScope(parent, ctx,
				initial, ref, parent);
	}

	IScope scope_AvmReferable(As3CatchClause ctx, EObject initial,
			EReference ref) {
		return new As3CatchScope(getScope(ctx, ctx.eContainer(), ref), ctx, ref);
	}

	IScope scope_AvmReferable(As3PropertyOperator ctx, EObject initial,
			EReference ref) {
		if (ctx.getExpressions() == null
				&& ctx.eContainingFeature() == As3EPackage.eINSTANCE
						.getAs3AccessExpression_Operator()) {
			As3AccessExpression access = (As3AccessExpression) ctx.eContainer();
			return new As3PropertyScope(IScope.NULLSCOPE, access, ref, delegateGetScope(ctx, ref));
		}
		return null;
	}

	IScope scope_AvmReferable(As3QueryOperator ctx, EObject initial,
			EReference ref) {
		if (ctx.eContainingFeature() == As3EPackage.eINSTANCE
				.getAs3QueryExpression_Operator()
				&& initial instanceof As3PropertyIdentifier) {
			As3QueryExpression access = (As3QueryExpression) ctx.eContainer();
			return new As3QueryScope(IScope.NULLSCOPE, access, ref, initial, delegateGetScope(ctx, ref));
		}
		return null;
	}
}

class As3TypeScope extends AvmTypeScope {

	public As3TypeScope(IScope parent, AvmDeclaredType element,
			EObject initial, EReference ref) {
		super(parent, element, initial, ref);
	}

	@Override
	protected AvmTypeReference getObjectReference() {
		return As3ObjectReferenceProvider.get();
	}
}
class As3ProgramScope extends AvmElementScope<As3Program> {

	public As3ProgramScope(IScope parent, As3Program element, EReference ref) {
		super(parent, element, ref, parent);
	}

	@Override
	protected Iterable<IEObjectDescription> getCandidates() {
		return Iterables.transform(
				Iterables.concat(element.getMembers(), element.getTypes()),
				GetDesciption);
	}

	@Override
	protected AvmTypeReference getObjectReference() {
		return As3ObjectReferenceProvider.get();
	}
}

class As3ExecutableScope extends AvmElementScope<As3Executable> {

	public As3ExecutableScope(IScope parent, As3Executable element,
			EReference ref) {
		super(parent, element, ref, parent);
	}

	@Override
	protected Iterable<IEObjectDescription> getCandidates() {
		return Iterables.transform(
				Iterables.concat(element.getParameters(),
						element.getDeclarations()), GetDesciption);
	}

	@Override
	protected AvmTypeReference getObjectReference() {
		return As3ObjectReferenceProvider.get();
	}
}

class As3QueryScope extends As3GenericScope<As3QueryExpression> {

	private final EObject ident;

	public As3QueryScope(IScope parent, As3QueryExpression element,
			EReference ref, EObject ident, IScope lookup) {
		super(parent, element, ref, lookup);
		this.ident = ident;
	}

	protected EObject getReference() {
		return ident;
	}

	@Override
	protected AvmTypeReference getObjectReference() {
		return As3ObjectReferenceProvider.get();
	}
}

abstract class As3GenericScope<T extends IExpression> extends
		AvmGenericScope<T> {

	public As3GenericScope(IScope parent, T element, EReference ref, IScope lookup) {
		super(parent, element, ref, lookup);
	}

	@Override
	protected Iterable<IEObjectDescription> getCandidates() {
		EObject identifier = getReference();
		if (identifier instanceof As3AttributeQualifiedIdentifier)
			identifier = ((As3AttributeQualifiedIdentifier) identifier)
					.getIdentifier();
		if (identifier instanceof As3PropertyIdentifier) {
			AvmReferable dynIdent = getDynamicIdentifiable(identifier);
			if (dynIdent != null)
				return Collections.singleton(GetDesciption.apply(dynIdent));
		}
		return Collections.emptySet();
	}

	protected abstract EObject getReference();

	protected AvmField createDynamicField(String name) {
		As3FieldBinding field = As3EFactory.eINSTANCE.createAs3FieldBinding();
		field.setName(name);
		field.setType(AvmEFactory.eINSTANCE.createAvmGenericReference());
		return field;
	}
}

class As3PropertyScope extends AvmPropertyScope<As3AccessExpression> {

	public As3PropertyScope(IScope parent, As3AccessExpression element,
			EReference ref, IScope lookup) {
		super(parent, element, ref, lookup);
	}

	@Override
	protected AvmTypeAccess getQualifierType() {
		return element.getExpression().resolveType();
	}

	@Override
	protected EObject getReference() {
		IIdentifier id = element.getOperator().getIdentifier();
		if (id instanceof As3AttributeQualifiedIdentifier) {
			return ((As3AttributeQualifiedIdentifier) id).getIdentifier();
		} else if (id instanceof As3PropertyIdentifier) {
			return id;
		}
		return null;
	}

	@Override
	protected AvmField createDynamicField(String name) {
		As3FieldBinding field = As3EFactory.eINSTANCE.createAs3FieldBinding();
		field.setName(name);
		field.setType(AvmEFactory.eINSTANCE.createAvmGenericReference());
		return field;
	}

	@Override
	protected AvmTypeReference getObjectReference() {
		return As3ObjectReferenceProvider.get();
	}
}

class As3WithScope extends AvmPropertyScope<As3WithStatement> {

	protected final EObject ctx;

	public As3WithScope(IScope parent, As3WithStatement element,
			EObject initial, EReference ref, IScope lookup) {
		super(parent, element, ref, lookup);
		this.ctx = initial;
	}

	@Override
	protected AvmTypeAccess getQualifierType() {
		As3ExpressionList target = element.getTarget();
		EList<IExpression> list = target.getExpressions();
		if (!list.isEmpty()) {
			IExpression expression = list.get(list.size() - 1);
			return expression.resolveType();
		}
		return AvmTypeAccess.NULL;
	}

	@Override
	protected EObject getReference() {
		if (ctx instanceof As3AttributeQualifiedIdentifier) {
			return ((As3AttributeQualifiedIdentifier) ctx).getIdentifier();
		} else if (ctx instanceof As3PropertyIdentifier) {
			return ctx;
		}
		return null;
	}

	@Override
	protected AvmField createDynamicField(String name) {
		As3FieldBinding field = As3EFactory.eINSTANCE.createAs3FieldBinding();
		field.setName(name);
		field.setType(AvmEFactory.eINSTANCE.createAvmGenericReference());
		return field;
	}

	@Override
	protected AvmTypeReference getObjectReference() {
		return As3ObjectReferenceProvider.get();
	}
}

class As3CatchScope extends AvmElementScope<As3CatchClause> {

	public As3CatchScope(IScope parent, As3CatchClause element, EReference ref) {
		super(parent, element, ref, parent);
	}

	@Override
	protected Iterable<IEObjectDescription> getCandidates() {
		return Collections.singleton(GetDesciption.apply(element.getError()));
	}

	@Override
	protected AvmTypeReference getObjectReference() {
		return As3ObjectReferenceProvider.get();
	}
}
class As3ObjectReferenceProvider {

	public static AvmTypeReference get() {
		AvmDeclaredTypeReference ref = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
		AsdocClass proxy = AsdocEFactory.eINSTANCE.createAsdocClass();
		((InternalEObject) proxy).eSetProxyURI(URI.createURI("avm:/types/Object"));
		ref.setType(proxy);
		return ref;
	}
	
}