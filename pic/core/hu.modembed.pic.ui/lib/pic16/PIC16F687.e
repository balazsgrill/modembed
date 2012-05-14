/*
 * Library for PIC16F687
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16F687;

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
		/* RC oscillator: CLKOUT function on RA4/OSC2/CLKOUT pin, RC on RA5/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EXTRCCLK = 0x7*1;
		/* RCIO oscillator: I/O function on RA4/OSC2/CLKOUT pin, RC on RA5/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EXTRCIO = 0x6*1;
		/* INTOSC oscillator: CLKOUT function on RA4/OSC2/CLKOUT pin, I/O function on RA5/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_INTRCCLK = 0x5*1;
		/* INTOSCIO oscillator: I/O function on RA4/OSC2/CLKOUT pin, I/O function on RA5/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_INTRCIO = 0x4*1;
		/* EC: I/O function on RA4/OSC2/CLKOUT pin, CLKIN on RA5/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EC = 0x3*1;
		/* HS oscillator: High-speed crystal/resonator on RA4/OSC2/CLKOUT and RA5/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_HS = 0x2*1;
		/* XT oscillator: Crystal/resonator on RA4/OSC2/CLKOUT and RA5/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_XT = 0x1*1;
		/* LP oscillator: Low-power crystal on RA4/OSC2/CLKOUT and RA5/OSC1/CLKIN */
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
	 * Brown-out Reset Selection bits
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
 * SSPSTAT
 * 
 */
reg uint8 SSPSTAT : 0x93; 

/*
 * WPUA
 * 
 */
reg uint8 WPUA : 0x94; 

/*
 * IOCA
 * 
 */
reg uint8 IOCA : 0x95; 

/*
 * WDTCON
 * 
 */
reg uint8 WDTCON : 0x96; 

/*
 * TXSTA
 * 
 */
reg uint8 TXSTA : 0x97; 

/*
 * SPBRG
 * 
 */
reg uint8 SPBRG : 0x98; 

/*
 * SPBRGH
 * 
 */
reg uint8 SPBRGH : 0x99; 

/*
 * BAUDCTL
 * 
 */
reg uint8 BAUDCTL : 0x9a; 

/*
 * ADRESL
 * 
 */
reg uint8 ADRESL : 0x9d; 

/*
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0x9e; 

/*
 * EEDAT
 * 
 */
reg uint8 EEDAT : 0x10c; 

/*
 * EEADR
 * 
 */
reg uint8 EEADR : 0x10d; 

/*
 * WPUB
 * 
 */
reg uint8 WPUB : 0x115; 

/*
 * IOCB
 * 
 */
reg uint8 IOCB : 0x116; 

/*
 * VRCON
 * 
 */
reg uint8 VRCON : 0x118; 

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
 * ANSEL
 * 
 */
reg uint8 ANSEL : 0x11e; 

/*
 * ANSELH
 * 
 */
reg uint8 ANSELH : 0x11f; 

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

/*
 * SRCON
 * 
 */
reg uint8 SRCON : 0x19e; 

