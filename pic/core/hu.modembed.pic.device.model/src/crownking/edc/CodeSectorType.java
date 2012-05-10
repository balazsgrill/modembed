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
 * A representation of the model object '<em><b>Code Sector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.CodeSectorType#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.CodeSectorType#getBeginaddr <em>Beginaddr</em>}</li>
 *   <li>{@link crownking.edc.CodeSectorType#getEndaddr <em>Endaddr</em>}</li>
 *   <li>{@link crownking.edc.CodeSectorType#getIssection <em>Issection</em>}</li>
 *   <li>{@link crownking.edc.CodeSectorType#getRegionid <em>Regionid</em>}</li>
 *   <li>{@link crownking.edc.CodeSectorType#getSectiondesc <em>Sectiondesc</em>}</li>
 *   <li>{@link crownking.edc.CodeSectorType#getSectionname <em>Sectionname</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getCodeSectorType()
 * @model extendedMetaData="name='CodeSectorType' kind='simple'"
 * @generated
 */
public interface CodeSectorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see crownking.edc.EdcPackage#getCodeSectorType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link crownking.edc.CodeSectorType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see crownking.edc.EdcPackage#getCodeSectorType_Beginaddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='beginaddr'"
	 * @generated
	 */
	String getBeginaddr();

	/**
	 * Sets the value of the '{@link crownking.edc.CodeSectorType#getBeginaddr <em>Beginaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginaddr</em>' attribute.
	 * @see #getBeginaddr()
	 * @generated
	 */
	void setBeginaddr(String value);

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
	 * @see crownking.edc.EdcPackage#getCodeSectorType_Endaddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='endaddr'"
	 * @generated
	 */
	String getEndaddr();

	/**
	 * Sets the value of the '{@link crownking.edc.CodeSectorType#getEndaddr <em>Endaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endaddr</em>' attribute.
	 * @see #getEndaddr()
	 * @generated
	 */
	void setEndaddr(String value);

	/**
	 * Returns the value of the '<em><b>Issection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issection</em>' attribute.
	 * @see #setIssection(String)
	 * @see crownking.edc.EdcPackage#getCodeSectorType_Issection()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='issection'"
	 * @generated
	 */
	String getIssection();

	/**
	 * Sets the value of the '{@link crownking.edc.CodeSectorType#getIssection <em>Issection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issection</em>' attribute.
	 * @see #getIssection()
	 * @generated
	 */
	void setIssection(String value);

	/**
	 * Returns the value of the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regionid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regionid</em>' attribute.
	 * @see #setRegionid(String)
	 * @see crownking.edc.EdcPackage#getCodeSectorType_Regionid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='regionid'"
	 * @generated
	 */
	String getRegionid();

	/**
	 * Sets the value of the '{@link crownking.edc.CodeSectorType#getRegionid <em>Regionid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regionid</em>' attribute.
	 * @see #getRegionid()
	 * @generated
	 */
	void setRegionid(String value);

	/**
	 * Returns the value of the '<em><b>Sectiondesc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sectiondesc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sectiondesc</em>' attribute.
	 * @see #setSectiondesc(String)
	 * @see crownking.edc.EdcPackage#getCodeSectorType_Sectiondesc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sectiondesc'"
	 * @generated
	 */
	String getSectiondesc();

	/**
	 * Sets the value of the '{@link crownking.edc.CodeSectorType#getSectiondesc <em>Sectiondesc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sectiondesc</em>' attribute.
	 * @see #getSectiondesc()
	 * @generated
	 */
	void setSectiondesc(String value);

	/**
	 * Returns the value of the '<em><b>Sectionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sectionname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sectionname</em>' attribute.
	 * @see #setSectionname(String)
	 * @see crownking.edc.EdcPackage#getCodeSectorType_Sectionname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sectionname'"
	 * @generated
	 */
	String getSectionname();

	/**
	 * Sets the value of the '{@link crownking.edc.CodeSectorType#getSectionname <em>Sectionname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sectionname</em>' attribute.
	 * @see #getSectionname()
	 * @generated
	 */
	void setSectionname(String value);

} // CodeSectorType
