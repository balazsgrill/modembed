/**
 */
package hu.modembed.model.comm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.comm.CommunicationProtocol#getFrames <em>Frames</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.comm.CommPackage#getCommunicationProtocol()
 * @model abstract="true"
 * @generated
 */
public interface CommunicationProtocol extends EObject {
	/**
	 * Returns the value of the '<em><b>Frames</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.comm.Frame}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frames</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames</em>' containment reference list.
	 * @see hu.modembed.model.comm.CommPackage#getCommunicationProtocol_Frames()
	 * @model containment="true"
	 * @generated
	 */
	EList<Frame> getFrames();

} // CommunicationProtocol
