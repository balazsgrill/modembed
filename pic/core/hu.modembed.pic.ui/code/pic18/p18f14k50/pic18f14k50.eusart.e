library microchip.PIC18F14K50.EUSART;

use e.platform;
use microchip.pic18;
use microchip.pic18.assisted;
use microchip.PIC18F14K50;

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
	aBSF(&(TRISB),5);
	aBSF(&(TRISB),7);

	/* 
	 * Configure BRG
	 * 9600 bps for 4MHz
	 */
	aBSF(&(TXSTA),BRGH);
	MOVLW(25);
	aMOVWF(&(SPBRG));
	aCLRF(&(SPBRGH));
	
	/* Enable EUSART */
	aBSF(&(TXSTA),TXEN);
	aBSF(&(RCSTA),CREN);
	aBCF(&(TXSTA),SYNC);
	aBSF(&(RCSTA),SPEN);
}

/* Tries to send 8 bits. If successful, counter is increased */
RS232_send(uint8 send, var uint8 counter){
	/* If sending is pending, no sending.. */
	aBTFSS(&(PIR1),TXIF);
	GOTO(@nosend);
	if (isliteral(send)){
		MOVLW(send);
		aMOVWF(&(TXREG));
	}else{
		MOVFF(&(send),&(TXREG));
	}
	aINCF(&(counter));
	label nosend;
}

/* Tries to receive 8 bits. If successful, counter is increased */
RS232_rcv(var uint8 rcv, var uint8 counter){
	/* If there is received value, receive */
	aBTFSS(&(PIR1),RCIF);
	GOTO(norcv);
	MOVFF(&(RCREG),&(rcv));
	aINCF(&(counter));
	label norcv;
}

RS232_syncSend(uint8 send, var uint8 rcv){
	/* If sending is pending, no sending.. */
	aBTFSS(&(PIR1),TXIF);
	GOTO(nosend);
	if (isliteral(send)){
		MOVLW(send);
		aMOVWF(&(TXREG));
	}else{
		MOVFF(&(send),&(TXREG));
	}
	label nosend;
	
	/* If there is received value, receive */
	aBTFSS(&(PIR1),RCIF);
	GOTO(norcv);
	MOVFF(&(RCREG),&(rcv));
	label norcv;
}