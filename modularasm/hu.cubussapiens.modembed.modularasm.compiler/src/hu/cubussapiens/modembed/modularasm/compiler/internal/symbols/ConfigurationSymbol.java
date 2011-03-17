/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.internal.symbols;

import modembedconfig.Parameter;
import modembedconfig.ParameterSet;
import modembedconfig.instance.Configuration;
import modembedconfig.instance.Value;
import hu.cubussapiens.modembed.modularasm.compiler.IModuleConfigurationHandler;
import hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationField;
import hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace;
import hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord;
import hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField;

/**
 * @author balazs.grill
 *
 */
public class ConfigurationSymbol implements ISymbol {

	private final IModuleConfigurationHandler handler;
	private final String moduleInstance;
	private final ConfigurationWord cw;
	private final ParameterSet ps;
	
	/**
	 * 
	 */
	public ConfigurationSymbol(IModuleConfigurationHandler handler, String moduleInstance, ConfigurationWord cw, ParameterSet ps) {
		this.handler = handler;
		this.moduleInstance = moduleInstance;
		this.cw = cw;
		this.ps = ps;
	}

	private int getConfigValue(String name, Configuration config){
		Parameter param = null;
		
		for(Parameter p : ps.getParameters()){
			if (name.equals(p.getName())){
				param = p;
			}
		}
		
		if (param != null){
			for(Value v : config.getValues()){
				if (param.equals(v.getParameter())){
					return v.getValue();
				}
			}
		}
		
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.ISymbol#getValue()
	 */
	@Override
	public int getValue() {
		
		Configuration config = handler.getConfiguration(moduleInstance);
		if (config != null){
			int value = 0;
			
			for(ConfigurationFieldPlace p : cw.getFields()){
				/* TODO FIXME default value? */
				ConfigurationField cf = p.getField();
				String name = null;
				if (cf instanceof EnumConfigurationField){
					name = ((EnumConfigurationField) cf).getName();
				}
				
				if (name == null){
					int cvalue = getConfigValue(name, config);
					value += cvalue<<(p.getStartBit().getValue());
				}
			}
			
			return value;
		}
		
		return 0;
	}

}
