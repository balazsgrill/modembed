#!module.syntax
module ledblink.main;

use utils;
use led;
const uint16 delay = 1000;

void main(){
	initLED();
	
	loop{
		turnOnLED();
		waitCycle(delay);
		turnOffLED();
		waitCycle(delay);
	}
}