module led.pic16f1824;

use led;
use PIC16F1824.interface;

void initLED(){
	PORTA = 0;
	LATA = 0;
}

void turnOffLED(){
	LATA[0] = 0;
}

void turnOnLED(){
	LATA[0] = 1;
}