/*
 * Library for PIC16F1824.
 * 
 * Architecture: 16Exxx
 */
library microchip.PIC16F1824{
use e.platform;

/**************************************
 * SFR Data sector sfr0
 * Bank: 0
 **************************************/
	
/*
 * INDF0
 * 
 * Size: 8 bits
 */
register uint8 INDF0 : 0x0;
	
/*
 * INDF1
 * 
 * Size: 8 bits
 */
register uint8 INDF1 : 0x1;
	
/*
 * PCL
 * 
 * Size: 8 bits
 */
register uint8 PCL : 0x2;
	
/*
 * STATUS
 * 
 * Size: 8 bits
 */
register uint8 STATUS : 0x3;
	
/*
 * FSR0
 * 
 * Size: 16 bits
 */
register uint16 FSR0 : 0x4;
	
/*
 * FSR1
 * 
 * Size: 16 bits
 */
register uint16 FSR1 : 0x6;
	
/*
 * BSR
 * 
 * Size: 8 bits
 */
register uint8 BSR : 0x8;
	
/*
 * WREG
 * 
 * Size: 8 bits
 */
register uint8 WREG : 0x9;
	
/*
 * PCLATH
 * 
 * Size: 8 bits
 */
register uint8 PCLATH : 0xA;
	
/*
 * INTCON
 * 
 * Size: 8 bits
 */
register uint8 INTCON : 0xB;
	
/*
 * PORTA
 * 
 * Size: 8 bits
 */
register uint8 PORTA : 0xC;
	
/* Adjustpoint - 8 bits */
	
/*
 * PORTC
 * 
 * Size: 8 bits
 */
register uint8 PORTC : 0xE;
	
/* Adjustpoint - 16 bits */
	
/*
 * PIR1
 * 
 * Size: 8 bits
 */
register uint8 PIR1 : 0x11;
	
/*
 * PIR2
 * 
 * Size: 8 bits
 */
register uint8 PIR2 : 0x12;
	
/*
 * PIR3
 * 
 * Size: 8 bits
 */
register uint8 PIR3 : 0x13;
	
/* Adjustpoint - 8 bits */
	
/*
 * TMR0
 * 
 * Size: 8 bits
 */
register uint8 TMR0 : 0x15;
	
/*
 * TMR1
 * 
 * Size: 16 bits
 */
register uint16 TMR1 : 0x16;
	
/*
 * T1CON
 * 
 * Size: 8 bits
 */
register uint8 T1CON : 0x18;
	
/*
 * T1GCON
 * 
 * Size: 8 bits
 */
register uint8 T1GCON : 0x19;
	
/*
 * TMR2
 * 
 * Size: 8 bits
 */
register uint8 TMR2 : 0x1A;
	
/*
 * PR2
 * 
 * Size: 8 bits
 */
register uint8 PR2 : 0x1B;
	
/*
 * T2CON
 * 
 * Size: 8 bits
 */
register uint8 T2CON : 0x1C;
	
/* Adjustpoint - 8 bits */
	
/*
 * CPSCON0
 * 
 * Size: 8 bits
 */
register uint8 CPSCON0 : 0x1E;
	
/*
 * CPSCON1
 * 
 * Size: 8 bits
 */
register uint8 CPSCON1 : 0x1F;
	
/**************************************
 * SFR Data sector sfr1
 * Bank: 1
 **************************************/
	
/*
 * TRISA
 * PORTA Data Direction Control Register
 * Size: 8 bits
 */
register uint8 TRISA : 0x8C;
	
/* Adjustpoint - 8 bits */
	
/*
 * TRISC
 * PORTB Data Direction Control Register
 * Size: 8 bits
 */
register uint8 TRISC : 0x8E;
	
/* Adjustpoint - 16 bits */
	
/*
 * PIE1
 * Peripheral Interrupt Enable Register 1
 * Size: 8 bits
 */
register uint8 PIE1 : 0x91;
	
/*
 * PIE2
 * Peripheral Interrupt Enable Register 2
 * Size: 8 bits
 */
register uint8 PIE2 : 0x92;
	
/*
 * PIE3
 * 
 * Size: 8 bits
 */
register uint8 PIE3 : 0x93;
	
/* Adjustpoint - 8 bits */
	
/*
 * OPTION_REG
 * Option Register
 * Size: 8 bits
 */
register uint8 OPTION_REG : 0x95;
	
/*
 * PCON
 * Power Control Register
 * Size: 8 bits
 */
register uint8 PCON : 0x96;
	
/*
 * WDTCON
 * Watchdog Timer Control Register
 * Size: 8 bits
 */
register uint8 WDTCON : 0x97;
	
/*
 * OSCTUNE
 * Oscillator Tuning Register
 * Size: 8 bits
 */
register uint8 OSCTUNE : 0x98;
	
/*
 * OSCCON
 * Oscillator Control Register
 * Size: 8 bits
 */
register uint8 OSCCON : 0x99;
	
/*
 * OSCSTAT
 * Oscillator Status Register
 * Size: 8 bits
 */
register uint8 OSCSTAT : 0x9A;
	
/*
 * ADRES
 * 
 * Size: 16 bits
 */
register uint16 ADRES : 0x9B;
	
/*
 * ADCON0
 * Analog-to-Digital Control Register 0
 * Size: 8 bits
 */
register uint8 ADCON0 : 0x9D;
	
/*
 * ADCON1
 * Analog-to-Digital Control Register 1
 * Size: 8 bits
 */
register uint8 ADCON1 : 0x9E;
	
/**************************************
 * SFR Data sector sfr2
 * Bank: 2
 **************************************/
	
/*
 * LATA
 * 
 * Size: 8 bits
 */
register uint8 LATA : 0x10C;
	
/* Adjustpoint - 8 bits */
	
/*
 * LATC
 * 
 * Size: 8 bits
 */
register uint8 LATC : 0x10E;
	
/* Adjustpoint - 16 bits */
	
/*
 * CM1CON0
 * 
 * Size: 8 bits
 */
register uint8 CM1CON0 : 0x111;
	
/*
 * CM1CON1
 * 
 * Size: 8 bits
 */
register uint8 CM1CON1 : 0x112;
	
/*
 * CM2CON0
 * 
 * Size: 8 bits
 */
register uint8 CM2CON0 : 0x113;
	
/*
 * CM2CON1
 * 
 * Size: 8 bits
 */
register uint8 CM2CON1 : 0x114;
	
/*
 * CMOUT
 * Comparator Output Register
 * Size: 8 bits
 */
register uint8 CMOUT : 0x115;
	
/*
 * BORCON
 * Brown-out Reset Control Register
 * Size: 8 bits
 */
register uint8 BORCON : 0x116;
	
/*
 * FVRCON
 * Fixed Voltage Reference Control Register
 * Size: 8 bits
 */
register uint8 FVRCON : 0x117;
	
/*
 * DACCON0
 * Voltage Reference Control Register 0
 * Size: 8 bits
 */
register uint8 DACCON0 : 0x118;
	
/*
 * DACCON1
 * Voltage Reference Control Register 1
 * Size: 8 bits
 */
register uint8 DACCON1 : 0x119;
	
/*
 * SRCON0
 * SR Latch Control Register 0
 * Size: 8 bits
 */
register uint8 SRCON0 : 0x11A;
	
/*
 * SRCON1
 * SR Latch Control Register 1
 * Size: 8 bits
 */
register uint8 SRCON1 : 0x11B;
	
/* Adjustpoint - 8 bits */
	
/*
 * APFCON0
 * Alternate Pin Function Control Register
 * Size: 8 bits
 */
register uint8 APFCON0 : 0x11D;
	
/*
 * APFCON1
 * 
 * Size: 8 bits
 */
register uint8 APFCON1 : 0x11E;
	
/**************************************
 * SFR Data sector sfr3
 * Bank: 3
 **************************************/
	
/*
 * ANSELA
 * 
 * Size: 8 bits
 */
register uint8 ANSELA : 0x18C;
	
/* Adjustpoint - 8 bits */
	
/*
 * ANSELC
 * 
 * Size: 8 bits
 */
register uint8 ANSELC : 0x18E;
	
/* Adjustpoint - 16 bits */
	
/*
 * EEADR
 * 
 * Size: 16 bits
 */
register uint16 EEADR : 0x191;
	
/*
 * EEDAT
 * 
 * Size: 16 bits
 */
register uint16 EEDAT : 0x193;
	
/*
 * EECON1
 * 
 * Size: 8 bits
 */
register uint8 EECON1 : 0x195;
	
/*
 * EECON2
 * 
 * Size: 8 bits
 */
register uint8 EECON2 : 0x196;
	
/* Adjustpoint - 16 bits */
	
/*
 * RCREG
 * 
 * Size: 8 bits
 */
register uint8 RCREG : 0x199;
	
/*
 * TXREG
 * 
 * Size: 8 bits
 */
register uint8 TXREG : 0x19A;
	
/*
 * SPBRGL
 * 
 * Size: 8 bits
 */
register uint8 SPBRGL : 0x19B;
	
/*
 * SPBRGH
 * 
 * Size: 8 bits
 */
register uint8 SPBRGH : 0x19C;
	
/*
 * RCSTA
 * Receive Status and Control Register
 * Size: 8 bits
 */
register uint8 RCSTA : 0x19D;
	
/*
 * TXSTA
 * Transmit Status and Control Register
 * Size: 8 bits
 */
register uint8 TXSTA : 0x19E;
	
/*
 * BAUDCON
 * Baud Rate Control Register
 * Size: 8 bits
 */
register uint8 BAUDCON : 0x19F;
	
/**************************************
 * SFR Data sector sfr4
 * Bank: 4
 **************************************/
	
/*
 * WPUA
 * 
 * Size: 8 bits
 */
register uint8 WPUA : 0x20C;
	
/* Adjustpoint - 8 bits */
	
/*
 * WPUC
 * 
 * Size: 8 bits
 */
register uint8 WPUC : 0x20E;
	
/* Adjustpoint - 16 bits */
	
/*
 * SSP1BUF
 * 
 * Size: 8 bits
 */
register uint8 SSP1BUF : 0x211;
	
/*
 * SSP1ADD
 * 
 * Size: 8 bits
 */
register uint8 SSP1ADD : 0x212;
	
/*
 * SSP1MSK
 * 
 * Size: 8 bits
 */
register uint8 SSP1MSK : 0x213;
	
/*
 * SSP1STAT
 * 
 * Size: 8 bits
 */
register uint8 SSP1STAT : 0x214;
	
/*
 * SSP1CON
 * 
 * Size: 8 bits
 */
register uint8 SSP1CON : 0x215;
	
/*
 * SSP1CON2
 * 
 * Size: 8 bits
 */
register uint8 SSP1CON2 : 0x216;
	
/*
 * SSP1CON3
 * 
 * Size: 8 bits
 */
register uint8 SSP1CON3 : 0x217;
	
/**************************************
 * SFR Data sector sfr5
 * Bank: 5
 **************************************/
	
/* Adjustpoint - 40 bits */
	
/*
 * CCPR1L
 * 
 * Size: 8 bits
 */
register uint8 CCPR1L : 0x291;
	
/*
 * CCPR1H
 * 
 * Size: 8 bits
 */
register uint8 CCPR1H : 0x292;
	
/*
 * CCP1CON
 * 
 * Size: 8 bits
 */
register uint8 CCP1CON : 0x293;
	
/*
 * PWM1CON
 * 
 * Size: 8 bits
 */
register uint8 PWM1CON : 0x294;
	
/*
 * CCP1AS
 * 
 * Size: 8 bits
 */
register uint8 CCP1AS : 0x295;
	
/*
 * PSTR1CON
 * 
 * Size: 8 bits
 */
register uint8 PSTR1CON : 0x296;
	
/* Adjustpoint - 8 bits */
	
/*
 * CCPR2L
 * 
 * Size: 8 bits
 */
register uint8 CCPR2L : 0x298;
	
/*
 * CCPR2H
 * 
 * Size: 8 bits
 */
register uint8 CCPR2H : 0x299;
	
/*
 * CCP2CON
 * 
 * Size: 8 bits
 */
register uint8 CCP2CON : 0x29A;
	
/*
 * PWM2CON
 * 
 * Size: 8 bits
 */
register uint8 PWM2CON : 0x29B;
	
/*
 * CCP2AS
 * 
 * Size: 8 bits
 */
register uint8 CCP2AS : 0x29C;
	
/*
 * PSTR2CON
 * 
 * Size: 8 bits
 */
register uint8 PSTR2CON : 0x29D;
	
/*
 * CCPTMRS0
 * 
 * Size: 8 bits
 */
register uint8 CCPTMRS0 : 0x29E;
	
/**************************************
 * SFR Data sector sfr6
 * Bank: 6
 **************************************/
	
/* Adjustpoint - 40 bits */
	
/*
 * CCPR3L
 * 
 * Size: 8 bits
 */
register uint8 CCPR3L : 0x311;
	
/*
 * CCPR3H
 * 
 * Size: 8 bits
 */
register uint8 CCPR3H : 0x312;
	
/*
 * CCP3CON
 * 
 * Size: 8 bits
 */
register uint8 CCP3CON : 0x313;
	
/* Adjustpoint - 32 bits */
	
/*
 * CCPR4L
 * 
 * Size: 8 bits
 */
register uint8 CCPR4L : 0x318;
	
/*
 * CCPR4H
 * 
 * Size: 8 bits
 */
register uint8 CCPR4H : 0x319;
	
/*
 * CCP4CON
 * 
 * Size: 8 bits
 */
register uint8 CCP4CON : 0x31A;
	
/**************************************
 * SFR Data sector sfr7
 * Bank: 7
 **************************************/
	
/*
 * INLVLA
 * 
 * Size: 8 bits
 */
register uint8 INLVLA : 0x38C;
	
/* Adjustpoint - 8 bits */
	
/*
 * INLVLC
 * 
 * Size: 8 bits
 */
register uint8 INLVLC : 0x38E;
	
/* Adjustpoint - 16 bits */
	
/*
 * IOCAP
 * Interrupt-On-Change Positive Edge Register
 * Size: 8 bits
 */
register uint8 IOCAP : 0x391;
	
/*
 * IOCAN
 * Interrupt-On-Change Negative Edge Register
 * Size: 8 bits
 */
register uint8 IOCAN : 0x392;
	
/*
 * IOCAF
 * Interrupt-On-Change Flag Register
 * Size: 8 bits
 */
register uint8 IOCAF : 0x393;
	
/* Adjustpoint - 48 bits */
	
/*
 * CLKRCON
 * 
 * Size: 8 bits
 */
register uint8 CLKRCON : 0x39A;
	
/* Adjustpoint - 8 bits */
	
/*
 * MDCON
 * 
 * Size: 8 bits
 */
register uint8 MDCON : 0x39C;
	
/*
 * MDSRC
 * 
 * Size: 8 bits
 */
register uint8 MDSRC : 0x39D;
	
/*
 * MDCARL
 * 
 * Size: 8 bits
 */
register uint8 MDCARL : 0x39E;
	
/*
 * MDCARH
 * 
 * Size: 8 bits
 */
register uint8 MDCARH : 0x39F;
	
/**************************************
 * SFR Data sector sfr8
 * Bank: 8
 **************************************/
	
/* Adjustpoint - 72 bits */
	
/*
 * TMR4
 * 
 * Size: 8 bits
 */
register uint8 TMR4 : 0x415;
	
/*
 * PR4
 * 
 * Size: 8 bits
 */
register uint8 PR4 : 0x416;
	
/*
 * T4CON
 * 
 * Size: 8 bits
 */
register uint8 T4CON : 0x417;
	
/* Adjustpoint - 32 bits */
	
/*
 * TMR6
 * 
 * Size: 8 bits
 */
register uint8 TMR6 : 0x41C;
	
/*
 * PR6
 * 
 * Size: 8 bits
 */
register uint8 PR6 : 0x41D;
	
/*
 * T6CON
 * 
 * Size: 8 bits
 */
register uint8 T6CON : 0x41E;
	
/**************************************
 * SFR Data sector sfr9
 * Bank: 9
 **************************************/
	
/**************************************
 * SFR Data sector sfr10
 * Bank: 10
 **************************************/
	
/**************************************
 * SFR Data sector sfr11
 * Bank: 11
 **************************************/
	
/**************************************
 * SFR Data sector sfr12
 * Bank: 12
 **************************************/
	
/**************************************
 * SFR Data sector sfr13
 * Bank: 13
 **************************************/
	
/**************************************
 * SFR Data sector sfr14
 * Bank: 14
 **************************************/
	
/**************************************
 * SFR Data sector sfr15
 * Bank: 15
 **************************************/
	
/**************************************
 * SFR Data sector sfr16
 * Bank: 16
 **************************************/
	
/**************************************
 * SFR Data sector sfr17
 * Bank: 17
 **************************************/
	
/**************************************
 * SFR Data sector sfr18
 * Bank: 18
 **************************************/
	
/**************************************
 * SFR Data sector sfr19
 * Bank: 19
 **************************************/
	
/**************************************
 * SFR Data sector sfr20
 * Bank: 20
 **************************************/
	
/**************************************
 * SFR Data sector sfr21
 * Bank: 21
 **************************************/
	
/**************************************
 * SFR Data sector sfr22
 * Bank: 22
 **************************************/
	
/**************************************
 * SFR Data sector sfr23
 * Bank: 23
 **************************************/
	
/**************************************
 * SFR Data sector sfr24
 * Bank: 24
 **************************************/
	
/**************************************
 * SFR Data sector sfr25
 * Bank: 25
 **************************************/
	
/**************************************
 * SFR Data sector sfr26
 * Bank: 26
 **************************************/
	
/**************************************
 * SFR Data sector sfr27
 * Bank: 27
 **************************************/
	
/**************************************
 * SFR Data sector sfr28
 * Bank: 28
 **************************************/
	
/**************************************
 * SFR Data sector sfr29
 * Bank: 29
 **************************************/
	
/**************************************
 * SFR Data sector sfr30
 * Bank: 30
 **************************************/
	
/**************************************
 * SFR Data sector sfr31
 * Bank: 31
 **************************************/
	
/* Adjustpoint - 704 bits */
	
/*
 * STATUS_SHAD
 * 
 * Size: 8 bits
 */
register uint8 STATUS_SHAD : 0xFE4;
	
/*
 * WREG_SHAD
 * 
 * Size: 8 bits
 */
register uint8 WREG_SHAD : 0xFE5;
	
/*
 * BSR_SHAD
 * 
 * Size: 8 bits
 */
register uint8 BSR_SHAD : 0xFE6;
	
/*
 * PCLATH_SHAD
 * 
 * Size: 8 bits
 */
register uint8 PCLATH_SHAD : 0xFE7;
	
/*
 * FSR0L_SHAD
 * 
 * Size: 8 bits
 */
register uint8 FSR0L_SHAD : 0xFE8;
	
/*
 * FSR0H_SHAD
 * 
 * Size: 8 bits
 */
register uint8 FSR0H_SHAD : 0xFE9;
	
/*
 * FSR1L_SHAD
 * 
 * Size: 8 bits
 */
register uint8 FSR1L_SHAD : 0xFEA;
	
/*
 * FSR1H_SHAD
 * 
 * Size: 8 bits
 */
register uint8 FSR1H_SHAD : 0xFEB;
	
/* Adjustpoint - 8 bits */
	
/*
 * STKPTR
 * Current Stack pointer
 * Size: 8 bits
 */
register uint8 STKPTR : 0xFED;
	
/*
 * TOSL
 * Top of Stack Low byte
 * Size: 8 bits
 */
register uint8 TOSL : 0xFEE;
	
/*
 * TOSH
 * Top of Stack High byte
 * Size: 8 bits
 */
register uint8 TOSH : 0xFEF;
	
}
