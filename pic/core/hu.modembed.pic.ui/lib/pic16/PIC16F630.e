/*
 * Library for PIC16F630
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16F630{

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
		/* RC oscillator: CLKOUT function on RA4/OSC2/CLKOUT pin, RC on RA5/OSC1/CLKIN */
		const uint8 CONFIG_FOSC_EXTRCCLK = 0x7*1;
		/* RC oscillator: I/O function on RA4/OSC2/CLKOUT pin, RC on RA5/OSC1/CLKIN */
		const uint8 CONFIG_FOSC_EXTRCIO = 0x6*1;
		/* INTOSC oscillator: CLKOUT function on RA4/OSC2/CLKOUT pin, I/O function on RA5/OSC1/CLKIN */
		const uint8 CONFIG_FOSC_INTRCCLK = 0x5*1;
		/* INTOSC oscillator: I/O function on RA4/OSC2/CLKOUT pin, I/O function on RA5/OSC1/CLKIN */
		const uint8 CONFIG_FOSC_INTRCIO = 0x4*1;
		/* EC: I/O function on RA4/OSC2/CLKOUT pin, CLKIN on RA5/OSC1/CLKIN */
		const uint8 CONFIG_FOSC_EC = 0x3*1;
		/* HS oscillator: High speed crystal/resonator on RA4/OSC2/CLKOUT and RA5/OSC1/CLKIN */
		const uint8 CONFIG_FOSC_HS = 0x2*1;
		/* XT oscillator: Crystal/resonator on RA4/OSC2/CLKOUT and RA5/OSC1/CLKIN */
		const uint8 CONFIG_FOSC_XT = 0x1*1;
		/* LP oscillator: Low power crystal on RA4/OSC2/CLKOUT and RA5/OSC1/CLKIN */
		const uint8 CONFIG_FOSC_LP = 0x0*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable bit
	 */
		/* WDT enabled */
		const uint8 CONFIG_WDTE_ON = 0x1*8;
		/* WDT disabled */
		const uint8 CONFIG_WDTE_OFF = 0x0*8;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT disabled */
		const uint8 CONFIG_PWRTE_OFF = 0x1*16;
		/* PWRT enabled */
		const uint8 CONFIG_PWRTE_ON = 0x0*16;
	/*
	 * Field: MCLRE
	 * RA3/MCLR pin function select
	 */
		/* RA3/MCLR pin function is MCLR */
		const uint8 CONFIG_MCLRE_ON = 0x1*32;
		/* RA3/MCLR pin function is digital I/O, MCLR internally tied to VDD */
		const uint8 CONFIG_MCLRE_OFF = 0x0*32;
	/*
	 * Field: BOREN
	 * Brown-out Detect Enable bit
	 */
		/* BOD enabled */
		const uint8 CONFIG_BOREN_ON = 0x1*64;
		/* BOD disabled */
		const uint8 CONFIG_BOREN_OFF = 0x0*64;
	/*
	 * Field: CP
	 * Code Protection bit
	 */
		/* Program Memory code protection is disabled */
		const uint8 CONFIG_CP_OFF = 0x1*128;
		/* Program Memory code protection is enabled */
		const uint8 CONFIG_CP_ON = 0x0*128;
	/*
	 * Field: CPD
	 * Data Code Protection bit
	 */
		/* Data memory code protection is disabled */
		const uint8 CONFIG_CPD_OFF = 0x1*256;
		/* Data memory code protection is enabled */
		const uint8 CONFIG_CPD_ON = 0x0*256;
	/*
	 * Field: BG
	 * Bandgap Calibration bits for BOD and POR voltage
	 */
		/* Highest bandgap voltage */
		const uint8 CONFIG_BG_3 = 0x3*512;
		/* . */
		const uint8 CONFIG_BG_2 = 0x2*512;
		/* . */
		const uint8 CONFIG_BG_1 = 0x1*512;
		/* Lowest bandgap voltage */
		const uint8 CONFIG_BG_0 = 0x0*512;

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
 * PORTC
 * 
 */
reg uint8 PORTC : 0x7; 

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
 * CMCON
 * 
 */
reg uint8 CMCON : 0x19; 

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
 * TRISC
 * 
 */
reg uint8 TRISC : 0x87; 

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
reg uint8 OSCCAL : 0x90; 

/*
 * WPUA
 * 
 */
reg uint8 WPUA : 0x95; 

/*
 * IOCA
 * 
 */
reg uint8 IOCA : 0x96; 

/*
 * VRCON
 * 
 */
reg uint8 VRCON : 0x99; 

/*
 * EEDAT
 * 
 */
reg uint8 EEDAT : 0x9a; 

/*
 * EEADR
 * 
 */
reg uint8 EEADR : 0x9b; 

/*
 * EECON1
 * 
 */
reg uint8 EECON1 : 0x9c; 

/*
 * EECON2
 * 
 */
reg uint8 EECON2 : 0x9d; 
}
