/*
 * Library for PIC18F67K90
 * 
 * Architecture: 18xxxx
 */
library microchip.PIC18F67K90;

	use e.platform;
	use microchip.pic18;

/********************
 * Special function registers
 ********************/


/*
 * LCDCON
 * 
 */
reg uint8 LCDCON : 0xef4; 

/*
 * LCDPS
 * 
 */
reg uint8 LCDPS : 0xef5; 

/*
 * LCDSE0
 * 
 */
reg uint8 LCDSE0 : 0xef6; 

/*
 * LCDSE1
 * 
 */
reg uint8 LCDSE1 : 0xef7; 

/*
 * LCDSE2
 * 
 */
reg uint8 LCDSE2 : 0xef8; 

/*
 * LCDSE3
 * 
 */
reg uint8 LCDSE3 : 0xef9; 

/*
 * LCDSE4
 * 
 */
reg uint8 LCDSE4 : 0xefa; 

/*
 * LCDRL
 * 
 */
reg uint8 LCDRL : 0xefc; 

/*
 * LCDREF
 * 
 */
reg uint8 LCDREF : 0xefd; 

/*
 * SSP2CON2
 * 
 */
reg uint8 SSP2CON2 : 0xefe; 

/*
 * SSP2CON1
 * 
 */
reg uint8 SSP2CON1 : 0xeff; 

/*
 * SSP2STAT
 * 
 */
reg uint8 SSP2STAT : 0xf00; 

/*
 * SSP2ADD
 * 
 */
reg uint8 SSP2ADD : 0xf01; 

/*
 * SSP2BUF
 * 
 */
reg uint8 SSP2BUF : 0xf02; 

/*
 * T4CON
 * 
 */
reg uint8 T4CON : 0xf03; 

/*
 * PR4
 * 
 */
reg uint8 PR4 : 0xf04; 

/*
 * TMR4
 * 
 */
reg uint8 TMR4 : 0xf05; 

/*
 * CCP7CON
 * 
 */
reg uint8 CCP7CON : 0xf06; 

/*
 * CCPR7
 * 
 */
reg uint16 CCPR7 : 0xf07; 

/*
 * CCP6CON
 * 
 */
reg uint8 CCP6CON : 0xf09; 

/*
 * CCPR6
 * 
 */
reg uint16 CCPR6 : 0xf0a; 

/*
 * CCP5CON
 * 
 */
reg uint8 CCP5CON : 0xf0c; 

/*
 * CCPR5
 * 
 */
reg uint16 CCPR5 : 0xf0d; 

/*
 * CCP4CON
 * 
 */
reg uint8 CCP4CON : 0xf0f; 

/*
 * CCPR4
 * 
 */
reg uint16 CCPR4 : 0xf10; 

/*
 * T5GCON
 * 
 */
reg uint8 T5GCON : 0xf12; 

/*
 * T5CON
 * 
 */
reg uint8 T5CON : 0xf13; 

/*
 * TMR5
 * 
 */
reg uint16 TMR5 : 0xf14; 

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
 * LCDDATA0
 * 
 */
reg uint8 LCDDATA0 : 0xf66; 

/*
 * LCDDATA1
 * 
 */
reg uint8 LCDDATA1 : 0xf67; 

/*
 * LCDDATA2
 * 
 */
reg uint8 LCDDATA2 : 0xf68; 

/*
 * LCDDATA3
 * 
 */
reg uint8 LCDDATA3 : 0xf69; 

/*
 * LCDDATA4
 * 
 */
reg uint8 LCDDATA4 : 0xf6a; 

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
 * EECON2
 * 
 */
reg uint8 EECON2 : 0xf7e; 

/*
 * EECON1
 * 
 */
reg uint8 EECON1 : 0xf7f; 

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
 * OSCTUNE
 * 
 */
reg uint8 OSCTUNE : 0xf9b; 

/*
 * PSTR1CON
 * 
 */
reg uint8 PSTR1CON : 0xf9c; 

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
 * PIR6
 * 
 */
reg uint8 PIR6 : 0xfa6; 

/*
 * HLVDCON
 * 
 */
reg uint8 HLVDCON : 0xfa8; 

/*
 * IPR6
 * 
 */
reg uint8 IPR6 : 0xfa9; 

/*
 * T1GCON
 * 
 */
reg uint8 T1GCON : 0xfaa; 

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
 * T3GCON
 * 
 */
reg uint8 T3GCON : 0xfb0; 

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
 * CMSTAT
 * 
 */
reg uint8 CMSTAT : 0xfb4; 

/*
 * CVRCON
 * 
 */
reg uint8 CVRCON : 0xfb5; 

/*
 * PIE4
 * 
 */
reg uint8 PIE4 : 0xfb6; 

/*
 * PIR4
 * 
 */
reg uint8 PIR4 : 0xfb7; 

/*
 * IPR4
 * 
 */
reg uint8 IPR4 : 0xfb8; 

/*
 * PIE5
 * 
 */
reg uint8 PIE5 : 0xfb9; 

/*
 * PIR5
 * 
 */
reg uint8 PIR5 : 0xfba; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0xfbb; 

/*
 * CCPR1
 * 
 */
reg uint16 CCPR1 : 0xfbc; 

/*
 * ECCP1DEL
 * 
 */
reg uint8 ECCP1DEL : 0xfbe; 

/*
 * ECCP1AS
 * 
 */
reg uint8 ECCP1AS : 0xfbf; 

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
 * SSP1CON2
 * 
 */
reg uint8 SSP1CON2 : 0xfc5; 

/*
 * SSP1CON1
 * 
 */
reg uint8 SSP1CON1 : 0xfc6; 

/*
 * SSP1STAT
 * 
 */
reg uint8 SSP1STAT : 0xfc7; 

/*
 * SSP1ADD
 * 
 */
reg uint8 SSP1ADD : 0xfc8; 

/*
 * SSP1BUF
 * 
 */
reg uint8 SSP1BUF : 0xfc9; 

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
 * IPR5
 * 
 */
reg uint8 IPR5 : 0xfd2; 

/*
 * OSCCON
 * 
 */
reg uint8 OSCCON : 0xfd3; 

/*
 * SPBRGH1
 * 
 */
reg uint8 SPBRGH1 : 0xfd4; 

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

