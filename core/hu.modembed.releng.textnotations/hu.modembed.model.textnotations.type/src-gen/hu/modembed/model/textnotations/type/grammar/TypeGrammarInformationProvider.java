/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.grammar;

public class TypeGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static TypeGrammarInformationProvider INSTANCE = new TypeGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static hu.modembed.model.textnotations.type.grammar.TypeKeyword TYPE_0_0_0_0 = INSTANCE.getTYPE_0_0_0_0();
	private hu.modembed.model.textnotations.type.grammar.TypeKeyword getTYPE_0_0_0_0() {
		return new hu.modembed.model.textnotations.type.grammar.TypeKeyword("type", hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypePlaceholder TYPE_0_0_0_1 = INSTANCE.getTYPE_0_0_0_1();
	private hu.modembed.model.textnotations.type.grammar.TypePlaceholder getTYPE_0_0_0_1() {
		return new hu.modembed.model.textnotations.type.grammar.TypePlaceholder(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__NAME), "QUALIFIEDID", hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeKeyword TYPE_0_0_0_2 = INSTANCE.getTYPE_0_0_0_2();
	private hu.modembed.model.textnotations.type.grammar.TypeKeyword getTYPE_0_0_0_2() {
		return new hu.modembed.model.textnotations.type.grammar.TypeKeyword("=", hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeContainment TYPE_0_0_0_3 = INSTANCE.getTYPE_0_0_0_3();
	private hu.modembed.model.textnotations.type.grammar.TypeContainment getTYPE_0_0_0_3() {
		return new hu.modembed.model.textnotations.type.grammar.TypeContainment(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__DEFINITION), hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getTypeDefinition(), }, 0);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeKeyword TYPE_0_0_0_4 = INSTANCE.getTYPE_0_0_0_4();
	private hu.modembed.model.textnotations.type.grammar.TypeKeyword getTYPE_0_0_0_4() {
		return new hu.modembed.model.textnotations.type.grammar.TypeKeyword(";", hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeSequence TYPE_0_0_0 = INSTANCE.getTYPE_0_0_0();
	private hu.modembed.model.textnotations.type.grammar.TypeSequence getTYPE_0_0_0() {
		return new hu.modembed.model.textnotations.type.grammar.TypeSequence(hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE, TYPE_0_0_0_0, TYPE_0_0_0_1, TYPE_0_0_0_2, TYPE_0_0_0_3, TYPE_0_0_0_4);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeChoice TYPE_0_0 = INSTANCE.getTYPE_0_0();
	private hu.modembed.model.textnotations.type.grammar.TypeChoice getTYPE_0_0() {
		return new hu.modembed.model.textnotations.type.grammar.TypeChoice(hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE, TYPE_0_0_0);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeRule TYPE_0 = INSTANCE.getTYPE_0();
	private hu.modembed.model.textnotations.type.grammar.TypeRule getTYPE_0() {
		return new hu.modembed.model.textnotations.type.grammar.TypeRule(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType(), TYPE_0_0, hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeKeyword TYPE_1_0_0_0 = INSTANCE.getTYPE_1_0_0_0();
	private hu.modembed.model.textnotations.type.grammar.TypeKeyword getTYPE_1_0_0_0() {
		return new hu.modembed.model.textnotations.type.grammar.TypeKeyword("unsigned", hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeKeyword TYPE_1_0_0_1 = INSTANCE.getTYPE_1_0_0_1();
	private hu.modembed.model.textnotations.type.grammar.TypeKeyword getTYPE_1_0_0_1() {
		return new hu.modembed.model.textnotations.type.grammar.TypeKeyword("(", hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypePlaceholder TYPE_1_0_0_2 = INSTANCE.getTYPE_1_0_0_2();
	private hu.modembed.model.textnotations.type.grammar.TypePlaceholder getTYPE_1_0_0_2() {
		return new hu.modembed.model.textnotations.type.grammar.TypePlaceholder(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getUnsignedTypeDefinition().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.UNSIGNED_TYPE_DEFINITION__BITS), "INT", hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeKeyword TYPE_1_0_0_3 = INSTANCE.getTYPE_1_0_0_3();
	private hu.modembed.model.textnotations.type.grammar.TypeKeyword getTYPE_1_0_0_3() {
		return new hu.modembed.model.textnotations.type.grammar.TypeKeyword(")", hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeSequence TYPE_1_0_0 = INSTANCE.getTYPE_1_0_0();
	private hu.modembed.model.textnotations.type.grammar.TypeSequence getTYPE_1_0_0() {
		return new hu.modembed.model.textnotations.type.grammar.TypeSequence(hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE, TYPE_1_0_0_0, TYPE_1_0_0_1, TYPE_1_0_0_2, TYPE_1_0_0_3);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeChoice TYPE_1_0 = INSTANCE.getTYPE_1_0();
	private hu.modembed.model.textnotations.type.grammar.TypeChoice getTYPE_1_0() {
		return new hu.modembed.model.textnotations.type.grammar.TypeChoice(hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE, TYPE_1_0_0);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeRule TYPE_1 = INSTANCE.getTYPE_1();
	private hu.modembed.model.textnotations.type.grammar.TypeRule getTYPE_1() {
		return new hu.modembed.model.textnotations.type.grammar.TypeRule(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getUnsignedTypeDefinition(), TYPE_1_0, hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypePlaceholder TYPE_2_0_0_0 = INSTANCE.getTYPE_2_0_0_0();
	private hu.modembed.model.textnotations.type.grammar.TypePlaceholder getTYPE_2_0_0_0() {
		return new hu.modembed.model.textnotations.type.grammar.TypePlaceholder(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE), "QUALIFIEDID", hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeSequence TYPE_2_0_0 = INSTANCE.getTYPE_2_0_0();
	private hu.modembed.model.textnotations.type.grammar.TypeSequence getTYPE_2_0_0() {
		return new hu.modembed.model.textnotations.type.grammar.TypeSequence(hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE, TYPE_2_0_0_0);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeChoice TYPE_2_0 = INSTANCE.getTYPE_2_0();
	private hu.modembed.model.textnotations.type.grammar.TypeChoice getTYPE_2_0() {
		return new hu.modembed.model.textnotations.type.grammar.TypeChoice(hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE, TYPE_2_0_0);
	}
	public final static hu.modembed.model.textnotations.type.grammar.TypeRule TYPE_2 = INSTANCE.getTYPE_2();
	private hu.modembed.model.textnotations.type.grammar.TypeRule getTYPE_2() {
		return new hu.modembed.model.textnotations.type.grammar.TypeRule(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition(), TYPE_2_0, hu.modembed.model.textnotations.type.grammar.TypeCardinality.ONE);
	}
	
	public static String getSyntaxElementID(hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.class.getFields()) {
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
	
	public static hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement) hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static hu.modembed.model.textnotations.type.grammar.TypeRule[] RULES = new hu.modembed.model.textnotations.type.grammar.TypeRule[] {
		TYPE_0,
		TYPE_1,
		TYPE_2,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (hu.modembed.model.textnotations.type.grammar.TypeRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof hu.modembed.model.textnotations.type.grammar.TypeKeyword) {
			keywords.add(((hu.modembed.model.textnotations.type.grammar.TypeKeyword) element).getValue());
		} else if (element instanceof hu.modembed.model.textnotations.type.grammar.TypeBooleanTerminal) {
			keywords.add(((hu.modembed.model.textnotations.type.grammar.TypeBooleanTerminal) element).getTrueLiteral());
			keywords.add(((hu.modembed.model.textnotations.type.grammar.TypeBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof hu.modembed.model.textnotations.type.grammar.TypeEnumerationTerminal) {
			hu.modembed.model.textnotations.type.grammar.TypeEnumerationTerminal terminal = (hu.modembed.model.textnotations.type.grammar.TypeEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
