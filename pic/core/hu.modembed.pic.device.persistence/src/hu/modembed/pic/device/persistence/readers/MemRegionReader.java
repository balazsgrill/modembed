/**
 * 
 */
package hu.modembed.pic.device.persistence.readers;

import microchip.device.memory.MemRegion;
import hu.modembed.pic.device.persistence.readers.basic.FieldReader;
import hu.modembed.pic.device.persistence.readers.basic.IntRangeReader;
import hu.modembed.pic.device.persistence.tokens.Parser;

/**
 * @author balazs.grill
 *
 */
public class MemRegionReader extends BracketedReader<MemRegion> {

	/**
	 * @param model
	 */
	public MemRegionReader(MemRegion model) {
		super(model);
	}

	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.readers.BracketedReader#doHandlerToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	protected void doHandlerToken(String token, Parser parser) {
		
		if ("region".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntRangeReader() {
				
				@Override
				protected void handleRange(int start, int end) {
					model.setStart(start);
					model.setEnd(end);
				}
			}));
		}
		

	}

}
