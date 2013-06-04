#!sequential.syntax
module dio.driver.pic16f1824 device PIC16F1824.device;

read_dio1(state){
	getbit(PORTA, 0, state);
}

write_dio2(state){
	setbit(PORTA, 1, state);
}
