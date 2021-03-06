/**
 * 
 */
package hu.modembed.simulator;

import hu.modembed.model.modembed.abstraction.behavior.SymbolAddressAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolMap;
import hu.modembed.model.modembed.core.object.AssemblerObject;

/**
 * @author balazs.grill
 *
 */
public class DeviceSimulator {
	
	private final SimulatorCore simulator;
	private final IDevice device;
	private final SymbolMap symbolMap;
	
	public DeviceSimulator(IDevice device, AssemblerObject program, SymbolMap symbolMap) {
		this.device = device;
		this.simulator = new SimulatorCore();
		simulator.setCore(device.getCore());
		simulator.setProgramCounter(device.getProgramCounter());
		simulator.setCode(program);
		this.symbolMap = symbolMap;
	}
	
	public IDevice getDevice() {
		return device;
	}
	
	public int execute(long maxCycles) throws InstructionException{
		simulator.start();
		long counter = 0;
		while(simulator.isRunning()){
//			System.out.println("->"+counter);
//			printState();
			if (counter >= maxCycles){
				return 1;
			}
			simulator.step();
			if (SimulatorPlugin.debug) printState();
			counter++;
		}
		return 0;
	}
	
	protected void printState(){
		System.out.println(device.getProgramCounter()+"{");
		for(SymbolAddressAssignment saa : symbolMap.getSymbolMappings()){
			String symbol = saa.getSymbol();
			System.out.println("\t"+symbol+" = "+getSymbolValue(symbol));
		}
		System.out.println("}");
	}
	
	public long getSymbolAddress(String symbol) throws IllegalArgumentException{
		long address = -1;
		if (symbolMap != null){
			for(SymbolAddressAssignment saa : symbolMap.getSymbolMappings()){
				if (symbol.equals(saa.getSymbol())){
					address = saa.getAddress();
				}
			}
		}
		if (address == -1) throw new IllegalArgumentException("No shuch symbol: "+symbol);
		
		return address;
	}
	
	public long getValueByAddress(long address){
		return device.getMemory().getValue(address);
	}
	
	public long getSymbolValue(String symbol) throws IllegalArgumentException{
		long address = getSymbolAddress(symbol);
		
		return getValueByAddress(address);
	}
	
}
