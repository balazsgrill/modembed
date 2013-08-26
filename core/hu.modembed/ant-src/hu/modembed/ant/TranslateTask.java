/**
 * 
 */
package hu.modembed.ant;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.abstraction.behavior.RootSequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SymbolMap;
import hu.modembed.utils.compiler.SequentialBehaviorTranslator;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class TranslateTask extends Task {
	
	private File input;
	private File output;
	private File map;
	
	public void setMap(File map) {
		this.map = map;
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
		
		ResourceSet rs = MODembedCore.createResourceSet();
		try {
			RootSequentialBehavior in = TaskUtils.loadInput(rs, input, RootSequentialBehavior.class);
			if (TaskUtils.checkModificationTime("Translating "+input+" to "+output, rs, output)){

				Resource out = TaskUtils.getOutput(rs, output);
				SequentialBehaviorTranslator translator = new SequentialBehaviorTranslator();

				SymbolMap map = null;
				if (this.map != null){
					map = TaskUtils.loadInput(rs, this.map, SymbolMap.class);
				}

				out.getContents().add(translator.translate(in, map, 0));
				out.save(null);
			}
		} catch (Exception e) {
			throw new BuildException(e);
		}
		
	}
}
