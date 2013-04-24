@SuppressWarnings(featureWithoutSyntax, tokenOverlapping, noRuleForMetaClass)
SYNTAXDEF type
FOR <http://modembed.hu/abstraction/types> <platform:/resource/hu.modembed.model/model/modembed.genmodel>
START Type

OPTIONS { 
	disableLaunchSupport = "true";
	disableDebugSupport = "true";
    usePredefinedTokens = "false"; 
    basePackage = "hu.modembed.model.textnotations.type";
    uiBasePackage = "hu.modembed.model.textnotations.type.ui";
    resourcePluginID = "hu.modembed.model.textnotations.type";
    resourceUIPluginID = "hu.modembed.model.textnotations.type.ui";
    
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

	Type ::= "type" name[QUALIFIEDID] "=" ;
	
}

