/**
 */
package hu.modembed.model.emodel.types.util;

import hu.modembed.model.core.MODembedElement;
import hu.modembed.model.core.NamedElement;

import hu.modembed.model.emodel.types.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.emodel.types.TypesPackage
 * @generated
 */
public class TypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesSwitch<Adapter> modelSwitch =
		new TypesSwitch<Adapter>() {
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeDefinition(PrimitiveTypeDefinition object) {
				return createPrimitiveTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseCompositeTypeDefinition(CompositeTypeDefinition object) {
				return createCompositeTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseUnsignedTypeDefinition(UnsignedTypeDefinition object) {
				return createUnsignedTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseReferenceTypeDefinition(ReferenceTypeDefinition object) {
				return createReferenceTypeDefinitionAdapter();
			}
			@Override
			public Adapter casePointerTypeDefinition(PointerTypeDefinition object) {
				return createPointerTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseArrayDefinition(ArrayDefinition object) {
				return createArrayDefinitionAdapter();
			}
			@Override
			public Adapter caseStructureTypeDefinition(StructureTypeDefinition object) {
				return createStructureTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseStructureTypeElement(StructureTypeElement object) {
				return createStructureTypeElementAdapter();
			}
			@Override
			public Adapter caseCodeLabelTypeDefinition(CodeLabelTypeDefinition object) {
				return createCodeLabelTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseMODembedElement(MODembedElement object) {
				return createMODembedElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.emodel.types.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.emodel.types.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.emodel.types.PrimitiveTypeDefinition <em>Primitive Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.emodel.types.PrimitiveTypeDefinition
	 * @generated
	 */
	public Adapter createPrimitiveTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.emodel.types.CompositeTypeDefinition <em>Composite Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.emodel.types.CompositeTypeDefinition
	 * @generated
	 */
	public Adapter createCompositeTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.emodel.types.UnsignedTypeDefinition <em>Unsigned Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.emodel.types.UnsignedTypeDefinition
	 * @generated
	 */
	public Adapter createUnsignedTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.emodel.types.ReferenceTypeDefinition <em>Reference Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.emodel.types.ReferenceTypeDefinition
	 * @generated
	 */
	public Adapter createReferenceTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.emodel.types.PointerTypeDefinition <em>Pointer Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.emodel.types.PointerTypeDefinition
	 * @generated
	 */
	public Adapter createPointerTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.emodel.types.ArrayDefinition <em>Array Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.emodel.types.ArrayDefinition
	 * @generated
	 */
	public Adapter createArrayDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.emodel.types.StructureTypeDefinition <em>Structure Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.emodel.types.StructureTypeDefinition
	 * @generated
	 */
	public Adapter createStructureTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.emodel.types.StructureTypeElement <em>Structure Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.emodel.types.StructureTypeElement
	 * @generated
	 */
	public Adapter createStructureTypeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.emodel.types.CodeLabelTypeDefinition <em>Code Label Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.emodel.types.CodeLabelTypeDefinition
	 * @generated
	 */
	public Adapter createCodeLabelTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.core.MODembedElement <em>MO Dembed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.core.MODembedElement
	 * @generated
	 */
	public Adapter createMODembedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TypesAdapterFactory
