/**
 * 
 */
package hu.e.parser.convert;


import hu.e.parser.convert.impl.ExpressionConverter;
import hu.e.parser.convert.impl.FunctionConverter;
import hu.e.parser.convert.impl.RootReferenceScope;
import hu.e.parser.convert.impl.TypeConverter;
import hu.e.parser.eSyntax.ConstantVariable;
import hu.e.parser.eSyntax.InsctructionSectionNotation;
import hu.e.parser.eSyntax.InstructionNotation;
import hu.e.parser.eSyntax.InstructionParameterNotation;
import hu.e.parser.eSyntax.InstructionSetNotation;
import hu.e.parser.eSyntax.InstructionWordConditionNotation;
import hu.e.parser.eSyntax.InstructionWordNotation;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LibraryItem;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.RegisterVariable;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.WorkflowNotation;
import hu.e.parser.eSyntax.WorkflowStepNotation;
import hu.e.parser.eSyntax.WorkflowStepParameterNotation;
import hu.modembed.MODembedCore;
import hu.modembed.model.core.CoreFactory;
import hu.modembed.model.core.MODembedElement;
import hu.modembed.model.core.TextOrigin;
import hu.modembed.model.core.assembler.AssemblerFactory;
import hu.modembed.model.core.assembler.AssemblerPackage;
import hu.modembed.model.core.assembler.ConstantSection;
import hu.modembed.model.core.assembler.Instruction;
import hu.modembed.model.core.assembler.InstructionParameter;
import hu.modembed.model.core.assembler.InstructionSection;
import hu.modembed.model.core.assembler.InstructionSet;
import hu.modembed.model.core.assembler.InstructionWord;
import hu.modembed.model.core.assembler.InstructionWordMaskedValueCondition;
import hu.modembed.model.core.assembler.ParameterSection;
import hu.modembed.model.core.workflow.Task;
import hu.modembed.model.core.workflow.TaskParameter;
import hu.modembed.model.core.workflow.Workflow;
import hu.modembed.model.core.workflow.WorkflowFactory;
import hu.modembed.model.emodel.EmodelFactory;
import hu.modembed.model.emodel.HeapVariable;
import hu.modembed.model.emodel.LibraryElement;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

/**
 * @author balazs.grill
 *
 */
public class LibraryConverter {

	public static final String MODELS_FOLDER = ".models";
	
	private final ResourceSet resourceSet;
	
	private final IProject project;
	
	public static TextOrigin createOrigin(EObject origin){
		URI uri = origin.eResource().getURI();
		String path = uri.toPlatformString(true);
		TextOrigin to = CoreFactory.eINSTANCE.createTextOrigin();
		to.setPath(path);
		
		ICompositeNode node = NodeModelUtils.findActualNodeFor(origin);
		if (node != null){
			to.setLine(node.getStartLine());
			to.setCharStart(node.getOffset());
			to.setCharEnd(to.getCharStart()+node.getLength());
		}
		
		return to;
	}
	
	private static String parseComment(String comment){
		StringBuilder sb = new StringBuilder();
		if (comment.startsWith("//")){
			sb.append(comment.substring(2));
			sb.append("\n");
		}else if (comment.startsWith("/*")){
			comment = comment.substring(2, comment.length()-4);
			String[] lines = comment.split("\n");
			for(String line : lines){
				line = line.trim();
				while(line.startsWith("*")){
					line = line.substring(1).trim();
				}
				if (!"".equals(line)){
					sb.append(line);
					sb.append("\n");
				}
			}
		}
		return sb.toString();
	}
	
	public static String getDescription(EObject element){
		ICompositeNode node = NodeModelUtils.findActualNodeFor(element);
		boolean got = false;
		StringBuilder sb = new StringBuilder();
		for(ILeafNode ln : node.getLeafNodes()) if (!got){
			if (ln.isHidden()){
				String text = ln.getText();
				sb.append(parseComment(text));
			}else{
				got = true;
			}
		}
		return sb.toString();
	}
	
	public static void addOrigin(MODembedElement element, EObject origin){
		element.getOrigins().add(createOrigin(origin));
		element.setDescription(getDescription(origin));
	}
	
	public LibraryConverter(IProject project) {
		this.resourceSet = MODembedCore.createResourceSet();
		this.project = project;
	}
	
	private URI getLibURI(String name){
		IFolder folder = project.getFolder(MODELS_FOLDER);
		if (!folder.exists()){
			try {
				folder.create(true, true, new NullProgressMonitor());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		IFile file = folder.getFile(name+".xmi");
		return URI.createPlatformResourceURI(file.getFullPath().toString(), true);
	}
	
	private LibraryElement convertElement(LibraryItem item, ICrossReferenceScope scope){
		if (item instanceof Type){
			Type from = (Type)item;
			hu.modembed.model.emodel.Type to = EmodelFactory.eINSTANCE.createType();
			
			to.setName(from.getName());
			to.setDefinition(TypeConverter.convertTypeDef(from.getDef(), scope));
			
			addOrigin(to, from);
			return to;
		}
		
		if (item instanceof Operation){
			return FunctionConverter.convert((Operation)item, scope);
		}
		
		if (item instanceof Variable){
			
			if (item instanceof ConstantVariable){
				hu.modembed.model.emodel.ConstantVariable cv = EmodelFactory.eINSTANCE.createConstantVariable();
				cv.setName(item.getName());
				cv.setType(TypeConverter.convertTypeDef(((Variable) item).getType(), scope));
				cv.setValue(ExpressionConverter.convert(((ConstantVariable) item).getValue(), scope));
				addOrigin(cv, item);
				return cv;
			}else if (item instanceof RegisterVariable){
				hu.modembed.model.emodel.RegisterVariable rv = EmodelFactory.eINSTANCE.createRegisterVariable();
				rv.setName(item.getName());
				rv.setType(TypeConverter.convertTypeDef(((Variable) item).getType(), scope));
				rv.setAddress(ExpressionConverter.convert(((RegisterVariable) item).getAddr(), scope));
				addOrigin(rv, item);
				return rv;
			}else{
				//Heap variable
				HeapVariable hv = EmodelFactory.eINSTANCE.createHeapVariable();
				hv.setName(item.getName());
				hv.setType(TypeConverter.convertTypeDef(((Variable) item).getType(), scope));
				addOrigin(hv, item);
				return hv;
			}
			
		}
		
		return null;
	}
	
	public static int convertLiteral(String lit){
		if (lit == null) return 0;
		if (lit.length() == 0) return 0;
		if (lit.toLowerCase().startsWith("b")){
			return Integer.parseInt(lit.substring(1), 2);
		}
		if (lit.toLowerCase().startsWith("0x")){
			return Integer.parseInt(lit.substring(2), 16);
		}
		return Integer.parseInt(lit);
	}
	
	public Instruction convertInstruction(InstructionNotation in){
		Instruction result = AssemblerFactory.eINSTANCE.createInstruction();
		result.setName(in.getName());
		
		Map<Character, InstructionParameter> params = new HashMap<Character, InstructionParameter>();
		for(InstructionParameterNotation pn : in.getParams()) {
			InstructionParameter p = AssemblerFactory.eINSTANCE.createInstructionParameter();
			p.setId(pn.getName().charAt(0));
			p.setDefaultValue(convertLiteral(pn.getDefault()));
			params.put(p.getId(), p);
			result.getParameters().add(p);
		}
		
		int start = 0;
		for(InstructionWordNotation wn : in.getWords()){
			InstructionWord w = AssemblerFactory.eINSTANCE.createInstructionWord();
			for(InsctructionSectionNotation sn : wn.getSections()){
				InstructionSection s = null;
				if (null != sn.getParam()){
					//Parameters
					ParameterSection ps = AssemblerFactory.eINSTANCE.createParameterSection();
					ps.setParameter(params.get(sn.getParam().charAt(0)));
					s = ps;
				}else{
					//Constant
					ConstantSection cs = AssemblerFactory.eINSTANCE.createConstantSection();
					cs.setValue(convertLiteral(sn.getValue()));
					s = cs;
				}

				if (s != null){
					s.setStart(start);
					s.setSize(convertLiteral(sn.getSize()));
					s.setShift(convertLiteral(sn.getShift()));
					w.getSections().add(s);
					start += s.getSize();
				}
			}
			for(InstructionWordConditionNotation condition : wn.getConditions()){
				InstructionWordMaskedValueCondition c = AssemblerFactory.eINSTANCE.createInstructionWordMaskedValueCondition();
				Character p = condition.getParam().charAt(0);
				c.setArgument(params.get(p));
				c.setMask(convertLiteral(condition.getMask()));
				c.setValue(convertLiteral(condition.getValue()));
				w.getCondition().add(c);
			}
			result.getWords().add(w);
		}
		
		addOrigin(result, in);
		return result;
	}
	
	public List<UnresolvedCrossReference> convert(WorkflowNotation wfn){
		Workflow result = WorkflowFactory.eINSTANCE.createWorkflow();
		result.setName(wfn.getName());
		addOrigin(result, wfn);
		
		for(WorkflowStepNotation sn : wfn.getSteps()){
			Task task = WorkflowFactory.eINSTANCE.createTask();
			task.setType(sn.getType());
			addOrigin(task, sn);
			result.getTasks().add(task);
			
			for(WorkflowStepParameterNotation pn : sn.getParams()){
				TaskParameter tp = null;
				for(TaskParameter p : task.getParameters()){
					if (p.getName().equals(pn.getParameter())){
						tp = p;
					}
				}
				if (tp == null){
					tp = WorkflowFactory.eINSTANCE.createTaskParameter();
					tp.setName(pn.getParameter());
					task.getParameters().add(tp);
				}
				tp.getValue().add(pn.getValue());
			}
		}
		
		URI uri = getLibURI(result.getName());
		Resource r = resourceSet.createResource(uri);
		r.getContents().add(result);
		try {
			r.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
	
	public List<UnresolvedCrossReference> convert(InstructionSetNotation isetn){
		InstructionSet result = AssemblerFactory.eINSTANCE.createInstructionSet();
		result.setName(isetn.getName());
		addOrigin(result, isetn);
		
		ICrossReferenceScope scope = new RootReferenceScope(project, resourceSet, result, Collections.<String>emptyList());
		if (isetn.getExtends() != null){
			scope.addCrossReference(result, AssemblerPackage.eINSTANCE.getInstructionSet_Extend(), isetn.getExtends());
		}
		
		for(InstructionNotation in : isetn.getInstructions()){
			result.getInstructions().add(convertInstruction(in));
		}
		
		List<UnresolvedCrossReference> fail = scope.resolveReferences();
		
		URI uri = getLibURI(result.getName());
		Resource r = resourceSet.createResource(uri);
		r.getContents().add(result);
		try {
			r.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fail;
	}
	
	public List<UnresolvedCrossReference> convert(Library library){
		hu.modembed.model.emodel.Library result = EmodelFactory.eINSTANCE.createLibrary();
		result.setName(library.getName());
		addOrigin(result, library);
		
		ICrossReferenceScope scope = new RootReferenceScope(project, resourceSet, result, library.getUse());
		
		for(LibraryItem item : library.getItems()){
			LibraryElement le = convertElement(item, scope);
			if (le != null){
				result.getContent().add(le);
			}
		}
		
		List<UnresolvedCrossReference> fail = scope.resolveReferences();
		
		URI uri = getLibURI(result.getName());
		Resource r = resourceSet.createResource(uri);
		r.getContents().add(result);
		try {
			r.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fail;
	}
	
}
