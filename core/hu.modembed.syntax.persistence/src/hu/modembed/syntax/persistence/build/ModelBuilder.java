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
import hu.modembed.syntax.persistence.IParserInput;
import hu.modembed.syntax.persistence.IStringValue;
import hu.modembed.syntax.persistence.ParsingError;

/**
 * @author balazs.grill
 *
 */
public class ModelBuilder {

	private class CrossReference{
		
		public final EObject context;
		public final EReference reference;
		public final IStringValue value;
		
		public CrossReference(EObject context, EReference reference,
				IStringValue value) {
			this.context = context;
			this.reference = reference;
			this.value = value;
		}
		
		public List<? extends Diagnostic> resolve(){
			final String processedValue = this.value.getProcessedValue();
			Object value = resolver.resolve(context, reference, null, processedValue);
			if (value == null) {
				int[] lc = this.value.getLineAndColumn();
				return Collections.singletonList(new ParsingError("Could not resolve reference: "+processedValue,"", lc[0], lc[1]));
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
	
	private String nextFeature = null;
	private final IFeatureResolver resolver;
	private final List<CrossReference> references = new LinkedList<CrossReference>();
	private final IParserInput input;
	
	public ModelBuilder(IFeatureResolver resolver, IParserInput input) {
		this.resolver = resolver;
		this.input = input;
	}
	
	public IParserInput getInput() {
		return input;
	}
	
	public IFeatureResolver getResolver() {
		return resolver;
	}
	
	public List<Diagnostic> buildModel(Resource container, List<IModelBuildStep> modelBuild){
		List<Diagnostic> errors = new ArrayList<Diagnostic>();
		references.clear();
		Deque<EObject> modelStack = new LinkedList<EObject>();
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
	
	void addCrossReference(EObject context, EReference reference, IStringValue value){
		references.add(new CrossReference(context, reference, value));
	}

	public void setNextFeature(String feature) {
		this.nextFeature = feature;
	}
	
	public String getNextFeature() {
		return nextFeature;
	}
	
}
