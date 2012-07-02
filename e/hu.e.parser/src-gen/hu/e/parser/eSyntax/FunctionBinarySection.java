/**
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
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getName <em>Name</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getStartAddr <em>Start Addr</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getMemwidth <em>Memwidth</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getPointerType <em>Pointer Type</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getMems <em>Mems</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getOptimizercalls <em>Optimizercalls</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getLib <em>Lib</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getDo <em>Do</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.FunctionBinarySection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Start Addr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Addr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Addr</em>' attribute.
   * @see #setStartAddr(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_StartAddr()
   * @model
   * @generated
   */
  String getStartAddr();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.FunctionBinarySection#getStartAddr <em>Start Addr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Addr</em>' attribute.
   * @see #getStartAddr()
   * @generated
   */
  void setStartAddr(String value);

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
   * Returns the value of the '<em><b>Pointer Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointer Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointer Type</em>' containment reference.
   * @see #setPointerType(TypeDef)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_PointerType()
   * @model containment="true"
   * @generated
   */
  TypeDef getPointerType();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.FunctionBinarySection#getPointerType <em>Pointer Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointer Type</em>' containment reference.
   * @see #getPointerType()
   * @generated
   */
  void setPointerType(TypeDef value);

  /**
   * Returns the value of the '<em><b>Address Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address Type</em>' containment reference.
   * @see #setAddressType(TypeDef)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_AddressType()
   * @model containment="true"
   * @generated
   */
  TypeDef getAddressType();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.FunctionBinarySection#getAddressType <em>Address Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address Type</em>' containment reference.
   * @see #getAddressType()
   * @generated
   */
  void setAddressType(TypeDef value);

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
   * Returns the value of the '<em><b>Optimizercalls</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.OptimizerCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optimizercalls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optimizercalls</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Optimizercalls()
   * @model containment="true"
   * @generated
   */
  EList<OptimizerCall> getOptimizercalls();

  /**
   * Returns the value of the '<em><b>Lib</b></em>' reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.Library}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lib</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lib</em>' reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Lib()
   * @model
   * @generated
   */
  EList<Library> getLib();

  /**
   * Returns the value of the '<em><b>Do</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Do</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do</em>' containment reference.
   * @see #setDo(OperationBlock)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Do()
   * @model containment="true"
   * @generated
   */
  OperationBlock getDo();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.FunctionBinarySection#getDo <em>Do</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do</em>' containment reference.
   * @see #getDo()
   * @generated
   */
  void setDo(OperationBlock value);

} // FunctionBinarySection
