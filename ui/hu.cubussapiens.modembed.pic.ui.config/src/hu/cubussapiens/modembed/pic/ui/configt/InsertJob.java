/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.configt;

import hexfile.HexFile;
import hu.cubussapiens.modembed.pic.ConfigInHexfile;

import java.util.Properties;

import modembedconfig.instance.Configuration;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author balazs.grill
 *
 */
public class InsertJob extends Job {

	private final Properties p;
	private final IProject place;
	
	public InsertJob(IProject place, Properties p) {
		super("Insert configuration");
		this.p = p;
		this.place = place;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		monitor.beginTask("Inserting configuration", 4);
		
		try{
		/*
		 * Get file informations
		 */
		IFile hexfile = place.getFile(p.getProperty(IPropertyConstants.PROP_INSERT_INPUT));
		if (!hexfile.exists()){
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Input file does not exists!");
		}
		IFile configfile = place.getFile(p.getProperty(IPropertyConstants.PROP_INSERT_CONFIG));
		if (!configfile.exists()){
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Config file does not exists!");
		}
		IFile outhex = place.getFile(p.getProperty(IPropertyConstants.PROP_INSERT_OUTPUT));
		
		monitor.worked(1);
		
		ResourceSet rs = new ResourceSetImpl(); 
		
		Resource configres = rs.createResource(URI.createPlatformResourceURI(configfile.getFullPath().toPortableString(), true));
		Resource inputres = rs.createResource(URI.createPlatformResourceURI(hexfile.getFullPath().toPortableString(), true));
		Resource outres = rs.createResource(URI.createPlatformResourceURI(outhex.getFullPath().toPortableString(), true));
		
		/*
		 * Load hex file
		 */
		
		inputres.load(null);
		configres.load(null);
		HexFile hexmodel = (HexFile)inputres.getContents().get(0);
		Configuration configinstance = (Configuration)configres.getContents().get(0);
		HexFile resultmodel = EcoreUtil.copy(hexmodel);
		outres.getContents().add(resultmodel);
		
		monitor.worked(1);
		
		/*
		 * Extract configuration
		 */
		ConfigInHexfile.insertConfigurationInHexfile(configinstance, resultmodel);
		monitor.worked(1);
		
		/*
		 * Save config
		 */
		outres.save(null);
		
		monitor.worked(1);
		monitor.done();
		}catch(Exception e){
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not execute operation",e);
		}
		return Status.OK_STATUS;
	}

}
