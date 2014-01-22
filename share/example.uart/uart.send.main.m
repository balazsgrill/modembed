module uart.send.main;

use uart;

global void main(){
	var uint8 data;
	uart_init();
	
	loop{
		loop {} until uart_canSend();
		uart_send(5);
	}
}