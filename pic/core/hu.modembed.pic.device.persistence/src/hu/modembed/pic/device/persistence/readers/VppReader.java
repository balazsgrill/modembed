/**
 * 
 */
package hu.modembed.pic.device.persistence.readers;

import hu.modembed.pic.device.persistence.readers.basic.FieldReader;
import hu.modembed.pic.device.persistence.readers.basic.FloatRangeReader;
import hu.modembed.pic.device.persistence.readers.basic.FloatReader;
import hu.modembed.pic.device.persistence.tokens.Parser;
import microchip.device.Vpp;
import microchip.device.generic.FloatRange;
import microchip.device.generic.GenericFactory;

/**
 * @author balazs.grill
 *
 */
public class VppReader extends BracketedReader<Vpp> {

	/**
	 * @param model
	 */
	public VppReader(Vpp model) {
		super(model);
	}

	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.readers.BracketedReader#doHandlerToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	protected void doHandlerToken(String token, Parser parser) {
		if ("dflt".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new FloatReader() {
				
				@Override
				protected void handleFloat(float value) {
					model.setDflt(value);
				}
			}));
			return;
		}
		
		if ("range".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new FloatRangeReader() {
				
				@Override
				protected void handleRange(float start, float end) {
					FloatRange fr = GenericFactory.eINSTANCE.createFloatRange();
					fr.setStart(start);
					fr.setEnd(end);
					model.setRange(fr);
				}
			}));
			return;
		}

	}

}
