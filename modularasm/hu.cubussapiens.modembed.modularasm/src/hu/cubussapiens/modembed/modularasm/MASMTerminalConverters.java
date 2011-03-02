/**
 * 
 */
package hu.cubussapiens.modembed.modularasm;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parsetree.AbstractNode;

/**
 * @author balazs.grill
 *
 */
public class MASMTerminalConverters extends DefaultTerminalConverters {

	@ValueConverter(rule = "HEXINT")
	public IValueConverter<Integer> HEXINT(){
		return new IValueConverter<Integer>(){

			@Override
			public String toString(Integer arg0) throws ValueConverterException {
				return "0x"+Integer.toHexString(arg0);
			}

			@Override
			public Integer toValue(String value, AbstractNode arg1)
					throws ValueConverterException {
				if (value.startsWith("0x")){
					return Integer.parseInt(value.substring(2), 16);
				}
				return null;
			}
			
		};
	}

}
