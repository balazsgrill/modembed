/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.util;

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
public class AbstractInstructionsetInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<hu.modembed.model.textnotations.instructionset.IInstructionsetInterpreterListener> listeners = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.IInstructionsetInterpreterListener>();
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
		if (object instanceof hu.modembed.model.modembed.core.instructionset.InstructionSet) {
			result = interprete_hu_modembed_model_modembed_core_instructionset_InstructionSet((hu.modembed.model.modembed.core.instructionset.InstructionSet) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.core.instructionset.Instruction) {
			result = interprete_hu_modembed_model_modembed_core_instructionset_Instruction((hu.modembed.model.modembed.core.instructionset.Instruction) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.core.instructionset.InstructionParameter) {
			result = interprete_hu_modembed_model_modembed_core_instructionset_InstructionParameter((hu.modembed.model.modembed.core.instructionset.InstructionParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.core.instructionset.ConstantSection) {
			result = interprete_hu_modembed_model_modembed_core_instructionset_ConstantSection((hu.modembed.model.modembed.core.instructionset.ConstantSection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.core.instructionset.ParameterSection) {
			result = interprete_hu_modembed_model_modembed_core_instructionset_ParameterSection((hu.modembed.model.modembed.core.instructionset.ParameterSection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.core.instructionset.InstructionSection) {
			result = interprete_hu_modembed_model_modembed_core_instructionset_InstructionSection((hu.modembed.model.modembed.core.instructionset.InstructionSection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.core.instructionset.InstructionWord) {
			result = interprete_hu_modembed_model_modembed_core_instructionset_InstructionWord((hu.modembed.model.modembed.core.instructionset.InstructionWord) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.core.instructionset.InstructionWordMaskedValueCondition) {
			result = interprete_hu_modembed_model_modembed_core_instructionset_InstructionWordMaskedValueCondition((hu.modembed.model.modembed.core.instructionset.InstructionWordMaskedValueCondition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hu.modembed.model.modembed.core.instructionset.InstructionWordCondition) {
			result = interprete_hu_modembed_model_modembed_core_instructionset_InstructionWordCondition((hu.modembed.model.modembed.core.instructionset.InstructionWordCondition) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_core_instructionset_InstructionSet(hu.modembed.model.modembed.core.instructionset.InstructionSet instructionSet, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_core_instructionset_Instruction(hu.modembed.model.modembed.core.instructionset.Instruction instruction, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_core_instructionset_InstructionParameter(hu.modembed.model.modembed.core.instructionset.InstructionParameter instructionParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_core_instructionset_InstructionSection(hu.modembed.model.modembed.core.instructionset.InstructionSection instructionSection, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_core_instructionset_ConstantSection(hu.modembed.model.modembed.core.instructionset.ConstantSection constantSection, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_core_instructionset_ParameterSection(hu.modembed.model.modembed.core.instructionset.ParameterSection parameterSection, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_core_instructionset_InstructionWord(hu.modembed.model.modembed.core.instructionset.InstructionWord instructionWord, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_core_instructionset_InstructionWordCondition(hu.modembed.model.modembed.core.instructionset.InstructionWordCondition instructionWordCondition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hu_modembed_model_modembed_core_instructionset_InstructionWordMaskedValueCondition(hu.modembed.model.modembed.core.instructionset.InstructionWordMaskedValueCondition instructionWordMaskedValueCondition, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (hu.modembed.model.textnotations.instructionset.IInstructionsetInterpreterListener listener : listeners) {
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
	
	public void addListener(hu.modembed.model.textnotations.instructionset.IInstructionsetInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(hu.modembed.model.textnotations.instructionset.IInstructionsetInterpreterListener listener) {
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
