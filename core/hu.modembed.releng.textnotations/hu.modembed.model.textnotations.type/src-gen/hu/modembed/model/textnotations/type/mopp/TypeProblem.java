/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

public class TypeProblem implements hu.modembed.model.textnotations.type.ITypeProblem {
	
	private String message;
	private hu.modembed.model.textnotations.type.TypeEProblemType type;
	private hu.modembed.model.textnotations.type.TypeEProblemSeverity severity;
	private java.util.Collection<hu.modembed.model.textnotations.type.ITypeQuickFix> quickFixes;
	
	public TypeProblem(String message, hu.modembed.model.textnotations.type.TypeEProblemType type, hu.modembed.model.textnotations.type.TypeEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<hu.modembed.model.textnotations.type.ITypeQuickFix>emptySet());
	}
	
	public TypeProblem(String message, hu.modembed.model.textnotations.type.TypeEProblemType type, hu.modembed.model.textnotations.type.TypeEProblemSeverity severity, hu.modembed.model.textnotations.type.ITypeQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public TypeProblem(String message, hu.modembed.model.textnotations.type.TypeEProblemType type, hu.modembed.model.textnotations.type.TypeEProblemSeverity severity, java.util.Collection<hu.modembed.model.textnotations.type.ITypeQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<hu.modembed.model.textnotations.type.ITypeQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public hu.modembed.model.textnotations.type.TypeEProblemType getType() {
		return type;
	}
	
	public hu.modembed.model.textnotations.type.TypeEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.type.ITypeQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
