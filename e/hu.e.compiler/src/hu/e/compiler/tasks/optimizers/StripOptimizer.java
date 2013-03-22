package hu.e.compiler.tasks.optimizers;

import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.e.compiler.tasks.internal.AbstractConverter;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.GlobalVariable;
import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.LibraryElement;
import hu.modembed.model.emodel.RegisterVariable;
import hu.modembed.model.emodel.Type;
import hu.modembed.model.emodel.expressions.LocalVariable;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class StripOptimizer implements IModembedTask {

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	public static final String ENTRY = "entry";
	
	private static final Set<Class<?>> strippedElements = new HashSet<Class<?>>();
	
	static{
		strippedElements.add(Function.class);
		strippedElements.add(Type.class);
		strippedElements.add(LocalVariable.class);
		strippedElements.add(GlobalVariable.class);
		strippedElements.add(RegisterVariable.class);
	}
	
	private static boolean check(EObject element){
		for(Class<?> clazz : strippedElements){
			if (clazz.isInstance(element)) return true;
		}
		return false;
	}
	
	private class ModelStripper extends AbstractConverter{
		
		private final Set<EObject> visited = new HashSet<EObject>();
		
		public void visit(EObject eobject){
			if (visited.contains(eobject)) return;
			visited.add(eobject);
			for(EObject eo : eobject.eContents()){
				if (!check(eo)) visit(eo);
			}
			for(EObject eo : eobject.eCrossReferences()){
				visit(eo);
			}
		}
		
		@Override
		protected EObject internalCopy(EObject element) {
			if (check(element) && !visited.contains(element)) return null;
			return super.internalCopy(element);
		}
		
	}
	
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		Library input = TaskUtils.getInput(context, INPUT, Library.class);
		String entry = context.getParameterValue(ENTRY).get(0);
		String out = context.getParameterValue(OUTPUT).get(0);
		
		Resource outr = context.getOutput(context.getModelURI(out)); 
		
		ModelStripper stripper = new ModelStripper();
		
		LibraryElement entryelement = null;
		for(LibraryElement e : input.getContent()){
			if (entry.equals(e.getName())){
				entryelement = e;
			}
		}
		Assert.isNotNull(entryelement, "Could not find element "+entry);
		stripper.visit(entryelement);
		
		Library output = stripper.copy(input);
		stripper.resolveCrossReferences();
		output.setName(out);
		outr.getContents().add(output);
	}

}
