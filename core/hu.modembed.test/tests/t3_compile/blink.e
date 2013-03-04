library blink;

use microchip.pic16.instructions;
use microchip.pic16.enchanced.instructions;
use microchip.PIC16F1824;

function main void(){
	MOVLP(0);
	GOTO(start);
	NOP();
	
	label start;
	PORTA = 0;
	TRISA = 0;
	
	label loop;
	NOP();
	NOP();
	COMF(LATA);
	GOTO(loop);
}