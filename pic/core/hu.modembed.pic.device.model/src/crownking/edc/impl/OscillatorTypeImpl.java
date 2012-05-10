/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.EdcPackage;
import crownking.edc.OscillatorModeType;
import crownking.edc.OscillatorType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oscillator Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.OscillatorTypeImpl#getOscillatorMode <em>Oscillator Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OscillatorTypeImpl extends EObjectImpl implements OscillatorType {
	/**
	 * The cached value of the '{@link #getOscillatorMode() <em>Oscillator Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscillatorMode()
	 * @generated
	 * @ordered
	 */
	protected EList<OscillatorModeType> oscillatorMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OscillatorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getOscillatorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OscillatorModeType> getOscillatorMode() {
		if (oscillatorMode == null) {
			oscillatorMode = new EObjectContainmentEList<OscillatorModeType>(OscillatorModeType.class, this, EdcPackage.OSCILLATOR_TYPE__OSCILLATOR_MODE);
		}
		return oscillatorMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.OSCILLATOR_TYPE__OSCILLATOR_MODE:
				return ((InternalEList<?>)getOscillatorMode()).basicRemove(otherEnd, msgs);
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
			case EdcPackage.OSCILLATOR_TYPE__OSCILLATOR_MODE:
				return getOscillatorMode();
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
			case EdcPackage.OSCILLATOR_TYPE__OSCILLATOR_MODE:
				getOscillatorMode().clear();
				getOscillatorMode().addAll((Collection<? extends OscillatorModeType>)newValue);
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
			case EdcPackage.OSCILLATOR_TYPE__OSCILLATOR_MODE:
				getOscillatorMode().clear();
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
			case EdcPackage.OSCILLATOR_TYPE__OSCILLATOR_MODE:
				return oscillatorMode != null && !oscillatorMode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OscillatorTypeImpl
