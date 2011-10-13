namespace spi;

import e.types;
import microchip.pic18;
import microchip.pic18.assisted;
import dio;

wait(){
	NOP();
	NOP();
	NOP();
}

SPI_Send(ChannelID clk, ChannelID tx, uint8 d){
	DIO_Set(clk,0);
	wait();
	DIO_Set(tx,d,0);
	wait();
	DIO_Set(clk,1);
	wait();
	
	DIO_Set(clk,0);
	wait();
	DIO_Set(tx,d,1);
	wait();
	DIO_Set(clk,1);
	wait();
	
	DIO_Set(clk,0);
	wait();
	DIO_Set(tx,d,2);
	wait();
	DIO_Set(clk,1);
	wait();
	
	DIO_Set(clk,0);
	wait();
	DIO_Set(tx,d,3);
	wait();
	DIO_Set(clk,1);
	wait();
	
	DIO_Set(clk,0);
	wait();
	DIO_Set(tx,d,4);
	wait();
	DIO_Set(clk,1);
	wait();
	
	DIO_Set(clk,0);
	wait();
	DIO_Set(tx,d,5);
	wait();
	DIO_Set(clk,1);
	wait();
	
	DIO_Set(clk,0);
	wait();
	DIO_Set(tx,d,6);
	wait();
	DIO_Set(clk,1);
	wait();
	
	DIO_Set(clk,0);
	wait();
	DIO_Set(tx,d,7);
	wait();
	DIO_Set(clk,1);
	wait();
}