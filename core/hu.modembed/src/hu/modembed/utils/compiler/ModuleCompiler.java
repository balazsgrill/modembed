/**
 * 
 */
package hu.modembed.utils.compiler;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import hu.modembed.model.modembed.abstraction.DeviceAbstraction;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition;
import hu.modembed.model.modembed.core.object.AssemblerObject;
import hu.modembed.model.modembed.core.object.InstructionCall;
import hu.modembed.model.modembed.core.object.ObjectFactory;

/**
 * @author balazs.grill
 *
 */
public class ModuleCompiler {

	private final DeviceAbstraction device;
	private final Map<String, SequentialBehavior> sequences = new LinkedHashMap<String, SequentialBehavior>();
	final Map<String, SymbolValueAssignment> symbols = new LinkedHashMap<String, SymbolValueAssignment>();
	
	private OperationDefinition findOperation(DeviceAbstraction device, String operation, TypeSignature[] signature) throws Exception{
		for(OperationDefinition opdef : device.getOperation()){
			if (operation.equals(opdef.getOperation())){
				if (opdef.getArguments().size() == signature.length){
					boolean ok = true;
					for(int i=0;i<signature.length;i++) if(ok){
						ok = TypeSignature.create(opdef.getArguments().get(i)).isCompatible(signature[i]);
					}
					if (ok) return opdef;
				}
			}
		}
		if (device.getAncestor() != null){
			return findOperation(device.getAncestor(), operation, signature);
		}
		return null;
	}
	
	public OperationDefinition findOperation(String operation, TypeSignature[] signature) throws Exception{
		OperationDefinition opdef = findOperation(device, operation, signature);
		if (opdef != null) return opdef;
		StringBuilder sb = new StringBuilder();
		sb.append(operation);
		sb.append("(");
		boolean first = true;
		for(TypeSignature ts : signature){
			if (first) first = false;
			else sb.append(", ");
			sb.append(ts);
		}
		sb.append(")");
		throw new Exception("Could not find operation: "+sb.toString());
	}
	
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
		
		List<InstructionCall> list = new LinkedList<InstructionCall>();
		new SequenceCompiler(this, null, sequence).compile(list);
		asm.getInstructions().addAll(list);
		
		return asm;
	}
	
}
