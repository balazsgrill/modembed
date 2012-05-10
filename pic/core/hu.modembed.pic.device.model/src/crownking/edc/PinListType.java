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
 * A representation of the model object '<em><b>Pin List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.PinListType#getPin <em>Pin</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getPinListType()
 * @model extendedMetaData="name='PinListType' kind='elementOnly'"
 * @generated
 */
public interface PinListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.PinType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pin 02  PIN 03  PIN 04  PIN 05  PIN 06  PIN 07  PIN 08  PIN 09  PIN 10  PIN 11  PIN 12  PIN 13  PIN 14  Pin 02  PIN 03  PIN 04  PIN 05  PIN 06  PIN 07  PIN 08  PIN 09  PIN 10  PIN 11  PIN 12  PIN 13  PIN 14
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pin</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getPinListType_Pin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Pin' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PinType> getPin();

} // PinListType
