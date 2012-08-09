/*
 * Library for PIC18F24K22
 * 
 * Architecture: 18xxxx
 */
library microchip.PIC18F24K22;

	use e.platform;
	use microchip.pic18;

/********************
 * Special function registers
 ********************/


/*
 * ANSELA
 * PORTA analog select bits
 */
reg uint8 ANSELA : 0xf38; 

/*
 * ANSELB
 * PORTB analog select bits
 */
reg uint8 ANSELB : 0xf39; 

/*
 * ANSELC
 * PORTC analog select bits
 */
reg uint8 ANSELC : 0xf3a; 

/*
 * PMD2
 * Power mode control bits
 */
reg uint8 PMD2 : 0xf3d; 

/*
 * PMD1
 * Power mode control bits
 */
reg uint8 PMD1 : 0xf3e; 

/*
 * PMD0
 * Power mode control bits
 */
reg uint8 PMD0 : 0xf3f; 

/*
 * VREFCON2
 * DAC voltage output select
 */
reg uint8 VREFCON2 : 0xf40; 

/*
 * VREFCON1
 * 
 */
reg uint8 VREFCON1 : 0xf41; 

/*
 * VREFCON0
 * 
 */
reg uint8 VREFCON0 : 0xf42; 

/*
 * CTMUICON
 * 
 */
reg uint8 CTMUICON : 0xf43; 

/*
 * CTMUCONL
 * 
 */
reg uint8 CTMUCONL : 0xf44; 

/*
 * CTMUCONH
 * 
 */
reg uint8 CTMUCONH : 0xf45; 

/*
 * SRCON1
 * 
 */
reg uint8 SRCON1 : 0xf46; 

/*
 * SRCON0
 * 
 */
reg uint8 SRCON0 : 0xf47; 

/*
 * CCPTMRS1
 * 
 */
reg uint8 CCPTMRS1 : 0xf48; 

/*
 * CCPTMRS0
 * 
 */
reg uint8 CCPTMRS0 : 0xf49; 

/*
 * T6CON
 * 
 */
reg uint8 T6CON : 0xf4a; 

/*
 * PR6
 * 
 */
reg uint8 PR6 : 0xf4b; 

/*
 * TMR6
 * 
 */
reg uint8 TMR6 : 0xf4c; 

/*
 * T5GCON
 * 
 */
reg uint8 T5GCON : 0xf4d; 

/*
 * T5CON
 * 
 */
reg uint8 T5CON : 0xf4e; 

/*
 * TMR5
 * 
 */
reg uint16 TMR5 : 0xf4f; 

/*
 * T4CON
 * 
 */
reg uint8 T4CON : 0xf51; 

/*
 * PR4
 * 
 */
reg uint8 PR4 : 0xf52; 

/*
 * TMR4
 * 
 */
reg uint8 TMR4 : 0xf53; 

/*
 * CCP5CON
 * 
 */
reg uint8 CCP5CON : 0xf54; 

/*
 * CCPR5
 * 
 */
reg uint16 CCPR5 : 0xf55; 

/*
 * CCP4CON
 * 
 */
reg uint8 CCP4CON : 0xf57; 

/*
 * CCPR4
 * 
 */
reg uint16 CCPR4 : 0xf58; 

/*
 * PSTR3CON
 * 
 */
reg uint8 PSTR3CON : 0xf5a; 

/*
 * ECCP3AS
 * 
 */
reg uint8 ECCP3AS : 0xf5b; 

/*
 * PWM3CON
 * 
 */
reg uint8 PWM3CON : 0xf5c; 

/*
 * CCP3CON
 * 
 */
reg uint8 CCP3CON : 0xf5d; 

/*
 * CCPR3
 * 
 */
reg uint16 CCPR3 : 0xf5e; 

/*
 * SLRCON
 * 
 */
reg uint8 SLRCON : 0xf60; 

/*
 * WPUB
 * 
 */
reg uint8 WPUB : 0xf61; 

/*
 * IOCB
 * 
 */
reg uint8 IOCB : 0xf62; 

/*
 * PSTR2CON
 * 
 */
reg uint8 PSTR2CON : 0xf63; 

/*
 * ECCP2AS
 * 
 */
reg uint8 ECCP2AS : 0xf64; 

/*
 * PWM2CON
 * 
 */
reg uint8 PWM2CON : 0xf65; 

/*
 * CCP2CON
 * 
 */
reg uint8 CCP2CON : 0xf66; 

/*
 * CCPR2
 * 
 */
reg uint16 CCPR2 : 0xf67; 

/*
 * SSP2CON3
 * 
 */
reg uint8 SSP2CON3 : 0xf69; 

/*
 * SSP2MSK
 * 
 */
reg uint8 SSP2MSK : 0xf6a; 

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
 * SSP2ADD
 * 
 */
reg uint8 SSP2ADD : 0xf6e; 

/*
 * SSP2BUF
 * 
 */
reg uint8 SSP2BUF : 0xf6f; 

/*
 * BAUDCON2
 * 
 */
reg uint8 BAUDCON2 : 0xf70; 

/*
 * RCSTA2
 * 
 */
reg uint8 RCSTA2 : 0xf71; 

/*
 * TXSTA2
 * 
 */
reg uint8 TXSTA2 : 0xf72; 

/*
 * TXREG2
 * 
 */
reg uint8 TXREG2 : 0xf73; 

/*
 * RCREG2
 * 
 */
reg uint8 RCREG2 : 0xf74; 

/*
 * SPBRG2
 * 
 */
reg uint8 SPBRG2 : 0xf75; 

/*
 * SPBRGH2
 * 
 */
reg uint8 SPBRGH2 : 0xf76; 

/*
 * CM2CON1
 * 
 */
reg uint8 CM2CON1 : 0xf77; 

/*
 * CM2CON0
 * 
 */
reg uint8 CM2CON0 : 0xf78; 

/*
 * CM1CON0
 * 
 */
reg uint8 CM1CON0 : 0xf79; 

/*
 * PIE4
 * 
 */
reg uint8 PIE4 : 0xf7a; 

/*
 * PIR4
 * 
 */
reg uint8 PIR4 : 0xf7b; 

/*
 * IPR4
 * 
 */
reg uint8 IPR4 : 0xf7c; 

/*
 * PIE5
 * 
 */
reg uint8 PIE5 : 0xf7d; 

/*
 * PIR5
 * 
 */
reg uint8 PIR5 : 0xf7e; 

/*
 * IPR5
 * 
 */
reg uint8 IPR5 : 0xf7f; 

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
 * TRISE
 * 
 */
reg uint8 TRISE : 0xf96; 

/*
 * OSCTUNE
 * 
 */
reg uint8 OSCTUNE : 0xf9b; 

/*
 * HLVDCON
 * 
 */
reg uint8 HLVDCON : 0xf9c; 

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
 * SPBRGH1
 * 
 */
reg uint8 SPBRGH1 : 0xfb0; 

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
 * T3GCON
 * 
 */
reg uint8 T3GCON : 0xfb4; 

/*
 * ECCP1AS
 * 
 */
reg uint8 ECCP1AS : 0xfb6; 

/*
 * PWM1CON
 * 
 */
reg uint8 PWM1CON : 0xfb7; 

/*
 * BAUDCON1
 * 
 */
reg uint8 BAUDCON1 : 0xfb8; 

/*
 * PSTR1CON
 * 
 */
reg uint8 PSTR1CON : 0xfb9; 

/*
 * T2CON
 * 
 */
reg uint8 T2CON : 0xfba; 

/*
 * PR2
 * 
 */
reg uint8 PR2 : 0xfbb; 

/*
 * TMR2
 * 
 */
reg uint8 TMR2 : 0xfbc; 

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
 * SSP1MSK
 * 
 */
reg uint8 SSP1MSK : 0xfca; 

/*
 * SSP1CON3
 * 
 */
reg uint8 SSP1CON3 : 0xfcb; 

/*
 * T1GCON
 * 
 */
reg uint8 T1GCON : 0xfcc; 

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
 * OSCCON2
 * 
 */
reg uint8 OSCCON2 : 0xfd2; 

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

