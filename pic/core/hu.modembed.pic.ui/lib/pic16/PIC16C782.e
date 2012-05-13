/*
 * Library for PIC16C782
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16C782{

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
		/* RC CLKOUT */
		const uint8 CONFIG1_FOSC_ER_CLKOUT = 0x7*1;
		/* RC I/O */
		const uint8 CONFIG1_FOSC_ER_NOCLKOUT = 0x6*1;
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
	 * Field: MCLRE
	 * Master Clear Enable
	 */
		/* External */
		const uint8 CONFIG1_MCLRE_ON = 0x1*32;
		/* Internal */
		const uint8 CONFIG1_MCLRE_OFF = 0x0*32;
	/*
	 * Field: BOREN
	 * Brown-out Reset Enable bit
	 */
		/* BOR enabled */
		const uint8 CONFIG1_BOREN_ON = 0x1*64;
		/* BOR disabled */
		const uint8 CONFIG1_BOREN_OFF = 0x0*64;
	/*
	 * Field: CP
	 * Code Protecton bit
	 */
		/* Code protection off */
		const uint8 CONFIG1_CP_OFF = 0x33*128;
		/* All memory is code protected */
		const uint8 CONFIG1_CP_ALL = 0x0*128;
	/*
	 * Field: BODENV
	 * Brown Out Voltage
	 */
		/* VBOR set to 2.5V */
		const uint8 CONFIG1_BODENV_25 = 0x3*8192;
		/* VBOR set to 2.7V */
		const uint8 CONFIG1_BODENV_27 = 0x2*8192;
		/* VBOR set to 4.2V */
		const uint8 CONFIG1_BODENV_42 = 0x1*8192;
		/* VBOR set to 4.5V */
		const uint8 CONFIG1_BODENV_45 = 0x0*8192;

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
 * REFCON
 * 
 */
reg uint8 REFCON : 0x9b; 

/*
 * LVDCON
 * 
 */
reg uint8 LVDCON : 0x9c; 

/*
 * ANSEL
 * 
 */
reg uint8 ANSEL : 0x9d; 

/*
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0x9f; 

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
 * CALCON
 * 
 */
reg uint8 CALCON : 0x110; 

/*
 * PSMCCON0
 * 
 */
reg uint8 PSMCCON0 : 0x111; 

/*
 * PSMCCON1
 * 
 */
reg uint8 PSMCCON1 : 0x112; 

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
 * OPACON
 * 
 */
reg uint8 OPACON : 0x11c; 

/*
 * DAC
 * 
 */
reg uint8 DAC : 0x11e; 

/*
 * DACON0
 * 
 */
reg uint8 DACON0 : 0x11f; 

/*
 * PMCON1
 * 
 */
reg uint8 PMCON1 : 0x18c; 
}
