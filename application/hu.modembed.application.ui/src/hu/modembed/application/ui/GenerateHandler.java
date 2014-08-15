/**
 * 
 */
package hu.modembed.application.ui;

import hu.modembed.application.codegen.ApplicationCodeGenerator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import application.ApplicationLibrary;
import application.ApplicationModuleImplementation;
import application.LibraryElement;

/**
 * @author balazs.grill
 *
 */
public class GenerateHandler extends AbstractHandler implements IHandler {

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection){
			Object e = ((IStructuredSelection) selection).getFirstElement();
			if (e instanceof IFile){
				if (((IFile) e).getName().endsWith(".mal")){
					
					ResourceSet rs = new ResourceSetImpl();
					Resource r = rs.getResource(URI.createPlatformResourceURI(((IFile) e).getFullPath().toString(), true), true);
					
					IProject project = ((IFile) e).getProject();
					
					ApplicationCodeGenerator codegen = new ApplicationCodeGenerator(project.getLocation().toFile());
					for(EObject eo : r.getContents()){
						if (eo instanceof ApplicationLibrary){
							for(LibraryElement le : ((ApplicationLibrary) eo).getElements()){
								if (le instanceof ApplicationModuleImplementation){
									codegen.generate((ApplicationModuleImplementation) le);
								}
							}
						}
					}
					
				}
			}
					
		}
		
		return null;
	}

}
