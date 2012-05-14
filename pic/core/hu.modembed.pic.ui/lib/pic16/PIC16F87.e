/*
 * Library for PIC16F87
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16F87;

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
		/* EXTRC oscillator; CLKO function on RA6/OSC2/CLKO */
		const uint16 CONFIG1_FOSC_EXTRCCLK = 0x13*1;
		/* EXTRC oscillator; port I/O function on RA6/OSC2/CLKO */
		const uint16 CONFIG1_FOSC_EXTRCIO = 0x12*1;
		/* INTRC oscillator; CLKO function on RA6/OSC2/CLKO pin and port I/O function on RA7/OSC1/CLKI pin */
		const uint16 CONFIG1_FOSC_INTOSCCLK = 0x11*1;
		/* INTRC oscillator; port I/O function on both RA6/OSC2/CLKO pin and RA7/OSC1/CLKI pin */
		const uint16 CONFIG1_FOSC_INTOSCIO = 0x10*1;
		/* ECIO; port I/O function on RA6/OSC2/CLKO */
		const uint16 CONFIG1_FOSC_EC = 0x3*1;
		/* HS oscillator */
		const uint16 CONFIG1_FOSC_HS = 0x2*1;
		/* XT oscillator */
		const uint16 CONFIG1_FOSC_XT = 0x1*1;
		/* LP oscillator */
		const uint16 CONFIG1_FOSC_LP = 0x0*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable bit
	 */
		/* WDT enabled */
		const uint16 CONFIG1_WDTE_ON = 0x1*32;
		/* WDT disabled */
		const uint16 CONFIG1_WDTE_OFF = 0x0*32;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT disabled */
		const uint16 CONFIG1_PWRTE_OFF = 0x1*64;
		/* PWRT enabled */
		const uint16 CONFIG1_PWRTE_ON = 0x0*64;
	/*
	 * Field: MCLRE
	 * RA5/MCLR/VPP Pin Function Select bit
	 */
		/* RA5/MCLR/VPP pin function is MCLR */
		const uint16 CONFIG1_MCLRE_ON = 0x1*128;
		/* RA5/MCLR/VPP pin function is digital I/O, MCLR internally tied to VDD */
		const uint16 CONFIG1_MCLRE_OFF = 0x0*128;
	/*
	 * Field: BOREN
	 * Brown-out Reset Enable bit
	 */
		/* BOR enabled */
		const uint16 CONFIG1_BOREN_ON = 0x1*256;
		/* BOR disabled */
		const uint16 CONFIG1_BOREN_OFF = 0x0*256;
	/*
	 * Field: LVP
	 * Low-Voltage Programming Enable bit
	 */
		/* RB3/PGM pin has PGM function, Low-Voltage Programming enabled */
		const uint16 CONFIG1_LVP_ON = 0x1*512;
		/* RB3 is digital I/O, HV on MCLR must be used for programming */
		const uint16 CONFIG1_LVP_OFF = 0x0*512;
	/*
	 * Field: CPD
	 * Data EE Memory Code Protection bit
	 */
		/* Code protection off */
		const uint16 CONFIG1_CPD_OFF = 0x1*1024;
		/* Data EE memory code-protected */
		const uint16 CONFIG1_CPD_ON = 0x0*1024;
	/*
	 * Field: WRT
	 * Flash Program Memory Write Enable bits
	 */
		/* Write protection off */
		const uint16 CONFIG1_WRT_OFF = 0x3*2048;
		/* 0000h to 00FFh write-protected, 0100h to 0FFFh may be modified by EECON control */
		const uint16 CONFIG1_WRT_256 = 0x2*2048;
		/* 0000h to 07FFh write-protected, 0800h to 0FFFh may be modified by EECON control */
		const uint16 CONFIG1_WRT_2048 = 0x1*2048;
		/* 0000h to 0FFFh write-protected */
		const uint16 CONFIG1_WRT_ALL = 0x0*2048;
	/*
	 * Field: DEBUG
	 * In-Circuit Debugger Mode bit
	 */
		/* In-Circuit Debugger disabled, RB6 and RB7 are general purpose I/O pins */
		const uint16 CONFIG1_DEBUG_OFF = 0x1*8192;
		/* In-Circuit Debugger enabled, RB6 and RB7 are dedicated to the debugger */
		const uint16 CONFIG1_DEBUG_ON = 0x0*8192;
	/*
	 * Field: CCPMX
	 * CCP1 Pin Selection bit
	 */
		/* CCP1 function on RB0 */
		const uint16 CONFIG1_CCPMX_RB0 = 0x1*16384;
		/* CCP1 function on RB3 */
		const uint16 CONFIG1_CCPMX_RB3 = 0x0*16384;
	/*
	 * Field: CP
	 * Flash Program Memory Code Protection bit
	 */
		/* Code protection off */
		const uint16 CONFIG1_CP_OFF = 0x1*32768;
		/* 0000h to 0FFFh code-protected (all protected) */
		const uint16 CONFIG1_CP_ON = 0x0*32768;
	/*
	 * Field: FCMEN
	 * Fail-Safe Clock Monitor Enable bit
	 */
		/* Fail-Safe Clock Monitor enabled */
		const uint16 CONFIG2_FCMEN_ON = 0x1*1;
		/* Fail-Safe Clock Monitor disabled */
		const uint16 CONFIG2_FCMEN_OFF = 0x0*1;
	/*
	 * Field: IESO
	 * Internal External Switchover bit
	 */
		/* Internal External Switchover mode enabled */
		const uint16 CONFIG2_IESO_ON = 0x1*2;
		/* Internal External Switchover mode disabled */
		const uint16 CONFIG2_IESO_OFF = 0x0*2;

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
 * CMCON
 * 
 */
reg uint8 CMCON : 0x9c; 

/*
 * CVRCON
 * 
 */
reg uint8 CVRCON : 0x9d; 

/*
 * WDTCON
 * 
 */
reg uint8 WDTCON : 0x105; 

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
