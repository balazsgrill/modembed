/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.grammar;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class TypeFollowSetProvider {
	
	public final static hu.modembed.model.textnotations.type.ITypeExpectedElement TERMINALS[] = new hu.modembed.model.textnotations.type.ITypeExpectedElement[9];
	
	public final static org.eclipse.emf.ecore.EStructuralFeature[] FEATURES = new org.eclipse.emf.ecore.EStructuralFeature[1];
	
	public final static hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[] LINKS = new hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[2];
	
	public final static hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[] EMPTY_LINK_ARRAY = new hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[0];
	
	public static void initializeTerminals0() {
		TERMINALS[0] = new hu.modembed.model.textnotations.type.mopp.TypeExpectedCsString(hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_0_0_0_0);
		TERMINALS[1] = new hu.modembed.model.textnotations.type.mopp.TypeExpectedStructuralFeature(hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_0_0_0_1);
		TERMINALS[2] = new hu.modembed.model.textnotations.type.mopp.TypeExpectedCsString(hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_0_0_0_2);
		TERMINALS[3] = new hu.modembed.model.textnotations.type.mopp.TypeExpectedCsString(hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_1_0_0_0);
		TERMINALS[4] = new hu.modembed.model.textnotations.type.mopp.TypeExpectedStructuralFeature(hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_2_0_0_0);
		TERMINALS[5] = new hu.modembed.model.textnotations.type.mopp.TypeExpectedCsString(hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_0_0_0_4);
		TERMINALS[6] = new hu.modembed.model.textnotations.type.mopp.TypeExpectedCsString(hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_1_0_0_1);
		TERMINALS[7] = new hu.modembed.model.textnotations.type.mopp.TypeExpectedStructuralFeature(hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_1_0_0_2);
		TERMINALS[8] = new hu.modembed.model.textnotations.type.mopp.TypeExpectedCsString(hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_1_0_0_3);
	}
	
	public static void initializeTerminals() {
		initializeTerminals0();
	}
	
	public static void initializeFeatures0() {
		FEATURES[0] = hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__DEFINITION);
	}
	
	public static void initializeFeatures() {
		initializeFeatures0();
	}
	
	public static void initializeLinks0() {
		LINKS[0] = new hu.modembed.model.textnotations.type.mopp.TypeContainedFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getUnsignedTypeDefinition(), FEATURES[0]);
		LINKS[1] = new hu.modembed.model.textnotations.type.mopp.TypeContainedFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition(), FEATURES[0]);
	}
	
	public static void initializeLinks() {
		initializeLinks0();
	}
	
	public static void wire0() {
		TERMINALS[0].addFollower(TERMINALS[1], EMPTY_LINK_ARRAY);
		TERMINALS[1].addFollower(TERMINALS[2], EMPTY_LINK_ARRAY);
		TERMINALS[2].addFollower(TERMINALS[3], new hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[] {new hu.modembed.model.textnotations.type.mopp.TypeContainedFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getUnsignedTypeDefinition(), FEATURES[0]), });
		TERMINALS[2].addFollower(TERMINALS[4], new hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[] {new hu.modembed.model.textnotations.type.mopp.TypeContainedFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition(), FEATURES[0]), });
		TERMINALS[3].addFollower(TERMINALS[6], EMPTY_LINK_ARRAY);
		TERMINALS[6].addFollower(TERMINALS[7], EMPTY_LINK_ARRAY);
		TERMINALS[7].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[8].addFollower(TERMINALS[5], EMPTY_LINK_ARRAY);
		TERMINALS[4].addFollower(TERMINALS[5], EMPTY_LINK_ARRAY);
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
