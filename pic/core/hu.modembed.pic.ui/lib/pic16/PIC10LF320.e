/*
 * Library for PIC10LF320
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC10LF320;

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
		/* INTOSC oscillator: CLKIN function disabled */
		const uint16 CONFIG_FOSC_INTOSC = 0x0*1;
		/* EC: CLKIN function enabled */
		const uint16 CONFIG_FOSC_EC = 0x1*1;
	/*
	 * Field: BOREN
	 * Brown-out Reset Enable
	 */
		/* Brown-out Reset enabled */
		const uint16 CONFIG_BOREN_ON = 0x3*2;
		/* Brown-out Reset enabled while running and disabled in Sleep */
		const uint16 CONFIG_BOREN_NSLEEP = 0x2*2;
		/* Brown-out Reset controlled by the SBOREN bit in the BORCON register */
		const uint16 CONFIG_BOREN_SBODEN = 0x1*2;
		/* Brown-out Reset disabled */
		const uint16 CONFIG_BOREN_OFF = 0x0*2;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable
	 */
		/* WDT enabled */
		const uint16 CONFIG_WDTE_ON = 0x3*8;
		/* WDT enabled while running and disabled in Sleep */
		const uint16 CONFIG_WDTE_NSLEEP = 0x2*8;
		/* WDT controlled by the SWDTEN bit in the WDTCON register */
		const uint16 CONFIG_WDTE_SWDTEN = 0x1*8;
		/* WDT disabled */
		const uint16 CONFIG_WDTE_OFF = 0x0*8;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT disabled */
		const uint16 CONFIG_PWRTE_OFF = 0x1*32;
		/* PWRT enabled */
		const uint16 CONFIG_PWRTE_ON = 0x0*32;
	/*
	 * Field: MCLRE
	 * MCLR Pin Function Select bit
	 */
		/* MCLR pin function is MCLR */
		const uint16 CONFIG_MCLRE_ON = 0x1*64;
		/* MCLR pin function is digital input, MCLR internally tied to VDD */
		const uint16 CONFIG_MCLRE_OFF = 0x0*64;
	/*
	 * Field: CP
	 * Code Protection bit
	 */
		/* Program memory code protection is disabled */
		const uint16 CONFIG_CP_OFF = 0x1*128;
		/* Program memory code protection is enabled */
		const uint16 CONFIG_CP_ON = 0x0*128;
	/*
	 * Field: LVP
	 * Low-Voltage Programming Enable
	 */
		/* Low-voltage programming enabled */
		const uint16 CONFIG_LVP_ON = 0x1*256;
		/* High-voltage on MCLR/VPP must be used for programming */
		const uint16 CONFIG_LVP_OFF = 0x0*256;
	/*
	 * Field: LPBOR
	 * Brown-out Reset Selection bits
	 */
		/* BOR enabled */
		const uint16 CONFIG_LPBOR_ON = 0x1*512;
		/* BOR disabled */
		const uint16 CONFIG_LPBOR_OFF = 0x0*512;
	/*
	 * Field: BORV
	 * Brown-out Reset Voltage Selection
	 */
		/* Brown-out Reset Voltage (Vbor), low trip point selected. */
		const uint16 CONFIG_BORV_LO = 0x1*1024;
		/* Brown-out Reset Voltage (Vbor), high trip point selected. */
		const uint16 CONFIG_BORV_HI = 0x0*1024;
	/*
	 * Field: WRT
	 * Flash Memory Self-Write Protection
	 */
		/* Write protection off */
		const uint16 CONFIG_WRT_OFF = 0x3*2048;
		/* 000h to 03Fh write protected, 040h to 0FFh may be modified by PMCON control */
		const uint16 CONFIG_WRT_BOOT = 0x2*2048;
		/* 000h to 07Fh write protected, 080h to 0FFh may be modified by PMCON control */
		const uint16 CONFIG_WRT_HALF = 0x1*2048;
		/* 000h to 0FFh write protected, no addresses may be modified by PMCON control */
		const uint16 CONFIG_WRT_ALL = 0x0*2048;
	/*
	 * Field: DEBUG
	 * In-Circuit Debugger Mode
	 */
		/* In-Circuit Debugger disabled, ICSPCLK and ICSPDAT are general purpose I/O pins */
		const uint16 CONFIG_DEBUG_OFF = 0x1*8192;
		/* In-Circuit Debugger enabled, ICSPCLK and ICSPDAT are dedicated to the debugger */
		const uint16 CONFIG_DEBUG_ON = 0x0*8192;

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
 * TRISA
 * 
 */
reg uint8 TRISA : 0x6; 

/*
 * LATA
 * 
 */
reg uint8 LATA : 0x7; 

/*
 * ANSELA
 * 
 */
reg uint8 ANSELA : 0x8; 

/*
 * WPUA
 * 
 */
reg uint8 WPUA : 0x9; 

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
 * PIE1
 * 
 */
reg uint8 PIE1 : 0xd; 

/*
 * OPTION_REG
 * 
 */
reg uint8 OPTION_REG : 0xe; 

/*
 * PCON
 * 
 */
reg uint8 PCON : 0xf; 

/*
 * OSCCON
 * 
 */
reg uint8 OSCCON : 0x10; 

/*
 * TMR2
 * 
 */
reg uint8 TMR2 : 0x11; 

/*
 * PR2
 * 
 */
reg uint8 PR2 : 0x12; 

/*
 * T2CON
 * 
 */
reg uint8 T2CON : 0x13; 

/*
 * IOCAP
 * 
 */
reg uint8 IOCAP : 0x14; 

/*
 * IOCAN
 * 
 */
reg uint8 IOCAN : 0x15; 

/*
 * IOCAF
 * 
 */
reg uint8 IOCAF : 0x16; 

/*
 * FVRCON
 * 
 */
reg uint8 FVRCON : 0x17; 

/*
 * ADRES
 * 
 */
reg uint8 ADRES : 0x18; 

/*
 * ADCON
 * 
 */
reg uint8 ADCON : 0x19; 

/*
 * PMADR
 * 
 */
reg uint16 PMADR : 0x1a; 

/*
 * PMDAT
 * 
 */
reg uint16 PMDAT : 0x1c; 

/*
 * PMCON1
 * 
 */
reg uint8 PMCON1 : 0x1e; 

/*
 * PMCON2
 * 
 */
reg uint8 PMCON2 : 0x1f; 

/*
 * CLKRCON
 * 
 */
reg uint8 CLKRCON : 0x20; 

/*
 * WDTCON
 * 
 */
reg uint8 WDTCON : 0x22; 

/*
 * VREGCON
 * 
 */
reg uint8 VREGCON : 0x23; 

/*
 * BORCON
 * 
 */
reg uint8 BORCON : 0x24; 

