/**
 */
package hu.modembed.model.abstraction.types.impl;

import hu.modembed.model.abstraction.types.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesFactory init() {
		try {
			TypesFactory theTypesFactory = (TypesFactory)EPackage.Registry.INSTANCE.getEFactory("http://modembed.hu/abstraction/types"); 
			if (theTypesFactory != null) {
				return theTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TypesPackage.UNSIGNED_TYPE_DEFINITION: return createUnsignedTypeDefinition();
			case TypesPackage.REFERENCE_TYPE_DEFINITION: return createReferenceTypeDefinition();
			case TypesPackage.POINTER_TYPE_DEFINITION: return createPointerTypeDefinition();
			case TypesPackage.ARRAY_DEFINITION: return createArrayDefinition();
			case TypesPackage.STRUCTURE_TYPE_DEFINITION: return createStructureTypeDefinition();
			case TypesPackage.STRUCTURE_TYPE_ELEMENT: return createStructureTypeElement();
			case TypesPackage.CODE_LABEL_TYPE_DEFINITION: return createCodeLabelTypeDefinition();
			case TypesPackage.TYPE: return createType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedTypeDefinition createUnsignedTypeDefinition() {
		UnsignedTypeDefinitionImpl unsignedTypeDefinition = new UnsignedTypeDefinitionImpl();
		return unsignedTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTypeDefinition createReferenceTypeDefinition() {
		ReferenceTypeDefinitionImpl referenceTypeDefinition = new ReferenceTypeDefinitionImpl();
		return referenceTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerTypeDefinition createPointerTypeDefinition() {
		PointerTypeDefinitionImpl pointerTypeDefinition = new PointerTypeDefinitionImpl();
		return pointerTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDefinition createArrayDefinition() {
		ArrayDefinitionImpl arrayDefinition = new ArrayDefinitionImpl();
		return arrayDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureTypeDefinition createStructureTypeDefinition() {
		StructureTypeDefinitionImpl structureTypeDefinition = new StructureTypeDefinitionImpl();
		return structureTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureTypeElement createStructureTypeElement() {
		StructureTypeElementImpl structureTypeElement = new StructureTypeElementImpl();
		return structureTypeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeLabelTypeDefinition createCodeLabelTypeDefinition() {
		CodeLabelTypeDefinitionImpl codeLabelTypeDefinition = new CodeLabelTypeDefinitionImpl();
		return codeLabelTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesPackage getTypesPackage() {
		return (TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypesPackage getPackage() {
		return TypesPackage.eINSTANCE;
	}

} //TypesFactoryImpl
