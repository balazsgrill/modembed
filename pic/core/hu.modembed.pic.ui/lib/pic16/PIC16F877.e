/*
 * Library for PIC16F877
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16F877;

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
		/* RC oscillator */
		const uint16 CONFIG_FOSC_EXTRC = 0x3*1;
		/* HS oscillator */
		const uint16 CONFIG_FOSC_HS = 0x2*1;
		/* XT oscillator */
		const uint16 CONFIG_FOSC_XT = 0x1*1;
		/* LP oscillator */
		const uint16 CONFIG_FOSC_LP = 0x0*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable bit
	 */
		/* WDT enabled */
		const uint16 CONFIG_WDTE_ON = 0x1*4;
		/* WDT disabled */
		const uint16 CONFIG_WDTE_OFF = 0x0*4;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT disabled */
		const uint16 CONFIG_PWRTE_OFF = 0x1*8;
		/* PWRT enabled */
		const uint16 CONFIG_PWRTE_ON = 0x0*8;
	/*
	 * Field: CP
	 * FLASH Program Memory Code Protection bits
	 */
		/* Code protection off */
		const uint16 CONFIG_CP_OFF = 0x303*16;
		/* 1F00h to 1FFFh code protected */
		const uint16 CONFIG_CP_UPPER_256 = 0x202*16;
		/* 1000h to 1FFFh code protected */
		const uint16 CONFIG_CP_HALF = 0x101*16;
		/* 0000h to 1FFFh code protected */
		const uint16 CONFIG_CP_ALL = 0x0*16;
	/*
	 * Field: BOREN
	 * Brown-out Reset Enable bit
	 */
		/* BOR enabled */
		const uint16 CONFIG_BOREN_ON = 0x1*16384;
		/* BOR disabled */
		const uint16 CONFIG_BOREN_OFF = 0x0*16384;
	/*
	 * Field: LVP
	 * Low Voltage In-Circuit Serial Programming Enable bit
	 */
		/* RB3/PGM pin has PGM function; low-voltage programming enabled */
		const uint16 CONFIG_LVP_ON = 0x1*32768;
		/* RB3 is digital I/O, HV on MCLR must be used for programming */
		const uint16 CONFIG_LVP_OFF = 0x0*32768;
	/*
	 * Field: CPD
	 * Data EE Memory Code Protection
	 */
		/* Code Protection off */
		const uint16 CONFIG_CPD_OFF = 0x1*65536;
		/* Data EEPROM memory code-protected */
		const uint16 CONFIG_CPD_ON = 0x0*65536;
	/*
	 * Field: WRT
	 * FLASH Program Memory Write Enable
	 */
		/* Unprotected program memory may be written to by EECON control */
		const uint16 CONFIG_WRT_ON = 0x1*131072;
		/* Unprotected program memory may not be written to by EECON control */
		const uint16 CONFIG_WRT_OFF = 0x0*131072;
	/*
	 * Field: DEBUG
	 * In-Circuit Debugger Mode bit
	 */
		/* In-Circuit Debugger disabled, RB6 and RB7 are general purpose I/O pins */
		const uint16 CONFIG_DEBUG_OFF = 0x1*262144;
		/* In-Circuit Debugger enabled, RB6 and RB7 are dedicated to the debugger */
		const uint16 CONFIG_DEBUG_ON = 0x0*262144;

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
 * PORTD
 * 
 */
reg uint8 PORTD : 0x8; 

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
 * TRISD
 * 
 */
reg uint8 TRISD : 0x88; 

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
 * SSPADD
 * 
 */
reg uint8 SSPADD : 0x93; 

/*
 * SSPSTAT
 * 
 */
reg uint8 SSPSTAT : 0x94; 

/*
 * TXSTA
 * 
 */
reg uint8 TXSTA : 0x98; 

/*
 * SPBRG
 * 
 */
reg uint8 SPBRG : 0x99; 

/*
 * ADRESL
 * 
 */
reg uint8 ADRESL : 0x9e; 

/*
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0x9f; 

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
 * EECON1
 * 
 */
reg uint8 EECON1 : 0x18c; 

/*
 * EECON2
 * 
 */
reg uint8 EECON2 : 0x18d; 

