/**
 * 
 */
package hu.e.compiler.optimizer;

import hu.e.compiler.list.ProgramList;

/**
 * Optimizer for program structure
 * 
 * @author balazs.grill
 *
 */
public interface IStructuredProgramOptimizer extends IOptimizer{

	/**
	 * Return an equivalent, but (hopefully) better program list.
	 * 
	 * @param context
	 * @param list
	 * @return
	 */
	public ProgramList optimize(IOptimizerContext context, ProgramList list);
	
}
