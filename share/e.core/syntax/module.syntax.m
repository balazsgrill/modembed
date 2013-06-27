#!syntax
syntax module.syntax <Module>;
import core.syntax;
import type.syntax;

terminal KW_MODULE "module";
terminal KW_USE "use";
terminal KW_CONST "const";
terminal OP_COMMA ",";

<Module> :- KW_MODULE {"http://modembed.hu/structured#StructuredModule" name=QUALIFIEDID OPERATOR_SEMICOLON <ModuleItem>*? ;

<ModuleItem> :- <UsesDeclaration>;
<ModuleItem> :- variables=<VariableDeclaration> OPERATOR_SEMICOLON;

<UsesDeclaration> :- KW_USE uses=QUALIFIEDID OPERATOR_SEMICOLON;
<VariableDeclaration> :- {"http://modembed.hu/structured#VariableDeclaration" 
						const=KW_CONST? type=<TypeDefinition> name=IDENTIFIER <VariableInitValue>? };
<VariableInitValue> :- OPERATOR_ASSIGN initValue=<Expression> ;

<Function> :- {"http://modembed.hu/structured#StructuredFunction" resultType=<TypeDefinition> name=IDENTIFIER 
	BRACKET_OPEN BRACKET_CLOSE <FunctionImplementation> };						
						
<FunctionParameters> :- <FunctionParameter>;
<FunctionParameters> :- <FunctionParameter> OP_COMMA <FunctionParameter>;
<FunctionParameter> :- parameters=<VariableDeclaration>;

<FunctionImplementation> :- implementation=<Operation>;
<FunctionImplementation> :- OPERATION_SEMICOLON;


<Expression> :- <IntegerConstExpression>; 
<IntegerConstExpression> :- {"http://modembed.hu/structured#IntegerConstExpression" <IntegerConstExpression_value> };
<IntegerConstExpression_value> :- value=DECIMAL_NUMBER;
<IntegerConstExpression_value> :- value=BINARY_NUMBER;
<IntegerConstExpression_value> :- value=HEXADECIMAL_NUMBER;