#!platform:/resource/e.core/syntax/sequential.syntax.m
module dio.driver.pic18f14k50 device PIC18F14K50.device;

uint8 RA0 = 0;
uint8 RA1 = 1;

read_dio1(state){
	getbit(PORTA, RA0, state)
}

write_dio2(state){
	setbit(PORTA, RA1, state)
}
