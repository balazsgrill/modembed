/**
 * <copyright>
 * </copyright>
 *
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linked Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.LinkedBinary#getName <em>Name</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.LinkedBinary#getType <em>Type</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.LinkedBinary#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getLinkedBinary()
 * @model
 * @generated
 */
public interface LinkedBinary extends TopLevelItem
{
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
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getLinkedBinary_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.LinkedBinary#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link hu.e.parser.eSyntax.BinaryType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see hu.e.parser.eSyntax.BinaryType
   * @see #setType(BinaryType)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getLinkedBinary_Type()
   * @model
   * @generated
   */
  BinaryType getType();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.LinkedBinary#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see hu.e.parser.eSyntax.BinaryType
   * @see #getType()
   * @generated
   */
  void setType(BinaryType value);

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.BinarySection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getLinkedBinary_Sections()
   * @model containment="true"
   * @generated
   */
  EList<BinarySection> getSections();

} // LinkedBinary
