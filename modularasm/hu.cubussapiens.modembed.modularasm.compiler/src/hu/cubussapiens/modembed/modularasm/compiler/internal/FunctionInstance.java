/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.internal;

import hu.cubussapiens.modembed.modularasm.compiler.CompilerException;
import hu.cubussapiens.modembed.modularasm.compiler.internal.InstructionManager.InstructionWord;
import hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.ISymbol;
import hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.LiteralSymbol;
import hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.RelativeSymbol;
import hu.cubussapiens.modembed.modularasm.modularASM.Function;
import hu.cubussapiens.modembed.modularasm.modularASM.Instruction;
import hu.cubussapiens.modembed.modularasm.modularASM.Label;
import hu.cubussapiens.modembed.modularasm.modularASM.LiteralParam;
import hu.cubussapiens.modembed.modularasm.modularASM.Param;
import hu.cubussapiens.modembed.modularasm.modularASM.RefParam;
import hu.cubussapiens.modembed.modularasm.modularASM.Step;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author balage
 *
 */
public class FunctionInstance {
	
	public final ModuleInstance minstance;
	public final Function function;
	
	public FunctionInstance(ModuleInstance minstance, Function function) {
		this.function = function;
		this.minstance = minstance;
	}
	
	public ISymbol rootSymbol;
	
	public final Map<String, ISymbol> labels = new HashMap<String, ISymbol>();
	
	private int length = 0;
	
	public void prepare() throws CompilerException{

		length = 0;
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
		 * Get words
		 */
		words = new ArrayList<InstructionManager.InstructionWord>();
		for(Step step : function.getStep()){
			if (step instanceof Instruction){
				Instruction inst = (Instruction)step;
				InstructionWord iw = minstance.manager.insManager.createInstructionWord(inst.getIns());
				if (iw == null) throw new CompilerException("Unknown instruction: "+inst.getIns());
				words.add(iw);
				List<Param> params = inst.getParams();
				iw.setParamSymbols(resolveParams(params));
			}
		}
	}
	
	private ISymbol resolveParam(Param param) throws CompilerException{
		if (param instanceof LiteralParam){
			return new LiteralSymbol(((LiteralParam) param).getValue());
		}
		if (param instanceof RefParam){
			List<String> refs = ((RefParam) param).getRef().getSegments();
			if (refs.size() == 1){
				/*
				 * Check if there is a label defined in this function
				 */
				String l = refs.get(0);
				ISymbol s = labels.get(l);
				if (s != null) return s;
			}
			return minstance.resolveReference(((RefParam) param).getRef());
		}
		throw new CompilerException("Could not resolve param!");
	}
	
	private ISymbol[] resolveParams(List<Param> params) throws CompilerException{
		ISymbol[] result = new ISymbol[params.size()];
		for(int i=0;i<result.length;i++){
			result[i] = resolveParam(params.get(i));
		}
		return result;
	}
	
	private List<InstructionWord> words;
	
	public int getLength() {
		return length;
	}
	
	public int address = -1;
	
	public long[] calculateWords() throws CompilerException{
		long[] result = new long[length];
		int i = 0;
		for(InstructionWord iw : words){
			long[] w = iw.getWords();
			System.arraycopy(w, 0, result, i, w.length);
			i += w.length;
		}
		return result;
	}
	
	public String getRootReference(){
		String r = minstance.getRootReference(); 
		return (r.isEmpty() ? "" : r+".")+function.getName();
	}
	
}
