/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory.util;

import microchip.device.generic.IntRange;
import microchip.device.memory.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see microchip.device.memory.MemoryPackage
 * @generated
 */
public class MemoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MemoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MemoryPackage.eINSTANCE;
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
	protected MemorySwitch<Adapter> modelSwitch =
		new MemorySwitch<Adapter>() {
			@Override
			public Adapter caseProgramming(Programming object) {
				return createProgrammingAdapter();
			}
			@Override
			public Adapter caseWait(Wait object) {
				return createWaitAdapter();
			}
			@Override
			public Adapter caseLatches(Latches object) {
				return createLatchesAdapter();
			}
			@Override
			public Adapter caseMemRegion(MemRegion object) {
				return createMemRegionAdapter();
			}
			@Override
			public Adapter caseDevID(DevID object) {
				return createDevIDAdapter();
			}
			@Override
			public Adapter caseSFR(SFR object) {
				return createSFRAdapter();
			}
			@Override
			public Adapter caseReset(Reset object) {
				return createResetAdapter();
			}
			@Override
			public Adapter caseBit(Bit object) {
				return createBitAdapter();
			}
			@Override
			public Adapter caseStimulus(Stimulus object) {
				return createStimulusAdapter();
			}
			@Override
			public Adapter caseMirrorRegs(MirrorRegs object) {
				return createMirrorRegsAdapter();
			}
			@Override
			public Adapter caseUnusedRegs(UnusedRegs object) {
				return createUnusedRegsAdapter();
			}
			@Override
			public Adapter caseQBit(QBit object) {
				return createQBitAdapter();
			}
			@Override
			public Adapter caseBreakpoints(Breakpoints object) {
				return createBreakpointsAdapter();
			}
			@Override
			public Adapter caseIntRange(IntRange object) {
				return createIntRangeAdapter();
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
	 * Creates a new adapter for an object of class '{@link microchip.device.memory.Programming <em>Programming</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.memory.Programming
	 * @generated
	 */
	public Adapter createProgrammingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microchip.device.memory.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.memory.Wait
	 * @generated
	 */
	public Adapter createWaitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microchip.device.memory.Latches <em>Latches</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.memory.Latches
	 * @generated
	 */
	public Adapter createLatchesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microchip.device.memory.MemRegion <em>Mem Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.memory.MemRegion
	 * @generated
	 */
	public Adapter createMemRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microchip.device.memory.DevID <em>Dev ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.memory.DevID
	 * @generated
	 */
	public Adapter createDevIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microchip.device.memory.SFR <em>SFR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.memory.SFR
	 * @generated
	 */
	public Adapter createSFRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microchip.device.memory.Reset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.memory.Reset
	 * @generated
	 */
	public Adapter createResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microchip.device.memory.Bit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.memory.Bit
	 * @generated
	 */
	public Adapter createBitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microchip.device.memory.Stimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.memory.Stimulus
	 * @generated
	 */
	public Adapter createStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microchip.device.memory.MirrorRegs <em>Mirror Regs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.memory.MirrorRegs
	 * @generated
	 */
	public Adapter createMirrorRegsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microchip.device.memory.UnusedRegs <em>Unused Regs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.memory.UnusedRegs
	 * @generated
	 */
	public Adapter createUnusedRegsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microchip.device.memory.QBit <em>QBit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.memory.QBit
	 * @generated
	 */
	public Adapter createQBitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microchip.device.memory.Breakpoints <em>Breakpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.memory.Breakpoints
	 * @generated
	 */
	public Adapter createBreakpointsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microchip.device.generic.IntRange <em>Int Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microchip.device.generic.IntRange
	 * @generated
	 */
	public Adapter createIntRangeAdapter() {
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

} //MemoryAdapterFactory
