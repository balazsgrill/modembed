/*
 * Library for PIC18F83J90
 * 
 * Architecture: 18xxxx
 */
library microchip.PIC18F83J90;

	use e.platform;
	use microchip.pic18;

/********************
 * Special function registers
 ********************/


/*
 * RCSTA2
 * 
 */
reg uint8 RCSTA2 : 0xf60; 

/*
 * TXSTA2
 * 
 */
reg uint8 TXSTA2 : 0xf61; 

/*
 * TXREG2
 * 
 */
reg uint8 TXREG2 : 0xf62; 

/*
 * RCREG2
 * 
 */
reg uint8 RCREG2 : 0xf63; 

/*
 * SPBRG2
 * 
 */
reg uint8 SPBRG2 : 0xf64; 

/*
 * CCP2CON
 * 
 */
reg uint8 CCP2CON : 0xf65; 

/*
 * CCPR2
 * 
 */
reg uint16 CCPR2 : 0xf66; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0xf68; 

/*
 * CCPR1
 * 
 */
reg uint16 CCPR1 : 0xf69; 

/*
 * LCDDATA5
 * 
 */
reg uint8 LCDDATA5 : 0xf6b; 

/*
 * LCDDATA6
 * 
 */
reg uint8 LCDDATA6 : 0xf6c; 

/*
 * LCDDATA7
 * 
 */
reg uint8 LCDDATA7 : 0xf6d; 

/*
 * LCDDATA8
 * 
 */
reg uint8 LCDDATA8 : 0xf6e; 

/*
 * LCDDATA9
 * 
 */
reg uint8 LCDDATA9 : 0xf6f; 

/*
 * LCDDATA10
 * 
 */
reg uint8 LCDDATA10 : 0xf70; 

/*
 * LCDDATA11
 * 
 */
reg uint8 LCDDATA11 : 0xf71; 

/*
 * LCDDATA12
 * 
 */
reg uint8 LCDDATA12 : 0xf72; 

/*
 * LCDDATA13
 * 
 */
reg uint8 LCDDATA13 : 0xf73; 

/*
 * LCDDATA14
 * 
 */
reg uint8 LCDDATA14 : 0xf74; 

/*
 * LCDDATA15
 * 
 */
reg uint8 LCDDATA15 : 0xf75; 

/*
 * LCDDATA16
 * 
 */
reg uint8 LCDDATA16 : 0xf76; 

/*
 * LCDDATA17
 * 
 */
reg uint8 LCDDATA17 : 0xf77; 

/*
 * LCDDATA18
 * 
 */
reg uint8 LCDDATA18 : 0xf78; 

/*
 * LCDDATA19
 * 
 */
reg uint8 LCDDATA19 : 0xf79; 

/*
 * LCDDATA20
 * 
 */
reg uint8 LCDDATA20 : 0xf7a; 

/*
 * LCDDATA21
 * 
 */
reg uint8 LCDDATA21 : 0xf7b; 

/*
 * LCDDATA22
 * 
 */
reg uint8 LCDDATA22 : 0xf7c; 

/*
 * LCDDATA23
 * 
 */
reg uint8 LCDDATA23 : 0xf7d; 

/*
 * BAUDCON1
 * 
 */
reg uint8 BAUDCON1 : 0xf7e; 

/*
 * SPBRGH1
 * 
 */
reg uint8 SPBRGH1 : 0xf7f; 

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
 * PORTC
 * 
 */
reg uint8 PORTC : 0xf82; 

/*
 * PORTD
 * 
 */
reg uint8 PORTD : 0xf83; 

/*
 * PORTE
 * 
 */
reg uint8 PORTE : 0xf84; 

/*
 * PORTF
 * 
 */
reg uint8 PORTF : 0xf85; 

/*
 * PORTG
 * 
 */
reg uint8 PORTG : 0xf86; 

/*
 * PORTH
 * 
 */
reg uint8 PORTH : 0xf87; 

/*
 * PORTJ
 * 
 */
reg uint8 PORTJ : 0xf88; 

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
 * LATC
 * 
 */
reg uint8 LATC : 0xf8b; 

/*
 * LATD
 * 
 */
reg uint8 LATD : 0xf8c; 

/*
 * LATE
 * 
 */
reg uint8 LATE : 0xf8d; 

/*
 * LATF
 * 
 */
reg uint8 LATF : 0xf8e; 

/*
 * LATG
 * 
 */
reg uint8 LATG : 0xf8f; 

/*
 * LATH
 * 
 */
reg uint8 LATH : 0xf90; 

/*
 * LATJ
 * 
 */
reg uint8 LATJ : 0xf91; 

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
 * TRISC
 * 
 */
reg uint8 TRISC : 0xf94; 

/*
 * TRISD
 * 
 */
reg uint8 TRISD : 0xf95; 

/*
 * TRISE
 * 
 */
reg uint8 TRISE : 0xf96; 

/*
 * TRISF
 * 
 */
reg uint8 TRISF : 0xf97; 

/*
 * TRISG
 * 
 */
reg uint8 TRISG : 0xf98; 

/*
 * TRISH
 * 
 */
reg uint8 TRISH : 0xf99; 

/*
 * TRISJ
 * 
 */
reg uint8 TRISJ : 0xf9a; 

/*
 * OSCTUNE
 * 
 */
reg uint8 OSCTUNE : 0xf9b; 

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
 * PIE3
 * 
 */
reg uint8 PIE3 : 0xfa3; 

/*
 * PIR3
 * 
 */
reg uint8 PIR3 : 0xfa4; 

/*
 * IPR3
 * 
 */
reg uint8 IPR3 : 0xfa5; 

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
 * LCDCON
 * 
 */
reg uint8 LCDCON : 0xfa8; 

/*
 * LCDSE0
 * 
 */
reg uint8 LCDSE0 : 0xfa9; 

/*
 * LCDPS
 * 
 */
reg uint8 LCDPS : 0xfaa; 

/*
 * RCSTA1
 * 
 */
reg uint8 RCSTA1 : 0xfab; 

/*
 * TXSTA1
 * 
 */
reg uint8 TXSTA1 : 0xfac; 

/*
 * TXREG1
 * 
 */
reg uint8 TXREG1 : 0xfad; 

/*
 * RCREG1
 * 
 */
reg uint8 RCREG1 : 0xfae; 

/*
 * SPBRG1
 * 
 */
reg uint8 SPBRG1 : 0xfaf; 

/*
 * T3CON
 * 
 */
reg uint8 T3CON : 0xfb1; 

/*
 * TMR3
 * 
 */
reg uint16 TMR3 : 0xfb2; 

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
 * LCDSE1
 * 
 */
reg uint8 LCDSE1 : 0xfb6; 

/*
 * LCDSE2
 * 
 */
reg uint8 LCDSE2 : 0xfb7; 

/*
 * LCDSE3
 * 
 */
reg uint8 LCDSE3 : 0xfb8; 

/*
 * LCDSE4
 * 
 */
reg uint8 LCDSE4 : 0xfb9; 

/*
 * LCDSE5
 * 
 */
reg uint8 LCDSE5 : 0xfba; 

/*
 * LCDDATA0
 * 
 */
reg uint8 LCDDATA0 : 0xfbb; 

/*
 * LCDDATA1
 * 
 */
reg uint8 LCDDATA1 : 0xfbc; 

/*
 * LCDDATA2
 * 
 */
reg uint8 LCDDATA2 : 0xfbd; 

/*
 * LCDDATA3
 * 
 */
reg uint8 LCDDATA3 : 0xfbe; 

/*
 * LCDDATA4
 * 
 */
reg uint8 LCDDATA4 : 0xfbf; 

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
 * ADRES
 * 
 */
reg uint16 ADRES : 0xfc3; 

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
 * TMR1
 * 
 */
reg uint16 TMR1 : 0xfce; 

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
 * LCDREG
 * 
 */
reg uint8 LCDREG : 0xfd2; 

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
 * TMR0
 * 
 */
reg uint16 TMR0 : 0xfd6; 

/*
 * STATUS
 * 
 */
reg uint8 STATUS : 0xfd8; 

/*
 * FSR2
 * 
 */
reg uint16 FSR2 : 0xfd9; 

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
 * FSR1
 * 
 */
reg uint16 FSR1 : 0xfe1; 

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
 * FSR0
 * 
 */
reg uint16 FSR0 : 0xfe9; 

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

