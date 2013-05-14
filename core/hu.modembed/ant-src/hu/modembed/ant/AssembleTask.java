/**
 * 
 */
package hu.modembed.ant;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.core.object.AssemblerObject;
import hu.modembed.utils.assembler.Assembler;

import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.BuildException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class AssembleTask extends ModelingTask {

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
		try {
			Object in = loadInput(rs, input);
			Resource out = getOutput(rs, output);
			if (in instanceof AssemblerObject){
				Assembler assembler = new Assembler();
				out.getContents().add(assembler.execute((AssemblerObject)in, 0, new NullProgressMonitor()));
				out.save(null);
			}else{
				throw new BuildException("Invalid input");
			}
			
		} catch (IOException e) {
			throw new BuildException(e);
		}
		
	}
	
}
