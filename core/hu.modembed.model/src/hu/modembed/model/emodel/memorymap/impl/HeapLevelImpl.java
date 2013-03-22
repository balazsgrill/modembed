/**
 */
package hu.modembed.model.emodel.memorymap.impl;

import hu.modembed.model.core.impl.MODembedElementImpl;

import hu.modembed.model.emodel.memorymap.HeapLevel;
import hu.modembed.model.emodel.memorymap.HeapVariableMapping;
import hu.modembed.model.emodel.memorymap.MemorymapPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heap Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.memorymap.impl.HeapLevelImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link hu.modembed.model.emodel.memorymap.impl.HeapLevelImpl#getSubLevels <em>Sub Levels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeapLevelImpl extends MODembedElementImpl implements HeapLevel {
	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<HeapVariableMapping> mappings;

	/**
	 * The cached value of the '{@link #getSubLevels() <em>Sub Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<HeapLevel> subLevels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeapLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemorymapPackage.Literals.HEAP_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HeapVariableMapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<HeapVariableMapping>(HeapVariableMapping.class, this, MemorymapPackage.HEAP_LEVEL__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HeapLevel> getSubLevels() {
		if (subLevels == null) {
			subLevels = new EObjectContainmentEList<HeapLevel>(HeapLevel.class, this, MemorymapPackage.HEAP_LEVEL__SUB_LEVELS);
		}
		return subLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MemorymapPackage.HEAP_LEVEL__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
			case MemorymapPackage.HEAP_LEVEL__SUB_LEVELS:
				return ((InternalEList<?>)getSubLevels()).basicRemove(otherEnd, msgs);
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
			case MemorymapPackage.HEAP_LEVEL__MAPPINGS:
				return getMappings();
			case MemorymapPackage.HEAP_LEVEL__SUB_LEVELS:
				return getSubLevels();
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
			case MemorymapPackage.HEAP_LEVEL__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends HeapVariableMapping>)newValue);
				return;
			case MemorymapPackage.HEAP_LEVEL__SUB_LEVELS:
				getSubLevels().clear();
				getSubLevels().addAll((Collection<? extends HeapLevel>)newValue);
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
			case MemorymapPackage.HEAP_LEVEL__MAPPINGS:
				getMappings().clear();
				return;
			case MemorymapPackage.HEAP_LEVEL__SUB_LEVELS:
				getSubLevels().clear();
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
			case MemorymapPackage.HEAP_LEVEL__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case MemorymapPackage.HEAP_LEVEL__SUB_LEVELS:
				return subLevels != null && !subLevels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HeapLevelImpl
