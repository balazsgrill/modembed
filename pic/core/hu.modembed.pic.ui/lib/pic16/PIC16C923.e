/*
 * Library for PIC16C923
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16C923{

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
		const uint16 CONFIG1_FOSC_RC = 0x3*1;
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
		const uint16 CONFIG1_WDTE_ON = 0x1*4;
		/* WDT disabled */
		const uint16 CONFIG1_WDTE_OFF = 0x0*4;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT disabled */
		const uint16 CONFIG1_PWRTE_OFF = 0x1*8;
		/* PWRT enabled */
		const uint16 CONFIG1_PWRTE_ON = 0x0*8;
	/*
	 * Field: CP
	 * Code Protection bits
	 */
		/* Code protection off */
		const uint16 CONFIG1_CP_OFF = 0x3f3*16;
		/* 0800h-0FFFh code protected */
		const uint16 CONFIG1_CP_50 = 0x2a2*16;
		/* 0400h-0FFFh code protected */
		const uint16 CONFIG1_CP_75 = 0x151*16;
		/* All memory is code protected */
		const uint16 CONFIG1_CP_ALL = 0x0*16;

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
 * PCON
 * 
 */
reg uint8 PCON : 0x8e; 

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
 * PORTF
 * 
 */
reg uint8 PORTF : 0x107; 

/*
 * PORTG
 * 
 */
reg uint8 PORTG : 0x108; 

/*
 * LCDSE
 * 
 */
reg uint8 LCDSE : 0x10d; 

/*
 * LCDPS
 * 
 */
reg uint8 LCDPS : 0x10e; 

/*
 * LCDCON
 * 
 */
reg uint8 LCDCON : 0x10f; 

/*
 * LCDD00
 * 
 */
reg uint8 LCDD00 : 0x110; 

/*
 * LCDD01
 * 
 */
reg uint8 LCDD01 : 0x111; 

/*
 * LCDD02
 * 
 */
reg uint8 LCDD02 : 0x112; 

/*
 * LCDD03
 * 
 */
reg uint8 LCDD03 : 0x113; 

/*
 * LCDD04
 * 
 */
reg uint8 LCDD04 : 0x114; 

/*
 * LCDD05
 * 
 */
reg uint8 LCDD05 : 0x115; 

/*
 * LCDD06
 * 
 */
reg uint8 LCDD06 : 0x116; 

/*
 * LCDD07
 * 
 */
reg uint8 LCDD07 : 0x117; 

/*
 * LCDD08
 * 
 */
reg uint8 LCDD08 : 0x118; 

/*
 * LCDD09
 * 
 */
reg uint8 LCDD09 : 0x119; 

/*
 * LCDD10
 * 
 */
reg uint8 LCDD10 : 0x11a; 

/*
 * LCDD11
 * 
 */
reg uint8 LCDD11 : 0x11b; 

/*
 * LCDD12
 * 
 */
reg uint8 LCDD12 : 0x11c; 

/*
 * LCDD13
 * 
 */
reg uint8 LCDD13 : 0x11d; 

/*
 * LCDD14
 * 
 */
reg uint8 LCDD14 : 0x11e; 

/*
 * LCDD15
 * 
 */
reg uint8 LCDD15 : 0x11f; 

/*
 * TRISF
 * 
 */
reg uint8 TRISF : 0x187; 

/*
 * TRISG
 * 
 */
reg uint8 TRISG : 0x188; 
}
