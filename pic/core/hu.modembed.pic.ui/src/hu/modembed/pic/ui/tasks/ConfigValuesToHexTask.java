/**
 * 
 */
package hu.modembed.pic.ui.tasks;

import hexfile.Entry;
import hexfile.HexFile;
import hexfile.HexfileFactory;
import hexfile.HexfilePackage;
import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.modembed.hexfile.persistence.HexFileResource;
import hu.modembed.model.pic.ConfigField;
import hu.modembed.model.pic.ConfigWord;
import hu.modembed.model.pic.PICArchitecture;
import hu.modembed.model.pic.configValue.ConfigurationSelection;
import hu.modembed.model.pic.configValue.PICConfigurationValue;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author balazs.grill
 *
 */
public class ConfigValuesToHexTask implements IModembedTask {

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";

	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		PICConfigurationValue config = TaskUtils.getInput(context, INPUT, PICConfigurationValue.class);
		if (config == null) return;

		HexFile hexFile = (HexFile)TaskUtils.createOutput(context, OUTPUT, HexfilePackage.eINSTANCE.getHexFile());
		Entry entry = HexfileFactory.eINSTANCE.createEntry();
		entry.setBlocksize(2);
		hexFile.getEntries().add(entry);
		
		PICArchitecture architecture = config.getDefinition();
		long startAddress = Long.MAX_VALUE;
		long endAddress = 0l;
		long[] values = new long[architecture.getConfigWords().size()];
		int i = 0;
		
		for(ConfigWord word : architecture.getConfigWords()){
			int size = (int)((word.getSize()-1)/8+1);
			startAddress = Math.min(startAddress, word.getAddress()*size);
			long end = word.getAddress()*size+size;
			endAddress = Math.max(endAddress, end);
			
			long wordValue = word.getDefaultValue();
			long implMask = ConfigUtils.configImplMask(word.getImplMask());
			for(ConfigField cf : word.getFields()){
				for(ConfigurationSelection cs : config.getValues()){
					if (cs.getSelection() != null && cf.equals(cs.getField())){
						long fieldValue = cs.getSelection().getValue();
						wordValue = ConfigUtils.insertValue(wordValue, cf.getStart(), cf.getSize(), fieldValue);
					}
				}
			}
			values[i] = wordValue & implMask;
			i++;
		}
		
		if (startAddress < endAddress){
			byte[] data = new byte[(int)(endAddress-startAddress)];
			for(int j = 0;j<data.length;j++) data[j] = 0;
			i=0;
			for(ConfigWord word : architecture.getConfigWords()){
				int size = (int)((word.getSize()-1)/8+1);
				long startIndex = (word.getAddress()*size) - startAddress;
				long value = values[i];
				
				for(int j=0;j<size;j++){
					int bv = (int)((value>>(8*j)) & 0xFF);
					data[(int)startIndex+j] = HexFileResource.intToByte(bv);
				}
				
				i++;
			}
			entry.setData(data);
			entry.setAddress((int)startAddress);
		}
		
	}

}
