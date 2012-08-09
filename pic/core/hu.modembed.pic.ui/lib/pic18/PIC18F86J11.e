/*
 * Library for PIC18F86J11
 * 
 * Architecture: 18xxxx
 */
library microchip.PIC18F86J11;

	use e.platform;
	use microchip.pic18;

/********************
 * Special function registers
 ********************/


/*
 * PMSTAT
 * 
 */
reg uint16 PMSTAT : 0xf5a; 

/*
 * PMEN
 * 
 */
reg uint16 PMEN : 0xf5c; 

/*
 * PMDIN2
 * 
 */
reg uint16 PMDIN2 : 0xf5e; 

/*
 * PMDOUT2
 * 
 */
reg uint16 PMDOUT2 : 0xf60; 

/*
 * PMMODE
 * 
 */
reg uint16 PMMODE : 0xf62; 

/*
 * PMCON
 * 
 */
reg uint16 PMCON : 0xf64; 

/*
 * PMDIN1
 * 
 */
reg uint16 PMDIN1 : 0xf66; 

/*
 * PMADDR
 * 
 */
reg uint16 PMADDR : 0xf68; 

/*
 * CMSTAT
 * 
 */
reg uint8 CMSTAT : 0xf6a; 

/*
 * SSP2CON2
 * 
 */
reg uint8 SSP2CON2 : 0xf6b; 

/*
 * SSP2CON1
 * 
 */
reg uint8 SSP2CON1 : 0xf6c; 

/*
 * SSP2STAT
 * 
 */
reg uint8 SSP2STAT : 0xf6d; 

/*
 * SSP2BUF
 * 
 */
reg uint8 SSP2BUF : 0xf6e; 

/*
 * CCP5CON
 * 
 */
reg uint8 CCP5CON : 0xf6f; 

/*
 * CCPR5
 * 
 */
reg uint16 CCPR5 : 0xf70; 

/*
 * CCP4CON
 * 
 */
reg uint8 CCP4CON : 0xf72; 

/*
 * CCPR4
 * 
 */
reg uint16 CCPR4 : 0xf73; 

/*
 * T4CON
 * 
 */
reg uint8 T4CON : 0xf75; 

/*
 * TMR4
 * 
 */
reg uint8 TMR4 : 0xf76; 

/*
 * T3CON
 * 
 */
reg uint8 T3CON : 0xf77; 

/*
 * TMR3
 * 
 */
reg uint16 TMR3 : 0xf78; 

/*
 * BAUDCON2
 * 
 */
reg uint8 BAUDCON2 : 0xf7a; 

/*
 * SPBRGH2
 * 
 */
reg uint8 SPBRGH2 : 0xf7b; 

/*
 * BAUDCON1
 * 
 */
reg uint8 BAUDCON1 : 0xf7c; 

/*
 * SPBRGH1
 * 
 */
reg uint8 SPBRGH1 : 0xf7d; 

/*
 * PORTA
 * 
 */
reg uint8 PORTA : 0xf7e; 

/*
 * PORTB
 * 
 */
reg uint8 PORTB : 0xf7f; 

/*
 * PORTC
 * 
 */
reg uint8 PORTC : 0xf80; 

/*
 * PORTD
 * 
 */
reg uint8 PORTD : 0xf81; 

/*
 * PORTE
 * 
 */
reg uint8 PORTE : 0xf82; 

/*
 * PORTF
 * 
 */
reg uint8 PORTF : 0xf83; 

/*
 * PORTG
 * 
 */
reg uint8 PORTG : 0xf84; 

/*
 * PORTH
 * 
 */
reg uint8 PORTH : 0xf85; 

/*
 * PORTJ
 * 
 */
reg uint8 PORTJ : 0xf86; 

/*
 * LATA
 * 
 */
reg uint8 LATA : 0xf87; 

/*
 * LATB
 * 
 */
reg uint8 LATB : 0xf88; 

/*
 * LATC
 * 
 */
reg uint8 LATC : 0xf89; 

/*
 * LATD
 * 
 */
reg uint8 LATD : 0xf8a; 

/*
 * LATE
 * 
 */
reg uint8 LATE : 0xf8b; 

/*
 * LATF
 * 
 */
reg uint8 LATF : 0xf8c; 

/*
 * LATG
 * 
 */
reg uint8 LATG : 0xf8d; 

/*
 * LATH
 * 
 */
reg uint8 LATH : 0xf8e; 

/*
 * LATJ
 * 
 */
reg uint8 LATJ : 0xf8f; 

/*
 * TRISA
 * 
 */
reg uint8 TRISA : 0xf90; 

/*
 * TRISB
 * 
 */
reg uint8 TRISB : 0xf91; 

/*
 * TRISC
 * 
 */
reg uint8 TRISC : 0xf92; 

/*
 * TRISD
 * 
 */
reg uint8 TRISD : 0xf93; 

/*
 * TRISE
 * 
 */
reg uint8 TRISE : 0xf94; 

/*
 * TRISF
 * 
 */
reg uint8 TRISF : 0xf95; 

/*
 * TRISG
 * 
 */
reg uint8 TRISG : 0xf96; 

/*
 * TRISH
 * 
 */
reg uint8 TRISH : 0xf97; 

/*
 * TRISJ
 * 
 */
reg uint8 TRISJ : 0xf98; 

/*
 * OSCTUNE
 * 
 */
reg uint8 OSCTUNE : 0xf99; 

/*
 * RCSTA2
 * 
 */
reg uint8 RCSTA2 : 0xf9a; 

/*
 * PIE1
 * 
 */
reg uint8 PIE1 : 0xf9b; 

/*
 * PIR1
 * 
 */
reg uint8 PIR1 : 0xf9c; 

/*
 * IPR1
 * 
 */
reg uint8 IPR1 : 0xf9d; 

/*
 * PIE2
 * 
 */
reg uint8 PIE2 : 0xf9e; 

/*
 * PIR2
 * 
 */
reg uint8 PIR2 : 0xf9f; 

/*
 * IPR2
 * 
 */
reg uint8 IPR2 : 0xfa0; 

/*
 * PIE3
 * 
 */
reg uint8 PIE3 : 0xfa1; 

/*
 * PIR3
 * 
 */
reg uint8 PIR3 : 0xfa2; 

/*
 * IPR3
 * 
 */
reg uint8 IPR3 : 0xfa3; 

/*
 * EECON1
 * 
 */
reg uint8 EECON1 : 0xfa4; 

/*
 * EECON2
 * 
 */
reg uint8 EECON2 : 0xfa5; 

/*
 * TXSTA2
 * 
 */
reg uint8 TXSTA2 : 0xfa6; 

/*
 * TXREG2
 * 
 */
reg uint8 TXREG2 : 0xfa7; 

/*
 * RCREG2
 * 
 */
reg uint8 RCREG2 : 0xfa8; 

/*
 * SPBRG2
 * 
 */
reg uint8 SPBRG2 : 0xfa9; 

/*
 * RCSTA1
 * 
 */
reg uint8 RCSTA1 : 0xfaa; 

/*
 * TXSTA1
 * 
 */
reg uint8 TXSTA1 : 0xfab; 

/*
 * TXREG1
 * 
 */
reg uint8 TXREG1 : 0xfac; 

/*
 * RCREG1
 * 
 */
reg uint8 RCREG1 : 0xfad; 

/*
 * SPBRG1
 * 
 */
reg uint8 SPBRG1 : 0xfae; 

/*
 * ECCP3CON
 * 
 */
reg uint8 ECCP3CON : 0xfaf; 

/*
 * CCPR3
 * 
 */
reg uint16 CCPR3 : 0xfb0; 

/*
 * ECCP3DEL
 * 
 */
reg uint8 ECCP3DEL : 0xfb2; 

/*
 * ECCP3AS
 * 
 */
reg uint8 ECCP3AS : 0xfb3; 

/*
 * ECCP2CON
 * 
 */
reg uint8 ECCP2CON : 0xfb4; 

/*
 * CCPR2
 * 
 */
reg uint16 CCPR2 : 0xfb5; 

/*
 * ECCP2DEL
 * 
 */
reg uint8 ECCP2DEL : 0xfb7; 

/*
 * ECCP2AS
 * 
 */
reg uint8 ECCP2AS : 0xfb8; 

/*
 * ECCP1CON
 * 
 */
reg uint8 ECCP1CON : 0xfb9; 

/*
 * CCPR1
 * 
 */
reg uint16 CCPR1 : 0xfba; 

/*
 * ECCP1DEL
 * 
 */
reg uint8 ECCP1DEL : 0xfbc; 

/*
 * ECCP1AS
 * 
 */
reg uint8 ECCP1AS : 0xfbd; 

/*
 * WDTCON
 * 
 */
reg uint8 WDTCON : 0xfbe; 

/*
 * ADRES
 * 
 */
reg uint16 ADRES : 0xfbf; 

/*
 * SSP1CON2
 * 
 */
reg uint8 SSP1CON2 : 0xfc1; 

/*
 * SSP1CON1
 * 
 */
reg uint8 SSP1CON1 : 0xfc2; 

/*
 * SSP1STAT
 * 
 */
reg uint8 SSP1STAT : 0xfc3; 

/*
 * SSP1BUF
 * 
 */
reg uint8 SSP1BUF : 0xfc4; 

/*
 * T2CON
 * 
 */
reg uint8 T2CON : 0xfc5; 

/*
 * TMR1
 * 
 */
reg uint16 TMR1 : 0xfc6; 

/*
 * RCON
 * 
 */
reg uint8 RCON : 0xfc8; 

/*
 * CM2CON1
 * 
 */
reg uint8 CM2CON1 : 0xfc9; 

/*
 * CM1CON1
 * 
 */
reg uint8 CM1CON1 : 0xfca; 

/*
 * T0CON
 * 
 */
reg uint8 T0CON : 0xfcc; 

/*
 * TMR0
 * 
 */
reg uint16 TMR0 : 0xfcd; 

/*
 * STATUS
 * 
 */
reg uint8 STATUS : 0xfcf; 

/*
 * FSR2
 * 
 */
reg uint16 FSR2 : 0xfd0; 

/*
 * PLUSW2
 * 
 */
reg uint8 PLUSW2 : 0xfd2; 

/*
 * PREINC2
 * 
 */
reg uint8 PREINC2 : 0xfd3; 

/*
 * POSTDEC2
 * 
 */
reg uint8 POSTDEC2 : 0xfd4; 

/*
 * POSTINC2
 * 
 */
reg uint8 POSTINC2 : 0xfd5; 

/*
 * INDF2
 * 
 */
reg uint8 INDF2 : 0xfd6; 

/*
 * BSR
 * 
 */
reg uint8 BSR : 0xfd7; 

/*
 * FSR1
 * 
 */
reg uint16 FSR1 : 0xfd8; 

/*
 * PLUSW1
 * 
 */
reg uint8 PLUSW1 : 0xfda; 

/*
 * PREINC1
 * 
 */
reg uint8 PREINC1 : 0xfdb; 

/*
 * POSTDEC1
 * 
 */
reg uint8 POSTDEC1 : 0xfdc; 

/*
 * POSTINC1
 * 
 */
reg uint8 POSTINC1 : 0xfdd; 

/*
 * INDF1
 * 
 */
reg uint8 INDF1 : 0xfde; 

/*
 * WREG
 * 
 */
reg uint8 WREG : 0xfdf; 

/*
 * FSR0
 * 
 */
reg uint16 FSR0 : 0xfe0; 

/*
 * PLUSW0
 * 
 */
reg uint8 PLUSW0 : 0xfe2; 

/*
 * PREINC0
 * 
 */
reg uint8 PREINC0 : 0xfe3; 

/*
 * POSTDEC0
 * 
 */
reg uint8 POSTDEC0 : 0xfe4; 

/*
 * POSTINC0
 * 
 */
reg uint8 POSTINC0 : 0xfe5; 

/*
 * INDF0
 * 
 */
reg uint8 INDF0 : 0xfe6; 

/*
 * INTCON3
 * 
 */
reg uint8 INTCON3 : 0xfe7; 

/*
 * INTCON2
 * 
 */
reg uint8 INTCON2 : 0xfe8; 

/*
 * INTCON
 * 
 */
reg uint8 INTCON : 0xfe9; 

/*
 * PROD
 * 
 */
reg uint16 PROD : 0xfea; 

/*
 * TABLAT
 * 
 */
reg uint8 TABLAT : 0xfec; 

/*
 * TBLPTR
 * 
 */
reg uint8 TBLPTR : 0xfed; 

/*
 * PCLAT
 * 
 */
reg uint8 PCLAT : 0xff0; 

/*
 * STKPTR
 * 
 */
reg uint8 STKPTR : 0xff3; 

/*
 * TOS
 * 
 */
reg uint8 TOS : 0xff4; 

