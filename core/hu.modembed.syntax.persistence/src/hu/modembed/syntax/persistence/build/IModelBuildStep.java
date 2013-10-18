/**
 * 
 */
package hu.modembed.syntax.persistence.build;

import java.util.Deque;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author balazs.grill
 *
 */
public interface IModelBuildStep {

	public List<? extends Diagnostic> apply(ModelBuilder builder, Deque<EObject> modelStack);
	
	public int position();
	
}
