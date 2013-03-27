library blink.main;

use e.platform;
use pic16.platform;
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
	
	SELECTB(&LATA);
	loop({
		NOP();
		NOP();
		COMF(&LATA);
	});
}