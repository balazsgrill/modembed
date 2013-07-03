#!module.syntax
module ledblink.main;

use utils;

void main(){
	initLED();
	
	loop{
		turnOnLED();
		waitCycle(1000);
		turnOffLED();
		waitCycle(1000);
	}
}