/**
 * 
 */
package hu.e.compiler.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.modembed.model.architecture.Architecture;
import hu.modembed.model.architecture.MemorySection;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.LibraryElement;
import hu.modembed.model.emodel.Variable;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author balazs.grill
 *
 */
public class L1ToL0Task implements IModembedTask {

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	public static final String ENTRY = "entry";
	public static final String ARCH = "architecture";
	
	private class MemoryManager{
		
		private final List<MemorySection> sections = new ArrayList<MemorySection>();
		
		private final Map<Variable, Integer> addresses = new HashMap<Variable, Integer>();
		
		public MemoryManager(Architecture arch) {
			for(MemorySection msec : arch.getMemory()){
				if (!msec.isProgram()){
					sections.add(msec);
				}
			}
		}
		
		public void begin(){
			
		}
		
		public void allocate(Variable v){
			
		}
		
		public void end(){
			
		}
		
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		String inputmodel = context.getParameterValue(INPUT).get(0);
		String outputmodel = context.getParameterValue(OUTPUT).get(0);
		String entry = context.getParameterValue(ENTRY).get(0);
		String archmodel = context.getParameterValue(ARCH).get(0);
		
		Resource inr = context.getInput(context.getModelURI(inputmodel));
		Resource outr = context.getOutput(context.getModelURI(outputmodel));
		Resource archr = context.getInput(context.getModelURI(archmodel));
		
		Architecture arch = (Architecture) archr.getContents().get(0);
		
		EObject lib = inr.getContents().get(0);
		Assert.isLegal(lib instanceof Library);
		Library inlib = (Library)lib;
		
		Library outlib = EcoreUtil.copy(inlib);
		outlib.setName(outputmodel);
		outr.getContents().add(outlib);
		TaskUtils.addOrigin(outlib, inlib);
		
		Function main = null;
		for(LibraryElement le : outlib.getContent()){
			if (le instanceof Function){
				if (entry.equals(le.getName())){
					main = (Function)le;
				}
			}
		}
		
		if (main == null){
			context.logStatus(TaskUtils.error("Could not find entry point: "+entry));
			return;
		}
		
		
	}

}
