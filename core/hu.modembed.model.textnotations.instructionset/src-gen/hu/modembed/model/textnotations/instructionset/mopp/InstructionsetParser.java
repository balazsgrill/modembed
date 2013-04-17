// $ANTLR 3.4

	package hu.modembed.model.textnotations.instructionset.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class InstructionsetParser extends InstructionsetANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BINARY", "CHAR", "IDENTIFIER", "INT", "LINEBREAK", "QUALIFIEDID", "TEXT", "WHITESPACE", "':'", "';'", "'<'", "'>'", "'extends'", "'instructionset'"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int BINARY=4;
    public static final int CHAR=5;
    public static final int IDENTIFIER=6;
    public static final int INT=7;
    public static final int LINEBREAK=8;
    public static final int QUALIFIEDID=9;
    public static final int TEXT=10;
    public static final int WHITESPACE=11;

    // delegates
    public InstructionsetANTLRParserBase[] getDelegates() {
        return new InstructionsetANTLRParserBase[] {};
    }

    // delegators


    public InstructionsetParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public InstructionsetParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(16 + 1);
         

    }

    public String[] getTokenNames() { return InstructionsetParser.tokenNames; }
    public String getGrammarFileName() { return "Instructionset.g"; }


    	private hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolverFactory tokenResolverFactory = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal> expectedElements = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>() {
    			public boolean execute(hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new hu.modembed.model.textnotations.instructionset.IInstructionsetProblem() {
    					public hu.modembed.model.textnotations.instructionset.InstructionsetEProblemSeverity getSeverity() {
    						return hu.modembed.model.textnotations.instructionset.InstructionsetEProblemSeverity.ERROR;
    					}
    					public hu.modembed.model.textnotations.instructionset.InstructionsetEProblemType getType() {
    						return hu.modembed.model.textnotations.instructionset.InstructionsetEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		int terminalID = ids[0];
    		int followSetID = ids[1];
    		hu.modembed.model.textnotations.instructionset.IInstructionsetExpectedElement terminal = hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFollowSetProvider.TERMINALS[terminalID];
    		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] containmentFeatures = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFollowSetProvider.LINKS[ids[i]];
    		}
    		hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainmentTrace containmentTrace = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal expectedElement = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal(container, terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    			this.expectedElementsIndexOfLastCompleteElement = 0;
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>() {
    			public boolean execute(hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource) {
    				hu.modembed.model.textnotations.instructionset.IInstructionsetLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>() {
    			public boolean execute(hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource) {
    				hu.modembed.model.textnotations.instructionset.IInstructionsetLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>() {
    			public boolean execute(hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource) {
    				hu.modembed.model.textnotations.instructionset.IInstructionsetLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public hu.modembed.model.textnotations.instructionset.IInstructionsetTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new InstructionsetParser(new org.antlr.runtime3_4_0.CommonTokenStream(new InstructionsetLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new InstructionsetParser(new org.antlr.runtime3_4_0.CommonTokenStream(new InstructionsetLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new hu.modembed.model.textnotations.instructionset.util.InstructionsetRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public InstructionsetParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((InstructionsetLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((InstructionsetLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == hu.modembed.model.modembed.core.instructionset.InstructionSet.class) {
    				return parse_hu_modembed_model_modembed_core_instructionset_InstructionSet();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.core.instructionset.Instruction.class) {
    				return parse_hu_modembed_model_modembed_core_instructionset_Instruction();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.core.instructionset.InstructionParameter.class) {
    				return parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.core.instructionset.InstructionWord.class) {
    				return parse_hu_modembed_model_modembed_core_instructionset_InstructionWord();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.core.instructionset.ConstantSection.class) {
    				return parse_hu_modembed_model_modembed_core_instructionset_ConstantSection();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.core.instructionset.ParameterSection.class) {
    				return parse_hu_modembed_model_modembed_core_instructionset_ParameterSection();
    			}
    		}
    		throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(hu.modembed.model.textnotations.instructionset.IInstructionsetOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public hu.modembed.model.textnotations.instructionset.IInstructionsetParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>>();
    		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetParseResult parseResult = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		hu.modembed.model.textnotations.instructionset.IInstructionsetParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal>();
    		java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal> newFollowSet = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 33;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<hu.modembed.model.textnotations.instructionset.util.InstructionsetPair<hu.modembed.model.textnotations.instructionset.IInstructionsetExpectedElement, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (hu.modembed.model.textnotations.instructionset.util.InstructionsetPair<hu.modembed.model.textnotations.instructionset.IInstructionsetExpectedElement, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[]> newFollowerPair : newFollowers) {
    							hu.modembed.model.textnotations.instructionset.IInstructionsetExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainmentTrace containmentTrace = new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetContainmentTrace(null, newFollowerPair.getRight());
    							hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal newFollowTerminal = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal(container, newFollower, followSetID, containmentTrace);
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
    			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
    			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	private void startIncompleteElement(Object object) {
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
    		}
    	}
    	
    	private void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			boolean exists = this.incompleteObjects.remove(object);
    			if (!exists) {
    			}
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
    		if (incompleteObjects.isEmpty()) {
    			return null;
    		}
    		return incompleteObjects.get(incompleteObjects.size() - 1);
    	}
    	



    // $ANTLR start "start"
    // Instructionset.g:514:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_hu_modembed_model_modembed_core_instructionset_InstructionSet ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        hu.modembed.model.modembed.core.instructionset.InstructionSet c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Instructionset.g:515:2: ( (c0= parse_hu_modembed_model_modembed_core_instructionset_InstructionSet ) EOF )
            // Instructionset.g:516:2: (c0= parse_hu_modembed_model_modembed_core_instructionset_InstructionSet ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Instructionset.g:521:2: (c0= parse_hu_modembed_model_modembed_core_instructionset_InstructionSet )
            // Instructionset.g:522:3: c0= parse_hu_modembed_model_modembed_core_instructionset_InstructionSet
            {
            pushFollow(FOLLOW_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet_in_start82);
            c0=parse_hu_modembed_model_modembed_core_instructionset_InstructionSet();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

            }


            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_hu_modembed_model_modembed_core_instructionset_InstructionSet"
    // Instructionset.g:530:1: parse_hu_modembed_model_modembed_core_instructionset_InstructionSet returns [hu.modembed.model.modembed.core.instructionset.InstructionSet element = null] : a0= 'instructionset' (a1= QUALIFIEDID ) a2= ';' ( (a3= 'extends' (a4= QUALIFIEDID ) ) )? ( ( (a5_0= parse_hu_modembed_model_modembed_core_instructionset_Instruction ) ) )* ;
    public final hu.modembed.model.modembed.core.instructionset.InstructionSet parse_hu_modembed_model_modembed_core_instructionset_InstructionSet() throws RecognitionException {
        hu.modembed.model.modembed.core.instructionset.InstructionSet element =  null;

        int parse_hu_modembed_model_modembed_core_instructionset_InstructionSet_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        hu.modembed.model.modembed.core.instructionset.Instruction a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Instructionset.g:533:2: (a0= 'instructionset' (a1= QUALIFIEDID ) a2= ';' ( (a3= 'extends' (a4= QUALIFIEDID ) ) )? ( ( (a5_0= parse_hu_modembed_model_modembed_core_instructionset_Instruction ) ) )* )
            // Instructionset.g:534:2: a0= 'instructionset' (a1= QUALIFIEDID ) a2= ';' ( (a3= 'extends' (a4= QUALIFIEDID ) ) )? ( ( (a5_0= parse_hu_modembed_model_modembed_core_instructionset_Instruction ) ) )*
            {
            a0=(Token)match(input,17,FOLLOW_17_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionSet();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_0_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[1]);
            	}

            // Instructionset.g:548:2: (a1= QUALIFIEDID )
            // Instructionset.g:549:3: a1= QUALIFIEDID
            {
            a1=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet133); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionSet();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_0_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[2]);
            	}

            a2=(Token)match(input,13,FOLLOW_13_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet154); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionSet();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_0_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[3]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[4]);
            	}

            // Instructionset.g:599:2: ( (a3= 'extends' (a4= QUALIFIEDID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Instructionset.g:600:3: (a3= 'extends' (a4= QUALIFIEDID ) )
                    {
                    // Instructionset.g:600:3: (a3= 'extends' (a4= QUALIFIEDID ) )
                    // Instructionset.g:601:4: a3= 'extends' (a4= QUALIFIEDID )
                    {
                    a3=(Token)match(input,16,FOLLOW_16_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet177); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionSet();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_0_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[5]);
                    			}

                    // Instructionset.g:615:4: (a4= QUALIFIEDID )
                    // Instructionset.g:616:5: a4= QUALIFIEDID
                    {
                    a4=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet203); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionSet();
                    						startIncompleteElement(element);
                    					}
                    					if (a4 != null) {
                    						hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
                    						tokenResolver.setOptions(getOptions());
                    						hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__EXTEND), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
                    						}
                    						String resolved = (String) resolvedObject;
                    						hu.modembed.model.modembed.core.instructionset.InstructionSet proxy = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionSet();
                    						collectHiddenTokens(element);
                    						registerContextDependentProxy(new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContextDependentURIFragmentFactory<hu.modembed.model.modembed.core.instructionset.InstructionSet, hu.modembed.model.modembed.core.instructionset.InstructionSet>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstructionSetExtendReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__EXTEND), resolved, proxy);
                    						if (proxy != null) {
                    							Object value = proxy;
                    							element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__EXTEND), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_0_0_0_3_0_0_1, proxy, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, proxy);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[6]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[7]);
            	}

            // Instructionset.g:662:2: ( ( (a5_0= parse_hu_modembed_model_modembed_core_instructionset_Instruction ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TEXT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Instructionset.g:663:3: ( (a5_0= parse_hu_modembed_model_modembed_core_instructionset_Instruction ) )
            	    {
            	    // Instructionset.g:663:3: ( (a5_0= parse_hu_modembed_model_modembed_core_instructionset_Instruction ) )
            	    // Instructionset.g:664:4: (a5_0= parse_hu_modembed_model_modembed_core_instructionset_Instruction )
            	    {
            	    // Instructionset.g:664:4: (a5_0= parse_hu_modembed_model_modembed_core_instructionset_Instruction )
            	    // Instructionset.g:665:5: a5_0= parse_hu_modembed_model_modembed_core_instructionset_Instruction
            	    {
            	    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_core_instructionset_Instruction_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet264);
            	    a5_0=parse_hu_modembed_model_modembed_core_instructionset_Instruction();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionSet();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a5_0 != null) {
            	    						if (a5_0 != null) {
            	    							Object value = a5_0;
            	    							addObjectToList(element, hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__INSTRUCTIONS, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_0_0_0_4_0_0_0, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[8]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[9]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_hu_modembed_model_modembed_core_instructionset_InstructionSet_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_core_instructionset_InstructionSet"



    // $ANTLR start "parse_hu_modembed_model_modembed_core_instructionset_Instruction"
    // Instructionset.g:699:1: parse_hu_modembed_model_modembed_core_instructionset_Instruction returns [hu.modembed.model.modembed.core.instructionset.Instruction element = null] : (a0= TEXT ) ( ( (a1_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter ) ) )* ( ( (a2_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionWord ) ) )* ;
    public final hu.modembed.model.modembed.core.instructionset.Instruction parse_hu_modembed_model_modembed_core_instructionset_Instruction() throws RecognitionException {
        hu.modembed.model.modembed.core.instructionset.Instruction element =  null;

        int parse_hu_modembed_model_modembed_core_instructionset_Instruction_StartIndex = input.index();

        Token a0=null;
        hu.modembed.model.modembed.core.instructionset.InstructionParameter a1_0 =null;

        hu.modembed.model.modembed.core.instructionset.InstructionWord a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Instructionset.g:702:2: ( (a0= TEXT ) ( ( (a1_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter ) ) )* ( ( (a2_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionWord ) ) )* )
            // Instructionset.g:703:2: (a0= TEXT ) ( ( (a1_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter ) ) )* ( ( (a2_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionWord ) ) )*
            {
            // Instructionset.g:703:2: (a0= TEXT )
            // Instructionset.g:704:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_hu_modembed_model_modembed_core_instructionset_Instruction324); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstruction();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_1_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[10]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[11]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[12]);
            	}

            // Instructionset.g:741:2: ( ( (a1_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDENTIFIER) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Instructionset.g:742:3: ( (a1_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter ) )
            	    {
            	    // Instructionset.g:742:3: ( (a1_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter ) )
            	    // Instructionset.g:743:4: (a1_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter )
            	    {
            	    // Instructionset.g:743:4: (a1_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter )
            	    // Instructionset.g:744:5: a1_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter
            	    {
            	    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter_in_parse_hu_modembed_model_modembed_core_instructionset_Instruction360);
            	    a1_0=parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstruction();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a1_0 != null) {
            	    						if (a1_0 != null) {
            	    							Object value = a1_0;
            	    							addObjectToList(element, hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__PARAMETERS, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_1_0_0_1_0_0_0, a1_0, true);
            	    						copyLocalizationInfos(a1_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[13]);
            	    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[14]);
            	    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[15]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[16]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[17]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[18]);
            	}

            // Instructionset.g:780:2: ( ( (a2_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionWord ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Instructionset.g:781:3: ( (a2_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionWord ) )
            	    {
            	    // Instructionset.g:781:3: ( (a2_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionWord ) )
            	    // Instructionset.g:782:4: (a2_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionWord )
            	    {
            	    // Instructionset.g:782:4: (a2_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionWord )
            	    // Instructionset.g:783:5: a2_0= parse_hu_modembed_model_modembed_core_instructionset_InstructionWord
            	    {
            	    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_core_instructionset_InstructionWord_in_parse_hu_modembed_model_modembed_core_instructionset_Instruction416);
            	    a2_0=parse_hu_modembed_model_modembed_core_instructionset_InstructionWord();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstruction();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a2_0 != null) {
            	    						if (a2_0 != null) {
            	    							Object value = a2_0;
            	    							addObjectToList(element, hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__WORDS, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_1_0_0_2_0_0_0, a2_0, true);
            	    						copyLocalizationInfos(a2_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[19]);
            	    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[20]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[21]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[22]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_hu_modembed_model_modembed_core_instructionset_Instruction_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_core_instructionset_Instruction"



    // $ANTLR start "parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter"
    // Instructionset.g:819:1: parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter returns [hu.modembed.model.modembed.core.instructionset.InstructionParameter element = null] : (a0= IDENTIFIER ) ( ( (a1= INT ) ) )? ;
    public final hu.modembed.model.modembed.core.instructionset.InstructionParameter parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter() throws RecognitionException {
        hu.modembed.model.modembed.core.instructionset.InstructionParameter element =  null;

        int parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Instructionset.g:822:2: ( (a0= IDENTIFIER ) ( ( (a1= INT ) ) )? )
            // Instructionset.g:823:2: (a0= IDENTIFIER ) ( ( (a1= INT ) ) )?
            {
            // Instructionset.g:823:2: (a0= IDENTIFIER )
            // Instructionset.g:824:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter476); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionParameter();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__ID), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.Character resolved = (java.lang.Character) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__ID), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_2_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[23]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[24]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[25]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[26]);
            	}

            // Instructionset.g:862:2: ( ( (a1= INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Instructionset.g:863:3: ( (a1= INT ) )
                    {
                    // Instructionset.g:863:3: ( (a1= INT ) )
                    // Instructionset.g:864:4: (a1= INT )
                    {
                    // Instructionset.g:864:4: (a1= INT )
                    // Instructionset.g:865:5: a1= INT
                    {
                    a1=(Token)match(input,INT,FOLLOW_INT_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter512); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionParameter();
                    						startIncompleteElement(element);
                    					}
                    					if (a1 != null) {
                    						hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT");
                    						tokenResolver.setOptions(getOptions());
                    						hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__DEFAULT_VALUE), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
                    						}
                    						java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__DEFAULT_VALUE), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_2_0_0_1_0_0_0, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[27]);
                    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[28]);
                    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[29]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[30]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[31]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[32]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter"



    // $ANTLR start "parse_hu_modembed_model_modembed_core_instructionset_InstructionWord"
    // Instructionset.g:913:1: parse_hu_modembed_model_modembed_core_instructionset_InstructionWord returns [hu.modembed.model.modembed.core.instructionset.InstructionWord element = null] : a0= '<' ( ( (a1_0= parse_hu_modembed_model_modembed_core_instructionset_ConstantSection |a1_1= parse_hu_modembed_model_modembed_core_instructionset_ParameterSection ) ) )* a2= '>' ;
    public final hu.modembed.model.modembed.core.instructionset.InstructionWord parse_hu_modembed_model_modembed_core_instructionset_InstructionWord() throws RecognitionException {
        hu.modembed.model.modembed.core.instructionset.InstructionWord element =  null;

        int parse_hu_modembed_model_modembed_core_instructionset_InstructionWord_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        hu.modembed.model.modembed.core.instructionset.ConstantSection a1_0 =null;

        hu.modembed.model.modembed.core.instructionset.ParameterSection a1_1 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Instructionset.g:916:2: (a0= '<' ( ( (a1_0= parse_hu_modembed_model_modembed_core_instructionset_ConstantSection |a1_1= parse_hu_modembed_model_modembed_core_instructionset_ParameterSection ) ) )* a2= '>' )
            // Instructionset.g:917:2: a0= '<' ( ( (a1_0= parse_hu_modembed_model_modembed_core_instructionset_ConstantSection |a1_1= parse_hu_modembed_model_modembed_core_instructionset_ParameterSection ) ) )* a2= '>'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionWord573); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionWord();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_3_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[33]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[34]);
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[35]);
            	}

            // Instructionset.g:933:2: ( ( (a1_0= parse_hu_modembed_model_modembed_core_instructionset_ConstantSection |a1_1= parse_hu_modembed_model_modembed_core_instructionset_ParameterSection ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BINARY||LA7_0==IDENTIFIER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Instructionset.g:934:3: ( (a1_0= parse_hu_modembed_model_modembed_core_instructionset_ConstantSection |a1_1= parse_hu_modembed_model_modembed_core_instructionset_ParameterSection ) )
            	    {
            	    // Instructionset.g:934:3: ( (a1_0= parse_hu_modembed_model_modembed_core_instructionset_ConstantSection |a1_1= parse_hu_modembed_model_modembed_core_instructionset_ParameterSection ) )
            	    // Instructionset.g:935:4: (a1_0= parse_hu_modembed_model_modembed_core_instructionset_ConstantSection |a1_1= parse_hu_modembed_model_modembed_core_instructionset_ParameterSection )
            	    {
            	    // Instructionset.g:935:4: (a1_0= parse_hu_modembed_model_modembed_core_instructionset_ConstantSection |a1_1= parse_hu_modembed_model_modembed_core_instructionset_ParameterSection )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==BINARY) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==IDENTIFIER) ) {
            	        alt6=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // Instructionset.g:936:5: a1_0= parse_hu_modembed_model_modembed_core_instructionset_ConstantSection
            	            {
            	            pushFollow(FOLLOW_parse_hu_modembed_model_modembed_core_instructionset_ConstantSection_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionWord602);
            	            a1_0=parse_hu_modembed_model_modembed_core_instructionset_ConstantSection();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (terminateParsing) {
            	            						throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
            	            					}
            	            					if (element == null) {
            	            						element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionWord();
            	            						startIncompleteElement(element);
            	            					}
            	            					if (a1_0 != null) {
            	            						if (a1_0 != null) {
            	            							Object value = a1_0;
            	            							addObjectToList(element, hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_WORD__SECTIONS, value);
            	            							completedElement(value, true);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_3_0_0_1_0_0_0, a1_0, true);
            	            						copyLocalizationInfos(a1_0, element);
            	            					}
            	            				}

            	            }
            	            break;
            	        case 2 :
            	            // Instructionset.g:955:10: a1_1= parse_hu_modembed_model_modembed_core_instructionset_ParameterSection
            	            {
            	            pushFollow(FOLLOW_parse_hu_modembed_model_modembed_core_instructionset_ParameterSection_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionWord622);
            	            a1_1=parse_hu_modembed_model_modembed_core_instructionset_ParameterSection();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (terminateParsing) {
            	            						throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
            	            					}
            	            					if (element == null) {
            	            						element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionWord();
            	            						startIncompleteElement(element);
            	            					}
            	            					if (a1_1 != null) {
            	            						if (a1_1 != null) {
            	            							Object value = a1_1;
            	            							addObjectToList(element, hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_WORD__SECTIONS, value);
            	            							completedElement(value, true);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_3_0_0_1_0_0_0, a1_1, true);
            	            						copyLocalizationInfos(a1_1, element);
            	            					}
            	            				}

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[36]);
            	    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[37]);
            	    				addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[38]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[39]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[40]);
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[41]);
            	}

            a2=(Token)match(input,15,FOLLOW_15_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionWord663); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionWord();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_3_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstruction(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[42]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[43]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_hu_modembed_model_modembed_core_instructionset_InstructionWord_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_core_instructionset_InstructionWord"



    // $ANTLR start "parse_hu_modembed_model_modembed_core_instructionset_ConstantSection"
    // Instructionset.g:1008:1: parse_hu_modembed_model_modembed_core_instructionset_ConstantSection returns [hu.modembed.model.modembed.core.instructionset.ConstantSection element = null] : (a0= BINARY ) a1= ':' (a2= BINARY ) ( (a3= ':' (a4= BINARY ) ) )? ;
    public final hu.modembed.model.modembed.core.instructionset.ConstantSection parse_hu_modembed_model_modembed_core_instructionset_ConstantSection() throws RecognitionException {
        hu.modembed.model.modembed.core.instructionset.ConstantSection element =  null;

        int parse_hu_modembed_model_modembed_core_instructionset_ConstantSection_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Instructionset.g:1011:2: ( (a0= BINARY ) a1= ':' (a2= BINARY ) ( (a3= ':' (a4= BINARY ) ) )? )
            // Instructionset.g:1012:2: (a0= BINARY ) a1= ':' (a2= BINARY ) ( (a3= ':' (a4= BINARY ) ) )?
            {
            // Instructionset.g:1012:2: (a0= BINARY )
            // Instructionset.g:1013:3: a0= BINARY
            {
            a0=(Token)match(input,BINARY,FOLLOW_BINARY_in_parse_hu_modembed_model_modembed_core_instructionset_ConstantSection696); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createConstantSection();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BINARY");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_4_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[44]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_hu_modembed_model_modembed_core_instructionset_ConstantSection717); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createConstantSection();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_4_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[45]);
            	}

            // Instructionset.g:1062:2: (a2= BINARY )
            // Instructionset.g:1063:3: a2= BINARY
            {
            a2=(Token)match(input,BINARY,FOLLOW_BINARY_in_parse_hu_modembed_model_modembed_core_instructionset_ConstantSection735); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createConstantSection();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BINARY");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__SIZE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__SIZE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_4_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[46]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[47]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[48]);
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[49]);
            	}

            // Instructionset.g:1101:2: ( (a3= ':' (a4= BINARY ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Instructionset.g:1102:3: (a3= ':' (a4= BINARY ) )
                    {
                    // Instructionset.g:1102:3: (a3= ':' (a4= BINARY ) )
                    // Instructionset.g:1103:4: a3= ':' (a4= BINARY )
                    {
                    a3=(Token)match(input,12,FOLLOW_12_in_parse_hu_modembed_model_modembed_core_instructionset_ConstantSection765); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createConstantSection();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_4_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[50]);
                    			}

                    // Instructionset.g:1117:4: (a4= BINARY )
                    // Instructionset.g:1118:5: a4= BINARY
                    {
                    a4=(Token)match(input,BINARY,FOLLOW_BINARY_in_parse_hu_modembed_model_modembed_core_instructionset_ConstantSection791); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createConstantSection();
                    						startIncompleteElement(element);
                    					}
                    					if (a4 != null) {
                    						hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BINARY");
                    						tokenResolver.setOptions(getOptions());
                    						hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__SHIFT), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
                    						}
                    						java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__SHIFT), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_4_0_0_3_0_0_1, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[51]);
                    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[52]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[53]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[54]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[55]);
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[56]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_hu_modembed_model_modembed_core_instructionset_ConstantSection_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_core_instructionset_ConstantSection"



    // $ANTLR start "parse_hu_modembed_model_modembed_core_instructionset_ParameterSection"
    // Instructionset.g:1166:1: parse_hu_modembed_model_modembed_core_instructionset_ParameterSection returns [hu.modembed.model.modembed.core.instructionset.ParameterSection element = null] : (a0= IDENTIFIER ) a1= ':' (a2= BINARY ) ( (a3= ':' (a4= BINARY ) ) )? ;
    public final hu.modembed.model.modembed.core.instructionset.ParameterSection parse_hu_modembed_model_modembed_core_instructionset_ParameterSection() throws RecognitionException {
        hu.modembed.model.modembed.core.instructionset.ParameterSection element =  null;

        int parse_hu_modembed_model_modembed_core_instructionset_ParameterSection_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Instructionset.g:1169:2: ( (a0= IDENTIFIER ) a1= ':' (a2= BINARY ) ( (a3= ':' (a4= BINARY ) ) )? )
            // Instructionset.g:1170:2: (a0= IDENTIFIER ) a1= ':' (a2= BINARY ) ( (a3= ':' (a4= BINARY ) ) )?
            {
            // Instructionset.g:1170:2: (a0= IDENTIFIER )
            // Instructionset.g:1171:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_hu_modembed_model_modembed_core_instructionset_ParameterSection856); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createParameterSection();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__PARAMETER), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				hu.modembed.model.modembed.core.instructionset.InstructionParameter proxy = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionParameter();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContextDependentURIFragmentFactory<hu.modembed.model.modembed.core.instructionset.ParameterSection, hu.modembed.model.modembed.core.instructionset.InstructionParameter>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getParameterSectionParameterReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__PARAMETER), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__PARAMETER), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_5_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[57]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_hu_modembed_model_modembed_core_instructionset_ParameterSection877); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createParameterSection();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_5_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[58]);
            	}

            // Instructionset.g:1224:2: (a2= BINARY )
            // Instructionset.g:1225:3: a2= BINARY
            {
            a2=(Token)match(input,BINARY,FOLLOW_BINARY_in_parse_hu_modembed_model_modembed_core_instructionset_ParameterSection895); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createParameterSection();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BINARY");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__SIZE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__SIZE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_5_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[59]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[60]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[61]);
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[62]);
            	}

            // Instructionset.g:1263:2: ( (a3= ':' (a4= BINARY ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Instructionset.g:1264:3: (a3= ':' (a4= BINARY ) )
                    {
                    // Instructionset.g:1264:3: (a3= ':' (a4= BINARY ) )
                    // Instructionset.g:1265:4: a3= ':' (a4= BINARY )
                    {
                    a3=(Token)match(input,12,FOLLOW_12_in_parse_hu_modembed_model_modembed_core_instructionset_ParameterSection925); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createParameterSection();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_5_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[63]);
                    			}

                    // Instructionset.g:1279:4: (a4= BINARY )
                    // Instructionset.g:1280:5: a4= BINARY
                    {
                    a4=(Token)match(input,BINARY,FOLLOW_BINARY_in_parse_hu_modembed_model_modembed_core_instructionset_ParameterSection951); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createParameterSection();
                    						startIncompleteElement(element);
                    					}
                    					if (a4 != null) {
                    						hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BINARY");
                    						tokenResolver.setOptions(getOptions());
                    						hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__SHIFT), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
                    						}
                    						java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__SHIFT), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetGrammarInformationProvider.INSTRUCTIONSET_5_0_0_3_0_0_1, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[64]);
                    				addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[65]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[66]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[67]);
            		addExpectedElement(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionWord(), hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[68]);
            		addExpectedElement(null, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetExpectationConstants.EXPECTATIONS[69]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_hu_modembed_model_modembed_core_instructionset_ParameterSection_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_core_instructionset_ParameterSection"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet115 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet133 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet154 = new BitSet(new long[]{0x0000000000010402L});
    public static final BitSet FOLLOW_16_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet177 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet203 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_core_instructionset_Instruction_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionSet264 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_TEXT_in_parse_hu_modembed_model_modembed_core_instructionset_Instruction324 = new BitSet(new long[]{0x0000000000004042L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter_in_parse_hu_modembed_model_modembed_core_instructionset_Instruction360 = new BitSet(new long[]{0x0000000000004042L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_core_instructionset_InstructionWord_in_parse_hu_modembed_model_modembed_core_instructionset_Instruction416 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter476 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_INT_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionParameter512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionWord573 = new BitSet(new long[]{0x0000000000008050L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_core_instructionset_ConstantSection_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionWord602 = new BitSet(new long[]{0x0000000000008050L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_core_instructionset_ParameterSection_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionWord622 = new BitSet(new long[]{0x0000000000008050L});
    public static final BitSet FOLLOW_15_in_parse_hu_modembed_model_modembed_core_instructionset_InstructionWord663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_parse_hu_modembed_model_modembed_core_instructionset_ConstantSection696 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_hu_modembed_model_modembed_core_instructionset_ConstantSection717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BINARY_in_parse_hu_modembed_model_modembed_core_instructionset_ConstantSection735 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_parse_hu_modembed_model_modembed_core_instructionset_ConstantSection765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BINARY_in_parse_hu_modembed_model_modembed_core_instructionset_ConstantSection791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_hu_modembed_model_modembed_core_instructionset_ParameterSection856 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_hu_modembed_model_modembed_core_instructionset_ParameterSection877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BINARY_in_parse_hu_modembed_model_modembed_core_instructionset_ParameterSection895 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_parse_hu_modembed_model_modembed_core_instructionset_ParameterSection925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BINARY_in_parse_hu_modembed_model_modembed_core_instructionset_ParameterSection951 = new BitSet(new long[]{0x0000000000000002L});

}