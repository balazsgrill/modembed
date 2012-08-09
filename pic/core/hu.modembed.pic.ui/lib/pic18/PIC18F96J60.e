/*
 * Library for PIC18F96J60
 * 
 * Architecture: 18xxxx
 */
library microchip.PIC18F96J60;

	use e.platform;
	use microchip.pic18;

/********************
 * Special function registers
 ********************/


/*
 * MAADR5
 * 
 */
reg uint8 MAADR5 : 0xe80; 

/*
 * MAADR6
 * 
 */
reg uint8 MAADR6 : 0xe81; 

/*
 * MAADR3
 * 
 */
reg uint8 MAADR3 : 0xe82; 

/*
 * MAADR4
 * 
 */
reg uint8 MAADR4 : 0xe83; 

/*
 * MAADR1
 * 
 */
reg uint8 MAADR1 : 0xe84; 

/*
 * MAADR2
 * 
 */
reg uint8 MAADR2 : 0xe85; 

/*
 * MISTAT
 * 
 */
reg uint8 MISTAT : 0xe8a; 

/*
 * EFLOCON
 * 
 */
reg uint8 EFLOCON : 0xe97; 

/*
 * EPAUS
 * 
 */
reg uint16 EPAUS : 0xe98; 

/*
 * MACON1
 * 
 */
reg uint8 MACON1 : 0xea0; 

/*
 * MACON3
 * 
 */
reg uint8 MACON3 : 0xea2; 

/*
 * MACON4
 * 
 */
reg uint8 MACON4 : 0xea3; 

/*
 * MABBIPG
 * 
 */
reg uint8 MABBIPG : 0xea4; 

/*
 * MAIPG
 * 
 */
reg uint16 MAIPG : 0xea6; 

/*
 * MAMXFL
 * 
 */
reg uint16 MAMXFL : 0xeaa; 

/*
 * MICMD
 * 
 */
reg uint8 MICMD : 0xeb2; 

/*
 * MIREGADR
 * 
 */
reg uint8 MIREGADR : 0xeb4; 

/*
 * MIWR
 * 
 */
reg uint16 MIWR : 0xeb6; 

/*
 * MIRD
 * 
 */
reg uint16 MIRD : 0xeb8; 

/*
 * EHT0
 * 
 */
reg uint8 EHT0 : 0xec0; 

/*
 * EHT1
 * 
 */
reg uint8 EHT1 : 0xec1; 

/*
 * EHT2
 * 
 */
reg uint8 EHT2 : 0xec2; 

/*
 * EHT3
 * 
 */
reg uint8 EHT3 : 0xec3; 

/*
 * EHT4
 * 
 */
reg uint8 EHT4 : 0xec4; 

/*
 * EHT5
 * 
 */
reg uint8 EHT5 : 0xec5; 

/*
 * EHT6
 * 
 */
reg uint8 EHT6 : 0xec6; 

/*
 * EHT7
 * 
 */
reg uint8 EHT7 : 0xec7; 

/*
 * EPMM0
 * 
 */
reg uint8 EPMM0 : 0xec8; 

/*
 * EPMM1
 * 
 */
reg uint8 EPMM1 : 0xec9; 

/*
 * EPMM2
 * 
 */
reg uint8 EPMM2 : 0xeca; 

/*
 * EPMM3
 * 
 */
reg uint8 EPMM3 : 0xecb; 

/*
 * EPMM4
 * 
 */
reg uint8 EPMM4 : 0xecc; 

/*
 * EPMM5
 * 
 */
reg uint8 EPMM5 : 0xecd; 

/*
 * EPMM6
 * 
 */
reg uint8 EPMM6 : 0xece; 

/*
 * EPMM7
 * 
 */
reg uint8 EPMM7 : 0xecf; 

/*
 * EPMCS
 * 
 */
reg uint16 EPMCS : 0xed0; 

/*
 * EPMO
 * 
 */
reg uint16 EPMO : 0xed4; 

/*
 * ERXFCON
 * 
 */
reg uint8 ERXFCON : 0xed8; 

/*
 * EPKTCNT
 * 
 */
reg uint8 EPKTCNT : 0xed9; 

/*
 * EWRPT
 * 
 */
reg uint16 EWRPT : 0xee2; 

/*
 * ETXST
 * 
 */
reg uint16 ETXST : 0xee4; 

/*
 * ETXND
 * 
 */
reg uint16 ETXND : 0xee6; 

/*
 * ERXST
 * 
 */
reg uint16 ERXST : 0xee8; 

/*
 * ERXND
 * 
 */
reg uint16 ERXND : 0xeea; 

/*
 * ERXRDPT
 * 
 */
reg uint16 ERXRDPT : 0xeec; 

/*
 * ERXWRPT
 * 
 */
reg uint16 ERXWRPT : 0xeee; 

/*
 * EDMAST
 * 
 */
reg uint16 EDMAST : 0xef0; 

/*
 * EDMAND
 * 
 */
reg uint16 EDMAND : 0xef2; 

/*
 * EDMADST
 * 
 */
reg uint16 EDMADST : 0xef4; 

/*
 * EDMACS
 * 
 */
reg uint16 EDMACS : 0xef6; 

/*
 * EIE
 * 
 */
reg uint8 EIE : 0xefb; 

/*
 * ESTAT
 * 
 */
reg uint8 ESTAT : 0xefd; 

/*
 * ECON2
 * 
 */
reg uint8 ECON2 : 0xefe; 

/*
 * EIR
 * 
 */
reg uint8 EIR : 0xf60; 

/*
 * EDATA
 * 
 */
reg uint8 EDATA : 0xf61; 

/*
 * SSP2CON2
 * 
 */
reg uint8 SSP2CON2 : 0xf62; 

/*
 * SSP2CON1
 * 
 */
reg uint8 SSP2CON1 : 0xf63; 

/*
 * SSP2STAT
 * 
 */
reg uint8 SSP2STAT : 0xf64; 

/*
 * SSP2ADD
 * 
 */
reg uint8 SSP2ADD : 0xf65; 

/*
 * SSP2BUF
 * 
 */
reg uint8 SSP2BUF : 0xf66; 

/*
 * ECCP2DEL
 * 
 */
reg uint8 ECCP2DEL : 0xf67; 

/*
 * ECCP2AS
 * 
 */
reg uint8 ECCP2AS : 0xf68; 

/*
 * ECCP3DEL
 * 
 */
reg uint8 ECCP3DEL : 0xf69; 

/*
 * ECCP3AS
 * 
 */
reg uint8 ECCP3AS : 0xf6a; 

/*
 * RCSTA2
 * 
 */
reg uint8 RCSTA2 : 0xf6b; 

/*
 * TXSTA2
 * 
 */
reg uint8 TXSTA2 : 0xf6c; 

/*
 * TXREG2
 * 
 */
reg uint8 TXREG2 : 0xf6d; 

/*
 * RCREG2
 * 
 */
reg uint8 RCREG2 : 0xf6e; 

/*
 * SPBRG2
 * 
 */
reg uint8 SPBRG2 : 0xf6f; 

/*
 * CCP5CON
 * 
 */
reg uint8 CCP5CON : 0xf70; 

/*
 * CCPR5
 * 
 */
reg uint16 CCPR5 : 0xf71; 

/*
 * CCP4CON
 * 
 */
reg uint8 CCP4CON : 0xf73; 

/*
 * CCPR4
 * 
 */
reg uint16 CCPR4 : 0xf74; 

/*
 * T4CON
 * 
 */
reg uint8 T4CON : 0xf76; 

/*
 * PR4
 * 
 */
reg uint8 PR4 : 0xf77; 

/*
 * TMR4
 * 
 */
reg uint8 TMR4 : 0xf78; 

/*
 * ECCP1DEL
 * 
 */
reg uint8 ECCP1DEL : 0xf79; 

/*
 * ERDPT
 * 
 */
reg uint16 ERDPT : 0xf7a; 

/*
 * BAUDCON2
 * 
 */
reg uint8 BAUDCON2 : 0xf7c; 

/*
 * SPBRGH2
 * 
 */
reg uint8 SPBRGH2 : 0xf7d; 

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
 * MEMCON
 * 
 */
reg uint8 MEMCON : 0xf9c; 

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
 * PSPCON
 * 
 */
reg uint8 PSPCON : 0xfb0; 

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
 * ECCP1AS
 * 
 */
reg uint8 ECCP1AS : 0xfb6; 

/*
 * CCP3CON
 * 
 */
reg uint8 CCP3CON : 0xfb7; 

/*
 * CCPR3
 * 
 */
reg uint16 CCPR3 : 0xfb8; 

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
 * ECON1
 * 
 */
reg uint8 ECON1 : 0xfd2; 

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

