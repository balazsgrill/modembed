/*
 * Library for PIC18F67K22
 * 
 * Architecture: 18xxxx
 */
library microchip.PIC18F67K22;

	use e.platform;
	use microchip.pic18;

/********************
 * Special function registers
 ********************/


/*
 * PMD3
 * 
 */
reg uint8 PMD3 : 0xf16; 

/*
 * PMD2
 * 
 */
reg uint8 PMD2 : 0xf17; 

/*
 * PMD1
 * 
 */
reg uint8 PMD1 : 0xf18; 

/*
 * PMD0
 * 
 */
reg uint8 PMD0 : 0xf19; 

/*
 * PSTR3CON
 * 
 */
reg uint8 PSTR3CON : 0xf1a; 

/*
 * PSTR2CON
 * 
 */
reg uint8 PSTR2CON : 0xf1b; 

/*
 * TXREG2
 * 
 */
reg uint8 TXREG2 : 0xf1c; 

/*
 * RCREG2
 * 
 */
reg uint8 RCREG2 : 0xf1d; 

/*
 * SPBRG2
 * 
 */
reg uint8 SPBRG2 : 0xf1e; 

/*
 * SPBRGH2
 * 
 */
reg uint8 SPBRGH2 : 0xf1f; 

/*
 * BAUDCON2
 * 
 */
reg uint8 BAUDCON2 : 0xf20; 

/*
 * TXSTA2
 * 
 */
reg uint8 TXSTA2 : 0xf21; 

/*
 * RCSTA2
 * 
 */
reg uint8 RCSTA2 : 0xf22; 

/*
 * ANCON2
 * 
 */
reg uint8 ANCON2 : 0xf23; 

/*
 * ANCON1
 * 
 */
reg uint8 ANCON1 : 0xf24; 

/*
 * ANCON0
 * 
 */
reg uint8 ANCON0 : 0xf25; 

/*
 * ODCON3
 * 
 */
reg uint8 ODCON3 : 0xf27; 

/*
 * ODCON2
 * 
 */
reg uint8 ODCON2 : 0xf28; 

/*
 * ODCON1
 * 
 */
reg uint8 ODCON1 : 0xf29; 

/*
 * REFOCON
 * 
 */
reg uint8 REFOCON : 0xf2a; 

/*
 * CCPTMRS2
 * 
 */
reg uint8 CCPTMRS2 : 0xf2b; 

/*
 * CCPTMRS1
 * 
 */
reg uint8 CCPTMRS1 : 0xf2c; 

/*
 * CCPTMRS0
 * 
 */
reg uint8 CCPTMRS0 : 0xf2d; 

/*
 * CM3CON
 * 
 */
reg uint8 CM3CON : 0xf2e; 

/*
 * CM2CON
 * 
 */
reg uint8 CM2CON : 0xf2f; 

/*
 * T12CON
 * 
 */
reg uint8 T12CON : 0xf30; 

/*
 * PR12
 * 
 */
reg uint8 PR12 : 0xf31; 

/*
 * TMR12
 * 
 */
reg uint8 TMR12 : 0xf32; 

/*
 * T10CON
 * 
 */
reg uint8 T10CON : 0xf33; 

/*
 * PR10
 * 
 */
reg uint8 PR10 : 0xf34; 

/*
 * TMR10
 * 
 */
reg uint8 TMR10 : 0xf35; 

/*
 * T8CON
 * 
 */
reg uint8 T8CON : 0xf36; 

/*
 * PR8
 * 
 */
reg uint8 PR8 : 0xf37; 

/*
 * TMR8
 * 
 */
reg uint8 TMR8 : 0xf38; 

/*
 * T6CON
 * 
 */
reg uint8 T6CON : 0xf39; 

/*
 * PR6
 * 
 */
reg uint8 PR6 : 0xf3a; 

/*
 * TMR6
 * 
 */
reg uint8 TMR6 : 0xf3b; 

/*
 * T7GCON
 * 
 */
reg uint8 T7GCON : 0xf3c; 

/*
 * T7CON
 * 
 */
reg uint8 T7CON : 0xf3d; 

/*
 * TMR7
 * 
 */
reg uint16 TMR7 : 0xf3e; 

/*
 * CCP10CON
 * 
 */
reg uint8 CCP10CON : 0xf40; 

/*
 * CCPR10
 * 
 */
reg uint16 CCPR10 : 0xf41; 

/*
 * CCP9CON
 * 
 */
reg uint8 CCP9CON : 0xf43; 

/*
 * CCPR9
 * 
 */
reg uint16 CCPR9 : 0xf44; 

/*
 * CCP8CON
 * 
 */
reg uint8 CCP8CON : 0xf46; 

/*
 * CCPR8
 * 
 */
reg uint16 CCPR8 : 0xf47; 

/*
 * CCP3CON
 * 
 */
reg uint8 CCP3CON : 0xf49; 

/*
 * CCPR3
 * 
 */
reg uint16 CCPR3 : 0xf4a; 

/*
 * ECCP3DEL
 * 
 */
reg uint8 ECCP3DEL : 0xf4c; 

/*
 * ECCP3AS
 * 
 */
reg uint8 ECCP3AS : 0xf4d; 

/*
 * CCP2CON
 * 
 */
reg uint8 CCP2CON : 0xf4e; 

/*
 * CCPR2
 * 
 */
reg uint16 CCPR2 : 0xf4f; 

/*
 * ECCP2DEL
 * 
 */
reg uint8 ECCP2DEL : 0xf51; 

/*
 * ECCP2AS
 * 
 */
reg uint8 ECCP2AS : 0xf52; 

/*
 * PADCFG1
 * 
 */
reg uint8 PADCFG1 : 0xf53; 

/*
 * CM1CON
 * 
 */
reg uint8 CM1CON : 0xf54; 

/*
 * CTMUICON
 * 
 */
reg uint8 CTMUICON : 0xf55; 

/*
 * CTMUCONL
 * 
 */
reg uint8 CTMUCONL : 0xf56; 

/*
 * CTMUCONH
 * 
 */
reg uint8 CTMUCONH : 0xf57; 

/*
 * ALRMVAL
 * 
 */
reg uint16 ALRMVAL : 0xf58; 

/*
 * ALRMRPT
 * 
 */
reg uint8 ALRMRPT : 0xf5a; 

/*
 * ALRMCFG
 * 
 */
reg uint8 ALRMCFG : 0xf5b; 

/*
 * RTCVAL
 * 
 */
reg uint16 RTCVAL : 0xf5c; 

/*
 * RTCCAL
 * 
 */
reg uint8 RTCCAL : 0xf5e; 

/*
 * RTCCFG
 * 
 */
reg uint8 RTCCFG : 0xf5f; 

/*
 * PIE6
 * 
 */
reg uint8 PIE6 : 0xf60; 

/*
 * EEDATA
 * 
 */
reg uint8 EEDATA : 0xf61; 

/*
 * EEADR
 * 
 */
reg uint8 EEADR : 0xf62; 

/*
 * EEADRH
 * 
 */
reg uint8 EEADRH : 0xf63; 

/*
 * OSCCON2
 * 
 */
reg uint8 OSCCON2 : 0xf64; 

/*
 * BAUDCON1
 * 
 */
reg uint8 BAUDCON1 : 0xf65; 

/*
 * SSP2CON2
 * 
 */
reg uint8 SSP2CON2 : 0xf66; 

/*
 * SSP2CON1
 * 
 */
reg uint8 SSP2CON1 : 0xf67; 

/*
 * SSP2STAT
 * 
 */
reg uint8 SSP2STAT : 0xf68; 

/*
 * SSP2BUF
 * 
 */
reg uint8 SSP2BUF : 0xf69; 

/*
 * T4CON
 * 
 */
reg uint8 T4CON : 0xf6a; 

/*
 * PR4
 * 
 */
reg uint8 PR4 : 0xf6b; 

/*
 * TMR4
 * 
 */
reg uint8 TMR4 : 0xf6c; 

/*
 * CCP7CON
 * 
 */
reg uint8 CCP7CON : 0xf6d; 

/*
 * CCPR7
 * 
 */
reg uint16 CCPR7 : 0xf6e; 

/*
 * CCP6CON
 * 
 */
reg uint8 CCP6CON : 0xf70; 

/*
 * CCPR6
 * 
 */
reg uint16 CCPR6 : 0xf71; 

/*
 * CCP5CON
 * 
 */
reg uint8 CCP5CON : 0xf73; 

/*
 * CCPR5
 * 
 */
reg uint16 CCPR5 : 0xf74; 

/*
 * CCP4CON
 * 
 */
reg uint8 CCP4CON : 0xf76; 

/*
 * CCPR4
 * 
 */
reg uint16 CCPR4 : 0xf77; 

/*
 * T5GCON
 * 
 */
reg uint8 T5GCON : 0xf79; 

/*
 * T5CON
 * 
 */
reg uint8 T5CON : 0xf7a; 

/*
 * TMR5
 * 
 */
reg uint16 TMR5 : 0xf7b; 

/*
 * EECON2
 * 
 */
reg uint8 EECON2 : 0xf7d; 

/*
 * EECON1
 * 
 */
reg uint8 EECON1 : 0xf7e; 

/*
 * PORTA
 * 
 */
reg uint8 PORTA : 0xf7f; 

/*
 * PORTB
 * 
 */
reg uint8 PORTB : 0xf80; 

/*
 * PORTC
 * 
 */
reg uint8 PORTC : 0xf81; 

/*
 * PORTD
 * 
 */
reg uint8 PORTD : 0xf82; 

/*
 * PORTE
 * 
 */
reg uint8 PORTE : 0xf83; 

/*
 * PORTF
 * 
 */
reg uint8 PORTF : 0xf84; 

/*
 * PORTG
 * 
 */
reg uint8 PORTG : 0xf85; 

/*
 * LATA
 * 
 */
reg uint8 LATA : 0xf88; 

/*
 * LATB
 * 
 */
reg uint8 LATB : 0xf89; 

/*
 * LATC
 * 
 */
reg uint8 LATC : 0xf8a; 

/*
 * LATD
 * 
 */
reg uint8 LATD : 0xf8b; 

/*
 * LATE
 * 
 */
reg uint8 LATE : 0xf8c; 

/*
 * LATF
 * 
 */
reg uint8 LATF : 0xf8d; 

/*
 * LATG
 * 
 */
reg uint8 LATG : 0xf8e; 

/*
 * TRISA
 * 
 */
reg uint8 TRISA : 0xf91; 

/*
 * TRISB
 * 
 */
reg uint8 TRISB : 0xf92; 

/*
 * TRISC
 * 
 */
reg uint8 TRISC : 0xf93; 

/*
 * TRISD
 * 
 */
reg uint8 TRISD : 0xf94; 

/*
 * TRISE
 * 
 */
reg uint8 TRISE : 0xf95; 

/*
 * TRISF
 * 
 */
reg uint8 TRISF : 0xf96; 

/*
 * TRISG
 * 
 */
reg uint8 TRISG : 0xf97; 

/*
 * OSCTUNE
 * 
 */
reg uint8 OSCTUNE : 0xf9a; 

/*
 * PSTR1CON
 * 
 */
reg uint8 PSTR1CON : 0xf9b; 

/*
 * PIE1
 * 
 */
reg uint8 PIE1 : 0xf9c; 

/*
 * PIR1
 * 
 */
reg uint8 PIR1 : 0xf9d; 

/*
 * IPR1
 * 
 */
reg uint8 IPR1 : 0xf9e; 

/*
 * PIE2
 * 
 */
reg uint8 PIE2 : 0xf9f; 

/*
 * PIR2
 * 
 */
reg uint8 PIR2 : 0xfa0; 

/*
 * IPR2
 * 
 */
reg uint8 IPR2 : 0xfa1; 

/*
 * PIE3
 * 
 */
reg uint8 PIE3 : 0xfa2; 

/*
 * PIR3
 * 
 */
reg uint8 PIR3 : 0xfa3; 

/*
 * IPR3
 * 
 */
reg uint8 IPR3 : 0xfa4; 

/*
 * PIR6
 * 
 */
reg uint8 PIR6 : 0xfa5; 

/*
 * PSPCON
 * 
 */
reg uint8 PSPCON : 0xfa6; 

/*
 * HLVDCON
 * 
 */
reg uint8 HLVDCON : 0xfa7; 

/*
 * IPR6
 * 
 */
reg uint8 IPR6 : 0xfa8; 

/*
 * T1GCON
 * 
 */
reg uint8 T1GCON : 0xfa9; 

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
 * T3GCON
 * 
 */
reg uint8 T3GCON : 0xfaf; 

/*
 * T3CON
 * 
 */
reg uint8 T3CON : 0xfb0; 

/*
 * TMR3
 * 
 */
reg uint16 TMR3 : 0xfb1; 

/*
 * CMSTAT
 * 
 */
reg uint8 CMSTAT : 0xfb3; 

/*
 * CVRCON
 * 
 */
reg uint8 CVRCON : 0xfb4; 

/*
 * PIE4
 * 
 */
reg uint8 PIE4 : 0xfb5; 

/*
 * PIR4
 * 
 */
reg uint8 PIR4 : 0xfb6; 

/*
 * IPR4
 * 
 */
reg uint8 IPR4 : 0xfb7; 

/*
 * PIE5
 * 
 */
reg uint8 PIE5 : 0xfb8; 

/*
 * PIR5
 * 
 */
reg uint8 PIR5 : 0xfb9; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0xfba; 

/*
 * CCPR1
 * 
 */
reg uint16 CCPR1 : 0xfbb; 

/*
 * ECCP1DEL
 * 
 */
reg uint8 ECCP1DEL : 0xfbd; 

/*
 * ECCP1AS
 * 
 */
reg uint8 ECCP1AS : 0xfbe; 

/*
 * ADCON2
 * 
 */
reg uint8 ADCON2 : 0xfbf; 

/*
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0xfc0; 

/*
 * ADCON0
 * 
 */
reg uint8 ADCON0 : 0xfc1; 

/*
 * ADRES
 * 
 */
reg uint16 ADRES : 0xfc2; 

/*
 * SSP1CON2
 * 
 */
reg uint8 SSP1CON2 : 0xfc4; 

/*
 * SSP1CON1
 * 
 */
reg uint8 SSP1CON1 : 0xfc5; 

/*
 * SSP1STAT
 * 
 */
reg uint8 SSP1STAT : 0xfc6; 

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
 * WDTCON
 * 
 */
reg uint8 WDTCON : 0xfcf; 

/*
 * IPR5
 * 
 */
reg uint8 IPR5 : 0xfd0; 

/*
 * OSCCON
 * 
 */
reg uint8 OSCCON : 0xfd1; 

/*
 * SPBRGH1
 * 
 */
reg uint8 SPBRGH1 : 0xfd2; 

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

