/*
 * Library for PS500
 * 
 * Architecture: 18xxxx
 */
library microchip.PS500;

	use e.platform;
	use microchip.pic18;

/********************
 * Special function registers
 ********************/


/*
 * PORTA
 * 
 */
reg uint8 PORTA : 0xf80; 

/*
 * PORTB
 * 
 */
reg uint8 PORTB : 0xf81; 

/*
 * LATA
 * 
 */
reg uint8 LATA : 0xf89; 

/*
 * LATB
 * 
 */
reg uint8 LATB : 0xf8a; 

/*
 * LEDDC
 * 
 */
reg uint8 LEDDC : 0xf90; 

/*
 * LEDB
 * 
 */
reg uint8 LEDB : 0xf91; 

/*
 * TRISA
 * 
 */
reg uint8 TRISA : 0xf92; 

/*
 * TRISB
 * 
 */
reg uint8 TRISB : 0xf93; 

/*
 * REFCAL
 * 
 */
reg uint8 REFCAL : 0xf9a; 

/*
 * OSCCAL
 * 
 */
reg uint8 OSCCAL : 0xf9b; 

/*
 * BGCAL
 * 
 */
reg uint8 BGCAL : 0xf9c; 

/*
 * PIE1
 * 
 */
reg uint8 PIE1 : 0xf9d; 

/*
 * PIR1
 * 
 */
reg uint8 PIR1 : 0xf9e; 

/*
 * IPR1
 * 
 */
reg uint8 IPR1 : 0xf9f; 

/*
 * PIE2
 * 
 */
reg uint8 PIE2 : 0xfa0; 

/*
 * PIR2
 * 
 */
reg uint8 PIR2 : 0xfa1; 

/*
 * IPR2
 * 
 */
reg uint8 IPR2 : 0xfa2; 

/*
 * EECON1
 * 
 */
reg uint8 EECON1 : 0xfa6; 

/*
 * EECON2
 * 
 */
reg uint8 EECON2 : 0xfa7; 

/*
 * EEDATA
 * 
 */
reg uint8 EEDATA : 0xfa8; 

/*
 * EEADR
 * 
 */
reg uint8 EEADR : 0xfa9; 

/*
 * T3CON
 * 
 */
reg uint8 T3CON : 0xfb1; 

/*
 * TMR3L
 * 
 */
reg uint8 TMR3L : 0xfb2; 

/*
 * TMR3H
 * 
 */
reg uint8 TMR3H : 0xfb3; 

/*
 * CMCON
 * 
 */
reg uint8 CMCON : 0xfb4; 

/*
 * CVRCON
 * 
 */
reg uint8 CVRCON : 0xfb5; 

/*
 * ADCON2
 * 
 */
reg uint8 ADCON2 : 0xfc0; 

/*
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0xfc1; 

/*
 * ADCON0
 * 
 */
reg uint8 ADCON0 : 0xfc2; 

/*
 * ADRESL
 * 
 */
reg uint8 ADRESL : 0xfc3; 

/*
 * ADRESH
 * 
 */
reg uint8 ADRESH : 0xfc4; 

/*
 * SSPCON2
 * 
 */
reg uint8 SSPCON2 : 0xfc5; 

/*
 * SSPCON1
 * 
 */
reg uint8 SSPCON1 : 0xfc6; 

/*
 * SSPSTAT
 * 
 */
reg uint8 SSPSTAT : 0xfc7; 

/*
 * SSPADD
 * 
 */
reg uint8 SSPADD : 0xfc8; 

/*
 * SSPBUF
 * 
 */
reg uint8 SSPBUF : 0xfc9; 

/*
 * T2CON
 * 
 */
reg uint8 T2CON : 0xfca; 

/*
 * PR2
 * 
 */
reg uint8 PR2 : 0xfcb; 

/*
 * TMR2
 * 
 */
reg uint8 TMR2 : 0xfcc; 

/*
 * T1CON
 * 
 */
reg uint8 T1CON : 0xfcd; 

/*
 * TMR1L
 * 
 */
reg uint8 TMR1L : 0xfce; 

/*
 * TMR1H
 * 
 */
reg uint8 TMR1H : 0xfcf; 

/*
 * RCON
 * 
 */
reg uint8 RCON : 0xfd0; 

/*
 * WDTCON
 * 
 */
reg uint8 WDTCON : 0xfd1; 

/*
 * OSCCON
 * 
 */
reg uint8 OSCCON : 0xfd3; 

/*
 * T0CON
 * 
 */
reg uint8 T0CON : 0xfd5; 

/*
 * TMR0L
 * 
 */
reg uint8 TMR0L : 0xfd6; 

/*
 * TMR0H
 * 
 */
reg uint8 TMR0H : 0xfd7; 

/*
 * STATUS
 * 
 */
reg uint8 STATUS : 0xfd8; 

/*
 * FSR2L
 * 
 */
reg uint8 FSR2L : 0xfd9; 

/*
 * FSR2H
 * 
 */
reg uint8 FSR2H : 0xfda; 

/*
 * PLUSW2
 * 
 */
reg uint8 PLUSW2 : 0xfdb; 

/*
 * PREINC2
 * 
 */
reg uint8 PREINC2 : 0xfdc; 

/*
 * POSTDEC2
 * 
 */
reg uint8 POSTDEC2 : 0xfdd; 

/*
 * POSTINC2
 * 
 */
reg uint8 POSTINC2 : 0xfde; 

/*
 * INDF2
 * 
 */
reg uint8 INDF2 : 0xfdf; 

/*
 * BSR
 * 
 */
reg uint8 BSR : 0xfe0; 

/*
 * FSR1L
 * 
 */
reg uint8 FSR1L : 0xfe1; 

/*
 * FSR1H
 * 
 */
reg uint8 FSR1H : 0xfe2; 

/*
 * PLUSW1
 * 
 */
reg uint8 PLUSW1 : 0xfe3; 

/*
 * PREINC1
 * 
 */
reg uint8 PREINC1 : 0xfe4; 

/*
 * POSTDEC1
 * 
 */
reg uint8 POSTDEC1 : 0xfe5; 

/*
 * POSTINC1
 * 
 */
reg uint8 POSTINC1 : 0xfe6; 

/*
 * INDF1
 * 
 */
reg uint8 INDF1 : 0xfe7; 

/*
 * WREG
 * 
 */
reg uint8 WREG : 0xfe8; 

/*
 * FSR0L
 * 
 */
reg uint8 FSR0L : 0xfe9; 

/*
 * FSR0H
 * 
 */
reg uint8 FSR0H : 0xfea; 

/*
 * PLUSW0
 * 
 */
reg uint8 PLUSW0 : 0xfeb; 

/*
 * PREINC0
 * 
 */
reg uint8 PREINC0 : 0xfec; 

/*
 * POSTDEC0
 * 
 */
reg uint8 POSTDEC0 : 0xfed; 

/*
 * POSTINC0
 * 
 */
reg uint8 POSTINC0 : 0xfee; 

/*
 * INDF0
 * 
 */
reg uint8 INDF0 : 0xfef; 

/*
 * INTCON3
 * 
 */
reg uint8 INTCON3 : 0xff0; 

/*
 * INTCON2
 * 
 */
reg uint8 INTCON2 : 0xff1; 

/*
 * INTCON
 * 
 */
reg uint8 INTCON : 0xff2; 

/*
 * PROD
 * 
 */
reg uint16 PROD : 0xff3; 

/*
 * TABLAT
 * 
 */
reg uint8 TABLAT : 0xff5; 

/*
 * TBLPTR
 * 
 */
reg uint8 TBLPTR : 0xff6; 

/*
 * PCLAT
 * 
 */
reg uint8 PCLAT : 0xff9; 

/*
 * STKPTR
 * 
 */
reg uint8 STKPTR : 0xffc; 

/*
 * TOS
 * 
 */
reg uint8 TOS : 0xffd; 

