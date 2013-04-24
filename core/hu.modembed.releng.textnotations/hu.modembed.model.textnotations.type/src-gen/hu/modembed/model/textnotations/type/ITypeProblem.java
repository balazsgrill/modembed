/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type;

public interface ITypeProblem {
	public String getMessage();
	public hu.modembed.model.textnotations.type.TypeEProblemSeverity getSeverity();
	public hu.modembed.model.textnotations.type.TypeEProblemType getType();
	public java.util.Collection<hu.modembed.model.textnotations.type.ITypeQuickFix> getQuickFixes();
}
