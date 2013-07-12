/**
 */
package hu.modembed.model.modembed.abstraction.behavior.platform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getBitOffset <em>Bit Offset</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getValueOffset <em>Value Offset</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#isEquals <em>Equals</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#isGreater <em>Greater</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#isLower <em>Lower</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getCheckValue <em>Check Value</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getMask <em>Mask</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getConditionalOperation()
 * @model
 * @generated
 */
public interface ConditionalOperation extends OperationStep {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(OperationArgument)
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getConditionalOperation_Value()
	 * @model required="true"
	 * @generated
	 */
	OperationArgument getValue();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OperationArgument value);

	/**
	 * Returns the value of the '<em><b>Bit Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Offset</em>' attribute.
	 * @see #setBitOffset(int)
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getConditionalOperation_BitOffset()
	 * @model
	 * @generated
	 */
	int getBitOffset();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getBitOffset <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Offset</em>' attribute.
	 * @see #getBitOffset()
	 * @generated
	 */
	void setBitOffset(int value);

	/**
	 * Returns the value of the '<em><b>Value Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Offset</em>' attribute.
	 * @see #setValueOffset(int)
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getConditionalOperation_ValueOffset()
	 * @model
	 * @generated
	 */
	int getValueOffset();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getValueOffset <em>Value Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Offset</em>' attribute.
	 * @see #getValueOffset()
	 * @generated
	 */
	void setValueOffset(int value);

	/**
	 * Returns the value of the '<em><b>Equals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equals</em>' attribute.
	 * @see #setEquals(boolean)
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getConditionalOperation_Equals()
	 * @model
	 * @generated
	 */
	boolean isEquals();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#isEquals <em>Equals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equals</em>' attribute.
	 * @see #isEquals()
	 * @generated
	 */
	void setEquals(boolean value);

	/**
	 * Returns the value of the '<em><b>Greater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Greater</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greater</em>' attribute.
	 * @see #setGreater(boolean)
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getConditionalOperation_Greater()
	 * @model
	 * @generated
	 */
	boolean isGreater();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#isGreater <em>Greater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Greater</em>' attribute.
	 * @see #isGreater()
	 * @generated
	 */
	void setGreater(boolean value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(boolean)
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getConditionalOperation_Lower()
	 * @model
	 * @generated
	 */
	boolean isLower();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#isLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #isLower()
	 * @generated
	 */
	void setLower(boolean value);

	/**
	 * Returns the value of the '<em><b>Check Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Value</em>' attribute.
	 * @see #setCheckValue(int)
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getConditionalOperation_CheckValue()
	 * @model
	 * @generated
	 */
	int getCheckValue();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getCheckValue <em>Check Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Value</em>' attribute.
	 * @see #getCheckValue()
	 * @generated
	 */
	void setCheckValue(int value);

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #setMask(int)
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getConditionalOperation_Mask()
	 * @model
	 * @generated
	 */
	int getMask();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(int value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getConditionalOperation_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationStep> getSteps();

} // ConditionalOperation
