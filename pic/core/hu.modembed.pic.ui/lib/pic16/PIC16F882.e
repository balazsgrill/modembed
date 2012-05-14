/*
 * Library for PIC16F882
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16F882;

	use e.platform;
	use microchip.pic16;

/*************************
 * Configuration
 ************************/
 

	const codeaddr configStartAddress = 0x2007;
	/*
	 * Field: FOSC
	 * Oscillator Selection bits
	 */
		/* RC oscillator: CLKOUT function on RA6/OSC2/CLKOUT pin, RC on RA7/OSC1/CLKIN */
		const uint16 CONFIG1_FOSC_EXTRC_CLKOUT = 0x7*1;
		/* RCIO oscillator: I/O function on RA6/OSC2/CLKOUT pin, RC on RA7/OSC1/CLKIN */
		const uint16 CONFIG1_FOSC_EXTRC_NOCLKOUT = 0x6*1;
		/* INTOSC oscillator: CLKOUT function on RA6/OSC2/CLKOUT pin, I/O function on RA7/OSC1/CLKIN */
		const uint16 CONFIG1_FOSC_INTRC_CLKOUT = 0x5*1;
		/* INTOSCIO oscillator: I/O function on RA6/OSC2/CLKOUT pin, I/O function on RA7/OSC1/CLKIN */
		const uint16 CONFIG1_FOSC_INTRC_NOCLKOUT = 0x4*1;
		/* EC: I/O function on RA6/OSC2/CLKOUT pin, CLKIN on RA7/OSC1/CLKIN */
		const uint16 CONFIG1_FOSC_EC = 0x3*1;
		/* HS oscillator: High-speed crystal/resonator on RA6/OSC2/CLKOUT and RA7/OSC1/CLKIN */
		const uint16 CONFIG1_FOSC_HS = 0x2*1;
		/* XT oscillator: Crystal/resonator on RA6/OSC2/CLKOUT and RA7/OSC1/CLKIN */
		const uint16 CONFIG1_FOSC_XT = 0x1*1;
		/* LP oscillator: Low-power crystal on RA6/OSC2/CLKOUT and RA7/OSC1/CLKIN */
		const uint16 CONFIG1_FOSC_LP = 0x0*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable bit
	 */
		/* WDT enabled */
		const uint16 CONFIG1_WDTE_ON = 0x1*8;
		/* WDT disabled and can be enabled by SWDTEN bit of the WDTCON register */
		const uint16 CONFIG1_WDTE_OFF = 0x0*8;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT disabled */
		const uint16 CONFIG1_PWRTE_OFF = 0x1*16;
		/* PWRT enabled */
		const uint16 CONFIG1_PWRTE_ON = 0x0*16;
	/*
	 * Field: MCLRE
	 * RE3/MCLR pin function select bit
	 */
		/* RE3/MCLR pin function is MCLR */
		const uint16 CONFIG1_MCLRE_ON = 0x1*32;
		/* RE3/MCLR pin function is digital input, MCLR internally tied to VDD */
		const uint16 CONFIG1_MCLRE_OFF = 0x0*32;
	/*
	 * Field: CP
	 * Code Protection bit
	 */
		/* Program memory code protection is disabled */
		const uint16 CONFIG1_CP_OFF = 0x1*64;
		/* Program memory code protection is enabled */
		const uint16 CONFIG1_CP_ON = 0x0*64;
	/*
	 * Field: CPD
	 * Data Code Protection bit
	 */
		/* Data memory code protection is disabled */
		const uint16 CONFIG1_CPD_OFF = 0x1*128;
		/* Data memory code protection is enabled */
		const uint16 CONFIG1_CPD_ON = 0x0*128;
	/*
	 * Field: BOREN
	 * Brown Out Reset Selection bits
	 */
		/* BOR enabled */
		const uint16 CONFIG1_BOREN_ON = 0x3*256;
		/* BOR enabled during operation and disabled in Sleep */
		const uint16 CONFIG1_BOREN_NSLEEP = 0x2*256;
		/* BOR controlled by SBOREN bit of the PCON register */
		const uint16 CONFIG1_BOREN_SBODEN = 0x1*256;
		/* BOR disabled */
		const uint16 CONFIG1_BOREN_OFF = 0x0*256;
	/*
	 * Field: IESO
	 * Internal External Switchover bit
	 */
		/* Internal/External Switchover mode is enabled */
		const uint16 CONFIG1_IESO_ON = 0x1*1024;
		/* Internal/External Switchover mode is disabled */
		const uint16 CONFIG1_IESO_OFF = 0x0*1024;
	/*
	 * Field: FCMEN
	 * Fail-Safe Clock Monitor Enabled bit
	 */
		/* Fail-Safe Clock Monitor is enabled */
		const uint16 CONFIG1_FCMEN_ON = 0x1*2048;
		/* Fail-Safe Clock Monitor is disabled */
		const uint16 CONFIG1_FCMEN_OFF = 0x0*2048;
	/*
	 * Field: LVP
	 * Low Voltage Programming Enable bit
	 */
		/* RB3/PGM pin has PGM function, low voltage programming enabled */
		const uint16 CONFIG1_LVP_ON = 0x1*4096;
		/* RB3 pin has digital I/O, HV on MCLR must be used for programming */
		const uint16 CONFIG1_LVP_OFF = 0x0*4096;
	/*
	 * Field: DEBUG
	 * In-Circuit Debugger Mode bit
	 */
		/* In-Circuit Debugger disabled, RB6/ICSPCLK and RB7/ICSPDAT are general purpose I/O pins */
		const uint16 CONFIG1_DEBUG_OFF = 0x1*8192;
		/* In_Circuit Debugger enabled, RB6/ICSPCLK and RB7/ICSPDAT are dedicated to the debugger */
		const uint16 CONFIG1_DEBUG_ON = 0x0*8192;
	/*
	 * Field: BOR4V
	 * Brown-out Reset Selection bit
	 */
		/* Brown-out Reset set to 2.1V */
		const uint16 CONFIG2_BOR4V_BOR21V = 0x0*1;
		/* Brown-out Reset set to 4.0V */
		const uint16 CONFIG2_BOR4V_BOR40V = 0x1*1;
	/*
	 * Field: WRT
	 * Flash Program Memory Self Write Enable bits
	 */
		/* 0000h to 03FFh write protected, 0400h to 07FFh may be modified by EECON control */
		const uint16 CONFIG2_WRT_HALF = 0x0*2;
		/* 0000h to 00FFh write protected, 0100h to 07FFh may be modified by EECON control */
		const uint16 CONFIG2_WRT_1FOURTH = 0x1*2;
		/* Write protection off */
		const uint16 CONFIG2_WRT_OFF = 0x3*2;

/********************
 * Special function registers
 ********************/


/*
 * INDF
 * 
 */
reg uint8 INDF : 0x0; 

/*
 * TMR0
 * 
 */
reg uint8 TMR0 : 0x1; 

/*
 * PCL
 * 
 */
reg uint8 PCL : 0x2; 

/*
 * STATUS
 * 
 */
reg uint8 STATUS : 0x3; 

/*
 * FSR
 * 
 */
reg uint8 FSR : 0x4; 

/*
 * PORTA
 * 
 */
reg uint8 PORTA : 0x5; 

/*
 * PORTB
 * 
 */
reg uint8 PORTB : 0x6; 

/*
 * PORTC
 * 
 */
reg uint8 PORTC : 0x7; 

/*
 * PORTE
 * 
 */
reg uint8 PORTE : 0x9; 

/*
 * PCLATH
 * 
 */
reg uint8 PCLATH : 0xa; 

/*
 * INTCON
 * 
 */
reg uint8 INTCON : 0xb; 

/*
 * PIR1
 * 
 */
reg uint8 PIR1 : 0xc; 

/*
 * PIR2
 * 
 */
reg uint8 PIR2 : 0xd; 

/*
 * TMR1
 * 
 */
reg uint16 TMR1 : 0xe; 

/*
 * T1CON
 * 
 */
reg uint8 T1CON : 0x10; 

/*
 * TMR2
 * 
 */
reg uint8 TMR2 : 0x11; 

/*
 * T2CON
 * 
 */
reg uint8 T2CON : 0x12; 

/*
 * SSPBUF
 * 
 */
reg uint8 SSPBUF : 0x13; 

/*
 * SSPCON
 * 
 */
reg uint8 SSPCON : 0x14; 

/*
 * CCPR1
 * 
 */
reg uint16 CCPR1 : 0x15; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0x17; 

/*
 * RCSTA
 * 
 */
reg uint8 RCSTA : 0x18; 

/*
 * TXREG
 * 
 */
reg uint8 TXREG : 0x19; 

/*
 * RCREG
 * 
 */
reg uint8 RCREG : 0x1a; 

/*
 * CCPR2
 * 
 */
reg uint16 CCPR2 : 0x1b; 

/*
 * CCP2CON
 * 
 */
reg uint8 CCP2CON : 0x1d; 

/*
 * ADRESH
 * 
 */
reg uint8 ADRESH : 0x1e; 

/*
 * ADCON0
 * 
 */
reg uint8 ADCON0 : 0x1f; 

/*
 * OPTION_REG
 * 
 */
reg uint8 OPTION_REG : 0x81; 

/*
 * TRISA
 * 
 */
reg uint8 TRISA : 0x85; 

/*
 * TRISB
 * 
 */
reg uint8 TRISB : 0x86; 

/*
 * TRISC
 * 
 */
reg uint8 TRISC : 0x87; 

/*
 * TRISE
 * 
 */
reg uint8 TRISE : 0x89; 

/*
 * PIE1
 * 
 */
reg uint8 PIE1 : 0x8c; 

/*
 * PIE2
 * 
 */
reg uint8 PIE2 : 0x8d; 

/*
 * PCON
 * 
 */
reg uint8 PCON : 0x8e; 

/*
 * OSCCON
 * 
 */
reg uint8 OSCCON : 0x8f; 

/*
 * OSCTUNE
 * 
 */
reg uint8 OSCTUNE : 0x90; 

/*
 * SSPCON2
 * 
 */
reg uint8 SSPCON2 : 0x91; 

/*
 * PR2
 * 
 */
reg uint8 PR2 : 0x92; 

/*
 * SSPSTAT
 * 
 */
reg uint8 SSPSTAT : 0x93; 

/*
 * WPUB
 * 
 */
reg uint8 WPUB : 0x94; 

/*
 * IOCB
 * 
 */
reg uint8 IOCB : 0x95; 

/*
 * VRCON
 * 
 */
reg uint8 VRCON : 0x96; 

/*
 * TXSTA
 * 
 */
reg uint8 TXSTA : 0x97; 

/*
 * SPBRG
 * 
 */
reg uint8 SPBRG : 0x98; 

/*
 * SPBRGH
 * 
 */
reg uint8 SPBRGH : 0x99; 

/*
 * PWM1CON
 * 
 */
reg uint8 PWM1CON : 0x9a; 

/*
 * ECCPAS
 * 
 */
reg uint8 ECCPAS : 0x9b; 

/*
 * PSTRCON
 * 
 */
reg uint8 PSTRCON : 0x9c; 

/*
 * ADRESL
 * 
 */
reg uint8 ADRESL : 0x9d; 

/*
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0x9e; 

/*
 * WDTCON
 * 
 */
reg uint8 WDTCON : 0x105; 

/*
 * CM1CON0
 * 
 */
reg uint8 CM1CON0 : 0x107; 

/*
 * CM2CON0
 * 
 */
reg uint8 CM2CON0 : 0x108; 

/*
 * CM2CON1
 * 
 */
reg uint8 CM2CON1 : 0x109; 

/*
 * EEDATA
 * 
 */
reg uint8 EEDATA : 0x10c; 

/*
 * EEADR
 * 
 */
reg uint8 EEADR : 0x10d; 

/*
 * EEDATH
 * 
 */
reg uint8 EEDATH : 0x10e; 

/*
 * EEADRH
 * 
 */
reg uint8 EEADRH : 0x10f; 

/*
 * SRCON
 * 
 */
reg uint8 SRCON : 0x185; 

/*
 * BAUDCTL
 * 
 */
reg uint8 BAUDCTL : 0x187; 

/*
 * ANSEL
 * 
 */
reg uint8 ANSEL : 0x188; 

/*
 * ANSELH
 * 
 */
reg uint8 ANSELH : 0x189; 

/*
 * EECON1
 * 
 */
reg uint8 EECON1 : 0x18c; 

/*
 * EECON2
 * 
 */
reg uint8 EECON2 : 0x18d; 

