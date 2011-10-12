namespace pic18f14k50.eusart;

import e.types;
import microchip.pic18;
import microchip.pic18.assisted;
import microchip.PIC18F14K50;

/* TXSTA */
const bit TX9D = 0;
const bit TRMT = 1;
const bit BRGH = 2;
const bit SENDB = 3;
const bit SYNC = 4;
const bit TXEN = 5;
const bit TX9 = 6;

/* RCSTA */
const bit CREN = 4;
const bit SPEN = 7; 

/* PIR1 */
const bit TXIF = 4;
const bit RCIF = 5;

RS232_init(){
	/*
	 * Set pins to input
	 * TX is RB7
	 * RX is RB5
	 */
	aBSF(addr(TRISB),5);
	aBSF(addr(TRISB),7);

	/* 
	 * Configure BRG
	 * 9600 bps for 4MHz
	 */
	aBSF(addr(TXSTA),BRGH);
	MOVLW(25);
	aMOVWF(addr(SPBRG));
	aCLRF(addr(SPBRGH));
	
	/* Enable EUSART */
	aBSF(addr(TXSTA),TXEN);
	aBSF(addr(RCSTA),CREN);
	aBCF(addr(TXSTA),SYNC);
	aBSF(addr(RCSTA),SPEN);
}

RS232_syncSend(uint8 send, var uint8 rcv){
	/* If sending is pending, no sending.. */
	aBTFSS(addr(PIR1),TXIF);
	GOTO(@nosend);
	if (isliteral(send)){
		MOVLW(send);
		aMOVWF(addr(TXREG));
	}else{
		MOVFF(addr(send),addr(TXREG));
	}
	label nosend;
	
	/* If there is received value, receive */
	aBTFSS(addr(PIR1),RCIF);
	GOTO(@norcv);
	MOVFF(addr(RCREG),addr(rcv));
	label norcv;
}