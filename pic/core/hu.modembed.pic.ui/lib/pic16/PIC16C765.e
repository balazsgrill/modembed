/*
 * Library for PIC16C765
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16C765{

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
		/* External clock with 4x PLL enabled. CLKOUT on OSC2 pin */
		const uint8 CONFIG1_FOSC_E4 = 0x3*1;
		/* HS oscillator */
		const uint8 CONFIG1_FOSC_HS = 0x0*1;
		/* External clock. CLKOUT on OSC2 pin */
		const uint8 CONFIG1_FOSC_EC = 0x1*1;
		/* HS osc with 4x PLL enabled */
		const uint8 CONFIG1_FOSC_H4 = 0x2*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable bit
	 */
		/* WDT enabled */
		const uint8 CONFIG1_WDTE_ON = 0x1*4;
		/* WDT disabled */
		const uint8 CONFIG1_WDTE_OFF = 0x0*4;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT disabled */
		const uint8 CONFIG1_PWRTE_OFF = 0x1*8;
		/* PWRT enabled */
		const uint8 CONFIG1_PWRTE_ON = 0x0*8;
	/*
	 * Field: CP
	 * Code Protection bits
	 */
		/* Code protection off */
		const uint8 CONFIG1_CP_OFF = 0x3f3*16;
		/* 1000h-1FFFh code protected */
		const uint8 CONFIG1_CP_50 = 0x2a2*16;
		/* 0800h-1FFFh code protected */
		const uint8 CONFIG1_CP_75 = 0x151*16;
		/* All memory is code protected */
		const uint8 CONFIG1_CP_ALL = 0x0*16;

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
 * PR2
 * 
 */
reg uint8 PR2 : 0x92; 

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
 * ADCON1
 * 
 */
reg uint8 ADCON1 : 0x9f; 

/*
 * UIR
 * 
 */
reg uint8 UIR : 0x190; 

/*
 * UIE
 * 
 */
reg uint8 UIE : 0x191; 

/*
 * UEIR
 * 
 */
reg uint8 UEIR : 0x192; 

/*
 * UEIE
 * 
 */
reg uint8 UEIE : 0x193; 

/*
 * USTAT
 * 
 */
reg uint8 USTAT : 0x194; 

/*
 * UCTRL
 * 
 */
reg uint8 UCTRL : 0x195; 

/*
 * UADDR
 * 
 */
reg uint8 UADDR : 0x196; 

/*
 * USWSTAT
 * 
 */
reg uint8 USWSTAT : 0x197; 

/*
 * UEP0
 * 
 */
reg uint8 UEP0 : 0x198; 

/*
 * UEP1
 * 
 */
reg uint8 UEP1 : 0x199; 

/*
 * UEP2
 * 
 */
reg uint8 UEP2 : 0x19a; 
}
