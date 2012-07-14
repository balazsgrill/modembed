/**
 * 
 */
package hu.modembed.ui.disassemble;

import hexfile.Entry;
import hexfile.HexFile;
import hu.modembed.model.core.assembler.InstructionSet;
import hu.modembed.ui.MODembedUI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.util.StringInputStream;

/**
 * @author balazs.grill
 *
 */
public class DisassembleLaunchDelegate implements ILaunchConfigurationDelegate, IDisassembleLaunchAttributes {

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		
		String hexfilepath = configuration.getAttribute(HEXFILE, "");
		String iseturistr = configuration.getAttribute(INSTRUCTIONSET, "");
		String resultfpath = configuration.getAttribute(RESULTFILE, "");
		
		IFile hexfile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(hexfilepath));
		final URI hexfileuri = URI.createPlatformResourceURI(hexfile.getFullPath().toPortableString(), true);
		final URI iseturi = URI.createURI(iseturistr);
		final IFile resultf = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resultfpath));
		
		Job job = new Job("Disassembling") {
			
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				ResourceSet resourceset = new ResourceSetImpl();
				
				Resource hexres = resourceset.getResource(hexfileuri, true);
				if (hexres == null || !(hexres.getContents().get(0) instanceof HexFile)) 
					return new Status(IStatus.ERROR, MODembedUI.PLUGIN_ID, "Cannot load HEX file: "+hexfileuri.toString());
				
				HexFile hfile = (HexFile)hexres.getContents().get(0);
				
				Resource isetres = resourceset.getResource(iseturi.trimFragment(),true);
				if (isetres == null)
					return new Status(IStatus.ERROR, MODembedUI.PLUGIN_ID, "Cannot load instruction set model!");
				
				EObject eo = isetres.getEObject(iseturi.fragment());
				
				if (!(eo instanceof InstructionSet)) 
					return new Status(IStatus.ERROR, MODembedUI.PLUGIN_ID, "The selected instruction set model does not exists!");
				
				InstructionSet iset = (InstructionSet)eo;
				
				System.out.println("Iset: "+iset.getName());
				
				StringBuilder sb = new StringBuilder();
				
				for (Entry entry : hfile.getEntries()){
					int address = entry.getAddress();
					System.out.println("Disassembling entry at "+address);
					sb.append("#Entry 0x"+Integer.toHexString(address)+"\n");
					
					
				}
				
				try {
					if (resultf.exists()){
						resultf.setContents(new StringInputStream(sb.toString()), true, true, new NullProgressMonitor());
					}else{
						resultf.create(new StringInputStream(sb.toString()), true, new NullProgressMonitor());
					}
				} catch (CoreException e) {
					return e.getStatus();
				}
				
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();
		
//		if (!hexfile.exists()){
//			throw new CoreException(new Statu)
//		}

	}

}
