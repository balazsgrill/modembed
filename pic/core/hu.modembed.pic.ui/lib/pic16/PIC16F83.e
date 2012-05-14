/*
 * Library for PIC16F83
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16F83{

	use e.platform;
	use microchip.pic16;

/*************************
 * Configuration
 ************************/
 

	const codeaddr configStartAddress = 0x2007
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
	 * Watchdog Timer
	 */
		/* WDT enabled */
		const uint16 CONFIG_WDTE_ON = 0x1*4;
		/* WDT disabled */
		const uint16 CONFIG_WDTE_OFF = 0x0*4;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* Power-up Timer is disabled */
		const uint16 CONFIG_PWRTE_OFF = 0x1*8;
		/* Power-up Timer is enabled */
		const uint16 CONFIG_PWRTE_ON = 0x0*8;
	/*
	 * Field: CP
	 * Code Protection bit
	 */
		/* Code protection disabled */
		const uint16 CONFIG_CP_OFF = 0x3ff*16;
		/* All program memory is code protected */
		const uint16 CONFIG_CP_ON = 0x0*16;

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
 * EEDATA
 * 
 */
reg uint8 EEDATA : 0x8; 

/*
 * EEADR
 * 
 */
reg uint8 EEADR : 0x9; 

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
 * EECON1
 * 
 */
reg uint8 EECON1 : 0x88; 

/*
 * EECON2
 * 
 */
reg uint8 EECON2 : 0x89; 
}
