SYNTAXDEF instructionset
FOR <http://modembed.hu/core/instructionset> <platform:/resource/hu.modembed.model/model/modembed.genmodel>
START InstructionSet

OPTIONS { 
    usePredefinedTokens = "true"; 
    basePackage = "hu.modembed.model.textnotations.instructionset";
    uiBasePackage = "hu.modembed.model.textnotations.instructionset.ui";
    resourcePluginID = "hu.modembed.model.textnotations.instructionset";
    resourceUIPluginID = "hu.modembed.model.textnotations.instructionset.ui";
}

TOKENS { 
    // simple token
    DEFINE CHAR $('a'..'z'|'A'..'Z')$; 
    // helper token - not used on its own 
    DEFINE FRAGMENT DIGIT $('0'..'9')$; 
    // composed token 
    DEFINE IDENTIFIER CHAR + $($ + CHAR + $|$ + DIGIT + $)*$; 
    
    DEFINE QUALIFIEDID IDENTIFIER + $($ + $'\.'$ + IDENTIFIER + $)*$;
    
    DEFINE INT $($ + DIGIT + $)+$;
    
    DEFINE BINARY $'0b'('0'|'1')*$ ;
}

RULES{

	InstructionSet ::= 
			"instructionset" name[QUALIFIEDID] ";" 
			("extends" extend[QUALIFIEDID])?  
			( instructions : Instruction )*;

	Instruction ::=
		name[]
		( parameters : InstructionParameter )*
		( words : InstructionWord )*
		;
	
	InstructionParameter ::=
		id[IDENTIFIER] (defaultValue[INT])?;
	
	InstructionWord ::=
		"<" (sections : ConstantSection, ParameterSection)*
		">" 
		;
	
	ConstantSection ::=
		value[BINARY] ":" size[BINARY] (":" shift[BINARY])? ;
	
	ParameterSection ::=
		parameter[IDENTIFIER] ":" size[BINARY] (":" shift[BINARY])? ;
	
}

