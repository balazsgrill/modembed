/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM.impl;

import hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationField;
import hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace;
import hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord;
import hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField;
import hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationFieldLiteral;
import hu.cubussapiens.modembed.modularasm.modularASM.Function;
import hu.cubussapiens.modembed.modularasm.modularASM.InsParam;
import hu.cubussapiens.modembed.modularasm.modularASM.Instance;
import hu.cubussapiens.modembed.modularasm.modularASM.Instruction;
import hu.cubussapiens.modembed.modularasm.modularASM.Label;
import hu.cubussapiens.modembed.modularasm.modularASM.LiteralParam;
import hu.cubussapiens.modembed.modularasm.modularASM.Method;
import hu.cubussapiens.modembed.modularasm.modularASM.MethodCall;
import hu.cubussapiens.modembed.modularasm.modularASM.MethodCallParam;
import hu.cubussapiens.modembed.modularasm.modularASM.MethodParam;
import hu.cubussapiens.modembed.modularasm.modularASM.ModularASMFactory;
import hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.ModuleItem;
import hu.cubussapiens.modembed.modularasm.modularASM.ModuleParam;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;
import hu.cubussapiens.modembed.modularasm.modularASM.RefParam;
import hu.cubussapiens.modembed.modularasm.modularASM.Step;
import hu.cubussapiens.modembed.modularasm.modularASM.Symbol;
import hu.cubussapiens.modembed.modularasm.modularASM.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModularASMPackageImpl extends EPackageImpl implements ModularASMPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationWordEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationFieldPlaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumConfigurationFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumConfigurationFieldLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodCallParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refParamEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ModularASMPackageImpl()
  {
    super(eNS_URI, ModularASMFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ModularASMPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ModularASMPackage init()
  {
    if (isInited) return (ModularASMPackage)EPackage.Registry.INSTANCE.getEPackage(ModularASMPackage.eNS_URI);

    // Obtain or create and register package
    ModularASMPackageImpl theModularASMPackage = (ModularASMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModularASMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModularASMPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theModularASMPackage.createPackageContents();

    // Initialize created meta-data
    theModularASMPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theModularASMPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ModularASMPackage.eNS_URI, theModularASMPackage);
    return theModularASMPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Name()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Target()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Items()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Params()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleParam()
  {
    return moduleParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleParam_Type()
  {
    return (EReference)moduleParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModuleParam_Name()
  {
    return (EAttribute)moduleParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedID()
  {
    return qualifiedIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedID_Segments()
  {
    return (EAttribute)qualifiedIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleItem()
  {
    return moduleItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModuleItem_Name()
  {
    return (EAttribute)moduleItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigurationWord()
  {
    return configurationWordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigurationWord_Default()
  {
    return (EReference)configurationWordEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigurationWord_Fields()
  {
    return (EReference)configurationWordEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigurationFieldPlace()
  {
    return configurationFieldPlaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigurationFieldPlace_BitNum()
  {
    return (EReference)configurationFieldPlaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigurationFieldPlace_StartBit()
  {
    return (EReference)configurationFieldPlaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigurationFieldPlace_Field()
  {
    return (EReference)configurationFieldPlaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigurationField()
  {
    return configurationFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumConfigurationField()
  {
    return enumConfigurationFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumConfigurationField_Name()
  {
    return (EAttribute)enumConfigurationFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumConfigurationField_Literals()
  {
    return (EReference)enumConfigurationFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumConfigurationFieldLiteral()
  {
    return enumConfigurationFieldLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumConfigurationFieldLiteral_Name()
  {
    return (EAttribute)enumConfigurationFieldLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumConfigurationFieldLiteral_Value()
  {
    return (EReference)enumConfigurationFieldLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymbol()
  {
    return symbolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbol_Value()
  {
    return (EAttribute)symbolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstance()
  {
    return instanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_Type()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_Params()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Step()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Params()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Step()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodParam()
  {
    return methodParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodParam_Type()
  {
    return (EReference)methodParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodParam_Name()
  {
    return (EAttribute)methodParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStep()
  {
    return stepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Name()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_Ins()
  {
    return (EAttribute)instructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_Params()
  {
    return (EReference)instructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodCall()
  {
    return methodCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodCall_Method()
  {
    return (EReference)methodCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodCall_Params()
  {
    return (EReference)methodCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodCallParam()
  {
    return methodCallParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodCallParam_Ref()
  {
    return (EReference)methodCallParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsParam()
  {
    return insParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralParam()
  {
    return literalParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralParam_Value()
  {
    return (EAttribute)literalParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefParam()
  {
    return refParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefParam_Ref()
  {
    return (EReference)refParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModularASMFactory getModularASMFactory()
  {
    return (ModularASMFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    moduleEClass = createEClass(MODULE);
    createEAttribute(moduleEClass, MODULE__NAME);
    createEReference(moduleEClass, MODULE__TARGET);
    createEReference(moduleEClass, MODULE__ITEMS);
    createEReference(moduleEClass, MODULE__PARAMS);

    moduleParamEClass = createEClass(MODULE_PARAM);
    createEReference(moduleParamEClass, MODULE_PARAM__TYPE);
    createEAttribute(moduleParamEClass, MODULE_PARAM__NAME);

    qualifiedIDEClass = createEClass(QUALIFIED_ID);
    createEAttribute(qualifiedIDEClass, QUALIFIED_ID__SEGMENTS);

    moduleItemEClass = createEClass(MODULE_ITEM);
    createEAttribute(moduleItemEClass, MODULE_ITEM__NAME);

    configurationWordEClass = createEClass(CONFIGURATION_WORD);
    createEReference(configurationWordEClass, CONFIGURATION_WORD__DEFAULT);
    createEReference(configurationWordEClass, CONFIGURATION_WORD__FIELDS);

    configurationFieldPlaceEClass = createEClass(CONFIGURATION_FIELD_PLACE);
    createEReference(configurationFieldPlaceEClass, CONFIGURATION_FIELD_PLACE__BIT_NUM);
    createEReference(configurationFieldPlaceEClass, CONFIGURATION_FIELD_PLACE__START_BIT);
    createEReference(configurationFieldPlaceEClass, CONFIGURATION_FIELD_PLACE__FIELD);

    configurationFieldEClass = createEClass(CONFIGURATION_FIELD);

    enumConfigurationFieldEClass = createEClass(ENUM_CONFIGURATION_FIELD);
    createEAttribute(enumConfigurationFieldEClass, ENUM_CONFIGURATION_FIELD__NAME);
    createEReference(enumConfigurationFieldEClass, ENUM_CONFIGURATION_FIELD__LITERALS);

    enumConfigurationFieldLiteralEClass = createEClass(ENUM_CONFIGURATION_FIELD_LITERAL);
    createEAttribute(enumConfigurationFieldLiteralEClass, ENUM_CONFIGURATION_FIELD_LITERAL__NAME);
    createEReference(enumConfigurationFieldLiteralEClass, ENUM_CONFIGURATION_FIELD_LITERAL__VALUE);

    symbolEClass = createEClass(SYMBOL);
    createEAttribute(symbolEClass, SYMBOL__VALUE);

    variableEClass = createEClass(VARIABLE);

    instanceEClass = createEClass(INSTANCE);
    createEReference(instanceEClass, INSTANCE__TYPE);
    createEReference(instanceEClass, INSTANCE__PARAMS);

    functionEClass = createEClass(FUNCTION);
    createEReference(functionEClass, FUNCTION__STEP);

    methodEClass = createEClass(METHOD);
    createEReference(methodEClass, METHOD__PARAMS);
    createEReference(methodEClass, METHOD__STEP);

    methodParamEClass = createEClass(METHOD_PARAM);
    createEReference(methodParamEClass, METHOD_PARAM__TYPE);
    createEAttribute(methodParamEClass, METHOD_PARAM__NAME);

    stepEClass = createEClass(STEP);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__NAME);

    instructionEClass = createEClass(INSTRUCTION);
    createEAttribute(instructionEClass, INSTRUCTION__INS);
    createEReference(instructionEClass, INSTRUCTION__PARAMS);

    methodCallEClass = createEClass(METHOD_CALL);
    createEReference(methodCallEClass, METHOD_CALL__METHOD);
    createEReference(methodCallEClass, METHOD_CALL__PARAMS);

    methodCallParamEClass = createEClass(METHOD_CALL_PARAM);
    createEReference(methodCallParamEClass, METHOD_CALL_PARAM__REF);

    insParamEClass = createEClass(INS_PARAM);

    literalParamEClass = createEClass(LITERAL_PARAM);
    createEAttribute(literalParamEClass, LITERAL_PARAM__VALUE);

    refParamEClass = createEClass(REF_PARAM);
    createEReference(refParamEClass, REF_PARAM__REF);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    configurationWordEClass.getESuperTypes().add(this.getModuleItem());
    enumConfigurationFieldEClass.getESuperTypes().add(this.getConfigurationField());
    symbolEClass.getESuperTypes().add(this.getModuleItem());
    variableEClass.getESuperTypes().add(this.getModuleItem());
    instanceEClass.getESuperTypes().add(this.getModuleItem());
    functionEClass.getESuperTypes().add(this.getModuleItem());
    methodEClass.getESuperTypes().add(this.getModuleItem());
    labelEClass.getESuperTypes().add(this.getStep());
    instructionEClass.getESuperTypes().add(this.getStep());
    methodCallEClass.getESuperTypes().add(this.getStep());
    literalParamEClass.getESuperTypes().add(this.getInsParam());
    refParamEClass.getESuperTypes().add(this.getInsParam());

    // Initialize classes and features; add operations and parameters
    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Target(), this.getQualifiedID(), null, "target", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Items(), this.getModuleItem(), null, "items", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Params(), this.getModuleParam(), null, "params", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleParamEClass, ModuleParam.class, "ModuleParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModuleParam_Type(), this.getQualifiedID(), null, "type", null, 0, 1, ModuleParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModuleParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModuleParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedIDEClass, QualifiedID.class, "QualifiedID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualifiedID_Segments(), ecorePackage.getEString(), "segments", null, 0, -1, QualifiedID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleItemEClass, ModuleItem.class, "ModuleItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModuleItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModuleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationWordEClass, ConfigurationWord.class, "ConfigurationWord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfigurationWord_Default(), this.getLiteralParam(), null, "default", null, 0, 1, ConfigurationWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfigurationWord_Fields(), this.getConfigurationFieldPlace(), null, "fields", null, 0, -1, ConfigurationWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationFieldPlaceEClass, ConfigurationFieldPlace.class, "ConfigurationFieldPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfigurationFieldPlace_BitNum(), this.getLiteralParam(), null, "bitNum", null, 0, 1, ConfigurationFieldPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfigurationFieldPlace_StartBit(), this.getLiteralParam(), null, "startBit", null, 0, 1, ConfigurationFieldPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfigurationFieldPlace_Field(), this.getConfigurationField(), null, "field", null, 0, 1, ConfigurationFieldPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationFieldEClass, ConfigurationField.class, "ConfigurationField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumConfigurationFieldEClass, EnumConfigurationField.class, "EnumConfigurationField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumConfigurationField_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumConfigurationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumConfigurationField_Literals(), this.getEnumConfigurationFieldLiteral(), null, "literals", null, 0, -1, EnumConfigurationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumConfigurationFieldLiteralEClass, EnumConfigurationFieldLiteral.class, "EnumConfigurationFieldLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumConfigurationFieldLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumConfigurationFieldLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumConfigurationFieldLiteral_Value(), this.getLiteralParam(), null, "value", null, 0, 1, EnumConfigurationFieldLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(symbolEClass, Symbol.class, "Symbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSymbol_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstance_Type(), this.getQualifiedID(), null, "type", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstance_Params(), this.getQualifiedID(), null, "params", null, 0, -1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunction_Step(), this.getStep(), null, "step", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethod_Params(), this.getMethodParam(), null, "params", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Step(), this.getStep(), null, "step", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodParamEClass, MethodParam.class, "MethodParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodParam_Type(), this.getQualifiedID(), null, "type", null, 0, 1, MethodParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethodParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_Ins(), ecorePackage.getEString(), "ins", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_Params(), this.getInsParam(), null, "params", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodCallEClass, MethodCall.class, "MethodCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodCall_Method(), this.getQualifiedID(), null, "method", null, 0, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodCall_Params(), this.getMethodCallParam(), null, "params", null, 0, -1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodCallParamEClass, MethodCallParam.class, "MethodCallParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodCallParam_Ref(), this.getQualifiedID(), null, "ref", null, 0, 1, MethodCallParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(insParamEClass, InsParam.class, "InsParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(literalParamEClass, LiteralParam.class, "LiteralParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralParam_Value(), ecorePackage.getEInt(), "value", null, 0, 1, LiteralParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refParamEClass, RefParam.class, "RefParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefParam_Ref(), this.getQualifiedID(), null, "ref", null, 0, 1, RefParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ModularASMPackageImpl
