grammar Device;

options {
	superClass = DeviceANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package hu.modembed.model.textnotations.device.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionPositions = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionPositions.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
	}
}
@header{
	package hu.modembed.model.textnotations.device.mopp;
}

@members{
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[0]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_hu_modembed_model_modembed_abstraction_DeviceAbstraction returns [hu.modembed.model.modembed.abstraction.DeviceAbstraction element = null]
@init{
}
:
	a0 = 'device' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[1]);
	}
	
	(
		a1 = QUALIFIEDID		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[2]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[3]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[4]);
	}
	
	(
		(
			a2 = 'extends' {
				if (element == null) {
					element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[5]);
			}
			
			(
				a3 = QUALIFIEDID				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[6]);
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[7]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[8]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[9]);
	}
	
	(
		(
			a4 = 'instructionset' {
				if (element == null) {
					element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[10]);
			}
			
			(
				a5 = QUALIFIEDID				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[11]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[12]);
	}
	
	a6 = ';' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[13]);
		addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[14]);
		addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[15]);
	}
	
	(
		(
			(
				(
					a7_0 = parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[16]);
				}
				
				
				|				(
					a8_0 = parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[17]);
				}
				
				
				|				(
					a9_0 = parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[18]);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[19]);
			}
			
			a10 = ';' {
				if (element == null) {
					element = hu.modembed.model.modembed.abstraction.AbstractionFactory.eINSTANCE.createDeviceAbstraction();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[20]);
				addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[21]);
				addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[22]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[23]);
		addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[24]);
		addExpectedElement(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[25]);
	}
	
;

parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType returns [hu.modembed.model.modembed.abstraction.memorymodel.MemoryType element = null]
@init{
}
:
	a0 = 'mtype' {
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
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[26]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[27]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[28]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[29]);
	}
	
	(
		(
			a1 = 'volatile' {
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
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[30]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[31]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[32]);
	}
	
	(
		(
			a4 = 'data' {
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
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[33]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[34]);
	}
	
	(
		(
			a7 = 'program' {
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
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[35]);
	}
	
	(
		a10 = QUALIFIEDID		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[36]);
	}
	
	a11 = '(' {
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
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[37]);
	}
	
	(
		a12 = INT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[38]);
	}
	
	a13 = ')' {
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
	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[39]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[40]);
	}
	
	(
		(
			a14_0 = parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[41]);
	}
	
;

parse_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance returns [hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance element = null]
@init{
}
:
	a0 = 'minstance' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[42]);
	}
	
	(
		a1 = QUALIFIEDID		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[43]);
	}
	
	a2 = '[' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[44]);
	}
	
	(
		a3 = INT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[45]);
	}
	
	a4 = ',' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[46]);
	}
	
	(
		a5 = INT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[47]);
	}
	
	a6 = ']' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[48]);
	}
	
	a7 = ':' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory.eINSTANCE.createMemoryInstance();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[49]);
	}
	
	(
		a8 = QUALIFIEDID		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[50]);
	}
	
	(
		a9_0 = parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[51]);
	}
	
;

parse_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition returns [hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition element = null]
@init{
}
:
	a0 = '{' {
		if (element == null) {
			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeContainerDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[52]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[53]);
	}
	
	(
		(
			a1_0 = parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[54]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[55]);
	}
	
	a2 = '}' {
		if (element == null) {
			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeContainerDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_3_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[56]);
	}
	
;

parse_hu_modembed_model_modembed_infrastructure_AttributeDefinition returns [hu.modembed.model.modembed.infrastructure.AttributeDefinition element = null]
@init{
}
:
	(
		a0 = QUALIFIEDID		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[57]);
	}
	
	a1 = ';' {
		if (element == null) {
			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_4_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[58]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[59]);
	}
	
;

parse_hu_modembed_model_modembed_infrastructure_AttributeValueContainer returns [hu.modembed.model.modembed.infrastructure.AttributeValueContainer element = null]
@init{
}
:
	a0 = '{' {
		if (element == null) {
			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeValueContainer();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValueContainer(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[60]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[61]);
	}
	
	(
		(
			a1_0 = parse_hu_modembed_model_modembed_infrastructure_AttributeValue			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValueContainer(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[62]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[63]);
	}
	
	a2 = '}' {
		if (element == null) {
			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeValueContainer();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_5_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[64]);
	}
	
;

parse_hu_modembed_model_modembed_infrastructure_AttributeValue returns [hu.modembed.model.modembed.infrastructure.AttributeValue element = null]
@init{
}
:
	(
		a0 = QUALIFIEDID		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[65]);
	}
	
	a1 = '=' {
		if (element == null) {
			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeValue();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_6_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[66]);
	}
	
	(
		a2 = INT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[67]);
	}
	
	a3 = ';' {
		if (element == null) {
			element = hu.modembed.model.modembed.infrastructure.InfrastructureFactory.eINSTANCE.createAttributeValue();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_6_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValueContainer(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[68]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[69]);
	}
	
;

parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition returns [hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition element = null]
@init{
}
:
	a0 = 'operation' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[70]);
	}
	
	(
		a1 = QUALIFIEDID		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[71]);
	}
	
	a2 = '(' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[72]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[73]);
	}
	
	(
		(
			(
				a3_0 = parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[74]);
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[75]);
			}
			
			(
				(
					a4 = ',' {
						if (element == null) {
							element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_3_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[76]);
					}
					
					(
						a5_0 = parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[77]);
						addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[78]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[79]);
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[80]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[81]);
	}
	
	a6 = ')' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[82]);
	}
	
	a7 = '{' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[83]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[84]);
	}
	
	(
		(
			a8_0 = parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[85]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[86]);
	}
	
	a9 = '}' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[87]);
	}
	
;

parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument returns [hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument element = null]
@init{
}
:
	(
		a0 = QUALIFIEDID		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[88]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationArgument();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[89]);
		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[90]);
	}
	
	(
		a2_0 = parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[91]);
	}
	
	a3 = '|' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationArgument();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[92]);
	}
	
	(
		a4 = INT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[93]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[94]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[95]);
	}
	
	(
		(
			a5 = '@' {
				if (element == null) {
					element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createOperationArgument();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[96]);
			}
			
			(
				a6 = QUALIFIEDID				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[97]);
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[98]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[99]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[100]);
	}
	
;

parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep returns [hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep element = null]
@init{
}
:
	(
		a0 = QUALIFIEDID		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[101]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionCallOperationStep();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[102]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[103]);
	}
	
	(
		(
			(
				a2_0 = parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[104]);
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[105]);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionCallOperationStep();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[106]);
					}
					
					(
						a4_0 = parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[107]);
						addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[108]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[109]);
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[110]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[111]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionCallOperationStep();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[112]);
	}
	
	a6 = ';' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionCallOperationStep();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[113]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[114]);
	}
	
;

parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping returns [hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping element = null]
@init{
}
:
	(
		a0 = QUALIFIEDID		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[115]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[116]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[117]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[118]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[119]);
	}
	
	(
		(
			a1 = '->' {
				if (element == null) {
					element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionParameterMapping();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[120]);
			}
			
			(
				a2 = QUALIFIEDID				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[121]);
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[122]);
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[123]);
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[124]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[125]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[126]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[127]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[128]);
	}
	
	(
		(
			a3 = ':' {
				if (element == null) {
					element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionParameterMapping();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[129]);
			}
			
			(
				a4 = INT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[130]);
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[131]);
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[132]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[133]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[134]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[135]);
	}
	
	(
		(
			a5 = '+' {
				if (element == null) {
					element = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory.eINSTANCE.createInstructionParameterMapping();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[136]);
			}
			
			(
				a6 = INT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[137]);
				addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[138]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[139]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[140]);
	}
	
;

parse_hu_modembed_model_modembed_abstraction_types_Type returns [hu.modembed.model.modembed.abstraction.types.Type element = null]
@init{
}
:
	a0 = 'type' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[141]);
	}
	
	(
		a1 = QUALIFIEDID		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[142]);
	}
	
	a2 = '=' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_0_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[143]);
		addExpectedElement(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType(), hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[144]);
	}
	
	(
		a3_0 = parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[145]);
	}
	
	a4 = ';' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_0_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition returns [hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition element = null]
@init{
}
:
	a0 = 'unsigned' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[146]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_1_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[147]);
	}
	
	(
		a2 = INT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[148]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = hu.modembed.model.modembed.abstraction.types.TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_1_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[149]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[150]);
	}
	
;

parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition returns [hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition element = null]
@init{
}
:
	(
		a0 = QUALIFIEDID		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[151]);
		addExpectedElement(null, hu.modembed.model.textnotations.device.mopp.DeviceExpectationConstants.EXPECTATIONS[152]);
	}
	
;

parse_hu_modembed_model_modembed_abstraction_behavior_platform_OperationStep returns [hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep element = null]
:
	c0 = parse_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_hu_modembed_model_modembed_abstraction_types_TypeDefinition returns [hu.modembed.model.modembed.abstraction.types.TypeDefinition element = null]
:
	c0 = parse_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

SL_COMMENT:
	('//'(~('\n'|'\r'|'\uffff'))* )
	{ _channel = 99; }
;
ML_COMMENT:
	('/*'.*'*/')
	{ _channel = 99; }
;
QUALIFIEDID:
	(('a'..'z'|'A'..'Z')(('a'..'z'|'A'..'Z')|('0'..'9'))*('\.'('a'..'z'|'A'..'Z')(('a'..'z'|'A'..'Z')|('0'..'9'))*)*)
;
INT:
	((('0'..'9'))+)
;
BINARY:
	('0b'('0'|'1')*)
	{ _channel = 99; }
;
WHITESPACE:
	((' '|'\t'|'\f'|'\r'|'\n')+)
	{ _channel = 99; }
;

