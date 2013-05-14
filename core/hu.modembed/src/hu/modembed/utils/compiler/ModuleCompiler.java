/**
 * 
 */
package hu.modembed.utils.compiler;

import java.util.LinkedHashMap;
import java.util.Map;

import hu.modembed.model.modembed.abstraction.DeviceAbstraction;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.core.object.AssemblerObject;
import hu.modembed.model.modembed.core.object.ObjectFactory;

/**
 * @author balazs.grill
 *
 */
public class ModuleCompiler {

	private final DeviceAbstraction device;
	private final Map<String, SequentialBehavior> sequences = new LinkedHashMap<String, SequentialBehavior>();
	private final Map<String, SymbolValueAssignment> symbols = new LinkedHashMap<String, SymbolValueAssignment>();
	
	public ModuleCompiler(DeviceAbstraction device) {
		this.device = device;
		
	}
	
	public void addModule(SequentialBehaviorModule module) throws Exception{
		//TODO check device
		for(SequentialBehavior sb : module.getBehaviorModels()){
			if (sequences.containsKey(sb.getName())){
				throw new Exception("Duplicate definition of '"+sb.getName()+"'");
			}
			sequences.put(sb.getName(), sb);
		}
		for(SymbolValueAssignment sv : module.getSymbolMappings()){
			if (symbols.containsKey(sv.getSymbol())){
				throw new Exception("Duplicate definition of '"+sv.getSymbol()+"'");
			}
			symbols.put(sv.getSymbol(), sv);
		}
	}
	
	public AssemblerObject compile(String entry) throws Exception{
		AssemblerObject asm = ObjectFactory.eINSTANCE.createAssemblerObject();
		
		SequentialBehavior sequence = sequences.get(entry);
		if (sequence == null){
			throw new Exception("Could not find entry point: "+entry);
		}
		
		
		
		return asm;
	}
	
}
