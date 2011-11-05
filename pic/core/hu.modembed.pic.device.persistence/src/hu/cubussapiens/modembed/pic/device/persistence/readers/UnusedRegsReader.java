/**
 * 
 */
package hu.cubussapiens.modembed.pic.device.persistence.readers;

import microchip.device.memory.UnusedRegs;
import hu.cubussapiens.modembed.pic.device.persistence.readers.basic.IntReader;
import hu.cubussapiens.modembed.pic.device.persistence.tokens.Parser;

/**
 * @author balazs.grill
 *
 */
public class UnusedRegsReader extends AbstractModelReader<UnusedRegs> {

	/**
	 * @param model
	 */
	public UnusedRegsReader(UnusedRegs model) {
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
				model.setStart(start);
				model.setEnd(end);
				state = 3;
				return;
			case 3:
				if (")".equals(token)){
					parser.pop();
					return;
				}
				parser.throwBack(token);
				break;
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
