/**
 * 
 */
package hu.modembed.syntax.persistence.build;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

import hu.modembed.syntax.persistence.IFeatureResolver;
import hu.modembed.syntax.persistence.ParsingError;

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
		
		public List<? extends Diagnostic> resolve(){
			Object value = resolver.resolve(context, reference, null, this.value);
			if (value == null) {
				return Collections.singletonList(new ParsingError("Could not resolve reference: "+this.value,""));
			}
			if (reference.isMany()){
				@SuppressWarnings("unchecked")
				List<Object> list = (List<Object>)context.eGet(reference);
				list.add(value);
			}else{
				context.eSet(reference, value);
			}
			return Collections.emptyList();
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
	
	public List<Diagnostic> buildModel(Resource container, List<IModelBuildStep> modelBuild){
		List<Diagnostic> errors = new ArrayList<>();
		references.clear();
		Deque<EObject> modelStack = new LinkedList<>();
		for(IModelBuildStep step : modelBuild){
			errors.addAll(step.apply(this, modelStack));
		}
		container.getContents().addAll(modelStack);
		for(CrossReference r : references){
			errors.addAll(r.resolve());
		}
		references.clear();
		return errors;
	}
	
	void addCrossReference(EObject context, EReference reference, String value){
		references.add(new CrossReference(context, reference, value));
	}
	
}
