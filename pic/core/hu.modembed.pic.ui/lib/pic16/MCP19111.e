/*
 * Library for MCP19111
 * 
 * Architecture: 16xxxx
 */
library microchip.MCP19111{

	use e.platform;
	use microchip.pic16;

/*************************
 * Configuration
 ************************/
 

	const codeaddr configStartAddress = 0x2007
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable bit
	 */
		/* WDT enabled */
		const uint8 CONFIG_WDTE_ON = 0x1*1;
		/* WDT disabled and can be enabled by SWDTEN bit of the WDTCON register */
		const uint8 CONFIG_WDTE_OFF = 0x0*1;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT disabled */
		const uint8 CONFIG_PWRTE_OFF = 0x1*2;
		/* PWRT enabled */
		const uint8 CONFIG_PWRTE_ON = 0x0*2;
	/*
	 * Field: MCLRE
	 * MCLR Pin Function Select bit
	 */
		/* MCLR pin is MCLR function and weak internal pull-up is enabled */
		const uint8 CONFIG_MCLRE_ON = 0x1*4;
		/* MCLR pin is alternate function, MCLR function is internally disabled */
		const uint8 CONFIG_MCLRE_OFF = 0x0*4;
	/*
	 * Field: CP
	 * Code Protection bit
	 */
		/* Program memory is not code protected */
		const uint8 CONFIG_CP_OFF = 0x1*8;
		/* Program memory is external read and write protected */
		const uint8 CONFIG_CP_ON = 0x0*8;
	/*
	 * Field: WRT
	 * Flash Program Memory Self Write Enable bits
	 */
		/* Write protection off */
		const uint8 CONFIG_WRT_OFF = 0x3*16;
		/* 000h to 1FFh write protected, 200h to 7FFh may be modified by PMCON1 control */
		const uint8 CONFIG_WRT_BOOT = 0x2*16;
		/* 000h to 3FFh write protected, 400h to 7FFh may be modified by PMCON1 control */
		const uint8 CONFIG_WRT_HALF = 0x1*16;
		/* 000h to 7FFh write protected, entire program memory is write protected. */
		const uint8 CONFIG_WRT_ALL = 0x0*16;
	/*
	 * Field: DEBUG
	 * ICD Debug Mode Enable bits
	 */
		/* ICD Debug Mode Disabled */
		const uint8 CONFIG_DEBUG_OFF = 0x1*64;
		/* ICD Debug Mode Enabled */
		const uint8 CONFIG_DEBUG_ON = 0x0*64;

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
 * PORTGPA
 * 
 */
reg uint8 PORTGPA : 0x5; 

/*
 * PORTGPB
 * 
 */
reg uint8 PORTGPB : 0x6; 

/*
 * PIR1
 * 
 */
reg uint8 PIR1 : 0x7; 

/*
 * PIR2
 * 
 */
reg uint8 PIR2 : 0x8; 

/*
 * PCON
 * 
 */
reg uint8 PCON : 0x9; 

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
 * TMR1
 * 
 */
reg uint16 TMR1 : 0xc; 

/*
 * T1CON
 * 
 */
reg uint8 T1CON : 0xe; 

/*
 * TMR2
 * 
 */
reg uint8 TMR2 : 0xf; 

/*
 * T2CON
 * 
 */
reg uint8 T2CON : 0x10; 

/*
 * PR2
 * 
 */
reg uint8 PR2 : 0x11; 

/*
 * PWMPHL
 * 
 */
reg uint8 PWMPHL : 0x13; 

/*
 * PWMPHH
 * 
 */
reg uint8 PWMPHH : 0x14; 

/*
 * PWMRL
 * 
 */
reg uint8 PWMRL : 0x15; 

/*
 * PWMRH
 * 
 */
reg uint8 PWMRH : 0x16; 

/*
 * OVCCON
 * 
 */
reg uint8 OVCCON : 0x19; 

/*
 * OVFCON
 * 
 */
reg uint8 OVFCON : 0x1a; 

/*
 * OSCTUNE
 * 
 */
reg uint8 OSCTUNE : 0x1b; 

/*
 * ADRESL
 * 
 */
reg uint8 ADRESL : 0x1c; 

/*
 * ADRESH
 * 
 */
reg uint8 ADRESH : 0x1d; 

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
 * TRISGPA
 * 
 */
reg uint8 TRISGPA : 0x85; 

/*
 * TRISGPB
 * 
 */
reg uint8 TRISGPB : 0x86; 

/*
 * PIE1
 * 
 */
reg uint8 PIE1 : 0x87; 

/*
 * PIE2
 * 
 */
reg uint8 PIE2 : 0x88; 

/*
 * APFCON
 * 
 */
reg uint8 APFCON : 0x89; 

/*
 * VINLVL
 * 
 */
reg uint8 VINLVL : 0x90; 

/*
 * OCCON
 * 
 */
reg uint8 OCCON : 0x91; 

/*
 * CSPSCON
 * 
 */
reg uint8 CSPSCON : 0x92; 

/*
 * CSGSCON
 * 
 */
reg uint8 CSGSCON : 0x93; 

/*
 * CSRACON
 * 
 */
reg uint8 CSRACON : 0x94; 

/*
 * CSOFFCON
 * 
 */
reg uint8 CSOFFCON : 0x95; 

/*
 * CAOFFCON
 * 
 */
reg uint8 CAOFFCON : 0x96; 

/*
 * VZCCON
 * 
 */
reg uint8 VZCCON : 0x97; 

/*
 * CMPZCON
 * 
 */
reg uint8 CMPZCON : 0x98; 

/*
 * OUVCON
 * 
 */
reg uint8 OUVCON : 0x99; 

/*
 * OOVCON
 * 
 */
reg uint8 OOVCON : 0x9a; 

/*
 * DEADCON
 * 
 */
reg uint8 DEADCON : 0x9b; 

/*
 * SLPCRCON
 * 
 */
reg uint8 SLPCRCON : 0x9c; 

/*
 * SLVGNCON
 * 
 */
reg uint8 SLVGNCON : 0x9d; 

/*
 * WPUGPA
 * 
 */
reg uint8 WPUGPA : 0x105; 

/*
 * WPUGPB
 * 
 */
reg uint8 WPUGPB : 0x106; 

/*
 * PE1
 * 
 */
reg uint8 PE1 : 0x107; 

/*
 * BUFFCON
 * 
 */
reg uint8 BUFFCON : 0x108; 

/*
 * ABECON
 * 
 */
reg uint8 ABECON : 0x109; 

/*
 * SSPADD
 * 
 */
reg uint8 SSPADD : 0x110; 

/*
 * SSPBUF
 * 
 */
reg uint8 SSPBUF : 0x111; 

/*
 * SSPCON1
 * 
 */
reg uint8 SSPCON1 : 0x112; 

/*
 * SSPCON2
 * 
 */
reg uint8 SSPCON2 : 0x113; 

/*
 * SSPCON3
 * 
 */
reg uint8 SSPCON3 : 0x114; 

/*
 * SSPMSK
 * 
 */
reg uint8 SSPMSK : 0x115; 

/*
 * SSPSTAT
 * 
 */
reg uint8 SSPSTAT : 0x116; 

/*
 * SSPADD2
 * 
 */
reg uint8 SSPADD2 : 0x117; 

/*
 * SSPMSK2
 * 
 */
reg uint8 SSPMSK2 : 0x118; 

/*
 * IOCA
 * 
 */
reg uint8 IOCA : 0x185; 

/*
 * IOCB
 * 
 */
reg uint8 IOCB : 0x186; 

/*
 * ANSELA
 * 
 */
reg uint8 ANSELA : 0x187; 

/*
 * ANSELB
 * 
 */
reg uint8 ANSELB : 0x188; 

/*
 * PORTICD
 * 
 */
reg uint8 PORTICD : 0x18c; 

/*
 * TRISICD
 * 
 */
reg uint8 TRISICD : 0x18d; 

/*
 * ICKBUG
 * 
 */
reg uint8 ICKBUG : 0x18e; 

/*
 * BIGBUG
 * 
 */
reg uint8 BIGBUG : 0x18f; 

/*
 * PMCON1
 * 
 */
reg uint8 PMCON1 : 0x190; 

/*
 * PMCON2
 * 
 */
reg uint8 PMCON2 : 0x191; 

/*
 * PMADRL
 * 
 */
reg uint8 PMADRL : 0x192; 

/*
 * PMADRH
 * 
 */
reg uint8 PMADRH : 0x193; 

/*
 * PMDATL
 * 
 */
reg uint8 PMDATL : 0x194; 

/*
 * PMDATH
 * 
 */
reg uint8 PMDATH : 0x195; 

/*
 * OSCCAL
 * 
 */
reg uint8 OSCCAL : 0x198; 

/*
 * DOVCAL
 * 
 */
reg uint8 DOVCAL : 0x199; 

/*
 * TTACAL
 * 
 */
reg uint8 TTACAL : 0x19a; 

/*
 * BGRCAL
 * 
 */
reg uint8 BGRCAL : 0x19b; 

/*
 * VROCAL
 * 
 */
reg uint8 VROCAL : 0x19c; 

/*
 * ZROCAL
 * 
 */
reg uint8 ZROCAL : 0x19d; 

/*
 * ATSTCON
 * 
 */
reg uint8 ATSTCON : 0x19f; 
}
