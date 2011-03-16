/**
 * 
 */
package hu.cubussapiens.modembed.ui.builder;

import hexfile.HexFile;
import hu.cubussapiens.modembed.modularasm.compiler.CompilerException;
import hu.cubussapiens.modembed.modularasm.compiler.ICompiler;
import hu.cubussapiens.modembed.modularasm.compiler.ICompilerExtension;
import hu.cubussapiens.modembed.modularasm.compiler.MASMCompilerPlugin;
import hu.cubussapiens.modembed.modularasm.compiler.resolvers.ExtensionArchitectureResolver;
import hu.cubussapiens.modembed.modularasm.indexer.IProjectIndexer;
import hu.cubussapiens.modembed.modularasm.indexer.IndexerPlugin;
import hu.cubussapiens.modembed.modularasm.modularASM.ModularASMFactory;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;
import hu.cubussapiens.modembed.ui.IProjectExtension;
import hu.cubussapiens.modembed.ui.MODembedUI;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import project.ProjectConfig;

/**
 * @author balazs.grill
 *
 */
public class MASMBuilder extends IncrementalProjectBuilder {

	private static final String MARKER_TYPE = "hu.cubussapiens.modembed.ui.marker";
	private void addMarker(IResource res, String message, int lineNumber, int severity) {
		try {
			IMarker marker = res.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (CoreException e) {
		}
	}

	
	@Override
	protected void clean(IProgressMonitor monitor) throws CoreException {
		//build(0, null, monitor);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IncrementalProjectBuilder#build(int, java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		
		monitor.beginTask("Compiling..", 100);
		
		IProject project = getProject();
		project.deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_INFINITE);
		
		ResourceSet rs = new ResourceSetImpl();
		ProjectConfig pc = MODembedUI.getDefault().getProjectConfig(rs, project);
		
		ICompiler compiler = MASMCompilerPlugin.getDefault().createCompiler();
		compiler.setArchResolver(new ExtensionArchitectureResolver());
		
		IProjectIndexer indexer = IndexerPlugin.getDefault().getProjectIndexer(getProject());
		indexer.update();
		compiler.setModuleResolver(indexer);
		compiler.setConfigurationHandler(indexer.getConfigHandler());
		QualifiedID moduleID = ModularASMFactory.eINSTANCE.createQualifiedID();
		String[] ss = pc.getBuild().getQualifiedID().split("\\.");
		for(String s : ss){
			moduleID.getSegments().add(s);
		}
		compiler.setMain(indexer.resolveModule(moduleID));
		
		monitor.worked(1);
		
		IProjectExtension[] pes = MODembedUI.getDefault().getExtensions(pc.getBuild().getTarget());
		for(IProjectExtension pe : pes){
			ICompilerExtension ce = pe.createCompilerExtension(project, pc);
			if (ce != null){
				ce.configure(compiler);
			}
		}
		
		monitor.worked(1);
		
		IFolder output = project.getFolder(pc.getBuild().getOutput().getPath());
		IFile outfile = output.getFile(pc.getBuild().getQualifiedID()+"."+pc.getBuild().getTarget()+".hex");
		Resource outres = rs.createResource(URI.createPlatformResourceURI(outfile.getFullPath().toString(), true));
		
		IFile mapfile = output.getFile(pc.getBuild().getQualifiedID()+"."+pc.getBuild().getTarget()+".map");
		Properties outmap = new Properties();
		
		try {
			HexFile hf = compiler.compile(new SubProgressMonitor(monitor, 96));
			if (hf != null){
				outres.getContents().add(hf);
			}
			outres.save(null);
			monitor.worked(1);
			Map<String, Long> mapping = compiler.getSymbolMapping();
			for(Entry<String, Long> m : mapping.entrySet()){
				outmap.put(m.getKey(), "0x"+Long.toHexString(m.getValue()));
			}
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			outmap.store(os, "");
			if (mapfile.exists()){
				mapfile.setContents(new ByteArrayInputStream(os.toByteArray()), IResource.KEEP_HISTORY, new SubProgressMonitor(monitor, 1));
			}else{
				mapfile.create(new ByteArrayInputStream(os.toByteArray()), IResource.KEEP_HISTORY, new SubProgressMonitor(monitor, 1));
			}
		} catch (CompilerException e) {
			addMarker(project, "Compiler error: "+e.getMessage(), 0, IMarker.SEVERITY_ERROR);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
