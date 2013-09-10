/**
 * 
 */
package hu.modembed.syntax.persistence.build;

import hu.modembed.syntax.persistence.ParsingError;

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

	private final int position;
	
	public PopBuildStep(int position) {
		this.position = position;
	}
	
	@Override
	public int position() {
		return position;
	}
	
	@Override
	public String toString() {
		return "["+position+"]}";
	}
	
	@Override
	public List<? extends Diagnostic> apply(ModelBuilder builder, Deque<EObject> modelStack) {
		if (modelStack.isEmpty()){
			return Collections.singletonList(new ParsingError("Model stack is empty!",""));
		}
		modelStack.pop();
		return Collections.emptyList();
	}

}
