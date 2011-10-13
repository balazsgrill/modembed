/**
 * 
 */
package hu.e.compiler.internal;

import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.parser.eSyntax.Type;
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
	
	public StackLevel(MemoryManager memman) {
		this.memman = memman;
	}
	
	public void allocate(ISymbolManager sm, Variable var){
		vars.put(var, memman.allocate(memman.getSize(sm, var.getType())));
	}
	
	public int allocate(ISymbolManager sm, Type type){
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
	}
	
	public Integer getAddress(Variable v){
		return vars.get(v);
	}
	
}