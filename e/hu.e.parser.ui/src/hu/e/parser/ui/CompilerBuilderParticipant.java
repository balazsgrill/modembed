/**
 * 
 */
package hu.e.parser.ui;

import hu.e.parser.convert.LibraryConverter;
import hu.e.parser.convert.UnresolvedCrossReference;
import hu.e.parser.eSyntax.InstructionSetNotation;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.WorkflowNotation;
import hu.e.parser.ui.internal.ESyntaxActivator;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;

/**
 * @author balazs.grill
 *
 */
public class CompilerBuilderParticipant implements IXtextBuilderParticipant {

	public static final String MARKER_TYPE = "hu.e.parser.ui.unresolvedReferenceMarker";
	public static final String REFERENCE_ID = "referenceId";
	
	private List<UnresolvedCrossReference> attemptConvert(IBuildContext context, IFile resource){
		Resource res = context.getResourceSet().
				getResource(URI.createPlatformResourceURI(resource.getFullPath().toString(), true), true);
		LibraryConverter converter = new LibraryConverter(resource.getProject());
		System.out.println("Parse "+resource);
		try{
			for(EObject l : res.getContents()){
				if (l instanceof Library){
					return converter.convert((Library)l);
				}
				if (l instanceof InstructionSetNotation){
					return converter.convert((InstructionSetNotation)l);
				}
				if (l instanceof WorkflowNotation){
					return converter.convert((WorkflowNotation)l);
				}
				return Collections.emptyList();
			}
		}catch (final Exception e) {
			e.printStackTrace();
			Display.getDefault().asyncExec(new Runnable() {
				
				@Override
				public void run() {
					ErrorDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Can't compile", "Compiler error", 
							new Status(IStatus.ERROR, ESyntaxActivator.PLUGIN_PREFERENCE_SCOPE,e.getMessage(),e));
				}
			});
			return Collections.emptyList();
		}
		return Collections.emptyList();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.builder.IXtextBuilderParticipant#build(org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void build(final IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		
		IProject project = context.getBuiltProject();
		final Queue<IFile> files = new LinkedList<IFile>();
		final Set<IFile> attempted = new HashSet<IFile>();
		project.accept(new IResourceVisitor() {
			
			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile){
					if (resource.getName().endsWith(".e")){
						files.add((IFile)resource);
					}
					return false;
				}
				if (resource instanceof IContainer){
					return true;
				}
				return false;
			}
		});

		while(!files.isEmpty()){
			IFile f = files.poll();
			f.deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_INFINITE);
			List<UnresolvedCrossReference> fail = attemptConvert(context, f);
			if (!fail.isEmpty()){
				if (!attempted.contains(f)){
					//First attempt failed, retry 
					files.add(f);
					attempted.add(f);
				}else{
					//second attempt failed, add markers
					for(UnresolvedCrossReference unref : fail){
						IMarker marker = f.createMarker(MARKER_TYPE);
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
						marker.setAttribute(IMarker.LINE_NUMBER, unref.line);
						marker.setAttribute(IMarker.MESSAGE, "Could not resolve reference '"+unref.id+"'");
						marker.setAttribute(IMarker.CHAR_START,unref.charStart);
						marker.setAttribute(IMarker.CHAR_END,unref.charEnd);
						marker.setAttribute(REFERENCE_ID, unref.id);
					}
				}
			}
		}
		
	}

}
