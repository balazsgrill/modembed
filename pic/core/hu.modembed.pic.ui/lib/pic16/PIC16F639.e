/*
 * Library for PIC16F639
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16F639{

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
		/* RC oscillator: CLKOUT function on RA4/T1G/OSC2/CLKOUT pin, RC on RA5/T1CKI/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EXTRCCLK = 0x7*1;
		/* RCIO oscillator: I/O function on RA4/T1G/OSC2/CLKOUT pin, RC on RA5/T1CKI/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EXTRCIO = 0x6*1;
		/* INTOSC oscillator: CLKOUT function on RA4/T1G/OSC2/CLKOUT pin, I/O function on RA5/T1CKI/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_INTOSCCLK = 0x5*1;
		/* INTOSCIO oscillator: I/O function on RA4/T1G/OSC2/CLKOUT pin, I/O function on RA5/T1CKI/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_INTOSCIO = 0x4*1;
		/* EC: I/O function on RA4/T1G/OSC2/CLKOUT, CLKIN on RA5/T1CKI/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EC = 0x3*1;
		/* HS oscillator: High-speed crystal/resonator on RA5/T1CKI/OSC1/CLKIN and RA4/T1G/OSC2/CLKOUT */
		const uint16 CONFIG_FOSC_HS = 0x2*1;
		/* XT oscillator: Crystal/resonator on RA5/T1CKI/OSC1/CLKIN and RA4/T1G/OSC2/CLKOUT */
		const uint16 CONFIG_FOSC_XT = 0x1*1;
		/* LP oscillator: Low-power crystal on RA5/T1CKI/OSC1/CLKIN and RA4/T1G/OSC2/CLKOUT */
		const uint16 CONFIG_FOSC_LP = 0x0*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable bit
	 */
		/* WDT enabled */
		const uint16 CONFIG_WDTE_ON = 0x1*8;
		/* WDT disabled and can be enabled by SWDTEN bit of the WDTCON register */
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
	 * MCLR pin function select bit
	 */
		/* MCLR pin is MCLR function and weak internal pull-up is enabled */
		const uint16 CONFIG_MCLRE_ON = 0x1*32;
		/* MCLR pin function is alternate function, MCLR function is internally disabled */
		const uint16 CONFIG_MCLRE_OFF = 0x0*32;
	/*
	 * Field: CP
	 * Code Protection bit
	 */
		/* Program memory is not code protected */
		const uint16 CONFIG_CP_OFF = 0x1*64;
		/* Program memory is external read and write-protected */
		const uint16 CONFIG_CP_ON = 0x0*64;
	/*
	 * Field: CPD
	 * Data Code Protection bit
	 */
		/* Data memory is not code protected */
		const uint16 CONFIG_CPD_OFF = 0x1*128;
		/* Data memory is external read protected */
		const uint16 CONFIG_CPD_ON = 0x0*128;
	/*
	 * Field: BOREN
	 * Brown-out Reset Selection bits
	 */
		/* BOD enabled and SBOdEN bit disabled */
		const uint16 CONFIG_BOREN_ON = 0x3*256;
		/* BOD enabled while running and disabled in Sleep. SBODEN bit disabled. */
		const uint16 CONFIG_BOREN_NSLEEP = 0x2*256;
		/* SBODEN controls BOD function */
		const uint16 CONFIG_BOREN_SBODEN = 0x1*256;
		/* BOD and SBODEN disabled */
		const uint16 CONFIG_BOREN_OFF = 0x0*256;
	/*
	 * Field: IESO
	 * Internal-External Switchover bit
	 */
		/* Internal External Switchover mode enabled */
		const uint16 CONFIG_IESO_ON = 0x1*1024;
		/* Internal External Switchover mode disabled */
		const uint16 CONFIG_IESO_OFF = 0x0*1024;
	/*
	 * Field: FCMEN
	 * Fail-Safe Clock Monitor Enable bit
	 */
		/* Fail-Safe Clock Monitor enabled */
		const uint16 CONFIG_FCMEN_ON = 0x1*2048;
		/* Fail-Safe Clock Monitor disabled */
		const uint16 CONFIG_FCMEN_OFF = 0x0*2048;
	/*
	 * Field: WURE
	 * Wake-Up Reset Enable bit
	 */
		/* Standard wake-up and continue enabled */
		const uint16 CONFIG_WURE_OFF = 0x1*4096;
		/* Wake-up and Reset enabled */
		const uint16 CONFIG_WURE_ON = 0x0*4096;

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
 * WDTCON
 * 
 */
reg uint8 WDTCON : 0x18; 

/*
 * CMCON0
 * 
 */
reg uint8 CMCON0 : 0x19; 

/*
 * CMCON1
 * 
 */
reg uint8 CMCON1 : 0x1a; 

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
 * LVDCON
 * 
 */
reg uint8 LVDCON : 0x94; 

/*
 * WPUDA
 * 
 */
reg uint8 WPUDA : 0x95; 

/*
 * IOCA
 * 
 */
reg uint8 IOCA : 0x96; 

/*
 * WDA
 * 
 */
reg uint8 WDA : 0x97; 

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

/*
 * CRCON
 * 
 */
reg uint8 CRCON : 0x110; 

/*
 * CRDAT0
 * 
 */
reg uint8 CRDAT0 : 0x111; 

/*
 * CRDAT1
 * 
 */
reg uint8 CRDAT1 : 0x112; 

/*
 * CRDAT2
 * 
 */
reg uint8 CRDAT2 : 0x113; 

/*
 * CRDAT3
 * 
 */
reg uint8 CRDAT3 : 0x114; 
}
