/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.ui;

public class InstructionsetHoverTextProvider implements hu.modembed.model.textnotations.instructionset.IInstructionsetHoverTextProvider {
	
	private hu.modembed.model.textnotations.instructionset.ui.InstructionsetDefaultHoverTextProvider defaultProvider = new hu.modembed.model.textnotations.instructionset.ui.InstructionsetDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
