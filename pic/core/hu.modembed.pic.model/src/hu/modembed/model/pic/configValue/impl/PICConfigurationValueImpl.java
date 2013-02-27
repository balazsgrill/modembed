/**
 */
package hu.modembed.model.pic.configValue.impl;

import hu.modembed.model.core.impl.RootElementImpl;

import hu.modembed.model.pic.PICArchitecture;

import hu.modembed.model.pic.configValue.ConfigValuePackage;
import hu.modembed.model.pic.configValue.ConfigurationSelection;
import hu.modembed.model.pic.configValue.PICConfigurationValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PIC Configuration Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.pic.configValue.impl.PICConfigurationValueImpl#getValues <em>Values</em>}</li>
 *   <li>{@link hu.modembed.model.pic.configValue.impl.PICConfigurationValueImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PICConfigurationValueImpl extends RootElementImpl implements PICConfigurationValue {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationSelection> values;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected PICArchitecture definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PICConfigurationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigValuePackage.Literals.PIC_CONFIGURATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationSelection> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<ConfigurationSelection>(ConfigurationSelection.class, this, ConfigValuePackage.PIC_CONFIGURATION_VALUE__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PICArchitecture getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (PICArchitecture)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigValuePackage.PIC_CONFIGURATION_VALUE__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PICArchitecture basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(PICArchitecture newDefinition) {
		PICArchitecture oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigValuePackage.PIC_CONFIGURATION_VALUE__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigValuePackage.PIC_CONFIGURATION_VALUE__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case ConfigValuePackage.PIC_CONFIGURATION_VALUE__VALUES:
				return getValues();
			case ConfigValuePackage.PIC_CONFIGURATION_VALUE__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
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
			case ConfigValuePackage.PIC_CONFIGURATION_VALUE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends ConfigurationSelection>)newValue);
				return;
			case ConfigValuePackage.PIC_CONFIGURATION_VALUE__DEFINITION:
				setDefinition((PICArchitecture)newValue);
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
			case ConfigValuePackage.PIC_CONFIGURATION_VALUE__VALUES:
				getValues().clear();
				return;
			case ConfigValuePackage.PIC_CONFIGURATION_VALUE__DEFINITION:
				setDefinition((PICArchitecture)null);
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
			case ConfigValuePackage.PIC_CONFIGURATION_VALUE__VALUES:
				return values != null && !values.isEmpty();
			case ConfigValuePackage.PIC_CONFIGURATION_VALUE__DEFINITION:
				return definition != null;
		}
		return super.eIsSet(featureID);
	}

} //PICConfigurationValueImpl
