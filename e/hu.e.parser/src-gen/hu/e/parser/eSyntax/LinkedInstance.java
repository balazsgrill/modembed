/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linked Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.LinkedInstance#getType <em>Type</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.LinkedInstance#getName <em>Name</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.LinkedInstance#getLinks <em>Links</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.LinkedInstance#getConfs <em>Confs</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getLinkedInstance()
 * @model
 * @generated
 */
public interface LinkedInstance extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(hu.e.parser.eSyntax.Class)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getLinkedInstance_Type()
   * @model
   * @generated
   */
  hu.e.parser.eSyntax.Class getType();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.LinkedInstance#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(hu.e.parser.eSyntax.Class value);

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
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getLinkedInstance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.LinkedInstance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.ReferenceLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getLinkedInstance_Links()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceLink> getLinks();

  /**
   * Returns the value of the '<em><b>Confs</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.InstanceConfig}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Confs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Confs</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getLinkedInstance_Confs()
   * @model containment="true"
   * @generated
   */
  EList<InstanceConfig> getConfs();

} // LinkedInstance
