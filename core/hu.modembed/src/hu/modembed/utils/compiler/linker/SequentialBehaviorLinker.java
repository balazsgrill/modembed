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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author balage
 *
 */
public class SequentialBehaviorLinker implements ISymbolContext{

	private final RootSequentialBehavior result;
	
	@Override
	public String basePrefix() {
		return "";
	}
	
	public SequentialBehaviorLinker() {
		result = BehaviorFactory.eINSTANCE.createRootSequentialBehavior();
	}

	private final Set<String> globalSymbols = new HashSet<String>();
	private final Map<String, SequentialBehaviorPart> functions = new HashMap<String, SequentialBehaviorPart>();

	private final Map<String, Integer> callCounts = new HashMap<String, Integer>(); 
	
	private List<DeviceAbstraction> getClosure(DeviceAbstraction d){
		if (d.getAncestor() == null) return Collections.singletonList(d);
		List<DeviceAbstraction> parent = getClosure(d.getAncestor());
		List<DeviceAbstraction> result = new ArrayList<DeviceAbstraction>(parent.size()+1);
		result.addAll(parent);
		result.add(d);
		return result;
	}
	
	private DeviceAbstraction getSpecific(DeviceAbstraction d1, DeviceAbstraction d2){
		List<DeviceAbstraction> c1 = getClosure(d1);
		if (c1.contains(d2)){
			return d1;
		}
		List<DeviceAbstraction> c2 = getClosure(d2);
		if (c2.contains(d1)){
			return d2;
		}
		return null;
	}
	
	public void addModule(SequentialBehaviorModule module) {
		if (module.getDevice() != null){
			if (result.getDevice() == null){
				result.setDevice(module.getDevice());
			}else{
				DeviceAbstraction d1 = result.getDevice();
				DeviceAbstraction d2 = module.getDevice();
				DeviceAbstraction spec = getSpecific(d1,d2);
				if (spec == null){
					throw new IllegalArgumentException("Devices "+d1.getName()+" and "+d2.getName()+" are not compatible!"); 
				}else{
					result.setDevice(spec);
				}
			}
		}
		
		for(SymbolAssignment sa : module.getSymbolMappings()){
			globalSymbols.add(sa.getSymbol());
			registerSymbol(EcoreUtil.copy(sa));
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
	public String getSymbol(String symbol) {
		return symbol;
	}

	@Override
	public SequentialBehaviorPart getCallee(String name) {
		return functions.get(name);
	}

	@Override
	public void registerSymbol(SymbolAssignment sa) {
		result.getLocalSymbols().add(sa);
	}

	@Override
	public int countCalls(String callee) {
		Integer i = callCounts.get(callee);
		if (i == null){
			i = 0;
		}
		callCounts.put(callee, i+1);
		return i;
	}
	
}
