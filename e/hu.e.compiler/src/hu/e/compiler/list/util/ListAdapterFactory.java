/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list.util;

import hu.e.compiler.list.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.e.compiler.list.ListPackage
 * @generated
 */
public class ListAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ListPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ListPackage.eINSTANCE;
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
	protected ListSwitch<Adapter> modelSwitch =
		new ListSwitch<Adapter>() {
			@Override
			public Adapter caseProgramList(ProgramList object) {
				return createProgramListAdapter();
			}
			@Override
			public Adapter caseProgramStep(ProgramStep object) {
				return createProgramStepAdapter();
			}
			@Override
			public Adapter caseInstructionStep(InstructionStep object) {
				return createInstructionStepAdapter();
			}
			@Override
			public Adapter caseSequenceStep(SequenceStep object) {
				return createSequenceStepAdapter();
			}
			@Override
			public Adapter caseChoiceStep(ChoiceStep object) {
				return createChoiceStepAdapter();
			}
			@Override
			public Adapter caseLabelStep(LabelStep object) {
				return createLabelStepAdapter();
			}
			@Override
			public Adapter caseLabelReference(LabelReference object) {
				return createLabelReferenceAdapter();
			}
			@Override
			public Adapter caseStatusStep(StatusStep object) {
				return createStatusStepAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.e.compiler.list.ProgramList <em>Program List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.e.compiler.list.ProgramList
	 * @generated
	 */
	public Adapter createProgramListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.e.compiler.list.ProgramStep <em>Program Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.e.compiler.list.ProgramStep
	 * @generated
	 */
	public Adapter createProgramStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.e.compiler.list.InstructionStep <em>Instruction Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.e.compiler.list.InstructionStep
	 * @generated
	 */
	public Adapter createInstructionStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.e.compiler.list.SequenceStep <em>Sequence Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.e.compiler.list.SequenceStep
	 * @generated
	 */
	public Adapter createSequenceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.e.compiler.list.ChoiceStep <em>Choice Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.e.compiler.list.ChoiceStep
	 * @generated
	 */
	public Adapter createChoiceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.e.compiler.list.LabelStep <em>Label Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.e.compiler.list.LabelStep
	 * @generated
	 */
	public Adapter createLabelStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.e.compiler.list.LabelReference <em>Label Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.e.compiler.list.LabelReference
	 * @generated
	 */
	public Adapter createLabelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.e.compiler.list.StatusStep <em>Status Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.e.compiler.list.StatusStep
	 * @generated
	 */
	public Adapter createStatusStepAdapter() {
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

} //ListAdapterFactory
