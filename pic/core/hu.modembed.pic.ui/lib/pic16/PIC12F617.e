/*
 * Library for PIC12F617
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC12F617;

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
		/* EXTRC oscillator: CLKOUT function on RA4/AN3/T1G/OSC2/CLKOUT, RC on RA5/T1CKI/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EXTRCCLK = 0x7*1;
		/* EXTRCIO oscillator: I/O function on RA4/AN3/T1G/OSC2/CLKOUT, RC on RA5/T1CKI/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EXTRCIO = 0x6*1;
		/* INTOSC oscillator: CLKOUT function on RA4/AN3/T1G/OSC2/CLKOUT, I/O function on RA5/T1CKI/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_INTOSCCLK = 0x5*1;
		/* INTOSCIO oscillator: I/O function on RA4/AN3/T1G/OSC2/CLKOUT, I/O function on RA5/T1CKI/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_INTOSCIO = 0x4*1;
		/* EC: I/O function on RA4/AN3/T1G/OSC2/CLKOUT, CLKIN on RA5/T1CKI/OSC1/CLKIN */
		const uint16 CONFIG_FOSC_EC = 0x3*1;
		/* HS oscillator: High-speed crystal/resonator on RA5/T1CKI/OSC1/CLKIN and RA4/AN3/T1G/OSC2/CLKOUT */
		const uint16 CONFIG_FOSC_HS = 0x2*1;
		/* XT oscillator: Crystal/resonator on RA5/T1CKI/OSC1/CLKIN and RA4/AN3/T1G/OSC2/CLKOUT */
		const uint16 CONFIG_FOSC_XT = 0x1*1;
		/* LP oscillator: Low-power crystal on RA5/T1CKI/OSC1/CLKIN and RA4/AN3/T1G/OSC2/CLKOUT */
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
		/* MCLR pin is MCLR function and weak internal pull-up is enabled */
		const uint16 CONFIG_MCLRE_ON = 0x1*32;
		/* MCLR pin is alternate function, MCLR function is internally disabled */
		const uint16 CONFIG_MCLRE_OFF = 0x0*32;
	/*
	 * Field: CP
	 * Code Protection bit
	 */
		/* Program memory is not code protected */
		const uint16 CONFIG_CP_OFF = 0x1*64;
		/* Program memory is external read and write protected */
		const uint16 CONFIG_CP_ON = 0x0*64;
	/*
	 * Field: IOSCFS
	 * Internal Oscillator Frequency Select
	 */
		/* 8 MHz */
		const uint16 CONFIG_IOSCFS_8MHZ = 0x1*128;
		/* 4 MHz */
		const uint16 CONFIG_IOSCFS_4MHZ = 0x0*128;
	/*
	 * Field: BOREN
	 * Brown-out Reset Selection bits
	 */
		/* BOR enabled */
		const uint16 CONFIG_BOREN_ON = 0x3*256;
		/* BOR enabled during operation and disabled in Sleep */
		const uint16 CONFIG_BOREN_NSLEEP = 0x2*256;
		/* BOR disabled */
		const uint16 CONFIG_BOREN_ = 0x1*256;
		/* BOR disabled */
		const uint16 CONFIG_BOREN_OFF = 0x0*256;
	/*
	 * Field: WRT
	 * Flash Program Memory Self Write Enable bits
	 */
		/* Write protection off */
		const uint16 CONFIG_WRT_OFF = 0x3*1024;
		/* 000h to 1FFh write protected, 200h to 7FFh may be modified by PMCON1 control */
		const uint16 CONFIG_WRT_BOOT = 0x2*1024;
		/* 000h to 3FFh write protected, 400h to 7FFh may be modified by PMCON1 control */
		const uint16 CONFIG_WRT_HALF = 0x1*1024;
		/* 000h to 7FFh write protected, entire program memory is write protected. */
		const uint16 CONFIG_WRT_ALL = 0x0*1024;

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
 * GPIO
 * 
 */
reg uint8 GPIO : 0x5; 

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
reg uint16 CCPR1 : 0x13; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0x15; 

/*
 * PWM1CON
 * 
 */
reg uint8 PWM1CON : 0x16; 

/*
 * ECCPAS
 * 
 */
reg uint8 ECCPAS : 0x17; 

/*
 * VRCON
 * 
 */
reg uint8 VRCON : 0x19; 

/*
 * CMCON0
 * 
 */
reg uint8 CMCON0 : 0x1a; 

/*
 * CMCON1
 * 
 */
reg uint8 CMCON1 : 0x1c; 

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
 * TRISIO
 * 
 */
reg uint8 TRISIO : 0x85; 

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
 * OSCTUNE
 * 
 */
reg uint8 OSCTUNE : 0x90; 

/*
 * PR2
 * 
 */
reg uint8 PR2 : 0x92; 

/*
 * APFCON
 * 
 */
reg uint8 APFCON : 0x93; 

/*
 * WPU
 * 
 */
reg uint8 WPU : 0x95; 

/*
 * IOC
 * 
 */
reg uint8 IOC : 0x96; 

/*
 * PMCON1
 * 
 */
reg uint8 PMCON1 : 0x98; 

/*
 * PMCON2
 * 
 */
reg uint8 PMCON2 : 0x99; 

/*
 * PMADRL
 * 
 */
reg uint8 PMADRL : 0x9a; 

/*
 * PMADRH
 * 
 */
reg uint8 PMADRH : 0x9b; 

/*
 * PMDATL
 * 
 */
reg uint8 PMDATL : 0x9c; 

/*
 * PMDATH
 * 
 */
reg uint8 PMDATH : 0x9d; 

/*
 * ADRESL
 * 
 */
reg uint8 ADRESL : 0x9e; 

/*
 * ANSEL
 * 
 */
reg uint8 ANSEL : 0x9f; 

