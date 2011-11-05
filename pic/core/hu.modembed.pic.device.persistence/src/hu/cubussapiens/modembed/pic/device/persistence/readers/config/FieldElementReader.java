/**
 * 
 */
package hu.cubussapiens.modembed.pic.device.persistence.readers.config;

import hu.cubussapiens.modembed.pic.device.persistence.readers.BracketedReader;
import hu.cubussapiens.modembed.pic.device.persistence.readers.basic.FieldReader;
import hu.cubussapiens.modembed.pic.device.persistence.readers.basic.IntReader;
import hu.cubussapiens.modembed.pic.device.persistence.readers.basic.StringValueReader;
import hu.cubussapiens.modembed.pic.device.persistence.tokens.Parser;
import microchip.device.config.Field;

/**
 * @author balazs.grill
 *
 */
public class FieldElementReader extends BracketedReader<Field> {

	/**
	 * @param model
	 */
	public FieldElementReader(Field model) {
		super(model);
	}

	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.readers.BracketedReader#doHandlerToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	protected void doHandlerToken(String token, Parser parser) {

		if ("key".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new StringValueReader() {
				
				@Override
				protected void handleString(String value) {
					model.setKey(value);
				}
			}));
		}
		
		if ("mask".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntReader() {
				
				@Override
				protected void handleInt(int value) {
					model.setMask(value);
				}
			}));
		}
		
		if ("desc".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new StringValueReader() {
				
				@Override
				protected void handleString(String value) {
					model.setDesc(value);
				}
			}));
		}

	}

}
