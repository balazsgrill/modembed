/**
 * 
 */
package hu.e.compiler.internal.symbols;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.StackLevel;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.IVariableManager;
import hu.e.compiler.internal.model.TypeDefinitionResolver;
import hu.e.compiler.internal.model.symbols.impl.MemoryAssignmentValueSymbol;
import hu.e.compiler.list.LabelStep;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.MemoryAssignment;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.Variable;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author balazs.grill
 *
 */
public class VariableManager implements IVariableManager {

	Stack<StackLevel> stack = new Stack<StackLevel>();
	
	private final Map<Variable, MemoryAssignment> globals = new HashMap<Variable, MemoryAssignment>();
	
	private final TypeDefinitionResolver typeref;
	
	private final SequenceStep rootstep;
	
	@Override
	public TypeDefinitionResolver getTypeResolver() {
		return typeref;
	}
	
	public VariableManager(TypeDefinitionResolver typeref, SequenceStep rootstep) {
		this.typeref = typeref;
		this.rootstep = rootstep;
		stack.push(new StackLevel(typeref));
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.IVariableManager#startBlock()
	 */
	@Override
	public void startBlock() {
		stack.push(new StackLevel(typeref));
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.IVariableManager#define(hu.e.parser.eSyntax.Variable)
	 */
	@Override
	public void define(ISymbolManager sm, Variable var, MemoryAssignment ma) throws ECompilerException {
		stack.peek().allocate(sm, var, ma);
	}

	public MemoryAssignmentValueSymbol getAddress(ISymbolManager sm, Variable var) throws ECompilerException{
		if (var.eContainer() instanceof Library){
			if (!globals.containsKey(var)){
				MemoryAssignment ma = ListFactory.eINSTANCE.createMemoryAssignment();
				ma.setSize(typeref.getSize(sm, var.getType()));
				ma.setName(((Library)var.eContainer()).getName()+"."+var.getName());
				rootstep.getVariables().add(ma);
				globals.put(var, ma);
			}
			return new MemoryAssignmentValueSymbol(globals.get(var),0, sm.getCodePlatform().getPointerType());
		}
		for(StackLevel sl : stack){
			MemoryAssignment addr = sl.getAddress(var);
			if (addr != null) return new MemoryAssignmentValueSymbol(addr, 0, sm.getCodePlatform().getPointerType());
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.IVariableManager#endBlock()
	 */
	@Override
	public void endBlock() {
		StackLevel sl = stack.pop();
		sl.release();
	}

	@Override
	public MemoryAssignmentValueSymbol allocate(ISymbolManager sm, TypeDef type) throws ECompilerException {
		return stack.peek().allocate(sm, type);
	}

	@Override
	public void defineLabel(Label label, LabelStep ls) {
		stack.peek().defineLabel(label, ls);
	}

	@Override
	public LabelStep getLabelStep(Label label) {
		for(StackLevel sl : stack){
			LabelStep ls = sl.getLabel(label);
			if (ls != null) return ls;
		}
		return null;
	}
	
}
