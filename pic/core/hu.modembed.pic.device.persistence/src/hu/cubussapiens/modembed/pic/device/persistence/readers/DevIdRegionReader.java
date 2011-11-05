/**
 * 
 */
package hu.cubussapiens.modembed.pic.device.persistence.readers;

import hu.cubussapiens.modembed.pic.device.persistence.readers.basic.FieldReader;
import hu.cubussapiens.modembed.pic.device.persistence.readers.basic.IntReader;
import hu.cubussapiens.modembed.pic.device.persistence.tokens.Parser;
import microchip.device.memory.DevID;

/**
 * @author balazs.grill
 *
 */
public class DevIdRegionReader extends MemRegionReader {

	/**
	 * @param model
	 */
	public DevIdRegionReader(DevID model) {
		super(model);
	}

	@Override
	protected void doHandlerToken(String token, Parser parser) {
		super.doHandlerToken(token, parser);
		
		if ("idmask".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntReader() {
				
				@Override
				protected void handleInt(int value) {
					((DevID)model).setIdmask(value);
				}
			}));
		}
		
		if ("id".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntReader() {
				
				@Override
				protected void handleInt(int value) {
					((DevID)model).setId(value);
				}
			}));
		}
		
	}
	
}
