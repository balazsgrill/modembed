/**
 * 
 */
package hu.modembed.pic.ui.tasks;

import hexfile.Entry;
import hexfile.HexFile;
import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.modembed.hexfile.persistence.HexFileResource;
import hu.modembed.model.pic.ConfigField;
import hu.modembed.model.pic.ConfigLiteral;
import hu.modembed.model.pic.ConfigWord;
import hu.modembed.model.pic.PICArchitecture;
import hu.modembed.model.pic.configValue.ConfigValueFactory;
import hu.modembed.model.pic.configValue.ConfigValuePackage;
import hu.modembed.model.pic.configValue.ConfigurationSelection;
import hu.modembed.model.pic.configValue.PICConfigurationValue;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author balazs.grill
 *
 */
public class ExtractConfigValuesTask implements IModembedTask {

	public static final String INPUT = "input";
	public static final String ARCHITECTURE = "architecture";
	public static final String OUTPUT = "output";
	
	private static int getByte(HexFile hexfile, long address){
		for(Entry e : hexfile.getEntries()){
			long from = e.getAddress();
			long to = from+e.getData().length;
			if (address >= from && address < to){
				int index = (int)(address-from);
				return HexFileResource.byteToInt(e.getData()[index]);
			}
		}
		return -1;
	}
	
	private static long mask(int bits){
		long mask = 0;
		for(int i=0;i<bits;i++){
			mask += 1<<i;
		}
		return mask;
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		HexFile hexfile = TaskUtils.getInput(context, INPUT, HexFile.class);
		PICArchitecture architecture = TaskUtils.getInput(context, ARCHITECTURE, PICArchitecture.class);
		if (hexfile == null || architecture == null) return;
		
		PICConfigurationValue config = (PICConfigurationValue)TaskUtils.createOutput(context, OUTPUT, ConfigValuePackage.eINSTANCE.getPICConfigurationValue());
		
		for(ConfigWord cw : architecture.getConfigWords()){
			long address = cw.getAddress();
			long size = ((cw.getSize()-1)/8)+1;
			long value = 0;
			boolean good = true;
			for(int i=0;i<size;i++){
				long baddress = (address*size)+i;
				int v = getByte(hexfile, baddress);
				if (v >= 0){
					value += ((long)v)<<(8l*i);
				}else{
					/* The hex file does not contain this configuration data */
					good = false;
				}
			}
			
			if (good){
				for(ConfigField field : cw.getFields()){
					long mask = mask(field.getSize());
					long fvalue = (value>>field.getStart()) & mask;
					ConfigLiteral literal = null;
					for(ConfigLiteral l : field.getLiterals()){
						if (l.getValue() == fvalue){
							literal = l;
						}
					}
					if (literal != null){
						ConfigurationSelection selection = ConfigValueFactory.eINSTANCE.createConfigurationSelection();
						selection.setField(field);
						selection.setSelection(literal);
						config.getValues().add(selection);
					}
				}
			}
		}
		
	}

}
