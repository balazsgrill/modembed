/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.indexer.internal;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import modembedconfig.Scheme;
import modembedconfig.instance.Configuration;
import modembedconfig.instance.InstanceFactory;
import hu.cubussapiens.modembed.modularasm.compiler.IModuleConfigurationHandler;
import hu.cubussapiens.modembed.modularasm.indexer.IndexerPlugin;

/**
 * @author balazs.grill
 *
 */
public class FolderConfigHandler implements IModuleConfigurationHandler {

	private final IFolder configFolder;
	
	private final ResourceSet rs;
	
	public FolderConfigHandler(IFolder configFolder, ResourceSet rs) {
		this.configFolder = configFolder;
		this.rs = rs;
	}
	
	private void createConfig(String moduleInstance, Scheme scheme) throws CoreException{
		if (moduleInstance.isEmpty()) moduleInstance = "Main";
		IFile config = configFolder.getFile(moduleInstance+".config");
		URI uri = URI.createPlatformResourceURI(config.getFullPath().toString(), true);
		
		if (!config.exists()){
			Resource r = rs.createResource(uri);
			
			Configuration instance = InstanceFactory.eINSTANCE.createConfiguration();
			instance.setScheme(scheme);
			instance.setName(moduleInstance);
			r.getContents().add(instance);
			try {
				r.save(null);
			} catch (IOException e) {
				throw new CoreException(new Status(IStatus.ERROR, IndexerPlugin.getDefault().getBundle().getSymbolicName(), "Could not save default config scheme", e));
			}
		}
	}
	
	private void createScheme(String moduleType, Scheme scheme) throws CoreException{
		IFolder schemaFolder = configFolder.getFolder("schemas");
		if (!schemaFolder.exists()){
			schemaFolder.create(true, true, new NullProgressMonitor());
		}
		IFile schema = schemaFolder.getFile(moduleType+".schema");
		URI uri = URI.createPlatformResourceURI(schema.getFullPath().toString(), true);
		Resource r = rs.getResource(uri, false); 
		if (r == null){
			r = rs.createResource(uri);
		}else{
			r.unload();
		}
		r.getContents().clear();
		r.getContents().add(scheme);
		try {
			r.save(null);
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, IndexerPlugin.getDefault().getBundle().getSymbolicName(), "Could not save config scheme", e));
		}
	}
	
	@Override
	public void setScheme(String moduleType, String moduleInstance, Scheme scheme) {
		try{
			if (!configFolder.exists()){
				configFolder.create(true, true, new NullProgressMonitor());
			}
			createScheme(moduleType, scheme);
			createConfig(moduleInstance, scheme);
		}catch(CoreException e){
			IndexerPlugin.getDefault().getLog().log(e.getStatus());
		}
	}

	@Override
	public Configuration getConfiguration(String moduleInstance) {
		// TODO Auto-generated method stub
		return null;
	}

}
