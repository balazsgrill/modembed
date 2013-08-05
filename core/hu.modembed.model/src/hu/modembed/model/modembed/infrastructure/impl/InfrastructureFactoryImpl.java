/**
 */
package hu.modembed.model.modembed.infrastructure.impl;

import hu.modembed.model.modembed.infrastructure.*;

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
public class InfrastructureFactoryImpl extends EFactoryImpl implements InfrastructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfrastructureFactory init() {
		try {
			InfrastructureFactory theInfrastructureFactory = (InfrastructureFactory)EPackage.Registry.INSTANCE.getEFactory(InfrastructurePackage.eNS_URI);
			if (theInfrastructureFactory != null) {
				return theInfrastructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfrastructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureFactoryImpl() {
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
			case InfrastructurePackage.ANNOTATION: return createAnnotation();
			case InfrastructurePackage.ATTRIBUTE_CONTAINER_DEFINITION: return createAttributeContainerDefinition();
			case InfrastructurePackage.ATTRIBUTE_DEFINITION: return createAttributeDefinition();
			case InfrastructurePackage.ATTRIBUTE_VALUE_CONTAINER: return createAttributeValueContainer();
			case InfrastructurePackage.ATTRIBUTE_VALUE: return createAttributeValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeContainerDefinition createAttributeContainerDefinition() {
		AttributeContainerDefinitionImpl attributeContainerDefinition = new AttributeContainerDefinitionImpl();
		return attributeContainerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinition createAttributeDefinition() {
		AttributeDefinitionImpl attributeDefinition = new AttributeDefinitionImpl();
		return attributeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueContainer createAttributeValueContainer() {
		AttributeValueContainerImpl attributeValueContainer = new AttributeValueContainerImpl();
		return attributeValueContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue createAttributeValue() {
		AttributeValueImpl attributeValue = new AttributeValueImpl();
		return attributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructurePackage getInfrastructurePackage() {
		return (InfrastructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfrastructurePackage getPackage() {
		return InfrastructurePackage.eINSTANCE;
	}

} //InfrastructureFactoryImpl
