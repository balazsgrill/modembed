/**
 */
package hu.modembed.assembler.instructionset.impl;

import hu.modembed.assembler.instructionset.Instruction;
import hu.modembed.assembler.instructionset.InstructionParameter;
import hu.modembed.assembler.instructionset.InstructionWord;
import hu.modembed.assembler.instructionset.InstructionsetPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.assembler.instructionset.impl.InstructionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.modembed.assembler.instructionset.impl.InstructionImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.modembed.assembler.instructionset.impl.InstructionImpl#getWords <em>Words</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<InstructionParameter> parameters;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWords() <em>Words</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWords()
	 * @generated
	 * @ordered
	 */
	protected EList<InstructionWord> words;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstructionsetPackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstructionParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<InstructionParameter>(InstructionParameter.class, this, InstructionsetPackage.INSTRUCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionsetPackage.INSTRUCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstructionWord> getWords() {
		if (words == null) {
			words = new EObjectContainmentEList<InstructionWord>(InstructionWord.class, this, InstructionsetPackage.INSTRUCTION__WORDS);
		}
		return words;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstructionsetPackage.INSTRUCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case InstructionsetPackage.INSTRUCTION__WORDS:
				return ((InternalEList<?>)getWords()).basicRemove(otherEnd, msgs);
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
			case InstructionsetPackage.INSTRUCTION__PARAMETERS:
				return getParameters();
			case InstructionsetPackage.INSTRUCTION__NAME:
				return getName();
			case InstructionsetPackage.INSTRUCTION__WORDS:
				return getWords();
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
			case InstructionsetPackage.INSTRUCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends InstructionParameter>)newValue);
				return;
			case InstructionsetPackage.INSTRUCTION__NAME:
				setName((String)newValue);
				return;
			case InstructionsetPackage.INSTRUCTION__WORDS:
				getWords().clear();
				getWords().addAll((Collection<? extends InstructionWord>)newValue);
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
			case InstructionsetPackage.INSTRUCTION__PARAMETERS:
				getParameters().clear();
				return;
			case InstructionsetPackage.INSTRUCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InstructionsetPackage.INSTRUCTION__WORDS:
				getWords().clear();
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
			case InstructionsetPackage.INSTRUCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case InstructionsetPackage.INSTRUCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InstructionsetPackage.INSTRUCTION__WORDS:
				return words != null && !words.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InstructionImpl
