#!platform:/resource/e.core/syntax/syntax.model
syntax mappingrules.syntax <Root>;
import core.syntax;

terminal KW_DEVICE "device";
terminal KW_RULES "rules";

<Root> :- KW_RULES {"http://modembed.hu/abstraction/behavior#SymbolMappingRules" 
			name=QUALIFIEDID KW_DEVICE device=QUALIFIEDID OPERATOR_SEMICOLON <Rule>*? ;
			
<Rule> :- rules={"http://modembed.hu/abstraction/behavior#SymbolMappingRule" memInstance=IDENTIFIER 
			<StartAddress> <EndAddress> <Class>*? OPERATOR_SEMICOLON };
			
<StartAddress> :- startAddress=DECIMAL_NUMBER;
<StartAddress> :- startAddress=HEXADECIMAL_NUMBER;
<StartAddress> :- startAddress=BINARY_NUMBER;

<EndAddress> :- endAddress=DECIMAL_NUMBER;
<EndAddress> :- endAddress=HEXADECIMAL_NUMBER;
<EndAddress> :- endAddress=BINARY_NUMBER;

<Class> :- classes=IDENTIFIER;
