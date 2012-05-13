/*
 * Library for PIC16C71
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16C71{

	use e.platform;
	use microchip.pic16;

/*************************
 * Configuration
 ************************/
 

	const codeaddr configStartAddress = 0x2007
	/*
	 * Field: FOSC
	 * Oscillator selection bits
	 */
		/* RC oscillator */
		const uint8 CONFIG1_FOSC_RC = 0x3*1;
		/* LP oscillator */
		const uint8 CONFIG1_FOSC_LP = 0x0*1;
		/* XT oscillator */
		const uint8 CONFIG1_FOSC_XT = 0x1*1;
		/* HS oscillator */
		const uint8 CONFIG1_FOSC_HS = 0x2*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable bit
	 */
		/* WDT enabled */
		const uint8 CONFIG1_WDTE_ON = 0x1*4;
		/* WDT disabled */
		const uint8 CONFIG1_WDTE_OFF = 0x0*4;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT enabled */
		const uint8 CONFIG1_PWRTE_ON = 0x1*8;
		/* PWRT disabled */
		const uint8 CONFIG1_PWRTE_OFF = 0x0*8;
	/*
	 * Field: CP
	 * Code Protection bit
	 */
		/* Code protection off */
		const uint8 CONFIG1_CP_OFF = 0x1*16;
		/* Code protection on */
		const uint8 CONFIG1_CP_ON = 0x0*16;

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
 * ADCON0
 * 
 */
reg uint8 ADCON0 : 0x8; 

/*
 * ADRES
 * 
 */
reg uint8 ADRES : 0x9; 

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
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0x88; 
}
