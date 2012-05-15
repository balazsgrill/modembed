/**
 * 
 */
package hu.e.compiler.internal.model.symbols;

import hu.e.compiler.ECompilerException;

/**
 * @author balazs.grill
 *
 */
public interface ILiteralSymbol extends ISymbol{

	public long getValue() throws ECompilerException;
	
}
