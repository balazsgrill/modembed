#!module.syntax
module ledblink.main;

use utils;
use led;

void main(){
	initLED();
	
	loop{
		turnOnLED();
		waitCycle(1000);
		turnOffLED();
		waitCycle(1000);
	}
}