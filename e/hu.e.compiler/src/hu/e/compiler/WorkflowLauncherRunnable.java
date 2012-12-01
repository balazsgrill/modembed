/**
 * 
 */
package hu.e.compiler;

import hu.modembed.model.core.workflow.Task;
import hu.modembed.model.core.workflow.Workflow;
import hu.modembed.model.core.workflow.WorkflowTask;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;


/**
 * @author balazs.grill
 *
 */
public class WorkflowLauncherRunnable{

	private final ResourceSet resourceSet;
	
	private final Workflow workflow;
	
	public WorkflowLauncherRunnable(URI workflow) {
		this.resourceSet = new ResourceSetImpl();
		
		Resource r = resourceSet.getResource(workflow, true);
		if (r == null || r.getContents().isEmpty()) throw new RuntimeException("Workflow model is empty!");
		
		Object o = r.getContents().get(0);
		if (o instanceof Workflow){
			this.workflow = (Workflow)o;
		}else{
			throw new RuntimeException("Invalid workflow model!");
		}
	}
	
	public void execute(IProgressMonitor monitor){
		monitor.beginTask("Executing workflow..", workflow.getTasks().size()*100);
		
		for(WorkflowTask task : workflow.getTasks()){
			IProgressMonitor subprogress = new SubProgressMonitor(monitor, 100);
			
			if (task instanceof Task){
				System.out.println("Executing "+((Task) task).getType());
			}
		}
		
		monitor.done();
	}


	
}
