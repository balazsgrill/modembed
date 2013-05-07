#!syntax
syntax type.syntax <Start>;
import core.syntax;

terminal KEYWORD_TYPE "type";
terminal KEYWORD_UNSIGNED "unsigned";
terminal OPERATOR_ASSIGN "=";
terminal BRACKET_OPEN "\(";
terminal BRACKET_CLOSE "\)";

<Start> :- KEYWORD_TYPE {"http://modembed.hu/abstraction/types#Type" name=QUALIFIEDID OPERATOR_ASSIGN <Definition> OPERATOR_SEMICOLON;

<Definition> :- KEYWORD_UNSIGNED definition={"http://modembed.hu/abstraction/types#UnsignedTypeDefinition" BRACKET_OPEN bits=DECIMAL_NUMBER BRACKET_CLOSE };