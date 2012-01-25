/**
 * 
 */
package hu.e.compiler.internal.model;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.MemoryManager;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.Variable;

/**
 * @author balazs.grill
 *
 */
public interface IVariableManager {

	public void startBlock();
	
	public void define(ISymbolManager sm, Variable var) throws ECompilerException;
	
	public int allocate(ISymbolManager sm, TypeDef type) throws ECompilerException;
	
	public void endBlock();
	
	public MemoryManager getMemoryManager();
	
}
