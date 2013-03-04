/**
 */
package hu.modembed.model.emodel.types.util;

import hu.modembed.model.core.MODembedElement;
import hu.modembed.model.core.NamedElement;

import hu.modembed.model.emodel.types.*;

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
 * @see hu.modembed.model.emodel.types.TypesPackage
 * @generated
 */
public class TypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
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
			case TypesPackage.TYPE_DEFINITION: {
				TypeDefinition typeDefinition = (TypeDefinition)theEObject;
				T result = caseTypeDefinition(typeDefinition);
				if (result == null) result = caseMODembedElement(typeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PRIMITIVE_TYPE_DEFINITION: {
				PrimitiveTypeDefinition primitiveTypeDefinition = (PrimitiveTypeDefinition)theEObject;
				T result = casePrimitiveTypeDefinition(primitiveTypeDefinition);
				if (result == null) result = caseTypeDefinition(primitiveTypeDefinition);
				if (result == null) result = caseMODembedElement(primitiveTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.COMPOSITE_TYPE_DEFINITION: {
				CompositeTypeDefinition compositeTypeDefinition = (CompositeTypeDefinition)theEObject;
				T result = caseCompositeTypeDefinition(compositeTypeDefinition);
				if (result == null) result = caseTypeDefinition(compositeTypeDefinition);
				if (result == null) result = caseMODembedElement(compositeTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UNSIGNED_TYPE_DEFINITION: {
				UnsignedTypeDefinition unsignedTypeDefinition = (UnsignedTypeDefinition)theEObject;
				T result = caseUnsignedTypeDefinition(unsignedTypeDefinition);
				if (result == null) result = casePrimitiveTypeDefinition(unsignedTypeDefinition);
				if (result == null) result = caseTypeDefinition(unsignedTypeDefinition);
				if (result == null) result = caseMODembedElement(unsignedTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REFERENCE_TYPE_DEFINITION: {
				ReferenceTypeDefinition referenceTypeDefinition = (ReferenceTypeDefinition)theEObject;
				T result = caseReferenceTypeDefinition(referenceTypeDefinition);
				if (result == null) result = caseCompositeTypeDefinition(referenceTypeDefinition);
				if (result == null) result = caseTypeDefinition(referenceTypeDefinition);
				if (result == null) result = caseMODembedElement(referenceTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.POINTER_TYPE_DEFINITION: {
				PointerTypeDefinition pointerTypeDefinition = (PointerTypeDefinition)theEObject;
				T result = casePointerTypeDefinition(pointerTypeDefinition);
				if (result == null) result = caseCompositeTypeDefinition(pointerTypeDefinition);
				if (result == null) result = caseTypeDefinition(pointerTypeDefinition);
				if (result == null) result = caseMODembedElement(pointerTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ARRAY_DEFINITION: {
				ArrayDefinition arrayDefinition = (ArrayDefinition)theEObject;
				T result = caseArrayDefinition(arrayDefinition);
				if (result == null) result = casePointerTypeDefinition(arrayDefinition);
				if (result == null) result = caseCompositeTypeDefinition(arrayDefinition);
				if (result == null) result = caseTypeDefinition(arrayDefinition);
				if (result == null) result = caseMODembedElement(arrayDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_TYPE_DEFINITION: {
				StructureTypeDefinition structureTypeDefinition = (StructureTypeDefinition)theEObject;
				T result = caseStructureTypeDefinition(structureTypeDefinition);
				if (result == null) result = caseCompositeTypeDefinition(structureTypeDefinition);
				if (result == null) result = caseTypeDefinition(structureTypeDefinition);
				if (result == null) result = caseMODembedElement(structureTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_TYPE_ELEMENT: {
				StructureTypeElement structureTypeElement = (StructureTypeElement)theEObject;
				T result = caseStructureTypeElement(structureTypeElement);
				if (result == null) result = caseNamedElement(structureTypeElement);
				if (result == null) result = caseMODembedElement(structureTypeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CODE_LABEL_TYPE_DEFINITION: {
				CodeLabelTypeDefinition codeLabelTypeDefinition = (CodeLabelTypeDefinition)theEObject;
				T result = caseCodeLabelTypeDefinition(codeLabelTypeDefinition);
				if (result == null) result = casePrimitiveTypeDefinition(codeLabelTypeDefinition);
				if (result == null) result = caseTypeDefinition(codeLabelTypeDefinition);
				if (result == null) result = caseMODembedElement(codeLabelTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinition(TypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeDefinition(PrimitiveTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeTypeDefinition(CompositeTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedTypeDefinition(UnsignedTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceTypeDefinition(ReferenceTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerTypeDefinition(PointerTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDefinition(ArrayDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureTypeDefinition(StructureTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Type Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureTypeElement(StructureTypeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Label Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Label Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeLabelTypeDefinition(CodeLabelTypeDefinition object) {
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

} //TypesSwitch
