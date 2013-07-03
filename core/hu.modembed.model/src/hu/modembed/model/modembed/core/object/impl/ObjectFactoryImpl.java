/**
 */
package hu.modembed.model.modembed.core.object.impl;

import hu.modembed.model.modembed.core.object.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectFactoryImpl extends EFactoryImpl implements ObjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectFactory init() {
		try {
			ObjectFactory theObjectFactory = (ObjectFactory)EPackage.Registry.INSTANCE.getEFactory(ObjectPackage.eNS_URI);
			if (theObjectFactory != null) {
				return theObjectFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ObjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ObjectPackage.ASSEMBLER_OBJECT: return createAssemblerObject();
			case ObjectPackage.INSTRUCTION_CALL: return createInstructionCall();
			case ObjectPackage.INSTRUCTION_CALL_PARAMETER: return createInstructionCallParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblerObject createAssemblerObject() {
		AssemblerObjectImpl assemblerObject = new AssemblerObjectImpl();
		return assemblerObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionCall createInstructionCall() {
		InstructionCallImpl instructionCall = new InstructionCallImpl();
		return instructionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionCallParameter createInstructionCallParameter() {
		InstructionCallParameterImpl instructionCallParameter = new InstructionCallParameterImpl();
		return instructionCallParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPackage getObjectPackage() {
		return (ObjectPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ObjectPackage getPackage() {
		return ObjectPackage.eINSTANCE;
	}

} //ObjectFactoryImpl
