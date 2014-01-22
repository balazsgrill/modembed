module main.pic16f1824;

use PIC16F1824.interface;

void main(){
	TRISA = 0;
	TRISC = 0;
	LATA = 255;
	LATC = 255;
	loop{}
}