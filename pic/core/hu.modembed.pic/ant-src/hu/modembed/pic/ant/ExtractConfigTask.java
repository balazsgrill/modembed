/**
 * 
 */
package hu.modembed.pic.ant;

import hexfile.HexFile;
import hu.modembed.MODembedCore;
import hu.modembed.ant.TaskUtils;
import hu.modembed.model.pic.PICConfigurationModel;
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
public class ExtractConfigTask extends Task {

	private File input;
	private File output;
	private File configModel;
	
	public void setInput(File input) {
		this.input = input;
	}
	
	public void setOutput(File output) {
		this.output = output;
	}
	
	public void setConfigModel(File configModel) {
		this.configModel = configModel;
	}
	
	@Override
	public void execute() throws BuildException {
		if (input == null) throw new BuildException("input is a required attribute");
		if (output == null) throw new BuildException("input is a required attribute");
		
		ResourceSet rs = MODembedCore.createResourceSet();
		try {
			HexFile in = TaskUtils.loadInput(rs, input, HexFile.class);
			PICConfigurationModel cmodel = TaskUtils.loadInput(rs, configModel, PICConfigurationModel.class);
			Resource out = TaskUtils.getOutput(rs, output);
			
			out.getContents().add(ConfigurationUtils.extract(in, cmodel));
			out.save(null);
		} catch (Exception e) {
			throw new BuildException(e);
		}
	}
	
}
