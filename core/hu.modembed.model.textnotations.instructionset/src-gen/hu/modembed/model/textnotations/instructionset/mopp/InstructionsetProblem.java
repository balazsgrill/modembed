/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetProblem implements hu.modembed.model.textnotations.instructionset.IInstructionsetProblem {
	
	private String message;
	private hu.modembed.model.textnotations.instructionset.InstructionsetEProblemType type;
	private hu.modembed.model.textnotations.instructionset.InstructionsetEProblemSeverity severity;
	private java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetQuickFix> quickFixes;
	
	public InstructionsetProblem(String message, hu.modembed.model.textnotations.instructionset.InstructionsetEProblemType type, hu.modembed.model.textnotations.instructionset.InstructionsetEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<hu.modembed.model.textnotations.instructionset.IInstructionsetQuickFix>emptySet());
	}
	
	public InstructionsetProblem(String message, hu.modembed.model.textnotations.instructionset.InstructionsetEProblemType type, hu.modembed.model.textnotations.instructionset.InstructionsetEProblemSeverity severity, hu.modembed.model.textnotations.instructionset.IInstructionsetQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public InstructionsetProblem(String message, hu.modembed.model.textnotations.instructionset.InstructionsetEProblemType type, hu.modembed.model.textnotations.instructionset.InstructionsetEProblemSeverity severity, java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<hu.modembed.model.textnotations.instructionset.IInstructionsetQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public hu.modembed.model.textnotations.instructionset.InstructionsetEProblemType getType() {
		return type;
	}
	
	public hu.modembed.model.textnotations.instructionset.InstructionsetEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
