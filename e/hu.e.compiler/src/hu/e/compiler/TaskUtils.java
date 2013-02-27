/**
 * 
 */
package hu.e.compiler;

import hu.e.compiler.tasks.internal.TypeSignature;
import hu.modembed.model.architecture.Architecture;
import hu.modembed.model.core.CoreFactory;
import hu.modembed.model.core.MODembedElement;
import hu.modembed.model.core.ModelOrigin;
import hu.modembed.model.core.Origin;
import hu.modembed.model.core.RootElement;
import hu.modembed.model.core.TextOrigin;
import hu.modembed.model.emodel.CallableElement;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.FunctionParameter;
import hu.modembed.model.emodel.LazyParameter;
import hu.modembed.model.emodel.Variable;
import hu.modembed.model.emodel.VariableParameter;
import hu.modembed.model.emodel.VariableParameterKind;
import hu.modembed.model.emodel.expressions.Call;
import hu.modembed.model.emodel.expressions.ExecutionStep;
import hu.modembed.model.emodel.expressions.LiteralExpression;
import hu.modembed.model.emodel.expressions.VariableReference;
import hu.modembed.model.emodel.types.CodeLabelTypeDefinition;
import hu.modembed.model.emodel.types.PointerTypeDefinition;
import hu.modembed.model.emodel.types.ReferenceTypeDefinition;
import hu.modembed.model.emodel.types.TypeDefinition;
import hu.modembed.model.emodel.types.UnsignedTypeDefinition;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class TaskUtils {

	public static <T> T getInputModel(ITaskContext context, String value, Class<T> clazz){
		boolean modembedType = RootElement.class.isAssignableFrom(clazz);
		URI uri = modembedType ? context.getModelURI(value) : context.getFileURI(value);
		Resource r = context.getInput(uri);
		if (r != null){
			EObject eo = r.getContents().get(0);
			if (clazz.isInstance(eo)) return clazz.cast(eo);
			context.logStatus(error("Type of input is invalid: '"+value+"' (expected: "+clazz.getName()+", found: "+eo.eClass().getName()+")"));
			return null;
		}else{
			context.logStatus(error("Invalid input value: "+value));
			return null;
		}
	}
	
	public static EObject createOutputModel(ITaskContext context, String value, EClass eclass){
		boolean modembedType = RootElement.class.isAssignableFrom(eclass.getInstanceClass());
		URI uri = modembedType ? context.getModelURI(value) : context.getFileURI(value);
		Resource r = context.getOutput(uri);
		if (r != null){
			EObject eo = eclass.getEPackage().getEFactoryInstance().create(eclass);
			r.getContents().add(eo);
			return eo;
		}else{
			context.logStatus(error("Invalid input value: "+value));
			return null;
		}
	}
	
	public static <T> T getInput(ITaskContext context, String parameter, Class<T> clazz){
		List<String> values = context.getParameterValue(parameter);
		if (values.isEmpty()){
			context.logStatus(error("Input parameter '"+parameter+"' does not have a value set."));
			return null;
		}
		return getInputModel(context, values.get(0), clazz);
	}
	
	public static EObject createOutput(ITaskContext context, String parameter, EClass eclass){
		List<String> values = context.getParameterValue(parameter);
		if (values.isEmpty()){
			context.logStatus(error("Output parameter '"+parameter+"' does not have a value set."));
			return null;
		}
		return createOutputModel(context, values.get(0), eclass);
	}
	
	public static void addOrigin(MODembedElement element, MODembedElement origin){
		ModelOrigin o = CoreFactory.eINSTANCE.createModelOrigin();
		o.setElement(origin);
		element.getOrigins().add(o);
	}
	
	public static IStatus error(String msg, MODembedElement source){
		return new Status(IStatus.ERROR, ECompilerPlugin.PLUGIN_ID, msg+" at "+printOrigin(findOrigin(source)));
	}
	
	public static String printOrigin(TextOrigin to){
		if (to == null){
			return "Unknown location";
		}
		return "line "+to.getLine()+" in "+to.getPath();
	}
	
	public static TextOrigin findOrigin(MODembedElement element){
		Queue<MODembedElement> elements = new LinkedList<MODembedElement>();
		elements.add(element);
		
		while(!elements.isEmpty()){
			MODembedElement me = elements.poll();
			
			EObject parent = me.eContainer();
			if (parent instanceof MODembedElement){
				elements.add((MODembedElement)parent);
			}
			
			for(Origin o : me.getOrigins()){
				if (o instanceof TextOrigin){
					return (TextOrigin)o;
				}
				if (o instanceof ModelOrigin){
					elements.add(((ModelOrigin) o).getElement());
				}
			}
		}
		
		return null;
	}
	
	public static boolean canAssign(VariableParameterKind from, VariableParameterKind to){
		switch(to){
		case ANY: return true;
		case CONST: return from == VariableParameterKind.CONST; 
		case VAR:  return from == VariableParameterKind.VAR;
		default: return false;
		}
	}
	
	public static int inferSize(TypeDefinition type, Architecture arch){
		if (type instanceof PointerTypeDefinition){
			return inferSize(arch.getHeapPointerType().getDefinition(), arch);
		}
		if (type instanceof ReferenceTypeDefinition){
			return inferSize(((ReferenceTypeDefinition) type).getType().getDefinition(), arch);
		}
		if (type instanceof UnsignedTypeDefinition){
			return ((UnsignedTypeDefinition) type).getBits()/8;
		}
		if (type instanceof CodeLabelTypeDefinition){
			return inferSize(arch.getCodePointerType().getDefinition(), arch);
		}
		//TODO structure
		return 0;
	}
	
	public static boolean checkSignature(Function function, TypeSignature...signature){
		if (function.getArguments().size() != signature.length) return false;
		
		int i = 0;
		for(i=0;i<function.getArguments().size();i++){
			FunctionParameter fp = function.getArguments().get(i);
			if (fp instanceof LazyParameter){
				
			}else{
				VariableParameter vp = (VariableParameter)fp;
				VariableParameterKind kind = vp.getKind();
				TypeDefinition td = fp.getType();
				if (!canAssign(signature[i].getKind(), kind)) return false;
				if (!canCast(signature[i].getType(), td)) return false;
			}
		}
		
		return true;
	}
	
	public static boolean canCast(TypeDefinition from, TypeDefinition to){
		if (to == null) return true;
		
		if (to instanceof ReferenceTypeDefinition){
			return canCast(from, ((ReferenceTypeDefinition) to).getType().getDefinition());
		}
		if (from instanceof ReferenceTypeDefinition){
			return canCast(((ReferenceTypeDefinition) from).getType().getDefinition(), to);
		}
		if (from instanceof PointerTypeDefinition && to instanceof PointerTypeDefinition){
			PointerTypeDefinition pfrom = (PointerTypeDefinition)from;
			PointerTypeDefinition pto = (PointerTypeDefinition)to;
			return canCast(pfrom.getPointerType(), pto.getPointerType());
		}
		if (from instanceof UnsignedTypeDefinition && to instanceof UnsignedTypeDefinition){
			UnsignedTypeDefinition ufrom = (UnsignedTypeDefinition)from;
			UnsignedTypeDefinition uto = (UnsignedTypeDefinition)to;
			
			return ufrom.getBits() <= uto.getBits();
		}
		if (from instanceof CodeLabelTypeDefinition){
			return to instanceof CodeLabelTypeDefinition;
		}
		return false;
	}
	
	public static IStatus error(String msg){
		return new Status(IStatus.ERROR, ECompilerPlugin.PLUGIN_ID, msg);
	}
	
	public static TypeSignature inferType(ExecutionStep step){
		if (step instanceof VariableReference){
			Variable v = ((VariableReference) step).getVariable();
			if (v != null){
				//PointerTypeDefinition pdef = TypesFactory.eINSTANCE.createPointerTypeDefinition();
				//pdef.setPointerType(v.getType());
				//return pdef;
				return new TypeSignature(v.getType(), VariableParameterKind.VAR);
			}
		}
		if (step instanceof LiteralExpression){
			return new TypeSignature(((LiteralExpression) step).getType(), VariableParameterKind.CONST);
		}
		if (step instanceof Call){
			CallableElement called = ((Call) step).getFunction();
			if (called instanceof Function){
				return new TypeSignature(((Function) called).getType(), VariableParameterKind.ANY);
			}
		}
		return null;
	}
	
	public static URI findModelURI(IProject project, String name){
		List<IProject> projects = new LinkedList<IProject>();
		projects.add(project);
		try {
			projects.addAll(Arrays.asList(project.getDescription().getReferencedProjects()));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		final List<IFile> possibleFiles = new LinkedList<IFile>();
		final String filename = name+".xmi";
		
		for(IProject p : projects){
			try {
				p.accept(new IResourceVisitor() {
					
					@Override
					public boolean visit(IResource resource) throws CoreException {
						if (resource instanceof IFile){
							if (filename.equals(resource.getName())){
								possibleFiles.add((IFile)resource);
							}
							return false;
						}
						return true;
					}
				});
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (!possibleFiles.isEmpty()){
			return URI.createPlatformResourceURI(possibleFiles.get(0).getFullPath().toString(), true);
		}
		return null;
	}
	
}
