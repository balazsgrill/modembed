package hu.cubussapiens.modembed.pic.device.tranformation;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.osgi.framework.BundleContext;

import pic.PicCPUType;

/**
 * The activator class controls the plug-in life cycle
 */
public class DeviceTranformationPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "null";

	// The shared instance
	private static DeviceTranformationPlugin plugin;
	
	private static final String TRANSFORM_DEVICE = "/transforms/deviceTransformation.qvto";
	
	/**
	 * The constructor
	 */
	public DeviceTranformationPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static DeviceTranformationPlugin getDefault() {
		return plugin;
	}

	
	
	public Map<String, String> transformAllDevices(IFolder source, IFolder target) throws CoreException{
		Map<String, String> result = new HashMap<String, String>();
		
		for(IResource r : source.members()){
			if (r instanceof IFile && "dev".equalsIgnoreCase(r.getFileExtension())){
				String name = r.getName().substring(0,r.getName().length()-4);
				IFile tf = target.getFile(name+".pic");
				
				URI suri = URI.createPlatformResourceURI(r.getFullPath().toString(), true);
				URI turi = URI.createPlatformResourceURI(tf.getFullPath().toString(), true);
				
				System.out.println("Transforming: "+suri);
				
				transformDeviceDescription(suri, turi);
				
				result.put(tf.getName(), name);
			}
		}
		
		
		return result;
	}
	
	public IStatus transformDeviceDescription(URI source, URI target){
		try{

			String name = source.trimFileExtension().lastSegment();

			// Refer to an existing transformation via URI
			URI transformationURI = URI.createURI(getBundle().getEntry(TRANSFORM_DEVICE).toString());
			// create executor for the given transformation
			TransformationExecutor executor = new TransformationExecutor(transformationURI);

			ResourceSet resourceSet = new ResourceSetImpl();

			// define the transformation input
			// Remark: we take the objects from a resource, however
			// a list of arbitrary in-memory EObjects may be passed
			ExecutionContextImpl context = new ExecutionContextImpl();
			context.setLog(new Log() {
				
				@Override
				public void log(int level, String message, Object param) {
					System.out.println(message);
				}
				
				@Override
				public void log(String message, Object param) {
					System.out.println(message);
				}
				
				@Override
				public void log(int level, String message) {
					System.out.println(message);
				}
				
				@Override
				public void log(String message) {
					System.out.println(message);
				}
			});

			Resource inResource = resourceSet.getResource(source, true);		
			EList<EObject> inObjects = inResource.getContents();

			// create the input extent with its initial contents
			ModelExtent input = new BasicModelExtent(inObjects);		
			// create an empty extent to catch the output
			ModelExtent output = new BasicModelExtent();

			// setup the execution environment details -> 
			// configuration properties, logger, monitor object etc.
			context.setConfigProperty("keepModeling", true);

			// run the transformation assigned to the executor with the given 
			// input and output and execution context -> ChangeTheWorld(in, out)
			// Remark: variable arguments count is supported
			ExecutionDiagnostic result = executor.execute(context, input, output);

			// check the result for success
			if(result.getSeverity() == Diagnostic.OK) {
				// the output objects got captured in the output extent
				List<EObject> outObjects = output.getContents();
				for(EObject eo : outObjects){
					if (eo instanceof PicCPUType){
						((PicCPUType) eo).setName(name);
					}
				}
				// let's persist them using a resource 
				Resource outResource = resourceSet.createResource(target);
				outResource.getContents().addAll(outObjects);
				outResource.save(Collections.emptyMap());
				return Status.OK_STATUS;
			} else {
				// turn the result diagnostic into status and send it to error log			
				return BasicDiagnostic.toIStatus(result);

			}
		}catch(Exception e){
			return new Status(IStatus.ERROR, PLUGIN_ID, "Exception during executing the transformation",e);
		}
	}
	
}
