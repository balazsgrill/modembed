/**
 * 
 */
package hu.modembed.syntax.persistence.build;

import java.util.Deque;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author balazs.grill
 *
 */
public class SetFeatureBuildStep implements IModelBuildStep {

	private final String feature;
	private final String value;
	
	public SetFeatureBuildStep(String feature, String value) {
		this.feature = feature;
		this.value = value;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.build.IModelBuildStep#apply(java.util.Deque)
	 */
	@Override
	public void apply(ModelBuilder builder, Deque<EObject> modelStack) {
		EObject container = modelStack.peek();
		EStructuralFeature efeature = null;
		for(EStructuralFeature ref : container.eClass().getEAllStructuralFeatures()){
			if (feature.equals(ref.getName())){
				efeature = ref;
			}
		}
		if (efeature == null) throw new RuntimeException("Could not find feature : "+container.eClass().getName()+"/"+feature);
		if (efeature instanceof EReference){
			builder.addCrossReference(container, (EReference)efeature, value);
		}else{
			Object value = builder.getResolver().resolve(container, efeature, null, this.value);
			if (value == null) throw new RuntimeException("Could not resolve literal: "+this.value);
			if (efeature.isMany()){
				@SuppressWarnings("unchecked")
				List<Object> list = (List<Object>)container.eGet(efeature);
				list.add(value);
			}else{
				container.eSet(efeature, value);
			}
		}
	}

}
