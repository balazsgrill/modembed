/**
 * 
 */
package hu.e.compiler.internal;

import hu.e.compiler.ECompiler;
import hu.e.compiler.internal.linking.CodePlatform;
import hu.e.compiler.internal.linking.ComponentLinker;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.TypeDefinitionResolver;
import hu.e.compiler.internal.symbols.SymbolManager;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.ProgramList;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.FunctionBinarySection;

/**
 * @author balazs.grill
 *
 */
public class FunctionCompiler {

	private final FunctionBinarySection link;
	
	private final TypeDefinitionResolver memman;
	
	private final ComponentLinker linker;
	
	public FunctionCompiler(FunctionBinarySection link) {
		this.link = link;
		int memwidth = ECompiler.convertLiteral(link.getMemwidth());
		
		memman = new TypeDefinitionResolver(memwidth,link.getPointerType());
		linker = new ComponentLinker(link);
	}
	
	public ProgramList compile(ISymbolManager parentsm){
		ProgramList pl = ListFactory.eINSTANCE.createProgramList();
		SequenceStep root = ListFactory.eINSTANCE.createSequenceStep();
		root.setName("GLOBAL");
		pl.setStep(root);
		pl.setName(link.getName());
		CodePlatform platform = new CodePlatform(link, linker);
		SymbolManager sm = new SymbolManager(platform,parentsm,memman, root);

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
