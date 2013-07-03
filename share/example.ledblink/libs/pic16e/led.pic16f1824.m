#!module.syntax
module led.pic16f1824;

use led;
use PIC16F1824.interface;

void initLED(){
	PORTA = 0;
	
}

void turnOffLED();

void turnOnLED();