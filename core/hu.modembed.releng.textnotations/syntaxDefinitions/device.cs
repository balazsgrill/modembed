@SuppressWarnings(featureWithoutSyntax, tokenOverlapping, noRuleForMetaClass)
SYNTAXDEF device
FOR <http://modembed.hu/abstraction> <platform:/resource/hu.modembed.model/model/modembed.genmodel>
START DeviceAbstraction

IMPORTS { 
	memmodel : <http://modembed.hu/abstraction/memorymodel> <platform:/resource/hu.modembed.model/model/modembed.genmodel>
	platform : <http://modembed.hu/abstraction/behavior/platform> <platform:/resource/hu.modembed.model/model/modembed.genmodel>
}

OPTIONS { 
	disableLaunchSupport = "true";
	disableDebugSupport = "true";
    usePredefinedTokens = "false"; 
    basePackage = "hu.modembed.model.textnotations.device";
    uiBasePackage = "hu.modembed.model.textnotations.device.ui";
    resourcePluginID = "hu.modembed.model.textnotations.device";
    resourceUIPluginID = "hu.modembed.model.textnotations.device.ui";
    
    // disable stuff we don't need	
	disableBuilder = "true";
	// we need to disable the use of the EMF validation framework, because
	// it does not run outside of Eclipse properly, which conflicts with
	// the EMFText ANT task 
	disableEMFValidationConstraints = "true";
	// we also need to disable the EValidators since they do cause problems
	// as well 
	disableEValidators = "true";
}

TOKENS { 
	DEFINE SL_COMMENT $'//'(~('\n'|'\r'|'\uffff'))* $;
	DEFINE ML_COMMENT $'/*'.*'*/'$;

    // simple token
    DEFINE FRAGMENT CHAR $('a'..'z'|'A'..'Z')$; 
    // helper token - not used on its own 
    DEFINE FRAGMENT DIGIT $('0'..'9')$; 
    // composed token 
    DEFINE IDENTIFIER CHAR + $($ + CHAR + $|$ + DIGIT + $)*$; 
    
    DEFINE QUALIFIEDID IDENTIFIER + $($ + $'\.'$ + IDENTIFIER + $)*$;
    
    DEFINE INT $($ + DIGIT + $)+$;
    
    DEFINE BINARY $'0b'('0'|'1')*$ ;
    
    @SuppressWarnings(unusedToken)
	DEFINE WHITESPACE $(' '|'\t'|'\f'|'\r'|'\n')+$;
}

RULES{

	DeviceAbstraction ::= "device" name[QUALIFIEDID]
		("extends" ancestor[QUALIFIEDID])?
		("instructionset" instructionset[QUALIFIEDID])? ";"
		
		( memoryTypes | memoryInstances | operation )*
	;
	
	memmodel.MemoryType ::= "mtype";
	
	memmodel.MemoryInstance ::= "minstance";
	
	platform.OperationDefinition ::= "operation" ;
	
}
