/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package memory.impl;

import memory.*;

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
public class MemoryFactoryImpl extends EFactoryImpl implements MemoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MemoryFactory init() {
		try {
			MemoryFactory theMemoryFactory = (MemoryFactory)EPackage.Registry.INSTANCE.getEFactory("http://gb.hu/embedded/memory"); 
			if (theMemoryFactory != null) {
				return theMemoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MemoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryFactoryImpl() {
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
			case MemoryPackage.RAM_MODEL: return createRAMModel();
			case MemoryPackage.MEMORY_MODEL: return createMemoryModel();
			case MemoryPackage.MEM_SEGMENT: return createMemSegment();
			case MemoryPackage.PROG_MODEL: return createProgModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RAMModel createRAMModel() {
		RAMModelImpl ramModel = new RAMModelImpl();
		return ramModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryModel createMemoryModel() {
		MemoryModelImpl memoryModel = new MemoryModelImpl();
		return memoryModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemSegment createMemSegment() {
		MemSegmentImpl memSegment = new MemSegmentImpl();
		return memSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgModel createProgModel() {
		ProgModelImpl progModel = new ProgModelImpl();
		return progModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryPackage getMemoryPackage() {
		return (MemoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MemoryPackage getPackage() {
		return MemoryPackage.eINSTANCE;
	}

} //MemoryFactoryImpl
