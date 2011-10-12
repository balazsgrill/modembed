/**
 * 
 */
package hu.e.parser.ui;

import hu.e.compiler.ECompiler;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author balazs.grill
 *
 */
public class CompileAFile implements IObjectActionDelegate {

	IFile file = null;
	
	@Override
	public void run(IAction action) {
		if (file != null){
			
			Job job = new Job("Execute transformation script") {
				
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					ECompiler compiler = new ECompiler();
					compiler.compile(file);
					return Status.OK_STATUS;
				}
			};
			job.setUser(true);
			job.schedule();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection){
			Object o = ((IStructuredSelection) selection).getFirstElement();
			file = (o instanceof IFile) ? (IFile)o : null;
		}
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}



}
