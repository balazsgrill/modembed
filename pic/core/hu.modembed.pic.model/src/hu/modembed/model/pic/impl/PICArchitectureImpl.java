/**
 */
package hu.modembed.model.pic.impl;

import hu.modembed.model.architecture.impl.ArchitectureImpl;

import hu.modembed.model.pic.ConfigWord;
import hu.modembed.model.pic.PICArchitecture;
import hu.modembed.model.pic.PicPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PIC Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.pic.impl.PICArchitectureImpl#getConfigWords <em>Config Words</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PICArchitectureImpl extends ArchitectureImpl implements PICArchitecture {
	/**
	 * The cached value of the '{@link #getConfigWords() <em>Config Words</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigWords()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigWord> configWords;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PICArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PicPackage.Literals.PIC_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigWord> getConfigWords() {
		if (configWords == null) {
			configWords = new EObjectContainmentEList<ConfigWord>(ConfigWord.class, this, PicPackage.PIC_ARCHITECTURE__CONFIG_WORDS);
		}
		return configWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PicPackage.PIC_ARCHITECTURE__CONFIG_WORDS:
				return ((InternalEList<?>)getConfigWords()).basicRemove(otherEnd, msgs);
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
			case PicPackage.PIC_ARCHITECTURE__CONFIG_WORDS:
				return getConfigWords();
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
			case PicPackage.PIC_ARCHITECTURE__CONFIG_WORDS:
				getConfigWords().clear();
				getConfigWords().addAll((Collection<? extends ConfigWord>)newValue);
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
			case PicPackage.PIC_ARCHITECTURE__CONFIG_WORDS:
				getConfigWords().clear();
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
			case PicPackage.PIC_ARCHITECTURE__CONFIG_WORDS:
				return configWords != null && !configWords.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PICArchitectureImpl
