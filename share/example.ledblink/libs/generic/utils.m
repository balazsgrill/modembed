module utils;

void waitCycle(uint16 cycles){
	var uint16 counter = cycles;
	loop while(counter > 0){
		doNothing();
		counter = counter-1;
	}
}

void doNothing(){}
