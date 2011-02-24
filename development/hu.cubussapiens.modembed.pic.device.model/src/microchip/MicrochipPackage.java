/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see microchip.MicrochipFactory
 * @model kind="package"
 * @generated
 */
public interface MicrochipPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "microchip";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://microchip.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mcp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MicrochipPackage eINSTANCE = microchip.impl.MicrochipPackageImpl.init();

	/**
	 * The meta object id for the '{@link microchip.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.impl.DeviceImpl
	 * @see microchip.impl.MicrochipPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Vdd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__VDD = 1;

	/**
	 * The feature id for the '<em><b>Vpp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__VPP = 2;

	/**
	 * The feature id for the '<em><b>Cfgbits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CFGBITS = 3;

	/**
	 * The feature id for the '<em><b>Pgming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PGMING = 4;

	/**
	 * The feature id for the '<em><b>Pgmmem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PGMMEM = 5;

	/**
	 * The feature id for the '<em><b>Userid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__USERID = 6;

	/**
	 * The feature id for the '<em><b>Testmem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TESTMEM = 7;

	/**
	 * The feature id for the '<em><b>Devid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVID = 8;

	/**
	 * The feature id for the '<em><b>Cfgmem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CFGMEM = 9;

	/**
	 * The feature id for the '<em><b>Eedata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__EEDATA = 10;

	/**
	 * The feature id for the '<em><b>Bkbgvectmem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__BKBGVECTMEM = 11;

	/**
	 * The feature id for the '<em><b>Sfrs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__SFRS = 12;

	/**
	 * The feature id for the '<em><b>Num Banks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NUM_BANKS = 13;

	/**
	 * The feature id for the '<em><b>Num HWBP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NUM_HWBP = 14;

	/**
	 * The feature id for the '<em><b>Mirrors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__MIRRORS = 15;

	/**
	 * The feature id for the '<em><b>Unused</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__UNUSED = 16;

	/**
	 * The feature id for the '<em><b>Nmmrs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NMMRS = 17;

	/**
	 * The feature id for the '<em><b>Unused Bank Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__UNUSED_BANK_MASK = 18;

	/**
	 * The feature id for the '<em><b>Access Bank Split Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ACCESS_BANK_SPLIT_OFFSET = 19;

	/**
	 * The feature id for the '<em><b>Breakpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__BREAKPOINTS = 20;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 21;


	/**
	 * Returns the meta object for class '{@link microchip.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see microchip.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link microchip.Device#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see microchip.Device#getFormat()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Format();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.Device#getVdd <em>Vdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vdd</em>'.
	 * @see microchip.Device#getVdd()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Vdd();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.Device#getVpp <em>Vpp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vpp</em>'.
	 * @see microchip.Device#getVpp()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Vpp();

	/**
	 * Returns the meta object for the containment reference list '{@link microchip.Device#getCfgbits <em>Cfgbits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cfgbits</em>'.
	 * @see microchip.Device#getCfgbits()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Cfgbits();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.Device#getPgming <em>Pgming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pgming</em>'.
	 * @see microchip.Device#getPgming()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Pgming();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.Device#getPgmmem <em>Pgmmem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pgmmem</em>'.
	 * @see microchip.Device#getPgmmem()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Pgmmem();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.Device#getUserid <em>Userid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Userid</em>'.
	 * @see microchip.Device#getUserid()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Userid();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.Device#getTestmem <em>Testmem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Testmem</em>'.
	 * @see microchip.Device#getTestmem()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Testmem();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.Device#getDevid <em>Devid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devid</em>'.
	 * @see microchip.Device#getDevid()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Devid();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.Device#getCfgmem <em>Cfgmem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cfgmem</em>'.
	 * @see microchip.Device#getCfgmem()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Cfgmem();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.Device#getEedata <em>Eedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eedata</em>'.
	 * @see microchip.Device#getEedata()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Eedata();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.Device#getBkbgvectmem <em>Bkbgvectmem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bkbgvectmem</em>'.
	 * @see microchip.Device#getBkbgvectmem()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Bkbgvectmem();

	/**
	 * Returns the meta object for the containment reference list '{@link microchip.Device#getSfrs <em>Sfrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sfrs</em>'.
	 * @see microchip.Device#getSfrs()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Sfrs();

	/**
	 * Returns the meta object for the attribute '{@link microchip.Device#getNumBanks <em>Num Banks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Banks</em>'.
	 * @see microchip.Device#getNumBanks()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_NumBanks();

	/**
	 * Returns the meta object for the attribute '{@link microchip.Device#getNumHWBP <em>Num HWBP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num HWBP</em>'.
	 * @see microchip.Device#getNumHWBP()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_NumHWBP();

	/**
	 * Returns the meta object for the containment reference list '{@link microchip.Device#getMirrors <em>Mirrors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mirrors</em>'.
	 * @see microchip.Device#getMirrors()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Mirrors();

	/**
	 * Returns the meta object for the containment reference list '{@link microchip.Device#getUnused <em>Unused</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unused</em>'.
	 * @see microchip.Device#getUnused()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Unused();

	/**
	 * Returns the meta object for the containment reference list '{@link microchip.Device#getNmmrs <em>Nmmrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nmmrs</em>'.
	 * @see microchip.Device#getNmmrs()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Nmmrs();

	/**
	 * Returns the meta object for the attribute '{@link microchip.Device#getUnusedBankMask <em>Unused Bank Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unused Bank Mask</em>'.
	 * @see microchip.Device#getUnusedBankMask()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_UnusedBankMask();

	/**
	 * Returns the meta object for the attribute '{@link microchip.Device#getAccessBankSplitOffset <em>Access Bank Split Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Bank Split Offset</em>'.
	 * @see microchip.Device#getAccessBankSplitOffset()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_AccessBankSplitOffset();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.Device#getBreakpoints <em>Breakpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Breakpoints</em>'.
	 * @see microchip.Device#getBreakpoints()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Breakpoints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MicrochipFactory getMicrochipFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link microchip.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.impl.DeviceImpl
		 * @see microchip.impl.MicrochipPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__FORMAT = eINSTANCE.getDevice_Format();

		/**
		 * The meta object literal for the '<em><b>Vdd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__VDD = eINSTANCE.getDevice_Vdd();

		/**
		 * The meta object literal for the '<em><b>Vpp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__VPP = eINSTANCE.getDevice_Vpp();

		/**
		 * The meta object literal for the '<em><b>Cfgbits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__CFGBITS = eINSTANCE.getDevice_Cfgbits();

		/**
		 * The meta object literal for the '<em><b>Pgming</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__PGMING = eINSTANCE.getDevice_Pgming();

		/**
		 * The meta object literal for the '<em><b>Pgmmem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__PGMMEM = eINSTANCE.getDevice_Pgmmem();

		/**
		 * The meta object literal for the '<em><b>Userid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__USERID = eINSTANCE.getDevice_Userid();

		/**
		 * The meta object literal for the '<em><b>Testmem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__TESTMEM = eINSTANCE.getDevice_Testmem();

		/**
		 * The meta object literal for the '<em><b>Devid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__DEVID = eINSTANCE.getDevice_Devid();

		/**
		 * The meta object literal for the '<em><b>Cfgmem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__CFGMEM = eINSTANCE.getDevice_Cfgmem();

		/**
		 * The meta object literal for the '<em><b>Eedata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__EEDATA = eINSTANCE.getDevice_Eedata();

		/**
		 * The meta object literal for the '<em><b>Bkbgvectmem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__BKBGVECTMEM = eINSTANCE.getDevice_Bkbgvectmem();

		/**
		 * The meta object literal for the '<em><b>Sfrs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__SFRS = eINSTANCE.getDevice_Sfrs();

		/**
		 * The meta object literal for the '<em><b>Num Banks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NUM_BANKS = eINSTANCE.getDevice_NumBanks();

		/**
		 * The meta object literal for the '<em><b>Num HWBP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NUM_HWBP = eINSTANCE.getDevice_NumHWBP();

		/**
		 * The meta object literal for the '<em><b>Mirrors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__MIRRORS = eINSTANCE.getDevice_Mirrors();

		/**
		 * The meta object literal for the '<em><b>Unused</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__UNUSED = eINSTANCE.getDevice_Unused();

		/**
		 * The meta object literal for the '<em><b>Nmmrs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__NMMRS = eINSTANCE.getDevice_Nmmrs();

		/**
		 * The meta object literal for the '<em><b>Unused Bank Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__UNUSED_BANK_MASK = eINSTANCE.getDevice_UnusedBankMask();

		/**
		 * The meta object literal for the '<em><b>Access Bank Split Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__ACCESS_BANK_SPLIT_OFFSET = eINSTANCE.getDevice_AccessBankSplitOffset();

		/**
		 * The meta object literal for the '<em><b>Breakpoints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__BREAKPOINTS = eINSTANCE.getDevice_Breakpoints();

	}

} //MicrochipPackage
