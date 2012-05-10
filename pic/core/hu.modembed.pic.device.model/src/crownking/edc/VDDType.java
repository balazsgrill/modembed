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
 * A representation of the model object '<em><b>VDD Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.VDDType#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.VDDType#getMaxdefaultvoltage <em>Maxdefaultvoltage</em>}</li>
 *   <li>{@link crownking.edc.VDDType#getMaxvoltage <em>Maxvoltage</em>}</li>
 *   <li>{@link crownking.edc.VDDType#getMindefaultvoltage <em>Mindefaultvoltage</em>}</li>
 *   <li>{@link crownking.edc.VDDType#getMinvoltage <em>Minvoltage</em>}</li>
 *   <li>{@link crownking.edc.VDDType#getNominalvoltage <em>Nominalvoltage</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getVDDType()
 * @model extendedMetaData="name='VDDType' kind='simple'"
 * @generated
 */
public interface VDDType extends EObject {
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
	 * @see crownking.edc.EdcPackage#getVDDType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link crownking.edc.VDDType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Maxdefaultvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxdefaultvoltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxdefaultvoltage</em>' attribute.
	 * @see #isSetMaxdefaultvoltage()
	 * @see #unsetMaxdefaultvoltage()
	 * @see #setMaxdefaultvoltage(float)
	 * @see crownking.edc.EdcPackage#getVDDType_Maxdefaultvoltage()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='maxdefaultvoltage'"
	 * @generated
	 */
	float getMaxdefaultvoltage();

	/**
	 * Sets the value of the '{@link crownking.edc.VDDType#getMaxdefaultvoltage <em>Maxdefaultvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxdefaultvoltage</em>' attribute.
	 * @see #isSetMaxdefaultvoltage()
	 * @see #unsetMaxdefaultvoltage()
	 * @see #getMaxdefaultvoltage()
	 * @generated
	 */
	void setMaxdefaultvoltage(float value);

	/**
	 * Unsets the value of the '{@link crownking.edc.VDDType#getMaxdefaultvoltage <em>Maxdefaultvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxdefaultvoltage()
	 * @see #getMaxdefaultvoltage()
	 * @see #setMaxdefaultvoltage(float)
	 * @generated
	 */
	void unsetMaxdefaultvoltage();

	/**
	 * Returns whether the value of the '{@link crownking.edc.VDDType#getMaxdefaultvoltage <em>Maxdefaultvoltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maxdefaultvoltage</em>' attribute is set.
	 * @see #unsetMaxdefaultvoltage()
	 * @see #getMaxdefaultvoltage()
	 * @see #setMaxdefaultvoltage(float)
	 * @generated
	 */
	boolean isSetMaxdefaultvoltage();

	/**
	 * Returns the value of the '<em><b>Maxvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxvoltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxvoltage</em>' attribute.
	 * @see #isSetMaxvoltage()
	 * @see #unsetMaxvoltage()
	 * @see #setMaxvoltage(float)
	 * @see crownking.edc.EdcPackage#getVDDType_Maxvoltage()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='maxvoltage'"
	 * @generated
	 */
	float getMaxvoltage();

	/**
	 * Sets the value of the '{@link crownking.edc.VDDType#getMaxvoltage <em>Maxvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxvoltage</em>' attribute.
	 * @see #isSetMaxvoltage()
	 * @see #unsetMaxvoltage()
	 * @see #getMaxvoltage()
	 * @generated
	 */
	void setMaxvoltage(float value);

	/**
	 * Unsets the value of the '{@link crownking.edc.VDDType#getMaxvoltage <em>Maxvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxvoltage()
	 * @see #getMaxvoltage()
	 * @see #setMaxvoltage(float)
	 * @generated
	 */
	void unsetMaxvoltage();

	/**
	 * Returns whether the value of the '{@link crownking.edc.VDDType#getMaxvoltage <em>Maxvoltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maxvoltage</em>' attribute is set.
	 * @see #unsetMaxvoltage()
	 * @see #getMaxvoltage()
	 * @see #setMaxvoltage(float)
	 * @generated
	 */
	boolean isSetMaxvoltage();

	/**
	 * Returns the value of the '<em><b>Mindefaultvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mindefaultvoltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mindefaultvoltage</em>' attribute.
	 * @see #isSetMindefaultvoltage()
	 * @see #unsetMindefaultvoltage()
	 * @see #setMindefaultvoltage(float)
	 * @see crownking.edc.EdcPackage#getVDDType_Mindefaultvoltage()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='mindefaultvoltage'"
	 * @generated
	 */
	float getMindefaultvoltage();

	/**
	 * Sets the value of the '{@link crownking.edc.VDDType#getMindefaultvoltage <em>Mindefaultvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mindefaultvoltage</em>' attribute.
	 * @see #isSetMindefaultvoltage()
	 * @see #unsetMindefaultvoltage()
	 * @see #getMindefaultvoltage()
	 * @generated
	 */
	void setMindefaultvoltage(float value);

	/**
	 * Unsets the value of the '{@link crownking.edc.VDDType#getMindefaultvoltage <em>Mindefaultvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMindefaultvoltage()
	 * @see #getMindefaultvoltage()
	 * @see #setMindefaultvoltage(float)
	 * @generated
	 */
	void unsetMindefaultvoltage();

	/**
	 * Returns whether the value of the '{@link crownking.edc.VDDType#getMindefaultvoltage <em>Mindefaultvoltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mindefaultvoltage</em>' attribute is set.
	 * @see #unsetMindefaultvoltage()
	 * @see #getMindefaultvoltage()
	 * @see #setMindefaultvoltage(float)
	 * @generated
	 */
	boolean isSetMindefaultvoltage();

	/**
	 * Returns the value of the '<em><b>Minvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minvoltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minvoltage</em>' attribute.
	 * @see #isSetMinvoltage()
	 * @see #unsetMinvoltage()
	 * @see #setMinvoltage(float)
	 * @see crownking.edc.EdcPackage#getVDDType_Minvoltage()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='minvoltage'"
	 * @generated
	 */
	float getMinvoltage();

	/**
	 * Sets the value of the '{@link crownking.edc.VDDType#getMinvoltage <em>Minvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minvoltage</em>' attribute.
	 * @see #isSetMinvoltage()
	 * @see #unsetMinvoltage()
	 * @see #getMinvoltage()
	 * @generated
	 */
	void setMinvoltage(float value);

	/**
	 * Unsets the value of the '{@link crownking.edc.VDDType#getMinvoltage <em>Minvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinvoltage()
	 * @see #getMinvoltage()
	 * @see #setMinvoltage(float)
	 * @generated
	 */
	void unsetMinvoltage();

	/**
	 * Returns whether the value of the '{@link crownking.edc.VDDType#getMinvoltage <em>Minvoltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minvoltage</em>' attribute is set.
	 * @see #unsetMinvoltage()
	 * @see #getMinvoltage()
	 * @see #setMinvoltage(float)
	 * @generated
	 */
	boolean isSetMinvoltage();

	/**
	 * Returns the value of the '<em><b>Nominalvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominalvoltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominalvoltage</em>' attribute.
	 * @see #isSetNominalvoltage()
	 * @see #unsetNominalvoltage()
	 * @see #setNominalvoltage(float)
	 * @see crownking.edc.EdcPackage#getVDDType_Nominalvoltage()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='nominalvoltage'"
	 * @generated
	 */
	float getNominalvoltage();

	/**
	 * Sets the value of the '{@link crownking.edc.VDDType#getNominalvoltage <em>Nominalvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominalvoltage</em>' attribute.
	 * @see #isSetNominalvoltage()
	 * @see #unsetNominalvoltage()
	 * @see #getNominalvoltage()
	 * @generated
	 */
	void setNominalvoltage(float value);

	/**
	 * Unsets the value of the '{@link crownking.edc.VDDType#getNominalvoltage <em>Nominalvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalvoltage()
	 * @see #getNominalvoltage()
	 * @see #setNominalvoltage(float)
	 * @generated
	 */
	void unsetNominalvoltage();

	/**
	 * Returns whether the value of the '{@link crownking.edc.VDDType#getNominalvoltage <em>Nominalvoltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominalvoltage</em>' attribute is set.
	 * @see #unsetNominalvoltage()
	 * @see #getNominalvoltage()
	 * @see #setNominalvoltage(float)
	 * @generated
	 */
	boolean isSetNominalvoltage();

} // VDDType
