/**
 * 
 */
package hu.modembed.syntax.persistence.build;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import hu.modembed.syntax.persistence.IFeatureResolver;

/**
 * @author balazs.grill
 *
 */
public class ModelBuilder {

	private class CrossReference{
		
		public final EObject context;
		public final EReference reference;
		public final String value;
		
		public CrossReference(EObject context, EReference reference,
				String value) {
			this.context = context;
			this.reference = reference;
			this.value = value;
		}
		
		public void resolve(){
			Object value = resolver.resolve(context, reference, null, this.value);
			if (value == null) throw new RuntimeException("Could not resolve reference: "+this.value);
			if (reference.isMany()){
				@SuppressWarnings("unchecked")
				List<Object> list = (List<Object>)context.eGet(reference);
				list.add(value);
			}else{
				context.eSet(reference, value);
			}
		}
		
	}
	
	private final IFeatureResolver resolver;
	private final List<CrossReference> references = new LinkedList<>();
	
	public ModelBuilder(IFeatureResolver resolver) {
		this.resolver = resolver;
	}
	
	public IFeatureResolver getResolver() {
		return resolver;
	}
	
	public void buildModel(Resource container, List<IModelBuildStep> modelBuild){
		references.clear();
		Deque<EObject> modelStack = new LinkedList<>();
		for(IModelBuildStep step : modelBuild){
			step.apply(this, modelStack);
		}
		container.getContents().addAll(modelStack);
		for(CrossReference r : references){
			r.resolve();
		}
		references.clear();
	}
	
	void addCrossReference(EObject context, EReference reference, String value){
		references.add(new CrossReference(context, reference, value));
	}
	
}
