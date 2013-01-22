/**
 * 
 */
package hu.e.compiler.tasks.internal;

import hu.modembed.model.emodel.Variable;
import hu.modembed.model.emodel.expressions.IntegerLiteralExpression;

/**
 * @author balazs.grill
 *
 */
public interface IHeapMemoryStackLevel {

	public IHeapMemoryStackLevel stepIn();
	
	public void allocate(Variable v);
	
	public void refer(IntegerLiteralExpression value, Variable var);
	
	public void stepOut();
	
}
