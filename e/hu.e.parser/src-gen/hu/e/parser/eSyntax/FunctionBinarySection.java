/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Binary Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getOperation <em>Operation</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getMemwidth <em>Memwidth</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getMems <em>Mems</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getLib <em>Lib</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getInstances <em>Instances</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getLinks <em>Links</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getConfs <em>Confs</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection()
 * @model
 * @generated
 */
public interface FunctionBinarySection extends BinarySection
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' reference.
   * @see #setOperation(Operation)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Operation()
   * @model
   * @generated
   */
  Operation getOperation();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.FunctionBinarySection#getOperation <em>Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(Operation value);

  /**
   * Returns the value of the '<em><b>Memwidth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Memwidth</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memwidth</em>' attribute.
   * @see #setMemwidth(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Memwidth()
   * @model
   * @generated
   */
  String getMemwidth();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.FunctionBinarySection#getMemwidth <em>Memwidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Memwidth</em>' attribute.
   * @see #getMemwidth()
   * @generated
   */
  void setMemwidth(String value);

  /**
   * Returns the value of the '<em><b>Mems</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.FunctionMemory}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mems</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Mems()
   * @model containment="true"
   * @generated
   */
  EList<FunctionMemory> getMems();

  /**
   * Returns the value of the '<em><b>Lib</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.Library}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lib</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lib</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Lib()
   * @model containment="true"
   * @generated
   */
  EList<Library> getLib();

  /**
   * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.LinkedInstance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Instances()
   * @model containment="true"
   * @generated
   */
  EList<LinkedInstance> getInstances();

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
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Links()
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
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Confs()
   * @model containment="true"
   * @generated
   */
  EList<InstanceConfig> getConfs();

} // FunctionBinarySection
