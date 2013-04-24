/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset;

public interface IInstructionsetProblem {
	public String getMessage();
	public hu.modembed.model.textnotations.instructionset.InstructionsetEProblemSeverity getSeverity();
	public hu.modembed.model.textnotations.instructionset.InstructionsetEProblemType getType();
	public java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetQuickFix> getQuickFixes();
}
