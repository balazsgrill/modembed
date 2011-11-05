/**
 * 
 */
package hu.cubussapiens.modembed.pic.device.persistence.readers.config;

import microchip.device.config.CfgBits;
import hu.cubussapiens.modembed.pic.device.persistence.readers.BracketedReader;
import hu.cubussapiens.modembed.pic.device.persistence.readers.basic.FieldReader;
import hu.cubussapiens.modembed.pic.device.persistence.readers.basic.IntReader;
import hu.cubussapiens.modembed.pic.device.persistence.readers.basic.StringValueReader;
import hu.cubussapiens.modembed.pic.device.persistence.tokens.Parser;

/**
 * @author balazs.grill
 *
 */
public class CfgBitsReader extends BracketedReader<CfgBits> {

	public CfgBitsReader(CfgBits model) {
		super(model);
	}

	@Override
	protected void doHandlerToken(String token, Parser parser) {
		
		if ("key".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new StringValueReader() {
				
				@Override
				protected void handleString(String value) {
					model.setKey(value);
				}
			}));
			return;
		}
		
		if ("addr".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntReader() {
				
				@Override
				protected void handleInt(int value) {
					model.setAddr(value);
				}
			}));
			return;
		}
		
		if ("unused".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntReader() {
				
				@Override
				protected void handleInt(int value) {
					model.setUnused(value);
				}
			}));
			return;
		}
		
		parser.throwBack(token);
	}

}
