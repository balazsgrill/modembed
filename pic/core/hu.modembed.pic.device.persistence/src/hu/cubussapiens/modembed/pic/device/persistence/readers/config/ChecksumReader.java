/**
 * 
 */
package hu.cubussapiens.modembed.pic.device.persistence.readers.config;

import hu.cubussapiens.modembed.pic.device.persistence.readers.BracketedReader;
import hu.cubussapiens.modembed.pic.device.persistence.readers.basic.FieldReader;
import hu.cubussapiens.modembed.pic.device.persistence.readers.basic.IntRangeReader;
import hu.cubussapiens.modembed.pic.device.persistence.readers.basic.IntReader;
import hu.cubussapiens.modembed.pic.device.persistence.tokens.Parser;
import microchip.device.config.Checksum;
import microchip.device.generic.GenericFactory;
import microchip.device.generic.IntRange;

/**
 * @author balazs.grill
 *
 */
public class ChecksumReader extends BracketedReader<Checksum> {

	/**
	 * @param model
	 */
	public ChecksumReader(Checksum model) {
		super(model);
	}

	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.readers.BracketedReader#doHandlerToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	protected void doHandlerToken(String token, Parser parser) {

		if ("type".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntReader() {
				
				@Override
				protected void handleInt(int value) {
					model.setType(value);
				}
			}));
		}

		if ("protregion".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntRangeReader() {
				
				@Override
				protected void handleRange(int start, int end) {
					IntRange range = GenericFactory.eINSTANCE.createIntRange();
					range.setStart(start);
					range.setEnd(end);
					model.setProtregion(range);
				}
			}));
		}
		
	}

}
