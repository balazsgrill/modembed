/**
 * <copyright>
 * </copyright>
 *
 */
package hu.cubussapiens.modembed.modularasm.modularASM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID#getSegments <em>Segments</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getQualifiedID()
 * @model
 * @generated
 */
public interface QualifiedID extends EObject
{
  /**
   * Returns the value of the '<em><b>Segments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Segments</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Segments</em>' attribute list.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getQualifiedID_Segments()
   * @model unique="false"
   * @generated
   */
  EList<String> getSegments();

} // QualifiedID
