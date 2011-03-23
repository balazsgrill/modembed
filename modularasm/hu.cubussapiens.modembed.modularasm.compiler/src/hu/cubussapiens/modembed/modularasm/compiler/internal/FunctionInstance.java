/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.internal;

import hu.cubussapiens.modembed.modularasm.compiler.CompilerException;
import hu.cubussapiens.modembed.modularasm.compiler.MASMCompilerPlugin;
import hu.cubussapiens.modembed.modularasm.compiler.internal.InstructionManager.InstructionWord;
import hu.cubussapiens.modembed.modularasm.compiler.internal.namespaces.Namespace;
import hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.ISymbol;
import hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.LiteralSymbol;
import hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.RelativeSymbol;
import hu.cubussapiens.modembed.modularasm.modularASM.Function;
import hu.cubussapiens.modembed.modularasm.modularASM.InsParam;
import hu.cubussapiens.modembed.modularasm.modularASM.Instruction;
import hu.cubussapiens.modembed.modularasm.modularASM.Label;
import hu.cubussapiens.modembed.modularasm.modularASM.LiteralParam;
import hu.cubussapiens.modembed.modularasm.modularASM.MethodCall;
import hu.cubussapiens.modembed.modularasm.modularASM.MethodCallParam;
import hu.cubussapiens.modembed.modularasm.modularASM.MethodParam;
import hu.cubussapiens.modembed.modularasm.modularASM.RefParam;
import hu.cubussapiens.modembed.modularasm.modularASM.Step;

import java.util.ArrayList;
import java.util.List;

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
		this.context = new MethodContext(minstance);
	}
	
	public ISymbol rootSymbol;
	
	public final MethodContext context;
	
	private int length = 0;
	
	private int calculateStepLengthForLabels(Step step, int baselength, MethodContext context) throws CompilerException{
		int length = baselength;
		if (step instanceof Label){
			Label l = (Label)step;
			RelativeSymbol rl = new RelativeSymbol(rootSymbol, length);
			context.labels.put(l.getName(), rl);
		}else
		if (step instanceof Instruction){
			Instruction inst = (Instruction)step;
			length += minstance.manager.insManager.getInstructionNumOfWords(inst.getIns());
		}else
		if (step instanceof MethodCall){
			MethodCall mc = (MethodCall)step;
			MethodDescriptor md = context.resolveMethod(mc.getMethod().getSegments());
			MethodContext subcontext = new MethodContext(context, md);
			List<MethodParam> params = md.method.getParams();
			List<MethodCallParam> paramvalues = mc.getParams();
			if (params.size() != paramvalues.size())
				throw new CompilerException("Invalid number of parameters for "+MASMCompilerPlugin.qualIDtoString(mc.getMethod()));
			for(int i = 0;i<params.size();i++){
				MethodParam p = params.get(i);
				MethodCallParam v = paramvalues.get(i);
				Namespace vi = context.resolveNamespace(v.getRef().getSegments());
				/* TODO FIXME check if given instance has the required type! */
				subcontext.parameters.put(p.getName(), vi);
			}
			
			context.subcontexts.put(mc, subcontext);
			for(Step substep : md.method.getStep()){
				length = calculateStepLengthForLabels(substep, length, subcontext);
			}
		}
		return length;
	}
	
	private void collectInstructionWords(List<InstructionWord> result, Step step, MethodContext context) throws CompilerException{
		if (step instanceof Instruction){
			Instruction inst = (Instruction)step;
			InstructionWord iw = minstance.manager.insManager.createInstructionWord(inst.getIns());
			if (iw == null) throw new CompilerException("Unknown instruction: "+inst.getIns());
			result.add(iw);
			List<InsParam> params = inst.getParams();
			iw.setParamSymbols(resolveParams(params, context));
		}else
		if (step instanceof MethodCall){
			MethodCall mc = (MethodCall)step;
			MethodDescriptor md = context.resolveMethod(mc.getMethod().getSegments());
			MethodContext subcontext = context.subcontexts.get(mc);
			for(Step substep : md.method.getStep()){
				collectInstructionWords(result, substep, subcontext);
			}
		}
	}
	
	public void prepare() throws CompilerException{

		length = 0;
		/*
		 * Get labels
		 */
		for(Step step : function.getStep()){
			length = calculateStepLengthForLabels(step, length, context);
		}
		
		/*
		 * Get words
		 */
		words = new ArrayList<InstructionManager.InstructionWord>();
		for(Step step : function.getStep()){
			collectInstructionWords(words, step, context);
		}
	}
	
	private ISymbol resolveParam(InsParam param, MethodContext context) throws CompilerException{
		if (param instanceof LiteralParam){
			return new LiteralSymbol(((LiteralParam) param).getValue());
		}
		if (param instanceof RefParam){
			return context.resolveSymbol(((RefParam) param).getRef().getSegments());
		}
		throw new CompilerException("Could not resolve param!");
	}
	
	private ISymbol[] resolveParams(List<InsParam> params, MethodContext context) throws CompilerException{
		ISymbol[] result = new ISymbol[params.size()];
		for(int i=0;i<result.length;i++){
			result[i] = resolveParam(params.get(i), context);
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
