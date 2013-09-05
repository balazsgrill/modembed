/**
 */
package hu.modembed.model.modembed.infrastructure.impl;

import hu.modembed.model.modembed.abstraction.AbstractionPackage;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;

import hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl;

import hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage;

import hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl;

import hu.modembed.model.modembed.abstraction.impl.AbstractionPackageImpl;

import hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage;

import hu.modembed.model.modembed.abstraction.memorymodel.impl.MemorymodelPackageImpl;

import hu.modembed.model.modembed.abstraction.types.TypesPackage;

import hu.modembed.model.modembed.abstraction.types.impl.TypesPackageImpl;

import hu.modembed.model.modembed.application.ApplicationPackage;
import hu.modembed.model.modembed.application.impl.ApplicationPackageImpl;
import hu.modembed.model.modembed.core.instructionset.InstructionsetPackage;

import hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl;

import hu.modembed.model.modembed.core.object.ObjectPackage;

import hu.modembed.model.modembed.core.object.impl.ObjectPackageImpl;

import hu.modembed.model.modembed.infrastructure.Annotation;
import hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition;
import hu.modembed.model.modembed.infrastructure.AttributeDefinition;
import hu.modembed.model.modembed.infrastructure.AttributeValue;
import hu.modembed.model.modembed.infrastructure.AttributeValueContainer;
import hu.modembed.model.modembed.infrastructure.InfrastructureFactory;
import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;
import hu.modembed.model.modembed.infrastructure.MODembedElement;
import hu.modembed.model.modembed.infrastructure.NamedElement;
import hu.modembed.model.modembed.infrastructure.RootElement;

import hu.modembed.model.modembed.infrastructure.expressions.ExpressionsPackage;

import hu.modembed.model.modembed.infrastructure.expressions.impl.ExpressionsPackageImpl;

import hu.modembed.model.modembed.infrastructure.traceability.TraceabilityPackage;

import hu.modembed.model.modembed.infrastructure.traceability.impl.TraceabilityPackageImpl;

import hu.modembed.model.modembed.structured.StructuredPackage;

import hu.modembed.model.modembed.structured.impl.StructuredPackageImpl;

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
public class InfrastructurePackageImpl extends EPackageImpl implements InfrastructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moDembedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeContainerDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEClass = null;

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
	 * @see hu.modembed.model.modembed.infrastructure.InfrastructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfrastructurePackageImpl() {
		super(eNS_URI, InfrastructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InfrastructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InfrastructurePackage init() {
		if (isInited) return (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Obtain or create and register package
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfrastructurePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) : TraceabilityPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		InstructionsetPackageImpl theInstructionsetPackage = (InstructionsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstructionsetPackage.eNS_URI) instanceof InstructionsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstructionsetPackage.eNS_URI) : InstructionsetPackage.eINSTANCE);
		ObjectPackageImpl theObjectPackage = (ObjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) instanceof ObjectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) : ObjectPackage.eINSTANCE);
		AbstractionPackageImpl theAbstractionPackage = (AbstractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AbstractionPackage.eNS_URI) instanceof AbstractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AbstractionPackage.eNS_URI) : AbstractionPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		MemorymodelPackageImpl theMemorymodelPackage = (MemorymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MemorymodelPackage.eNS_URI) instanceof MemorymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MemorymodelPackage.eNS_URI) : MemorymodelPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);
		StructuredPackageImpl theStructuredPackage = (StructuredPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredPackage.eNS_URI) instanceof StructuredPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredPackage.eNS_URI) : StructuredPackage.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);

		// Create package meta-data objects
		theInfrastructurePackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theInstructionsetPackage.createPackageContents();
		theObjectPackage.createPackageContents();
		theAbstractionPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theMemorymodelPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		thePlatformPackage.createPackageContents();
		theStructuredPackage.createPackageContents();
		theApplicationPackage.createPackageContents();

		// Initialize created meta-data
		theInfrastructurePackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theInstructionsetPackage.initializePackageContents();
		theObjectPackage.initializePackageContents();
		theAbstractionPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theMemorymodelPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();
		theStructuredPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInfrastructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfrastructurePackage.eNS_URI, theInfrastructurePackage);
		return theInfrastructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMODembedElement() {
		return moDembedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMODembedElement_Description() {
		return (EAttribute)moDembedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODembedElement_Origins() {
		return (EReference)moDembedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODembedElement_Annotations() {
		return (EReference)moDembedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Key() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Value() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootElement() {
		return rootElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeContainerDefinition() {
		return attributeContainerDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeContainerDefinition_Attributes() {
		return (EReference)attributeContainerDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinition() {
		return attributeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueContainer() {
		return attributeValueContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueContainer_Definition() {
		return (EReference)attributeValueContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueContainer_Values() {
		return (EReference)attributeValueContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValue() {
		return attributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValue_Definition() {
		return (EReference)attributeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValue_Value() {
		return (EAttribute)attributeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureFactory getInfrastructureFactory() {
		return (InfrastructureFactory)getEFactoryInstance();
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
		moDembedElementEClass = createEClass(MO_DEMBED_ELEMENT);
		createEAttribute(moDembedElementEClass, MO_DEMBED_ELEMENT__DESCRIPTION);
		createEReference(moDembedElementEClass, MO_DEMBED_ELEMENT__ORIGINS);
		createEReference(moDembedElementEClass, MO_DEMBED_ELEMENT__ANNOTATIONS);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__KEY);
		createEAttribute(annotationEClass, ANNOTATION__VALUE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		rootElementEClass = createEClass(ROOT_ELEMENT);

		attributeContainerDefinitionEClass = createEClass(ATTRIBUTE_CONTAINER_DEFINITION);
		createEReference(attributeContainerDefinitionEClass, ATTRIBUTE_CONTAINER_DEFINITION__ATTRIBUTES);

		attributeDefinitionEClass = createEClass(ATTRIBUTE_DEFINITION);

		attributeValueContainerEClass = createEClass(ATTRIBUTE_VALUE_CONTAINER);
		createEReference(attributeValueContainerEClass, ATTRIBUTE_VALUE_CONTAINER__DEFINITION);
		createEReference(attributeValueContainerEClass, ATTRIBUTE_VALUE_CONTAINER__VALUES);

		attributeValueEClass = createEClass(ATTRIBUTE_VALUE);
		createEReference(attributeValueEClass, ATTRIBUTE_VALUE__DEFINITION);
		createEAttribute(attributeValueEClass, ATTRIBUTE_VALUE__VALUE);
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
		TraceabilityPackage theTraceabilityPackage = (TraceabilityPackage)EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTraceabilityPackage);
		getESubpackages().add(theExpressionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedElementEClass.getESuperTypes().add(this.getMODembedElement());
		rootElementEClass.getESuperTypes().add(this.getNamedElement());
		attributeContainerDefinitionEClass.getESuperTypes().add(this.getRootElement());
		attributeDefinitionEClass.getESuperTypes().add(this.getNamedElement());
		attributeValueContainerEClass.getESuperTypes().add(this.getRootElement());
		attributeValueEClass.getESuperTypes().add(this.getMODembedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(moDembedElementEClass, MODembedElement.class, "MODembedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMODembedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, MODembedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODembedElement_Origins(), theTraceabilityPackage.getOrigin(), null, "origins", null, 0, -1, MODembedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODembedElement_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, MODembedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Key(), ecorePackage.getEString(), "key", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Value(), ecorePackage.getEString(), "value", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootElementEClass, RootElement.class, "RootElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeContainerDefinitionEClass, AttributeContainerDefinition.class, "AttributeContainerDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeContainerDefinition_Attributes(), this.getAttributeDefinition(), null, "attributes", null, 0, -1, AttributeContainerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDefinitionEClass, AttributeDefinition.class, "AttributeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeValueContainerEClass, AttributeValueContainer.class, "AttributeValueContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueContainer_Definition(), this.getAttributeContainerDefinition(), null, "definition", null, 1, 1, AttributeValueContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeValueContainer_Values(), this.getAttributeValue(), null, "values", null, 0, -1, AttributeValueContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValue_Definition(), this.getAttributeDefinition(), null, "definition", null, 1, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeValue_Value(), ecorePackage.getELong(), "value", null, 0, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //InfrastructurePackageImpl
