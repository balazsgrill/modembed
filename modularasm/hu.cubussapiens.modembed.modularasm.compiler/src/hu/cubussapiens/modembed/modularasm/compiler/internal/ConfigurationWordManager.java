/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.internal;

import hu.cubussapiens.modembed.modularasm.compiler.IModuleConfigurationHandler;
import hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.ISymbol;
import hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace;
import hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord;
import hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField;
import hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationFieldLiteral;
import hu.cubussapiens.modembed.modularasm.modularASM.ModuleItem;

import java.util.HashMap;
import java.util.Map;

import modembedconfig.EnumParam;
import modembedconfig.EnumParamLiteral;
import modembedconfig.ModembedconfigFactory;
import modembedconfig.ParameterSet;
import modembedconfig.Scheme;

/**
 * @author balazs.grill
 *
 */
public class ConfigurationWordManager {

	private final ModuleInstance instance;
	
	private final Map<ConfigurationWord, ParameterSet> parametersets = new HashMap<ConfigurationWord, ParameterSet>();
	
	public ConfigurationWordManager(ModuleInstance instance) {
		this.instance = instance;
		IModuleConfigurationHandler handler = getHandler();
		Scheme scheme = ModembedconfigFactory.eINSTANCE.createScheme();
		String name = instance.manager.moduleTypes.get(instance.type);
		if (name == null || name.isEmpty()) return;
		scheme.setName(name);
		boolean empty = true;
		for(ModuleItem item : instance.type.getItems()){
			if (item instanceof ConfigurationWord){
				empty = false;
				ConfigurationWord cw = (ConfigurationWord)item;
				ParameterSet pset = ModembedconfigFactory.eINSTANCE.createParameterSet();
				pset.setName(cw.getName());
				scheme.getSubsets().add(pset);
				parametersets.put(cw, pset);
				for(ConfigurationFieldPlace place : cw.getFields()){
					if (place.getField() instanceof EnumConfigurationField){
						EnumConfigurationField cf = (EnumConfigurationField)place.getField();
						EnumParam param = ModembedconfigFactory.eINSTANCE.createEnumParam();
						pset.getParameters().add(param);
						param.setName(cf.getName());
						//param.setDefault()
						for(EnumConfigurationFieldLiteral l : cf.getLiterals()){
							EnumParamLiteral literal = ModembedconfigFactory.eINSTANCE.createEnumParamLiteral();
							literal.setName(l.getName());
							literal.setValue(l.getValue().getValue());
							param.getLiterals().add(literal);
						}
					}
				}
			}
		}
		if (!empty){
			handler.setScheme(name, instance.getRootReference(), scheme);
		}
	}
	
	public ISymbol createSymbol(ConfigurationWord cw){
		
		
		return null;
	}
	
	private IModuleConfigurationHandler getHandler(){
		return instance.manager.compiler.confighandler;
	}
	
}
