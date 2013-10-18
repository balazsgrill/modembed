/**
 * 
 */
package hu.modembed.pic.ant;

import hu.modembed.MODembedCore;
import hu.modembed.ant.TaskUtils;
import hu.modembed.model.pic.PICConfigurationValueModel;
import hu.modembed.pic.ConfigurationUtils;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class CompileConfigTask extends Task {

	private File input;
	private File output;
	
	public void setInput(File input) {
		this.input = input;
	}
	
	public void setOutput(File output) {
		this.output = output;
	}
	
	@Override
	public void execute() throws BuildException {
		if (input == null) throw new BuildException("input is a required attribute");
		if (output == null) throw new BuildException("input is a required attribute");
		
		ResourceSet rs = MODembedCore.createResourceSet();
		try {
			Object in = TaskUtils.loadInput(rs, input);
			if (TaskUtils.checkModificationTime("Composing configuration", rs, output)){

				Resource out = TaskUtils.getOutput(rs, output);
				if (in instanceof PICConfigurationValueModel){
					out.getContents().add(ConfigurationUtils.toBinary((PICConfigurationValueModel)in));
					out.save(null);
				}else{
					throw new BuildException("Invalid input");
				}
			}
			
		} catch (Exception e) {
			throw new BuildException(e);
		}
	}
	
}
