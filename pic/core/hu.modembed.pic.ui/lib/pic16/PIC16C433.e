/*
 * Library for PIC16C433
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16C433{

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
		/* EXTRC, clockout on OSC2 */
		const uint8 CONFIG1_FOSC_EXTRCCLK = 0x7*1;
		/* EXTRC, OSC2 is I/O */
		const uint8 CONFIG1_FOSC_EXTRCIO = 0x6*1;
		/* INTRC, clockout on OSC2 */
		const uint8 CONFIG1_FOSC_INTRCCLK = 0x5*1;
		/* INTRC, OSC2 is I/O */
		const uint8 CONFIG1_FOSC_INTRCIO = 0x4*1;
		/* EC I/O */
		const uint8 CONFIG1_FOSC_EXTCLK = 0x3*1;
		/* HS oscillator */
		const uint8 CONFIG1_FOSC_HS = 0x2*1;
		/* XT oscillator */
		const uint8 CONFIG1_FOSC_XT = 0x1*1;
		/* LP oscillator */
		const uint8 CONFIG1_FOSC_LP = 0x0*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable bit
	 */
		/* WDT enabled */
		const uint8 CONFIG1_WDTE_ON = 0x1*8;
		/* WDT disabled */
		const uint8 CONFIG1_WDTE_OFF = 0x0*8;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT disabled */
		const uint8 CONFIG1_PWRTE_OFF = 0x1*16;
		/* PWRT enabled */
		const uint8 CONFIG1_PWRTE_ON = 0x0*16;
	/*
	 * Field: CP
	 * Code Protection bits
	 */
		/* Code protection off */
		const uint8 CONFIG1_CP_OFF = 0x1fb*32;
		/* 0400h-07FEh code protected */
		const uint8 CONFIG1_CP_50 = 0x152*32;
		/* 0200h-07FEh code protected */
		const uint8 CONFIG1_CP_75 = 0xa9*32;
		/* All memory is code protected */
		const uint8 CONFIG1_CP_ALL = 0x0*32;
	/*
	 * Field: MCLRE
	 * Master Clear Enable
	 */
		/* External */
		const uint8 CONFIG1_MCLRE_ON = 0x1*16384;
		/* Internal */
		const uint8 CONFIG1_MCLRE_OFF = 0x0*16384;

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
 * GPIO
 * 
 */
reg uint8 GPIO : 0x5; 

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
 * ADRES
 * 
 */
reg uint8 ADRES : 0x1e; 

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
 * TRIS
 * 
 */
reg uint8 TRIS : 0x85; 

/*
 * PIE1
 * 
 */
reg uint8 PIE1 : 0x8c; 

/*
 * PCON
 * 
 */
reg uint8 PCON : 0x8e; 

/*
 * OSCCAL
 * 
 */
reg uint8 OSCCAL : 0x8f; 

/*
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0x9f; 
}
