/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.util;

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
public class AbstractTypeInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<hu.modembed.model.textnotations.type.ITypeInterpreterListener> listeners = new java.util.ArrayList<hu.modembed.model.textnotations.type.ITypeInterpreterListener>();
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
		if (object instanceof hu.modembed.model.modembed.abstraction.types.PrimitiveTypeDefinition) {
			result = interprete_hu_modembed_model_modembed_abstraction_types_PrimitiveTypeDefinition((hu.modembed.model.modembed.abstraction.types.PrimitiveTypeDefinition) object, context);
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
		if (object instanceof hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition) {
			result = interprete_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition((hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition) object, context);
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
		return result;
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
		for (hu.modembed.model.textnotations.type.ITypeInterpreterListener listener : listeners) {
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
	
	public void addListener(hu.modembed.model.textnotations.type.ITypeInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(hu.modembed.model.textnotations.type.ITypeInterpreterListener listener) {
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
