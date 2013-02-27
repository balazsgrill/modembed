/**
 * 
 */
package hu.modembed.pic.ui.tasks;

import hexfile.HexFile;
import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
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
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		HexFile hexfile = TaskUtils.getInput(context, INPUT, HexFile.class);
		PICArchitecture architecture = TaskUtils.getInput(context, ARCHITECTURE, PICArchitecture.class);
		if (hexfile == null || architecture == null) return;
		
		PICConfigurationValue config = (PICConfigurationValue)TaskUtils.createOutput(context, OUTPUT, ConfigValuePackage.eINSTANCE.getPICConfigurationValue());
		config.setDefinition(architecture);
		
		for(ConfigWord cw : architecture.getConfigWords()){
			long address = cw.getAddress();
			long size = ((cw.getSize()-1)/8)+1;
			long value = 0;
			boolean good = true;
			for(int i=0;i<size;i++){
				long baddress = (address*size)+i;
				int v = ConfigUtils.getByte(hexfile, baddress);
				if (v >= 0){
					value += ((long)v)<<(8l*i);
				}else{
					/* The hex file does not contain this configuration data */
					good = false;
				}
			}
			
			if (good){
				for(ConfigField field : cw.getFields()){
					long mask = ConfigUtils.mask(field.getSize());
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
