/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package project.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link project.impl.ProjectConfigImpl#getBuild <em>Build</em>}</li>
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
	 * The cached value of the '{@link #getBuild() <em>Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild()
	 * @generated
	 * @ordered
	 */
	protected MainModule build;

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
	public MainModule getBuild() {
		return build;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuild(MainModule newBuild, NotificationChain msgs) {
		MainModule oldBuild = build;
		build = newBuild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT_CONFIG__BUILD, oldBuild, newBuild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuild(MainModule newBuild) {
		if (newBuild != build) {
			NotificationChain msgs = null;
			if (build != null)
				msgs = ((InternalEObject)build).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.PROJECT_CONFIG__BUILD, null, msgs);
			if (newBuild != null)
				msgs = ((InternalEObject)newBuild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.PROJECT_CONFIG__BUILD, null, msgs);
			msgs = basicSetBuild(newBuild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT_CONFIG__BUILD, newBuild, newBuild));
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
			case ProjectPackage.PROJECT_CONFIG__BUILD:
				return basicSetBuild(null, msgs);
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
			case ProjectPackage.PROJECT_CONFIG__BUILD:
				return getBuild();
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
			case ProjectPackage.PROJECT_CONFIG__BUILD:
				setBuild((MainModule)newValue);
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
			case ProjectPackage.PROJECT_CONFIG__BUILD:
				setBuild((MainModule)null);
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
			case ProjectPackage.PROJECT_CONFIG__BUILD:
				return build != null;
			case ProjectPackage.PROJECT_CONFIG__EXTENSIONS:
				return extensions != null && !extensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectConfigImpl
