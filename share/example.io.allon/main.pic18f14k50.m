#!module.syntax
module main.pic18f14k50;

use PIC18F14K50.interface;

void main(){
	TRISA = 0;
	TRISB = 0;
	TRISC = 0;
	LATA = 255;
	LATB = 255;
	LATC = 255;
	loop{}
}