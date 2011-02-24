/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.configt;

import hexfile.HexFile;
import hu.cubussapiens.modembed.pic.ConfigInHexfile;
import hu.cubussapiens.modembed.pic.PICPlugin;

import java.net.URL;
import java.util.Properties;

import modembedconfig.Scheme;
import modembedconfig.instance.Configuration;
import modembedconfig.instance.InstanceFactory;

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


/**
 * @author balazs.grill
 *
 */
public class ExtractJob extends Job {

	private final Properties p;
	private final IProject place;
	
	public ExtractJob(IProject place, Properties p) {
		super("Extract configuration");
		this.p = p;
		this.place = place;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		monitor.beginTask("Extracting configuration", 4);
		
		try{
		/*
		 * Get file informations
		 */
		IFile hexfile = place.getFile(p.getProperty(IPropertyConstants.PROP_EXTRACT_INPUT));
		if (!hexfile.exists()){
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Input file does not exists!");
		}
		IFile configfile = place.getFile(p.getProperty(IPropertyConstants.PROP_EXTRACT_OUTPUT));
		URL cpuurl = new URL(p.getProperty(IPropertyConstants.PROP_EXTRACT_CPU));
		
		monitor.worked(1);
		
		ResourceSet rs = new ResourceSetImpl(); 
		
		Resource fr = rs.createResource(URI.createPlatformResourceURI(configfile.getFullPath().toPortableString(), true));
		
		Scheme configscheme = PICPlugin.getDefault().getConfigurationScheme(rs, cpuurl);
		
		Configuration configinstance = InstanceFactory.eINSTANCE.createConfiguration();
		configinstance.setName("Extracted configuration from "+hexfile.getName());
		configinstance.setScheme(configscheme);
		fr.getContents().add(configinstance);
		
		/*
		 * Load hex file
		 */
		
		Resource hexres = rs.createResource(URI.createPlatformResourceURI(hexfile.getFullPath().toPortableString(), true));
		hexres.load(null);
		HexFile hexmodel = (HexFile)hexres.getContents().get(0);
		
		monitor.worked(1);
		
		/*
		 * Extract configuration
		 */
		ConfigInHexfile.readConfigurationFromHexfile(hexmodel, configinstance);
		monitor.worked(1);
		
		/*
		 * Save config
		 */
		fr.save(null);
		
		monitor.worked(1);
		monitor.done();
		}catch(Exception e){
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not execute operation",e);
		}
		return Status.OK_STATUS;
	}

}
