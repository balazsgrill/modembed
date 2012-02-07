library test;

use e.platform;
use microchip.pic18;
use microchip.pic18.assisted;
use microchip.PIC18F14K50;
import dio;
import spi;
import pic18f14k50.eusart;

reg uint8 ANSEL : 0xF7E;
reg uint8 ANSELH : 0xF7F;

wait(){
	uint8 counter;
	aCLRF(addr(counter));
	label countstart;
	NOP();
	NOP();
	NOP();
	aINCFSZ(addr(counter));
	GOTO(@countstart);
}

wait2(){
	uint8 counter;
	aCLRF(addr(counter));
	label countstart;
	wait();
	aINCFSZ(addr(counter));
	GOTO(@countstart);
}

wait3(){
	uint8 counter;
	aCLRF(addr(counter));
	label countstart;
	wait2();
	aINCFSZ(addr(counter));
	GOTO(@countstart);
}

main(){
	uint8 rcv;
	uint8 send;
	uint8 display;
	
	OSCCON = 0x50;
	
	ANSEL = 0;
	ANSELH = 0;
	TRISC = 0;
	PORTC = 0;
	LATC = 0;
	send = 0;
	rcv = 0;
	PORTB = 0;
	LATB = 0;
	TRISB = 0;
	
	display = 0xFF;
	RS232_init();
	
	label start;
	
	/* Send data to display */
	SPI_Send(RC0, RC1, display);
	
	/* Communicate */
	RS232_syncSend(send,rcv);
	
	/* Send back the same */
	rcv = send;
	
	/* Display received value */
	rcv = display;
	
	wait();
	GOTO(@start);
}

binary config{
	data {
		0;
		CONFIG1H_FCMEN_Disabled+CONFIG1H_IESO_Disabled+CONFIG1H_OSC_INTRCPortonRA6PortonRA7;
		CONFIG2L_BODENV__20V+CONFIG2L_BODEN_DisabledinhardwareSBORENdisabled+CONFIG2L_PUT_Disabled;
		CONFIG2H_WDTPS__18192+CONFIG2H_WDT_DisabledControlledbySWDTENbit;
		0;
		CONFIG3H_CCP2MUX_RB3+CONFIG3H_LPT1OSC_Disabled+CONFIG3H_MCLRE_MCLRDisabledRE3Enabled+CONFIG3H_PBADEN_PORTB40configuredasdigitalIOonRESET;
		CONFIG4L_BACKBUG_Disabled+CONFIG4L_ENHCPU_Disabled+CONFIG4L_LVP_Disabled+CONFIG4L_STVR_Disabled;
		0;
		CONFIG5L_CP_0_Disabled+CONFIG5L_CP_1_Disabled;
		CONFIG5H_CPB_Disabled+CONFIG5H_CPD_Disabled;
		CONFIG6L_WRT_0_Disabled+CONFIG6L_WRT_1_Disabled;
		0;
		CONFIG7L_EBTR_0_Disabled+CONFIG7L_EBTR_1_Disabled;
		CONFIG7H_EBTRB_Disabled;
	} at CONFIG_ADDRESS;
}

binary something hexfile{
	link main {
		memwidth = 8;
		mem 0x00..0xeff;
	} at 0;
	include config at 0;
}