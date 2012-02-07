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
import hu.e.compiler.internal.symbols.SymbolManager;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.ProgramList;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.FunctionMemory;
import hu.e.parser.eSyntax.LinkedBinary;
import hu.e.parser.eSyntax.Variable;

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
		int pointersize = ECompiler.convertLiteral(link.getPointersize());
		
		pointersize = (pointersize/memwidth) + ((pointersize%memwidth==0) ? 0 : 1);
		
		memman = new MemoryManager(memwidth,pointersize);
		for(FunctionMemory fm : link.getMems()){
			memman.addSegment(ECompiler.convertLiteral(fm.getStart()), ECompiler.convertLiteral(fm.getEnd()));
		}
		linker = new ComponentLinker(link);
	}
	
	public ProgramList compile(ISymbolManager parentsm){
		ProgramList pl = ListFactory.eINSTANCE.createProgramList();
		SequenceStep root = ListFactory.eINSTANCE.createSequenceStep();
		root.setName("GLOBAL");
		pl.setStep(root);
		pl.setName(((LinkedBinary)link.eContainer()).getName());
		SymbolManager sm = new SymbolManager(new CodePlatform(linker, link.getLib()),parentsm,memman);

		for(Variable v : linker.getGlobals()){
			try {
				sm.getSymbol(v);
			} catch (ECompilerException e) {
				root.getSteps().add(CompilationErrorEntry.create(e));
			}
		}
		
		BlockCompiler bc = new BlockCompiler(link.getDo());
		root.getSteps().add(bc.compile(sm));
		
		return pl;
		
//		//Linking
//		int progsize = 0;
//		
//		try{
//			ISymbol startsymbol = sm.resolve((link.getStart()));
//			if (!startsymbol.isLiteral()) throw new RuntimeException("Start address of binary block cannot be accessed in compile time!");
//			int startAddr = ((ILiteralSymbol)startsymbol).getValue();
//			Map<LabelStep, Integer> labelAddr = new HashMap<LabelStep, Integer>();
//			for(ProgramStep s : ps){
//				if (s instanceof LabelStep){
//					labelAddr.put((LabelStep)s,startAddr);
//				}
//				if (s instanceof InstructionStep){
//					progsize += ((InstructionStep) s).getWidth();
//					startAddr++;
//				}
//
//			}
//
//			//Resolve labels
//			sm.setLabelAddresses(labelAddr);
//		}catch(ECompilerException e){
//			ps.add(CompilationErrorEntry.create(e));
//		}
//		
//		//Produce instruction bytes
//		byte[] data = new byte[progsize];
//		int i = 0;
//		for(ProgramStep s : ps){
//			if (s instanceof InstructionWordInstance){
//				int wordbytes = ((InstructionWordInstance) s).getWidth();
//				int d = 0;
//					d = ((InstructionWordInstance) s).getValue();
//				for(int j=0;j<wordbytes;j++){
//					int b = (int)(d&0xFF);
//					d = d>>8;
//					//Reversed byte order (for now, it seems that 
//					// forward byte order should be used)
//					//int index = i + (wordbytes-1-j);
//					int index = i + j;
//					data[index] = HexFileResource.intToByte(b);
//				}
//				i+=wordbytes;
//			}
//		}
//		
//		return data;
	}
	
}
