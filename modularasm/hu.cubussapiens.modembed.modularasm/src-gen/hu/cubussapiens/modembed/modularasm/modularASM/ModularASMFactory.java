/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage
 * @generated
 */
public interface ModularASMFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModularASMFactory eINSTANCE = hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Module Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Param</em>'.
   * @generated
   */
  ModuleParam createModuleParam();

  /**
   * Returns a new object of class '<em>Qualified ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified ID</em>'.
   * @generated
   */
  QualifiedID createQualifiedID();

  /**
   * Returns a new object of class '<em>Module Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Item</em>'.
   * @generated
   */
  ModuleItem createModuleItem();

  /**
   * Returns a new object of class '<em>Configuration Word</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration Word</em>'.
   * @generated
   */
  ConfigurationWord createConfigurationWord();

  /**
   * Returns a new object of class '<em>Configuration Field Place</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration Field Place</em>'.
   * @generated
   */
  ConfigurationFieldPlace createConfigurationFieldPlace();

  /**
   * Returns a new object of class '<em>Configuration Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration Field</em>'.
   * @generated
   */
  ConfigurationField createConfigurationField();

  /**
   * Returns a new object of class '<em>Enum Configuration Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Configuration Field</em>'.
   * @generated
   */
  EnumConfigurationField createEnumConfigurationField();

  /**
   * Returns a new object of class '<em>Enum Configuration Field Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Configuration Field Literal</em>'.
   * @generated
   */
  EnumConfigurationFieldLiteral createEnumConfigurationFieldLiteral();

  /**
   * Returns a new object of class '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol</em>'.
   * @generated
   */
  Symbol createSymbol();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance</em>'.
   * @generated
   */
  Instance createInstance();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Method Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Param</em>'.
   * @generated
   */
  MethodParam createMethodParam();

  /**
   * Returns a new object of class '<em>Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Step</em>'.
   * @generated
   */
  Step createStep();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Method Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Call</em>'.
   * @generated
   */
  MethodCall createMethodCall();

  /**
   * Returns a new object of class '<em>Method Call Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Call Param</em>'.
   * @generated
   */
  MethodCallParam createMethodCallParam();

  /**
   * Returns a new object of class '<em>Ins Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ins Param</em>'.
   * @generated
   */
  InsParam createInsParam();

  /**
   * Returns a new object of class '<em>Literal Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Param</em>'.
   * @generated
   */
  LiteralParam createLiteralParam();

  /**
   * Returns a new object of class '<em>Ref Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Param</em>'.
   * @generated
   */
  RefParam createRefParam();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ModularASMPackage getModularASMPackage();

} //ModularASMFactory
