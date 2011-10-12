/**
 * 
 */
package hu.e.compiler.internal.model;

import hu.e.compiler.internal.MemoryManager;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.Variable;

/**
 * @author balazs.grill
 *
 */
public interface IVariableManager {

	public void startBlock();
	
	public void define(ISymbolManager sm, Variable var);
	
	public int allocate(ISymbolManager sm, Type type);
	
	public void endBlock();
	
	public MemoryManager getMemoryManager();
	
}
