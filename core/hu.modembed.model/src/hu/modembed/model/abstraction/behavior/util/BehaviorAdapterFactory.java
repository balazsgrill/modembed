/**
 */
package hu.modembed.model.abstraction.behavior.util;

import hu.modembed.model.abstraction.behavior.*;

import hu.modembed.model.core.MODembedElement;
import hu.modembed.model.core.NamedElement;
import hu.modembed.model.core.RootElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage
 * @generated
 */
public class BehaviorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BehaviorPackage.eINSTANCE;
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
	protected BehaviorSwitch<Adapter> modelSwitch =
		new BehaviorSwitch<Adapter>() {
			@Override
			public Adapter caseSequentialBehavior(SequentialBehavior object) {
				return createSequentialBehaviorAdapter();
			}
			@Override
			public Adapter caseSymbol(Symbol object) {
				return createSymbolAdapter();
			}
			@Override
			public Adapter caseSequentialAction(SequentialAction object) {
				return createSequentialActionAdapter();
			}
			@Override
			public Adapter caseCodeSymbolPlacement(CodeSymbolPlacement object) {
				return createCodeSymbolPlacementAdapter();
			}
			@Override
			public Adapter caseAtomicOperationExecution(AtomicOperationExecution object) {
				return createAtomicOperationExecutionAdapter();
			}
			@Override
			public Adapter caseBehaviorCall(BehaviorCall object) {
				return createBehaviorCallAdapter();
			}
			@Override
			public Adapter caseSymbolMapping(SymbolMapping object) {
				return createSymbolMappingAdapter();
			}
			@Override
			public Adapter caseSymbolValueMap(SymbolValueMap object) {
				return createSymbolValueMapAdapter();
			}
			@Override
			public Adapter caseSymbolValueAssignment(SymbolValueAssignment object) {
				return createSymbolValueAssignmentAdapter();
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
			public Adapter caseRootElement(RootElement object) {
				return createRootElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.abstraction.behavior.SequentialBehavior <em>Sequential Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.abstraction.behavior.SequentialBehavior
	 * @generated
	 */
	public Adapter createSequentialBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.abstraction.behavior.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.abstraction.behavior.Symbol
	 * @generated
	 */
	public Adapter createSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.abstraction.behavior.SequentialAction <em>Sequential Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.abstraction.behavior.SequentialAction
	 * @generated
	 */
	public Adapter createSequentialActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.abstraction.behavior.CodeSymbolPlacement <em>Code Symbol Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.abstraction.behavior.CodeSymbolPlacement
	 * @generated
	 */
	public Adapter createCodeSymbolPlacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.abstraction.behavior.AtomicOperationExecution <em>Atomic Operation Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.abstraction.behavior.AtomicOperationExecution
	 * @generated
	 */
	public Adapter createAtomicOperationExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.abstraction.behavior.BehaviorCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.abstraction.behavior.BehaviorCall
	 * @generated
	 */
	public Adapter createBehaviorCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.abstraction.behavior.SymbolMapping <em>Symbol Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.abstraction.behavior.SymbolMapping
	 * @generated
	 */
	public Adapter createSymbolMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.abstraction.behavior.SymbolValueMap <em>Symbol Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.abstraction.behavior.SymbolValueMap
	 * @generated
	 */
	public Adapter createSymbolValueMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.abstraction.behavior.SymbolValueAssignment <em>Symbol Value Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.abstraction.behavior.SymbolValueAssignment
	 * @generated
	 */
	public Adapter createSymbolValueAssignmentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.core.RootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.core.RootElement
	 * @generated
	 */
	public Adapter createRootElementAdapter() {
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

} //BehaviorAdapterFactory
