/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

/**
 * A basic implementation of the
 * hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolveRe
 * sult interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class InstructionsetReferenceResolveResult<ReferenceType> implements hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<hu.modembed.model.textnotations.instructionset.IInstructionsetQuickFix> quickFixes;
	
	public InstructionsetReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<hu.modembed.model.textnotations.instructionset.IInstructionsetQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(hu.modembed.model.textnotations.instructionset.IInstructionsetQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<hu.modembed.model.textnotations.instructionset.IInstructionsetQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
