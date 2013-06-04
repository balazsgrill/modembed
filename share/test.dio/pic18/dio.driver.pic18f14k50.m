#!sequential.syntax
module dio.driver.pic18f14k50 device PIC18F14K50.device;

read_dio1(state){
	getbit(PORTA, 0, state);
}

write_dio2(state){
	setbit(PORTA, 1, state);
}
