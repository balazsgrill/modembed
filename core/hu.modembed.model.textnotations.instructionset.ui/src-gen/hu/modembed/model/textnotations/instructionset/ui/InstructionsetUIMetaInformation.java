/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.ui;

public class InstructionsetUIMetaInformation extends hu.modembed.model.textnotations.instructionset.mopp.InstructionsetMetaInformation {
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetHoverTextProvider getHoverTextProvider() {
		return new hu.modembed.model.textnotations.instructionset.ui.InstructionsetHoverTextProvider();
	}
	
	public hu.modembed.model.textnotations.instructionset.ui.InstructionsetImageProvider getImageProvider() {
		return hu.modembed.model.textnotations.instructionset.ui.InstructionsetImageProvider.INSTANCE;
	}
	
	public hu.modembed.model.textnotations.instructionset.ui.InstructionsetColorManager createColorManager() {
		return new hu.modembed.model.textnotations.instructionset.ui.InstructionsetColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(hu.modembed.model.textnotations.instructionset.IInstructionse
	 * tTextResource,
	 * hu.modembed.model.textnotations.instructionset.ui.InstructionsetColorManager)
	 * instead.
	 */
	public hu.modembed.model.textnotations.instructionset.ui.InstructionsetTokenScanner createTokenScanner(hu.modembed.model.textnotations.instructionset.ui.InstructionsetColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public hu.modembed.model.textnotations.instructionset.ui.InstructionsetTokenScanner createTokenScanner(hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource, hu.modembed.model.textnotations.instructionset.ui.InstructionsetColorManager colorManager) {
		return new hu.modembed.model.textnotations.instructionset.ui.InstructionsetTokenScanner(resource, colorManager);
	}
	
	public hu.modembed.model.textnotations.instructionset.ui.InstructionsetCodeCompletionHelper createCodeCompletionHelper() {
		return new hu.modembed.model.textnotations.instructionset.ui.InstructionsetCodeCompletionHelper();
	}
	
}
