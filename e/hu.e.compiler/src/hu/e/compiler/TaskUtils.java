/**
 * 
 */
package hu.e.compiler;

import hu.e.compiler.tasks.internal.TypeSignature;
import hu.modembed.model.core.CoreFactory;
import hu.modembed.model.core.MODembedElement;
import hu.modembed.model.core.ModelOrigin;
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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;

/**
 * @author balazs.grill
 *
 */
public class TaskUtils {

	public static void addOrigin(MODembedElement element, MODembedElement origin){
		ModelOrigin o = CoreFactory.eINSTANCE.createModelOrigin();
		o.setElement(origin);
		element.getOrigins().add(o);
	}
	
	public static boolean canAssign(VariableParameterKind from, VariableParameterKind to){
		switch(to){
		case ANY: return true;
		case CONST: return from == VariableParameterKind.CONST; 
		case VAR:  return from == VariableParameterKind.VAR;
		default: return false;
		}
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
