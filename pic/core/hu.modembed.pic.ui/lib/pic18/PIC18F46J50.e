/*
 * Library for PIC18F46J50
 * 
 * Architecture: 18xxxx
 */
library microchip.PIC18F46J50;

	use e.platform;
	use microchip.pic18;

/********************
 * Special function registers
 ********************/


/*
 * RPOR0
 * 
 */
reg uint8 RPOR0 : 0xec6; 

/*
 * RPOR1
 * 
 */
reg uint8 RPOR1 : 0xec7; 

/*
 * RPOR2
 * 
 */
reg uint8 RPOR2 : 0xec8; 

/*
 * RPOR3
 * 
 */
reg uint8 RPOR3 : 0xec9; 

/*
 * RPOR4
 * 
 */
reg uint8 RPOR4 : 0xeca; 

/*
 * RPOR5
 * 
 */
reg uint8 RPOR5 : 0xecb; 

/*
 * RPOR6
 * 
 */
reg uint8 RPOR6 : 0xecc; 

/*
 * RPOR7
 * 
 */
reg uint8 RPOR7 : 0xecd; 

/*
 * RPOR8
 * 
 */
reg uint8 RPOR8 : 0xece; 

/*
 * RPOR9
 * 
 */
reg uint8 RPOR9 : 0xecf; 

/*
 * RPOR10
 * 
 */
reg uint8 RPOR10 : 0xed0; 

/*
 * RPOR11
 * 
 */
reg uint8 RPOR11 : 0xed1; 

/*
 * RPOR12
 * 
 */
reg uint8 RPOR12 : 0xed2; 

/*
 * RPOR13
 * 
 */
reg uint8 RPOR13 : 0xed3; 

/*
 * RPOR17
 * 
 */
reg uint8 RPOR17 : 0xed7; 

/*
 * RPOR18
 * 
 */
reg uint8 RPOR18 : 0xed8; 

/*
 * RPOR19
 * 
 */
reg uint8 RPOR19 : 0xed9; 

/*
 * RPOR20
 * 
 */
reg uint8 RPOR20 : 0xeda; 

/*
 * RPOR21
 * 
 */
reg uint8 RPOR21 : 0xedb; 

/*
 * RPOR22
 * 
 */
reg uint8 RPOR22 : 0xedc; 

/*
 * RPOR23
 * 
 */
reg uint8 RPOR23 : 0xedd; 

/*
 * RPOR24
 * 
 */
reg uint8 RPOR24 : 0xede; 

/*
 * RPINR1
 * 
 */
reg uint8 RPINR1 : 0xee7; 

/*
 * RPINR2
 * 
 */
reg uint8 RPINR2 : 0xee8; 

/*
 * RPINR3
 * 
 */
reg uint8 RPINR3 : 0xee9; 

/*
 * RPINR4
 * 
 */
reg uint8 RPINR4 : 0xeea; 

/*
 * RPINR6
 * 
 */
reg uint8 RPINR6 : 0xeec; 

/*
 * RPINR7
 * 
 */
reg uint8 RPINR7 : 0xeed; 

/*
 * RPINR8
 * 
 */
reg uint8 RPINR8 : 0xeee; 

/*
 * RPINR12
 * 
 */
reg uint8 RPINR12 : 0xef2; 

/*
 * RPINR13
 * 
 */
reg uint8 RPINR13 : 0xef3; 

/*
 * RPINR16
 * 
 */
reg uint8 RPINR16 : 0xef6; 

/*
 * RPINR17
 * 
 */
reg uint8 RPINR17 : 0xef7; 

/*
 * RPINR21
 * 
 */
reg uint8 RPINR21 : 0xefb; 

/*
 * RPINR22
 * 
 */
reg uint8 RPINR22 : 0xefc; 

/*
 * RPINR23
 * 
 */
reg uint8 RPINR23 : 0xefd; 

/*
 * RPINR24
 * 
 */
reg uint8 RPINR24 : 0xefe; 

/*
 * PPSCON
 * 
 */
reg uint8 PPSCON : 0xeff; 

/*
 * UEP0
 * 
 */
reg uint8 UEP0 : 0xf26; 

/*
 * UEP1
 * 
 */
reg uint8 UEP1 : 0xf27; 

/*
 * UEP2
 * 
 */
reg uint8 UEP2 : 0xf28; 

/*
 * UEP3
 * 
 */
reg uint8 UEP3 : 0xf29; 

/*
 * UEP4
 * 
 */
reg uint8 UEP4 : 0xf2a; 

/*
 * UEP5
 * 
 */
reg uint8 UEP5 : 0xf2b; 

/*
 * UEP6
 * 
 */
reg uint8 UEP6 : 0xf2c; 

/*
 * UEP7
 * 
 */
reg uint8 UEP7 : 0xf2d; 

/*
 * UEP8
 * 
 */
reg uint8 UEP8 : 0xf2e; 

/*
 * UEP9
 * 
 */
reg uint8 UEP9 : 0xf2f; 

/*
 * UEP10
 * 
 */
reg uint8 UEP10 : 0xf30; 

/*
 * UEP11
 * 
 */
reg uint8 UEP11 : 0xf31; 

/*
 * UEP12
 * 
 */
reg uint8 UEP12 : 0xf32; 

/*
 * UEP13
 * 
 */
reg uint8 UEP13 : 0xf33; 

/*
 * UEP14
 * 
 */
reg uint8 UEP14 : 0xf34; 

/*
 * UEP15
 * 
 */
reg uint8 UEP15 : 0xf35; 

/*
 * UIE
 * 
 */
reg uint8 UIE : 0xf36; 

/*
 * UEIE
 * 
 */
reg uint8 UEIE : 0xf37; 

/*
 * UADDR
 * 
 */
reg uint8 UADDR : 0xf38; 

/*
 * UCFG
 * 
 */
reg uint8 UCFG : 0xf39; 

/*
 * PADCFG1
 * 
 */
reg uint8 PADCFG1 : 0xf3c; 

/*
 * REFOCON
 * 
 */
reg uint8 REFOCON : 0xf3d; 

/*
 * RTCCAL
 * 
 */
reg uint8 RTCCAL : 0xf3e; 

/*
 * RTCCFG
 * 
 */
reg uint8 RTCCFG : 0xf3f; 

/*
 * ODCON3
 * 
 */
reg uint8 ODCON3 : 0xf40; 

/*
 * ODCON2
 * 
 */
reg uint8 ODCON2 : 0xf41; 

/*
 * ODCON1
 * 
 */
reg uint8 ODCON1 : 0xf42; 

/*
 * ANCON0
 * 
 */
reg uint8 ANCON0 : 0xf48; 

/*
 * ANCON1
 * 
 */
reg uint8 ANCON1 : 0xf49; 

/*
 * DSWAKEL
 * 
 */
reg uint8 DSWAKEL : 0xf4a; 

/*
 * DSWAKEH
 * 
 */
reg uint8 DSWAKEH : 0xf4b; 

/*
 * DSCONL
 * 
 */
reg uint8 DSCONL : 0xf4c; 

/*
 * DSCONH
 * 
 */
reg uint8 DSCONH : 0xf4d; 

/*
 * DSGPR0
 * 
 */
reg uint8 DSGPR0 : 0xf4e; 

/*
 * DSGPR1
 * 
 */
reg uint8 DSGPR1 : 0xf4f; 

/*
 * TCLKCON
 * 
 */
reg uint8 TCLKCON : 0xf52; 

/*
 * CVRCON
 * 
 */
reg uint8 CVRCON : 0xf53; 

/*
 * PMSTATL
 * 
 */
reg uint8 PMSTATL : 0xf54; 

/*
 * PMSTATH
 * 
 */
reg uint8 PMSTATH : 0xf55; 

/*
 * PMEL
 * 
 */
reg uint8 PMEL : 0xf56; 

/*
 * PMEH
 * 
 */
reg uint8 PMEH : 0xf57; 

/*
 * PMDIN2L
 * 
 */
reg uint8 PMDIN2L : 0xf58; 

/*
 * PMDIN2H
 * 
 */
reg uint8 PMDIN2H : 0xf59; 

/*
 * PMDOUT2L
 * 
 */
reg uint8 PMDOUT2L : 0xf5a; 

/*
 * PMDOUT2H
 * 
 */
reg uint8 PMDOUT2H : 0xf5b; 

/*
 * PMMODEL
 * 
 */
reg uint8 PMMODEL : 0xf5c; 

/*
 * PMMODEH
 * 
 */
reg uint8 PMMODEH : 0xf5d; 

/*
 * PMCONL
 * 
 */
reg uint8 PMCONL : 0xf5e; 

/*
 * PMCONH
 * 
 */
reg uint8 PMCONH : 0xf5f; 

/*
 * UFRM
 * 
 */
reg uint16 UFRM : 0xf60; 

/*
 * UIR
 * 
 */
reg uint8 UIR : 0xf62; 

/*
 * UEIR
 * 
 */
reg uint8 UEIR : 0xf63; 

/*
 * USTAT
 * 
 */
reg uint8 USTAT : 0xf64; 

/*
 * UCON
 * 
 */
reg uint8 UCON : 0xf65; 

/*
 * DMABCH
 * 
 */
reg uint8 DMABCH : 0xf66; 

/*
 * DMABCL
 * 
 */
reg uint8 DMABCL : 0xf67; 

/*
 * RXADDRH
 * 
 */
reg uint8 RXADDRH : 0xf68; 

/*
 * RXADDRL
 * 
 */
reg uint8 RXADDRL : 0xf69; 

/*
 * TXADDRH
 * 
 */
reg uint8 TXADDRH : 0xf6a; 

/*
 * TXADDRL
 * 
 */
reg uint8 TXADDRL : 0xf6b; 

/*
 * PMDIN1L
 * 
 */
reg uint8 PMDIN1L : 0xf6c; 

/*
 * PMDIN1H
 * 
 */
reg uint8 PMDIN1H : 0xf6d; 

/*
 * CMSTAT
 * 
 */
reg uint8 CMSTAT : 0xf6e; 

/*
 * SSP2CON2
 * 
 */
reg uint8 SSP2CON2 : 0xf6f; 

/*
 * SSP2CON1
 * 
 */
reg uint8 SSP2CON1 : 0xf70; 

/*
 * SSP2STAT
 * 
 */
reg uint8 SSP2STAT : 0xf71; 

/*
 * SSP2ADD
 * 
 */
reg uint8 SSP2ADD : 0xf72; 

/*
 * SSP2BUF
 * 
 */
reg uint8 SSP2BUF : 0xf73; 

/*
 * T4CON
 * 
 */
reg uint8 T4CON : 0xf74; 

/*
 * PR4
 * 
 */
reg uint8 PR4 : 0xf75; 

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
 * HLVDCON
 * 
 */
reg uint8 HLVDCON : 0xf83; 

/*
 * DMACON2
 * 
 */
reg uint8 DMACON2 : 0xf84; 

/*
 * DMACON1
 * 
 */
reg uint8 DMACON1 : 0xf86; 

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
 * ALRMVALL
 * 
 */
reg uint8 ALRMVALL : 0xf8c; 

/*
 * ALRMVALH
 * 
 */
reg uint8 ALRMVALH : 0xf8d; 

/*
 * ALRMRPT
 * 
 */
reg uint8 ALRMRPT : 0xf8e; 

/*
 * ALRMCFG
 * 
 */
reg uint8 ALRMCFG : 0xf8f; 

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
 * T3GCON
 * 
 */
reg uint8 T3GCON : 0xf95; 

/*
 * RTCVALL
 * 
 */
reg uint8 RTCVALL : 0xf96; 

/*
 * RTCVALH
 * 
 */
reg uint8 RTCVALH : 0xf97; 

/*
 * T1GCON
 * 
 */
reg uint8 T1GCON : 0xf98; 

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
 * CTMUICON
 * 
 */
reg uint8 CTMUICON : 0xfaf; 

/*
 * CTMUCONL
 * 
 */
reg uint8 CTMUCONL : 0xfb0; 

/*
 * CTMUCONH
 * 
 */
reg uint8 CTMUCONH : 0xfb1; 

/*
 * CCP2CON
 * 
 */
reg uint8 CCP2CON : 0xfb2; 

/*
 * CCPR2
 * 
 */
reg uint16 CCPR2 : 0xfb3; 

/*
 * ECCP2DEL
 * 
 */
reg uint8 ECCP2DEL : 0xfb5; 

/*
 * ECCP2AS
 * 
 */
reg uint8 ECCP2AS : 0xfb6; 

/*
 * PSTR2CON
 * 
 */
reg uint8 PSTR2CON : 0xfb7; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0xfb8; 

/*
 * CCPR1
 * 
 */
reg uint16 CCPR1 : 0xfb9; 

/*
 * ECCP1DEL
 * 
 */
reg uint8 ECCP1DEL : 0xfbb; 

/*
 * ECCP1AS
 * 
 */
reg uint8 ECCP1AS : 0xfbc; 

/*
 * PSTR1CON
 * 
 */
reg uint8 PSTR1CON : 0xfbd; 

/*
 * WDTCON
 * 
 */
reg uint8 WDTCON : 0xfbe; 

/*
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0xfbf; 

/*
 * ADCON0
 * 
 */
reg uint8 ADCON0 : 0xfc0; 

/*
 * ADRES
 * 
 */
reg uint16 ADRES : 0xfc1; 

/*
 * SSP1CON2
 * 
 */
reg uint8 SSP1CON2 : 0xfc3; 

/*
 * SSP1CON1
 * 
 */
reg uint8 SSP1CON1 : 0xfc4; 

/*
 * SSP1STAT
 * 
 */
reg uint8 SSP1STAT : 0xfc5; 

/*
 * SSP1ADD
 * 
 */
reg uint8 SSP1ADD : 0xfc6; 

/*
 * SSP1BUF
 * 
 */
reg uint8 SSP1BUF : 0xfc7; 

/*
 * T2CON
 * 
 */
reg uint8 T2CON : 0xfc8; 

/*
 * PR2
 * 
 */
reg uint8 PR2 : 0xfc9; 

/*
 * TMR2
 * 
 */
reg uint8 TMR2 : 0xfca; 

/*
 * T1CON
 * 
 */
reg uint8 T1CON : 0xfcb; 

/*
 * TMR1
 * 
 */
reg uint16 TMR1 : 0xfcc; 

/*
 * RCON
 * 
 */
reg uint8 RCON : 0xfce; 

/*
 * CM2CON
 * 
 */
reg uint8 CM2CON : 0xfcf; 

/*
 * CM1CON
 * 
 */
reg uint8 CM1CON : 0xfd0; 

/*
 * OSCCON
 * 
 */
reg uint8 OSCCON : 0xfd1; 

/*
 * T0CON
 * 
 */
reg uint8 T0CON : 0xfd3; 

/*
 * TMR0
 * 
 */
reg uint16 TMR0 : 0xfd4; 

/*
 * STATUS
 * 
 */
reg uint8 STATUS : 0xfd6; 

/*
 * FSR2
 * 
 */
reg uint16 FSR2 : 0xfd7; 

/*
 * PLUSW2
 * 
 */
reg uint8 PLUSW2 : 0xfd9; 

/*
 * PREINC2
 * 
 */
reg uint8 PREINC2 : 0xfda; 

/*
 * POSTDEC2
 * 
 */
reg uint8 POSTDEC2 : 0xfdb; 

/*
 * POSTINC2
 * 
 */
reg uint8 POSTINC2 : 0xfdc; 

/*
 * INDF2
 * 
 */
reg uint8 INDF2 : 0xfdd; 

/*
 * BSR
 * 
 */
reg uint8 BSR : 0xfde; 

/*
 * FSR1
 * 
 */
reg uint16 FSR1 : 0xfdf; 

/*
 * PLUSW1
 * 
 */
reg uint8 PLUSW1 : 0xfe1; 

/*
 * PREINC1
 * 
 */
reg uint8 PREINC1 : 0xfe2; 

/*
 * POSTDEC1
 * 
 */
reg uint8 POSTDEC1 : 0xfe3; 

/*
 * POSTINC1
 * 
 */
reg uint8 POSTINC1 : 0xfe4; 

/*
 * INDF1
 * 
 */
reg uint8 INDF1 : 0xfe5; 

/*
 * WREG
 * 
 */
reg uint8 WREG : 0xfe6; 

/*
 * FSR0
 * 
 */
reg uint16 FSR0 : 0xfe7; 

/*
 * PLUSW0
 * 
 */
reg uint8 PLUSW0 : 0xfe9; 

/*
 * PREINC0
 * 
 */
reg uint8 PREINC0 : 0xfea; 

/*
 * POSTDEC0
 * 
 */
reg uint8 POSTDEC0 : 0xfeb; 

/*
 * POSTINC0
 * 
 */
reg uint8 POSTINC0 : 0xfec; 

/*
 * INDF0
 * 
 */
reg uint8 INDF0 : 0xfed; 

/*
 * INTCON3
 * 
 */
reg uint8 INTCON3 : 0xfee; 

/*
 * INTCON2
 * 
 */
reg uint8 INTCON2 : 0xfef; 

/*
 * INTCON
 * 
 */
reg uint8 INTCON : 0xff0; 

/*
 * PROD
 * 
 */
reg uint16 PROD : 0xff1; 

/*
 * TABLAT
 * 
 */
reg uint8 TABLAT : 0xff3; 

/*
 * TBLPTR
 * 
 */
reg uint8 TBLPTR : 0xff4; 

/*
 * PCLAT
 * 
 */
reg uint8 PCLAT : 0xff7; 

/*
 * STKPTR
 * 
 */
reg uint8 STKPTR : 0xffa; 

/*
 * TOS
 * 
 */
reg uint8 TOS : 0xffb; 

