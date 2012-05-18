/**
 * 
 */
package hu.e.compiler.optimizer;

import hu.e.compiler.list.ProgramStep;

import java.util.List;

/**
 * An optimizer which can optimize a flat program list
 * 
 * @author balazs.grill
 *
 */
public interface IFlatProgramOptimizer extends IOptimizer{

	public List<ProgramStep> optimize(IOptimizerContext context, List<ProgramStep> steps);
	
}
