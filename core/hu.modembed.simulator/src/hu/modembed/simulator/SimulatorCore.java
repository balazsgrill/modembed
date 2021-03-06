/**
 * 
 */
package hu.modembed.simulator;

import hu.modembed.model.modembed.core.instructionset.Instruction;
import hu.modembed.model.modembed.core.instructionset.InstructionParameter;
import hu.modembed.model.modembed.core.object.AssemblerObject;
import hu.modembed.model.modembed.core.object.InstructionCall;
import hu.modembed.model.modembed.core.object.InstructionCallParameter;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class SimulatorCore {

	private ICore core;
	private IWord programCounter;
	private boolean running = false;
	private InstructionCall[] code = null;
	private long[] labelToAddress = null;
	
	public boolean isRunning() {
		return running;
	}
	
	public void setCore(ICore core) {
		this.core = core;
	}
	
	public void setProgramCounter(IWord programCounter) {
		this.programCounter = programCounter;
	}
	
	public void setCode(AssemblerObject code) {
		/*
		 * Resolve program space. Every instruction is executed at its first word.
		 * Any other words is considered as NOP.
		 */
		int wordnum = 0;
		labelToAddress = new long[code.getInstructions().size()];
		for(InstructionCall call : code.getInstructions()){
			Instruction i = call.getInstruction();
			wordnum += i.getWords().size();
		}
		this.code = new InstructionCall[wordnum];
		wordnum = 0;
		int j = 0;
		for(InstructionCall call : code.getInstructions()){
			this.code[wordnum] = call;
			labelToAddress[j] = wordnum;
			Instruction i = call.getInstruction();
			wordnum += i.getWords().size();
			j++;
		}
	}
	
	private InstructionCall getInstruction(int address){
		return code[address];
	}
	
	private void execute(InstructionCall call) throws InstructionException{
		Instruction instruction = call.getInstruction();
		List<Class<?>> argumentTypes = new LinkedList<Class<?>>();
		List<Object> arguments = new LinkedList<Object>();
		Map<InstructionParameter, Long> values = new HashMap<InstructionParameter, Long>();
		for(InstructionCallParameter icp : call.getParameters()){
			long value = icp.getValue();
			if (icp.isLabel()){
				/* Resolve labels */
				if (value >= labelToAddress.length){
					/* Addressed out of code space */
					value = code.length;
				}else{
					value = labelToAddress[(int) value];
				}
			}
			values.put(icp.getDefinition(), value);
		}
		for(InstructionParameter ip : instruction.getParameters()){
			long value = ip.getDefaultValue();
			if (values.containsKey(ip)){
				value = values.get(ip);
			}
			argumentTypes.add(long.class);
			arguments.add(value);
		}
		if (SimulatorPlugin.debug){
			System.out.println(instruction.getName()+" "+arguments);
		}
		try {
			Method method = core.getClass().getMethod(instruction.getName(), argumentTypes.toArray(new Class<?>[argumentTypes.size()]));
			method.invoke(core, arguments.toArray());
		} catch (Exception e) {
			throw new InstructionException(programCounter.get(), e);
		}
	}
	
	public void start(){
		reset();
		running = true;
	}
	
	public void reset(){
		programCounter.set(0);
	}
	
	public void step() throws InstructionException{
		if (running){
			long pc = programCounter.get();
			if (pc < 0 || pc >= this.code.length){
				running = false; //Program left code space, it is ended
			}else{
				InstructionCall instructioncall = getInstruction((int)pc);
				// Null is considered as a NOP instruction
				programCounter.set(pc+1);
				if (instructioncall != null){
					execute(instructioncall);
				}else{
					if (SimulatorPlugin.debug){
						System.out.println("NULL instruction at "+pc);
					}
				}
			}
		}
	}
	
}
