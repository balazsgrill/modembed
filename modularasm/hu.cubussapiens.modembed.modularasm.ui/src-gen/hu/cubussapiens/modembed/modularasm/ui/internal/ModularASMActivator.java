
/*
 * generated by Xtext
 */
package hu.cubussapiens.modembed.modularasm.ui.internal;

import org.apache.log4j.Logger;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;

import java.util.Map;
import java.util.HashMap;

/**
 * Generated
 */
public class ModularASMActivator extends AbstractUIPlugin {

	private Map<String,Injector> injectors = new HashMap<String,Injector>();
	private static ModularASMActivator INSTANCE;

	public static String IMAGE_INSTRUCTION = "instruction";
	public static String IMAGE_ARCHITECTURE = "architecture";
	
	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		reg.put(IMAGE_INSTRUCTION, ImageDescriptor.createFromURL(getBundle().getEntry("icons/instruction_obj.gif")));
		reg.put(IMAGE_ARCHITECTURE, ImageDescriptor.createFromURL(getBundle().getEntry("icons/arch.png")));
	}
	
	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {
			
			injectors.put("hu.cubussapiens.modembed.modularasm.ModularASM", Guice.createInjector(
				Modules.override(Modules.override(getRuntimeModule("hu.cubussapiens.modembed.modularasm.ModularASM")).with(getUiModule("hu.cubussapiens.modembed.modularasm.ModularASM"))).with(getSharedStateModule())
			));
			
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}
	
	public static ModularASMActivator getInstance() {
		return INSTANCE;
	}
	
	protected Module getRuntimeModule(String grammar) {
		
		if ("hu.cubussapiens.modembed.modularasm.ModularASM".equals(grammar)) {
		  return new hu.cubussapiens.modembed.modularasm.ModularASMRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	protected Module getUiModule(String grammar) {
		
		if ("hu.cubussapiens.modembed.modularasm.ModularASM".equals(grammar)) {
		  return new hu.cubussapiens.modembed.modularasm.ui.ModularASMUiModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}
	
}
