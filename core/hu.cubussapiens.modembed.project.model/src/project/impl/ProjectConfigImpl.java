/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package project.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import project.ProjectConfig;
import project.ProjectPackage;
import project.SourceDir;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link project.impl.ProjectConfigImpl#getSourcedirs <em>Sourcedirs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectConfigImpl extends EObjectImpl implements ProjectConfig {
	/**
	 * The cached value of the '{@link #getSourcedirs() <em>Sourcedirs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcedirs()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceDir> sourcedirs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectPackage.Literals.PROJECT_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceDir> getSourcedirs() {
		if (sourcedirs == null) {
			sourcedirs = new EObjectResolvingEList<SourceDir>(SourceDir.class, this, ProjectPackage.PROJECT_CONFIG__SOURCEDIRS);
		}
		return sourcedirs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjectPackage.PROJECT_CONFIG__SOURCEDIRS:
				return getSourcedirs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProjectPackage.PROJECT_CONFIG__SOURCEDIRS:
				getSourcedirs().clear();
				getSourcedirs().addAll((Collection<? extends SourceDir>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProjectPackage.PROJECT_CONFIG__SOURCEDIRS:
				getSourcedirs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProjectPackage.PROJECT_CONFIG__SOURCEDIRS:
				return sourcedirs != null && !sourcedirs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectConfigImpl
