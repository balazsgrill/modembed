/**
 * 
 */
package hu.e.compiler;

import hu.e.compiler.list.ProgramList;

/**
 * @author balazs.grill
 *
 */
public interface IOptimizer {

	/**
	 * Return an equivalent, but (hopefully) better program list.
	 * 
	 * @param context
	 * @param list
	 * @return
	 */
	public ProgramList optimize(IOptimizerContext context, ProgramList list);
	
}
