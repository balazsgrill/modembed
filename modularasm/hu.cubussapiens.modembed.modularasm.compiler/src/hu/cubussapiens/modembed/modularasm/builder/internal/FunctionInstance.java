/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hu.cubussapiens.modembed.modularasm.builder.internal.symbols.ISymbol;
import hu.cubussapiens.modembed.modularasm.builder.internal.symbols.RelativeSymbol;
import hu.cubussapiens.modembed.modularasm.modularASM.Function;
import hu.cubussapiens.modembed.modularasm.modularASM.Instruction;
import hu.cubussapiens.modembed.modularasm.modularASM.Label;
import hu.cubussapiens.modembed.modularasm.modularASM.Step;

/**
 * @author balage
 *
 */
public class FunctionInstance {

	public long[] rawwords;
	
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
	
	public final Map<String, ISymbol> labels = new HashMap<String, ISymbol>();
	
	public void prepare(){
		rawwords = new long[0];
		symbolrefs.clear();
		int length = 0;
		/*
		 * Get labels
		 */
		for(Step step : function.getStep()){
			if (step instanceof Label){
				Label l = (Label)step;
				RelativeSymbol rl = new RelativeSymbol(rootSymbol, length);
				labels.put(l.getName(), rl);
			}else
			if (step instanceof Instruction){
				Instruction inst = (Instruction)step;
				length += minstance.manager.insManager.getInstructionNumOfWords(inst.getIns());
			}
		}
		
		/*
		 * Calculate words
		 */
		for(Step step : function.getStep()){
			if (step instanceof Instruction){
				Instruction inst = (Instruction)step;
				length += minstance.manager.insManager.getInstructionNumOfWords(inst.getIns());
				
			}
		}
	}
	
	
	
	public long[] calculateBytes(){
		return null;
	}
	
}
