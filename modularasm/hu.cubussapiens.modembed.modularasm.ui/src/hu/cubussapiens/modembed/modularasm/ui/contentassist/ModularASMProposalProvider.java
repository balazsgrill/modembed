/*
* generated by Xtext
*/
package hu.cubussapiens.modembed.modularasm.ui.contentassist;

import hu.cubussapiens.modembed.InstructionSetCache;
import hu.cubussapiens.modembed.MODembedCore;
import hu.cubussapiens.modembed.modularasm.indexer.IModuleIndexer;
import hu.cubussapiens.modembed.modularasm.indexer.IndexerPlugin;
import hu.cubussapiens.modembed.modularasm.modularASM.Function;
import hu.cubussapiens.modembed.modularasm.modularASM.Instance;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;
import hu.cubussapiens.modembed.modularasm.ui.internal.ModularASMActivator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import embedded.assembly.Field;
import embedded.assembly.Instruction;
import embedded.assembly.InstructionSet;
import embedded.assembly.Section;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class ModularASMProposalProvider extends AbstractModularASMProposalProvider {

	@Override
	public void complete_Instruction(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		if (model instanceof Function){
			InstructionSetCache cache = MODembedCore.getDefault().getInstructionSetCache();
			InstructionSet iset = cache.getCachedInstructionSet(((Module)(((Function)model).eContainer())).getTarget().getSegments());
			String prefix = context.getPrefix().toLowerCase();
			if (iset != null){
				for(embedded.assembly.Instruction i : iset.getInstructions()){
					if (i.getName().toLowerCase().startsWith(prefix)){
						ICompletionProposal cp = propose(i, context);
						acceptor.accept(cp);
					}
				}
			}
		}
		
		super.complete_Instruction(model, ruleCall, context, acceptor);
	}
	
	@Override
	public void completeModule_Target(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		if (model instanceof Module){
			String prefix = context.getPrefix();
			for(String s : MODembedCore.getDefault().getArchitectures()){
				if (s.startsWith(prefix)){
					String name = MODembedCore.getDefault().getArchName(s);
					acceptor.accept(createCompletionProposal(s, s+" - "+name, getImage(ModularASMActivator.IMAGE_ARCHITECTURE), context));
				}
			}
		}
		
		super.completeModule_Target(model, assignment, context, acceptor);
	}
	
	private IModuleIndexer getIndexer(EObject model){
		String ps = model.eResource().getURI().toPlatformString(true);
		if (ps.startsWith("/")) ps=ps.substring(1);
		int i = ps.indexOf('/');
		if (i != -1){
			ps = ps.substring(0,i);
		}
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(ps);
		return IndexerPlugin.getDefault().getProjectIndexer(project);
	}
	
	@Override
	public void completeQualifiedID_Segments(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		
		Instance instance = null;
		List<String> segments = new ArrayList<String>();
		String prefix = context.getPrefix();
		String prefixlc = prefix.toLowerCase();
		if (model instanceof Instance){
			instance = (Instance)model;
		}
		if (model instanceof QualifiedID){
			QualifiedID qid = (QualifiedID)model;
			for(int i=0;i<qid.getSegments().size()-1;i++){
				segments.add(qid.getSegments().get(i));
			}
			if (segments.size() > 0){
				if (prefix.equals(segments.get(segments.size()-1))){
					segments.remove(segments.size()-1);
				}
			}
			if (qid.eContainer() instanceof Instance){
				instance = (Instance)qid.eContainer();
			}
		}
		
		if (instance != null){
			IModuleIndexer indexer = getIndexer(model);
			
			for(String s : indexer.getModules(segments)){
				if (s.toLowerCase().startsWith(prefixlc)){
					acceptor.accept(createCompletionProposal(s, context));
				}
			}
			for(String s : indexer.getSubPackages(segments)){
				if (s.toLowerCase().startsWith(prefixlc)){
					acceptor.accept(createCompletionProposal(s, context));
				}
			}
		}
		
		super.completeQualifiedID_Segments(model, assignment, context, acceptor);
	}
	
	private ICompletionProposal propose(Instruction instruction, ContentAssistContext context){
		StringBuilder sb = new StringBuilder();
		sb.append(instruction.getName());
		Set<String> params = new HashSet<String>();
		for(Section s : instruction.getSections()){
			if (s instanceof Field){
				Field f = (Field)s;
				String p = f.getParameter();
				if (p != null && !p.isEmpty() && !params.contains(p)){
					params.add(p);
					sb.append(" ");
					sb.append(p);
				}
			}
		}
		return createCompletionProposal(instruction.getName(), sb.toString(), getImage(ModularASMActivator.IMAGE_INSTRUCTION), context);
	}
	
	private Image getImage(String ID){
		return ModularASMActivator.getInstance().getImageRegistry().get(ID);
	}
	
}
