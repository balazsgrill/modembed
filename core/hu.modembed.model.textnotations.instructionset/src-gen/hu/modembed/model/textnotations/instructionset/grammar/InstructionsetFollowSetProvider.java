/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.grammar;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class InstructionsetFollowSetProvider {
	
	public final static hu.modembed.model.textnotations.instructionset.IInstructionsetExpectedElement TERMINALS[] = new hu.modembed.model.textnotations.instructionset.IInstructionsetExpectedElement[25];
	
	public final static org.eclipse.emf.ecore.EStructuralFeature[] FEATURES = new org.eclipse.emf.ecore.EStructuralFeature[4];
	
	public final static hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] LINKS = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[20];
	
	public final static hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] EMPTY_LINK_ARRAY = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[0];
	
	public static void initializeTerminals0() {
		TERMINALS[0] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_0_0_0_0);
		TERMINALS[1] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedStructuralFeature(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_0_0_0_1);
		TERMINALS[2] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_0_0_0_2);
		TERMINALS[3] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_0_0_0_3_0_0_0);
		TERMINALS[4] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedStructuralFeature(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_1_0_0_0);
		TERMINALS[5] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedStructuralFeature(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_0_0_0_3_0_0_1);
		TERMINALS[6] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_1_0_0_1);
		TERMINALS[7] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedStructuralFeature(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_2_0_0_0);
		TERMINALS[8] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_1_0_0_3);
		TERMINALS[9] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_3_0_0_0);
		TERMINALS[10] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_1_0_0_5);
		TERMINALS[11] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_2_0_0_1_0_0_0);
		TERMINALS[12] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedStructuralFeature(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_2_0_0_1_0_0_1);
		TERMINALS[13] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedStructuralFeature(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_4_0_0_0);
		TERMINALS[14] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedStructuralFeature(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_5_0_0_0);
		TERMINALS[15] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_3_0_0_2_0_0_0);
		TERMINALS[16] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_3_0_0_3);
		TERMINALS[17] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_4_0_0_1);
		TERMINALS[18] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedStructuralFeature(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_4_0_0_2);
		TERMINALS[19] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_4_0_0_3_0_0_0);
		TERMINALS[20] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedStructuralFeature(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_4_0_0_3_0_0_1);
		TERMINALS[21] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_5_0_0_1);
		TERMINALS[22] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedStructuralFeature(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_5_0_0_2);
		TERMINALS[23] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_5_0_0_3_0_0_0);
		TERMINALS[24] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedStructuralFeature(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_5_0_0_3_0_0_1);
	}
	
	public static void initializeTerminals() {
		initializeTerminals0();
	}
	
	public static void initializeFeatures0() {
		FEATURES[0] = hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__INSTRUCTIONS);
		FEATURES[1] = hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__PARAMETERS);
		FEATURES[2] = hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__WORDS);
		FEATURES[3] = hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_WORD__SECTIONS);
	}
	
	public static void initializeFeatures() {
		initializeFeatures0();
	}
	
	public static void initializeLinks0() {
		LINKS[0] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), FEATURES[0]);
		LINKS[1] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), FEATURES[0]);
		LINKS[2] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), FEATURES[0]);
		LINKS[3] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), FEATURES[0]);
		LINKS[4] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), FEATURES[0]);
		LINKS[5] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter(), FEATURES[1]);
		LINKS[6] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter(), FEATURES[1]);
		LINKS[7] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter(), FEATURES[1]);
		LINKS[8] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), FEATURES[2]);
		LINKS[9] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), FEATURES[2]);
		LINKS[10] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), FEATURES[2]);
		LINKS[11] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), FEATURES[0]);
		LINKS[12] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter(), FEATURES[1]);
		LINKS[13] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter(), FEATURES[1]);
		LINKS[14] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter(), FEATURES[1]);
		LINKS[15] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getConstantSection(), FEATURES[3]);
		LINKS[16] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getParameterSection(), FEATURES[3]);
		LINKS[17] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getConstantSection(), FEATURES[3]);
		LINKS[18] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getParameterSection(), FEATURES[3]);
		LINKS[19] = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), FEATURES[2]);
	}
	
	public static void initializeLinks() {
		initializeLinks0();
	}
	
	public static void wire0() {
		TERMINALS[0].addFollower(TERMINALS[1], EMPTY_LINK_ARRAY);
		TERMINALS[1].addFollower(TERMINALS[2], EMPTY_LINK_ARRAY);
		TERMINALS[2].addFollower(TERMINALS[3], EMPTY_LINK_ARRAY);
		TERMINALS[2].addFollower(TERMINALS[4], new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] {new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), FEATURES[0]), });
		TERMINALS[3].addFollower(TERMINALS[5], EMPTY_LINK_ARRAY);
		TERMINALS[5].addFollower(TERMINALS[4], new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] {new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), FEATURES[0]), });
		TERMINALS[4].addFollower(TERMINALS[6], EMPTY_LINK_ARRAY);
		TERMINALS[6].addFollower(TERMINALS[7], new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] {new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter(), FEATURES[1]), });
		TERMINALS[6].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[8].addFollower(TERMINALS[9], new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] {new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), FEATURES[2]), });
		TERMINALS[8].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[10].addFollower(TERMINALS[4], new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] {new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), FEATURES[0]), });
		TERMINALS[7].addFollower(TERMINALS[11], EMPTY_LINK_ARRAY);
		TERMINALS[7].addFollower(TERMINALS[7], new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] {new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter(), FEATURES[1]), });
		TERMINALS[7].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[11].addFollower(TERMINALS[12], EMPTY_LINK_ARRAY);
		TERMINALS[12].addFollower(TERMINALS[7], new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] {new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionParameter(), FEATURES[1]), });
		TERMINALS[12].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[9].addFollower(TERMINALS[13], new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] {new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getConstantSection(), FEATURES[3]), });
		TERMINALS[9].addFollower(TERMINALS[14], new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] {new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getParameterSection(), FEATURES[3]), });
		TERMINALS[15].addFollower(TERMINALS[13], new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] {new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getConstantSection(), FEATURES[3]), });
		TERMINALS[15].addFollower(TERMINALS[14], new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] {new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getParameterSection(), FEATURES[3]), });
		TERMINALS[16].addFollower(TERMINALS[9], new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] {new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), FEATURES[2]), });
		TERMINALS[16].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[13].addFollower(TERMINALS[17], EMPTY_LINK_ARRAY);
		TERMINALS[17].addFollower(TERMINALS[18], EMPTY_LINK_ARRAY);
		TERMINALS[18].addFollower(TERMINALS[19], EMPTY_LINK_ARRAY);
		TERMINALS[18].addFollower(TERMINALS[15], EMPTY_LINK_ARRAY);
		TERMINALS[18].addFollower(TERMINALS[16], EMPTY_LINK_ARRAY);
		TERMINALS[19].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[20].addFollower(TERMINALS[15], EMPTY_LINK_ARRAY);
		TERMINALS[20].addFollower(TERMINALS[16], EMPTY_LINK_ARRAY);
		TERMINALS[14].addFollower(TERMINALS[21], EMPTY_LINK_ARRAY);
		TERMINALS[21].addFollower(TERMINALS[22], EMPTY_LINK_ARRAY);
		TERMINALS[22].addFollower(TERMINALS[23], EMPTY_LINK_ARRAY);
		TERMINALS[22].addFollower(TERMINALS[15], EMPTY_LINK_ARRAY);
		TERMINALS[22].addFollower(TERMINALS[16], EMPTY_LINK_ARRAY);
		TERMINALS[23].addFollower(TERMINALS[24], EMPTY_LINK_ARRAY);
		TERMINALS[24].addFollower(TERMINALS[15], EMPTY_LINK_ARRAY);
		TERMINALS[24].addFollower(TERMINALS[16], EMPTY_LINK_ARRAY);
	}
	
	public static void wire() {
		wire0();
	}
	
	static {
		// initialize the arrays
		initializeTerminals();
		initializeFeatures();
		initializeLinks();
		// wire the terminals
		wire();
	}
}
