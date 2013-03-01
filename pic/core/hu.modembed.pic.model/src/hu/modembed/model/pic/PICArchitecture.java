/**
 */
package hu.modembed.model.pic;

import hu.modembed.model.architecture.Architecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PIC Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.pic.PICArchitecture#getConfigWords <em>Config Words</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.pic.PicPackage#getPICArchitecture()
 * @model
 * @generated
 */
public interface PICArchitecture extends Architecture {
	/**
	 * Returns the value of the '<em><b>Config Words</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.pic.ConfigWord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Words</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Words</em>' containment reference list.
	 * @see hu.modembed.model.pic.PicPackage#getPICArchitecture_ConfigWords()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigWord> getConfigWords();

} // PICArchitecture
