/**
 * 
 */
package hu.e.compiler.tasks;

import hexfile.AddressType;
import hexfile.Entry;
import hexfile.HexFile;
import hexfile.HexfileFactory;
import hexfile.HexfilePackage;
import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.e.compiler.tasks.disassembler.Disassembler;
import hu.modembed.hexfile.persistence.HexFileResource;
import hu.modembed.model.modembed.core.instructionset.ConstantSection;
import hu.modembed.model.modembed.core.instructionset.Instruction;
import hu.modembed.model.modembed.core.instructionset.InstructionParameter;
import hu.modembed.model.modembed.core.instructionset.InstructionSection;
import hu.modembed.model.modembed.core.instructionset.InstructionWord;
import hu.modembed.model.modembed.core.instructionset.ParameterSection;
import hu.modembed.model.modembed.core.object.AssemblerObject;
import hu.modembed.model.modembed.core.object.InstructionCall;
import hu.modembed.model.modembed.core.object.InstructionCallParameter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

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
		AssemblerObject assem = TaskUtils.getInput(context, INPUT, AssemblerObject.class);
		if (assem == null) return; 
		
		//Architecture arch = TaskUtils.getInput(context, ARCH, Architecture.class);
		//if (arch == null) return;

		HexFile hexfile = (HexFile) TaskUtils.createOutput(context, OUTPUT, HexfilePackage.eINSTANCE.getHexFile());
		hexfile.setAddressType(AddressType.EXTENDED_LINEAR);
		
//		List<MemorySection> programSections = new LinkedList<MemorySection>();
//		
//		for(MemorySection ms : arch.getMemory()){
//			if (ms.isProgram()) programSections.add(ms);
//		}
		
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
		//entry.setAddress((int)programSections.get(0).getStartAddress());
		
		byte[] data = new byte[bytes.size()];
		for(int i=0;i<bytes.size();i++){
			data[i] = HexFileResource.intToByte(bytes.get(i));
		}
		entry.setData(data);
	}

}
