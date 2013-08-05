/**
 */
package hu.modembed.model.modembed.abstraction.memorymodel.impl;

import hu.modembed.model.modembed.abstraction.memorymodel.*;

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
public class MemorymodelFactoryImpl extends EFactoryImpl implements MemorymodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MemorymodelFactory init() {
		try {
			MemorymodelFactory theMemorymodelFactory = (MemorymodelFactory)EPackage.Registry.INSTANCE.getEFactory(MemorymodelPackage.eNS_URI);
			if (theMemorymodelFactory != null) {
				return theMemorymodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MemorymodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemorymodelFactoryImpl() {
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
			case MemorymodelPackage.MEMORY_TYPE: return createMemoryType();
			case MemorymodelPackage.MEMORY_INSTANCE: return createMemoryInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryType createMemoryType() {
		MemoryTypeImpl memoryType = new MemoryTypeImpl();
		return memoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryInstance createMemoryInstance() {
		MemoryInstanceImpl memoryInstance = new MemoryInstanceImpl();
		return memoryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemorymodelPackage getMemorymodelPackage() {
		return (MemorymodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MemorymodelPackage getPackage() {
		return MemorymodelPackage.eINSTANCE;
	}

} //MemorymodelFactoryImpl
