library blink;

use microchip.pic16.instructions;
use microchip.pic16.enchanced.instructions;

function main void(){
	MOVLP(0);
	GOTO(start);
	NOP();
	
	label start;
	MOVLB(3);
	CLRF(12);
	CLRF(14);
	
	MOVLB(1);
	CLRF(29);
	CLRF(30);
	
	MOVLB(2);
	CLRF(17);
	CLRF(18);
	CLRF(19);
	GOTO(start);
}