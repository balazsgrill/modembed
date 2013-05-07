/**
 * 
 */
package hu.modembed.syntax.persistence.build;

import hu.modembed.syntax.persistence.ParsingError;
import hu.modembed.syntax.persistence.TerminalMatch;

import java.util.Collections;
import java.util.Deque;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author balazs.grill
 *
 */
public class SetFeatureBuildStep implements IModelBuildStep {

	private final String feature;
	private final TerminalMatch match;
	
	public SetFeatureBuildStep(String feature, TerminalMatch match) {
		this.feature = feature;
		this.match = match;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.build.IModelBuildStep#apply(java.util.Deque)
	 */
	@Override
	public List<? extends Diagnostic> apply(ModelBuilder builder, Deque<EObject> modelStack) {
		EObject container = modelStack.peek();
		EStructuralFeature efeature = null;
		for(EStructuralFeature ref : container.eClass().getEAllStructuralFeatures()){
			if (feature.equals(ref.getName())){
				efeature = ref;
			}
		}
		if (efeature == null) {
			return Collections.singletonList(new ParsingError("Could not find feature : "+container.eClass().getName()+"/"+feature,""));
		}
		if (efeature instanceof EReference){
			builder.addCrossReference(container, (EReference)efeature, match.getProcessedValue());
		}else{
			Object value = builder.getResolver().resolve(container, efeature, null, this.match.getProcessedValue());
			if (value == null){ 
				return Collections.singletonList(new ParsingError("Could not resolve literal: "+this.match.getProcessedValue(), ""));
			}
			if (efeature.isMany()){
				@SuppressWarnings("unchecked")
				List<Object> list = (List<Object>)container.eGet(efeature);
				list.add(value);
			}else{
				container.eSet(efeature, value);
			}
		}
		return Collections.emptyList();
	}

}
