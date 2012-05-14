/*
 * Library for PS200
 * 
 * Architecture: 16xxxx
 */
library microchip.PS200;

	use e.platform;
	use microchip.pic16;

/*************************
 * Configuration
 ************************/
 

	const codeaddr configStartAddress = 0x2007;
	/*
	 * Field: OSC
	 * Oscillator
	 */
		/* EXTRC: CLKOUT on RA4, RC on RA5 */
		const uint16 CONFIG_OSC_ = 0x7*1;
		/* EXTRCIO: I/O on RA4, RC on RA5 */
		const uint16 CONFIG_OSC_ = 0x6*1;
		/* INTOSC: CLKOUT on RA4, I/O on RA5 */
		const uint16 CONFIG_OSC_ = 0x5*1;
		/* INTOSCIO: I/O on RA4/RA5 */
		const uint16 CONFIG_OSC_ = 0x4*1;
		/* EC */
		const uint16 CONFIG_OSC_ = 0x3*1;
		/* HS */
		const uint16 CONFIG_OSC_ = 0x2*1;
		/* XT */
		const uint16 CONFIG_OSC_ = 0x1*1;
		/* LP */
		const uint16 CONFIG_OSC_ = 0x0*1;
	/*
	 * Field: WDT
	 * Watchdog Timer
	 */
		/* On */
		const uint16 CONFIG_WDT_ = 0x1*8;
		/* Off */
		const uint16 CONFIG_WDT_ = 0x0*8;
	/*
	 * Field: PUT
	 * Power Up Timer
	 */
		/* Off */
		const uint16 CONFIG_PUT_ = 0x1*16;
		/* On */
		const uint16 CONFIG_PUT_ = 0x0*16;
	/*
	 * Field: MCLRE
	 * Master Clear Enable
	 */
		/* External */
		const uint16 CONFIG_MCLRE_ = 0x1*32;
		/* Internal */
		const uint16 CONFIG_MCLRE_ = 0x0*32;
	/*
	 * Field: CP
	 * Code Protect
	 */
		/* Off */
		const uint16 CONFIG_CP_ = 0x1*64;
		/* On */
		const uint16 CONFIG_CP_ = 0x0*64;
	/*
	 * Field: CPD
	 * Data EE Read Protect
	 */
		/* Off */
		const uint16 CONFIG_CPD_ = 0x1*128;
		/* On */
		const uint16 CONFIG_CPD_ = 0x0*128;
	/*
	 * Field: BODEN
	 * Brown Out Detect
	 */
		/* BOD and SBOREN disabled */
		const uint16 CONFIG_BODEN_ = 0x0*256;
		/* SBOREN controls BOR function */
		const uint16 CONFIG_BODEN_ = 0x1*256;
		/* BOD enabled in run, disabled in sleep, SBOREN disabled */
		const uint16 CONFIG_BODEN_ = 0x2*256;
		/* BOD Enabled, SBOREN Disabled */
		const uint16 CONFIG_BODEN_ = 0x3*256;
	/*
	 * Field: IESO
	 * Internal External Switch Over Mode
	 */
		/* Enabled */
		const uint16 CONFIG_IESO_ = 0x1*1024;
		/* Disabled */
		const uint16 CONFIG_IESO_ = 0x0*1024;
	/*
	 * Field: FCMEN
	 * Monitor Clock Fail-safe
	 */
		/* Enabled */
		const uint16 CONFIG_FCMEN_ = 0x1*2048;
		/* Disabled */
		const uint16 CONFIG_FCMEN_ = 0x0*2048;

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
 * CCPR
 * 
 */
reg uint16 CCPR : 0x13; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0x15; 

/*
 * WDTCON
 * 
 */
reg uint8 WDTCON : 0x18; 

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
 * ANSEL0
 * 
 */
reg uint8 ANSEL0 : 0x91; 

/*
 * PR2
 * 
 */
reg uint8 PR2 : 0x92; 

/*
 * ANSEL1
 * 
 */
reg uint8 ANSEL1 : 0x93; 

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
 * REFCON
 * 
 */
reg uint8 REFCON : 0x98; 

/*
 * VRCON
 * 
 */
reg uint8 VRCON : 0x99; 

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
 * PWMCON1
 * 
 */
reg uint8 PWMCON1 : 0x110; 

/*
 * PWMCON0
 * 
 */
reg uint8 PWMCON0 : 0x111; 

/*
 * PWMCLK
 * 
 */
reg uint8 PWMCLK : 0x112; 

/*
 * PWMPH1
 * 
 */
reg uint8 PWMPH1 : 0x113; 

/*
 * PWMPH2
 * 
 */
reg uint8 PWMPH2 : 0x114; 

/*
 * CM1CON0
 * 
 */
reg uint8 CM1CON0 : 0x119; 

/*
 * CM2CON0
 * 
 */
reg uint8 CM2CON0 : 0x11a; 

/*
 * CM2CON1
 * 
 */
reg uint8 CM2CON1 : 0x11b; 

/*
 * OPA1CON
 * 
 */
reg uint8 OPA1CON : 0x11c; 

/*
 * OPA2CON
 * 
 */
reg uint8 OPA2CON : 0x11d; 

