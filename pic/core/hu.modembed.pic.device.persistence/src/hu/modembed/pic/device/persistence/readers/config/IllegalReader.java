/**
 * 
 */
package hu.modembed.pic.device.persistence.readers.config;

import hu.modembed.pic.device.persistence.readers.BracketedReader;
import hu.modembed.pic.device.persistence.readers.basic.FieldReader;
import hu.modembed.pic.device.persistence.readers.basic.IntReader;
import hu.modembed.pic.device.persistence.readers.basic.StringValueReader;
import hu.modembed.pic.device.persistence.tokens.Parser;
import microchip.device.config.Illegal;

/**
 * @author balazs.grill
 *
 */
public class IllegalReader extends BracketedReader<Illegal> {

	public IllegalReader(Illegal model) {
		super(model);
	}

	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.readers.BracketedReader#doHandlerToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	protected void doHandlerToken(String token, Parser parser) {
		
		if ("mask".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntReader() {
				
				@Override
				protected void handleInt(int value) {
					model.setMask(value);
				}
			}));
		}
		
		if ("value".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntReader() {
				
				@Override
				protected void handleInt(int value) {
					model.setValue(value);
				}
			}));
		}
		
		if ("msg".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new StringValueReader() {
				
				@Override
				protected void handleString(String value) {
					model.setMsg(value);
				}
			}));
		}
	}

}
