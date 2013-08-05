/**
 */
package hu.modembed.model.pic.impl;

import hu.modembed.model.modembed.infrastructure.impl.RootElementImpl;

import hu.modembed.model.pic.ConfigurationSelection;
import hu.modembed.model.pic.PICConfigurationModel;
import hu.modembed.model.pic.PICConfigurationValueModel;
import hu.modembed.model.pic.PicPackage;

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
 * An implementation of the model object '<em><b>PIC Configuration Value Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.pic.impl.PICConfigurationValueModelImpl#getValues <em>Values</em>}</li>
 *   <li>{@link hu.modembed.model.pic.impl.PICConfigurationValueModelImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PICConfigurationValueModelImpl extends RootElementImpl implements PICConfigurationValueModel {
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
	protected PICConfigurationModel definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PICConfigurationValueModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PicPackage.Literals.PIC_CONFIGURATION_VALUE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationSelection> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<ConfigurationSelection>(ConfigurationSelection.class, this, PicPackage.PIC_CONFIGURATION_VALUE_MODEL__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PICConfigurationModel getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (PICConfigurationModel)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicPackage.PIC_CONFIGURATION_VALUE_MODEL__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PICConfigurationModel basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(PICConfigurationModel newDefinition) {
		PICConfigurationModel oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicPackage.PIC_CONFIGURATION_VALUE_MODEL__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PicPackage.PIC_CONFIGURATION_VALUE_MODEL__VALUES:
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
			case PicPackage.PIC_CONFIGURATION_VALUE_MODEL__VALUES:
				return getValues();
			case PicPackage.PIC_CONFIGURATION_VALUE_MODEL__DEFINITION:
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
			case PicPackage.PIC_CONFIGURATION_VALUE_MODEL__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends ConfigurationSelection>)newValue);
				return;
			case PicPackage.PIC_CONFIGURATION_VALUE_MODEL__DEFINITION:
				setDefinition((PICConfigurationModel)newValue);
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
			case PicPackage.PIC_CONFIGURATION_VALUE_MODEL__VALUES:
				getValues().clear();
				return;
			case PicPackage.PIC_CONFIGURATION_VALUE_MODEL__DEFINITION:
				setDefinition((PICConfigurationModel)null);
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
			case PicPackage.PIC_CONFIGURATION_VALUE_MODEL__VALUES:
				return values != null && !values.isEmpty();
			case PicPackage.PIC_CONFIGURATION_VALUE_MODEL__DEFINITION:
				return definition != null;
		}
		return super.eIsSet(featureID);
	}

} //PICConfigurationValueModelImpl
