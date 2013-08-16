#!module.syntax
module led.pic18f14k50;

use led;
use PIC18F14K50.interface;

void initLED(){
	PORTC = 0;
	LATC = 0;
}

void turnOffLED(){
	LATC[0] = 0;
}

void turnOnLED(){
	LATC[0] = 1;
}