/*
 * Library for PIC16F707
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16F707{

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
		/* RC oscillator: CLKOUT function on RA6/OSC2/CLKOUT pin, RC on RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EXTRC = 0x7*1;
		/* RCIO oscillator: I/O function on RA6/OSC2/CLKOUT pin, RC on RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EXTRCIO = 0x6*1;
		/* INTOSC oscillator: CLKOUT function on RA6/OSC2/CLKOUT pin, I/O function  on RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_INTOSC = 0x5*1;
		/* INTOSCIO oscillator: I/O function on RA6/OSC2/CLKOUT and RA7/OSC1/CLKIN pins */
		const uint16 CONFIG_FOSC_INTOSCIO = 0x4*1;
		/* EC oscillator: I/O function on RA6/OSC2/CLKOUT pin, CLKIN on RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EC_OSC = 0x3*1;
		/* HS oscillator: High Speed crystal/resonator on RA6/OSC2/CLKOUT and RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_HS_OSC = 0x2*1;
		/* XT oscillator: Crystal/resonator on RA6/OSC2/CLKIN and RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_XT_OSC = 0x1*1;
		/* LP oscillator: Low-power crystal on RA6/OSC2/CLKOUT and RA7/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_LP_OSC = 0x0*1;
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
	 * RE3/MCLR Pin Function Select bit
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
	 * Field: BOREN
	 * Brown-out Reset Selection bits
	 */
		/* BOR enabled */
		const uint16 CONFIG_BOREN_ON = 0x3*128;
		/* BOR enabled during operation and disabled in Sleep */
		const uint16 CONFIG_BOREN_NSLEEP = 0x2*128;
		/* BOR disabled (Preconditioned State) */
		const uint16 CONFIG_BOREN_OFF = 0x1*128;
		/* BOR disabled (Preconditioned State) */
		const uint16 CONFIG_BOREN_OFF = 0x0*128;
	/*
	 * Field: BORV
	 * Brown-out Reset Voltage Selection bit
	 */
		/* Brown-out Reset Voltage (VBOR) set to 1.9 V nominal */
		const uint16 CONFIG_BORV_19 = 0x1*512;
		/* Brown-out Reset Voltage (VBOR) set to 2.5 V nominal */
		const uint16 CONFIG_BORV_25 = 0x0*512;
	/*
	 * Field: PLLEN
	 * INTOSC PLLEN Enable Bit
	 */
		/* INTOSC Frequency is 16 MHz (32x) */
		const uint16 CONFIG_PLLEN_ON = 0x1*1024;
		/* INTOSC Frequency is 500 kHz */
		const uint16 CONFIG_PLLEN_OFF = 0x0*1024;
	/*
	 * Field: DEBUG
	 * In-Circuit Debugger Mode bit
	 */
		/* In-Circuit Debugger disabled, RB6/ICSPCLK and RB7/ICSPDAT are general purpose I/O pins */
		const uint16 CONFIG_DEBUG_OFF = 0x1*2048;
		/* In-Circuit Debugger enabled, RB6/ICSPCLK and RB7/ICSPDAT are dedicated to the debugger */
		const uint16 CONFIG_DEBUG_ON = 0x0*2048;
	/*
	 * Field: VCAPEN
	 * Voltage Regulator Capacitor Enable bits
	 */
		/* All VCAP pin functions are disabled */
		const uint8 CONFIG2_VCAPEN_OFF = 0x3*1;
		/* VCAP functionality is enabled on RA6 */
		const uint8 CONFIG2_VCAPEN_RA6 = 0x2*1;
		/* VCAP functionality is enabled on RA5 */
		const uint8 CONFIG2_VCAPEN_RA5 = 0x1*1;
		/* VCAP functionality is enabled on RA0 */
		const uint8 CONFIG2_VCAPEN_RA0 = 0x0*1;

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
 * T1GCON
 * 
 */
reg uint8 T1GCON : 0x8f; 

/*
 * OSCCON
 * 
 */
reg uint8 OSCCON : 0x90; 

/*
 * OSCTUNE
 * 
 */
reg uint8 OSCTUNE : 0x91; 

/*
 * PR2
 * 
 */
reg uint8 PR2 : 0x92; 

/*
 * SSPSTAT
 * 
 */
reg uint8 SSPSTAT : 0x93; 

/*
 * WPUB
 * 
 */
reg uint8 WPUB : 0x94; 

/*
 * IOCB
 * 
 */
reg uint8 IOCB : 0x95; 

/*
 * T3CON
 * 
 */
reg uint8 T3CON : 0x96; 

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
 * TMR3
 * 
 */
reg uint16 TMR3 : 0x99; 

/*
 * APFCON
 * 
 */
reg uint8 APFCON : 0x9b; 

/*
 * FVRCON
 * 
 */
reg uint8 FVRCON : 0x9c; 

/*
 * T3GCON
 * 
 */
reg uint8 T3GCON : 0x9d; 

/*
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0x9e; 

/*
 * TACON
 * 
 */
reg uint8 TACON : 0x105; 

/*
 * CPSBCON0
 * 
 */
reg uint8 CPSBCON0 : 0x106; 

/*
 * CPSBCON1
 * 
 */
reg uint8 CPSBCON1 : 0x107; 

/*
 * CPSACON0
 * 
 */
reg uint8 CPSACON0 : 0x108; 

/*
 * CPSACON1
 * 
 */
reg uint8 CPSACON1 : 0x109; 

/*
 * PMDATL
 * 
 */
reg uint8 PMDATL : 0x10c; 

/*
 * PMADRL
 * 
 */
reg uint8 PMADRL : 0x10d; 

/*
 * PMDATH
 * 
 */
reg uint8 PMDATH : 0x10e; 

/*
 * PMADRH
 * 
 */
reg uint8 PMADRH : 0x10f; 

/*
 * TMRA
 * 
 */
reg uint8 TMRA : 0x110; 

/*
 * TBCON
 * 
 */
reg uint8 TBCON : 0x111; 

/*
 * TMRB
 * 
 */
reg uint8 TMRB : 0x112; 

/*
 * DACCON0
 * 
 */
reg uint8 DACCON0 : 0x113; 

/*
 * DACCON1
 * 
 */
reg uint8 DACCON1 : 0x114; 

/*
 * ANSELA
 * 
 */
reg uint8 ANSELA : 0x185; 

/*
 * ANSELB
 * 
 */
reg uint8 ANSELB : 0x186; 

/*
 * ANSELC
 * 
 */
reg uint8 ANSELC : 0x187; 

/*
 * ANSELD
 * 
 */
reg uint8 ANSELD : 0x188; 

/*
 * ANSELE
 * 
 */
reg uint8 ANSELE : 0x189; 

/*
 * PMCON1
 * 
 */
reg uint8 PMCON1 : 0x18c; 
}
