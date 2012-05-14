/*
 * Library for PIC16F785
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16F785;

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
		/* EXTRC oscillator: External RC on RA5/OSC1/CLKIN, CLKOUT function on RA4/OSC2/CLKOUT pin */
		const uint16 CONFIG_FOSC_EXTRCCLK = 0x7*1;
		/* EXTRCIO oscillator: External RC on RA5/OSC1/CLKIN, I/O function on RA4/OSC2/CLKOUT pin */
		const uint16 CONFIG_FOSC_EXTRCIO = 0x6*1;
		/* INTOSC oscillator: CLKOUT function on RA4/OSC2/CLKOUT pin, I/O function on RA5/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_INTOSCCLK = 0x5*1;
		/* INTOSCIO oscillator: I/O function on RA4/OSC2/CLKOUT pin, I/O function on RA5/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_INTOSCIO = 0x4*1;
		/* EC: I/O function on RA4/OSC2/CLKOUT pin, CLKIN on RA5/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EC = 0x3*1;
		/* HS oscillator: High-speed crystal/resonator on RA4/OSC2/CLKOUT and RA5/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_HS = 0x2*1;
		/* XT oscillator: Crystal/resonator on RA4/OSC2/CLKOUT and RA5/OSC1/CLKINT */
		const uint16 CONFIG_FOSC_XT = 0x1*1;
		/* LP oscillator: Low-power crystal on RA4/OSC2/CLKOUT and RA5/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_LP = 0x0*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable bit
	 */
		/* WDT enabled */
		const uint16 CONFIG_WDTE_ON = 0x1*8;
		/* WDT disabled */
		const uint16 CONFIG_WDTE_OFF = 0x0*8;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT disabled */
		const uint16 CONFIG_PWRTE_OFF = 0x1*16;
		/* PWRT enabled */
		const uint16 CONFIG_PWRTE_ON = 0x0*16;
	/*
	 * Field: MCLRE
	 * MCLR Pin Function Select bit
	 */
		/* MCLR pin function is MCLR */
		const uint16 CONFIG_MCLRE_ON = 0x1*32;
		/* MCLR pin function is digital input, MCLR internally tied to VDD */
		const uint16 CONFIG_MCLRE_OFF = 0x0*32;
	/*
	 * Field: CP
	 * Code Protection bit
	 */
		/* Program memory code protection is disabled */
		const uint16 CONFIG_CP_OFF = 0x1*64;
		/* Program memory code protection is enabled */
		const uint16 CONFIG_CP_ON = 0x0*64;
	/*
	 * Field: CPD
	 * Data Code Protection bit
	 */
		/* Data memory code protection is disabled */
		const uint16 CONFIG_CPD_OFF = 0x1*128;
		/* Data memory code protection is enabled */
		const uint16 CONFIG_CPD_ON = 0x0*128;
	/*
	 * Field: BOREN
	 * Brown Out Detect
	 */
		/* BOR enabled */
		const uint16 CONFIG_BOREN_ON = 0x3*256;
		/* BOR enabled during operation and disabled in Sleep */
		const uint16 CONFIG_BOREN_NSLEEP = 0x2*256;
		/* BOR controlled by SBOREN bit of the PCON register */
		const uint16 CONFIG_BOREN_SBODEN = 0x1*256;
		/* BOR disabled */
		const uint16 CONFIG_BOREN_OFF = 0x0*256;
	/*
	 * Field: IESO
	 * Internal External Switchover bit
	 */
		/* Internal External Switchover mode is enabled */
		const uint16 CONFIG_IESO_ON = 0x1*1024;
		/* Internal External Switchover mode is disabled */
		const uint16 CONFIG_IESO_OFF = 0x0*1024;
	/*
	 * Field: FCMEN
	 * Fail-Safe Clock Monitor Enabled bit
	 */
		/* Fail-Safe Clock Monitor is enabled */
		const uint16 CONFIG_FCMEN_ON = 0x1*2048;
		/* Fail-Safe Clock Monitor is disabled */
		const uint16 CONFIG_FCMEN_OFF = 0x0*2048;

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
