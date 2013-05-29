/**
 * 
 */
package hu.modembed.utils.compiler.linker;

import hu.modembed.model.modembed.abstraction.DeviceAbstraction;
import hu.modembed.model.modembed.abstraction.behavior.BehaviorFactory;
import hu.modembed.model.modembed.abstraction.behavior.RootSequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author balage
 *
 */
public class SequentialBehaviorLinker implements ISymbolContext{

	private final RootSequentialBehavior result;
	
	public SequentialBehaviorLinker(DeviceAbstraction device) {
		result = BehaviorFactory.eINSTANCE.createRootSequentialBehavior();
		result.setDevice(device);
	}

	private final Map<String, SymbolAssignment> symbols = new LinkedHashMap<String, SymbolAssignment>();
	private final Map<String, SequentialBehaviorPart> functions = new HashMap<String, SequentialBehaviorPart>();

	private final Map<String, SymbolAssignment> resultSymbols = new LinkedHashMap<String, SymbolAssignment>();
	
	public void addModule(SequentialBehaviorModule module) {
		for(SymbolAssignment sa : module.getSymbolMappings()){
			symbols.put(sa.getSymbol(), sa);
		}
		for(SequentialBehaviorPart sbp : module.getBehaviorModels()){
			functions.put(sbp.getName(), sbp);
		}
	}

	public RootSequentialBehavior link(String entry) {
		LinkerPart part = new LinkerPart(this, getCallee(entry), Collections.<String>emptyList());
		result.getActions().addAll(part.link());
		return result;
	}

	@Override
	public SymbolAssignment getSymbol(String symbol) {
		if (resultSymbols.containsKey(symbol)){
			return resultSymbols.get(symbol);
		}
		if (symbols.containsKey(symbol)){
			SymbolAssignment s = symbols.get(symbol);
			SymbolAssignment sa = EcoreUtil.copy(s);
			resultSymbols.put(symbol, sa);
			return sa;
		}
		return null;
	}

	@Override
	public SequentialBehaviorPart getCallee(String name) {
		return functions.get(name);
	}

	@Override
	public void registerSymbol(SymbolAssignment sa) {
		result.getLocalSymbols().add(sa);
	}

}
