/**
 * 
 */
package hu.cubussapiens.modembed.pic;

import hexfile.Entry;
import hexfile.HexFile;
import hexfile.HexfileFactory;
import hu.cubussapiens.modembed.hexfile.persistence.HexFileResource;
import modembedconfig.Parameter;
import modembedconfig.instance.Configuration;
import modembedconfig.instance.InstanceFactory;
import modembedconfig.instance.Value;
import pic.ConfigurationBits;
import pic.ConfigurationField;
import pic.ConfigurationWord;

/**
 * @author balage
 *
 */
public class ConfigInHexfile {

	private static int bitmask(int length){
		int r = 0;
		for (int i=0;i<length;i++){
			r += 1<<i;
		}
		return r;
	}
	
	private static int getValue(Configuration config, Parameter parameter){
		for(Value v : config.getValues()){
			if (parameter.equals(v.getParameter())){
				return v.getValue();
			}
		}
		return parameter.getDefault();
	}
	
	private static void setValue(Configuration config, Parameter parameter, int value){
		for(Value v : config.getValues()){
			if (parameter.equals(v.getParameter())){
				v.setValue(value);
				return;
			}
		}
		Value v = InstanceFactory.eINSTANCE.createValue();
		v.setParameter(parameter);
		v.setValue(value);
		config.getValues().add(v);
	}
	
	public static void readConfigurationFromHexfile(HexFile hexfile, Configuration configuration){
		/*
		 * Extract configuration bits 
		 */
		ConfigurationBits bits = (ConfigurationBits)configuration.getScheme().eContainer();
		
		int address = -1;
		
		for(ConfigurationWord word : bits.getWords()){
			if (address == -1){
				address = word.getAddress();
			}else{
				address = Math.min(address, word.getAddress());
			}
		}
		
		Entry entry = null;
		
		for(Entry e : hexfile.getEntries()){
			if (e.getAddress() == address){
				entry = e;
			}
		}
		
		for(ConfigurationWord word : bits.getWords()){
			
			int index = word.getAddress()-address;
			int value = HexFileResource.byteToInt(entry.getData()[index]);
			
			for(ConfigurationField field : word.getFields()){
				int pv = value>>field.getStartBit();
				pv = pv & bitmask(field.getLength());
				
				setValue(configuration, field.getParameter(), pv);
			}			
			
		}
	}
	
	public static void insertConfigurationInHexfile(Configuration configuration, HexFile hexfile){
		/*
		 * Extract configuration bits 
		 */
		ConfigurationBits bits = (ConfigurationBits)configuration.getScheme().eContainer();
		Entry entry = HexfileFactory.eINSTANCE.createEntry();
		int address = -1;
		int addressmax = -1;
		
		for(ConfigurationWord word : bits.getWords()){
			if (address == -1){
				address = word.getAddress();
				addressmax = word.getAddress();
			}else{
				address = Math.min(address, word.getAddress());
				addressmax = Math.max(address, word.getAddress());
			}
		}
		
		byte[] data = new byte[addressmax+1-address];
		
		for(ConfigurationWord word : bits.getWords()){
			int value = 0;
			
			for(ConfigurationField field : word.getFields()){
				int pv = getValue(configuration, field.getParameter());
				
				pv = pv & bitmask(field.getLength());
				value += pv<<field.getStartBit();
			}
			
			value = value & bitmask(bits.getWordsize());
			
			int index = word.getAddress()-address;
			data[index] = HexFileResource.intToByte(value);
		}
		
		entry.setAddress(address);
		entry.setData(data);
		
		for(Entry e : hexfile.getEntries()){
			if (e.getAddress() == entry.getAddress()){
				hexfile.getEntries().set(hexfile.getEntries().indexOf(e), entry);
				return;
			}
		}
		hexfile.getEntries().add(entry);
	}
	
}
