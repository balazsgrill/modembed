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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.pic.PicPackage
 * @generated
 */
public class PicSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicSwitch() {
		if (modelPackage == null) {
			modelPackage = PicPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PicPackage.PIC_CONFIGURATION_MODEL: {
				PICConfigurationModel picConfigurationModel = (PICConfigurationModel)theEObject;
				T result = casePICConfigurationModel(picConfigurationModel);
				if (result == null) result = caseRootElement(picConfigurationModel);
				if (result == null) result = caseNamedElement(picConfigurationModel);
				if (result == null) result = caseMODembedElement(picConfigurationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PicPackage.CONFIG_WORD: {
				ConfigWord configWord = (ConfigWord)theEObject;
				T result = caseConfigWord(configWord);
				if (result == null) result = caseNamedElement(configWord);
				if (result == null) result = caseMODembedElement(configWord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PicPackage.CONFIG_FIELD: {
				ConfigField configField = (ConfigField)theEObject;
				T result = caseConfigField(configField);
				if (result == null) result = caseNamedElement(configField);
				if (result == null) result = caseMODembedElement(configField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PicPackage.CONFIG_LITERAL: {
				ConfigLiteral configLiteral = (ConfigLiteral)theEObject;
				T result = caseConfigLiteral(configLiteral);
				if (result == null) result = caseNamedElement(configLiteral);
				if (result == null) result = caseMODembedElement(configLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PicPackage.PIC_CONFIGURATION_VALUE_MODEL: {
				PICConfigurationValueModel picConfigurationValueModel = (PICConfigurationValueModel)theEObject;
				T result = casePICConfigurationValueModel(picConfigurationValueModel);
				if (result == null) result = caseRootElement(picConfigurationValueModel);
				if (result == null) result = caseNamedElement(picConfigurationValueModel);
				if (result == null) result = caseMODembedElement(picConfigurationValueModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PicPackage.CONFIGURATION_SELECTION: {
				ConfigurationSelection configurationSelection = (ConfigurationSelection)theEObject;
				T result = caseConfigurationSelection(configurationSelection);
				if (result == null) result = caseMODembedElement(configurationSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PIC Configuration Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PIC Configuration Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePICConfigurationModel(PICConfigurationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Word</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Word</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigWord(ConfigWord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigField(ConfigField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigLiteral(ConfigLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PIC Configuration Value Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PIC Configuration Value Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePICConfigurationValueModel(PICConfigurationValueModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationSelection(ConfigurationSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MO Dembed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MO Dembed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMODembedElement(MODembedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootElement(RootElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PicSwitch
