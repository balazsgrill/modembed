#!platform:/resource/e.core/syntax/sequential.syntax.m
module dio.driver.pic16f1824 device PIC16F1824.device;

uint8 RA0 = 0;
uint8 RA1 = 1;

read_dio1(state){
	getbit(PORTA, RA0, state)
}

write_dio2(state){
	setbit(PORTA, RA1, state)
}
