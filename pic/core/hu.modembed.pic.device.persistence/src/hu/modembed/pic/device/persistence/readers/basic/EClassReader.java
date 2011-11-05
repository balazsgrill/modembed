/**
 * 
 */
package hu.modembed.pic.device.persistence.readers.basic;

import hu.modembed.pic.device.persistence.readers.BracketedReader;
import hu.modembed.pic.device.persistence.tokens.Parser;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * @author balazs.grill
 *
 */
public class EClassReader extends BracketedReader<EObject> {

	/**
	 * @param model
	 */
	public EClassReader(EObject model) {
		super(model);
	}

	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.readers.BracketedReader#doHandlerToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	protected void doHandlerToken(String token, Parser parser) {
		
		for(final EAttribute attrib : model.eClass().getEAllAttributes()){
			if (attrib.getName().equalsIgnoreCase(token)){
				
				if (int.class.equals(attrib.getEAttributeType().getInstanceClass())){
					parser.push(new FieldReader(new IntReader() {
						
						@Override
						protected void handleInt(int value) {
							model.eSet(attrib, Integer.valueOf(value));		
						}
					}));
				}
				
				if (float.class.equals(attrib.getEAttributeType().getInstanceClass())){
					parser.push(new FieldReader(new FloatReader() {
						
						@Override
						protected void handleFloat(float value) {
							model.eSet(attrib, Float.valueOf(value));		
						}
					}));
				}
				
				if (String.class.equals(attrib.getEAttributeType().getInstanceClass())){
					parser.push(new FieldReader(new StringValueReader() {
						
						@Override
						protected void handleString(String value) {
							model.eSet(attrib, value);		
						}
					}));
				}
				
				return;
			}
		}
		
		parser.throwBack(token);
	}

}
