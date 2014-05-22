/**
 */
package hu.modembed.assembler.code.impl;

import hu.modembed.assembler.code.*;

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
public class CodeFactoryImpl extends EFactoryImpl implements CodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeFactory init() {
		try {
			CodeFactory theCodeFactory = (CodeFactory)EPackage.Registry.INSTANCE.getEFactory(CodePackage.eNS_URI);
			if (theCodeFactory != null) {
				return theCodeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFactoryImpl() {
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
			case CodePackage.ASSEMBLER_OBJECT: return createAssemblerObject();
			case CodePackage.INSTRUCTION_CALL: return createInstructionCall();
			case CodePackage.INSTRUCTION_CALL_ARGUMENT: return createInstructionCallArgument();
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
	public InstructionCallArgument createInstructionCallArgument() {
		InstructionCallArgumentImpl instructionCallArgument = new InstructionCallArgumentImpl();
		return instructionCallArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodePackage getCodePackage() {
		return (CodePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodePackage getPackage() {
		return CodePackage.eINSTANCE;
	}

} //CodeFactoryImpl
