/**
 * 
 */
package hu.e.compiler.tasks;

import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.modembed.model.architecture.Architecture;
import hu.modembed.model.architecture.MemorySection;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.HeapVariable;
import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.LibraryElement;
import hu.modembed.model.emodel.Variable;
import hu.modembed.model.emodel.expressions.ExecutionBlock;
import hu.modembed.model.emodel.expressions.ExecutionStep;
import hu.modembed.model.emodel.expressions.LocalVariable;
import hu.modembed.model.emodel.memorymap.HeapLevel;
import hu.modembed.model.emodel.memorymap.HeapVariableMapping;
import hu.modembed.model.emodel.memorymap.MemoryMap;
import hu.modembed.model.emodel.memorymap.MemorymapFactory;
import hu.modembed.model.emodel.types.CodeLabelTypeDefinition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class CreateHeapMemoryMap implements IModembedTask {

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	public static final String ENTRY = "entry";
	public static final String ARCH = "architecture";
	
	private class VariableAllocation{
		
		private final MemoryMap map;
		
		public MemoryMap getMap() {
			return map;
		}
		
		private class Address{
			private final int section;
			private final int start;
			
			public Address(int section, int start) {
				this.section = section;
				this.start = start;
			}
			
			public long getAddress(){
				MemorySection ms = sections.get(section);
				return ms.getStartAddress()+start;
			}
			
			public Address allocate(int size){
				MemorySection ms = sections.get(section);
				if (ms.getLength() > start+size){
					return this;
				}else{
					return new Address(section+1, 0).allocate(size);
				}
			}
			
			public Address add(int size){
				MemorySection ms = sections.get(section);
				int nextstart = this.start+size;
				if (ms.getLength() > nextstart){
					return new Address(section, nextstart);
				}else{
					return new Address(section+1, 0);
				}
			}
		}
		
		private final List<MemorySection> sections = new ArrayList<MemorySection>();
		
		private final Map<Variable, Address> vars = new HashMap<Variable, Address>();
		private final Stack<Address> stack = new Stack<Address>();
		private final Stack<HeapLevel> heapStack = new Stack<HeapLevel>();
		private Address current = new Address(0,0);
		
		private final Architecture arch;
		
		public VariableAllocation(Architecture arch) {
			map = MemorymapFactory.eINSTANCE.createMemoryMap();
			HeapLevel root = MemorymapFactory.eINSTANCE.createHeapLevel();
			map.setRoot(root);
			heapStack.push(root);
			this.arch = arch;
			for(MemorySection msec : arch.getMemory()){
				if (!msec.isProgram()){
					sections.add(msec);
				}
			}
		}
		
//		public long getAddress(Variable v){
//			Address address = vars.get(v);
//			return address.getAddress();
//		}
		
		public void addVariable(Variable v){
			int size = TaskUtils.inferSize(v.getType(), arch);
			current = current.allocate(size);
			vars.put(v, current);
			
			HeapVariableMapping mapping = MemorymapFactory.eINSTANCE.createHeapVariableMapping();
			mapping.setVariable(v);
			mapping.setAddress(current.getAddress());
			TaskUtils.addOrigin(mapping, v);
			heapStack.peek().getMappings().add(mapping);
			
			current = current.add(size);
		}
		
		public void push(ExecutionBlock block){
			stack.push(current);
			HeapLevel level = MemorymapFactory.eINSTANCE.createHeapLevel();
			heapStack.peek().getSubLevels().add(level);
			heapStack.push(level);
			TaskUtils.addOrigin(level, block);
		}
		
		public void pop(){
			current = stack.pop();
			heapStack.pop();
		}
		
		public void visit(ExecutionStep step){
			if (step instanceof LocalVariable){
				if (((LocalVariable) step).getType() instanceof CodeLabelTypeDefinition) return;
				addVariable((LocalVariable)step);
			}
			if (step instanceof ExecutionBlock){
				push((ExecutionBlock)step);
				for(ExecutionStep s : ((ExecutionBlock) step).getSteps()){
					visit(s);
				}
				pop();
			}
		}
		
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		String inputmodel = context.getParameterValue(INPUT).get(0);
		String outputmodel = context.getParameterValue(OUTPUT).get(0);
		String entry = context.getParameterValue(ENTRY).get(0);
		String archmodel = context.getParameterValue(ARCH).get(0);
		
		Resource inr = context.getInput(context.getModelURI(inputmodel));
		Resource outr = context.getOutput(context.getModelURI(outputmodel));
		Resource archr = context.getInput(context.getModelURI(archmodel));
		
		Architecture arch = (Architecture) archr.getContents().get(0);
		
		EObject lib = inr.getContents().get(0);
		Assert.isLegal(lib instanceof Library);
		Library inlib = (Library)lib;
		
		Function main = null;
		for(LibraryElement le : inlib.getContent()){
			if (le instanceof Function){
				if (entry.equals(le.getName())){
					main = (Function)le;
				}
			}
		}
		
		if (main == null){
			context.logStatus(TaskUtils.error("Could not find entry point: "+entry));
			return;
		}
		
		VariableAllocation allocator = new VariableAllocation(arch);
		for(LibraryElement le : inlib.getContent()){
			if (le instanceof HeapVariable){
				allocator.addVariable((HeapVariable)le);
			}
		}
		allocator.visit(main.getImplementation());
		
		MemoryMap map = allocator.getMap();
		map.setName(outputmodel);
		outr.getContents().add(map);
		TaskUtils.addOrigin(map, inlib);
	}

}
