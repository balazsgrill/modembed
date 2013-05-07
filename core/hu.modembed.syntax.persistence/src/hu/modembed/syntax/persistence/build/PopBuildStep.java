/**
 * 
 */
package hu.modembed.syntax.persistence.build;

import java.util.Collections;
import java.util.Deque;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author balazs.grill
 *
 */
public class PopBuildStep implements IModelBuildStep{

	@Override
	public List<? extends Diagnostic> apply(ModelBuilder builder, Deque<EObject> modelStack) {
		modelStack.pop();
		return Collections.emptyList();
	}

}
