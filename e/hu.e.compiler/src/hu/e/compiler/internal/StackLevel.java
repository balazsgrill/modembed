/**
 * 
 */
package hu.e.compiler.internal;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.list.LabelStep;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.Variable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class StackLevel {

	private final MemoryManager memman;
	
	private final Map<Variable, Integer> vars = new HashMap<Variable, Integer>();
	
	private final List<Integer> alloc = new ArrayList<Integer>();
	
	private final Map<Label, LabelStep> labels = new HashMap<Label, LabelStep>();
	
	public StackLevel(MemoryManager memman) {
		this.memman = memman;
	}
	
	public void allocate(ISymbolManager sm, Variable var) throws ECompilerException{
		vars.put(var, memman.allocate(memman.getSize(sm, var.getType())));
	}
	
	public int allocate(ISymbolManager sm, TypeDef type) throws ECompilerException{
		Integer addr = memman.allocate(memman.getSize(sm, type));
		alloc.add(addr);
		return addr;
	}
	
	public void release(){
		for(Integer addr : vars.values()){
			memman.release(addr);
		}
		for(Integer addr : alloc){
			memman.release(addr);
		}
		alloc.clear();
		vars.clear();
		labels.clear();
	}
	
	public Integer getAddress(Variable v){
		return vars.get(v);
	}

	public LabelStep getLabel(Label label){
		return labels.get(label);
	}
	
	public void defineLabel(Label label, LabelStep ls) {
		labels.put(label, ls);
	}
	
}
