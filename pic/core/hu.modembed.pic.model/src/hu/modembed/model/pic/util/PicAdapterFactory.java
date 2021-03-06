/**
 */
package hu.modembed.model.pic.util;

import hu.modembed.model.modembed.infrastructure.MODembedElement;
import hu.modembed.model.modembed.infrastructure.NamedElement;
import hu.modembed.model.modembed.infrastructure.RootElement;
import hu.modembed.model.pic.*;
import hu.modembed.model.pic.ConfigField;
import hu.modembed.model.pic.ConfigLiteral;
import hu.modembed.model.pic.ConfigWord;
import hu.modembed.model.pic.ConfigurationSelection;
import hu.modembed.model.pic.PICConfigurationModel;
import hu.modembed.model.pic.PICConfigurationValueModel;
import hu.modembed.model.pic.PicPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.pic.PicPackage
 * @generated
 */
public class PicAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PicPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PicSwitch<Adapter> modelSwitch =
		new PicSwitch<Adapter>() {
			@Override
			public Adapter casePICConfigurationModel(PICConfigurationModel object) {
				return createPICConfigurationModelAdapter();
			}
			@Override
			public Adapter caseConfigWord(ConfigWord object) {
				return createConfigWordAdapter();
			}
			@Override
			public Adapter caseConfigField(ConfigField object) {
				return createConfigFieldAdapter();
			}
			@Override
			public Adapter caseConfigLiteral(ConfigLiteral object) {
				return createConfigLiteralAdapter();
			}
			@Override
			public Adapter casePICConfigurationValueModel(PICConfigurationValueModel object) {
				return createPICConfigurationValueModelAdapter();
			}
			@Override
			public Adapter caseConfigurationSelection(ConfigurationSelection object) {
				return createConfigurationSelectionAdapter();
			}
			@Override
			public Adapter caseMODembedElement(MODembedElement object) {
				return createMODembedElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseRootElement(RootElement object) {
				return createRootElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.pic.PICConfigurationModel <em>PIC Configuration Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.pic.PICConfigurationModel
	 * @generated
	 */
	public Adapter createPICConfigurationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.pic.ConfigWord <em>Config Word</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.pic.ConfigWord
	 * @generated
	 */
	public Adapter createConfigWordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.pic.ConfigField <em>Config Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.pic.ConfigField
	 * @generated
	 */
	public Adapter createConfigFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.pic.ConfigLiteral <em>Config Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.pic.ConfigLiteral
	 * @generated
	 */
	public Adapter createConfigLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.pic.PICConfigurationValueModel <em>PIC Configuration Value Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.pic.PICConfigurationValueModel
	 * @generated
	 */
	public Adapter createPICConfigurationValueModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.pic.ConfigurationSelection <em>Configuration Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.pic.ConfigurationSelection
	 * @generated
	 */
	public Adapter createConfigurationSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.modembed.infrastructure.MODembedElement <em>MO Dembed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.modembed.infrastructure.MODembedElement
	 * @generated
	 */
	public Adapter createMODembedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.modembed.infrastructure.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.modembed.infrastructure.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.modembed.model.modembed.infrastructure.RootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.modembed.model.modembed.infrastructure.RootElement
	 * @generated
	 */
	public Adapter createRootElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PicAdapterFactory
