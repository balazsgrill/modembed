/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DCR Field Semantic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.DCRFieldSemanticType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.DCRFieldSemanticType#getAliasList <em>Alias List</em>}</li>
 *   <li>{@link crownking.edc.DCRFieldSemanticType#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link crownking.edc.DCRFieldSemanticType#getBeginaddr <em>Beginaddr</em>}</li>
 *   <li>{@link crownking.edc.DCRFieldSemanticType#getChecksumalgo <em>Checksumalgo</em>}</li>
 *   <li>{@link crownking.edc.DCRFieldSemanticType#getCname <em>Cname</em>}</li>
 *   <li>{@link crownking.edc.DCRFieldSemanticType#getDesc <em>Desc</em>}</li>
 *   <li>{@link crownking.edc.DCRFieldSemanticType#getEndaddr <em>Endaddr</em>}</li>
 *   <li>{@link crownking.edc.DCRFieldSemanticType#getIshidden <em>Ishidden</em>}</li>
 *   <li>{@link crownking.edc.DCRFieldSemanticType#getIslanghidden <em>Islanghidden</em>}</li>
 *   <li>{@link crownking.edc.DCRFieldSemanticType#getOscmodeidref <em>Oscmodeidref</em>}</li>
 *   <li>{@link crownking.edc.DCRFieldSemanticType#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getDCRFieldSemanticType()
 * @model extendedMetaData="name='DCRFieldSemanticType' kind='mixed'"
 * @generated
 */
public interface DCRFieldSemanticType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see crownking.edc.EdcPackage#getDCRFieldSemanticType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Alias List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias List</em>' containment reference.
	 * @see #setAliasList(AliasListType8)
	 * @see crownking.edc.EdcPackage#getDCRFieldSemanticType_AliasList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AliasList' namespace='##targetNamespace'"
	 * @generated
	 */
	AliasListType8 getAliasList();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRFieldSemanticType#getAliasList <em>Alias List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias List</em>' containment reference.
	 * @see #getAliasList()
	 * @generated
	 */
	void setAliasList(AliasListType8 value);

	/**
	 * Returns the value of the '<em><b>Checksum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checksum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checksum</em>' containment reference.
	 * @see #setChecksum(ChecksumType)
	 * @see crownking.edc.EdcPackage#getDCRFieldSemanticType_Checksum()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Checksum' namespace='##targetNamespace'"
	 * @generated
	 */
	ChecksumType getChecksum();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRFieldSemanticType#getChecksum <em>Checksum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checksum</em>' containment reference.
	 * @see #getChecksum()
	 * @generated
	 */
	void setChecksum(ChecksumType value);

	/**
	 * Returns the value of the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beginaddr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beginaddr</em>' attribute.
	 * @see #setBeginaddr(String)
	 * @see crownking.edc.EdcPackage#getDCRFieldSemanticType_Beginaddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='beginaddr'"
	 * @generated
	 */
	String getBeginaddr();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRFieldSemanticType#getBeginaddr <em>Beginaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginaddr</em>' attribute.
	 * @see #getBeginaddr()
	 * @generated
	 */
	void setBeginaddr(String value);

	/**
	 * Returns the value of the '<em><b>Checksumalgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checksumalgo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checksumalgo</em>' attribute.
	 * @see #setChecksumalgo(String)
	 * @see crownking.edc.EdcPackage#getDCRFieldSemanticType_Checksumalgo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='checksumalgo'"
	 * @generated
	 */
	String getChecksumalgo();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRFieldSemanticType#getChecksumalgo <em>Checksumalgo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checksumalgo</em>' attribute.
	 * @see #getChecksumalgo()
	 * @generated
	 */
	void setChecksumalgo(String value);

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
	 * @see crownking.edc.EdcPackage#getDCRFieldSemanticType_Cname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cname'"
	 * @generated
	 */
	String getCname();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRFieldSemanticType#getCname <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cname</em>' attribute.
	 * @see #getCname()
	 * @generated
	 */
	void setCname(String value);

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
	 * @see crownking.edc.EdcPackage#getDCRFieldSemanticType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='desc'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRFieldSemanticType#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endaddr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endaddr</em>' attribute.
	 * @see #setEndaddr(String)
	 * @see crownking.edc.EdcPackage#getDCRFieldSemanticType_Endaddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='endaddr'"
	 * @generated
	 */
	String getEndaddr();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRFieldSemanticType#getEndaddr <em>Endaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endaddr</em>' attribute.
	 * @see #getEndaddr()
	 * @generated
	 */
	void setEndaddr(String value);

	/**
	 * Returns the value of the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ishidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ishidden</em>' attribute.
	 * @see #setIshidden(String)
	 * @see crownking.edc.EdcPackage#getDCRFieldSemanticType_Ishidden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ishidden'"
	 * @generated
	 */
	String getIshidden();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRFieldSemanticType#getIshidden <em>Ishidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ishidden</em>' attribute.
	 * @see #getIshidden()
	 * @generated
	 */
	void setIshidden(String value);

	/**
	 * Returns the value of the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Islanghidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Islanghidden</em>' attribute.
	 * @see #setIslanghidden(String)
	 * @see crownking.edc.EdcPackage#getDCRFieldSemanticType_Islanghidden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='islanghidden'"
	 * @generated
	 */
	String getIslanghidden();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRFieldSemanticType#getIslanghidden <em>Islanghidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Islanghidden</em>' attribute.
	 * @see #getIslanghidden()
	 * @generated
	 */
	void setIslanghidden(String value);

	/**
	 * Returns the value of the '<em><b>Oscmodeidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oscmodeidref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oscmodeidref</em>' attribute.
	 * @see #isSetOscmodeidref()
	 * @see #unsetOscmodeidref()
	 * @see #setOscmodeidref(byte)
	 * @see crownking.edc.EdcPackage#getDCRFieldSemanticType_Oscmodeidref()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='oscmodeidref'"
	 * @generated
	 */
	byte getOscmodeidref();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRFieldSemanticType#getOscmodeidref <em>Oscmodeidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oscmodeidref</em>' attribute.
	 * @see #isSetOscmodeidref()
	 * @see #unsetOscmodeidref()
	 * @see #getOscmodeidref()
	 * @generated
	 */
	void setOscmodeidref(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.DCRFieldSemanticType#getOscmodeidref <em>Oscmodeidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOscmodeidref()
	 * @see #getOscmodeidref()
	 * @see #setOscmodeidref(byte)
	 * @generated
	 */
	void unsetOscmodeidref();

	/**
	 * Returns whether the value of the '{@link crownking.edc.DCRFieldSemanticType#getOscmodeidref <em>Oscmodeidref</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Oscmodeidref</em>' attribute is set.
	 * @see #unsetOscmodeidref()
	 * @see #getOscmodeidref()
	 * @see #setOscmodeidref(byte)
	 * @generated
	 */
	boolean isSetOscmodeidref();

	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(String)
	 * @see crownking.edc.EdcPackage#getDCRFieldSemanticType_When()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='when'"
	 * @generated
	 */
	String getWhen();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRFieldSemanticType#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(String value);

} // DCRFieldSemanticType
