/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal;

import java.util.ArrayList;
import java.util.List;

import hu.cubussapiens.modembed.modularasm.builder.internal.symbols.ISymbol;
import hu.cubussapiens.modembed.modularasm.modularASM.Function;
import hu.cubussapiens.modembed.modularasm.modularASM.Instruction;
import hu.cubussapiens.modembed.modularasm.modularASM.Label;
import hu.cubussapiens.modembed.modularasm.modularASM.Step;

/**
 * @author balage
 *
 */
public class FunctionInstance {

	public int[] rawbytes;
	
	public class SymbolRef {
		
		public ISymbol symbol;
		
		public int inbyte;
		
		public int startbit;
		
		public int mask;
		
	}
	
	public final List<SymbolRef> symbolrefs = new ArrayList<FunctionInstance.SymbolRef>();
	
	public final ModuleInstance minstance;
	public final Function function;
	
	public FunctionInstance(ModuleInstance minstance, Function function) {
		this.function = function;
		this.minstance = minstance;
	}
	
	public ISymbol rootSymbol;
	
	public void prepare(){
		rawbytes = new int[0];
		symbolrefs.clear();
		for(Step step : function.getStep()){
			if (step instanceof Label){
				
			}else
			if (step instanceof Instruction){
				
			}
			
		}
	}
	
	public int[] calculateBytes(int baseAddr){
		return null;
	}
	
}
