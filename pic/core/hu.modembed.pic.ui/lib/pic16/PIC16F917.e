/*
 * Library for PIC16F917
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16F917;

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
		/* RC oscillator: CLKOUT function on RA6/OSC2/CLKOUT/T1OSO pin, RC on RA7/OSC1/CLKIN/T1OSI */
		const uint16 CONFIG_FOSC_EXTRCCLK = 0x7*1;
		/* RCIO oscillator: I/O function on RA6/OSC2/CLKOUT/T1OSO pin, RC on RA7/OSC1/CLKIN/T1OSI */
		const uint16 CONFIG_FOSC_EXTRCIO = 0x6*1;
		/* INTOSC oscillator: CLKOUT function on RA6/OSC2/CLKOUT/T1OSO pin, I/O function on RA7/OSC1/CLKIN/T1OSI */
		const uint16 CONFIG_FOSC_INTOSCCLK = 0x5*1;
		/* INTOSCIO oscillator: I/O function on RA6/OSC2/CLKOUT/T1OSO pin, I/O function on RA7/OSC1/CLKIN/T1OSI */
		const uint16 CONFIG_FOSC_INTOSCIO = 0x4*1;
		/* EC: I/O function on RA6/OSC2/CLKOUT/T1OSO pin, CLKIN on RA7/OSC1/CLKIN/T1OSI */
		const uint16 CONFIG_FOSC_EC = 0x3*1;
		/* HS oscillator: High-speed crystal/resonator on RA6/OSC2/CLKOUT/T1OSO and RA7/OSC1/CLKIN/T1OSI */
		const uint16 CONFIG_FOSC_HS = 0x2*1;
		/* XT oscillator: Crystal/resonator on RA6/OSC2/CLKOUT/T1OSO and RA7/OSC1/CLKIN/T1OSI */
		const uint16 CONFIG_FOSC_XT = 0x1*1;
		/* LP oscillator: Low-power crystal on RA6/OSC2/CLKOUT/T1OSO and RA7/OSC1/CLKIN/T1OSI */
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
	 * Power Up Timer Enable bit
	 */
		/* PWRT disabled */
		const uint16 CONFIG_PWRTE_OFF = 0x1*16;
		/* PWRT enabled */
		const uint16 CONFIG_PWRTE_ON = 0x0*16;
	/*
	 * Field: MCLRE
	 * RE3/MCLR pin function select bit
	 */
		/* RE3/MCLR pin function is MCLR */
		const uint16 CONFIG_MCLRE_ON = 0x1*32;
		/* RE3/MCLR pin function is digital input, MCLR internally tied to VDD */
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
		/* Internal/External Switchover mode is enabled */
		const uint16 CONFIG_IESO_ON = 0x1*1024;
		/* Internal/External Switchover mode is disabled */
		const uint16 CONFIG_IESO_OFF = 0x0*1024;
	/*
	 * Field: FCMEN
	 * Fail-Safe Clock Monitor Enabled bit
	 */
		/* Fail-Safe Clock Monitor is enabled */
		const uint16 CONFIG_FCMEN_ON = 0x1*2048;
		/* Fail-Safe Clock Monitor is disabled */
		const uint16 CONFIG_FCMEN_OFF = 0x0*2048;
	/*
	 * Field: DEBUG
	 * In-Circuit Debugger Mode bit
	 */
		/* In-Circuit Debugger disabled, RB6/ISCPCLK and RB7/ICSPDAT are general purpose I/O pins */
		const uint16 CONFIG_DEBUG_OFF = 0x1*4096;
		/* In-Circuit Debugger enabled, RB6/ICSPCLK and RB7/ICSPDAT are dedicated to the debugger */
		const uint16 CONFIG_DEBUG_ON = 0x0*4096;

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
 * CCPR2
 * 
 */
reg uint16 CCPR2 : 0x1b; 

/*
 * CCP2CON
 * 
 */
reg uint8 CCP2CON : 0x1d; 

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
 * ANSEL
 * 
 */
reg uint8 ANSEL : 0x91; 

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
 * WPUB
 * 
 */
reg uint8 WPUB : 0x95; 

/*
 * IOCB
 * 
 */
reg uint8 IOCB : 0x96; 

/*
 * CMCON1
 * 
 */
reg uint8 CMCON1 : 0x97; 

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
 * CMCON0
 * 
 */
reg uint8 CMCON0 : 0x9c; 

/*
 * VRCON
 * 
 */
reg uint8 VRCON : 0x9d; 

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
 * WDTCON
 * 
 */
reg uint8 WDTCON : 0x105; 

/*
 * LCDCON
 * 
 */
reg uint8 LCDCON : 0x107; 

/*
 * LCDPS
 * 
 */
reg uint8 LCDPS : 0x108; 

/*
 * LVDCON
 * 
 */
reg uint8 LVDCON : 0x109; 

/*
 * EEDATL
 * 
 */
reg uint8 EEDATL : 0x10c; 

/*
 * EEADRL
 * 
 */
reg uint8 EEADRL : 0x10d; 

/*
 * EEDATH
 * 
 */
reg uint8 EEDATH : 0x10e; 

/*
 * EEADRH
 * 
 */
reg uint8 EEADRH : 0x10f; 

/*
 * LCDDATA0
 * 
 */
reg uint8 LCDDATA0 : 0x110; 

/*
 * LCDDATA1
 * 
 */
reg uint8 LCDDATA1 : 0x111; 

/*
 * LCDDATA2
 * 
 */
reg uint8 LCDDATA2 : 0x112; 

/*
 * LCDDATA3
 * 
 */
reg uint8 LCDDATA3 : 0x113; 

/*
 * LCDDATA4
 * 
 */
reg uint8 LCDDATA4 : 0x114; 

/*
 * LCDDATA5
 * 
 */
reg uint8 LCDDATA5 : 0x115; 

/*
 * LCDDATA6
 * 
 */
reg uint8 LCDDATA6 : 0x116; 

/*
 * LCDDATA7
 * 
 */
reg uint8 LCDDATA7 : 0x117; 

/*
 * LCDDATA8
 * 
 */
reg uint8 LCDDATA8 : 0x118; 

/*
 * LCDDATA9
 * 
 */
reg uint8 LCDDATA9 : 0x119; 

/*
 * LCDDATA10
 * 
 */
reg uint8 LCDDATA10 : 0x11a; 

/*
 * LCDDATA11
 * 
 */
reg uint8 LCDDATA11 : 0x11b; 

/*
 * LCDSE0
 * 
 */
reg uint8 LCDSE0 : 0x11c; 

/*
 * LCDSE1
 * 
 */
reg uint8 LCDSE1 : 0x11d; 

/*
 * LCDSE2
 * 
 */
reg uint8 LCDSE2 : 0x11e; 

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

