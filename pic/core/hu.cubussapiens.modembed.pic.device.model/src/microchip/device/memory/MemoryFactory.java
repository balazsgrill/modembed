/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see microchip.device.memory.MemoryPackage
 * @generated
 */
public interface MemoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MemoryFactory eINSTANCE = microchip.device.memory.impl.MemoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Programming</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programming</em>'.
	 * @generated
	 */
	Programming createProgramming();

	/**
	 * Returns a new object of class '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait</em>'.
	 * @generated
	 */
	Wait createWait();

	/**
	 * Returns a new object of class '<em>Latches</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Latches</em>'.
	 * @generated
	 */
	Latches createLatches();

	/**
	 * Returns a new object of class '<em>Mem Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mem Region</em>'.
	 * @generated
	 */
	MemRegion createMemRegion();

	/**
	 * Returns a new object of class '<em>Dev ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dev ID</em>'.
	 * @generated
	 */
	DevID createDevID();

	/**
	 * Returns a new object of class '<em>SFR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SFR</em>'.
	 * @generated
	 */
	SFR createSFR();

	/**
	 * Returns a new object of class '<em>Reset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset</em>'.
	 * @generated
	 */
	Reset createReset();

	/**
	 * Returns a new object of class '<em>Bit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit</em>'.
	 * @generated
	 */
	Bit createBit();

	/**
	 * Returns a new object of class '<em>Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stimulus</em>'.
	 * @generated
	 */
	Stimulus createStimulus();

	/**
	 * Returns a new object of class '<em>Mirror Regs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mirror Regs</em>'.
	 * @generated
	 */
	MirrorRegs createMirrorRegs();

	/**
	 * Returns a new object of class '<em>Unused Regs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unused Regs</em>'.
	 * @generated
	 */
	UnusedRegs createUnusedRegs();

	/**
	 * Returns a new object of class '<em>QBit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QBit</em>'.
	 * @generated
	 */
	QBit createQBit();

	/**
	 * Returns a new object of class '<em>Breakpoints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Breakpoints</em>'.
	 * @generated
	 */
	Breakpoints createBreakpoints();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MemoryPackage getMemoryPackage();

} //MemoryFactory
