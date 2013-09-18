#!platform:/resource/e.core/syntax/syntax.model
syntax expressions.syntax <Expression>;
import core.syntax;
import basic.operators;
import type.syntax;

terminal OP_ADD "\+";
terminal OP_MULTIPLY "\*";
terminal OP_MINUS "\-";
terminal OP_NOT "\!";

terminal OP_LSHIFT "<<";
terminal OP_RSHIFT ">>";

terminal OP_CMP_EQ "==";
terminal OP_CMP_NEQ "!=";
terminal OP_CMP_GT ">";
terminal OP_CMP_GTE ">=";
terminal OP_CMP_LT "<";
terminal OP_CMP_LTE "<=";

<Expression0> :- BRACKET_OPEN <Expression> BRACKET_CLOSE;
 
<Expression0> :- <IntegerConstExpression>; 
<IntegerConstExpression> :- {"http://modembed.hu/infrastructure/expressions#IntegerConstantExpression" <IntegerConstExpression_value> };
<IntegerConstExpression_value> :- value=DECIMAL_NUMBER;
<IntegerConstExpression_value> :- value=BINARY_NUMBER;
<IntegerConstExpression_value> :- value=HEXADECIMAL_NUMBER;

<Expression> :- <Expression7>;

/* Assign expressions */
<Expression7> :- <Expression6>;
<Expression7> :- {"http://modembed.hu/infrastructure/expressions#OperationExpression" arguments=<Expression6> <E7> arguments=<Expression7> };
<E7> :- OPERATOR_ASSIGN operation="assign";

/* Comparison expressions */
<Expression6> :- <Expression5>;
<Expression6> :- {"http://modembed.hu/infrastructure/expressions#OperationExpression" arguments=<Expression5> <E6> arguments=<Expression6> };
<E6> :- OP_CMP_EQ operation="equals";
<E6> :- OP_CMP_NEQ operation="notEquals";
<E6> :- OP_CMP_GT operation="greater";
<E6> :- OP_CMP_GTE operation="greaterEquals";
<E6> :- OP_CMP_LT operation="lower";
<E6> :- OP_CMP_LTE operation="lowerEquals";

/* Additive expressions */
<Expression5> :- <Expression4>;
<Expression5> :- {"http://modembed.hu/infrastructure/expressions#OperationExpression" arguments=<Expression4> <E5> arguments=<Expression5> };
<E5> :- OP_ADD operation="add";
<E5> :- OP_MINUS operation="subtract";

/* Multiplicative expressions */
<Expression4> :- <Expression3>;
<Expression4> :- {"http://modembed.hu/infrastructure/expressions#OperationExpression" arguments=<Expression3> <E4> arguments=<Expression4> };
<E4> :- OP_MULTIPLY operation="multiply";

/* Shift expressions */
<Expression3> :- <Expression2>;
<Expression3> :- {"http://modembed.hu/infrastructure/expressions#OperationExpression" arguments=<Expression2> <E3> arguments=<Expression3> };
<E3> :- OP_LSHIFT operation="lshift";
<E3> :- OP_RSHIFT operation="rshift";

/* Unary prefix expressions */
<Expression2> :- <Expression1>;
<Expression2> :- {"http://modembed.hu/infrastructure/expressions#OperationExpression" <E2> arguments=<Expression2> };
<E2> :- OP_MINUS operation="minus";
<E2> :- OP_NOT operation="not";

/* Postfix expressions */
<Expression1> :- <Expression0>;
<Expression1> :- {"http://modembed.hu/infrastructure/expressions#OperationExpression" arguments=<Expression0> OP_INDEX_OPEN operation="access_indexed" arguments=<Expression> OP_INDEX_CLOSE }; 
