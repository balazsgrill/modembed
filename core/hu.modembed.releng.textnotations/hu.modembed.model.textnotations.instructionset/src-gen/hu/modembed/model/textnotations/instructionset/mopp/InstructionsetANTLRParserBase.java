/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public abstract class InstructionsetANTLRParserBase extends org.antlr.runtime3_4_0.Parser implements hu.modembed.model.textnotations.instructionset.IInstructionsetTextParser {
	
	/**
	 * The index of the last token that was handled by retrieveLayoutInformation().
	 */
	private int lastPosition2;
	
	/**
	 * A collection to store all anonymous tokens.
	 */
	protected java.util.List<org.antlr.runtime3_4_0.CommonToken> anonymousTokens = new java.util.ArrayList<org.antlr.runtime3_4_0.CommonToken>();
	
	/**
	 * A collection that is filled with commands to be executed after parsing. This
	 * collection is cleared before parsing starts and returned as part of the parse
	 * result object.
	 */
	protected java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>> postParseCommands;
	
	/**
	 * A copy of the options that were used to load the text resource. This map is
	 * filled when the parser is created.
	 */
	private java.util.Map<?, ?> options;
	
	/**
	 * A flag that indicates whether this parser runs in a special mode where the
	 * location map is not filled. If this flag is set to true, copying localization
	 * information for elements is not performed. This improves time and memory
	 * consumption.
	 */
	protected boolean disableLocationMap = false;
	
	/**
	 * A flag that indicates whether this parser runs in a special mode where layout
	 * information is not recorded. If this flag is set to true, no layout information
	 * adapters are created. This improves time and memory consumption.
	 */
	protected boolean disableLayoutRecording = false;
	
	/**
	 * A flag to indicate that the parser should stop parsing as soon as possible. The
	 * flag is set to false before parsing starts. It can be set to true by invoking
	 * the terminateParsing() method from another thread. This feature is used, when
	 * documents are parsed in the background (i.e., while editing them). In order to
	 * cancel running parsers, the parsing process can be terminated. This is done
	 * whenever a document changes, because the previous content of the document is
	 * not valid anymore and parsing the old content is not necessary any longer.
	 */
	protected boolean terminateParsing;
	
	/**
	 * A reusable container for the result of resolving tokens.
	 */
	private hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenResolveResult tokenResolveResult = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenResolveResult();
	
	protected hu.modembed.model.textnotations.instructionset.mopp.InstructionsetMetaInformation metaInformation = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetMetaInformation();
	
	public InstructionsetANTLRParserBase(org.antlr.runtime3_4_0.TokenStream input) {
		super(input);
	}
	
	public InstructionsetANTLRParserBase(org.antlr.runtime3_4_0.TokenStream input, org.antlr.runtime3_4_0.RecognizerSharedState state) {
		super(input, state);
	}
	
	protected void retrieveLayoutInformation(org.eclipse.emf.ecore.EObject element, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement syntaxElement, Object object, boolean ignoreTokensAfterLastVisibleToken) {
		if (disableLayoutRecording || element == null) {
			return;
		}
		// null must be accepted, since the layout information that is found at the end of
		// documents (just before the EOF character) is not associated with a particular
		// syntax element.
		boolean isElementToStore = syntaxElement == null;
		isElementToStore |= syntaxElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder;
		isElementToStore |= syntaxElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword;
		isElementToStore |= syntaxElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetEnumerationTerminal;
		isElementToStore |= syntaxElement instanceof hu.modembed.model.textnotations.instructionset.grammar.InstructionsetBooleanTerminal;
		if (!isElementToStore) {
			return;
		}
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(element);
		StringBuilder anonymousText = new StringBuilder();
		for (org.antlr.runtime3_4_0.CommonToken anonymousToken : anonymousTokens) {
			anonymousText.append(anonymousToken.getText());
		}
		int currentPos = getTokenStream().index();
		if (currentPos == 0) {
			return;
		}
		int endPos = currentPos - 1;
		if (ignoreTokensAfterLastVisibleToken) {
			for (; endPos >= this.lastPosition2; endPos--) {
				org.antlr.runtime3_4_0.Token token = getTokenStream().get(endPos);
				int _channel = token.getChannel();
				if (_channel != 99) {
					break;
				}
			}
		}
		StringBuilder hiddenTokenText = new StringBuilder();
		hiddenTokenText.append(anonymousText);
		StringBuilder visibleTokenText = new StringBuilder();
		org.antlr.runtime3_4_0.CommonToken firstToken = null;
		for (int pos = this.lastPosition2; pos <= endPos; pos++) {
			org.antlr.runtime3_4_0.Token token = getTokenStream().get(pos);
			if (firstToken == null) {
				firstToken = (org.antlr.runtime3_4_0.CommonToken) token;
			}
			if (anonymousTokens.contains(token)) {
				continue;
			}
			int _channel = token.getChannel();
			if (_channel == 99) {
				hiddenTokenText.append(token.getText());
			} else {
				visibleTokenText.append(token.getText());
			}
		}
		int offset = -1;
		if (firstToken != null) {
			offset = firstToken.getStartIndex();
		}
		layoutInformationAdapter.addLayoutInformation(new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLayoutInformation(syntaxElement, object, offset, hiddenTokenText.toString(), visibleTokenText.toString()));
		this.lastPosition2 = (endPos < 0 ? 0 : endPos + 1);
		anonymousTokens.clear();
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
	
	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType container, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
		final int position;
		if (reference.isMany()) {
			position = ((java.util.List<?>) container.eGet(reference)).size();
		} else {
			position = -1;
		}
		
		postParseCommands.add(new hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>() {
			public boolean execute(hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.registerContextDependentProxy(factory, container, reference, id, proxy, position);
				return true;
			}
		});
	}
	
	protected java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
		this.disableLocationMap = !isLocationMapEnabled();
		this.disableLayoutRecording = !isLayoutInformationRecordingEnabled();
	}
	
	/**
	 * Creates a dynamic Java proxy that mimics the interface of the given class.
	 */
	@SuppressWarnings("unchecked")	
	public <T> T createDynamicProxy(Class<T> clazz) {
		Object proxy = java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{clazz, org.eclipse.emf.ecore.EObject.class, org.eclipse.emf.ecore.InternalEObject.class}, new java.lang.reflect.InvocationHandler() {
			
			private org.eclipse.emf.ecore.EObject dummyObject = new org.eclipse.emf.ecore.impl.EObjectImpl() {};
			
			public Object invoke(Object object, java.lang.reflect.Method method, Object[] args) throws Throwable {
				// search in dummyObject for the requested method
				java.lang.reflect.Method[] methodsInDummy = dummyObject.getClass().getMethods();
				for (java.lang.reflect.Method methodInDummy : methodsInDummy) {
					boolean matches = true;
					if (methodInDummy.getName().equals(method.getName())) {
						Class<?>[] parameterTypes = method.getParameterTypes();
						Class<?>[] parameterTypesInDummy = methodInDummy.getParameterTypes();
						if (parameterTypes.length == parameterTypesInDummy.length) {
							for (int p = 0; p < parameterTypes.length; p++) {
								Class<?> parameterType = parameterTypes[p];
								Class<?> parameterTypeInDummy = parameterTypesInDummy[p];
								if (!parameterType.equals(parameterTypeInDummy)) {
									matches = false;
								}
							}
						} else {
							matches = false;
						}
					} else {
						matches = false;
					}
					if (matches) {
						return methodInDummy.invoke(dummyObject, args);
					}
				}
				return null;
			}
		});
		return (T) proxy;
	}
	
	public void terminate() {
		terminateParsing = true;
	}
	
	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetDummyEObject dummy) {
		Object value = element.eGet(structuralFeature);
		Object mapKey = dummy.getValueByName("key");
		Object mapValue = dummy.getValueByName("value");
		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
			org.eclipse.emf.common.util.EMap<Object, Object> valueMap = hu.modembed.model.textnotations.instructionset.util.InstructionsetMapUtil.castToEMap(value);
			if (mapKey != null && mapValue != null) {
				valueMap.put(mapKey, mapValue);
			}
		}
	}
	
	@SuppressWarnings("unchecked")	
	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, int featureID, Object object) {
		return ((java.util.List<Object>) container.eGet(container.eClass().getEStructuralFeature(featureID))).add(object);
	}
	
	@SuppressWarnings("unchecked")	
	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EStructuralFeature feature, Object object) {
		return ((java.util.List<Object>) container.eGet(feature)).add(object);
	}
	
	protected org.eclipse.emf.ecore.EObject apply(org.eclipse.emf.ecore.EObject target, java.util.List<org.eclipse.emf.ecore.EObject> dummyEObjects) {
		org.eclipse.emf.ecore.EObject currentTarget = target;
		for (org.eclipse.emf.ecore.EObject object : dummyEObjects) {
			assert(object instanceof hu.modembed.model.textnotations.instructionset.mopp.InstructionsetDummyEObject);
			hu.modembed.model.textnotations.instructionset.mopp.InstructionsetDummyEObject dummy = (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetDummyEObject) object;
			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
			currentTarget = newEObject;
		}
		return currentTarget;
	}
	
	protected hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenResolveResult getFreshTokenResolveResult() {
		tokenResolveResult.clear();
		return tokenResolveResult;
	}
	
	protected hu.modembed.model.textnotations.instructionset.mopp.InstructionsetReferenceResolverSwitch getReferenceResolverSwitch() {
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetReferenceResolverSwitch resolverSwitch = (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetReferenceResolverSwitch) metaInformation.getReferenceResolverSwitch();
		resolverSwitch.setOptions(options);
		return resolverSwitch;
	}
	
	public boolean isLayoutInformationRecordingEnabled() {
		if (options == null) {
			return true;
		}
		Object value = options.get(hu.modembed.model.textnotations.instructionset.IInstructionsetOptions.DISABLE_LAYOUT_INFORMATION_RECORDING);
		return value == null || Boolean.FALSE.equals(value);
	}
	
	public boolean isLocationMapEnabled() {
		if (options == null) {
			return true;
		}
		Object value = options.get(hu.modembed.model.textnotations.instructionset.IInstructionsetOptions.DISABLE_LOCATION_MAP);
		return value == null || Boolean.FALSE.equals(value);
	}
	
}
