/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arch Def Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.ArchDefType#getMemTraits <em>Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.ArchDefType#getDesc <em>Desc</em>}</li>
 *   <li>{@link crownking.edc.ArchDefType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getArchDefType()
 * @model extendedMetaData="name='ArchDefType' kind='elementOnly'"
 * @generated
 */
public interface ArchDefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Traits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Traits</em>' containment reference.
	 * @see #setMemTraits(MemTraitsType)
	 * @see crownking.edc.EdcPackage#getArchDefType_MemTraits()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MemTraits' namespace='##targetNamespace'"
	 * @generated
	 */
	MemTraitsType getMemTraits();

	/**
	 * Sets the value of the '{@link crownking.edc.ArchDefType#getMemTraits <em>Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Traits</em>' containment reference.
	 * @see #getMemTraits()
	 * @generated
	 */
	void setMemTraits(MemTraitsType value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see crownking.edc.EdcPackage#getArchDefType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='desc'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link crownking.edc.ArchDefType#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see crownking.edc.EdcPackage#getArchDefType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crownking.edc.ArchDefType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ArchDefType
