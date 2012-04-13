/**
 * 
 */
package hu.e.compiler.internal;

import hu.e.compiler.ECompiler;
import hu.e.compiler.internal.linking.CodePlatform;
import hu.e.compiler.internal.linking.ComponentLinker;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.symbols.SymbolManager;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.ProgramList;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.FunctionMemory;

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
		pl.setName(link.getName());
		SymbolManager sm = new SymbolManager(new CodePlatform(linker, link.getLib()),parentsm,memman, root);

//		for(Variable v : linker.getGlobals()){
//			try {
//				sm.getSymbol(v);
//			} catch (ECompilerException e) {
//				root.getSteps().add(CompilationErrorEntry.create(e));
//			}
//		}
		
		BlockCompiler bc = new BlockCompiler(link.getDo());
		root.getSteps().add(bc.compile(sm));
		
		return pl;
	}
	
}
