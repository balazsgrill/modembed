/**
 * 
 */
package hu.modembed.ant;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.structured.StructuredModule;
import hu.modembed.utils.compiler.module.ModuleCompiler2;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class ModuleCompilerTask extends Task {

	private File input;
	private File output;
	
	public void setInput(File file){
		this.input = file;
	}
	
	public void setOutput(File file){
		this.output = file;
	}
	
	@Override
	public void execute() throws BuildException {
		if (input == null) throw new BuildException("input is a required attribute");
		if (output == null) throw new BuildException("input is a required attribute");
		
		ResourceSet rs = MODembedCore.createResourceSet();
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
	
}
