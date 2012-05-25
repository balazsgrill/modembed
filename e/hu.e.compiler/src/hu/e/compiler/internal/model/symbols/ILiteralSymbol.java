/**
 * 
 */
package hu.e.compiler.internal.model.symbols;

import java.math.BigDecimal;

import hu.e.compiler.ECompilerException;

/**
 * @author balazs.grill
 *
 */
public interface ILiteralSymbol extends ISymbol{

	public BigDecimal getValue() throws ECompilerException;
	
}
