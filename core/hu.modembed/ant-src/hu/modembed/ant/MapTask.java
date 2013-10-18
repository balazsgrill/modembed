/**
 * 
 */
package hu.modembed.ant;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.abstraction.behavior.RootSequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRules;
import hu.modembed.utils.compiler.SimpleVariableMapper;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class MapTask extends Task {

	private File input;
	private File output;
	private File rules;
	
	public void setRules(File rules) {
		this.rules = rules;
	}
	
	public void setInput(File file){
		this.input = file;
	}
	
	public void setOutput(File file){
		this.output = file;
	}
	
	@Override
	public void execute() throws BuildException {
		if (input == null) throw new BuildException("input is a required attribute");
		if (output == null) throw new BuildException("output is a required attribute");
		if (rules == null) throw new BuildException("rules is a required attribute");
		
		ResourceSet rs = MODembedCore.createResourceSet();
		try {
			RootSequentialBehavior in = TaskUtils.loadInput(rs, input, RootSequentialBehavior.class);
			SymbolMappingRules rules = TaskUtils.loadInput(rs, this.rules, SymbolMappingRules.class);
			
			if (TaskUtils.checkModificationTime("Mapping memory", rs, output)){
				Resource out = TaskUtils.getOutput(rs, output);

				SimpleVariableMapper mapper = new SimpleVariableMapper();

				out.getContents().add(mapper.mapVariables(in, rules));
				out.save(null);
			}
		} catch (Exception e) {
			throw new BuildException(e);
		}
		
	}
	
}
