/**
 * 
 */
package hu.cubussapiens.modembed.pic.device.persistence.readers;

import hu.cubussapiens.modembed.pic.device.persistence.readers.basic.IntReader;
import hu.cubussapiens.modembed.pic.device.persistence.tokens.Parser;
import microchip.device.memory.MemRegion;
import microchip.device.memory.MemoryFactory;
import microchip.device.memory.MirrorRegs;

/**
 * @author balazs.grill
 *
 */
public class MirroredRegsReader extends AbstractModelReader<MirrorRegs> {

	/**
	 * @param model
	 */
	public MirroredRegsReader(MirrorRegs model) {
		super(model);
	}

	private boolean in = false;
	
	private int state = 0;
	
	private int start;
	
	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.tokens.ITokenHandler#handleToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	public void handleToken(String token, Parser parser) {
		if (in){

			switch(state){
			case 0:
				if (")".equals(token)){
					parser.pop();
					return;
				}
				start = IntReader.parseInt(token);
				state = 1;
				return;
			case 1:
				if ("-".equals(token)){
					state = 2;
					return;
				}
			case 2:
				int end = IntReader.parseInt(token);
				MemRegion mr = MemoryFactory.eINSTANCE.createMemRegion();
				mr.setStart(start);
				mr.setEnd(end);
				model.getRegions().add(mr);
				state = 0;
				return;
			}
			
			
			
		}else{
			if ("(".equalsIgnoreCase(token)){
				in = true;
			}else{
				parser.throwBack(token);
			}
		}
		
		
	}

	
}
