/**
 * 
 */
package hu.e.compiler.internal;

import hu.e.compiler.ECompiler;
import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.AddressedStep;
import hu.e.compiler.internal.model.CompilationErrorEntry;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.InstructionWordInstance;
import hu.e.compiler.internal.model.LabelStep;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.symbols.SymbolManager;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.FunctionMemory;
import hu.modembed.hexfile.persistence.HexFileResource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class FunctionCompiler {

	private final FunctionBinarySection link;
	
	private final MemoryManager memman;
	
	public FunctionCompiler(FunctionBinarySection link) {
		this.link = link;
		memman = new MemoryManager(ECompiler.convertLiteral(link.getMemwidth()));
		for(FunctionMemory fm : link.getMems()){
			memman.addSegment(ECompiler.convertLiteral(fm.getStart()), ECompiler.convertLiteral(fm.getEnd()));
		}
	}
	
	private List<IProgramStep> steps;
	
	public List<IProgramStep> getSteps() {
		return steps;
	}
	
	public byte[] compile(ISymbolManager parentsm){
		SymbolManager sm = new SymbolManager(parentsm,memman);
		
		OperationCompiler opc = new OperationCompiler(link.getOperation());
		List<IProgramStep> ps = opc.compile(sm);
		this.steps = ps;
		
		//Linking
		int progsize = 0;
		
		try{
			ISymbol startsymbol = sm.resolve((link.getStart()));
			if (!startsymbol.isLiteral()) throw new RuntimeException("Start address of binary block cannot be accessed in compile time!");
			int startAddr = ((ILiteralSymbol)startsymbol).getValue();
			Map<LabelStep, Integer> labelAddr = new HashMap<LabelStep, Integer>();
			for(IProgramStep s : ps){
				if (s instanceof LabelStep){
					labelAddr.put((LabelStep)s,startAddr);
				}
				if (s instanceof AddressedStep){
					((AddressedStep) s).address = startAddr;
				}
				if (s instanceof InstructionWordInstance){
					progsize += ((InstructionWordInstance) s).getWidth();
					startAddr++;
				}

			}

			//Resolve labels
			sm.setLabelAddresses(labelAddr);
		}catch(ECompilerException e){
			ps.add(CompilationErrorEntry.create(e));
		}
		
		//Produce instruction bytes
		byte[] data = new byte[progsize];
		int i = 0;
		for(IProgramStep s : ps){
			if (s instanceof InstructionWordInstance){
				int wordbytes = ((InstructionWordInstance) s).getWidth();
				int d = ((InstructionWordInstance) s).getValue();
				for(int j=0;j<wordbytes;j++){
					int b = (int)(d&0xFF);
					d = d>>8;
					//Reversed byte order (for now, it seems that 
					// forward byte order should be used)
					//int index = i + (wordbytes-1-j);
					int index = i + j;
					data[index] = HexFileResource.intToByte(b);
				}
				i+=wordbytes;
			}
		}
		
		return data;
	}
	
}
