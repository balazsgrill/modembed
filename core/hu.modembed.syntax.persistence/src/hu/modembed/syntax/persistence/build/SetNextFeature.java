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
public class SetNextFeature implements IModelBuildStep {

	private final String feature;
	
	@Override
	public String toString() {
		return feature+"=>";
	}
	
	public SetNextFeature(String feature) {
		this.feature = feature;
	}
	
	@Override
	public int position() {
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.build.IModelBuildStep#apply(hu.modembed.syntax.persistence.build.ModelBuilder, java.util.Deque)
	 */
	@Override
	public List<? extends Diagnostic> apply(ModelBuilder builder,
			Deque<EObject> modelStack) {
		String prev = builder.getNextFeature(); 
		builder.setNextFeature(feature);
		if (prev != null){
			return Collections.singletonList(new ParsingError("Feature is overridden from "+prev+" to "+feature, ""));
		}
		return Collections.emptyList();
	}

}
