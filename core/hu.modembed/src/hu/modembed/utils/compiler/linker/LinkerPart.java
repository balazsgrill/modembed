/**
 * 
 */
package hu.modembed.utils.compiler.linker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;

import hu.modembed.model.modembed.abstraction.behavior.OperationExecution;
import hu.modembed.model.modembed.abstraction.behavior.SequentialAction;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;

/**
 * @author balage
 *
 */
public class LinkerPart implements ISymbolContext {

	private final ISymbolContext parent;
	private final SequentialBehaviorPart part;
	
	private final Map<String, SymbolAssignment> localSymbols = new HashMap<String, SymbolAssignment>();
	private final Map<String, SymbolAssignment> resultSymbols = new HashMap<String, SymbolAssignment>();
	private final Map<String, String> arguments = new HashMap<String, String>();
	
	/**
	 * 
	 */
	public LinkerPart(ISymbolContext parent, SequentialBehaviorPart part, List<String> arguments) {
		this.parent = parent;
		this.part = part;
		
		for(SymbolAssignment sa : part.getLocalSymbols()){
			localSymbols.put(sa.getSymbol(), sa);
		}
		
		for(int i=0;i<arguments.size();i++){
			String parameter = part.getParameters().get(i);
			this.arguments.put(parameter, arguments.get(i));
		}
	}

	/* (non-Javadoc)
	 * @see hu.modembed.utils.compiler.linker.ISymbolContext#getSymbol(java.lang.String)
	 */
	@Override
	public SymbolAssignment getSymbol(String symbol) {
		if (resultSymbols.containsKey(symbol)){
			return resultSymbols.get(symbol);
		}
		if (localSymbols.containsKey(symbol)){
			SymbolAssignment sa = localSymbols.get(symbol);
			SymbolAssignment la = EcoreUtil.copy(sa);
			resultSymbols.put(symbol, la);
			registerSymbol(la);
		}
		return null;
	}

	public List<SequentialAction> link(){
		return null;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.utils.compiler.linker.ISymbolContext#getCallee(java.lang.String)
	 */
	@Override
	public SequentialBehaviorPart getCallee(String name) {
		return parent.getCallee(name);
	}

	@Override
	public void registerSymbol(SymbolAssignment sa) {
		parent.registerSymbol(sa);
	}

}
