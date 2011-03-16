lexer grammar InternalModularASM;
@header {
package hu.cubussapiens.modembed.modularasm.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'module' ;
T13 : 'target' ;
T14 : '{' ;
T15 : '}' ;
T16 : '(' ;
T17 : ')' ;
T18 : '.' ;
T19 : ';' ;
T20 : 'config' ;
T21 : 'at' ;
T22 : 'enum' ;
T23 : '=' ;
T24 : 'symbol' ;
T25 : 'var' ;
T26 : 'instance' ;
T27 : 'func' ;
T28 : 'label' ;

// $ANTLR src "../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g" 3248
RULE_HEXINT : '0x' ('0'..'9'|'A'..'F'|'a'..'f')+;

// $ANTLR src "../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g" 3250
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g" 3252
RULE_INT : ('0'..'9')+;

// $ANTLR src "../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g" 3254
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g" 3256
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g" 3258
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g" 3260
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../hu.cubussapiens.modembed.modularasm.ui/src-gen/hu/cubussapiens/modembed/modularasm/ui/contentassist/antlr/internal/InternalModularASM.g" 3262
RULE_ANY_OTHER : .;


