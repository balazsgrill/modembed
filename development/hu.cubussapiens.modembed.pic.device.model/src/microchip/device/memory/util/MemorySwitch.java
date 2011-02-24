/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory.util;

import java.util.List;

import microchip.device.generic.IntRange;
import microchip.device.memory.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see microchip.device.memory.MemoryPackage
 * @generated
 */
public class MemorySwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MemoryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemorySwitch() {
		if (modelPackage == null) {
			modelPackage = MemoryPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MemoryPackage.PROGRAMMING: {
				Programming programming = (Programming)theEObject;
				T result = caseProgramming(programming);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MemoryPackage.WAIT: {
				Wait wait = (Wait)theEObject;
				T result = caseWait(wait);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MemoryPackage.LATCHES: {
				Latches latches = (Latches)theEObject;
				T result = caseLatches(latches);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MemoryPackage.MEM_REGION: {
				MemRegion memRegion = (MemRegion)theEObject;
				T result = caseMemRegion(memRegion);
				if (result == null) result = caseIntRange(memRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MemoryPackage.DEV_ID: {
				DevID devID = (DevID)theEObject;
				T result = caseDevID(devID);
				if (result == null) result = caseMemRegion(devID);
				if (result == null) result = caseIntRange(devID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MemoryPackage.SFR: {
				SFR sfr = (SFR)theEObject;
				T result = caseSFR(sfr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MemoryPackage.RESET: {
				Reset reset = (Reset)theEObject;
				T result = caseReset(reset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MemoryPackage.BIT: {
				Bit bit = (Bit)theEObject;
				T result = caseBit(bit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MemoryPackage.STIMULUS: {
				Stimulus stimulus = (Stimulus)theEObject;
				T result = caseStimulus(stimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MemoryPackage.MIRROR_REGS: {
				MirrorRegs mirrorRegs = (MirrorRegs)theEObject;
				T result = caseMirrorRegs(mirrorRegs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MemoryPackage.UNUSED_REGS: {
				UnusedRegs unusedRegs = (UnusedRegs)theEObject;
				T result = caseUnusedRegs(unusedRegs);
				if (result == null) result = caseMemRegion(unusedRegs);
				if (result == null) result = caseIntRange(unusedRegs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MemoryPackage.QBIT: {
				QBit qBit = (QBit)theEObject;
				T result = caseQBit(qBit);
				if (result == null) result = caseBit(qBit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MemoryPackage.BREAKPOINTS: {
				Breakpoints breakpoints = (Breakpoints)theEObject;
				T result = caseBreakpoints(breakpoints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Programming</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Programming</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramming(Programming object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWait(Wait object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatches(Latches object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mem Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mem Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemRegion(MemRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dev ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dev ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevID(DevID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFR(SFR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReset(Reset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBit(Bit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStimulus(Stimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mirror Regs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mirror Regs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMirrorRegs(MirrorRegs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unused Regs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unused Regs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnusedRegs(UnusedRegs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QBit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QBit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQBit(QBit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breakpoints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breakpoints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakpoints(Breakpoints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntRange(IntRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //MemorySwitch
