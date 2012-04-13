/**
 * 
 */
package hu.e.compiler.internal;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.impl.MemoryAssignmentValueSymbol;
import hu.e.compiler.list.LabelStep;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.MemoryAssignment;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.Variable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class StackLevel {

	private final MemoryManager memman;
	
	private final Map<Variable, MemoryAssignment> vars = new HashMap<Variable, MemoryAssignment>();
	
	private final Map<Label, LabelStep> labels = new HashMap<Label, LabelStep>();
	
	public StackLevel(MemoryManager memman) {
		this.memman = memman;
	}
	
	public void allocate(ISymbolManager sm, Variable var, MemoryAssignment ma) throws ECompilerException{
		ma.setSize(memman.getSize(sm, var.getType()));
		vars.put(var, ma);
	}
	
	public MemoryAssignmentValueSymbol allocate(ISymbolManager sm, TypeDef type) throws ECompilerException{
		MemoryAssignment ma = ListFactory.eINSTANCE.createMemoryAssignment();
		ma.setName("buffer");
		ma.setSize(memman.getSize(sm, type));
		return new MemoryAssignmentValueSymbol(ma, 0);
	}
	
	public void release(){
		vars.clear();
		labels.clear();
	}
	
	public MemoryAssignment getAddress(Variable v){
		return vars.get(v);
	}

	public LabelStep getLabel(Label label){
		return labels.get(label);
	}
	
	public void defineLabel(Label label, LabelStep ls) {
		labels.put(label, ls);
	}
	
}
