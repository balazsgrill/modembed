/**
 * 
 */
package hu.e.compiler.internal.model.symbols;

import hu.e.compiler.ECompilerException;

/**
 * @author balazs.grill
 *
 */
public interface IVariableSymbol extends ISymbol {

	public ISymbol getAddressSymbol() throws ECompilerException;
	
}
