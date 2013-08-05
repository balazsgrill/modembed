/**
 */
package hu.modembed.model.pic;

import hu.modembed.model.modembed.infrastructure.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Word</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.pic.ConfigWord#getAddress <em>Address</em>}</li>
 *   <li>{@link hu.modembed.model.pic.ConfigWord#getSize <em>Size</em>}</li>
 *   <li>{@link hu.modembed.model.pic.ConfigWord#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link hu.modembed.model.pic.ConfigWord#getFields <em>Fields</em>}</li>
 *   <li>{@link hu.modembed.model.pic.ConfigWord#getImplMask <em>Impl Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.pic.PicPackage#getConfigWord()
 * @model
 * @generated
 */
public interface ConfigWord extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(long)
	 * @see hu.modembed.model.pic.PicPackage#getConfigWord_Address()
	 * @model
	 * @generated
	 */
	long getAddress();

	/**
	 * Sets the value of the '{@link hu.modembed.model.pic.ConfigWord#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(long value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see hu.modembed.model.pic.PicPackage#getConfigWord_Size()
	 * @model
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link hu.modembed.model.pic.ConfigWord#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(long)
	 * @see hu.modembed.model.pic.PicPackage#getConfigWord_DefaultValue()
	 * @model
	 * @generated
	 */
	long getDefaultValue();

	/**
	 * Sets the value of the '{@link hu.modembed.model.pic.ConfigWord#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(long value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.pic.ConfigField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see hu.modembed.model.pic.PicPackage#getConfigWord_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigField> getFields();

	/**
	 * Returns the value of the '<em><b>Impl Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl Mask</em>' attribute.
	 * @see #setImplMask(long)
	 * @see hu.modembed.model.pic.PicPackage#getConfigWord_ImplMask()
	 * @model
	 * @generated
	 */
	long getImplMask();

	/**
	 * Sets the value of the '{@link hu.modembed.model.pic.ConfigWord#getImplMask <em>Impl Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl Mask</em>' attribute.
	 * @see #getImplMask()
	 * @generated
	 */
	void setImplMask(long value);

} // ConfigWord
