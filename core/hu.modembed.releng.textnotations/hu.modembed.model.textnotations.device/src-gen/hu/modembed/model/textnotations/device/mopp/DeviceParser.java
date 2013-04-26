// $ANTLR 3.4

	package hu.modembed.model.textnotations.device.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DeviceParser extends DeviceANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BINARY", "INT", "ML_COMMENT", "QUALIFIEDID", "SL_COMMENT", "WHITESPACE", "'('", "')'", "'+'", "','", "'->'", "':'", "';'", "'='", "'@'", "'['", "']'", "'data'", "'device'", "'extends'", "'instructionset'", "'minstance'", "'mtype'", "'operation'", "'program'", "'type'", "'unsigned'", "'volatile'", "'{'", "'|'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int BINARY=4;
    public static final int INT=5;
    public static final int ML_COMMENT=6;
    public static final int QUALIFIEDID=7;
    public static final int SL_COMMENT=8;
    public static final int WHITESPACE=9;

    // delegates
    public DeviceANTLRParserBase[] getDelegates() {
        return new DeviceANTLRParserBase[] {};
    }

    // delegators


    public DeviceParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public DeviceParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(38 + 1);
         

    }

    public String[] getTokenNames() { return DeviceParser.tokenNames; }
    public String getGrammarFileName() { return "Device.g"; }


    	private hu.modembed.model.textnotations.device.IDeviceTokenResolverFactory tokenResolverFactory = new hu.modembed.model.textnotations.device.mopp.DeviceTokenResolverFactory();
    	
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
    	private java.util.List<hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal> expectedElements = new java.util.ArrayList<hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal>();
    	
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
    	
    	private hu.modembed.model.textnotations.device.IDeviceLocationMap locationMap;
    	
    	private hu.modembed.model.textnotations.device.mopp.DeviceSyntaxErrorMessageConverter syntaxErrorMessageConverter = new hu.modembed.model.textnotations.device.mopp.DeviceSyntaxErrorMessageConverter(tokenNames);
    	
    	@Override	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException re) {
    		addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
    	}
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new hu.modembed.model.textnotations.device.IDeviceCommand<hu.modembed.model.textnotations.device.IDeviceTextResource>() {
    			public boolean execute(hu.modembed.model.textnotations.device.IDeviceTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new hu.modembed.model.textnotations.device.IDeviceProblem() {
    					public hu.modembed.model.textnotations.device.DeviceEProblemSeverity getSeverity() {
    						return hu.modembed.model.textnotations.device.DeviceEProblemSeverity.ERROR;
    					}
    					public hu.modembed.model.textnotations.device.DeviceEProblemType getType() {
    						return hu.modembed.model.textnotations.device.DeviceEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<hu.modembed.model.textnotations.device.IDeviceQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	protected void addErrorToResource(hu.modembed.model.textnotations.device.mopp.DeviceLocalizedMessage message) {
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
    		hu.modembed.model.textnotations.device.IDeviceExpectedElement terminal = hu.modembed.model.textnotations.device.grammar.DeviceFollowSetProvider.TERMINALS[terminalID];
    		hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] containmentFeatures = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = hu.modembed.model.textnotations.device.grammar.DeviceFollowSetProvider.LINKS[ids[i]];
    		}
    		hu.modembed.model.textnotations.device.grammar.DeviceContainmentTrace containmentTrace = new hu.modembed.model.textnotations.device.grammar.DeviceContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal expectedElement = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal(container, terminal, followSetID, containmentTrace);
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
    		final hu.modembed.model.textnotations.device.IDeviceLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new hu.modembed.model.textnotations.device.IDeviceCommand<hu.modembed.model.textnotations.device.IDeviceTextResource>() {
    			public boolean execute(hu.modembed.model.textnotations.device.IDeviceTextResource resource) {
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
    		final hu.modembed.model.textnotations.device.IDeviceLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new hu.modembed.model.textnotations.device.IDeviceCommand<hu.modembed.model.textnotations.device.IDeviceTextResource>() {
    			public boolean execute(hu.modembed.model.textnotations.device.IDeviceTextResource resource) {
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
    	protected void setLocalizationEnd(java.util.Collection<hu.modembed.model.textnotations.device.IDeviceCommand<hu.modembed.model.textnotations.device.IDeviceTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		final hu.modembed.model.textnotations.device.IDeviceLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new hu.modembed.model.textnotations.device.IDeviceCommand<hu.modembed.model.textnotations.device.IDeviceTextResource>() {
    			public boolean execute(hu.modembed.model.textnotations.device.IDeviceTextResource resource) {
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public hu.modembed.model.textnotations.device.IDeviceTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new DeviceParser(new org.antlr.runtime3_4_0.CommonTokenStream(new DeviceLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new DeviceParser(new org.antlr.runtime3_4_0.CommonTokenStream(new DeviceLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new hu.modembed.model.textnotations.device.util.DeviceRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public DeviceParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((DeviceLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((DeviceLexer) getTokenStream().getTokenSource()).lexerExceptionPositions = lexerExceptionPositions;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == hu.modembed.model.modembed.abstraction.DeviceAbstraction.class) {
    				return parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.abstraction.memorymodel.MemoryType.class) {
    				return parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance.class) {
    				return parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition.class) {
    				return parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.infrastructure.AttributeDefinition.class) {
    				return parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.infrastructure.AttributeValueContainer.class) {
    				return parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.infrastructure.AttributeValue.class) {
    				return parse_hu_modembed_model_modembed_infrastructure_AttributeValue();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition.class) {
    				return parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument.class) {
    				return parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep.class) {
    				return parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep();
    			}
    			if (type.getInstanceClass() == hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping.class) {
    				return parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping();
    			}
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
    		throw new hu.modembed.model.textnotations.device.mopp.DeviceUnexpectedContentTypeException(typeObject);
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
    			typeObject = options.get(hu.modembed.model.textnotations.device.IDeviceOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public hu.modembed.model.textnotations.device.IDeviceParseResult parse() {
    		// Reset parser state
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<hu.modembed.model.textnotations.device.IDeviceCommand<hu.modembed.model.textnotations.device.IDeviceTextResource>>();
    		hu.modembed.model.textnotations.device.mopp.DeviceParseResult parseResult = new hu.modembed.model.textnotations.device.mopp.DeviceParseResult();
    		if (disableLocationMap) {
    			locationMap = new hu.modembed.model.textnotations.device.mopp.DeviceDevNullLocationMap();
    		} else {
    			locationMap = new hu.modembed.model.textnotations.device.mopp.DeviceLocationMap();
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
    	
    	public java.util.List<hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, hu.modembed.model.textnotations.device.IDeviceTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		hu.modembed.model.textnotations.device.IDeviceParseResult result = parse();
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
    			for (hu.modembed.model.textnotations.device.IDeviceCommand<hu.modembed.model.textnotations.device.IDeviceTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal>();
    		java.util.List<hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal> newFollowSet = new java.util.ArrayList<hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 96;
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
    				for (hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<hu.modembed.model.textnotations.device.util.DevicePair<hu.modembed.model.textnotations.device.IDeviceExpectedElement, hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (hu.modembed.model.textnotations.device.util.DevicePair<hu.modembed.model.textnotations.device.IDeviceExpectedElement, hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[]> newFollowerPair : newFollowers) {
    							hu.modembed.model.textnotations.device.IDeviceExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							hu.modembed.model.textnotations.device.grammar.DeviceContainmentTrace containmentTrace = new hu.modembed.model.textnotations.device.grammar.DeviceContainmentTrace(null, newFollowerPair.getRight());
    							hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal newFollowTerminal = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal(container, newFollower, followSetID, containmentTrace);
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
    		for (hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(hu.modembed.model.textnotations.device.mopp.DeviceExpectedTerminal expectedElement, int tokenIndex) {
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
    // Device.g:495:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        hu.modembed.model.modembed.abstraction.DeviceAbstraction c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Device.g:496:2: ( (c0= parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction ) EOF )
            // Device.g:497:2: (c0= parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Device.g:502:2: (c0= parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction )
            // Device.g:503:3: c0= parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction
            {
            pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction_in_start82);
            c0=parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction();

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



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction"
    // Device.g:511:1: parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction returns [hu.modembed.model.modembed.abstraction.DeviceAbstraction element = null] : a0= 'device' (a1= QUALIFIEDID ) ( (a2= 'extends' (a3= QUALIFIEDID ) ) )? ( (a4= 'instructionset' (a5= QUALIFIEDID ) ) )? a6= ';' ( ( ( (a7_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType ) | (a8_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance ) | (a9_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition ) ) a10= ';' ) )* ;
    public final hu.modembed.model.modembed.abstraction.DeviceAbstraction parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.DeviceAbstraction element =  null;

        int parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a10=null;
        hu.modembed.model.modembed.abstraction.memorymodel.MemoryType a7_0 =null;

        hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance a8_0 =null;

        hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition a9_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Device.g:514:2: (a0= 'device' (a1= QUALIFIEDID ) ( (a2= 'extends' (a3= QUALIFIEDID ) ) )? ( (a4= 'instructionset' (a5= QUALIFIEDID ) ) )? a6= ';' ( ( ( (a7_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType ) | (a8_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance ) | (a9_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition ) ) a10= ';' ) )* )
            // Device.g:515:2: a0= 'device' (a1= QUALIFIEDID ) ( (a2= 'extends' (a3= QUALIFIEDID ) ) )? ( (a4= 'instructionset' (a5= QUALIFIEDID ) ) )? a6= ';' ( ( ( (a7_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType ) | (a8_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance ) | (a9_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition ) ) a10= ';' ) )*
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[1]);
            	}

            // Device.g:529:2: (a1= QUALIFIEDID )
            // Device.g:530:3: a1= QUALIFIEDID
            {
            a1=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction133); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[2]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[3]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[4]);
            	}

            // Device.g:567:2: ( (a2= 'extends' (a3= QUALIFIEDID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Device.g:568:3: (a2= 'extends' (a3= QUALIFIEDID ) )
                    {
                    // Device.g:568:3: (a2= 'extends' (a3= QUALIFIEDID ) )
                    // Device.g:569:4: a2= 'extends' (a3= QUALIFIEDID )
                    {
                    a2=(Token)match(input,23,FOLLOW_23_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction163); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[5]);
                    			}

                    // Device.g:583:4: (a3= QUALIFIEDID )
                    // Device.g:584:5: a3= QUALIFIEDID
                    {
                    a3=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction189); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
                    						startIncompleteElement(element);
                    					}
                    					if (a3 != null) {
                    						hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
                    						tokenResolver.setOptions(getOptions());
                    						hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
                    						}
                    						String resolved = (String) resolvedObject;
                    						hu.modembed.model.modembed.abstraction.DeviceAbstraction proxy = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
                    						collectHiddenTokens(element);
                    						registerContextDependentProxy(new hu.modembed.model.textnotations.device.mopp.DeviceContextDependentURIFragmentFactory<hu.modembed.model.modembed.abstraction.DeviceAbstraction, hu.modembed.model.modembed.abstraction.DeviceAbstraction>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDeviceAbstractionAncestorReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR), resolved, proxy);
                    						if (proxy != null) {
                    							Object value = proxy;
                    							element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_2_0_0_1, proxy, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[6]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[7]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[8]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[9]);
            	}

            // Device.g:632:2: ( (a4= 'instructionset' (a5= QUALIFIEDID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Device.g:633:3: (a4= 'instructionset' (a5= QUALIFIEDID ) )
                    {
                    // Device.g:633:3: (a4= 'instructionset' (a5= QUALIFIEDID ) )
                    // Device.g:634:4: a4= 'instructionset' (a5= QUALIFIEDID )
                    {
                    a4=(Token)match(input,24,FOLLOW_24_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction244); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[10]);
                    			}

                    // Device.g:648:4: (a5= QUALIFIEDID )
                    // Device.g:649:5: a5= QUALIFIEDID
                    {
                    a5=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction270); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
                    						startIncompleteElement(element);
                    					}
                    					if (a5 != null) {
                    						hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
                    						tokenResolver.setOptions(getOptions());
                    						hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
                    						}
                    						String resolved = (String) resolvedObject;
                    						hu.modembed.model.modembed.core.instructionset.InstructionSet proxy = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstructionSet();
                    						collectHiddenTokens(element);
                    						registerContextDependentProxy(new hu.modembed.model.textnotations.device.mopp.DeviceContextDependentURIFragmentFactory<hu.modembed.model.modembed.abstraction.DeviceAbstraction, hu.modembed.model.modembed.core.instructionset.InstructionSet>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDeviceAbstractionInstructionsetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET), resolved, proxy);
                    						if (proxy != null) {
                    							Object value = proxy;
                    							element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_3_0_0_1, proxy, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, proxy);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[11]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[12]);
            	}

            a6=(Token)match(input,16,FOLLOW_16_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction316); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[13]);
            		addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[14]);
            		addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[15]);
            	}

            // Device.g:711:2: ( ( ( (a7_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType ) | (a8_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance ) | (a9_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition ) ) a10= ';' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= 25 && LA4_0 <= 27)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Device.g:712:3: ( ( (a7_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType ) | (a8_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance ) | (a9_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition ) ) a10= ';' )
            	    {
            	    // Device.g:712:3: ( ( (a7_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType ) | (a8_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance ) | (a9_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition ) ) a10= ';' )
            	    // Device.g:713:4: ( (a7_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType ) | (a8_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance ) | (a9_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition ) ) a10= ';'
            	    {
            	    // Device.g:713:4: ( (a7_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType ) | (a8_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance ) | (a9_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition ) )
            	    int alt3=3;
            	    switch ( input.LA(1) ) {
            	    case 26:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // Device.g:714:5: (a7_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType )
            	            {
            	            // Device.g:714:5: (a7_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType )
            	            // Device.g:715:6: a7_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType
            	            {
            	            pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction352);
            	            a7_0=parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a7_0 != null) {
            	            							if (a7_0 != null) {
            	            								Object value = a7_0;
            	            								addObjectToList(element, hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES, value);
            	            								completedElement(value, true);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_5_0_0_0_0_0_0, a7_0, true);
            	            							copyLocalizationInfos(a7_0, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[16]);
            	            				}

            	            }
            	            break;
            	        case 2 :
            	            // Device.g:741:10: (a8_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance )
            	            {
            	            // Device.g:741:10: (a8_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance )
            	            // Device.g:742:6: a8_0= parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance
            	            {
            	            pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction402);
            	            a8_0=parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a8_0 != null) {
            	            							if (a8_0 != null) {
            	            								Object value = a8_0;
            	            								addObjectToList(element, hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES, value);
            	            								completedElement(value, true);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_5_0_0_0_0_1_0, a8_0, true);
            	            							copyLocalizationInfos(a8_0, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[17]);
            	            				}

            	            }
            	            break;
            	        case 3 :
            	            // Device.g:768:10: (a9_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition )
            	            {
            	            // Device.g:768:10: (a9_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition )
            	            // Device.g:769:6: a9_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition
            	            {
            	            pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction452);
            	            a9_0=parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a9_0 != null) {
            	            							if (a9_0 != null) {
            	            								Object value = a9_0;
            	            								addObjectToList(element, hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__OPERATION, value);
            	            								completedElement(value, true);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_5_0_0_0_0_2_0, a9_0, true);
            	            							copyLocalizationInfos(a9_0, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[18]);
            	            				}

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[19]);
            	    			}

            	    a10=(Token)match(input,16,FOLLOW_16_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction498); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_5_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[20]);
            	    				addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[21]);
            	    				addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[22]);
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
            		addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[23]);
            		addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[24]);
            		addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[25]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType"
    // Device.g:827:1: parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType returns [hu.modembed.model.modembed.abstraction.memorymodel.MemoryType element = null] : a0= 'mtype' ( (a1= 'volatile' )? ) ( (a4= 'data' )? ) ( (a7= 'program' )? ) (a10= QUALIFIEDID ) a11= '(' (a12= INT ) a13= ')' ( (a14_0= parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition ) )? ;
    public final hu.modembed.model.modembed.abstraction.memorymodel.MemoryType parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.memorymodel.MemoryType element =  null;

        int parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a4=null;
        Token a7=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition a14_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Device.g:830:2: (a0= 'mtype' ( (a1= 'volatile' )? ) ( (a4= 'data' )? ) ( (a7= 'program' )? ) (a10= QUALIFIEDID ) a11= '(' (a12= INT ) a13= ')' ( (a14_0= parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition ) )? )
            // Device.g:831:2: a0= 'mtype' ( (a1= 'volatile' )? ) ( (a4= 'data' )? ) ( (a7= 'program' )? ) (a10= QUALIFIEDID ) a11= '(' (a12= INT ) a13= ')' ( (a14_0= parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition ) )?
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType546); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryType();
            			startIncompleteElement(element);
            			// initialize boolean attribute
            			{
            				Object value = false;
            				element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE), value);
            			}
            			// initialize boolean attribute
            			{
            				Object value = false;
            				element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_DATA), value);
            			}
            			// initialize boolean attribute
            			{
            				Object value = false;
            				element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM), value);
            			}
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[26]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[27]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[28]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[29]);
            	}

            // Device.g:863:2: ( (a1= 'volatile' )? )
            // Device.g:864:3: (a1= 'volatile' )?
            {
            // Device.g:864:3: (a1= 'volatile' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Device.g:865:4: a1= 'volatile'
                    {
                    a1=(Token)match(input,31,FOLLOW_31_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType569); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryType();
                    					startIncompleteElement(element);
                    					// initialize boolean attribute
                    					{
                    						Object value = false;
                    						element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE), value);
                    					}
                    					// initialize boolean attribute
                    					{
                    						Object value = false;
                    						element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_DATA), value);
                    					}
                    					// initialize boolean attribute
                    					{
                    						Object value = false;
                    						element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM), value);
                    					}
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_1, true, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    				// set value of boolean attribute
                    				Object value = true;
                    				element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[30]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[31]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[32]);
            	}

            // Device.g:901:2: ( (a4= 'data' )? )
            // Device.g:902:3: (a4= 'data' )?
            {
            // Device.g:902:3: (a4= 'data' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Device.g:903:4: a4= 'data'
                    {
                    a4=(Token)match(input,21,FOLLOW_21_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType599); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryType();
                    					startIncompleteElement(element);
                    					// initialize boolean attribute
                    					{
                    						Object value = false;
                    						element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE), value);
                    					}
                    					// initialize boolean attribute
                    					{
                    						Object value = false;
                    						element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_DATA), value);
                    					}
                    					// initialize boolean attribute
                    					{
                    						Object value = false;
                    						element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM), value);
                    					}
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_2, true, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    				// set value of boolean attribute
                    				Object value = true;
                    				element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_DATA), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[33]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[34]);
            	}

            // Device.g:938:2: ( (a7= 'program' )? )
            // Device.g:939:3: (a7= 'program' )?
            {
            // Device.g:939:3: (a7= 'program' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Device.g:940:4: a7= 'program'
                    {
                    a7=(Token)match(input,28,FOLLOW_28_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType629); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryType();
                    					startIncompleteElement(element);
                    					// initialize boolean attribute
                    					{
                    						Object value = false;
                    						element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE), value);
                    					}
                    					// initialize boolean attribute
                    					{
                    						Object value = false;
                    						element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_DATA), value);
                    					}
                    					// initialize boolean attribute
                    					{
                    						Object value = false;
                    						element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM), value);
                    					}
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_3, true, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
                    				// set value of boolean attribute
                    				Object value = true;
                    				element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[35]);
            	}

            // Device.g:974:2: (a10= QUALIFIEDID )
            // Device.g:975:3: a10= QUALIFIEDID
            {
            a10=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType654); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryType();
            				startIncompleteElement(element);
            				// initialize boolean attribute
            				{
            					Object value = false;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE), value);
            				}
            				// initialize boolean attribute
            				{
            					Object value = false;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_DATA), value);
            				}
            				// initialize boolean attribute
            				{
            					Object value = false;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM), value);
            				}
            			}
            			if (a10 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_4, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[36]);
            	}

            a11=(Token)match(input,10,FOLLOW_10_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType675); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryType();
            			startIncompleteElement(element);
            			// initialize boolean attribute
            			{
            				Object value = false;
            				element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE), value);
            			}
            			// initialize boolean attribute
            			{
            				Object value = false;
            				element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_DATA), value);
            			}
            			// initialize boolean attribute
            			{
            				Object value = false;
            				element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM), value);
            			}
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[37]);
            	}

            // Device.g:1054:2: (a12= INT )
            // Device.g:1055:3: a12= INT
            {
            a12=(Token)match(input,INT,FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType693); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryType();
            				startIncompleteElement(element);
            				// initialize boolean attribute
            				{
            					Object value = false;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE), value);
            				}
            				// initialize boolean attribute
            				{
            					Object value = false;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_DATA), value);
            				}
            				// initialize boolean attribute
            				{
            					Object value = false;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM), value);
            				}
            			}
            			if (a12 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__ACCESS_COST), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a12).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a12).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a12).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__ACCESS_COST), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_6, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a12, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[38]);
            	}

            a13=(Token)match(input,11,FOLLOW_11_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType714); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryType();
            			startIncompleteElement(element);
            			// initialize boolean attribute
            			{
            				Object value = false;
            				element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE), value);
            			}
            			// initialize boolean attribute
            			{
            				Object value = false;
            				element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_DATA), value);
            			}
            			// initialize boolean attribute
            			{
            				Object value = false;
            				element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM), value);
            			}
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[39]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[40]);
            	}

            // Device.g:1135:2: ( (a14_0= parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Device.g:1136:3: (a14_0= parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition )
                    {
                    // Device.g:1136:3: (a14_0= parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition )
                    // Device.g:1137:4: a14_0= parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition
                    {
                    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType737);
                    a14_0=parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryType();
                    					startIncompleteElement(element);
                    					// initialize boolean attribute
                    					{
                    						Object value = false;
                    						element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE), value);
                    					}
                    					// initialize boolean attribute
                    					{
                    						Object value = false;
                    						element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_DATA), value);
                    					}
                    					// initialize boolean attribute
                    					{
                    						Object value = false;
                    						element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM), value);
                    					}
                    				}
                    				if (a14_0 != null) {
                    					if (a14_0 != null) {
                    						Object value = a14_0;
                    						element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES), value);
                    						completedElement(value, true);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_8, a14_0, true);
                    					copyLocalizationInfos(a14_0, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[41]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance"
    // Device.g:1180:1: parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance returns [hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance element = null] : a0= 'minstance' (a1= QUALIFIEDID ) a2= '[' (a3= INT ) a4= ',' (a5= INT ) a6= ']' a7= ':' (a8= QUALIFIEDID ) (a9_0= parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer ) ;
    public final hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance element =  null;

        int parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        hu.modembed.model.modembed.infrastructure.AttributeValueContainer a9_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Device.g:1183:2: (a0= 'minstance' (a1= QUALIFIEDID ) a2= '[' (a3= INT ) a4= ',' (a5= INT ) a6= ']' a7= ':' (a8= QUALIFIEDID ) (a9_0= parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer ) )
            // Device.g:1184:2: a0= 'minstance' (a1= QUALIFIEDID ) a2= '[' (a3= INT ) a4= ',' (a5= INT ) a6= ']' a7= ':' (a8= QUALIFIEDID ) (a9_0= parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer )
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance778); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[42]);
            	}

            // Device.g:1198:2: (a1= QUALIFIEDID )
            // Device.g:1199:3: a1= QUALIFIEDID
            {
            a1=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance796); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[43]);
            	}

            a2=(Token)match(input,19,FOLLOW_19_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance817); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[44]);
            	}

            // Device.g:1248:2: (a3= INT )
            // Device.g:1249:3: a3= INT
            {
            a3=(Token)match(input,INT,FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance835); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
            				startIncompleteElement(element);
            			}
            			if (a3 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__START_ADDRESS), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
            				}
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__START_ADDRESS), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_3, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[45]);
            	}

            a4=(Token)match(input,13,FOLLOW_13_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance856); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[46]);
            	}

            // Device.g:1298:2: (a5= INT )
            // Device.g:1299:3: a5= INT
            {
            a5=(Token)match(input,INT,FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance874); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
            				startIncompleteElement(element);
            			}
            			if (a5 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__SIZE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
            				}
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__SIZE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_5, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[47]);
            	}

            a6=(Token)match(input,20,FOLLOW_20_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance895); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[48]);
            	}

            a7=(Token)match(input,15,FOLLOW_15_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance909); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[49]);
            	}

            // Device.g:1362:2: (a8= QUALIFIEDID )
            // Device.g:1363:3: a8= QUALIFIEDID
            {
            a8=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance927); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
            				startIncompleteElement(element);
            			}
            			if (a8 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__TYPE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				hu.modembed.model.modembed.abstraction.memorymodel.MemoryType proxy = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryType();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new hu.modembed.model.textnotations.device.mopp.DeviceContextDependentURIFragmentFactory<hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance, hu.modembed.model.modembed.abstraction.memorymodel.MemoryType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMemoryInstanceTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__TYPE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__TYPE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_8, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[50]);
            	}

            // Device.g:1402:2: (a9_0= parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer )
            // Device.g:1403:3: a9_0= parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer
            {
            pushFollow(FOLLOW_parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance952);
            a9_0=parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
            				startIncompleteElement(element);
            			}
            			if (a9_0 != null) {
            				if (a9_0 != null) {
            					Object value = a9_0;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__ATTRIBUTES), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_9, a9_0, true);
            				copyLocalizationInfos(a9_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[51]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance"



    // $ANTLR start "parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition"
    // Device.g:1430:1: parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition returns [hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition element = null] : a0= '{' ( (a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition ) )* a2= '}' ;
    public final hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition() throws RecognitionException {
        hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition element =  null;

        int parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        hu.modembed.model.modembed.infrastructure.AttributeDefinition a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Device.g:1433:2: (a0= '{' ( (a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition ) )* a2= '}' )
            // Device.g:1434:2: a0= '{' ( (a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition ) )* a2= '}'
            {
            a0=(Token)match(input,32,FOLLOW_32_in_parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition985); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeContainerDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_3_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[52]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[53]);
            	}

            // Device.g:1449:2: ( (a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==QUALIFIEDID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Device.g:1450:3: (a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition )
            	    {
            	    // Device.g:1450:3: (a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition )
            	    // Device.g:1451:4: a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition
            	    {
            	    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition_in_parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition1008);
            	    a1_0=parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeContainerDefinition();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a1_0 != null) {
            	    					if (a1_0 != null) {
            	    						Object value = a1_0;
            	    						addObjectToList(element, hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_CONTAINER_DEFINITION__ATTRIBUTES, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_3_0_0_1, a1_0, true);
            	    					copyLocalizationInfos(a1_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[54]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[55]);
            	}

            a2=(Token)match(input,34,FOLLOW_34_in_parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition1034); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeContainerDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_3_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[56]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition"



    // $ANTLR start "parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition"
    // Device.g:1494:1: parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition returns [hu.modembed.model.modembed.infrastructure.AttributeDefinition element = null] : (a0= QUALIFIEDID ) a1= ';' ;
    public final hu.modembed.model.modembed.infrastructure.AttributeDefinition parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition() throws RecognitionException {
        hu.modembed.model.modembed.infrastructure.AttributeDefinition element =  null;

        int parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Device.g:1497:2: ( (a0= QUALIFIEDID ) a1= ';' )
            // Device.g:1498:2: (a0= QUALIFIEDID ) a1= ';'
            {
            // Device.g:1498:2: (a0= QUALIFIEDID )
            // Device.g:1499:3: a0= QUALIFIEDID
            {
            a0=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition1067); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeDefinition();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_DEFINITION__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_DEFINITION__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_4_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[57]);
            	}

            a1=(Token)match(input,16,FOLLOW_16_in_parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition1088); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_4_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[58]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[59]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition"



    // $ANTLR start "parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer"
    // Device.g:1551:1: parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer returns [hu.modembed.model.modembed.infrastructure.AttributeValueContainer element = null] : a0= '{' ( (a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeValue ) )* a2= '}' ;
    public final hu.modembed.model.modembed.infrastructure.AttributeValueContainer parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer() throws RecognitionException {
        hu.modembed.model.modembed.infrastructure.AttributeValueContainer element =  null;

        int parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        hu.modembed.model.modembed.infrastructure.AttributeValue a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Device.g:1554:2: (a0= '{' ( (a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeValue ) )* a2= '}' )
            // Device.g:1555:2: a0= '{' ( (a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeValue ) )* a2= '}'
            {
            a0=(Token)match(input,32,FOLLOW_32_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer1117); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeValueContainer();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_5_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValueContainer(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[60]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[61]);
            	}

            // Device.g:1570:2: ( (a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeValue ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==QUALIFIEDID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Device.g:1571:3: (a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeValue )
            	    {
            	    // Device.g:1571:3: (a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeValue )
            	    // Device.g:1572:4: a1_0= parse_hu_modembed_model_modembed_infrastructure_AttributeValue
            	    {
            	    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_infrastructure_AttributeValue_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer1140);
            	    a1_0=parse_hu_modembed_model_modembed_infrastructure_AttributeValue();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeValueContainer();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a1_0 != null) {
            	    					if (a1_0 != null) {
            	    						Object value = a1_0;
            	    						addObjectToList(element, hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE_CONTAINER__VALUES, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_5_0_0_1, a1_0, true);
            	    					copyLocalizationInfos(a1_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValueContainer(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[62]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[63]);
            	}

            a2=(Token)match(input,34,FOLLOW_34_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer1166); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeValueContainer();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_5_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[64]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer"



    // $ANTLR start "parse_hu_modembed_model_modembed_infrastructure_AttributeValue"
    // Device.g:1615:1: parse_hu_modembed_model_modembed_infrastructure_AttributeValue returns [hu.modembed.model.modembed.infrastructure.AttributeValue element = null] : (a0= QUALIFIEDID ) a1= '=' (a2= INT ) a3= ';' ;
    public final hu.modembed.model.modembed.infrastructure.AttributeValue parse_hu_modembed_model_modembed_infrastructure_AttributeValue() throws RecognitionException {
        hu.modembed.model.modembed.infrastructure.AttributeValue element =  null;

        int parse_hu_modembed_model_modembed_infrastructure_AttributeValue_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Device.g:1618:2: ( (a0= QUALIFIEDID ) a1= '=' (a2= INT ) a3= ';' )
            // Device.g:1619:2: (a0= QUALIFIEDID ) a1= '=' (a2= INT ) a3= ';'
            {
            // Device.g:1619:2: (a0= QUALIFIEDID )
            // Device.g:1620:3: a0= QUALIFIEDID
            {
            a0=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValue1199); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeValue();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__DEFINITION), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				hu.modembed.model.modembed.infrastructure.AttributeDefinition proxy = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeDefinition();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new hu.modembed.model.textnotations.device.mopp.DeviceContextDependentURIFragmentFactory<hu.modembed.model.modembed.infrastructure.AttributeValue, hu.modembed.model.modembed.infrastructure.AttributeDefinition>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAttributeValueDefinitionReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__DEFINITION), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__DEFINITION), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_6_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[65]);
            	}

            a1=(Token)match(input,17,FOLLOW_17_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValue1220); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeValue();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_6_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[66]);
            	}

            // Device.g:1673:2: (a2= INT )
            // Device.g:1674:3: a2= INT
            {
            a2=(Token)match(input,INT,FOLLOW_INT_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValue1238); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeValue();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_6_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[67]);
            	}

            a3=(Token)match(input,16,FOLLOW_16_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValue1259); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeValue();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_6_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValueContainer(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[68]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[69]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_hu_modembed_model_modembed_infrastructure_AttributeValue_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_infrastructure_AttributeValue"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition"
    // Device.g:1726:1: parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition returns [hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition element = null] : a0= 'operation' (a1= QUALIFIEDID ) a2= '(' ( ( (a3_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ( (a4= ',' (a5_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ) )* ) )? a6= ')' a7= '{' ( (a8_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep ) )* a9= '}' ;
    public final hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition element =  null;

        int parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a6=null;
        Token a7=null;
        Token a9=null;
        hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument a3_0 =null;

        hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument a5_0 =null;

        hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep a8_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Device.g:1729:2: (a0= 'operation' (a1= QUALIFIEDID ) a2= '(' ( ( (a3_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ( (a4= ',' (a5_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ) )* ) )? a6= ')' a7= '{' ( (a8_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep ) )* a9= '}' )
            // Device.g:1730:2: a0= 'operation' (a1= QUALIFIEDID ) a2= '(' ( ( (a3_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ( (a4= ',' (a5_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ) )* ) )? a6= ')' a7= '{' ( (a8_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep ) )* a9= '}'
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1288); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[70]);
            	}

            // Device.g:1744:2: (a1= QUALIFIEDID )
            // Device.g:1745:3: a1= QUALIFIEDID
            {
            a1=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1306); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__OPERATION), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__OPERATION), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[71]);
            	}

            a2=(Token)match(input,10,FOLLOW_10_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1327); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[72]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[73]);
            	}

            // Device.g:1795:2: ( ( (a3_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ( (a4= ',' (a5_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ) )* ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==QUALIFIEDID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Device.g:1796:3: ( (a3_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ( (a4= ',' (a5_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ) )* )
                    {
                    // Device.g:1796:3: ( (a3_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ( (a4= ',' (a5_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ) )* )
                    // Device.g:1797:4: (a3_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ( (a4= ',' (a5_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ) )*
                    {
                    // Device.g:1797:4: (a3_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument )
                    // Device.g:1798:5: a3_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument
                    {
                    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1356);
                    a3_0=parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
                    						startIncompleteElement(element);
                    					}
                    					if (a3_0 != null) {
                    						if (a3_0 != null) {
                    							Object value = a3_0;
                    							addObjectToList(element, hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__ARGUMENTS, value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_3_0_0_0, a3_0, true);
                    						copyLocalizationInfos(a3_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[74]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[75]);
                    			}

                    // Device.g:1824:4: ( (a4= ',' (a5_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==13) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Device.g:1825:5: (a4= ',' (a5_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) )
                    	    {
                    	    // Device.g:1825:5: (a4= ',' (a5_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument ) )
                    	    // Device.g:1826:6: a4= ',' (a5_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument )
                    	    {
                    	    a4=(Token)match(input,13,FOLLOW_13_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1397); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_3_0_0_1_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[76]);
                    	    					}

                    	    // Device.g:1840:6: (a5_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument )
                    	    // Device.g:1841:7: a5_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument
                    	    {
                    	    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1431);
                    	    a5_0=parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a5_0 != null) {
                    	    								if (a5_0 != null) {
                    	    									Object value = a5_0;
                    	    									addObjectToList(element, hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__ARGUMENTS, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_3_0_0_1_0_0_1, a5_0, true);
                    	    								copyLocalizationInfos(a5_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[77]);
                    	    						addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[78]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[79]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[80]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[81]);
            	}

            a6=(Token)match(input,11,FOLLOW_11_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1505); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[82]);
            	}

            a7=(Token)match(input,32,FOLLOW_32_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1519); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[83]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[84]);
            	}

            // Device.g:1911:2: ( (a8_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==QUALIFIEDID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Device.g:1912:3: (a8_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep )
            	    {
            	    // Device.g:1912:3: (a8_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep )
            	    // Device.g:1913:4: a8_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep
            	    {
            	    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1542);
            	    a8_0=parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a8_0 != null) {
            	    					if (a8_0 != null) {
            	    						Object value = a8_0;
            	    						addObjectToList(element, hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__STEPS, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_6, a8_0, true);
            	    					copyLocalizationInfos(a8_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[85]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[86]);
            	}

            a9=(Token)match(input,34,FOLLOW_34_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1568); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[87]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument"
    // Device.g:1956:1: parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument returns [hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument element = null] : (a0= QUALIFIEDID ) a1= ':' (a2_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition ) a3= '|' (a4= INT ) ( (a5= '@' (a6= QUALIFIEDID ) ) )? ;
    public final hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument element =  null;

        int parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        hu.modembed.model.modembed.abstraction.types.TypeDefinition a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Device.g:1959:2: ( (a0= QUALIFIEDID ) a1= ':' (a2_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition ) a3= '|' (a4= INT ) ( (a5= '@' (a6= QUALIFIEDID ) ) )? )
            // Device.g:1960:2: (a0= QUALIFIEDID ) a1= ':' (a2_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition ) a3= '|' (a4= INT ) ( (a5= '@' (a6= QUALIFIEDID ) ) )?
            {
            // Device.g:1960:2: (a0= QUALIFIEDID )
            // Device.g:1961:3: a0= QUALIFIEDID
            {
            a0=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1601); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationArgument();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[88]);
            	}

            a1=(Token)match(input,15,FOLLOW_15_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1622); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationArgument();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[89]);
            		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[90]);
            	}

            // Device.g:2011:2: (a2_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition )
            // Device.g:2012:3: a2_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition
            {
            pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1640);
            a2_0=parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationArgument();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__TYPE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_2, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[91]);
            	}

            a3=(Token)match(input,33,FOLLOW_33_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1658); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationArgument();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[92]);
            	}

            // Device.g:2051:2: (a4= INT )
            // Device.g:2052:3: a4= INT
            {
            a4=(Token)match(input,INT,FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1676); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationArgument();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__INDIRECTION_LEVEL), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__INDIRECTION_LEVEL), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_4, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[93]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[94]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[95]);
            	}

            // Device.g:2089:2: ( (a5= '@' (a6= QUALIFIEDID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Device.g:2090:3: (a5= '@' (a6= QUALIFIEDID ) )
                    {
                    // Device.g:2090:3: (a5= '@' (a6= QUALIFIEDID ) )
                    // Device.g:2091:4: a5= '@' (a6= QUALIFIEDID )
                    {
                    a5=(Token)match(input,18,FOLLOW_18_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1706); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationArgument();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[96]);
                    			}

                    // Device.g:2105:4: (a6= QUALIFIEDID )
                    // Device.g:2106:5: a6= QUALIFIEDID
                    {
                    a6=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1732); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationArgument();
                    						startIncompleteElement(element);
                    					}
                    					if (a6 != null) {
                    						hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
                    						tokenResolver.setOptions(getOptions());
                    						hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__MEMTYPE), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
                    						}
                    						String resolved = (String) resolvedObject;
                    						hu.modembed.model.modembed.abstraction.memorymodel.MemoryType proxy = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryType();
                    						collectHiddenTokens(element);
                    						registerContextDependentProxy(new hu.modembed.model.textnotations.device.mopp.DeviceContextDependentURIFragmentFactory<hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument, hu.modembed.model.modembed.abstraction.memorymodel.MemoryType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOperationArgumentMemtypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__MEMTYPE), resolved, proxy);
                    						if (proxy != null) {
                    							Object value = proxy;
                    							element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__MEMTYPE), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_5_0_0_1, proxy, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, proxy);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[97]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[98]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[99]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[100]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep"
    // Device.g:2156:1: parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep returns [hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep element = null] : (a0= QUALIFIEDID ) a1= '(' ( ( (a2_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ( (a3= ',' (a4_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ) )* ) )? a5= ')' a6= ';' ;
    public final hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep element =  null;

        int parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        Token a6=null;
        hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping a2_0 =null;

        hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping a4_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Device.g:2159:2: ( (a0= QUALIFIEDID ) a1= '(' ( ( (a2_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ( (a3= ',' (a4_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ) )* ) )? a5= ')' a6= ';' )
            // Device.g:2160:2: (a0= QUALIFIEDID ) a1= '(' ( ( (a2_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ( (a3= ',' (a4_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ) )* ) )? a5= ')' a6= ';'
            {
            // Device.g:2160:2: (a0= QUALIFIEDID )
            // Device.g:2161:3: a0= QUALIFIEDID
            {
            a0=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep1797); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionCallOperationStep();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__INSTRUCTION), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				hu.modembed.model.modembed.core.instructionset.Instruction proxy = hu.modembed.model.modembed.core.instructionset.InstructionsetFactory.eINSTANCE.createInstruction();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new hu.modembed.model.textnotations.device.mopp.DeviceContextDependentURIFragmentFactory<hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep, hu.modembed.model.modembed.core.instructionset.Instruction>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstructionCallOperationStepInstructionReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__INSTRUCTION), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__INSTRUCTION), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[101]);
            	}

            a1=(Token)match(input,10,FOLLOW_10_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep1818); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionCallOperationStep();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[102]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[103]);
            	}

            // Device.g:2215:2: ( ( (a2_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ( (a3= ',' (a4_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ) )* ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==QUALIFIEDID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Device.g:2216:3: ( (a2_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ( (a3= ',' (a4_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ) )* )
                    {
                    // Device.g:2216:3: ( (a2_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ( (a3= ',' (a4_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ) )* )
                    // Device.g:2217:4: (a2_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ( (a3= ',' (a4_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ) )*
                    {
                    // Device.g:2217:4: (a2_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping )
                    // Device.g:2218:5: a2_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping
                    {
                    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep1847);
                    a2_0=parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionCallOperationStep();
                    						startIncompleteElement(element);
                    					}
                    					if (a2_0 != null) {
                    						if (a2_0 != null) {
                    							Object value = a2_0;
                    							addObjectToList(element, hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__ARGUMENTS, value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_2_0_0_0, a2_0, true);
                    						copyLocalizationInfos(a2_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[104]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[105]);
                    			}

                    // Device.g:2244:4: ( (a3= ',' (a4_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==13) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Device.g:2245:5: (a3= ',' (a4_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) )
                    	    {
                    	    // Device.g:2245:5: (a3= ',' (a4_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping ) )
                    	    // Device.g:2246:6: a3= ',' (a4_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping )
                    	    {
                    	    a3=(Token)match(input,13,FOLLOW_13_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep1888); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionCallOperationStep();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_2_0_0_1_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[106]);
                    	    					}

                    	    // Device.g:2260:6: (a4_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping )
                    	    // Device.g:2261:7: a4_0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping
                    	    {
                    	    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep1922);
                    	    a4_0=parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionCallOperationStep();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a4_0 != null) {
                    	    								if (a4_0 != null) {
                    	    									Object value = a4_0;
                    	    									addObjectToList(element, hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__ARGUMENTS, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_2_0_0_1_0_0_1, a4_0, true);
                    	    								copyLocalizationInfos(a4_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[107]);
                    	    						addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[108]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[109]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[110]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[111]);
            	}

            a5=(Token)match(input,11,FOLLOW_11_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep1996); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionCallOperationStep();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[112]);
            	}

            a6=(Token)match(input,16,FOLLOW_16_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep2010); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionCallOperationStep();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[113]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[114]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping"
    // Device.g:2333:1: parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping returns [hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping element = null] : (a0= QUALIFIEDID ) ( (a1= '->' (a2= QUALIFIEDID ) ) )? ( (a3= ':' (a4= INT ) ) )? ( (a5= '+' (a6= INT ) ) )? ;
    public final hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping element =  null;

        int parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Device.g:2336:2: ( (a0= QUALIFIEDID ) ( (a1= '->' (a2= QUALIFIEDID ) ) )? ( (a3= ':' (a4= INT ) ) )? ( (a5= '+' (a6= INT ) ) )? )
            // Device.g:2337:2: (a0= QUALIFIEDID ) ( (a1= '->' (a2= QUALIFIEDID ) ) )? ( (a3= ':' (a4= INT ) ) )? ( (a5= '+' (a6= INT ) ) )?
            {
            // Device.g:2337:2: (a0= QUALIFIEDID )
            // Device.g:2338:3: a0= QUALIFIEDID
            {
            a0=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2043); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionParameterMapping();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument proxy = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationArgument();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new hu.modembed.model.textnotations.device.mopp.DeviceContextDependentURIFragmentFactory<hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping, hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstructionParameterMappingValueReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[115]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[116]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[117]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[118]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[119]);
            	}

            // Device.g:2381:2: ( (a1= '->' (a2= QUALIFIEDID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Device.g:2382:3: (a1= '->' (a2= QUALIFIEDID ) )
                    {
                    // Device.g:2382:3: (a1= '->' (a2= QUALIFIEDID ) )
                    // Device.g:2383:4: a1= '->' (a2= QUALIFIEDID )
                    {
                    a1=(Token)match(input,14,FOLLOW_14_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2073); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionParameterMapping();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[120]);
                    			}

                    // Device.g:2397:4: (a2= QUALIFIEDID )
                    // Device.g:2398:5: a2= QUALIFIEDID
                    {
                    a2=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2099); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionParameterMapping();
                    						startIncompleteElement(element);
                    					}
                    					if (a2 != null) {
                    						hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
                    						tokenResolver.setOptions(getOptions());
                    						hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__ATTRIBUTE), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
                    						}
                    						String resolved = (String) resolvedObject;
                    						hu.modembed.model.modembed.infrastructure.AttributeDefinition proxy = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeDefinition();
                    						collectHiddenTokens(element);
                    						registerContextDependentProxy(new hu.modembed.model.textnotations.device.mopp.DeviceContextDependentURIFragmentFactory<hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping, hu.modembed.model.modembed.infrastructure.AttributeDefinition>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstructionParameterMappingAttributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__ATTRIBUTE), resolved, proxy);
                    						if (proxy != null) {
                    							Object value = proxy;
                    							element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__ATTRIBUTE), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_1_0_0_1, proxy, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[121]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[122]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[123]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[124]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[125]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[126]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[127]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[128]);
            	}

            // Device.g:2450:2: ( (a3= ':' (a4= INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Device.g:2451:3: (a3= ':' (a4= INT ) )
                    {
                    // Device.g:2451:3: (a3= ':' (a4= INT ) )
                    // Device.g:2452:4: a3= ':' (a4= INT )
                    {
                    a3=(Token)match(input,15,FOLLOW_15_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2154); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionParameterMapping();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[129]);
                    			}

                    // Device.g:2466:4: (a4= INT )
                    // Device.g:2467:5: a4= INT
                    {
                    a4=(Token)match(input,INT,FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2180); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionParameterMapping();
                    						startIncompleteElement(element);
                    					}
                    					if (a4 != null) {
                    						hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT");
                    						tokenResolver.setOptions(getOptions());
                    						hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
                    						}
                    						java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_2_0_0_1, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[130]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[131]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[132]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[133]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[134]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[135]);
            	}

            // Device.g:2513:2: ( (a5= '+' (a6= INT ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Device.g:2514:3: (a5= '+' (a6= INT ) )
                    {
                    // Device.g:2514:3: (a5= '+' (a6= INT ) )
                    // Device.g:2515:4: a5= '+' (a6= INT )
                    {
                    a5=(Token)match(input,12,FOLLOW_12_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2235); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionParameterMapping();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[136]);
                    			}

                    // Device.g:2529:4: (a6= INT )
                    // Device.g:2530:5: a6= INT
                    {
                    a6=(Token)match(input,INT,FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2261); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionParameterMapping();
                    						startIncompleteElement(element);
                    					}
                    					if (a6 != null) {
                    						hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT");
                    						tokenResolver.setOptions(getOptions());
                    						hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE_OFFSET), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
                    						}
                    						java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE_OFFSET), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_3_0_0_1, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[137]);
                    				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[138]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[139]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[140]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_types_Type"
    // Device.g:2576:1: parse_hu_modembed_model_modembed_abstraction_types_Type returns [hu.modembed.model.modembed.abstraction.types.Type element = null] : a0= 'type' (a1= QUALIFIEDID ) a2= '=' (a3_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition ) a4= ';' ;
    public final hu.modembed.model.modembed.abstraction.types.Type parse_hu_modembed_model_modembed_abstraction_types_Type() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.types.Type element =  null;

        int parse_hu_modembed_model_modembed_abstraction_types_Type_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        hu.modembed.model.modembed.abstraction.types.TypeDefinition a3_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Device.g:2579:2: (a0= 'type' (a1= QUALIFIEDID ) a2= '=' (a3_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition ) a4= ';' )
            // Device.g:2580:2: a0= 'type' (a1= QUALIFIEDID ) a2= '=' (a3_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition ) a4= ';'
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_hu_modembed_model_modembed_abstraction_types_Type2322); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_0_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[141]);
            	}

            // Device.g:2594:2: (a1= QUALIFIEDID )
            // Device.g:2595:3: a1= QUALIFIEDID
            {
            a1=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_types_Type2340); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
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
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_0_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[142]);
            	}

            a2=(Token)match(input,17,FOLLOW_17_in_parse_hu_modembed_model_modembed_abstraction_types_Type2361); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_0_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[143]);
            		addExpectedElement(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[144]);
            	}

            // Device.g:2645:2: (a3_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition )
            // Device.g:2646:3: a3_0= parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition
            {
            pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_types_Type2379);
            a3_0=parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
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
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_0_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[145]);
            	}

            a4=(Token)match(input,16,FOLLOW_16_in_parse_hu_modembed_model_modembed_abstraction_types_Type2397); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_0_0_0_4, null, true);
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
            if ( state.backtracking>0 ) { memoize(input, 13, parse_hu_modembed_model_modembed_abstraction_types_Type_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_types_Type"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition"
    // Device.g:2686:1: parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition returns [hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition element = null] : a0= 'unsigned' a1= '(' (a2= INT ) a3= ')' ;
    public final hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition element =  null;

        int parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // Device.g:2689:2: (a0= 'unsigned' a1= '(' (a2= INT ) a3= ')' )
            // Device.g:2690:2: a0= 'unsigned' a1= '(' (a2= INT ) a3= ')'
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition2426); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_1_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[146]);
            	}

            a1=(Token)match(input,10,FOLLOW_10_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition2440); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_1_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[147]);
            	}

            // Device.g:2718:2: (a2= INT )
            // Device.g:2719:3: a2= INT
            {
            a2=(Token)match(input,INT,FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition2458); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
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
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_1_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[148]);
            	}

            a3=(Token)match(input,11,FOLLOW_11_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition2479); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_1_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[149]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[150]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition"
    // Device.g:2771:1: parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition returns [hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition element = null] : (a0= QUALIFIEDID ) ;
    public final hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition element =  null;

        int parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // Device.g:2774:2: ( (a0= QUALIFIEDID ) )
            // Device.g:2775:2: (a0= QUALIFIEDID )
            {
            // Device.g:2775:2: (a0= QUALIFIEDID )
            // Device.g:2776:3: a0= QUALIFIEDID
            {
            a0=(Token)match(input,QUALIFIEDID,FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition2512); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new hu.modembed.model.textnotations.device.mopp.DeviceTerminateParsingException();
            			}
            			if (element == null) {
            				element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createReferenceTypeDefinition();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				hu.modembed.model.textnotations.device.IDeviceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
            				tokenResolver.setOptions(getOptions());
            				hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				hu.modembed.model.modembed.abstraction.types.Type proxy = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new hu.modembed.model.textnotations.device.mopp.DeviceContextDependentURIFragmentFactory<hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition, hu.modembed.model.modembed.abstraction.types.Type>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferenceTypeDefinitionTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_2_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[151]);
            		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[152]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep"
    // Device.g:2818:1: parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep returns [hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep element = null] : c0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep ;
    public final hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep element =  null;

        int parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep_StartIndex = input.index();

        hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // Device.g:2819:2: (c0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep )
            // Device.g:2820:2: c0= parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep
            {
            pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep2544);
            c0=parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep"



    // $ANTLR start "parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition"
    // Device.g:2824:1: parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition returns [hu.modembed.model.modembed.abstraction.types.TypeDefinition element = null] : (c0= parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition |c1= parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition );
    public final hu.modembed.model.modembed.abstraction.types.TypeDefinition parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition() throws RecognitionException {
        hu.modembed.model.modembed.abstraction.types.TypeDefinition element =  null;

        int parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition_StartIndex = input.index();

        hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition c0 =null;

        hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // Device.g:2825:2: (c0= parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition |c1= parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            else if ( (LA20_0==QUALIFIEDID) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // Device.g:2826:2: c0= parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition
                    {
                    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition2565);
                    c0=parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Device.g:2827:4: c1= parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition
                    {
                    pushFollow(FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition2575);
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
            if ( state.backtracking>0 ) { memoize(input, 17, parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction115 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction133 = new BitSet(new long[]{0x0000000001810000L});
    public static final BitSet FOLLOW_23_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction163 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction189 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_24_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction244 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction270 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction316 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction352 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction402 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction452 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction498 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_26_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType546 = new BitSet(new long[]{0x0000000090200080L});
    public static final BitSet FOLLOW_31_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType569 = new BitSet(new long[]{0x0000000010200080L});
    public static final BitSet FOLLOW_21_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType599 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_28_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType629 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType654 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType675 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType693 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType714 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance778 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance796 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance817 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance835 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance856 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance874 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance895 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance909 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance927 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer_in_parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition985 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition_in_parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition1008 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_34_in_parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition1067 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer1117 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_infrastructure_AttributeValue_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer1140 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_34_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValue1199 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValue1220 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValue1238 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_hu_modembed_model_modembed_infrastructure_AttributeValue1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1288 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1306 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1327 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1356 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_13_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1397 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1431 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_11_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1505 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1519 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1542 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_34_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1601 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1622 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1640 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1658 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1676 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1706 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep1797 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep1818 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep1847 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_13_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep1888 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep1922 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_11_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep1996 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2043 = new BitSet(new long[]{0x000000000000D002L});
    public static final BitSet FOLLOW_14_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2073 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2099 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_15_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2180 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_hu_modembed_model_modembed_abstraction_types_Type2322 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_types_Type2340 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_hu_modembed_model_modembed_abstraction_types_Type2361 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_types_Type2379 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_hu_modembed_model_modembed_abstraction_types_Type2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition2426 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition2440 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition2458 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUALIFIEDID_in_parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep_in_parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition_in_parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition2575 = new BitSet(new long[]{0x0000000000000002L});

}