/**
 * 
 */
package hu.modembed.syntax.persistence.build;

import java.util.Deque;

import org.eclipse.emf.ecore.EObject;

/**
 * @author balazs.grill
 *
 */
public class PopBuildStep implements IModelBuildStep{

	@Override
	public void apply(ModelBuilder builder, Deque<EObject> modelStack) {
		modelStack.pop();
	}

}
