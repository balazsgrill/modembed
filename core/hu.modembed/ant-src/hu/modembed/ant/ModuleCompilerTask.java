/**
 * 
 */
package hu.modembed.ant;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.abstraction.DeviceAbstraction;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule;
import hu.modembed.model.modembed.core.object.AssemblerObject;
import hu.modembed.utils.compiler.ModuleCompiler;

import java.io.File;
import java.util.Iterator;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.FileList;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.ResourceCollection;
import org.apache.tools.ant.types.resources.FileResource;
import org.apache.tools.ant.types.resources.Union;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class ModuleCompilerTask extends Task{

	private File output;
	private File device;
	private Union resources;
	private String entry;
	
	public void setEntry(String entry) {
		this.entry = entry;
	}
	
	public void setDevice(File device) {
		this.device = device;
	}
	
	public void setOutput(File output) {
		this.output = output;
	}
	
    /**
     * Add a set of files to touch.
     * @param set the <code>Fileset</code> to add.
     */
    public void addFileset(FileSet set) {
        add(set);
    }

    /**
     * Add a filelist to touch.
     * @param list the <code>Filelist</code> to add.
     */
    public void addFilelist(FileList list) {
        add(list);
    }

    /**
     * Add a collection of resources to touch.
     * @param rc the collection to add.
     * @since Ant 1.7
     */
    public synchronized void add(ResourceCollection rc) {
        resources = resources == null ? new Union() : resources;
        resources.add(rc);
    }

    @Override
    public void execute() throws BuildException {
    	if (output == null) throw new BuildException("output is a required attribute");
    	if (device == null) throw new BuildException("device is a required attribute");
    	if (resources == null) throw new BuildException("No input is defined");
    	if (entry == null) throw new BuildException("entry is a required attribute");
    	
    	ResourceSet rs = MODembedCore.createResourceSet();
    	try {
			DeviceAbstraction device = TaskUtils.loadInput(rs, this.device, DeviceAbstraction.class);
			ModuleCompiler compiler = new ModuleCompiler(device);
			Iterator<?> iterator = resources.iterator();
			while(iterator.hasNext()){
				Object o = iterator.next();
				if (o instanceof FileResource){
					//((FileResource) o).setBaseDir(getProject().getBaseDir());
					File file = ((FileResource) o).getFile();
					SequentialBehaviorModule module = TaskUtils.loadInput(rs, file, SequentialBehaviorModule.class);
					compiler.addModule(module);
				}
			}
			
			AssemblerObject asm = compiler.compile(entry);
			org.eclipse.emf.ecore.resource.Resource out = TaskUtils.getOutput(rs, output);
			out.getContents().add(asm);
			out.save(null);
		} catch (Exception e) {
			throw new BuildException(e);
		}
    	
    }
    
}
