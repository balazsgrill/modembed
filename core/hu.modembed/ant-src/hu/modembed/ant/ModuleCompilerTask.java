/**
 * 
 */
package hu.modembed.ant;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.structured.StructuredModule;
import hu.modembed.utils.compiler.module.ModuleCompiler2;

import java.io.File;
import java.util.Iterator;

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
public class ModuleCompilerTask extends Task {

	private File input;
	private File output;
	
	private File targetDir;
	private Union resources;
	
	public void setInput(File file){
		this.input = file;
	}
	
	public void setOutput(File file){
		this.output = file;
	}
	
	public void setTargetDir(File targetDir) {
		this.targetDir = targetDir;
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
	
    private static void compileOne(ResourceSet rs, File input, File output) throws BuildException{
    	try{
			StructuredModule in = TaskUtils.loadInput(rs, input, StructuredModule.class);
			if (TaskUtils.checkModificationTime("Compiling "+in.getName(), rs, output)){
				Resource out = TaskUtils.getOutput(rs, output);
				ModuleCompiler2 compiler = new ModuleCompiler2();
				out.getContents().add(compiler.compile(in));
				out.save(null);
			}
		}catch(Exception e){
			throw new BuildException(e);
		}
    }
    
	@Override
	public void execute() throws BuildException {
		boolean isSingle = (input != null) && (output != null);
		boolean isMulti = (targetDir != null) && (resources != null);
		
		boolean valid = isSingle ^ isMulti;
		
		if (!valid){
			if (isSingle && isMulti) throw new BuildException("This task cannot have both single and multiple input!");
			throw new BuildException("Either an input and an output or a fileset and a target directory must be given!");
		}
		
		ResourceSet rs = MODembedCore.createResourceSet();
		if (isSingle){
			compileOne(rs, input, output);
		}
		
		if (isMulti){
			Iterator<?> iterator = resources.iterator();
			while(iterator.hasNext()){
				Object o = iterator.next();
				if (o instanceof FileResource){
					File file = ((FileResource) o).getFile();
					String fn = file.getName();
					int i = fn.lastIndexOf('.');
					if (i != -1){
						fn = fn.substring(0, i);
					}
					fn = fn+".xmi";
					File out = new File(targetDir, fn);
					compileOne(rs, file, out);
				}
			}
		}
	}
	
}
