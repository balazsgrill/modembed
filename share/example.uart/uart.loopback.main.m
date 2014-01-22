module uart.loopback.main;

use uart;

global void main(){
	var uint8 data;
	uart_init();
	
	loop{
		loop {} until uart_canReceive();
		data = uart_receive();
		
		loop {} until uart_canSend();
		uart_send(data);
	}
}