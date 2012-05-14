/*
 * Library for PIC12HV752
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC12HV752{

	use e.platform;
	use microchip.pic16;

/*************************
 * Configuration
 ************************/
 

	const codeaddr configStartAddress = 0x2007
	/*
	 * Field: FOSC0
	 * 
	 */
		/* EC oscillator mode.  CLKIN function on RA5/CLKIN */
		const uint16 CONFIG_FOSC0_EC = 0x1*1;
		/* Internal oscillator mode.  I/O function on RA5/CLKIN */
		const uint16 CONFIG_FOSC0_INT = 0x0*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer
	 */
		/* Watchdog Timer enabled */
		const uint16 CONFIG_WDTE_ON = 0x1*2;
		/* Watchdog Timer disabled */
		const uint16 CONFIG_WDTE_OFF = 0x0*2;
	/*
	 * Field: PWRTE
	 * Power Up Timer
	 */
		/* Power-up Timer disabled */
		const uint16 CONFIG_PWRTE_OFF = 0x1*4;
		/* Power-up Timer enabled */
		const uint16 CONFIG_PWRTE_ON = 0x0*4;
	/*
	 * Field: MCLRE
	 * Master Clear Enable
	 */
		/* MCLR pin is MCLR function with internal weak pullup */
		const uint16 CONFIG_MCLRE_ON = 0x1*8;
		/* MCLR pin is alternate function */
		const uint16 CONFIG_MCLRE_OFF = 0x0*8;
	/*
	 * Field: CP
	 * Code Protect
	 */
		/* Code protection disabled */
		const uint16 CONFIG_CP_OFF = 0x1*16;
		/* Code protection enabled */
		const uint16 CONFIG_CP_ON = 0x0*16;
	/*
	 * Field: BOREN
	 * 
	 */
		/* BOR enabled */
		const uint16 CONFIG_BOREN_EN = 0x3*32;
		/* BOR disabled during Sleep and enabled during run */
		const uint16 CONFIG_BOREN_SLEEP_DIS = 0x2*32;
		/* BOR disabled */
		const uint16 CONFIG_BOREN_DIS = 0x0*32;
	/*
	 * Field: WRT
	 * 
	 */
		/* Flash self-write protection off */
		const uint16 CONFIG_WRT_OFF = 0x3*128;
		/* 000h to 0FFh self-write protected */
		const uint16 CONFIG_WRT_FOURTH = 0x2*128;
		/* 000h to 1FFh self-write protected */
		const uint16 CONFIG_WRT_HALF = 0x1*128;
		/* 000h to 3FFh self-write protected */
		const uint16 CONFIG_WRT_ALL = 0x0*128;
	/*
	 * Field: CLKOUTEN
	 * 
	 */
		/* CLKOUT function disabled.  CLKOUT pin acts as I/O */
		const uint16 CONFIG_CLKOUTEN_OFF = 0x1*512;
		/* CLKOUT function enabled.  CLKOUT pin is CLKOUT */
		const uint16 CONFIG_CLKOUTEN_ON = 0x0*512;
	/*
	 * Field: DEBUG
	 * 
	 */
		/* Debug mode disabled */
		const uint16 CONFIG_DEBUG_OFF = 0x1*1024;
		/* Debug mode enabled */
		const uint16 CONFIG_DEBUG_ON = 0x0*1024;

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
 * IOCAF
 * 
 */
reg uint8 IOCAF : 0x8; 

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
reg uint16 TMR1 : 0xf; 

/*
 * T1CON
 * 
 */
reg uint8 T1CON : 0x11; 

/*
 * T1GCON
 * 
 */
reg uint8 T1GCON : 0x12; 

/*
 * CCPR1
 * 
 */
reg uint16 CCPR1 : 0x13; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0x15; 

/*
 * ADRES
 * 
 */
reg uint16 ADRES : 0x1c; 

/*
 * ADCON0
 * 
 */
reg uint8 ADCON0 : 0x1e; 

/*
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0x1f; 

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
 * IOCAP
 * 
 */
reg uint8 IOCAP : 0x88; 

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
 * OSCCON
 * 
 */
reg uint8 OSCCON : 0x8f; 

/*
 * FVRCON
 * 
 */
reg uint8 FVRCON : 0x90; 

/*
 * DACCON0
 * 
 */
reg uint8 DACCON0 : 0x91; 

/*
 * DACCON1
 * 
 */
reg uint8 DACCON1 : 0x92; 

/*
 * CM2CON0
 * 
 */
reg uint8 CM2CON0 : 0x9b; 

/*
 * CM2CON1
 * 
 */
reg uint8 CM2CON1 : 0x9c; 

/*
 * CM1CON0
 * 
 */
reg uint8 CM1CON0 : 0x9d; 

/*
 * CM1CON1
 * 
 */
reg uint8 CM1CON1 : 0x9e; 

/*
 * CMOUT
 * 
 */
reg uint8 CMOUT : 0x9f; 

/*
 * LATA
 * 
 */
reg uint8 LATA : 0x105; 

/*
 * IOCAN
 * 
 */
reg uint8 IOCAN : 0x108; 

/*
 * WPUA
 * 
 */
reg uint8 WPUA : 0x10c; 

/*
 * SLRCONA
 * 
 */
reg uint8 SLRCONA : 0x10d; 

/*
 * PCON
 * 
 */
reg uint8 PCON : 0x10f; 

/*
 * TMR2
 * 
 */
reg uint8 TMR2 : 0x110; 

/*
 * PR2
 * 
 */
reg uint8 PR2 : 0x111; 

/*
 * T2CON
 * 
 */
reg uint8 T2CON : 0x112; 

/*
 * HLTMR1
 * 
 */
reg uint8 HLTMR1 : 0x113; 

/*
 * HLTPR1
 * 
 */
reg uint8 HLTPR1 : 0x114; 

/*
 * HLT1CON0
 * 
 */
reg uint8 HLT1CON0 : 0x115; 

/*
 * HLT1CON1
 * 
 */
reg uint8 HLT1CON1 : 0x116; 

/*
 * ANSELA
 * 
 */
reg uint8 ANSELA : 0x185; 

/*
 * APFCON
 * 
 */
reg uint8 APFCON : 0x188; 

/*
 * OSCTUNE
 * 
 */
reg uint8 OSCTUNE : 0x189; 

/*
 * PMCON1
 * 
 */
reg uint8 PMCON1 : 0x18c; 

/*
 * PMCON2
 * 
 */
reg uint8 PMCON2 : 0x18d; 

/*
 * PMADR
 * 
 */
reg uint16 PMADR : 0x18e; 

/*
 * PMDAT
 * 
 */
reg uint16 PMDAT : 0x190; 

/*
 * COG1PH
 * 
 */
reg uint8 COG1PH : 0x192; 

/*
 * COG1BLK
 * 
 */
reg uint8 COG1BLK : 0x193; 

/*
 * COG1DB
 * 
 */
reg uint8 COG1DB : 0x194; 

/*
 * COG1CON0
 * 
 */
reg uint8 COG1CON0 : 0x195; 

/*
 * COG1CON1
 * 
 */
reg uint8 COG1CON1 : 0x196; 

/*
 * COG1ASD
 * 
 */
reg uint8 COG1ASD : 0x197; 
}
