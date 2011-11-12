/**
 * 
 */
package hu.e.compiler.internal.linking;

import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.Package;
import hu.e.parser.eSyntax.TopLevelItem;
import hu.e.parser.eSyntax.Variable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * @author balage
 *
 */
public class FunctionLinker {

//	private final Map<Operation, Set<Operation>> calls = new HashMap<Operation, Set<Operation>>();
//	
//	private void addCall(Operation op, Operation to){
//		Set<Operation> cs = calls.get(op);
//		if (cs == null){
//			cs = new HashSet<Operation>();
//			calls.put(op, cs);
//		}
//		cs.add(to);
//	}
//	
//	private void processOp(Operation op){
////		for(OperationStep step : op.getBlock().getSteps()){
////			if (step instanceof )
////		}
//	}
	
	private final List<Package> packages;
	
	public FunctionLinker(Operation entrypoint) {
		//Build call graph
	
		Set<Package> allpack = new HashSet<Package>();
		Queue<Package> queue = new LinkedList<Package>();
		
		Package pack = (Package)entrypoint.eContainer();
		queue.add(pack);
		
		while(!queue.isEmpty()){
			Package p = queue.poll();
			if (!allpack.contains(p)){
				allpack.add(p);
				queue.addAll(p.getUses());
			}
		}
		
		this.packages = new ArrayList<Package>(allpack);
	}
	
	public Collection<Variable> getGlobals(){
		List<Variable> vars = new ArrayList<Variable>();
		
		for(Package p : this.packages){
			for(TopLevelItem tli : p.getItems()){
				if (tli instanceof Variable){
					vars.add((Variable)tli);
				}
			}
		}
		
		return vars;
	}
	
}
