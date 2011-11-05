/**
 * 
 */
package hu.modembed.pic.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import microchip.Device;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author balazs.grill
 *
 */
public class GeneratePicDesc implements IObjectActionDelegate {

	IFile file = null;
	
	@Override
	public void run(IAction action) {
		if (file != null){
			
			Job job = new Job("Execute transformation script") {
				
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					ResourceSet rs = new ResourceSetImpl();
					Resource r = rs.getResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true), true);
					for(EObject eo: r.getContents()){
						if (eo instanceof Device){
							Device d = (Device)eo;
							PicETemplate template = new PicETemplate();
							IFile efile = file.getParent().getFile(new Path(d.getName()+".e"));
							InputStream is = new ByteArrayInputStream(template.generate(d).getBytes());
							try {
								if (efile.exists()){
									efile.setContents(is, true, true, monitor);
								}else{
									efile.create(is, true, monitor);
								}
							} catch (CoreException e) {
								return e.getStatus();
							}
						}
					}
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
