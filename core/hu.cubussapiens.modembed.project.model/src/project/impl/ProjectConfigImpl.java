/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package project.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import project.Directory;
import project.MainModule;
import project.ProjectConfig;
import project.ProjectPackage;
import project.SettingsExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link project.impl.ProjectConfigImpl#getSourcedirs <em>Sourcedirs</em>}</li>
 *   <li>{@link project.impl.ProjectConfigImpl#getBuilds <em>Builds</em>}</li>
 *   <li>{@link project.impl.ProjectConfigImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectConfigImpl extends EObjectImpl implements ProjectConfig {
	/**
	 * The cached value of the '{@link #getSourcedirs() <em>Sourcedirs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcedirs()
	 * @generated
	 * @ordered
	 */
	protected EList<Directory> sourcedirs;

	/**
	 * The cached value of the '{@link #getBuilds() <em>Builds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilds()
	 * @generated
	 * @ordered
	 */
	protected EList<MainModule> builds;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<SettingsExtension> extensions;

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
	public EList<Directory> getSourcedirs() {
		if (sourcedirs == null) {
			sourcedirs = new EObjectContainmentEList<Directory>(Directory.class, this, ProjectPackage.PROJECT_CONFIG__SOURCEDIRS);
		}
		return sourcedirs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MainModule> getBuilds() {
		if (builds == null) {
			builds = new EObjectContainmentEList<MainModule>(MainModule.class, this, ProjectPackage.PROJECT_CONFIG__BUILDS);
		}
		return builds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SettingsExtension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentEList<SettingsExtension>(SettingsExtension.class, this, ProjectPackage.PROJECT_CONFIG__EXTENSIONS);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectPackage.PROJECT_CONFIG__SOURCEDIRS:
				return ((InternalEList<?>)getSourcedirs()).basicRemove(otherEnd, msgs);
			case ProjectPackage.PROJECT_CONFIG__BUILDS:
				return ((InternalEList<?>)getBuilds()).basicRemove(otherEnd, msgs);
			case ProjectPackage.PROJECT_CONFIG__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ProjectPackage.PROJECT_CONFIG__BUILDS:
				return getBuilds();
			case ProjectPackage.PROJECT_CONFIG__EXTENSIONS:
				return getExtensions();
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
				getSourcedirs().addAll((Collection<? extends Directory>)newValue);
				return;
			case ProjectPackage.PROJECT_CONFIG__BUILDS:
				getBuilds().clear();
				getBuilds().addAll((Collection<? extends MainModule>)newValue);
				return;
			case ProjectPackage.PROJECT_CONFIG__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends SettingsExtension>)newValue);
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
			case ProjectPackage.PROJECT_CONFIG__BUILDS:
				getBuilds().clear();
				return;
			case ProjectPackage.PROJECT_CONFIG__EXTENSIONS:
				getExtensions().clear();
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
			case ProjectPackage.PROJECT_CONFIG__BUILDS:
				return builds != null && !builds.isEmpty();
			case ProjectPackage.PROJECT_CONFIG__EXTENSIONS:
				return extensions != null && !extensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectConfigImpl
