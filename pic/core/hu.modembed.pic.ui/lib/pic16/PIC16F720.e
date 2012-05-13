/*
 * Library for PIC16F720
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16F720{

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
		/* EC oscillator: CLKO function on RA4/CLKO pin, CLKI on RA5/CLKI */
		const uint8 CONFIG1_FOSC_ECCLK = 0x3*1;
		/* EC oscillator: I/O function on RA4/CLKO pin, CLKI on RA5/CLKI */
		const uint8 CONFIG1_FOSC_ECIO = 0x2*1;
		/* INTOSC oscillator: CLKO function on RA4/CLKO pin, I/O function on RA5/CLKI */
		const uint8 CONFIG1_FOSC_INTOSCCLK = 0x1*1;
		/* INTOSCIO oscillator: I/O function on RA4/CLKO pin, I/O function on RA5/CLKI */
		const uint8 CONFIG1_FOSC_INTOSCIO = 0x0*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable bit
	 */
		/* WDT disabled */
		const uint8 CONFIG1_WDTE_OFF = 0x0*4;
		/* WDT enabled */
		const uint8 CONFIG1_WDTE_ON = 0x1*4;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT enabled */
		const uint8 CONFIG1_PWRTE_ON = 0x0*8;
		/* PWRT disabled */
		const uint8 CONFIG1_PWRTE_OFF = 0x1*8;
	/*
	 * Field: MCLRE
	 * RA3/MCLR/VPP Pin Function Select bit
	 */
		/* RA3/MCLR/VPP pin function is MCLR; Weak pull-up enabled. */
		const uint8 CONFIG1_MCLRE_ON = 0x1*16;
		/* RA3/MCLR/VPP pin function is digital input; MCLR internally disabled; Weak pull-up disabled */
		const uint8 CONFIG1_MCLRE_OFF = 0x0*16;
	/*
	 * Field: CP
	 * Flash Program Memory Code Protection bit
	 */
		/* 0000h to 07FFh code protection on */
		const uint8 CONFIG1_CP_ON = 0x0*32;
		/* Code protection off */
		const uint8 CONFIG1_CP_OFF = 0x1*32;
	/*
	 * Field: BOREN
	 * Brown-out Reset Enable bits
	 */
		/* Brown-out Reset disabled (Preconditioned State) */
		const uint8 CONFIG1_BOREN_OFF = 0x0*64;
		/* Brown-out Reset enabled during operation and disabled in Sleep */
		const uint8 CONFIG1_BOREN_NSLEEP = 0x2*64;
		/* Brown-out Reset enabled */
		const uint8 CONFIG1_BOREN_ON = 0x3*64;
	/*
	 * Field: PLLEN
	 * INTOSC PLLEN Enable Bit
	 */
		/* INTOSC Frequency is 500 kHz */
		const uint8 CONFIG1_PLLEN_OFF = 0x0*256;
		/* INTOSC Frequency is 16 MHz (32x) */
		const uint8 CONFIG1_PLLEN_ON = 0x1*256;
	/*
	 * Field: DEBUG
	 * Debugger Mode
	 */
		/* Background debugger is enabled */
		const uint8 CONFIG1_DEBUG_ON = 0x0*512;
		/* Background debugger is disabled */
		const uint8 CONFIG1_DEBUG_OFF = 0x1*512;
	/*
	 * Field: WRTEN
	 * Flash memory self-write protection bits
	 */
		/* Write protection off */
		const uint8 CONFIG2_WRTEN_OFF = 0x3*1;
		/* 0h to 1FFh of flash memory write protected, 200h to FFFh may be modified */
		const uint8 CONFIG2_WRTEN_BOOT = 0x2*1;
		/* 0h to 7FFh of flash memory write protected, 800h to FFFh may be modified */
		const uint8 CONFIG2_WRTEN_HALF = 0x1*1;
		/* 0h to FFFh of flash memory write protected, no address may be modified */
		const uint8 CONFIG2_WRTEN_FULL = 0x0*1;
	/*
	 * Field: VCAPEN
	 * 
	 */
		/* All VCAP pin functions are disabled. */
		const uint8 CONFIG2_VCAPEN_OFF = 0x1*4;

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
 * FVRCON
 * 
 */
reg uint8 FVRCON : 0x9c; 

/*
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0x9e; 

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
 * PMCON1
 * 
 */
reg uint8 PMCON1 : 0x18c; 

/*
 * PMCON2
 * 
 */
reg uint8 PMCON2 : 0x18d; 
}
