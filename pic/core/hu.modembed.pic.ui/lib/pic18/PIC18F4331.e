/*
 * Library for PIC18F4331
 * 
 * Architecture: 18xxxx
 */
library microchip.PIC18F4331;

	use e.platform;
	use microchip.pic18;

/********************
 * Special function registers
 ********************/


/*
 * DFLTCON
 * 
 */
reg uint8 DFLTCON : 0xf60; 

/*
 * CAP3CON
 * 
 */
reg uint8 CAP3CON : 0xf61; 

/*
 * CAP2CON
 * 
 */
reg uint8 CAP2CON : 0xf62; 

/*
 * CAP1CON
 * 
 */
reg uint8 CAP1CON : 0xf63; 

/*
 * CAP3BUFL
 * 
 */
reg uint8 CAP3BUFL : 0xf64; 

/*
 * CAP3BUFH
 * 
 */
reg uint8 CAP3BUFH : 0xf65; 

/*
 * CAP2BUFL
 * 
 */
reg uint8 CAP2BUFL : 0xf66; 

/*
 * CAP2BUFH
 * 
 */
reg uint8 CAP2BUFH : 0xf67; 

/*
 * CAP1BUFL
 * 
 */
reg uint8 CAP1BUFL : 0xf68; 

/*
 * CAP1BUFH
 * 
 */
reg uint8 CAP1BUFH : 0xf69; 

/*
 * OVDCONS
 * 
 */
reg uint8 OVDCONS : 0xf6a; 

/*
 * OVDCOND
 * 
 */
reg uint8 OVDCOND : 0xf6b; 

/*
 * FLTCONFIG
 * 
 */
reg uint8 FLTCONFIG : 0xf6c; 

/*
 * DTCON
 * 
 */
reg uint8 DTCON : 0xf6d; 

/*
 * PWMCON1
 * 
 */
reg uint8 PWMCON1 : 0xf6e; 

/*
 * PWMCON0
 * 
 */
reg uint8 PWMCON0 : 0xf6f; 

/*
 * SEVTCMPH
 * 
 */
reg uint8 SEVTCMPH : 0xf70; 

/*
 * SEVTCMPL
 * 
 */
reg uint8 SEVTCMPL : 0xf71; 

/*
 * PDC3H
 * 
 */
reg uint8 PDC3H : 0xf72; 

/*
 * PDC3L
 * 
 */
reg uint8 PDC3L : 0xf73; 

/*
 * PDC2H
 * 
 */
reg uint8 PDC2H : 0xf74; 

/*
 * PDC2L
 * 
 */
reg uint8 PDC2L : 0xf75; 

/*
 * PDC1H
 * 
 */
reg uint8 PDC1H : 0xf76; 

/*
 * PDC1L
 * 
 */
reg uint8 PDC1L : 0xf77; 

/*
 * PDC0H
 * 
 */
reg uint8 PDC0H : 0xf78; 

/*
 * PDC0L
 * 
 */
reg uint8 PDC0L : 0xf79; 

/*
 * PTPERH
 * 
 */
reg uint8 PTPERH : 0xf7a; 

/*
 * PTPERL
 * 
 */
reg uint8 PTPERL : 0xf7b; 

/*
 * PTMRH
 * 
 */
reg uint8 PTMRH : 0xf7c; 

/*
 * PTMRL
 * 
 */
reg uint8 PTMRL : 0xf7d; 

/*
 * PTCON1
 * 
 */
reg uint8 PTCON1 : 0xf7e; 

/*
 * PTCON0
 * 
 */
reg uint8 PTCON0 : 0xf7f; 

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
 * TMR5
 * 
 */
reg uint16 TMR5 : 0xf87; 

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
 * PR5
 * 
 */
reg uint16 PR5 : 0xf90; 

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
 * ADCHS
 * 
 */
reg uint8 ADCHS : 0xf99; 

/*
 * ADCON3
 * 
 */
reg uint8 ADCON3 : 0xf9a; 

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
 * BAUDCON
 * 
 */
reg uint8 BAUDCON : 0xfaa; 

/*
 * RCSTA
 * 
 */
reg uint8 RCSTA : 0xfab; 

/*
 * TXSTA
 * 
 */
reg uint8 TXSTA : 0xfac; 

/*
 * TXREG
 * 
 */
reg uint8 TXREG : 0xfad; 

/*
 * RCREG
 * 
 */
reg uint8 RCREG : 0xfae; 

/*
 * SPBRG
 * 
 */
reg uint8 SPBRG : 0xfaf; 

/*
 * SPBRGH
 * 
 */
reg uint8 SPBRGH : 0xfb0; 

/*
 * QEICON
 * 
 */
reg uint8 QEICON : 0xfb6; 

/*
 * T5CON
 * 
 */
reg uint8 T5CON : 0xfb7; 

/*
 * ANSEL0
 * 
 */
reg uint8 ANSEL0 : 0xfb8; 

/*
 * ANSEL1
 * 
 */
reg uint8 ANSEL1 : 0xfb9; 

/*
 * CCP2CON
 * 
 */
reg uint8 CCP2CON : 0xfba; 

/*
 * CCPR2
 * 
 */
reg uint16 CCPR2 : 0xfbb; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0xfbd; 

/*
 * CCPR1
 * 
 */
reg uint16 CCPR1 : 0xfbe; 

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
 * SSPCON
 * 
 */
reg uint8 SSPCON : 0xfc6; 

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
 * LVDCON
 * 
 */
reg uint8 LVDCON : 0xfd2; 

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

