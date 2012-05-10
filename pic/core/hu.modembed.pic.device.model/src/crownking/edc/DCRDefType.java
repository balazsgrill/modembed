/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DCR Def Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.DCRDefType#getAliasList <em>Alias List</em>}</li>
 *   <li>{@link crownking.edc.DCRDefType#getIllegal <em>Illegal</em>}</li>
 *   <li>{@link crownking.edc.DCRDefType#getDCRModeList <em>DCR Mode List</em>}</li>
 *   <li>{@link crownking.edc.DCRDefType#getAccess <em>Access</em>}</li>
 *   <li>{@link crownking.edc.DCRDefType#getCname <em>Cname</em>}</li>
 *   <li>{@link crownking.edc.DCRDefType#getDefault <em>Default</em>}</li>
 *   <li>{@link crownking.edc.DCRDefType#getDesc <em>Desc</em>}</li>
 *   <li>{@link crownking.edc.DCRDefType#getImpl <em>Impl</em>}</li>
 *   <li>{@link crownking.edc.DCRDefType#getName <em>Name</em>}</li>
 *   <li>{@link crownking.edc.DCRDefType#getNzwidth <em>Nzwidth</em>}</li>
 *   <li>{@link crownking.edc.DCRDefType#getUnimplval <em>Unimplval</em>}</li>
 *   <li>{@link crownking.edc.DCRDefType#getUnused <em>Unused</em>}</li>
 *   <li>{@link crownking.edc.DCRDefType#getUseinchecksum <em>Useinchecksum</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getDCRDefType()
 * @model extendedMetaData="name='DCRDefType' kind='elementOnly'"
 * @generated
 */
public interface DCRDefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Alias List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias List</em>' attribute.
	 * @see #setAliasList(String)
	 * @see crownking.edc.EdcPackage#getDCRDefType_AliasList()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AliasList' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAliasList();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRDefType#getAliasList <em>Alias List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias List</em>' attribute.
	 * @see #getAliasList()
	 * @generated
	 */
	void setAliasList(String value);

	/**
	 * Returns the value of the '<em><b>Illegal</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.IllegalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Illegal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illegal</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getDCRDefType_Illegal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Illegal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IllegalType> getIllegal();

	/**
	 * Returns the value of the '<em><b>DCR Mode List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DCR Mode List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DCR Mode List</em>' containment reference.
	 * @see #setDCRModeList(DCRModeListType)
	 * @see crownking.edc.EdcPackage#getDCRDefType_DCRModeList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DCRModeList' namespace='##targetNamespace'"
	 * @generated
	 */
	DCRModeListType getDCRModeList();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRDefType#getDCRModeList <em>DCR Mode List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DCR Mode List</em>' containment reference.
	 * @see #getDCRModeList()
	 * @generated
	 */
	void setDCRModeList(DCRModeListType value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(String)
	 * @see crownking.edc.EdcPackage#getDCRDefType_Access()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='access'"
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRDefType#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(String value);

	/**
	 * Returns the value of the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cname</em>' attribute.
	 * @see #setCname(String)
	 * @see crownking.edc.EdcPackage#getDCRDefType_Cname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cname'"
	 * @generated
	 */
	String getCname();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRDefType#getCname <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cname</em>' attribute.
	 * @see #getCname()
	 * @generated
	 */
	void setCname(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see crownking.edc.EdcPackage#getDCRDefType_Default()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='default'"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRDefType#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

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
	 * @see crownking.edc.EdcPackage#getDCRDefType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='desc'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRDefType#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl</em>' attribute.
	 * @see #setImpl(String)
	 * @see crownking.edc.EdcPackage#getDCRDefType_Impl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='impl'"
	 * @generated
	 */
	String getImpl();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRDefType#getImpl <em>Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl</em>' attribute.
	 * @see #getImpl()
	 * @generated
	 */
	void setImpl(String value);

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
	 * @see crownking.edc.EdcPackage#getDCRDefType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRDefType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nzwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nzwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nzwidth</em>' attribute.
	 * @see #setNzwidth(String)
	 * @see crownking.edc.EdcPackage#getDCRDefType_Nzwidth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nzwidth'"
	 * @generated
	 */
	String getNzwidth();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRDefType#getNzwidth <em>Nzwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nzwidth</em>' attribute.
	 * @see #getNzwidth()
	 * @generated
	 */
	void setNzwidth(String value);

	/**
	 * Returns the value of the '<em><b>Unimplval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unimplval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unimplval</em>' attribute.
	 * @see #isSetUnimplval()
	 * @see #unsetUnimplval()
	 * @see #setUnimplval(byte)
	 * @see crownking.edc.EdcPackage#getDCRDefType_Unimplval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='unimplval'"
	 * @generated
	 */
	byte getUnimplval();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRDefType#getUnimplval <em>Unimplval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unimplval</em>' attribute.
	 * @see #isSetUnimplval()
	 * @see #unsetUnimplval()
	 * @see #getUnimplval()
	 * @generated
	 */
	void setUnimplval(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.DCRDefType#getUnimplval <em>Unimplval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnimplval()
	 * @see #getUnimplval()
	 * @see #setUnimplval(byte)
	 * @generated
	 */
	void unsetUnimplval();

	/**
	 * Returns whether the value of the '{@link crownking.edc.DCRDefType#getUnimplval <em>Unimplval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unimplval</em>' attribute is set.
	 * @see #unsetUnimplval()
	 * @see #getUnimplval()
	 * @see #setUnimplval(byte)
	 * @generated
	 */
	boolean isSetUnimplval();

	/**
	 * Returns the value of the '<em><b>Unused</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unused</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unused</em>' attribute.
	 * @see #setUnused(String)
	 * @see crownking.edc.EdcPackage#getDCRDefType_Unused()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unused'"
	 * @generated
	 */
	String getUnused();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRDefType#getUnused <em>Unused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unused</em>' attribute.
	 * @see #getUnused()
	 * @generated
	 */
	void setUnused(String value);

	/**
	 * Returns the value of the '<em><b>Useinchecksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Useinchecksum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Useinchecksum</em>' attribute.
	 * @see #setUseinchecksum(String)
	 * @see crownking.edc.EdcPackage#getDCRDefType_Useinchecksum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useinchecksum'"
	 * @generated
	 */
	String getUseinchecksum();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRDefType#getUseinchecksum <em>Useinchecksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Useinchecksum</em>' attribute.
	 * @see #getUseinchecksum()
	 * @generated
	 */
	void setUseinchecksum(String value);

} // DCRDefType
