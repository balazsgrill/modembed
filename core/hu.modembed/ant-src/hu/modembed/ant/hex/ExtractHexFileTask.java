/**
 * 
 */
package hu.modembed.ant.hex;

import hexfile.HexFile;
import hu.modembed.MODembedCore;
import hu.modembed.ant.TaskUtils;
import hu.modembed.utils.HexFileUtils;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class ExtractHexFileTask extends Task {

	private File input;
	private File output;
	
	private long start = -1;
	private long end = -1;
	
	public void setStart(long start) {
		this.start = start;
	}
	
	public void setEnd(long end) {
		this.end = end;
	}
	
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
			HexFile in = TaskUtils.loadInput(rs, input, HexFile.class);
			if (TaskUtils.checkModificationTime("Extracting ["+start+":"+end+"] from "+input, rs, output)){
				Resource out = TaskUtils.getOutput(rs, output);

				out.getContents().add(HexFileUtils.extract(in, start, end));
				out.save(null);
			}
		} catch (Exception e) {
			throw new BuildException(e);
		}
	}
	
}
