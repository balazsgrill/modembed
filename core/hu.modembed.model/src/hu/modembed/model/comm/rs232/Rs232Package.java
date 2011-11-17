/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.comm.rs232;

import hu.modembed.model.comm.CommPackage;

import hu.modembed.model.core.CorePackage;
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
 * @see hu.modembed.model.comm.rs232.Rs232Factory
 * @model kind="package"
 * @generated
 */
public interface Rs232Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rs232";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/comm/rs232";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commrs232";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Rs232Package eINSTANCE = hu.modembed.model.comm.rs232.impl.Rs232PackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.comm.rs232.impl.RS232FrameImpl <em>RS232 Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.comm.rs232.impl.RS232FrameImpl
	 * @see hu.modembed.model.comm.rs232.impl.Rs232PackageImpl#getRS232Frame()
	 * @generated
	 */
	int RS232_FRAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_FRAME__NAME = CommPackage.FRAME__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_FRAME__NUM_OF_BYTES = CommPackage.FRAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_FRAME__FIELDS = CommPackage.FRAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_FRAME__ID = CommPackage.FRAME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RS232 Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_FRAME_FEATURE_COUNT = CommPackage.FRAME_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.modembed.model.comm.rs232.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.comm.rs232.impl.FieldImpl
	 * @see hu.modembed.model.comm.rs232.impl.Rs232PackageImpl#getField()
	 * @generated
	 */
	int FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__START = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__LENGTH = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.comm.rs232.impl.RS232ProtocolImpl <em>RS232 Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.comm.rs232.impl.RS232ProtocolImpl
	 * @see hu.modembed.model.comm.rs232.impl.Rs232PackageImpl#getRS232Protocol()
	 * @generated
	 */
	int RS232_PROTOCOL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_PROTOCOL__NAME = CommPackage.COMMUNICATION_PROTOCOL__NAME;

	/**
	 * The feature id for the '<em><b>Frames</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_PROTOCOL__FRAMES = CommPackage.COMMUNICATION_PROTOCOL__FRAMES;

	/**
	 * The feature id for the '<em><b>Id Bit Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_PROTOCOL__ID_BIT_LENGTH = CommPackage.COMMUNICATION_PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RS232 Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_PROTOCOL_FEATURE_COUNT = CommPackage.COMMUNICATION_PROTOCOL_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.comm.rs232.RS232Frame <em>RS232 Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RS232 Frame</em>'.
	 * @see hu.modembed.model.comm.rs232.RS232Frame
	 * @generated
	 */
	EClass getRS232Frame();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.comm.rs232.RS232Frame#getNumOfBytes <em>Num Of Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Bytes</em>'.
	 * @see hu.modembed.model.comm.rs232.RS232Frame#getNumOfBytes()
	 * @see #getRS232Frame()
	 * @generated
	 */
	EAttribute getRS232Frame_NumOfBytes();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.comm.rs232.RS232Frame#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see hu.modembed.model.comm.rs232.RS232Frame#getFields()
	 * @see #getRS232Frame()
	 * @generated
	 */
	EReference getRS232Frame_Fields();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.comm.rs232.RS232Frame#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.modembed.model.comm.rs232.RS232Frame#getId()
	 * @see #getRS232Frame()
	 * @generated
	 */
	EAttribute getRS232Frame_Id();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.comm.rs232.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see hu.modembed.model.comm.rs232.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.comm.rs232.Field#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see hu.modembed.model.comm.rs232.Field#getStart()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Start();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.comm.rs232.Field#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see hu.modembed.model.comm.rs232.Field#getLength()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Length();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.comm.rs232.RS232Protocol <em>RS232 Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RS232 Protocol</em>'.
	 * @see hu.modembed.model.comm.rs232.RS232Protocol
	 * @generated
	 */
	EClass getRS232Protocol();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.comm.rs232.RS232Protocol#getIdBitLength <em>Id Bit Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Bit Length</em>'.
	 * @see hu.modembed.model.comm.rs232.RS232Protocol#getIdBitLength()
	 * @see #getRS232Protocol()
	 * @generated
	 */
	EAttribute getRS232Protocol_IdBitLength();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Rs232Factory getRs232Factory();

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
		 * The meta object literal for the '{@link hu.modembed.model.comm.rs232.impl.RS232FrameImpl <em>RS232 Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.comm.rs232.impl.RS232FrameImpl
		 * @see hu.modembed.model.comm.rs232.impl.Rs232PackageImpl#getRS232Frame()
		 * @generated
		 */
		EClass RS232_FRAME = eINSTANCE.getRS232Frame();

		/**
		 * The meta object literal for the '<em><b>Num Of Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RS232_FRAME__NUM_OF_BYTES = eINSTANCE.getRS232Frame_NumOfBytes();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RS232_FRAME__FIELDS = eINSTANCE.getRS232Frame_Fields();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RS232_FRAME__ID = eINSTANCE.getRS232Frame_Id();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.comm.rs232.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.comm.rs232.impl.FieldImpl
		 * @see hu.modembed.model.comm.rs232.impl.Rs232PackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__START = eINSTANCE.getField_Start();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__LENGTH = eINSTANCE.getField_Length();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.comm.rs232.impl.RS232ProtocolImpl <em>RS232 Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.comm.rs232.impl.RS232ProtocolImpl
		 * @see hu.modembed.model.comm.rs232.impl.Rs232PackageImpl#getRS232Protocol()
		 * @generated
		 */
		EClass RS232_PROTOCOL = eINSTANCE.getRS232Protocol();

		/**
		 * The meta object literal for the '<em><b>Id Bit Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RS232_PROTOCOL__ID_BIT_LENGTH = eINSTANCE.getRS232Protocol_IdBitLength();

	}

} //Rs232Package
