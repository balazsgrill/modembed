/**
 * 
 */
package hu.modembed.pic.ui.optimizer;

import org.eclipse.emf.ecore.util.EcoreUtil;

import hu.e.compiler.IOptimizer;
import hu.e.compiler.IOptimizerContext;
import hu.e.compiler.list.ProgramList;

/**
 * @author balazs.grill
 *
 */
public class PIC16SelectBankOptimizer implements IOptimizer {

	/* (non-Javadoc)
	 * @see hu.e.compiler.IOptimizer#optimize(hu.e.compiler.IOptimizerContext, hu.e.compiler.list.ProgramList)
	 */
	@Override
	public ProgramList optimize(IOptimizerContext context, ProgramList list) {
		ProgramList pl = EcoreUtil.copy(list);
		
		
		
		return pl;
	}

}
