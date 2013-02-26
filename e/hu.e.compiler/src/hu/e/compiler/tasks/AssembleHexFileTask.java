/**
 * 
 */
package hu.e.compiler.tasks;

import hexfile.AddressType;
import hexfile.Entry;
import hexfile.HexFile;
import hexfile.HexfileFactory;
import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.modembed.hexfile.persistence.HexFileResource;
import hu.modembed.model.architecture.Architecture;
import hu.modembed.model.architecture.MemorySection;
import hu.modembed.model.core.assembler.ConstantSection;
import hu.modembed.model.core.assembler.Instruction;
import hu.modembed.model.core.assembler.InstructionParameter;
import hu.modembed.model.core.assembler.InstructionSection;
import hu.modembed.model.core.assembler.InstructionWord;
import hu.modembed.model.core.assembler.ParameterSection;
import hu.modembed.model.core.assembler.code.AssemblerObject;
import hu.modembed.model.core.assembler.code.InstructionCall;
import hu.modembed.model.core.assembler.code.InstructionCallParameter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class AssembleHexFileTask implements IModembedTask {

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	public static final String ARCH = "architecture";
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		
		String input = context.getParameterValue(INPUT).get(0);
		Resource inputmodel = context.getInput(context.getModelURI(input));
		AssemblerObject assem = (AssemblerObject) inputmodel.getContents().get(0);
		
		String archmodel = context.getParameterValue(ARCH).get(0);
		Resource archres = context.getInput(context.getModelURI(archmodel));
		Architecture arch = (Architecture)archres.getContents().get(0);

		HexFile hexfile = HexfileFactory.eINSTANCE.createHexFile();
		hexfile.setAddressType(AddressType.EXTENDED_LINEAR);
		Resource hexfileRes = context.getOutput(context.getFileURI(context.getParameterValue(OUTPUT).get(0)));
		hexfileRes.getContents().add(hexfile);
		
		List<MemorySection> programSections = new LinkedList<MemorySection>();
		
		for(MemorySection ms : arch.getMemory()){
			if (ms.isProgram()) programSections.add(ms);
		}
		
		List<InstructionCall> calls = assem.getInstructions();
		
		List<Integer> bytes = new ArrayList<Integer>();
		for(InstructionCall call : calls){
			Map<InstructionParameter, Long> paramvalues = new HashMap<InstructionParameter, Long>();
			
			Instruction i = call.getInstruction();
			for(InstructionParameter ip : i.getParameters()){
				paramvalues.put(ip, Long.valueOf(ip.getDefaultValue()));
			}
			for(InstructionCallParameter icp : call.getParameters()){
				paramvalues.put(icp.getDefinition(), icp.getValue());
			}
			
			List<InstructionWord> words = i.getWords();
			for(InstructionWord w : words){
				long wordvalue = 0;
				int length = 0;
				List<InstructionSection> sections = w.getSections();
				for(int k=sections.size()-1;k>=0;k--){
					InstructionSection s = sections.get(k);
					long svalue = 0;
					if (s instanceof ConstantSection){
						svalue = ((ConstantSection) s).getValue();
					}
					if (s instanceof ParameterSection){
						InstructionParameter iparameter = ((ParameterSection) s).getParameter();
						Long lvalue = paramvalues.get(iparameter);
						if (lvalue == null){
							context.logStatus(TaskUtils.error("Parameter "+iparameter.getId()+" doesn't have a valid value.", s));
						}else{
							svalue = lvalue.longValue();
						}
					}
					svalue = svalue << length;
					svalue = svalue >> s.getShift();
					long mask = Disassembler.mask(s.getSize(), length);
					length += s.getSize();
					wordvalue |= (svalue & mask);
				}
				
				int bytenum = ((length-1)/8)+1;
				for(int j=0;j<bytenum;j++){
					bytes.add((int)(wordvalue & 0xFF));
					wordvalue = wordvalue >> 8;
				}
			}
		}
		
		
		Entry entry = HexfileFactory.eINSTANCE.createEntry();
		hexfile.getEntries().add(entry);
		entry.setAddress((int)programSections.get(0).getStartAddress());
		
		byte[] data = new byte[bytes.size()];
		for(int i=0;i<bytes.size();i++){
			data[i] = HexFileResource.intToByte(bytes.get(i));
		}
		entry.setData(data);
	}

}
