package hu.cubussapiens.modembed.modularasm.builder;

import hu.cubussapiens.modembed.modularasm.builder.internal.Compiler;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class MASMCompilerPlugin extends Plugin {

	private static MASMCompilerPlugin plugin;
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		super.stop(bundleContext);
	}

	public static MASMCompilerPlugin getDefault(){
		return plugin;
	}
	
	public ICompiler createCompiler(){
		return new Compiler();
	}
	
	public static String qualIDtoString(QualifiedID qid){
		StringBuffer sb = new StringBuffer();
		boolean first = true;
		for(String s : qid.getSegments()){
			if (first){
				first = false;
			}else{
				sb.append(".");
			}
			sb.append(s);
		}
		return sb.toString();
	}
	
}
