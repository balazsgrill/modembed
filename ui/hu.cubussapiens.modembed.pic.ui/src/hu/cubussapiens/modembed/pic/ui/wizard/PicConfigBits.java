/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.wizard;

import hexfile.HexFile;
import hu.cubussapiens.modembed.modularasm.compiler.IPostBuildProcess;
import hu.cubussapiens.modembed.pic.ConfigInHexfile;

import modembedconfig.instance.Configuration;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class PicConfigBits implements IPostBuildProcess {

	private final IFile file;
	private final ResourceSet rs;
	
	public PicConfigBits(IFile file, ResourceSet rs) {
		this.rs = rs;
		this.file = file;
	}
	
	@Override
	public void execute(HexFile hexfile, IProgressMonitor monitor) {
		monitor.beginTask("Inserting configuration into hexfile", 2);
		
		URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		Resource resource = rs.getResource(uri, true);
		
		Configuration configuration = null;
		for(EObject eo : resource.getContents()){
			if (eo instanceof Configuration){
				configuration = (Configuration)eo;
			}
		}
		monitor.worked(1);
		
		if (configuration != null){
			ConfigInHexfile.insertConfigurationInHexfile(configuration, hexfile);
		}
		
		monitor.worked(1);
		monitor.done();
	}

}
