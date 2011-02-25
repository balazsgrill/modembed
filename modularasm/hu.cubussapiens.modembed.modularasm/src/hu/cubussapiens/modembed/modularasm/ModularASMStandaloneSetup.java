
package hu.cubussapiens.modembed.modularasm;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ModularASMStandaloneSetup extends ModularASMStandaloneSetupGenerated{

	public static void doSetup() {
		new ModularASMStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

