/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.Operation#getName <em>Name</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.Operation#getParams <em>Params</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.Operation#getBlock <em>Block</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.Operation#getReturn <em>Return</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.Operation#getReturnvar <em>Returnvar</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends OperationSignature
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
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperation_Params()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getParams();

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(OperationBlock)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperation_Block()
   * @model containment="true"
   * @generated
   */
  OperationBlock getBlock();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.Operation#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(OperationBlock value);

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperation_Return()
   * @model containment="true"
   * @generated
   */
  XExpression getReturn();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.Operation#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(XExpression value);

  /**
   * Returns the value of the '<em><b>Returnvar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Returnvar</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Returnvar</em>' containment reference.
   * @see #setReturnvar(Variable)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperation_Returnvar()
   * @model containment="true"
   * @generated
   */
  Variable getReturnvar();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.Operation#getReturnvar <em>Returnvar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Returnvar</em>' containment reference.
   * @see #getReturnvar()
   * @generated
   */
  void setReturnvar(Variable value);

} // Operation
