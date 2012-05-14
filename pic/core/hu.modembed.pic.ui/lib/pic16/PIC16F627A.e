/*
 * Library for PIC16F627A
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16F627A{

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
		/* RC oscillator: CLKOUT function on RA6/OSC2/CLKOUT pin, Resistor and Capacitor on RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EXTRCCLK = 0x13*1;
		/* RC oscillator: I/O function on RA6/OSC2/CLKOUT pin, Resistor and Capacitor on RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EXTRCIO = 0x12*1;
		/* INTOSC oscillator: CLKOUT function on RA6/OSC2/CLKOUT pin, I/O function on RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_INTOSCCLK = 0x11*1;
		/* INTOSC oscillator: I/O function on RA6/OSC2/CLKOUT pin, I/O function on RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_INTOSCIO = 0x10*1;
		/* EC: I/O function on RA6/OSC2/CLKOUT pin, CLKIN on RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_ECIO = 0x3*1;
		/* HS oscillator: High-speed crystal/resonator on RA6/OSC2/CLKOUT and RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_HS = 0x2*1;
		/* XT oscillator: Crystal/resonator on RA6/OSC2/CLKOUT and RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_XT = 0x1*1;
		/* LP oscillator: Low-power crystal on RA6/OSC2/CLKOUT and RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_LP = 0x0*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable bit
	 */
		/* WDT enabled */
		const uint16 CONFIG_WDTE_ON = 0x1*32;
		/* WDT disabled */
		const uint16 CONFIG_WDTE_OFF = 0x0*32;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT disabled */
		const uint16 CONFIG_PWRTE_OFF = 0x1*64;
		/* PWRT enabled */
		const uint16 CONFIG_PWRTE_ON = 0x0*64;
	/*
	 * Field: MCLRE
	 * RA5/MCLR/VPP Pin Function Select bit
	 */
		/* RA5/MCLR/VPP pin function is MCLR */
		const uint16 CONFIG_MCLRE_ON = 0x1*128;
		/* RA5/MCLR/VPP pin function is digital input, MCLR internally tied to VDD */
		const uint16 CONFIG_MCLRE_OFF = 0x0*128;
	/*
	 * Field: BOREN
	 * Brown-out Detect Enable bit
	 */
		/* BOD enabled */
		const uint16 CONFIG_BOREN_ON = 0x1*256;
		/* BOD disabled */
		const uint16 CONFIG_BOREN_OFF = 0x0*256;
	/*
	 * Field: LVP
	 * Low-Voltage Programming Enable bit
	 */
		/* RB4/PGM pin has PGM function, low-voltage programming enabled */
		const uint16 CONFIG_LVP_ON = 0x1*512;
		/* RB4/PGM pin has digital I/O function, HV on MCLR must be used for programming */
		const uint16 CONFIG_LVP_OFF = 0x0*512;
	/*
	 * Field: CPD
	 * Data EE Memory Code Protection bit
	 */
		/* Data memory code protection off */
		const uint16 CONFIG_CPD_OFF = 0x1*1024;
		/* Data memory code-protected */
		const uint16 CONFIG_CPD_ON = 0x0*1024;
	/*
	 * Field: CP
	 * Flash Program Memory Code Protection bit
	 */
		/* Code protection off */
		const uint16 CONFIG_CP_OFF = 0x1*2048;
		/* 0000h to 03FFh code-protected */
		const uint16 CONFIG_CP_ON = 0x0*2048;

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
 * CMCON
 * 
 */
reg uint8 CMCON : 0x1f; 

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
 * EEDATA
 * 
 */
reg uint8 EEDATA : 0x9a; 

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

/*
 * VRCON
 * 
 */
reg uint8 VRCON : 0x9f; 
}
