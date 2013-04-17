/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetPrinter2 implements hu.modembed.model.textnotations.instructionset.IInstructionsetTextPrinter {
	
	protected class PrintToken {
		
		private String text;
		private String tokenName;
		private org.eclipse.emf.ecore.EObject container;
		
		public PrintToken(String text, String tokenName, org.eclipse.emf.ecore.EObject container) {
			this.text = text;
			this.tokenName = tokenName;
			this.container = container;
		}
		
		public String getText() {
			return text;
		}
		
		public String getTokenName() {
			return tokenName;
		}
		
		public org.eclipse.emf.ecore.EObject getContainer() {
			return container;
		}
		
		public String toString() {
			return "'" + text + "' [" + tokenName + "]";
		}
		
	}
	
	/**
	 * The PrintCountingMap keeps tracks of the values that must be printed for each
	 * feature of an EObject. It is also used to store the indices of all values that
	 * have been printed. This knowledge is used to avoid printing values twice. We
	 * must store the concrete indices of the printed values instead of basically
	 * counting them, because values may be printed in an order that differs from the
	 * order in which they are stored in the EObject's feature.
	 */
	protected class PrintCountingMap {
		
		private java.util.Map<String, java.util.List<Object>> featureToValuesMap = new java.util.LinkedHashMap<String, java.util.List<Object>>();
		private java.util.Map<String, java.util.Set<Integer>> featureToPrintedIndicesMap = new java.util.LinkedHashMap<String, java.util.Set<Integer>>();
		
		public void setFeatureValues(String featureName, java.util.List<Object> values) {
			featureToValuesMap.put(featureName, values);
			// If the feature does not have values it won't be printed. An entry in
			// 'featureToPrintedIndicesMap' is therefore not needed in this case.
			if (values != null) {
				featureToPrintedIndicesMap.put(featureName, new java.util.LinkedHashSet<Integer>());
			}
		}
		
		public java.util.Set<Integer> getIndicesToPrint(String featureName) {
			return featureToPrintedIndicesMap.get(featureName);
		}
		
		public void addIndexToPrint(String featureName, int index) {
			featureToPrintedIndicesMap.get(featureName).add(index);
		}
		
		public int getCountLeft(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetTerminal terminal) {
			org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
			String featureName = feature.getName();
			java.util.List<Object> totalValuesToPrint = featureToValuesMap.get(featureName);
			java.util.Set<Integer> printedIndices = featureToPrintedIndicesMap.get(featureName);
			if (totalValuesToPrint == null) {
				return 0;
			}
			if (feature instanceof org.eclipse.emf.ecore.EAttribute) {
				// for attributes we do not need to check the type, since the CS languages does
				// not allow type restrictions for attributes.
				return totalValuesToPrint.size() - printedIndices.size();
			} else if (feature instanceof org.eclipse.emf.ecore.EReference) {
				org.eclipse.emf.ecore.EReference reference = (org.eclipse.emf.ecore.EReference) feature;
				if (!reference.isContainment()) {
					// for non-containment references we also do not need to check the type, since the
					// CS languages does not allow type restrictions for these either.
					return totalValuesToPrint.size() - printedIndices.size();
				}
			}
			// now we're left with containment references for which we check the type of the
			// objects to print
			java.util.List<Class<?>> allowedTypes = getAllowedTypes(terminal);
			java.util.Set<Integer> indicesWithCorrectType = new java.util.LinkedHashSet<Integer>();
			int index = 0;
			for (Object valueToPrint : totalValuesToPrint) {
				for (Class<?> allowedType : allowedTypes) {
					if (allowedType.isInstance(valueToPrint)) {
						indicesWithCorrectType.add(index);
					}
				}
				index++;
			}
			indicesWithCorrectType.removeAll(printedIndices);
			return indicesWithCorrectType.size();
		}
		
		public int getNextIndexToPrint(String featureName) {
			int printedValues = featureToPrintedIndicesMap.get(featureName).size();
			return printedValues;
		}
		
	}
	
	public final static String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	
	private final hu.modembed.model.textnotations.instructionset.util.InstructionsetEClassUtil eClassUtil = new hu.modembed.model.textnotations.instructionset.util.InstructionsetEClassUtil();
	
	/**
	 * Holds the resource that is associated with this printer. May be null if the
	 * printer is used stand alone.
	 */
	private hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource;
	
	private java.util.Map<?, ?> options;
	private java.io.OutputStream outputStream;
	private String encoding = System.getProperty("file.encoding");
	protected java.util.List<PrintToken> tokenOutputStream;
	private hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolverFactory tokenResolverFactory = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenResolverFactory();
	private boolean handleTokenSpaceAutomatically = true;
	private int tokenSpace = 1;
	/**
	 * A flag that indicates whether tokens have already been printed for some object.
	 * The flag is set to false whenever printing of an EObject tree is started. The
	 * status of the flag is used to avoid printing default token space in front of
	 * the root object.
	 */
	private boolean startedPrintingObject = false;
	/**
	 * The number of tab characters that were printed before the current line. This
	 * number is used to calculate the relative indentation when printing contained
	 * objects, because all contained objects must start with this indentation
	 * (tabsBeforeCurrentObject + currentTabs).
	 */
	private int currentTabs;
	/**
	 * The number of tab characters that must be printed before the current object.
	 * This number is used to calculate the indentation of new lines, when line breaks
	 * are printed within one object.
	 */
	private int tabsBeforeCurrentObject;
	/**
	 * This flag is used to indicate whether the number of tabs before the current
	 * object has been set for the current object. The flag is needed, because setting
	 * the number of tabs must be performed when the first token of the contained
	 * element is printed.
	 */
	private boolean startedPrintingContainedObject;
	
	public InstructionsetPrinter2(java.io.OutputStream outputStream, hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		tokenOutputStream = new java.util.ArrayList<PrintToken>();
		currentTabs = 0;
		tabsBeforeCurrentObject = 0;
		startedPrintingObject = true;
		startedPrintingContainedObject = false;
		java.util.List<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement>  formattingElements = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement>();
		doPrint(element, formattingElements);
		// print all remaining formatting elements
		java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> layoutInformations = getCopyOfLayoutInformation(element);
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation eofLayoutInformation = getLayoutInformation(layoutInformations, null, null, null);
		printFormattingElements(element, formattingElements, layoutInformations, eofLayoutInformation);
		java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		if (handleTokenSpaceAutomatically) {
			printSmart(writer);
		} else {
			printBasic(writer);
		}
		writer.flush();
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.util.List<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement> foundFormattingElements) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (outputStream == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof hu.modembed.model.modembed.core.instructionset.InstructionSet) {
			printInternal(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_0, foundFormattingElements);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.core.instructionset.Instruction) {
			printInternal(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_1, foundFormattingElements);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.core.instructionset.InstructionParameter) {
			printInternal(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_2, foundFormattingElements);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.core.instructionset.InstructionWord) {
			printInternal(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_3, foundFormattingElements);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.core.instructionset.ConstantSection) {
			printInternal(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_4, foundFormattingElements);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.core.instructionset.ParameterSection) {
			printInternal(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_5, foundFormattingElements);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void printInternal(org.eclipse.emf.ecore.EObject eObject, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement ruleElement, java.util.List<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement> foundFormattingElements) {
		java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> layoutInformations = getCopyOfLayoutInformation(eObject);
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator decoratorTree = getDecoratorTree(ruleElement);
		decorateTree(decoratorTree, eObject);
		printTree(decoratorTree, eObject, foundFormattingElements, layoutInformations);
	}
	
	/**
	 * creates a tree of decorator objects which reflects the syntax tree that is
	 * attached to the given syntax element
	 */
	public hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator getDecoratorTree(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement syntaxElement) {
		hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement[] children = syntaxElement.getChildren();
		int childCount = children.length;
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator[] childDecorators = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator[childCount];
		for (int i = 0; i < childCount; i++) {
			childDecorators[i] = getDecoratorTree(children[i]);
		}
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator decorator = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator(syntaxElement, childDecorators);
		return decorator;
	}
	
	public void decorateTree(hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject) {
		PrintCountingMap printCountingMap = initializePrintCountingMap(eObject);
		java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator> keywordsToPrint = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator>();
		decorateTreeBasic(decorator, eObject, printCountingMap, keywordsToPrint);
		for (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator keywordToPrint : keywordsToPrint) {
			// for keywords the concrete index does not matter, but we must add one to
			// indicate that the keyword needs to be printed here. Thus, we use 0 as index.
			keywordToPrint.addIndexToPrint(0);
		}
	}
	
	/**
	 * Tries to decorate the decorator with an attribute value, or reference held by
	 * the given EObject. Returns true if an attribute value or reference was found.
	 */
	public boolean decorateTreeBasic(hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, PrintCountingMap printCountingMap, java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator> keywordsToPrint) {
		boolean foundFeatureToPrint = false;
		hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement syntaxElement = decorator.getDecoratedElement();
		hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality = syntaxElement.getCardinality();
		boolean isFirstIteration = true;
		while (true) {
			java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator> subKeywordsToPrint = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator>();
			boolean keepDecorating = false;
			if (syntaxElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword) {
				subKeywordsToPrint.add(decorator);
			} else if (syntaxElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetTerminal) {
				hu.modembed.model.textnotations.instructionset.grammar.InstructionsetTerminal terminal = (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetTerminal) syntaxElement;
				org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
				if (feature == hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.ANONYMOUS_FEATURE) {
					return false;
				}
				String featureName = feature.getName();
				int countLeft = printCountingMap.getCountLeft(terminal);
				if (countLeft > terminal.getMandatoryOccurencesAfter()) {
					// normally we print the element at the next index
					int indexToPrint = printCountingMap.getNextIndexToPrint(featureName);
					// But, if there are type restrictions for containments, we must choose an index
					// of an element that fits (i.e., which has the correct type)
					if (terminal instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment) {
						hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment containment = (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment) terminal;
						indexToPrint = findElementWithCorrectType(eObject, feature, printCountingMap.getIndicesToPrint(featureName), containment);
					}
					if (indexToPrint >= 0) {
						decorator.addIndexToPrint(indexToPrint);
						printCountingMap.addIndexToPrint(featureName, indexToPrint);
						keepDecorating = true;
					}
				}
			}
			if (syntaxElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice) {
				// for choices we do print only the choice which does print at least one feature
				hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator childToPrint = null;
				for (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					// pick first choice as default, will be overridden if a choice that prints a
					// feature is found
					if (childToPrint == null) {
						childToPrint = childDecorator;
					}
					if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
						childToPrint = childDecorator;
						break;
					}
				}
				keepDecorating |= decorateTreeBasic(childToPrint, eObject, printCountingMap, subKeywordsToPrint);
			} else {
				// for all other syntax element we do print all children
				for (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					keepDecorating |= decorateTreeBasic(childDecorator, eObject, printCountingMap, subKeywordsToPrint);
				}
			}
			foundFeatureToPrint |= keepDecorating;
			// only print keywords if a feature was printed or the syntax element is mandatory
			if (cardinality == hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			} else if (cardinality == hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.PLUS) {
				if (isFirstIteration) {
					keywordsToPrint.addAll(subKeywordsToPrint);
				} else {
					if (keepDecorating) {
						keywordsToPrint.addAll(subKeywordsToPrint);
					}
				}
			} else if (keepDecorating && (cardinality == hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.STAR || cardinality == hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.QUESTIONMARK)) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			}
			if (cardinality == hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE || cardinality == hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.QUESTIONMARK) {
				break;
			} else if (!keepDecorating) {
				break;
			}
			isFirstIteration = false;
		}
		return foundFeatureToPrint;
	}
	
	private int findElementWithCorrectType(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EStructuralFeature feature, java.util.Set<Integer> indicesToPrint, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment containment) {
		// By default the type restrictions that are defined in the CS definition are
		// considered when printing models. You can change this behavior by setting the
		// 'ignoreTypeRestrictionsForPrinting' option to true.
		boolean ignoreTypeRestrictions = false;
		org.eclipse.emf.ecore.EClass[] allowedTypes = containment.getAllowedTypes();
		Object value = eObject.eGet(feature);
		if (value instanceof java.util.List<?>) {
			java.util.List<?> valueList = (java.util.List<?>) value;
			int listSize = valueList.size();
			for (int index = 0; index < listSize; index++) {
				if (indicesToPrint.contains(index)) {
					continue;
				}
				Object valueAtIndex = valueList.get(index);
				if (eClassUtil.isInstance(valueAtIndex, allowedTypes) || ignoreTypeRestrictions) {
					return index;
				}
			}
		} else {
			if (eClassUtil.isInstance(value, allowedTypes) || ignoreTypeRestrictions) {
				return 0;
			}
		}
		return -1;
	}
	
	/**
	 * Checks whether decorating the given node will use at least one attribute value,
	 * or reference held by eObject. Returns true if a printable attribute value or
	 * reference was found. This method is used to decide which choice to pick, when
	 * multiple choices are available. We pick the choice that prints at least one
	 * attribute or reference.
	 */
	public boolean doesPrintFeature(hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, PrintCountingMap printCountingMap) {
		hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement syntaxElement = decorator.getDecoratedElement();
		if (syntaxElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetTerminal) {
			hu.modembed.model.textnotations.instructionset.grammar.InstructionsetTerminal terminal = (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetTerminal) syntaxElement;
			org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
			if (feature == hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.ANONYMOUS_FEATURE) {
				return false;
			}
			int countLeft = printCountingMap.getCountLeft(terminal);
			if (countLeft > terminal.getMandatoryOccurencesAfter()) {
				// found a feature to print
				return true;
			}
		}
		for (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
			if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean printTree(hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.List<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement> foundFormattingElements, java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> layoutInformations) {
		hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement printElement = decorator.getDecoratedElement();
		hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality = printElement.getCardinality();
		java.util.List<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement> cloned = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement>();
		cloned.addAll(foundFormattingElements);
		boolean foundSomethingAtAll = false;
		boolean foundSomethingToPrint;
		while (true) {
			foundSomethingToPrint = false;
			Integer indexToPrint = decorator.getNextIndexToPrint();
			if (indexToPrint != null) {
				if (printElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword) {
					printKeyword(eObject, (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword) printElement, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder) {
					hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder placeholder = (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder) printElement;
					printFeature(eObject, placeholder, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment) {
					hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment containment = (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment) printElement;
					printContainedObject(eObject, containment, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetBooleanTerminal) {
					hu.modembed.model.textnotations.instructionset.grammar.InstructionsetBooleanTerminal booleanTerminal = (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetBooleanTerminal) printElement;
					printBooleanTerminal(eObject, booleanTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetEnumerationTerminal) {
					hu.modembed.model.textnotations.instructionset.grammar.InstructionsetEnumerationTerminal enumTerminal = (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetEnumerationTerminal) printElement;
					printEnumerationTerminal(eObject, enumTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				}
			}
			if (foundSomethingToPrint) {
				foundSomethingAtAll = true;
			}
			if (printElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetWhiteSpace) {
				foundFormattingElements.add((hu.modembed.model.textnotations.instructionset.grammar.InstructionsetWhiteSpace) printElement);
			}
			if (printElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetLineBreak) {
				foundFormattingElements.add((hu.modembed.model.textnotations.instructionset.grammar.InstructionsetLineBreak) printElement);
			}
			for (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
				foundSomethingToPrint |= printTree(childDecorator, eObject, foundFormattingElements, layoutInformations);
				hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement decoratedElement = decorator.getDecoratedElement();
				if (foundSomethingToPrint && decoratedElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice) {
					break;
				}
			}
			if (cardinality == hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.ONE || cardinality == hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.QUESTIONMARK) {
				break;
			} else if (!foundSomethingToPrint) {
				break;
			}
		}
		// only print formatting elements if a feature was printed or the syntax element
		// is mandatory
		if (!foundSomethingAtAll && (cardinality == hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.STAR || cardinality == hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality.QUESTIONMARK)) {
			foundFormattingElements.clear();
			foundFormattingElements.addAll(cloned);
		}
		return foundSomethingToPrint;
	}
	
	public void printKeyword(org.eclipse.emf.ecore.EObject eObject, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword keyword, java.util.List<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement> foundFormattingElements, java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> layoutInformations) {
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation keywordLayout = getLayoutInformation(layoutInformations, keyword, null, eObject);
		printFormattingElements(eObject, foundFormattingElements, layoutInformations, keywordLayout);
		String value = keyword.getValue();
		tokenOutputStream.add(new PrintToken(value, "'" + hu.modembed.model.textnotations.instructionset.util.InstructionsetStringUtil.escapeToANTLRKeyword(value) + "'", eObject));
	}
	
	public void printFeature(org.eclipse.emf.ecore.EObject eObject, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder placeholder, int count, java.util.List<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement> foundFormattingElements, java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature feature = placeholder.getFeature();
		if (feature instanceof org.eclipse.emf.ecore.EAttribute) {
			printAttribute(eObject, (org.eclipse.emf.ecore.EAttribute) feature, placeholder, count, foundFormattingElements, layoutInformations);
		} else {
			printReference(eObject, (org.eclipse.emf.ecore.EReference) feature, placeholder, count, foundFormattingElements, layoutInformations);
		}
	}
	
	public void printAttribute(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EAttribute attribute, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder placeholder, int index, java.util.List<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement> foundFormattingElements, java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> layoutInformations) {
		String result = null;
		Object attributeValue = hu.modembed.model.textnotations.instructionset.util.InstructionsetEObjectUtil.getFeatureValue(eObject, attribute, index);
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, placeholder, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(attributeLayout);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		}
		
		if (result == null) {
			// if no text is available, the attribute is deresolved to obtain its textual
			// representation
			hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(placeholder.getTokenName());
			tokenResolver.setOptions(getOptions());
			String deResolvedValue = tokenResolver.deResolve(attributeValue, attribute, eObject);
			result = deResolvedValue;
		}
		
		if (result != null && !"".equals(result)) {
			printFormattingElements(eObject, foundFormattingElements, layoutInformations, attributeLayout);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, placeholder.getTokenName(), eObject));
		}
	}
	
	
	public void printBooleanTerminal(org.eclipse.emf.ecore.EObject eObject, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetBooleanTerminal booleanTerminal, int index, java.util.List<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement> foundFormattingElements, java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EAttribute attribute = booleanTerminal.getAttribute();
		String result = null;
		Object attributeValue = hu.modembed.model.textnotations.instructionset.util.InstructionsetEObjectUtil.getFeatureValue(eObject, attribute, index);
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, booleanTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(attributeLayout);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		}
		
		if (result == null) {
			// if no text is available, the boolean attribute is converted to its textual
			// representation using the literals of the boolean terminal
			if (Boolean.TRUE.equals(attributeValue)) {
				result = booleanTerminal.getTrueLiteral();
			} else {
				result = booleanTerminal.getFalseLiteral();
			}
		}
		
		if (result != null && !"".equals(result)) {
			printFormattingElements(eObject, foundFormattingElements, layoutInformations, attributeLayout);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + hu.modembed.model.textnotations.instructionset.util.InstructionsetStringUtil.escapeToANTLRKeyword(result) + "'", eObject));
		}
	}
	
	
	public void printEnumerationTerminal(org.eclipse.emf.ecore.EObject eObject, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetEnumerationTerminal enumTerminal, int index, java.util.List<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement> foundFormattingElements, java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EAttribute attribute = enumTerminal.getAttribute();
		String result = null;
		Object attributeValue = hu.modembed.model.textnotations.instructionset.util.InstructionsetEObjectUtil.getFeatureValue(eObject, attribute, index);
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, enumTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(attributeLayout);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		}
		
		if (result == null) {
			// if no text is available, the enumeration attribute is converted to its textual
			// representation using the literals of the enumeration terminal
			assert attributeValue instanceof org.eclipse.emf.common.util.Enumerator;
			result = enumTerminal.getText(((org.eclipse.emf.common.util.Enumerator) attributeValue).getName());
		}
		
		if (result != null && !"".equals(result)) {
			printFormattingElements(eObject, foundFormattingElements, layoutInformations, attributeLayout);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + hu.modembed.model.textnotations.instructionset.util.InstructionsetStringUtil.escapeToANTLRKeyword(result) + "'", eObject));
		}
	}
	
	
	public void printContainedObject(org.eclipse.emf.ecore.EObject eObject, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment containment, int index, java.util.List<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement> foundFormattingElements, java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature reference = containment.getFeature();
		Object o = hu.modembed.model.textnotations.instructionset.util.InstructionsetEObjectUtil.getFeatureValue(eObject, reference, index);
		// save current number of tabs to restore them after printing the contained object
		int oldTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		int oldCurrentTabs = currentTabs;
		// use current number of tabs to indent contained object. we do not directly set
		// 'tabsBeforeCurrentObject' because the first element of the new object must be
		// printed with the old number of tabs.
		startedPrintingContainedObject = false;
		currentTabs = 0;
		doPrint((org.eclipse.emf.ecore.EObject) o, foundFormattingElements);
		// restore number of tabs after printing the contained object
		tabsBeforeCurrentObject = oldTabsBeforeCurrentObject;
		currentTabs = oldCurrentTabs;
	}
	
	public void printFormattingElements(org.eclipse.emf.ecore.EObject eObject, java.util.List<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement> foundFormattingElements, java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> layoutInformations, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation layoutInformation) {
		String hiddenTokenText = getHiddenTokenText(layoutInformation);
		if (hiddenTokenText != null) {
			// removed used information
			if (layoutInformations != null) {
				layoutInformations.remove(layoutInformation);
			}
			tokenOutputStream.add(new PrintToken(hiddenTokenText, null, eObject));
			foundFormattingElements.clear();
			startedPrintingObject = false;
			setTabsBeforeCurrentObject(0);
			return;
		}
		int printedTabs = 0;
		if (foundFormattingElements.size() > 0) {
			for (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement foundFormattingElement : foundFormattingElements) {
				if (foundFormattingElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetWhiteSpace) {
					int amount = ((hu.modembed.model.textnotations.instructionset.grammar.InstructionsetWhiteSpace) foundFormattingElement).getAmount();
					for (int i = 0; i < amount; i++) {
						tokenOutputStream.add(createSpaceToken(eObject));
					}
				}
				if (foundFormattingElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetLineBreak) {
					currentTabs = ((hu.modembed.model.textnotations.instructionset.grammar.InstructionsetLineBreak) foundFormattingElement).getTabs();
					printedTabs += currentTabs;
					tokenOutputStream.add(createNewLineToken(eObject));
					for (int i = 0; i < tabsBeforeCurrentObject + currentTabs; i++) {
						tokenOutputStream.add(createTabToken(eObject));
					}
				}
			}
			foundFormattingElements.clear();
			startedPrintingObject = false;
		} else {
			if (startedPrintingObject) {
				// if no elements have been printed yet, we do not add the default token space,
				// because spaces before the first element are not desired.
				startedPrintingObject = false;
			} else {
				if (!handleTokenSpaceAutomatically) {
					tokenOutputStream.add(new PrintToken(getWhiteSpaceString(tokenSpace), null, eObject));
				}
			}
		}
		// after printing the first element, we can use the new number of tabs.
		setTabsBeforeCurrentObject(printedTabs);
	}
	
	private void setTabsBeforeCurrentObject(int tabs) {
		if (startedPrintingContainedObject) {
			return;
		}
		tabsBeforeCurrentObject = tabsBeforeCurrentObject + tabs;
		startedPrintingContainedObject = true;
	}
	
	@SuppressWarnings("unchecked")	
	public void printReference(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EReference reference, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder placeholder, int index, java.util.List<hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement> foundFormattingElements, java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> layoutInformations) {
		String tokenName = placeholder.getTokenName();
		Object referencedObject = hu.modembed.model.textnotations.instructionset.util.InstructionsetEObjectUtil.getFeatureValue(eObject, reference, index, false);
		// first add layout before the reference
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation referenceLayout = getLayoutInformation(layoutInformations, placeholder, referencedObject, eObject);
		printFormattingElements(eObject, foundFormattingElements, layoutInformations, referenceLayout);
		// proxy objects must be printed differently
		String deresolvedReference = null;
		if (referencedObject instanceof org.eclipse.emf.ecore.EObject) {
			org.eclipse.emf.ecore.EObject eObjectToDeResolve = (org.eclipse.emf.ecore.EObject) referencedObject;
			if (eObjectToDeResolve.eIsProxy()) {
				deresolvedReference = ((org.eclipse.emf.ecore.InternalEObject) eObjectToDeResolve).eProxyURI().fragment();
				// If the proxy was created by EMFText, we can try to recover the identifier from
				// the proxy URI
				if (deresolvedReference != null && deresolvedReference.startsWith(hu.modembed.model.textnotations.instructionset.IInstructionsetContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX)) {
					deresolvedReference = deresolvedReference.substring(hu.modembed.model.textnotations.instructionset.IInstructionsetContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX.length());
					deresolvedReference = deresolvedReference.substring(deresolvedReference.indexOf("_") + 1);
				}
			}
		}
		if (deresolvedReference == null) {
			// NC-References must always be printed by deresolving the reference. We cannot
			// use the visible token information, because deresolving usually depends on
			// attribute values of the referenced object instead of the object itself.
			@SuppressWarnings("rawtypes")			
			hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver referenceResolver = getReferenceResolverSwitch().getResolver(reference);
			referenceResolver.setOptions(getOptions());
			deresolvedReference = referenceResolver.deResolve((org.eclipse.emf.ecore.EObject) referencedObject, eObject, reference);
		}
		hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
		tokenResolver.setOptions(getOptions());
		String deresolvedToken = tokenResolver.deResolve(deresolvedReference, reference, eObject);
		// write result to output stream
		tokenOutputStream.add(new PrintToken(deresolvedToken, tokenName, eObject));
	}
	
	@SuppressWarnings("unchecked")	
	public PrintCountingMap initializePrintCountingMap(org.eclipse.emf.ecore.EObject eObject) {
		// The PrintCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		PrintCountingMap printCountingMap = new PrintCountingMap();
		java.util.List<org.eclipse.emf.ecore.EStructuralFeature> features = eObject.eClass().getEAllStructuralFeatures();
		for (org.eclipse.emf.ecore.EStructuralFeature feature : features) {
			// We get the feature value without resolving it, because resolving is not
			// required to count the number of elements that are referenced by the feature.
			// Moreover, triggering reference resolving is not desired here, because we'd also
			// like to print models that contain unresolved references.
			Object featureValue = eObject.eGet(feature, false);
			if (featureValue != null) {
				if (featureValue instanceof java.util.List<?>) {
					printCountingMap.setFeatureValues(feature.getName(), (java.util.List<Object>) featureValue);
				} else {
					printCountingMap.setFeatureValues(feature.getName(), java.util.Collections.singletonList(featureValue));
				}
			} else {
				printCountingMap.setFeatureValues(feature.getName(), null);
			}
		}
		return printCountingMap;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource getResource() {
		return resource;
	}
	
	protected hu.modembed.model.textnotations.instructionset.mopp.InstructionsetReferenceResolverSwitch getReferenceResolverSwitch() {
		return (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetReferenceResolverSwitch) new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetProblem(errorMessage, hu.modembed.model.textnotations.instructionset.InstructionsetEProblemType.PRINT_PROBLEM, hu.modembed.model.textnotations.instructionset.InstructionsetEProblemSeverity.WARNING), cause);
	}
	
	protected hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformationAdapter) {
				return (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformationAdapter) adapter;
			}
		}
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformationAdapter newAdapter = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	private hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation getLayoutInformation(java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> layoutInformations, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement syntaxElement, Object object, org.eclipse.emf.ecore.EObject container) {
		for (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation layoutInformation : layoutInformations) {
			if (syntaxElement == layoutInformation.getSyntaxElement()) {
				if (object == null) {
					return layoutInformation;
				}
				// The layout information adapter must only try to resolve the object it refers
				// to, if we compare with a non-proxy object. If we're printing a resource that
				// contains proxy objects, resolving must not be triggered.
				boolean isNoProxy = true;
				if (object instanceof org.eclipse.emf.ecore.EObject) {
					org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) object;
					isNoProxy = !eObject.eIsProxy();
				}
				if (isSame(object, layoutInformation.getObject(container, isNoProxy))) {
					return layoutInformation;
				}
			}
		}
		return null;
	}
	
	public java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> getCopyOfLayoutInformation(org.eclipse.emf.ecore.EObject eObject) {
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(eObject);
		java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> originalLayoutInformations = layoutInformationAdapter.getLayoutInformations();
		// create a copy of the original list of layout information object in order to be
		// able to remove used informations during printing
		java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation> layoutInformations = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation>(originalLayoutInformations.size());
		layoutInformations.addAll(originalLayoutInformations);
		return layoutInformations;
	}
	
	private String getHiddenTokenText(hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getHiddenTokenText();
		} else {
			return null;
		}
	}
	
	private String getVisibleTokenText(hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getVisibleTokenText();
		} else {
			return null;
		}
	}
	
	protected String getWhiteSpaceString(int count) {
		return getRepeatingString(count, ' ');
	}
	
	private String getRepeatingString(int count, char character) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < count; i++) {
			result.append(character);
		}
		return result.toString();
	}
	
	public void setHandleTokenSpaceAutomatically(boolean handleTokenSpaceAutomatically) {
		this.handleTokenSpaceAutomatically = handleTokenSpaceAutomatically;
	}
	
	public void setTokenSpace(int tokenSpace) {
		this.tokenSpace = tokenSpace;
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer (as it is).
	 */
	public void printBasic(java.io.PrintWriter writer) throws java.io.IOException {
		for (PrintToken nextToken : tokenOutputStream) {
			writer.write(nextToken.getText());
		}
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer.
	 * 
	 * This methods implements smart whitespace printing. It does so by writing output
	 * to a token stream instead of printing the raw token text to a PrintWriter.
	 * Tokens in this stream hold both the text and the type of the token (i.e., its
	 * name).
	 * 
	 * To decide where whitespace is needed, sequences of successive tokens are
	 * searched that can be printed without separating whitespace. To determine such
	 * groups we start with two successive non-whitespace tokens, concatenate their
	 * text and use the generated ANTLR lexer to split the text. If the resulting
	 * token sequence of the concatenated text is exactly the same as the one that is
	 * to be printed, no whitespace is needed. The tokens in the sequence are checked
	 * both regarding their type and their text. If two tokens successfully form a
	 * group a third one is added and so on.
	 */
	public void printSmart(java.io.PrintWriter writer) throws java.io.IOException {
		// stores the text of the current group of tokens. this text is given to the lexer
		// to check whether it can be correctly scanned.
		StringBuilder currentBlock = new StringBuilder();
		// stores the index of the first token of the current group.
		int currentBlockStart = 0;
		// stores the text that was already successfully checked (i.e., is can be scanned
		// correctly and can thus be printed).
		String validBlock = "";
		char lastCharWritten = ' ';
		for (int i = 0; i < tokenOutputStream.size(); i++) {
			PrintToken tokenI = tokenOutputStream.get(i);
			currentBlock.append(tokenI.getText());
			// if declared or preserved whitespace is found - print block
			if (tokenI.getTokenName() == null) {
				char[] charArray = currentBlock.toString().toCharArray();
				writer.write(charArray);
				if (charArray.length > 0) {
					lastCharWritten = charArray[charArray.length - 1];
				}
				// reset all values
				currentBlock = new StringBuilder();
				currentBlockStart = i + 1;
				validBlock = "";
				continue;
			}
			// now check whether the current block can be scanned
			hu.modembed.model.textnotations.instructionset.IInstructionsetTextScanner scanner = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetMetaInformation().createLexer();
			scanner.setText(currentBlock.toString());
			// retrieve all tokens from scanner and add them to list 'tempTokens'
			java.util.List<hu.modembed.model.textnotations.instructionset.IInstructionsetTextToken> tempTokens = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.IInstructionsetTextToken>();
			hu.modembed.model.textnotations.instructionset.IInstructionsetTextToken nextToken = scanner.getNextToken();
			while (nextToken != null && nextToken.getText() != null) {
				tempTokens.add(nextToken);
				nextToken = scanner.getNextToken();
			}
			boolean sequenceIsValid = true;
			// check whether the current block was scanned to the same token sequence
			for (int t = 0; t < tempTokens.size(); t++) {
				PrintToken printTokenT = tokenOutputStream.get(currentBlockStart + t);
				hu.modembed.model.textnotations.instructionset.IInstructionsetTextToken tempToken = tempTokens.get(t);
				if (!tempToken.getText().equals(printTokenT.getText())) {
					sequenceIsValid = false;
					break;
				}
				String commonTokenName = tempToken.getName();
				String printTokenName = printTokenT.getTokenName();
				if (printTokenName.length() > 2 && printTokenName.startsWith("'") && printTokenName.endsWith("'")) {
					printTokenName = printTokenName.substring(1, printTokenName.length() - 1);
				}
				if (!commonTokenName.equals(printTokenName)) {
					sequenceIsValid = false;
					break;
				}
			}
			if (sequenceIsValid) {
				// sequence is still valid, try adding one more token in the next iteration of the
				// loop
				validBlock += tokenI.getText();
			} else {
				// sequence is not valid, must print whitespace to separate tokens
				// print text that is valid so far
				char[] charArray = validBlock.toString().toCharArray();
				writer.write(charArray);
				if (charArray.length > 0) {
					lastCharWritten = charArray[charArray.length - 1];
				}
				// print separating whitespace
				// if no whitespace (or tab or linebreak) is already there
				if (lastCharWritten != ' ' && lastCharWritten != '\t' && lastCharWritten != '\n' && lastCharWritten != '\r') {
					lastCharWritten = ' ';
					writer.write(lastCharWritten);
				}
				// add current token as initial value for next iteration
				currentBlock = new StringBuilder(tokenI.getText());
				currentBlockStart = i;
				validBlock = tokenI.getText();
			}
		}
		// flush remaining valid text to writer
		writer.write(validBlock);
	}
	
	private boolean isSame(Object o1, Object o2) {
		if (o1 instanceof String || o1 instanceof Integer || o1 instanceof Long || o1 instanceof Byte || o1 instanceof Short || o1 instanceof Float || o2 instanceof Double) {
			return o1.equals(o2);
		}
		return o1 == o2;
	}
	
	protected java.util.List<Class<?>> getAllowedTypes(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetTerminal terminal) {
		java.util.List<Class<?>> allowedTypes = new java.util.ArrayList<Class<?>>();
		allowedTypes.add(terminal.getFeature().getEType().getInstanceClass());
		if (terminal instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment) {
			hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment printingContainment = (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainment) terminal;
			org.eclipse.emf.ecore.EClass[] typeRestrictions = printingContainment.getAllowedTypes();
			if (typeRestrictions != null && typeRestrictions.length > 0) {
				allowedTypes.clear();
				for (org.eclipse.emf.ecore.EClass eClass : typeRestrictions) {
					allowedTypes.add(eClass.getInstanceClass());
				}
			}
		}
		return allowedTypes;
	}
	
	protected PrintToken createSpaceToken(org.eclipse.emf.ecore.EObject container) {
		return new PrintToken(" ", null, container);
	}
	
	protected PrintToken createTabToken(org.eclipse.emf.ecore.EObject container) {
		return new PrintToken("\t", null, container);
	}
	
	protected PrintToken createNewLineToken(org.eclipse.emf.ecore.EObject container) {
		return new PrintToken(NEW_LINE, null, container);
	}
	
}
