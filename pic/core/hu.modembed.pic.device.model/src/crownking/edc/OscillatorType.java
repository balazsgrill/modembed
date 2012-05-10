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
 * A representation of the model object '<em><b>Oscillator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.OscillatorType#getOscillatorMode <em>Oscillator Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getOscillatorType()
 * @model extendedMetaData="name='OscillatorType' kind='elementOnly'"
 * @generated
 */
public interface OscillatorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Oscillator Mode</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.OscillatorModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oscillator Mode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oscillator Mode</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getOscillatorType_OscillatorMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OscillatorMode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OscillatorModeType> getOscillatorMode();

} // OscillatorType
