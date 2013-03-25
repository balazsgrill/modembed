/**
 */
package hu.modembed.model.core.assembler.impl;

import hu.modembed.model.core.assembler.AssemblerPackage;
import hu.modembed.model.core.assembler.InstructionSection;
import hu.modembed.model.core.assembler.InstructionWord;

import hu.modembed.model.core.assembler.InstructionWordCondition;
import hu.modembed.model.core.impl.MODembedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction Word</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.core.assembler.impl.InstructionWordImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link hu.modembed.model.core.assembler.impl.InstructionWordImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionWordImpl extends MODembedElementImpl implements InstructionWord {
	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<InstructionSection> sections;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<InstructionWordCondition> condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionWordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblerPackage.Literals.INSTRUCTION_WORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstructionSection> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<InstructionSection>(InstructionSection.class, this, AssemblerPackage.INSTRUCTION_WORD__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstructionWordCondition> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<InstructionWordCondition>(InstructionWordCondition.class, this, AssemblerPackage.INSTRUCTION_WORD__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblerPackage.INSTRUCTION_WORD__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
			case AssemblerPackage.INSTRUCTION_WORD__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
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
			case AssemblerPackage.INSTRUCTION_WORD__SECTIONS:
				return getSections();
			case AssemblerPackage.INSTRUCTION_WORD__CONDITION:
				return getCondition();
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
			case AssemblerPackage.INSTRUCTION_WORD__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends InstructionSection>)newValue);
				return;
			case AssemblerPackage.INSTRUCTION_WORD__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends InstructionWordCondition>)newValue);
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
			case AssemblerPackage.INSTRUCTION_WORD__SECTIONS:
				getSections().clear();
				return;
			case AssemblerPackage.INSTRUCTION_WORD__CONDITION:
				getCondition().clear();
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
			case AssemblerPackage.INSTRUCTION_WORD__SECTIONS:
				return sections != null && !sections.isEmpty();
			case AssemblerPackage.INSTRUCTION_WORD__CONDITION:
				return condition != null && !condition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstructionWordImpl
