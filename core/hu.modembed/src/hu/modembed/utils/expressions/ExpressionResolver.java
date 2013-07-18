/**
 * 
 */
package hu.modembed.utils.expressions;

import hu.modembed.model.modembed.infrastructure.expressions.Expression;
import hu.modembed.model.modembed.infrastructure.expressions.IntegerConstantExpression;
import hu.modembed.model.modembed.infrastructure.expressions.OperationExpression;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class ExpressionResolver {

	public Object computeValue(Expression e) throws ExpressionResolveException{
		if (e instanceof IntegerConstantExpression){
			return ((IntegerConstantExpression) e).getValue();
		}
		if (e instanceof OperationExpression){
			List<Object> args = new ArrayList<Object>(((OperationExpression) e).getArguments().size());
			for(Expression a : ((OperationExpression) e).getArguments()){
				args.add(computeValue(a));
			}
			
			return compute(((OperationExpression) e).getOperation(), args.toArray());
		}
		
		/* Try to find the appropriate method reflectively */
		Class<?> clazz = e.eClass().getInstanceClass();
		try {
			Method m = this.getClass().getMethod("compute", clazz);
			return m.invoke(this, e);
		} catch (Exception e1) {
			throw new ExpressionResolveException("Unsupported expression: "+e, e1);
		}
	}
	
	protected Object compute(String operation, Object[] arguments) throws ExpressionResolveException{
		Class<?>[] args = new Class<?>[arguments.length];
		for(int i = 0;i<args.length;i++){
			args[i] = arguments[i].getClass();
		}
		try {
			Method m = getClass().getMethod(operation, args);
			return m.invoke(this, arguments);
		} catch (Exception e) {
			throw new ExpressionResolveException("Unsupported operation: "+operation, e);
		}
		
	}
	
	public long add(Long v1, Long v2){
		return v1+v2;
	}
	
	public long equals(Long v1, Long v2){
		return v1==v2 ? 1 : 0;
	}
	
}
