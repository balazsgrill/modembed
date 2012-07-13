/**
 */
package hu.modembed.model.core.assembler.impl;

import hu.modembed.model.core.assembler.*;

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
public class AssemblerFactoryImpl extends EFactoryImpl implements AssemblerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssemblerFactory init() {
		try {
			AssemblerFactory theAssemblerFactory = (AssemblerFactory)EPackage.Registry.INSTANCE.getEFactory("http://modembed.hu/core/assembler"); 
			if (theAssemblerFactory != null) {
				return theAssemblerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssemblerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblerFactoryImpl() {
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
			case AssemblerPackage.INSTRUCTION_SET: return createInstructionSet();
			case AssemblerPackage.INSTRUCTION: return createInstruction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionSet createInstructionSet() {
		InstructionSetImpl instructionSet = new InstructionSetImpl();
		return instructionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblerPackage getAssemblerPackage() {
		return (AssemblerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssemblerPackage getPackage() {
		return AssemblerPackage.eINSTANCE;
	}

} //AssemblerFactoryImpl
