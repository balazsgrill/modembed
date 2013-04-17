/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(),
			hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(),
			hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter(),
			hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(),
			hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getConstantSection(),
			hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getParameterSection(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(),
		};
	}
	
}
