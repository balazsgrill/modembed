/*
 * Library for PIC18F47J13
 * 
 * Architecture: 18xxxx
 */
library microchip.PIC18F47J13;

	use e.platform;
	use microchip.pic18;

/********************
 * Special function registers
 ********************/


/*
 * ADCTRIG
 * 
 */
reg uint8 ADCTRIG : 0xeb8; 

/*
 * PMDIS0
 * 
 */
reg uint8 PMDIS0 : 0xeb9; 

/*
 * PMDIS1
 * 
 */
reg uint8 PMDIS1 : 0xeba; 

/*
 * PMDIS2
 * 
 */
reg uint8 PMDIS2 : 0xebb; 

/*
 * PMDIS3
 * 
 */
reg uint8 PMDIS3 : 0xebc; 

/*
 * PPSCON
 * 
 */
reg uint8 PPSCON : 0xebf; 

/*
 * RPOR0
 * 
 */
reg uint8 RPOR0 : 0xec0; 

/*
 * RPOR1
 * 
 */
reg uint8 RPOR1 : 0xec1; 

/*
 * RPOR2
 * 
 */
reg uint8 RPOR2 : 0xec2; 

/*
 * RPOR3
 * 
 */
reg uint8 RPOR3 : 0xec3; 

/*
 * RPOR4
 * 
 */
reg uint8 RPOR4 : 0xec4; 

/*
 * RPOR5
 * 
 */
reg uint8 RPOR5 : 0xec5; 

/*
 * RPOR6
 * 
 */
reg uint8 RPOR6 : 0xec6; 

/*
 * RPOR7
 * 
 */
reg uint8 RPOR7 : 0xec7; 

/*
 * RPOR8
 * 
 */
reg uint8 RPOR8 : 0xec8; 

/*
 * RPOR9
 * 
 */
reg uint8 RPOR9 : 0xec9; 

/*
 * RPOR10
 * 
 */
reg uint8 RPOR10 : 0xeca; 

/*
 * RPOR11
 * 
 */
reg uint8 RPOR11 : 0xecb; 

/*
 * RPOR12
 * 
 */
reg uint8 RPOR12 : 0xecc; 

/*
 * RPOR13
 * 
 */
reg uint8 RPOR13 : 0xecd; 

/*
 * RPOR14
 * 
 */
reg uint8 RPOR14 : 0xece; 

/*
 * RPOR15
 * 
 */
reg uint8 RPOR15 : 0xecf; 

/*
 * RPOR16
 * 
 */
reg uint8 RPOR16 : 0xed0; 

/*
 * RPOR17
 * 
 */
reg uint8 RPOR17 : 0xed1; 

/*
 * RPOR18
 * 
 */
reg uint8 RPOR18 : 0xed2; 

/*
 * RPOR19
 * 
 */
reg uint8 RPOR19 : 0xed3; 

/*
 * RPOR20
 * 
 */
reg uint8 RPOR20 : 0xed4; 

/*
 * RPOR21
 * 
 */
reg uint8 RPOR21 : 0xed5; 

/*
 * RPOR22
 * 
 */
reg uint8 RPOR22 : 0xed6; 

/*
 * RPOR23
 * 
 */
reg uint8 RPOR23 : 0xed7; 

/*
 * RPOR24
 * 
 */
reg uint8 RPOR24 : 0xed8; 

/*
 * RPINR1
 * 
 */
reg uint8 RPINR1 : 0xee1; 

/*
 * RPINR2
 * 
 */
reg uint8 RPINR2 : 0xee2; 

/*
 * RPINR3
 * 
 */
reg uint8 RPINR3 : 0xee3; 

/*
 * RPINR4
 * 
 */
reg uint8 RPINR4 : 0xee4; 

/*
 * RPINR6
 * 
 */
reg uint8 RPINR6 : 0xee6; 

/*
 * RPINR15
 * 
 */
reg uint8 RPINR15 : 0xee7; 

/*
 * RPINR7
 * 
 */
reg uint8 RPINR7 : 0xee8; 

/*
 * RPINR8
 * 
 */
reg uint8 RPINR8 : 0xee9; 

/*
 * RPINR9
 * 
 */
reg uint8 RPINR9 : 0xeea; 

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
 * RPINR14
 * 
 */
reg uint8 RPINR14 : 0xef4; 

/*
 * RPINR16
 * 
 */
reg uint8 RPINR16 : 0xef7; 

/*
 * RPINR17
 * 
 */
reg uint8 RPINR17 : 0xef8; 

/*
 * RPINR21
 * 
 */
reg uint8 RPINR21 : 0xefc; 

/*
 * RPINR22
 * 
 */
reg uint8 RPINR22 : 0xefd; 

/*
 * RPINR23
 * 
 */
reg uint8 RPINR23 : 0xefe; 

/*
 * RPINR24
 * 
 */
reg uint8 RPINR24 : 0xeff; 

/*
 * CCP10CON
 * 
 */
reg uint8 CCP10CON : 0xf00; 

/*
 * CCPR10L
 * 
 */
reg uint8 CCPR10L : 0xf01; 

/*
 * CCPR10H
 * 
 */
reg uint8 CCPR10H : 0xf02; 

/*
 * CCP9CON
 * 
 */
reg uint8 CCP9CON : 0xf03; 

/*
 * CCPR9L
 * 
 */
reg uint8 CCPR9L : 0xf04; 

/*
 * CCPR9H
 * 
 */
reg uint8 CCPR9H : 0xf05; 

/*
 * CCP8CON
 * 
 */
reg uint8 CCP8CON : 0xf06; 

/*
 * CCPR8L
 * 
 */
reg uint8 CCPR8L : 0xf07; 

/*
 * CCPR8H
 * 
 */
reg uint8 CCPR8H : 0xf08; 

/*
 * CCP7CON
 * 
 */
reg uint8 CCP7CON : 0xf09; 

/*
 * CCPR7L
 * 
 */
reg uint8 CCPR7L : 0xf0a; 

/*
 * CCPR7H
 * 
 */
reg uint8 CCPR7H : 0xf0b; 

/*
 * CCP6CON
 * 
 */
reg uint8 CCP6CON : 0xf0c; 

/*
 * CCPR6L
 * 
 */
reg uint8 CCPR6L : 0xf0d; 

/*
 * CCPR6H
 * 
 */
reg uint8 CCPR6H : 0xf0e; 

/*
 * CCP5CON
 * 
 */
reg uint8 CCP5CON : 0xf0f; 

/*
 * CCPR5L
 * 
 */
reg uint8 CCPR5L : 0xf10; 

/*
 * CCPR5H
 * 
 */
reg uint8 CCPR5H : 0xf11; 

/*
 * CCP4CON
 * 
 */
reg uint8 CCP4CON : 0xf12; 

/*
 * CCPR4L
 * 
 */
reg uint8 CCPR4L : 0xf13; 

/*
 * CCPR4H
 * 
 */
reg uint8 CCPR4H : 0xf14; 

/*
 * CCP3CON
 * 
 */
reg uint8 CCP3CON : 0xf15; 

/*
 * CCPR3L
 * 
 */
reg uint8 CCPR3L : 0xf16; 

/*
 * CCPR3H
 * 
 */
reg uint8 CCPR3H : 0xf17; 

/*
 * ECCP3DEL
 * 
 */
reg uint8 ECCP3DEL : 0xf18; 

/*
 * ECCP3AS
 * 
 */
reg uint8 ECCP3AS : 0xf19; 

/*
 * PSTR3CON
 * 
 */
reg uint8 PSTR3CON : 0xf1a; 

/*
 * T8CON
 * 
 */
reg uint8 T8CON : 0xf1b; 

/*
 * PR8
 * 
 */
reg uint8 PR8 : 0xf1c; 

/*
 * TMR8
 * 
 */
reg uint8 TMR8 : 0xf1d; 

/*
 * T6CON
 * 
 */
reg uint8 T6CON : 0xf1e; 

/*
 * PR6
 * 
 */
reg uint8 PR6 : 0xf1f; 

/*
 * TMR6
 * 
 */
reg uint8 TMR6 : 0xf20; 

/*
 * T5GCON
 * 
 */
reg uint8 T5GCON : 0xf21; 

/*
 * T5CON
 * 
 */
reg uint8 T5CON : 0xf22; 

/*
 * TMR5L
 * 
 */
reg uint8 TMR5L : 0xf23; 

/*
 * TMR5H
 * 
 */
reg uint8 TMR5H : 0xf24; 

/*
 * CM3CON
 * 
 */
reg uint8 CM3CON : 0xf25; 

/*
 * RTCVALL
 * 
 */
reg uint8 RTCVALL : 0xf3a; 

/*
 * RTCVALH
 * 
 */
reg uint8 RTCVALH : 0xf3b; 

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
 * ALRMVALL
 * 
 */
reg uint8 ALRMVALL : 0xf44; 

/*
 * ALRMVALH
 * 
 */
reg uint8 ALRMVALH : 0xf45; 

/*
 * ALRMRPT
 * 
 */
reg uint8 ALRMRPT : 0xf46; 

/*
 * ALRMCFG
 * 
 */
reg uint8 ALRMCFG : 0xf47; 

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
 * CCPTMRS2
 * 
 */
reg uint8 CCPTMRS2 : 0xf50; 

/*
 * CCPTMRS1
 * 
 */
reg uint8 CCPTMRS1 : 0xf51; 

/*
 * CCPTMRS0
 * 
 */
reg uint8 CCPTMRS0 : 0xf52; 

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
 * SSP2BUF
 * 
 */
reg uint8 SSP2BUF : 0xf72; 

/*
 * T4CON
 * 
 */
reg uint8 T4CON : 0xf73; 

/*
 * PR4
 * 
 */
reg uint8 PR4 : 0xf74; 

/*
 * TMR4
 * 
 */
reg uint8 TMR4 : 0xf75; 

/*
 * T3CON
 * 
 */
reg uint8 T3CON : 0xf76; 

/*
 * TMR3
 * 
 */
reg uint16 TMR3 : 0xf77; 

/*
 * BAUDCON2
 * 
 */
reg uint8 BAUDCON2 : 0xf79; 

/*
 * SPBRGH2
 * 
 */
reg uint8 SPBRGH2 : 0xf7a; 

/*
 * BAUDCON1
 * 
 */
reg uint8 BAUDCON1 : 0xf7b; 

/*
 * SPBRGH1
 * 
 */
reg uint8 SPBRGH1 : 0xf7c; 

/*
 * PORTA
 * 
 */
reg uint8 PORTA : 0xf7d; 

/*
 * PORTB
 * 
 */
reg uint8 PORTB : 0xf7e; 

/*
 * PORTC
 * 
 */
reg uint8 PORTC : 0xf7f; 

/*
 * PORTD
 * 
 */
reg uint8 PORTD : 0xf80; 

/*
 * PORTE
 * 
 */
reg uint8 PORTE : 0xf81; 

/*
 * HLVDCON
 * 
 */
reg uint8 HLVDCON : 0xf82; 

/*
 * DMACON2
 * 
 */
reg uint8 DMACON2 : 0xf83; 

/*
 * OSCCON2
 * 
 */
reg uint8 OSCCON2 : 0xf84; 

/*
 * DMACON1
 * 
 */
reg uint8 DMACON1 : 0xf85; 

/*
 * LATA
 * 
 */
reg uint8 LATA : 0xf86; 

/*
 * LATB
 * 
 */
reg uint8 LATB : 0xf87; 

/*
 * LATC
 * 
 */
reg uint8 LATC : 0xf88; 

/*
 * LATD
 * 
 */
reg uint8 LATD : 0xf89; 

/*
 * LATE
 * 
 */
reg uint8 LATE : 0xf8a; 

/*
 * PIE4
 * 
 */
reg uint8 PIE4 : 0xf8b; 

/*
 * PIR4
 * 
 */
reg uint8 PIR4 : 0xf8c; 

/*
 * IPR4
 * 
 */
reg uint8 IPR4 : 0xf8d; 

/*
 * PIE5
 * 
 */
reg uint8 PIE5 : 0xf8e; 

/*
 * TRISA
 * 
 */
reg uint8 TRISA : 0xf8f; 

/*
 * TRISB
 * 
 */
reg uint8 TRISB : 0xf90; 

/*
 * TRISC
 * 
 */
reg uint8 TRISC : 0xf91; 

/*
 * TRISD
 * 
 */
reg uint8 TRISD : 0xf92; 

/*
 * TRISE
 * 
 */
reg uint8 TRISE : 0xf93; 

/*
 * T3GCON
 * 
 */
reg uint8 T3GCON : 0xf94; 

/*
 * PIR5
 * 
 */
reg uint8 PIR5 : 0xf95; 

/*
 * IPR5
 * 
 */
reg uint8 IPR5 : 0xf96; 

/*
 * T1GCON
 * 
 */
reg uint8 T1GCON : 0xf97; 

/*
 * OSCTUNE
 * 
 */
reg uint8 OSCTUNE : 0xf98; 

/*
 * RCSTA2
 * 
 */
reg uint8 RCSTA2 : 0xf99; 

/*
 * PIE1
 * 
 */
reg uint8 PIE1 : 0xf9a; 

/*
 * PIR1
 * 
 */
reg uint8 PIR1 : 0xf9b; 

/*
 * IPR1
 * 
 */
reg uint8 IPR1 : 0xf9c; 

/*
 * PIE2
 * 
 */
reg uint8 PIE2 : 0xf9d; 

/*
 * PIR2
 * 
 */
reg uint8 PIR2 : 0xf9e; 

/*
 * IPR2
 * 
 */
reg uint8 IPR2 : 0xf9f; 

/*
 * PIE3
 * 
 */
reg uint8 PIE3 : 0xfa0; 

/*
 * PIR3
 * 
 */
reg uint8 PIR3 : 0xfa1; 

/*
 * IPR3
 * 
 */
reg uint8 IPR3 : 0xfa2; 

/*
 * EECON1
 * 
 */
reg uint8 EECON1 : 0xfa3; 

/*
 * EECON2
 * 
 */
reg uint8 EECON2 : 0xfa4; 

/*
 * TXSTA2
 * 
 */
reg uint8 TXSTA2 : 0xfa5; 

/*
 * TXREG2
 * 
 */
reg uint8 TXREG2 : 0xfa6; 

/*
 * RCREG2
 * 
 */
reg uint8 RCREG2 : 0xfa7; 

/*
 * SPBRG2
 * 
 */
reg uint8 SPBRG2 : 0xfa8; 

/*
 * RCSTA1
 * 
 */
reg uint8 RCSTA1 : 0xfa9; 

/*
 * TXSTA1
 * 
 */
reg uint8 TXSTA1 : 0xfaa; 

/*
 * TXREG1
 * 
 */
reg uint8 TXREG1 : 0xfab; 

/*
 * RCREG1
 * 
 */
reg uint8 RCREG1 : 0xfac; 

/*
 * SPBRG1
 * 
 */
reg uint8 SPBRG1 : 0xfad; 

/*
 * CTMUICON
 * 
 */
reg uint8 CTMUICON : 0xfae; 

/*
 * CTMUCONL
 * 
 */
reg uint8 CTMUCONL : 0xfaf; 

/*
 * CTMUCONH
 * 
 */
reg uint8 CTMUCONH : 0xfb0; 

/*
 * CCP2CON
 * 
 */
reg uint8 CCP2CON : 0xfb1; 

/*
 * CCPR2
 * 
 */
reg uint16 CCPR2 : 0xfb2; 

/*
 * ECCP2DEL
 * 
 */
reg uint8 ECCP2DEL : 0xfb4; 

/*
 * ECCP2AS
 * 
 */
reg uint8 ECCP2AS : 0xfb5; 

/*
 * PSTR2CON
 * 
 */
reg uint8 PSTR2CON : 0xfb6; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0xfb7; 

/*
 * CCPR1
 * 
 */
reg uint16 CCPR1 : 0xfb8; 

/*
 * ECCP1DEL
 * 
 */
reg uint8 ECCP1DEL : 0xfba; 

/*
 * ECCP1AS
 * 
 */
reg uint8 ECCP1AS : 0xfbb; 

/*
 * PSTR1CON
 * 
 */
reg uint8 PSTR1CON : 0xfbc; 

/*
 * WDTCON
 * 
 */
reg uint8 WDTCON : 0xfbd; 

/*
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0xfbe; 

/*
 * ADCON0
 * 
 */
reg uint8 ADCON0 : 0xfbf; 

/*
 * ADRES
 * 
 */
reg uint16 ADRES : 0xfc0; 

/*
 * SSP1CON2
 * 
 */
reg uint8 SSP1CON2 : 0xfc2; 

/*
 * SSP1CON1
 * 
 */
reg uint8 SSP1CON1 : 0xfc3; 

/*
 * SSP1STAT
 * 
 */
reg uint8 SSP1STAT : 0xfc4; 

/*
 * SSP1BUF
 * 
 */
reg uint8 SSP1BUF : 0xfc5; 

/*
 * T2CON
 * 
 */
reg uint8 T2CON : 0xfc6; 

/*
 * PR2
 * 
 */
reg uint8 PR2 : 0xfc7; 

/*
 * TMR2
 * 
 */
reg uint8 TMR2 : 0xfc8; 

/*
 * T1CON
 * 
 */
reg uint8 T1CON : 0xfc9; 

/*
 * TMR1
 * 
 */
reg uint16 TMR1 : 0xfca; 

/*
 * RCON
 * 
 */
reg uint8 RCON : 0xfcc; 

/*
 * CM2CON
 * 
 */
reg uint8 CM2CON : 0xfcd; 

/*
 * CM1CON
 * 
 */
reg uint8 CM1CON : 0xfce; 

/*
 * OSCCON
 * 
 */
reg uint8 OSCCON : 0xfcf; 

/*
 * T0CON
 * 
 */
reg uint8 T0CON : 0xfd1; 

/*
 * TMR0
 * 
 */
reg uint16 TMR0 : 0xfd2; 

/*
 * STATUS
 * 
 */
reg uint8 STATUS : 0xfd4; 

/*
 * FSR2
 * 
 */
reg uint16 FSR2 : 0xfd5; 

/*
 * PLUSW2
 * 
 */
reg uint8 PLUSW2 : 0xfd7; 

/*
 * PREINC2
 * 
 */
reg uint8 PREINC2 : 0xfd8; 

/*
 * POSTDEC2
 * 
 */
reg uint8 POSTDEC2 : 0xfd9; 

/*
 * POSTINC2
 * 
 */
reg uint8 POSTINC2 : 0xfda; 

/*
 * INDF2
 * 
 */
reg uint8 INDF2 : 0xfdb; 

/*
 * BSR
 * 
 */
reg uint8 BSR : 0xfdc; 

/*
 * FSR1
 * 
 */
reg uint16 FSR1 : 0xfdd; 

/*
 * PLUSW1
 * 
 */
reg uint8 PLUSW1 : 0xfdf; 

/*
 * PREINC1
 * 
 */
reg uint8 PREINC1 : 0xfe0; 

/*
 * POSTDEC1
 * 
 */
reg uint8 POSTDEC1 : 0xfe1; 

/*
 * POSTINC1
 * 
 */
reg uint8 POSTINC1 : 0xfe2; 

/*
 * INDF1
 * 
 */
reg uint8 INDF1 : 0xfe3; 

/*
 * WREG
 * 
 */
reg uint8 WREG : 0xfe4; 

/*
 * FSR0
 * 
 */
reg uint16 FSR0 : 0xfe5; 

/*
 * PLUSW0
 * 
 */
reg uint8 PLUSW0 : 0xfe7; 

/*
 * PREINC0
 * 
 */
reg uint8 PREINC0 : 0xfe8; 

/*
 * POSTDEC0
 * 
 */
reg uint8 POSTDEC0 : 0xfe9; 

/*
 * POSTINC0
 * 
 */
reg uint8 POSTINC0 : 0xfea; 

/*
 * INDF0
 * 
 */
reg uint8 INDF0 : 0xfeb; 

/*
 * INTCON3
 * 
 */
reg uint8 INTCON3 : 0xfec; 

/*
 * INTCON2
 * 
 */
reg uint8 INTCON2 : 0xfed; 

/*
 * INTCON
 * 
 */
reg uint8 INTCON : 0xfee; 

/*
 * PROD
 * 
 */
reg uint16 PROD : 0xfef; 

/*
 * TABLAT
 * 
 */
reg uint8 TABLAT : 0xff1; 

/*
 * TBLPTR
 * 
 */
reg uint8 TBLPTR : 0xff2; 

/*
 * PCLAT
 * 
 */
reg uint8 PCLAT : 0xff5; 

/*
 * STKPTR
 * 
 */
reg uint8 STKPTR : 0xff8; 

/*
 * TOS
 * 
 */
reg uint8 TOS : 0xff9; 

