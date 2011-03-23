lexer grammar InternalModularASM;
@header {
package hu.cubussapiens.modembed.modularasm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'module' ;
T13 : 'target' ;
T14 : '{' ;
T15 : '(' ;
T16 : ')' ;
T17 : '}' ;
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
T28 : 'method' ;
T29 : 'label' ;

// $ANTLR src "../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g" 1861
RULE_HEXINT : '0x' ('0'..'9'|'A'..'F'|'a'..'f')+;

// $ANTLR src "../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g" 1863
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g" 1865
RULE_INT : ('0'..'9')+;

// $ANTLR src "../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g" 1867
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g" 1869
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g" 1871
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g" 1873
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../hu.cubussapiens.modembed.modularasm/src-gen/hu/cubussapiens/modembed/modularasm/parser/antlr/internal/InternalModularASM.g" 1875
RULE_ANY_OTHER : .;


