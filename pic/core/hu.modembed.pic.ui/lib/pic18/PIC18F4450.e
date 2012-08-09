/*
 * Library for PIC18F4450
 * 
 * Architecture: 18xxxx
 */
library microchip.PIC18F4450;

	use e.platform;
	use microchip.pic18;

/********************
 * Special function registers
 ********************/


/*
 * UFRM
 * 
 */
reg uint16 UFRM : 0xf66; 

/*
 * UIR
 * 
 */
reg uint8 UIR : 0xf68; 

/*
 * UIE
 * 
 */
reg uint8 UIE : 0xf69; 

/*
 * UEIR
 * 
 */
reg uint8 UEIR : 0xf6a; 

/*
 * UEIE
 * 
 */
reg uint8 UEIE : 0xf6b; 

/*
 * USTAT
 * 
 */
reg uint8 USTAT : 0xf6c; 

/*
 * UCON
 * 
 */
reg uint8 UCON : 0xf6d; 

/*
 * UADDR
 * 
 */
reg uint8 UADDR : 0xf6e; 

/*
 * UCFG
 * 
 */
reg uint8 UCFG : 0xf6f; 

/*
 * UEP0
 * 
 */
reg uint8 UEP0 : 0xf70; 

/*
 * UEP1
 * 
 */
reg uint8 UEP1 : 0xf71; 

/*
 * UEP2
 * 
 */
reg uint8 UEP2 : 0xf72; 

/*
 * UEP3
 * 
 */
reg uint8 UEP3 : 0xf73; 

/*
 * UEP4
 * 
 */
reg uint8 UEP4 : 0xf74; 

/*
 * UEP5
 * 
 */
reg uint8 UEP5 : 0xf75; 

/*
 * UEP6
 * 
 */
reg uint8 UEP6 : 0xf76; 

/*
 * UEP7
 * 
 */
reg uint8 UEP7 : 0xf77; 

/*
 * UEP8
 * 
 */
reg uint8 UEP8 : 0xf78; 

/*
 * UEP9
 * 
 */
reg uint8 UEP9 : 0xf79; 

/*
 * UEP10
 * 
 */
reg uint8 UEP10 : 0xf7a; 

/*
 * UEP11
 * 
 */
reg uint8 UEP11 : 0xf7b; 

/*
 * UEP12
 * 
 */
reg uint8 UEP12 : 0xf7c; 

/*
 * UEP13
 * 
 */
reg uint8 UEP13 : 0xf7d; 

/*
 * UEP14
 * 
 */
reg uint8 UEP14 : 0xf7e; 

/*
 * UEP15
 * 
 */
reg uint8 UEP15 : 0xf7f; 

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
 * BAUDCON
 * 
 */
reg uint8 BAUDCON : 0xfb8; 

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
 * HLVDCON
 * 
 */
reg uint8 HLVDCON : 0xfd2; 

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

