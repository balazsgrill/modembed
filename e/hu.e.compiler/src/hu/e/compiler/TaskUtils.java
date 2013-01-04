/**
 * 
 */
package hu.e.compiler;

import hu.modembed.model.core.CoreFactory;
import hu.modembed.model.core.MODembedElement;
import hu.modembed.model.core.ModelOrigin;

/**
 * @author balazs.grill
 *
 */
public class TaskUtils {

	public static void addOrigin(MODembedElement element, MODembedElement origin){
		ModelOrigin o = CoreFactory.eINSTANCE.createModelOrigin();
		o.setElement(origin);
		element.getOrigins().add(o);
	}
	
}
