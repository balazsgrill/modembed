/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("instructionset".equals(tokenName)) {
			return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("extends".equals(tokenName)) {
			return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ML_COMMENT".equals(tokenName)) {
			return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenStyle(new int[] {0x3F, 0x80, 0x5D}, null, false, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
