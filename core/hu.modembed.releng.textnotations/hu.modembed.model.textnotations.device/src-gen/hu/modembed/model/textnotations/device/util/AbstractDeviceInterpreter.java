/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractDeviceInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<hu.modembed.model.textnotations.device.IDeviceInterpreterListener> listeners = new java.util.ArrayList<hu.modembed.model.textnotations.device.IDeviceInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof hu.modembed.model.modembed.abstraction.DeviceAbstraction) {
			result = interprete_hu_modembed_model_modembed_abstraction_DeviceAbstraction((hu.modembed.model.modembed.abstraction.DeviceAbstraction) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition) {
			result = interprete_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition((hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.infrastructure.RootElement) {
			result = interprete_hu_modembed_model_modembed_infrastructure_RootElement((hu.modembed.model.modembed.infrastructure.RootElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.infrastructure.AttributeDefinition) {
			result = interprete_hu_modembed_model_modembed_infrastructure_AttributeDefinition((hu.modembed.model.modembed.infrastructure.AttributeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.infrastructure.AttributeValueContainer) {
			result = interprete_hu_modembed_model_modembed_infrastructure_AttributeValueContainer((hu.modembed.model.modembed.infrastructure.AttributeValueContainer) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument) {
			result = interprete_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument((hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.infrastructure.NamedElement) {
			result = interprete_hu_modembed_model_modembed_infrastructure_NamedElement((hu.modembed.model.modembed.infrastructure.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.infrastructure.AttributeValue) {
			result = interprete_hu_modembed_model_modembed_infrastructure_AttributeValue((hu.modembed.model.modembed.infrastructure.AttributeValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.memorymodel.MemoryType) {
			result = interprete_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType((hu.modembed.model.modembed.abstraction.memorymodel.MemoryType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance) {
			result = interprete_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance((hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition) {
			result = interprete_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition((hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep) {
			result = interprete_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep((hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep) {
			result = interprete_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep((hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping) {
			result = interprete_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping((hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition) {
			result = interprete_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition((hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.types.PrimitiveTypeDefinition) {
			result = interprete_hu_modembed_model_modembed_abstraction_types_PrimitiveTypeDefinition((hu.modembed.model.modembed.abstraction.types.PrimitiveTypeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition) {
			result = interprete_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition((hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.types.ArrayDefinition) {
			result = interprete_hu_modembed_model_modembed_abstraction_types_ArrayDefinition((hu.modembed.model.modembed.abstraction.types.ArrayDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.types.PointerTypeDefinition) {
			result = interprete_hu_modembed_model_modembed_abstraction_types_PointerTypeDefinition((hu.modembed.model.modembed.abstraction.types.PointerTypeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.types.StructureTypeDefinition) {
			result = interprete_hu_modembed_model_modembed_abstraction_types_StructureTypeDefinition((hu.modembed.model.modembed.abstraction.types.StructureTypeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.types.CompositeTypeDefinition) {
			result = interprete_hu_modembed_model_modembed_abstraction_types_CompositeTypeDefinition((hu.modembed.model.modembed.abstraction.types.CompositeTypeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.types.CodeLabelTypeDefinition) {
			result = interprete_hu_modembed_model_modembed_abstraction_types_CodeLabelTypeDefinition((hu.modembed.model.modembed.abstraction.types.CodeLabelTypeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.types.TypeDefinition) {
			result = interprete_hu_modembed_model_modembed_abstraction_types_TypeDefinition((hu.modembed.model.modembed.abstraction.types.TypeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.types.StructureTypeElement) {
			result = interprete_hu_modembed_model_modembed_abstraction_types_StructureTypeElement((hu.modembed.model.modembed.abstraction.types.StructureTypeElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.abstraction.types.Type) {
			result = interprete_hu_modembed_model_modembed_abstraction_types_Type((hu.modembed.model.modembed.abstraction.types.Type) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.infrastructure.MODembedElement) {
			result = interprete_hu_modembed_model_modembed_infrastructure_MODembedElement((hu.modembed.model.modembed.infrastructure.MODembedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_DeviceAbstraction(hu.modembed.model.modembed.abstraction.DeviceAbstraction deviceAbstraction, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_infrastructure_MODembedElement(hu.modembed.model.modembed.infrastructure.MODembedElement mODembedElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_infrastructure_NamedElement(hu.modembed.model.modembed.infrastructure.NamedElement namedElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_infrastructure_RootElement(hu.modembed.model.modembed.infrastructure.RootElement rootElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition(hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition attributeContainerDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_infrastructure_AttributeDefinition(hu.modembed.model.modembed.infrastructure.AttributeDefinition attributeDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_infrastructure_AttributeValueContainer(hu.modembed.model.modembed.infrastructure.AttributeValueContainer attributeValueContainer, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_infrastructure_AttributeValue(hu.modembed.model.modembed.infrastructure.AttributeValue attributeValue, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType(hu.modembed.model.modembed.abstraction.memorymodel.MemoryType memoryType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance(hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance memoryInstance, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition(hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition operationDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument(hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument operationArgument, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep(hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep instructionCallOperationStep, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep(hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep operationStep, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping(hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping instructionParameterMapping, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_types_TypeDefinition(hu.modembed.model.modembed.abstraction.types.TypeDefinition typeDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_types_PrimitiveTypeDefinition(hu.modembed.model.modembed.abstraction.types.PrimitiveTypeDefinition primitiveTypeDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_types_CompositeTypeDefinition(hu.modembed.model.modembed.abstraction.types.CompositeTypeDefinition compositeTypeDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition(hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition unsignedTypeDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition(hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition referenceTypeDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_types_PointerTypeDefinition(hu.modembed.model.modembed.abstraction.types.PointerTypeDefinition pointerTypeDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_types_ArrayDefinition(hu.modembed.model.modembed.abstraction.types.ArrayDefinition arrayDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_types_StructureTypeDefinition(hu.modembed.model.modembed.abstraction.types.StructureTypeDefinition structureTypeDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_types_StructureTypeElement(hu.modembed.model.modembed.abstraction.types.StructureTypeElement structureTypeElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_types_CodeLabelTypeDefinition(hu.modembed.model.modembed.abstraction.types.CodeLabelTypeDefinition codeLabelTypeDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_abstraction_types_Type(hu.modembed.model.modembed.abstraction.types.Type type, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (hu.modembed.model.textnotations.device.IDeviceInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(hu.modembed.model.textnotations.device.IDeviceInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(hu.modembed.model.textnotations.device.IDeviceInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
