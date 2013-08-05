/**
 * 
 */
package hu.modembed.utils.compiler.linker;

import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;

/**
 * @author balage
 *
 */
public interface ISymbolContext {

	public String getSymbol(String symbol);
	
	public SequentialBehaviorPart getCallee(String name);

	public void registerSymbol(SymbolAssignment sa);
	
	public String basePrefix();
	
	public int countCalls(String callee);
}
