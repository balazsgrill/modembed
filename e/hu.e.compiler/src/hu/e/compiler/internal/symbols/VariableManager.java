/**
 * 
 */
package hu.e.compiler.internal.symbols;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.MemoryManager;
import hu.e.compiler.internal.StackLevel;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.IVariableManager;
import hu.e.parser.eSyntax.Package;
import hu.e.parser.eSyntax.Type;
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
	
	private final Map<Variable, Integer> globals = new HashMap<Variable, Integer>();
	
	private final MemoryManager memman;
	
	@Override
	public MemoryManager getMemoryManager() {
		return memman;
	}
	
	public VariableManager(MemoryManager memman) {
		this.memman = memman;
		stack.push(new StackLevel(memman));
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.IVariableManager#startBlock()
	 */
	@Override
	public void startBlock() {
		stack.push(new StackLevel(memman));
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.IVariableManager#define(hu.e.parser.eSyntax.Variable)
	 */
	@Override
	public void define(ISymbolManager sm, Variable var) throws ECompilerException {
		stack.peek().allocate(sm, var);
	}

	public int getAddress(ISymbolManager sm, Variable var) throws ECompilerException{
		if (var.eContainer() instanceof Package){
			if (!globals.containsKey(var)){
				Integer a = memman.allocate(memman.getSize(sm, var.getType()));
				globals.put(var, a);
			}
			return globals.get(var);
		}
		for(StackLevel sl : stack){
			Integer addr = sl.getAddress(var);
			if (addr != null) return addr;
		}
		return -1;
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
	public int allocate(ISymbolManager sm, Type type) throws ECompilerException {
		return stack.peek().allocate(sm, type);
	}
	
}
