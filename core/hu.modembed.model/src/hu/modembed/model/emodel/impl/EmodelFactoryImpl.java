/**
 */
package hu.modembed.model.emodel.impl;

import hu.modembed.model.emodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class EmodelFactoryImpl extends EFactoryImpl implements EmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmodelFactory init() {
		try {
			EmodelFactory theEmodelFactory = (EmodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://emodel/1.0"); 
			if (theEmodelFactory != null) {
				return theEmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmodelFactoryImpl() {
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
			case EmodelPackage.LIBRARY: return createLibrary();
			case EmodelPackage.TYPE: return createType();
			case EmodelPackage.FUNCTION: return createFunction();
			case EmodelPackage.VARIABLE: return createVariable();
			case EmodelPackage.RESULT_BUFFER: return createResultBuffer();
			case EmodelPackage.RESULT_EXPRESSION: return createResultExpression();
			case EmodelPackage.HEAP_VARIABLE: return createHeapVariable();
			case EmodelPackage.REGISTER_VARIABLE: return createRegisterVariable();
			case EmodelPackage.CONSTANT_VARIABLE: return createConstantVariable();
			case EmodelPackage.VARIABLE_PARAMETER: return createVariableParameter();
			case EmodelPackage.LAZY_PARAMETER: return createLazyParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EmodelPackage.VARIABLE_PARAMETER_KIND:
				return createVariableParameterKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EmodelPackage.VARIABLE_PARAMETER_KIND:
				return convertVariableParameterKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultBuffer createResultBuffer() {
		ResultBufferImpl resultBuffer = new ResultBufferImpl();
		return resultBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultExpression createResultExpression() {
		ResultExpressionImpl resultExpression = new ResultExpressionImpl();
		return resultExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeapVariable createHeapVariable() {
		HeapVariableImpl heapVariable = new HeapVariableImpl();
		return heapVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterVariable createRegisterVariable() {
		RegisterVariableImpl registerVariable = new RegisterVariableImpl();
		return registerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantVariable createConstantVariable() {
		ConstantVariableImpl constantVariable = new ConstantVariableImpl();
		return constantVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableParameter createVariableParameter() {
		VariableParameterImpl variableParameter = new VariableParameterImpl();
		return variableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyParameter createLazyParameter() {
		LazyParameterImpl lazyParameter = new LazyParameterImpl();
		return lazyParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableParameterKind createVariableParameterKindFromString(EDataType eDataType, String initialValue) {
		VariableParameterKind result = VariableParameterKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableParameterKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmodelPackage getEmodelPackage() {
		return (EmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmodelPackage getPackage() {
		return EmodelPackage.eINSTANCE;
	}

} //EmodelFactoryImpl
