/**
 * 
 */
package hu.modembed.pic.device.persistence.readers;

import hu.modembed.pic.device.persistence.readers.basic.FieldReader;
import hu.modembed.pic.device.persistence.readers.basic.FloatRangeReader;
import hu.modembed.pic.device.persistence.readers.basic.FloatReader;
import hu.modembed.pic.device.persistence.tokens.Parser;
import microchip.device.Vdd;
import microchip.device.generic.FloatRange;
import microchip.device.generic.GenericFactory;

/**
 * @author balazs.grill
 *
 */
public class VddReader extends BracketedReader<Vdd> {

	public VddReader(Vdd model) {
		super(model);
	}

	@Override
	protected void doHandlerToken(String token, Parser parser) {
		if ("nominal".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new FloatReader() {
				
				@Override
				protected void handleFloat(float value) {
					model.setNominal(value);
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
		
		if ("dfltrange".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new FloatRangeReader() {
				
				@Override
				protected void handleRange(float start, float end) {
					FloatRange fr = GenericFactory.eINSTANCE.createFloatRange();
					fr.setStart(start);
					fr.setEnd(end);
					model.setDfltrange(fr);
				}
			}));
			return;
		}
	}

}
