/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.grammar;

public class InstructionsetGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static InstructionsetGrammarInformationProvider INSTANCE = new InstructionsetGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword INSTRUCTIONSET_0_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword("instructionset", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder INSTRUCTIONSET_0_0_0_1 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__NAME), "QUALIFIEDID", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword INSTRUCTIONSET_0_0_0_2 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword(";", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword INSTRUCTIONSET_0_0_0_3_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword("extends", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder INSTRUCTIONSET_0_0_0_3_0_0_1 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__EXTEND), "QUALIFIEDID", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_0_0_0_3_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_0_0_0_3_0_0_0, INSTRUCTIONSET_0_0_0_3_0_0_1);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_0_0_0_3_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_0_0_0_3_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound INSTRUCTIONSET_0_0_0_3 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound(INSTRUCTIONSET_0_0_0_3_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.QUESTIONMARK);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment INSTRUCTIONSET_0_0_0_4_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__INSTRUCTIONS), hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), }, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_0_0_0_4_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_0_0_0_4_0_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_0_0_0_4_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_0_0_0_4_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound INSTRUCTIONSET_0_0_0_4 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound(INSTRUCTIONSET_0_0_0_4_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.STAR);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_0_0_0_0, INSTRUCTIONSET_0_0_0_1, INSTRUCTIONSET_0_0_0_2, INSTRUCTIONSET_0_0_0_3, INSTRUCTIONSET_0_0_0_4);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_0_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule INSTRUCTIONSET_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), INSTRUCTIONSET_0_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder INSTRUCTIONSET_1_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__NAME), "TEXT", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment INSTRUCTIONSET_1_0_0_1_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__PARAMETERS), hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter(), }, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_1_0_0_1_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_1_0_0_1_0_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_1_0_0_1_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_1_0_0_1_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound INSTRUCTIONSET_1_0_0_1 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound(INSTRUCTIONSET_1_0_0_1_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.STAR);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment INSTRUCTIONSET_1_0_0_2_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__WORDS), hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), }, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_1_0_0_2_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_1_0_0_2_0_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_1_0_0_2_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_1_0_0_2_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound INSTRUCTIONSET_1_0_0_2 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound(INSTRUCTIONSET_1_0_0_2_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.STAR);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_1_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_1_0_0_0, INSTRUCTIONSET_1_0_0_1, INSTRUCTIONSET_1_0_0_2);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_1_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_1_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule INSTRUCTIONSET_1 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), INSTRUCTIONSET_1_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder INSTRUCTIONSET_2_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__ID), "IDENTIFIER", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder INSTRUCTIONSET_2_0_0_1_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__DEFAULT_VALUE), "INT", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_2_0_0_1_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_2_0_0_1_0_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_2_0_0_1_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_2_0_0_1_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound INSTRUCTIONSET_2_0_0_1 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound(INSTRUCTIONSET_2_0_0_1_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.QUESTIONMARK);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_2_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_2_0_0_0, INSTRUCTIONSET_2_0_0_1);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_2_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_2_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule INSTRUCTIONSET_2 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter(), INSTRUCTIONSET_2_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword INSTRUCTIONSET_3_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword("<", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment INSTRUCTIONSET_3_0_0_1_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_WORD__SECTIONS), hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getConstantSection(), hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getParameterSection(), }, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_3_0_0_1_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_3_0_0_1_0_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_3_0_0_1_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_3_0_0_1_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound INSTRUCTIONSET_3_0_0_1 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound(INSTRUCTIONSET_3_0_0_1_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.STAR);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword INSTRUCTIONSET_3_0_0_2 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword(">", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_3_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_3_0_0_0, INSTRUCTIONSET_3_0_0_1, INSTRUCTIONSET_3_0_0_2);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_3_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_3_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule INSTRUCTIONSET_3 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), INSTRUCTIONSET_3_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder INSTRUCTIONSET_4_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getConstantSection().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__VALUE), "BINARY", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword INSTRUCTIONSET_4_0_0_1 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword(":", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder INSTRUCTIONSET_4_0_0_2 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getConstantSection().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__SIZE), "BINARY", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword INSTRUCTIONSET_4_0_0_3_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword(":", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder INSTRUCTIONSET_4_0_0_3_0_0_1 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getConstantSection().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__SHIFT), "BINARY", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_4_0_0_3_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_4_0_0_3_0_0_0, INSTRUCTIONSET_4_0_0_3_0_0_1);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_4_0_0_3_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_4_0_0_3_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound INSTRUCTIONSET_4_0_0_3 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound(INSTRUCTIONSET_4_0_0_3_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.QUESTIONMARK);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_4_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_4_0_0_0, INSTRUCTIONSET_4_0_0_1, INSTRUCTIONSET_4_0_0_2, INSTRUCTIONSET_4_0_0_3);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_4_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_4_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule INSTRUCTIONSET_4 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getConstantSection(), INSTRUCTIONSET_4_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder INSTRUCTIONSET_5_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getParameterSection().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__PARAMETER), "IDENTIFIER", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword INSTRUCTIONSET_5_0_0_1 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword(":", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder INSTRUCTIONSET_5_0_0_2 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getParameterSection().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__SIZE), "BINARY", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword INSTRUCTIONSET_5_0_0_3_0_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword(":", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder INSTRUCTIONSET_5_0_0_3_0_0_1 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getParameterSection().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__SHIFT), "BINARY", hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, 0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_5_0_0_3_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_5_0_0_3_0_0_0, INSTRUCTIONSET_5_0_0_3_0_0_1);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_5_0_0_3_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_5_0_0_3_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound INSTRUCTIONSET_5_0_0_3 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCompound(INSTRUCTIONSET_5_0_0_3_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.QUESTIONMARK);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence INSTRUCTIONSET_5_0_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_5_0_0_0, INSTRUCTIONSET_5_0_0_1, INSTRUCTIONSET_5_0_0_2, INSTRUCTIONSET_5_0_0_3);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice INSTRUCTIONSET_5_0 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE, INSTRUCTIONSET_5_0_0);
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule INSTRUCTIONSET_5 = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getParameterSection(), INSTRUCTIONSET_5_0, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE);
	
	public static String getSyntaxElementID(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement) hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule[] RULES = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule[] {
		INSTRUCTIONSET_0,
		INSTRUCTIONSET_1,
		INSTRUCTIONSET_2,
		INSTRUCTIONSET_3,
		INSTRUCTIONSET_4,
		INSTRUCTIONSET_5,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword) {
			keywords.add(((hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword) element).getValue());
		} else if (element instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetBooleanTerminal) {
			keywords.add(((hu.modembed.model.textnotations.instructionset.grammar.InstructionsetBooleanTerminal) element).getTrueLiteral());
			keywords.add(((hu.modembed.model.textnotations.instructionset.grammar.InstructionsetBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetEnumerationTerminal) {
			hu.modembed.model.textnotations.instructionset.grammar.InstructionsetEnumerationTerminal terminal = (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
