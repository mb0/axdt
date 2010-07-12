/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.core.model;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axdt Project</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.axdt.core.AxdtEPackage#getAxdtProject()
 */
public interface AxdtProject extends AxdtElement, IProjectNature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<String> getRequiredProjectNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AxdtPackageRoot getDefaultPackageRoot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<IPath> getConfiguredSourcePaths();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void addToBuildSpec(String builderId) throws CoreException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void removeFromBuildSpec(String builderId) throws CoreException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<AxdtPackageRoot> getPackageRoots();
	
	IProject getResource();
	AxdtProjectHandle getHandle();
} // AxdtProject
