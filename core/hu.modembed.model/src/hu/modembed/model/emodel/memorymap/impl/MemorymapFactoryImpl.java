/**
 */
package hu.modembed.model.emodel.memorymap.impl;

import hu.modembed.model.emodel.memorymap.*;

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
public class MemorymapFactoryImpl extends EFactoryImpl implements MemorymapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MemorymapFactory init() {
		try {
			MemorymapFactory theMemorymapFactory = (MemorymapFactory)EPackage.Registry.INSTANCE.getEFactory("http://emodel/1.0/memorymap"); 
			if (theMemorymapFactory != null) {
				return theMemorymapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MemorymapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemorymapFactoryImpl() {
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
			case MemorymapPackage.MEMORY_MAP: return createMemoryMap();
			case MemorymapPackage.HEAP_LEVEL: return createHeapLevel();
			case MemorymapPackage.HEAP_VARIABLE_MAPPING: return createHeapVariableMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMap createMemoryMap() {
		MemoryMapImpl memoryMap = new MemoryMapImpl();
		return memoryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeapLevel createHeapLevel() {
		HeapLevelImpl heapLevel = new HeapLevelImpl();
		return heapLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeapVariableMapping createHeapVariableMapping() {
		HeapVariableMappingImpl heapVariableMapping = new HeapVariableMappingImpl();
		return heapVariableMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemorymapPackage getMemorymapPackage() {
		return (MemorymapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MemorymapPackage getPackage() {
		return MemorymapPackage.eINSTANCE;
	}

} //MemorymapFactoryImpl
