
package hu.e.parser;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ESyntaxStandaloneSetup extends ESyntaxStandaloneSetupGenerated{

	public static void doSetup() {
		new ESyntaxStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

