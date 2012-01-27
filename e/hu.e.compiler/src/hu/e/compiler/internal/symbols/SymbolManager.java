/**
 * 
 */
package hu.e.compiler.internal.symbols;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.MemoryManager;
import hu.e.compiler.internal.linking.CodePlatform;
import hu.e.compiler.internal.linking.OperationFinder;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.IVariableManager;
import hu.e.compiler.internal.model.LabelStep;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.impl.LabelSymbol;
import hu.e.compiler.internal.model.symbols.impl.LiteralSymbol;
import hu.e.compiler.internal.model.symbols.impl.VariableSymbol;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;

import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class SymbolManager extends AbstractSymbolManager {
	
	//private final MemoryManager memman;
	
	private final ISymbolManager parent;
	
	private final VariableManager varman;
	
	public SymbolManager(CodePlatform platform, ISymbolManager parent, MemoryManager memman) {
		super(platform);
		//this.memman = memman;
		this.parent = parent;
		this.varman = new VariableManager(memman);
	}

	@Override
	public void addLabelSymbol(LabelSymbol ls) {
		parent.addLabelSymbol(ls);
	}
	

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbolManager#getSymbol(hu.e.parser.eSyntax.VariableReference)
	 */
	@Override
	public ISymbol getSymbol(Variable ref) throws ECompilerException {
		ISymbol s = parent.getSymbol(ref);
		if (s != null) return s;
		int baseaddr = varman.getAddress(this, ref);
		if (baseaddr != -1){
			return VariableSymbol.create(new LiteralSymbol(baseaddr), ref.getType());
		}
		return null;
	}

	@Override
	public IVariableManager getVariableManager() {
		return varman;
	}

	@Override
	public void setLabelAddresses(Map<LabelStep, Integer> addresses) throws ECompilerException {
		parent.setLabelAddresses(addresses);
	}

	@Override
	public void contextAssign(VariableReference vr, int value) {
		parent.contextAssign(vr, value);
	}

	@Override
	public OperationFinder getOpFinder() {
		return null;
	}
	
}
