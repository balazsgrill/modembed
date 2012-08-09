/*
 * Library for PIC18F1330
 * 
 * Architecture: 18xxxx
 */
library microchip.PIC18F1330;

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
 * OVDCONS
 * 
 */
reg uint8 OVDCONS : 0xf82; 

/*
 * OVDCOND
 * 
 */
reg uint8 OVDCOND : 0xf83; 

/*
 * DTCON
 * 
 */
reg uint8 DTCON : 0xf84; 

/*
 * PWMCON1
 * 
 */
reg uint8 PWMCON1 : 0xf85; 

/*
 * PWMCON0
 * 
 */
reg uint8 PWMCON0 : 0xf86; 

/*
 * SEVTCMPH
 * 
 */
reg uint8 SEVTCMPH : 0xf87; 

/*
 * SEVTCMPL
 * 
 */
reg uint8 SEVTCMPL : 0xf88; 

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
 * FLTCONFIG
 * 
 */
reg uint8 FLTCONFIG : 0xf8b; 

/*
 * PDC2H
 * 
 */
reg uint8 PDC2H : 0xf8c; 

/*
 * PDC2L
 * 
 */
reg uint8 PDC2L : 0xf8d; 

/*
 * PDC1H
 * 
 */
reg uint8 PDC1H : 0xf8e; 

/*
 * PDC1L
 * 
 */
reg uint8 PDC1L : 0xf8f; 

/*
 * PDC0H
 * 
 */
reg uint8 PDC0H : 0xf90; 

/*
 * PDC0L
 * 
 */
reg uint8 PDC0L : 0xf91; 

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
 * PTPERH
 * 
 */
reg uint8 PTPERH : 0xf95; 

/*
 * PTPERL
 * 
 */
reg uint8 PTPERL : 0xf96; 

/*
 * PTMRH
 * 
 */
reg uint8 PTMRH : 0xf97; 

/*
 * PTMRL
 * 
 */
reg uint8 PTMRL : 0xf98; 

/*
 * PTCON1
 * 
 */
reg uint8 PTCON1 : 0xf99; 

/*
 * PTCON0
 * 
 */
reg uint8 PTCON0 : 0xf9a; 

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
 * BAUDCON
 * 
 */
reg uint8 BAUDCON : 0xfb8; 

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

