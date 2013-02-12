/**
 * 
 */
package hu.e.compiler;

import hu.modembed.model.core.workflow.Task;
import hu.modembed.model.core.workflow.TaskParameter;
import hu.modembed.model.core.workflow.Workflow;
import hu.modembed.model.core.workflow.WorkflowTask;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
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

	public static final String EPID = "hu.e.compiler.tasks";
	
	private final ResourceSet resourceSet;
	
	private final Workflow workflow;
	private final IFile workflowFile;
	
	
	private class TaskContext implements ITaskContext{

		private final Task task;
		
		public TaskContext(Task task) {
			this.task = task;
		}
		
		List<Resource> outputs = new LinkedList<Resource>();
		
		MultiStatus status = new MultiStatus(ECompilerPlugin.PLUGIN_ID, 0, "Status", null);
		
		@Override
		public Resource getInput(URI uri) {
			return resourceSet.getResource(uri, true);
		}

		@Override
		public Resource getOutput(URI uri) {
			Resource r = resourceSet.createResource(uri);
			outputs.add(r);
			return r;
		}

		@Override
		public URI getModelURI(String qualifiedName) {
			return WorkflowLauncherRunnable.this.getFileURI(qualifiedName);
		}

		@Override
		public void logStatus(IStatus status) {
			this.status.add(status);
		}

		@Override
		public List<String> getParameterValue(String key) {
			for(TaskParameter tp : task.getParameters()){
				if (key.equals(tp.getName())){
					return Collections.unmodifiableList(tp.getValue());
				}
			}
			return Collections.emptyList();
		}

		@Override
		public URI getFileURI(String path) {
			IContainer container = workflowFile.getParent();
			IFile file = container.getFile(new Path(path));
			return URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		}
		
	}
	
	public static WorkflowLauncherRunnable create(IProject project, String workflowname){
		URI uri = TaskUtils.findModelURI(project, workflowname);
		return (uri == null) ? null : new WorkflowLauncherRunnable(uri);
	}
	
	public WorkflowLauncherRunnable(URI workflow) {
		this.resourceSet = new ResourceSetImpl();
		
		String fileString = workflow.toPlatformString(true);
		IFile file = (IFile)ResourcesPlugin.getWorkspace().getRoot().findMember(fileString);
		this.workflowFile = file;
		
		Resource r = resourceSet.getResource(workflow, true);
		if (r == null || r.getContents().isEmpty()) throw new RuntimeException("Workflow model is empty!");
		
		Object o = r.getContents().get(0);
		if (o instanceof Workflow){
			this.workflow = (Workflow)o;
		}else{
			throw new RuntimeException("Invalid workflow model!");
		}
	}
	
	public IStatus execute(IProgressMonitor monitor){
		monitor.beginTask("Executing workflow..", workflow.getTasks().size()*100);
		
		MultiStatus status = new MultiStatus(ECompilerPlugin.PLUGIN_ID, 0, "Status", null);
		
		for(WorkflowTask task : workflow.getTasks()){
			
			if (task instanceof Task){
				try{
					IProgressMonitor subprogress = new SubProgressMonitor(monitor, 100);
					TaskContext context = new TaskContext((Task)task);

					IModembedTask wtask = createTask(((Task) task).getType());
					wtask.execute(context, subprogress);
					
					status.add(context.status);
					
					if (context.status.isOK()){
						for(Resource r : context.outputs){
							try {
								r.save(null);
							} catch (IOException e) {
								status.add(new Status(IStatus.ERROR, ECompilerPlugin.PLUGIN_ID, "Could not save output model", e));
							}
						}
					}
				}catch(CoreException e){
					status.add(e.getStatus());
				}
			}
		}
		
		monitor.done();
		return status;
	}

	private IModembedTask createTask(String taskType) throws CoreException{
		for(IConfigurationElement ce : Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
			if (taskType.equals(ce.getAttribute("id"))){
				Object o = ce.createExecutableExtension("class");
				if (o instanceof IModembedTask){
					return (IModembedTask)o;
				}
			}
		}
		throw new CoreException(new Status(IStatus.ERROR, ECompilerPlugin.PLUGIN_ID, "Could not find task: "+taskType));
	}
	
	private URI getFileURI(String name){
		IProject project = workflowFile.getProject();
		
		List<IProject> projects = new LinkedList<IProject>();
		projects.add(project);
		try {
			projects.addAll(Arrays.asList(project.getDescription().getReferencedProjects()));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		final List<IFile> possibleFiles = new LinkedList<IFile>();
		final String filename = name+".xmi";
		
		for(IProject p : projects){
			try {
				p.accept(new IResourceVisitor() {
					
					@Override
					public boolean visit(IResource resource) throws CoreException {
						if (resource instanceof IFile){
							if (filename.equals(resource.getName())){
								possibleFiles.add((IFile)resource);
							}
							return false;
						}
						return true;
					}
				});
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		possibleFiles.add(project.getFolder(".temp").getFile(filename));
		
		if (!possibleFiles.isEmpty()){
			return URI.createPlatformResourceURI(possibleFiles.get(0).getFullPath().toString(), true);
		}
		return null;
	}
	
}
