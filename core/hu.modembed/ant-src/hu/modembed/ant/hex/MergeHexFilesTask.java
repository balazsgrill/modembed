/**
 * 
 */
package hu.modembed.ant.hex;

import hexfile.HexFile;
import hu.modembed.MODembedCore;
import hu.modembed.ant.TaskUtils;
import hu.modembed.utils.HexFileUtils;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.FileList;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.ResourceCollection;
import org.apache.tools.ant.types.resources.FileResource;
import org.apache.tools.ant.types.resources.Union;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class MergeHexFilesTask extends Task {

	private Union resources;
	private File output;
	
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
	
    public void execute() throws BuildException {
    	if (output == null) throw new BuildException("output is a required attribute");
    	if (resources == null) throw new BuildException("No input is defined");
    	
    	try{
    		List<HexFile> hexFiles = new LinkedList<HexFile>();
    		ResourceSet rs = MODembedCore.createResourceSet();
    		Iterator<?> iterator = resources.iterator();
    		while(iterator.hasNext()){
    			Object o = iterator.next();
    			if (o instanceof FileResource){
    				//((FileResource) o).setBaseDir(getProject().getBaseDir());
    				File file = ((FileResource) o).getFile();
    				HexFile hf = TaskUtils.loadInput(rs, file, HexFile.class);
    				hexFiles.add(hf);
    			}
    		}
    		
    		HexFile result = HexFileUtils.merge(hexFiles.toArray(new HexFile[hexFiles.size()]));
    		Resource resultres = TaskUtils.getOutput(rs, output);
    		resultres.getContents().add(result);
    		resultres.save(null);
    	}catch(Exception e){
    		throw new BuildException(e);
    	}
    }
    
}
