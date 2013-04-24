// $ANTLR 3.4

	package hu.modembed.model.textnotations.type.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TypeParser extends TypeANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BINARY", "INT", "ML_COMMENT", "QUALIFIEDID", "SL_COMMENT", "WHITESPACE", "'('", "')'", "';'", "'='", "'type'", "'unsigned'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int BINARY=4;
    public static final int INT=5;
    public static final int ML_COMMENT=6;
    public static final int QUALIFIEDID=7;
    public static final int SL_COMMENT=8;
    public static final int WHITESPACE=9;

    // delegates
    public TypeANTLRParserBase[] getDelegates() {
        return new TypeANTLRParserBase[] {};
    }

    // delegators


    public TypeParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TypeParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(6 + 1);
         

    }

    public String[] getTokenNames() { return TypeParser.tokenNames; }
    public String getGrammarFileName() { return "Type.g"; }


    	private hu.modembed.model.textnotations.type.ITypeTokenResolverFactory tokenResolverFactory = new hu.modembed.model.textnotations.type.mopp.TypeTokenResolverFactory();
    	
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
    	private java.util.List<hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal> expectedElements = new java.util.ArrayList<hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionPositions = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
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
    	
    	private hu.modembed.model.textnotations.type.ITypeLocationMap locationMap;
    	
    	private hu.modembed.model.textnotations.type.mopp.TypeSyntaxErrorMessageConverter syntaxErrorMessageConverter = new hu.modembed.model.textnotations.type.mopp.TypeSyntaxErrorMessageConverter(tokenNames);
    	
    	@Override	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException re) {
    		addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
    	}
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new hu.modembed.model.textnotations.type.ITypeCommand<hu.modembed.model.textnotations.type.ITypeTextResource>() {
    			public boolean execute(hu.modembed.model.textnotations.type.ITypeTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new hu.modembed.model.textnotations.type.ITypeProblem() {
    					public hu.modembed.model.textnotations.type.TypeEProblemSeverity getSeverity() {
    						return hu.modembed.model.textnotations.type.TypeEProblemSeverity.ERROR;
    					}
    					public hu.modembed.model.textnotations.type.TypeEProblemType getType() {
    						return hu.modembed.model.textnotations.type.TypeEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<hu.modembed.model.textnotations.type.ITypeQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	protected void addErrorToResource(hu.modembed.model.textnotations.type.mopp.TypeLocalizedMessage message) {
    		if (message == null) {
    			return;
    		}
    		addErrorToResource(message.getMessage(), message.getColumn(), message.getLine(), message.getCharStart(), message.getCharEnd());
    	}
    	
    	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		int terminalID = ids[0];
    		int followSetID = ids[1];
    		hu.modembed.model.textnotations.type.ITypeExpectedElement terminal = hu.modembed.model.textnotations.type.grammar.TypeFollowSetProvider.TERMINALS[terminalID];
    		hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[] containmentFeatures = new hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = hu.modembed.model.textnotations.type.grammar.TypeFollowSetProvider.LINKS[ids[i]];
    		}
    		hu.modembed.model.textnotations.type.grammar.TypeContainmentTrace containmentTrace = new hu.modembed.model.textnotations.type.grammar.TypeContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal expectedElement = new hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal(container, terminal, followSetID, containmentTrace);
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
    		final hu.modembed.model.textnotations.type.ITypeLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new hu.modembed.model.textnotations.type.ITypeCommand<hu.modembed.model.textnotations.type.ITypeTextResource>() {
    			public boolean execute(hu.modembed.model.textnotations.type.ITypeTextResource resource) {
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
    		final hu.modembed.model.textnotations.type.ITypeLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new hu.modembed.model.textnotations.type.ITypeCommand<hu.modembed.model.textnotations.type.ITypeTextResource>() {
    			public boolean execute(hu.modembed.model.textnotations.type.ITypeTextResource resource) {
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
    	protected void setLocalizationEnd(java.util.Collection<hu.modembed.model.textnotations.type.ITypeCommand<hu.modembed.model.textnotations.type.ITypeTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		final hu.modembed.model.textnotations.type.ITypeLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new hu.modembed.model.textnotations.type.ITypeCommand<hu.modembed.model.textnotations.type.ITypeTextResource>() {
    			public boolean execute(hu.modembed.model.textnotations.type.ITypeTextResource resource) {
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public hu.modembed.model.textnotations.type.ITypeTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new TypeParser(new org.antlr.runtime3_4_0.CommonTokenStream(new TypeLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new TypeParser(new org.antlr.runtime3_4_0.CommonTokenStream(new TypeLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new hu.modembed.model.textnotations.type.util.TypeRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public TypeParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((TypeLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((TypeLexer) getTokenStream().getTokenSource()).lexerExceptionPositions = lexerExceptionPositions;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == hu.modembed.model.modembed.abstraction.types.Type.class) {
    				return parse_hu_modembed_model_modembed_abstraction_types_Type();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition.class) {
    				return parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition.class) {
    				return parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition();
    			}
    		}
    		throw new hu.modembed.model.textnotations.type.mopp.TypeUnexpectedContentTypeException(typeObject);
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
    			typeObject = options.get(hu.modembed.model.textnotations.type.ITypeOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public hu.modembed.model.textnotations.type.ITypeParseResult parse() {
    		// Reset parser state
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<hu.modembed.model.textnotations.type.ITypeCommand<hu.modembed.model.textnotations.type.ITypeTextResource>>();
    		hu.modembed.model.textnotations.type.mopp.TypeParseResult parseResult = new hu.modembed.model.textnotations.type.mopp.TypeParseResult();
    		if (disableLocationMap) {
    			locationMap = new hu.modembed.model.textnotations.type.mopp.TypeDevNullLocationMap();
    		} else {
    			locationMap = new hu.modembed.model.textnotations.type.mopp.TypeLocationMap();
    		}
    		// Run parser
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    				parseResult.setLocationMap(locationMap);
    			}
    		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
    			addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
    			addErrorToResource(syntaxErrorMessageConverter.translateLexicalError(re, lexerExceptions, lexerExceptionPositions));
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, hu.modembed.model.textnotations.type.ITypeTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		hu.modembed.model.textnotations.type.ITypeParseResult result = parse();
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
    			for (hu.modembed.model.textnotations.type.ITypeCommand<hu.modembed.model.textnotations.type.ITypeTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal>();
    		java.util.List<hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal> newFollowSet = new java.util.ArrayList<hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 11;
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
    				for (hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<hu.modembed.model.textnotations.type.util.TypePair<hu.modembed.model.textnotations.type.ITypeExpectedElement, hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (hu.modembed.model.textnotations.type.util.TypePair<hu.modembed.model.textnotations.type.ITypeExpectedElement, hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[]> newFollowerPair : newFollowers) {
    							hu.modembed.model.textnotations.type.ITypeExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							hu.modembed.model.textnotations.type.grammar.TypeContainmentTrace containmentTrace = new hu.modembed.model.textnotations.type.grammar.TypeContainmentTrace(null, newFollowerPair.getRight());
    							hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal newFollowTerminal = new hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal(container, newFollower, followSetID, containmentTrace);
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
    		for (hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(hu.modembed.model.textnotations.type.mopp.TypeExpectedTerminal expectedElement, int tokenIndex) {
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
    // Type.g:462:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_hu_modembed_model_modembed_abstraction_types_Type ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        hu.modembed.model.modembed.abstraction.types.Type c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Type.g:463:2: ( (c0= parse_hu_modembed_model_modembed_abstraction_types_Type ) EOF )
            // Type.g:464:2: (c0= parse_hu_modembed_model_modembed_abstraction_types_Type ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, hu.modembed.model.textnotations.type.mopp.TypeExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Type.g:469:2: (c0= parse_hu_modembed_model_modembed_abstraction_types_Type )
            // Type.g:470:3: c0= parse_hu_modembed_model_modembed_abstraction_types_Type
            {
            pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_Type_in_start82);
            c0=parse_hu_modembed_model_modembed_abstraction_types_Type();

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



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_types_Type"
    // Type.g:478:1: parse_hu_modembed_model_modembed_abstraction_types_Type returns [hu.modembed.model.modembed.abstraction.types.Type element = null] : a0= 'type' (a1= QUALIFIEDID ) a2= '=' (a3_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition ) a4= ';' ;
    public final hu.modembed.model.modembed.abstraction.types.Type parse_hu_modembed_model_modembed_abstraction_types_Type() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.types.Type element =  null;

        int parse_hu_modembed_model_modembed_abstraction_types_Type_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        hu.modembed.model.modembed.abstraction.types.TypeDefinition a3_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Type.g:481:2: (a0= 'type' (a1= QUALIFIEDID ) a2= '=' (a3_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition ) a4= ';' )
            // Type.g:482:2: a0= 'type' (a1= QUALIFIEDID ) a2= '=' (a3_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition ) a4= ';'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_hu_modembed_model_modembed_abstraction_types_Type115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_0_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.type.mopp.TypeExpectationConstants.EXPECTATIONS[1]);
            	}

            // Type.g:496:2: (a1= QUALIFIEDID )
            // Type.g:497:3: a1= QUALIFIEDID
            {
            a1=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_types_Type133); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.type.mopp.TypeTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				hu.modembed.model.textnotations.type.ITypeTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.type.ITypeTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_0_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.type.mopp.TypeExpectationConstants.EXPECTATIONS[2]);
            	}

            a2=(Token)match(input,13,FOLLOW_13_in_parse_hu_modembed_model_modembed_abstraction_types_Type154); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_0_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType(), hu.modembed.model.textnotations.type.mopp.TypeExpectationConstants.EXPECTATIONS[3]);
            		addExpectedElement(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType(), hu.modembed.model.textnotations.type.mopp.TypeExpectationConstants.EXPECTATIONS[4]);
            	}

            // Type.g:547:2: (a3_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition )
            // Type.g:548:3: a3_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition
            {
            pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_types_Type172);
            a3_0=parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.type.mopp.TypeTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
            				startIncompleteElement(element);
            			}
            			if (a3_0 != null) {
            				if (a3_0 != null) {
            					Object value = a3_0;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__DEFINITION), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_0_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.type.mopp.TypeExpectationConstants.EXPECTATIONS[5]);
            	}

            a4=(Token)match(input,12,FOLLOW_12_in_parse_hu_modembed_model_modembed_abstraction_types_Type190); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_0_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_hu_modembed_model_modembed_abstraction_types_Type_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_types_Type"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition"
    // Type.g:588:1: parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition returns [hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition element = null] : a0= 'unsigned' a1= '(' (a2= INT ) a3= ')' ;
    public final hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition element =  null;

        int parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Type.g:591:2: (a0= 'unsigned' a1= '(' (a2= INT ) a3= ')' )
            // Type.g:592:2: a0= 'unsigned' a1= '(' (a2= INT ) a3= ')'
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition219); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_1_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.type.mopp.TypeExpectationConstants.EXPECTATIONS[6]);
            	}

            a1=(Token)match(input,10,FOLLOW_10_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition233); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_1_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.type.mopp.TypeExpectationConstants.EXPECTATIONS[7]);
            	}

            // Type.g:620:2: (a2= INT )
            // Type.g:621:3: a2= INT
            {
            a2=(Token)match(input,INT,FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition251); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.type.mopp.TypeTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				hu.modembed.model.textnotations.type.ITypeTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.type.ITypeTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.UNSIGNED_TYPE_DEFINITION__BITS), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.UNSIGNED_TYPE_DEFINITION__BITS), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_1_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.type.mopp.TypeExpectationConstants.EXPECTATIONS[8]);
            	}

            a3=(Token)match(input,11,FOLLOW_11_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition272); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_1_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.type.mopp.TypeExpectationConstants.EXPECTATIONS[9]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition"
    // Type.g:672:1: parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition returns [hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition element = null] : (a0= QUALIFIEDID ) ;
    public final hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition element =  null;

        int parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Type.g:675:2: ( (a0= QUALIFIEDID ) )
            // Type.g:676:2: (a0= QUALIFIEDID )
            {
            // Type.g:676:2: (a0= QUALIFIEDID )
            // Type.g:677:3: a0= QUALIFIEDID
            {
            a0=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition305); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.type.mopp.TypeTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createReferenceTypeDefinition();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				hu.modembed.model.textnotations.type.ITypeTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.type.ITypeTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				hu.modembed.model.modembed.abstraction.types.Type proxy = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new hu.modembed.model.textnotations.type.mopp.TypeContextDependentURIFragmentFactory<hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition, hu.modembed.model.modembed.abstraction.types.Type>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferenceTypeDefinitionTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.type.grammar.TypeGrammarInformationProvider.TYPE_2_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.type.mopp.TypeExpectationConstants.EXPECTATIONS[10]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition"
    // Type.g:718:1: parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition returns [hu.modembed.model.modembed.abstraction.types.TypeDefinition element = null] : (c0= parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition |c1= parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition );
    public final hu.modembed.model.modembed.abstraction.types.TypeDefinition parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.types.TypeDefinition element =  null;

        int parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition_StartIndex = input.index();

        hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition c0 =null;

        hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Type.g:719:2: (c0= parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition |c1= parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==QUALIFIEDID) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Type.g:720:2: c0= parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition
                    {
                    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition337);
                    c0=parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Type.g:721:4: c1= parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition
                    {
                    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition347);
                    c1=parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_Type_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_hu_modembed_model_modembed_abstraction_types_Type115 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_types_Type133 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_hu_modembed_model_modembed_abstraction_types_Type154 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_types_Type172 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_hu_modembed_model_modembed_abstraction_types_Type190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition219 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition251 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition347 = new BitSet(new long[]{0x0000000000000002L});

}