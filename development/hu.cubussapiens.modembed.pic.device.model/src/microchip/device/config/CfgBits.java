/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.config;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cfg Bits</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.config.CfgBits#getKey <em>Key</em>}</li>
 *   <li>{@link microchip.device.config.CfgBits#getAddr <em>Addr</em>}</li>
 *   <li>{@link microchip.device.config.CfgBits#getUnused <em>Unused</em>}</li>
 *   <li>{@link microchip.device.config.CfgBits#getIllegals <em>Illegals</em>}</li>
 *   <li>{@link microchip.device.config.CfgBits#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.config.ConfigPackage#getCfgBits()
 * @model
 * @generated
 */
public interface CfgBits extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #setKey(String)
	 * @see microchip.device.config.ConfigPackage#getCfgBits_Key()
	 * @model unsettable="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link microchip.device.config.CfgBits#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Unsets the value of the '{@link microchip.device.config.CfgBits#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKey()
	 * @see #getKey()
	 * @see #setKey(String)
	 * @generated
	 */
	void unsetKey();

	/**
	 * Returns whether the value of the '{@link microchip.device.config.CfgBits#getKey <em>Key</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key</em>' attribute is set.
	 * @see #unsetKey()
	 * @see #getKey()
	 * @see #setKey(String)
	 * @generated
	 */
	boolean isSetKey();

	/**
	 * Returns the value of the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' attribute.
	 * @see #isSetAddr()
	 * @see #unsetAddr()
	 * @see #setAddr(int)
	 * @see microchip.device.config.ConfigPackage#getCfgBits_Addr()
	 * @model unsettable="true"
	 * @generated
	 */
	int getAddr();

	/**
	 * Sets the value of the '{@link microchip.device.config.CfgBits#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #isSetAddr()
	 * @see #unsetAddr()
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.config.CfgBits#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddr()
	 * @see #getAddr()
	 * @see #setAddr(int)
	 * @generated
	 */
	void unsetAddr();

	/**
	 * Returns whether the value of the '{@link microchip.device.config.CfgBits#getAddr <em>Addr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Addr</em>' attribute is set.
	 * @see #unsetAddr()
	 * @see #getAddr()
	 * @see #setAddr(int)
	 * @generated
	 */
	boolean isSetAddr();

	/**
	 * Returns the value of the '<em><b>Unused</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unused</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unused</em>' attribute.
	 * @see #isSetUnused()
	 * @see #unsetUnused()
	 * @see #setUnused(int)
	 * @see microchip.device.config.ConfigPackage#getCfgBits_Unused()
	 * @model unsettable="true"
	 * @generated
	 */
	int getUnused();

	/**
	 * Sets the value of the '{@link microchip.device.config.CfgBits#getUnused <em>Unused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unused</em>' attribute.
	 * @see #isSetUnused()
	 * @see #unsetUnused()
	 * @see #getUnused()
	 * @generated
	 */
	void setUnused(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.config.CfgBits#getUnused <em>Unused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnused()
	 * @see #getUnused()
	 * @see #setUnused(int)
	 * @generated
	 */
	void unsetUnused();

	/**
	 * Returns whether the value of the '{@link microchip.device.config.CfgBits#getUnused <em>Unused</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unused</em>' attribute is set.
	 * @see #unsetUnused()
	 * @see #getUnused()
	 * @see #setUnused(int)
	 * @generated
	 */
	boolean isSetUnused();

	/**
	 * Returns the value of the '<em><b>Illegals</b></em>' containment reference list.
	 * The list contents are of type {@link microchip.device.config.Illegal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Illegals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illegals</em>' containment reference list.
	 * @see microchip.device.config.ConfigPackage#getCfgBits_Illegals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Illegal> getIllegals();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link microchip.device.config.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see microchip.device.config.ConfigPackage#getCfgBits_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // CfgBits
