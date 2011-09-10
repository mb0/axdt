package org.axdt.as3.scoping;

import java.util.Collections;

import org.axdt.as3.As3EFactory;
import org.axdt.as3.As3EPackage;
import org.axdt.as3.As3StandaloneSetup;
import org.axdt.as3.model.As3Class;
import org.axdt.as3.model.As3Package;
import org.axdt.as3.model.As3Program;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;

public class As3ScopeProviderTest extends AbstractXtextTests {
	final SimpleScope simpleScope = new SimpleScope(Collections.<IEObjectDescription>emptyList());
	EReference identRef = As3EPackage.eINSTANCE.getAs3SimpleIdentifier_Reference();
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(As3StandaloneSetup.class);
	}
	protected As3ScopeProvider getProvider(final IScope delegate) {
		As3ScopeProvider provider = new As3ScopeProvider();
		provider.setDelegate(new IScopeProvider() {
			public IScope getScope(EObject context, EReference reference) {
				return delegate; 
			}
		});
		return provider;
	}
	public void testTypeReference() throws Exception {
		// should always return delegate
		As3ScopeProvider provider = getProvider(simpleScope);
		assertEquals(simpleScope, provider.getScope(
				As3EFactory.eINSTANCE.createAs3Program(),
				As3EPackage.eINSTANCE.getAs3Class_ExtendedClass()
		));
		assertEquals(simpleScope, provider.getScope(
				As3EFactory.eINSTANCE.createAs3Class(),
				As3EPackage.eINSTANCE.getAs3Class_ExtendedClass()
		));
	}
	public void testReferableProgram() throws Exception {
		As3ScopeProvider provider = getProvider(simpleScope);
		IScope scope = provider.getScope(
				As3EFactory.eINSTANCE.createAs3Program(), identRef
		);
		assertEquals(As3ProgramScope.class, scope.getClass());
		assertEquals(simpleScope, ((AbstractScope) scope).getParent());
	}
	public void testReferablePackage() throws Exception {
		As3ScopeProvider provider = getProvider(simpleScope);
		IScope scope = provider.getScope(
				As3EFactory.eINSTANCE.createAs3Package(), identRef
		);
		assertEquals(simpleScope, scope);
	}
	public void testReferableProgramType() throws Exception {
		As3ScopeProvider provider = getProvider(simpleScope);
		As3Class as3Class = As3EFactory.eINSTANCE.createAs3Class();
		As3Program program = As3EFactory.eINSTANCE.createAs3Program();
		program.getDirectives().add(as3Class);
		IScope scope = provider.getScope(as3Class, identRef);
		assertEquals(As3TypeScope.class, scope.getClass());
		IScope parent = ((As3TypeScope) scope).getParent();
		assertEquals(As3ProgramScope.class, parent.getClass());
		assertEquals(simpleScope, ((AbstractScope) parent).getParent());
	}
	public void testReferablePackageType() throws Exception {
		As3ScopeProvider provider = getProvider(simpleScope);
		As3Class as3Class = As3EFactory.eINSTANCE.createAs3Class();
		As3Package as3Package = As3EFactory.eINSTANCE.createAs3Package();
		as3Package.getDirectives().add(as3Class);
		As3Program program = As3EFactory.eINSTANCE.createAs3Program();
		program.setPackage(as3Package);
		IScope scope = provider.getScope(as3Class, identRef);
		assertEquals(As3TypeScope.class, scope.getClass());
		IScope parent = ((As3TypeScope) scope).getParent();
		assertEquals(As3ProgramScope.class, parent.getClass());
		assertEquals(simpleScope, ((AbstractScope) parent).getParent());
	}
}
