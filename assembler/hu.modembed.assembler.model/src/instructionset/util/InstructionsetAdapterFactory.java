/**
 */
package instructionset.util;

import instructionset.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see instructionset.InstructionsetPackage
 * @generated
 */
public class InstructionsetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstructionsetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InstructionsetPackage.eINSTANCE;
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
	protected InstructionsetSwitch<Adapter> modelSwitch =
		new InstructionsetSwitch<Adapter>() {
			@Override
			public Adapter caseInstructionSet(InstructionSet object) {
				return createInstructionSetAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseInstructionParameter(InstructionParameter object) {
				return createInstructionParameterAdapter();
			}
			@Override
			public Adapter caseInstructionWord(InstructionWord object) {
				return createInstructionWordAdapter();
			}
			@Override
			public Adapter caseInstructionSection(InstructionSection object) {
				return createInstructionSectionAdapter();
			}
			@Override
			public Adapter caseParameterSection(ParameterSection object) {
				return createParameterSectionAdapter();
			}
			@Override
			public Adapter caseConstantSection(ConstantSection object) {
				return createConstantSectionAdapter();
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
	 * Creates a new adapter for an object of class '{@link instructionset.InstructionSet <em>Instruction Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instructionset.InstructionSet
	 * @generated
	 */
	public Adapter createInstructionSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instructionset.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instructionset.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instructionset.InstructionParameter <em>Instruction Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instructionset.InstructionParameter
	 * @generated
	 */
	public Adapter createInstructionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instructionset.InstructionWord <em>Instruction Word</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instructionset.InstructionWord
	 * @generated
	 */
	public Adapter createInstructionWordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instructionset.InstructionSection <em>Instruction Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instructionset.InstructionSection
	 * @generated
	 */
	public Adapter createInstructionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instructionset.ParameterSection <em>Parameter Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instructionset.ParameterSection
	 * @generated
	 */
	public Adapter createParameterSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instructionset.ConstantSection <em>Constant Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instructionset.ConstantSection
	 * @generated
	 */
	public Adapter createConstantSectionAdapter() {
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

} //InstructionsetAdapterFactory
