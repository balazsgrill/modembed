/**
 * 
 */
package hu.e.compiler.internal.symbols;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.linking.CodePlatform;
import hu.e.compiler.internal.linking.OperationFinder;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.IVariableManager;
import hu.e.compiler.internal.model.TypeDefinitionResolver;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.impl.CodeAddressSymbol;
import hu.e.compiler.internal.model.symbols.impl.MemoryAssignmentValueSymbol;
import hu.e.compiler.internal.model.symbols.impl.VariableSymbol;
import hu.e.compiler.list.LabelStep;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;

/**
 * @author balazs.grill
 *
 */
public class SymbolManager extends AbstractSymbolManager {
	
	//private final MemoryManager memman;
	
	private final ISymbolManager parent;
	
	private final VariableManager varman;
	
	public SymbolManager(CodePlatform platform, ISymbolManager parent, TypeDefinitionResolver memman, SequenceStep sequence) {
		super(platform);
		//this.memman = memman;
		this.parent = parent;
		this.varman = new VariableManager(memman, sequence);
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbolManager#getSymbol(hu.e.parser.eSyntax.VariableReference)
	 */
	@Override
	public ISymbol getSymbol(Variable ref) throws ECompilerException {
		if (ref instanceof Label){
			LabelStep ls = getVariableManager().getLabelStep((Label)ref);
			if (ls != null)
				return new CodeAddressSymbol(ls);
		}
		ISymbol s = parent.getSymbol(ref);
		if (s != null) return s;
		MemoryAssignmentValueSymbol symbol = varman.getAddress(this, ref);
		if (symbol != null){
			return VariableSymbol.create(symbol, ref.getType());
		}
		return null;
	}

	@Override
	public IVariableManager getVariableManager() {
		return varman;
	}

//	@Override
//	public void setLabelAddresses(Map<LabelStep, Integer> addresses) throws ECompilerException {
//		parent.setLabelAddresses(addresses);
//	}

	@Override
	public void contextAssign(VariableReference vr, int value) {
		parent.contextAssign(vr, value);
	}

	@Override
	public OperationFinder getOpFinder() {
		return getCodePlatform().getOperationFinder();
	}
	
}
