/**
 */
package hu.modembed.syntax.impl;

import hu.modembed.model.modembed.abstraction.AbstractionPackage;
import hu.modembed.model.modembed.core.instructionset.InstructionsetPackage;
import hu.modembed.model.modembed.core.object.ObjectPackage;
import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;
import hu.modembed.syntax.NonTerminalItem;
import hu.modembed.syntax.Pop;
import hu.modembed.syntax.Push;
import hu.modembed.syntax.Rule;
import hu.modembed.syntax.RuleItem;
import hu.modembed.syntax.SyntaxFactory;
import hu.modembed.syntax.SyntaxItem;
import hu.modembed.syntax.SyntaxModel;
import hu.modembed.syntax.SyntaxPackage;
import hu.modembed.syntax.Terminal;
import hu.modembed.syntax.TerminalItem;

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
public class SyntaxPackageImpl extends EPackageImpl implements SyntaxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntaxModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntaxItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonTerminalItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popEClass = null;

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
	 * @see hu.modembed.syntax.SyntaxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SyntaxPackageImpl() {
		super(eNS_URI, SyntaxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SyntaxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SyntaxPackage init() {
		if (isInited) return (SyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI);

		// Obtain or create and register package
		SyntaxPackageImpl theSyntaxPackage = (SyntaxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SyntaxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SyntaxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		InstructionsetPackage.eINSTANCE.eClass();
		ObjectPackage.eINSTANCE.eClass();
		AbstractionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSyntaxPackage.createPackageContents();

		// Initialize created meta-data
		theSyntaxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSyntaxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SyntaxPackage.eNS_URI, theSyntaxPackage);
		return theSyntaxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyntaxModel() {
		return syntaxModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyntaxModel_Terminals() {
		return (EReference)syntaxModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyntaxModel_Rules() {
		return (EReference)syntaxModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntaxModel_StartItem() {
		return (EAttribute)syntaxModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyntaxModel_Import() {
		return (EReference)syntaxModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminal_Regex() {
		return (EAttribute)terminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminal_Hide() {
		return (EAttribute)terminalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_NonTerminal() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Body() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleItem() {
		return ruleItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyntaxItem() {
		return syntaxItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntaxItem_Optional() {
		return (EAttribute)syntaxItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntaxItem_Many() {
		return (EAttribute)syntaxItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminalItem() {
		return terminalItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminalItem_FeatureName() {
		return (EAttribute)terminalItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminalItem_Terminal() {
		return (EReference)terminalItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonTerminalItem() {
		return nonTerminalItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonTerminalItem_NonTerminal() {
		return (EAttribute)nonTerminalItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPush() {
		return pushEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPush_EclassURI() {
		return (EAttribute)pushEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPush_Featue() {
		return (EAttribute)pushEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPop() {
		return popEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntaxFactory getSyntaxFactory() {
		return (SyntaxFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		syntaxModelEClass = createEClass(SYNTAX_MODEL);
		createEReference(syntaxModelEClass, SYNTAX_MODEL__TERMINALS);
		createEReference(syntaxModelEClass, SYNTAX_MODEL__RULES);
		createEAttribute(syntaxModelEClass, SYNTAX_MODEL__START_ITEM);
		createEReference(syntaxModelEClass, SYNTAX_MODEL__IMPORT);

		terminalEClass = createEClass(TERMINAL);
		createEAttribute(terminalEClass, TERMINAL__REGEX);
		createEAttribute(terminalEClass, TERMINAL__HIDE);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NON_TERMINAL);
		createEReference(ruleEClass, RULE__BODY);

		ruleItemEClass = createEClass(RULE_ITEM);

		syntaxItemEClass = createEClass(SYNTAX_ITEM);
		createEAttribute(syntaxItemEClass, SYNTAX_ITEM__OPTIONAL);
		createEAttribute(syntaxItemEClass, SYNTAX_ITEM__MANY);

		terminalItemEClass = createEClass(TERMINAL_ITEM);
		createEAttribute(terminalItemEClass, TERMINAL_ITEM__FEATURE_NAME);
		createEReference(terminalItemEClass, TERMINAL_ITEM__TERMINAL);

		nonTerminalItemEClass = createEClass(NON_TERMINAL_ITEM);
		createEAttribute(nonTerminalItemEClass, NON_TERMINAL_ITEM__NON_TERMINAL);

		pushEClass = createEClass(PUSH);
		createEAttribute(pushEClass, PUSH__ECLASS_URI);
		createEAttribute(pushEClass, PUSH__FEATUE);

		popEClass = createEClass(POP);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		syntaxModelEClass.getESuperTypes().add(theInfrastructurePackage.getRootElement());
		terminalEClass.getESuperTypes().add(theInfrastructurePackage.getNamedElement());
		ruleEClass.getESuperTypes().add(theInfrastructurePackage.getMODembedElement());
		ruleItemEClass.getESuperTypes().add(theInfrastructurePackage.getMODembedElement());
		syntaxItemEClass.getESuperTypes().add(this.getRuleItem());
		terminalItemEClass.getESuperTypes().add(this.getSyntaxItem());
		nonTerminalItemEClass.getESuperTypes().add(this.getSyntaxItem());
		pushEClass.getESuperTypes().add(this.getRuleItem());
		popEClass.getESuperTypes().add(this.getRuleItem());

		// Initialize classes and features; add operations and parameters
		initEClass(syntaxModelEClass, SyntaxModel.class, "SyntaxModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSyntaxModel_Terminals(), this.getTerminal(), null, "terminals", null, 0, -1, SyntaxModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSyntaxModel_Rules(), this.getRule(), null, "rules", null, 0, -1, SyntaxModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSyntaxModel_StartItem(), ecorePackage.getEString(), "startItem", null, 1, 1, SyntaxModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSyntaxModel_Import(), this.getSyntaxModel(), null, "import", null, 0, -1, SyntaxModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTerminal_Regex(), ecorePackage.getEString(), "regex", null, 1, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTerminal_Hide(), ecorePackage.getEBoolean(), "hide", null, 0, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_NonTerminal(), ecorePackage.getEString(), "nonTerminal", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Body(), this.getRuleItem(), null, "body", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleItemEClass, RuleItem.class, "RuleItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(syntaxItemEClass, SyntaxItem.class, "SyntaxItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSyntaxItem_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, SyntaxItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSyntaxItem_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, SyntaxItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalItemEClass, TerminalItem.class, "TerminalItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTerminalItem_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, TerminalItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminalItem_Terminal(), this.getTerminal(), null, "terminal", null, 1, 1, TerminalItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonTerminalItemEClass, NonTerminalItem.class, "NonTerminalItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonTerminalItem_NonTerminal(), ecorePackage.getEString(), "nonTerminal", null, 1, 1, NonTerminalItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushEClass, Push.class, "Push", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPush_EclassURI(), ecorePackage.getEString(), "eclassURI", null, 1, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPush_Featue(), ecorePackage.getEString(), "featue", null, 0, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(popEClass, Pop.class, "Pop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SyntaxPackageImpl
