/**
 * 
 */
package hu.e.compiler.internal.symbols;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.linking.OperationFinder;
import hu.e.compiler.internal.model.IVariableManager;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.impl.LiteralSymbol;
import hu.e.compiler.internal.model.symbols.impl.VariableSymbol;
import hu.e.parser.eSyntax.CompileContextVariable;
import hu.e.parser.eSyntax.ConstantVariable;
import hu.e.parser.eSyntax.RegisterVariable;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;

import java.util.HashMap;
import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class RootSymbolManager extends AbstractSymbolManager {

	public RootSymbolManager() {
		super(null);
	}
	
	private final Map<CompileContextVariable, Integer> compilecontext = new HashMap<CompileContextVariable, Integer>();
	
	private int getCCValue(CompileContextVariable var) throws ECompilerException{
		if (compilecontext.containsKey(var)){
			return compilecontext.get(var);
		}
		int v = 0;
		if (var.getValue() != null) v = ((ILiteralSymbol)resolve(var.getValue())).getValue();
		compilecontext.put(var, v);
		return v;
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbolManager#getSymbol(hu.e.parser.eSyntax.Variable)
	 */
	@Override
	public ISymbol getSymbol(Variable ref) throws ECompilerException {
		if (ref instanceof ConstantVariable){
			return resolve(((ConstantVariable) ref).getValue());
		}
		if (ref instanceof RegisterVariable){
			return VariableSymbol.create(resolve(((RegisterVariable) ref).getAddr()), ref.getType());
		}
		if (ref instanceof CompileContextVariable){
			return new LiteralSymbol(getCCValue((CompileContextVariable)ref));
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbolManager#getVariableManager()
	 */
	@Override
	public IVariableManager getVariableManager() {
		return null;
	}

	@Override
	public void contextAssign(VariableReference vr, int value) {
		CompileContextVariable ccvar = (CompileContextVariable) vr.getVar();
		
		compilecontext.put(ccvar, value);
	}

	@Override
	public OperationFinder getOpFinder() {
		return getCodePlatform().getOperationFinder();
	}
	

}
