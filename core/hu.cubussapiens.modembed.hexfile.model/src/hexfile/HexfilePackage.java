/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hexfile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see hexfile.HexfileFactory
 * @model kind="package"
 * @generated
 */
public interface HexfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hexfile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hexfile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hexfile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HexfilePackage eINSTANCE = hexfile.impl.HexfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link hexfile.impl.HexFileImpl <em>Hex File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hexfile.impl.HexFileImpl
	 * @see hexfile.impl.HexfilePackageImpl#getHexFile()
	 * @generated
	 */
	int HEX_FILE = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_FILE__ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_FILE__ADDRESS_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Hex File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_FILE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hexfile.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hexfile.impl.EntryImpl
	 * @see hexfile.impl.HexfilePackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__DATA = 1;

	/**
	 * The feature id for the '<em><b>Blocksize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__BLOCKSIZE = 2;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hexfile.AddressType <em>Address Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hexfile.AddressType
	 * @see hexfile.impl.HexfilePackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link hexfile.HexFile <em>Hex File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hex File</em>'.
	 * @see hexfile.HexFile
	 * @generated
	 */
	EClass getHexFile();

	/**
	 * Returns the meta object for the containment reference list '{@link hexfile.HexFile#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see hexfile.HexFile#getEntries()
	 * @see #getHexFile()
	 * @generated
	 */
	EReference getHexFile_Entries();

	/**
	 * Returns the meta object for the attribute '{@link hexfile.HexFile#getAddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Type</em>'.
	 * @see hexfile.HexFile#getAddressType()
	 * @see #getHexFile()
	 * @generated
	 */
	EAttribute getHexFile_AddressType();

	/**
	 * Returns the meta object for class '{@link hexfile.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see hexfile.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link hexfile.Entry#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see hexfile.Entry#getAddress()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Address();

	/**
	 * Returns the meta object for the attribute '{@link hexfile.Entry#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see hexfile.Entry#getData()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Data();

	/**
	 * Returns the meta object for the attribute '{@link hexfile.Entry#getBlocksize <em>Blocksize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocksize</em>'.
	 * @see hexfile.Entry#getBlocksize()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Blocksize();

	/**
	 * Returns the meta object for enum '{@link hexfile.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Address Type</em>'.
	 * @see hexfile.AddressType
	 * @generated
	 */
	EEnum getAddressType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HexfileFactory getHexfileFactory();

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
		 * The meta object literal for the '{@link hexfile.impl.HexFileImpl <em>Hex File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hexfile.impl.HexFileImpl
		 * @see hexfile.impl.HexfilePackageImpl#getHexFile()
		 * @generated
		 */
		EClass HEX_FILE = eINSTANCE.getHexFile();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEX_FILE__ENTRIES = eINSTANCE.getHexFile_Entries();

		/**
		 * The meta object literal for the '<em><b>Address Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEX_FILE__ADDRESS_TYPE = eINSTANCE.getHexFile_AddressType();

		/**
		 * The meta object literal for the '{@link hexfile.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hexfile.impl.EntryImpl
		 * @see hexfile.impl.HexfilePackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__ADDRESS = eINSTANCE.getEntry_Address();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__DATA = eINSTANCE.getEntry_Data();

		/**
		 * The meta object literal for the '<em><b>Blocksize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__BLOCKSIZE = eINSTANCE.getEntry_Blocksize();

		/**
		 * The meta object literal for the '{@link hexfile.AddressType <em>Address Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hexfile.AddressType
		 * @see hexfile.impl.HexfilePackageImpl#getAddressType()
		 * @generated
		 */
		EEnum ADDRESS_TYPE = eINSTANCE.getAddressType();

	}

} //HexfilePackage
