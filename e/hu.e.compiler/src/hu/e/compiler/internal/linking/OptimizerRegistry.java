/**
 * 
 */
package hu.e.compiler.internal.linking;

import java.util.HashMap;
import java.util.Map;

import hu.e.compiler.optimizer.IOptimizer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * @author balazs.grill
 *
 */
public class OptimizerRegistry {

	private static OptimizerRegistry instance;
	
	public static OptimizerRegistry getInstance() {
		if (instance == null){
			instance = new OptimizerRegistry();
		}
		return instance;
	}
	
	private static final String EPID = "hu.e.compiler.optimizers";
	
	private final Map<String, IOptimizer> optimizers = new HashMap<String, IOptimizer>();
	
	public IOptimizer get(String id){
		return optimizers.get(id);
	}
	
	private OptimizerRegistry() {
		for (IConfigurationElement ce : Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
			String id = ce.getAttribute("id");
			try {
				Object o = ce.createExecutableExtension("class");
				if (o instanceof IOptimizer){
					optimizers.put(id, (IOptimizer) o);
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
