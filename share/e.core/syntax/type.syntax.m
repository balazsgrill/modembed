#!syntax
syntax type.syntax <Type>;
import core.syntax;

terminal KEYWORD_TYPE "type";
terminal KEYWORD_UNSIGNED "unsigned";
terminal OPERATOR_ASSIGN "=";
terminal BRACKET_OPEN "\(";
terminal BRACKET_CLOSE "\)";
terminal KEYWORD_LABEL "label";

<Type> :- KEYWORD_TYPE {"http://modembed.hu/abstraction/types#Type" name=QUALIFIEDID OPERATOR_ASSIGN definition=<TypeDefinition> OPERATOR_SEMICOLON;

<TypeDefinition> :- KEYWORD_UNSIGNED {"http://modembed.hu/abstraction/types#UnsignedTypeDefinition" BRACKET_OPEN bits=DECIMAL_NUMBER BRACKET_CLOSE };

<TypeDefinition> :- {"http://modembed.hu/abstraction/types#ReferenceTypeDefinition" type=QUALIFIEDID };

<TypeDefinition> :- KEYWORD_LABEL {"http://modembed.hu/abstraction/types#CodeLabelTypeDefinition" };