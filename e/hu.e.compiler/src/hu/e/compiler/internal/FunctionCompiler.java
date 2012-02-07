/**
 * 
 */
package hu.e.compiler.internal;

import hu.e.compiler.ECompiler;
import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.linking.CodePlatform;
import hu.e.compiler.internal.linking.ComponentLinker;
import hu.e.compiler.internal.model.CompilationErrorEntry;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.InstructionWordInstance;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.symbols.SymbolManager;
import hu.e.compiler.list.LabelStep;
import hu.e.compiler.list.ProgramStep;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.FunctionMemory;
import hu.e.parser.eSyntax.Library;
import hu.modembed.hexfile.persistence.HexFileResource;

import java.util.ArrayList;
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
	
	private final ComponentLinker linker;
	
	public FunctionCompiler(FunctionBinarySection link) {
		this.link = link;
		int memwidth = ECompiler.convertLiteral(link.getMemwidth());
		int pointersize = ECompiler.convertLiteral(link.getPointersize())/memwidth;
		memman = new MemoryManager(memwidth,pointersize);
		for(FunctionMemory fm : link.getMems()){
			memman.addSegment(ECompiler.convertLiteral(fm.getStart()), ECompiler.convertLiteral(fm.getEnd()));
		}
		linker = new ComponentLinker(link);
	}
	
	private List<ProgramStep> steps;
	
	public List<ProgramStep> getSteps() {
		return steps;
	}
	
	public byte[] compile(ISymbolManager parentsm){
		List<ProgramStep> ps = new ArrayList<ProgramStep>();
		SymbolManager sm = new SymbolManager(new CodePlatform(linker, new ArrayList<Library>()),parentsm,memman);
//		TODO: Handle globals
//		for(Variable v : plinker.getGlobals()){
//			try {
//				sm.getSymbol(v);
//			} catch (ECompilerException e) {
//				ps.add(CompilationErrorEntry.create(e));
//			}
//		}
		
		BlockCompiler bc = new BlockCompiler(link.getDo());
		ps.add(bc.compile(sm));
		this.steps = ps;
		
		//Linking
		int progsize = 0;
		
		try{
			ISymbol startsymbol = sm.resolve((link.getStart()));
			if (!startsymbol.isLiteral()) throw new RuntimeException("Start address of binary block cannot be accessed in compile time!");
			int startAddr = ((ILiteralSymbol)startsymbol).getValue();
			Map<LabelStep, Integer> labelAddr = new HashMap<LabelStep, Integer>();
			for(ProgramStep s : ps){
				if (s instanceof LabelStep){
					labelAddr.put((LabelStep)s,startAddr);
				}
//				if (s instanceof AddressedStep){
//					((AddressedStep) s).address = startAddr;
//				}
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
		for(ProgramStep s : ps){
			if (s instanceof InstructionWordInstance){
				int wordbytes = ((InstructionWordInstance) s).getWidth();
				int d = 0;
				try {
					d = ((InstructionWordInstance) s).getValue();
				} catch (ECompilerException e) {
					e.printStackTrace();
				}
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
