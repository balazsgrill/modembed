/**
 * 
 */
package hu.modembed.ant;

import hexfile.HexFile;
import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.core.instructionset.InstructionSet;
import hu.modembed.model.modembed.core.object.AssemblerObject;
import hu.modembed.model.modembed.core.object.InstructionCall;
import hu.modembed.model.modembed.core.object.ObjectFactory;
import hu.modembed.utils.disassembler.Disassembler;

import java.io.File;
import java.util.List;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class DisassembleTask extends Task {

	private File input;
	private File output;
	private File instructionSet;
	
	public void setInput(File input) {
		this.input = input;
	}
	
	public void setOutput(File output) {
		this.output = output;
	}
	
	public void setInstructionSet(File instructionSet) {
		this.instructionSet = instructionSet;
	}
	
	@Override
	public void execute() throws BuildException {
		if (input == null) throw new BuildException("input is a required attribute");
		if (output == null) throw new BuildException("output is a required attribute");
		if (instructionSet == null) throw new BuildException("instructionSet is a required attribute");
		
		
		ResourceSet rs = MODembedCore.createResourceSet();
		try {
			HexFile hexfile = TaskUtils.loadInput(rs, input, HexFile.class);
			InstructionSet iset = TaskUtils.loadInput(rs, instructionSet, InstructionSet.class);
			
			Disassembler disassembler = new Disassembler(iset);
			List<InstructionCall> calls = disassembler.disassemble(hexfile.getEntries().get(0).getData());
			AssemblerObject asm = ObjectFactory.eINSTANCE.createAssemblerObject();
			asm.setName(output.getName());
			asm.setStartAddress(0); //TODO
			asm.getInstructions().addAll(calls);
			
			Resource outres = TaskUtils.getOutput(rs, output);
			outres.getContents().add(asm);
			outres.save(null);
			
		} catch (Exception e) {
			throw new BuildException(e);
		}
		
	}
	
}
