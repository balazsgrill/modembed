/**
 * 
 */
package hu.e.compiler.internal.model.symbols;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.parser.eSyntax.Type;

import java.util.List;

/**
 * @author balazs.grill
 *
 */
public interface ISymbol {
	
	public boolean isLiteral();
	
	public List<IProgramStep> getSteps();
	
	public Type getType() throws ECompilerException;
	
}
