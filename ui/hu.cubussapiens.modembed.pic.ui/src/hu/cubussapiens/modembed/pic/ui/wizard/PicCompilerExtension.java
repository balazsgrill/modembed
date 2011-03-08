/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

import memory.MemSegment;
import memory.MemoryFactory;
import memory.MemoryModel;
import memory.ProgModel;
import memory.RAMModel;
import picproject.PICSettings;
import project.ProjectConfig;
import project.SettingsExtension;
import hu.cubussapiens.modembed.modularasm.compiler.ICompiler;
import hu.cubussapiens.modembed.modularasm.compiler.ICompilerExtension;

/**
 * @author balazs.grill
 *
 */
public class PicCompilerExtension implements ICompilerExtension {

	private final IProject project;
	private final ProjectConfig config;
	
	public PicCompilerExtension(IProject project, ProjectConfig config) {
		this.project = project;
		this.config = config;
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.compiler.ICompilerExtension#configure(hu.cubussapiens.modembed.modularasm.compiler.ICompiler)
	 */
	@Override
	public void configure(ICompiler compiler) {
		MemoryModel memory = MemoryFactory.eINSTANCE.createMemoryModel();
		ProgModel pm = MemoryFactory.eINSTANCE.createProgModel();
		pm.setSize(0x3000);
		pm.setStartAddr(0);
		pm.setResetVector(0);
		memory.setProg(pm);
		RAMModel rm = MemoryFactory.eINSTANCE.createRAMModel();
		MemSegment ms = MemoryFactory.eINSTANCE.createMemSegment();
		ms.setSize(0xf00);
		ms.setStartAddr(0);
		rm.getSegments().add(ms);
		memory.setRam(rm);
		compiler.setMemoryModel(memory);

		String configfile = null;
		for(SettingsExtension se : config.getExtensions()){
			if (se instanceof PICSettings){
				configfile = ((PICSettings) se).getConfiguration();
			}
		}
		
		if (configfile != null){
			IFile cf = project.getFile(configfile);
			if (cf.exists()){
				compiler.addPostBuildProcess(new PicConfigBits(cf, config.eResource().getResourceSet()));
			}
		}
		
	}

}
