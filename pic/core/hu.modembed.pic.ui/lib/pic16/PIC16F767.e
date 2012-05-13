/*
 * Library for PIC16F767
 * 
 * Architecture: 16xxxx
 */
library microchip.PIC16F767{

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
		/* EXTRC oscillator; CLKO function on OSC2/CLKO/RA6 */
		const uint8 CONFIG1_FOSC_EXTRCCLK = 0x13*1;
		/* EXTRC oscillator; port I/O function on OSC2/CLKO/RA6 */
		const uint8 CONFIG1_FOSC_EXTRCIO = 0x12*1;
		/* INTRC oscillator; CLKO function on OSC2/CLKO/RA6 and port I/O function on OSC1/CLKI/RA7 */
		const uint8 CONFIG1_FOSC_INTOSCCLK = 0x11*1;
		/* INTRC oscillator; port I/O function on OSC1/CLKI/RA7 and OSC2/CLKO/RA6 */
		const uint8 CONFIG1_FOSC_INTOSCIO = 0x10*1;
		/* EXTCLK; port I/O function on OSC2/CLKO/RA6 */
		const uint8 CONFIG1_FOSC_EC = 0x3*1;
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
		const uint8 CONFIG1_WDTE_ON = 0x1*32;
		/* WDT disabled */
		const uint8 CONFIG1_WDTE_OFF = 0x0*32;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable bit
	 */
		/* PWRT disabled */
		const uint8 CONFIG1_PWRTE_OFF = 0x1*64;
		/* PWRT enabled */
		const uint8 CONFIG1_PWRTE_ON = 0x0*64;
	/*
	 * Field: MCLRE
	 * MCLR/VPP/RE3 Pin Function Select bit
	 */
		/* MCLR/VPP/RE3 pin function is MCLR */
		const uint8 CONFIG1_MCLRE_ON = 0x1*128;
		/* MCLR/VPP/RE3 pin function is digital input only, MCLR gated to '1' */
		const uint8 CONFIG1_MCLRE_OFF = 0x0*128;
	/*
	 * Field: BOREN
	 * Brown-out Reset Enable bit
	 */
		/* Enabled */
		const uint8 CONFIG1_BOREN_ON = 0x1*256;
		/* Disabled */
		const uint8 CONFIG1_BOREN_OFF = 0x0*256;
	/*
	 * Field: BORV
	 * Brown-out Reset Voltage bits
	 */
		/* VBOR set to 2.0V */
		const uint8 CONFIG1_BORV_20 = 0x3*512;
		/* VBOR set to 2.7V */
		const uint8 CONFIG1_BORV_27 = 0x2*512;
		/* VBOR set to 4.2V */
		const uint8 CONFIG1_BORV_42 = 0x1*512;
		/* VBOR set to 4.5V */
		const uint8 CONFIG1_BORV_45 = 0x0*512;
	/*
	 * Field: DEBUG
	 * In-Circuit Debugger Mode bit
	 */
		/* In-Circuit Debugger disabled, RB6 and RB7 are general purpose I/O pins */
		const uint8 CONFIG1_DEBUG_OFF = 0x1*2048;
		/* In-Circuit Debugger enabled, RB6 and RB7 are dedicated to the debugger */
		const uint8 CONFIG1_DEBUG_ON = 0x0*2048;
	/*
	 * Field: CCP2MX
	 * CCP2 Multiplex bit
	 */
		/* CCP2 is on RC1 */
		const uint8 CONFIG1_CCP2MX_RC1 = 0x1*4096;
		/* CCP2 is on RB3 */
		const uint8 CONFIG1_CCP2MX_RB3 = 0x0*4096;
	/*
	 * Field: CP
	 * Flash Program Memory Code Protection bits
	 */
		/* Code protection off */
		const uint8 CONFIG1_CP_OFF = 0x1*8192;
		/* 0000h to 1FFFh code-protected */
		const uint8 CONFIG1_CP_ON = 0x0*8192;
	/*
	 * Field: FCMEN
	 * Fail-Safe Clock Monitor Enable bit
	 */
		/* Fail-Safe Clock Monitor enabled */
		const uint8 CONFIG2_FCMEN_ON = 0x1*1;
		/* Fail-Safe Clock Monitor disabled */
		const uint8 CONFIG2_FCMEN_OFF = 0x0*1;
	/*
	 * Field: IESO
	 * Internal External Switchover bit
	 */
		/* Internal External Switchover mode enabled */
		const uint8 CONFIG2_IESO_ON = 0x1*2;
		/* Internal External Switchover mode disabled */
		const uint8 CONFIG2_IESO_OFF = 0x0*2;
	/*
	 * Field: BORSEN
	 * Brown-out Reset Software Enable bit
	 */
		/* Enabled */
		const uint8 CONFIG2_BORSEN_ON = 0x1*4;
		/* Disabled */
		const uint8 CONFIG2_BORSEN_OFF = 0x0*4;

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
 * SSPCON2
 * 
 */
reg uint8 SSPCON2 : 0x91; 

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
 * CCPR3
 * 
 */
reg uint16 CCPR3 : 0x95; 

/*
 * CCP3CON
 * 
 */
reg uint8 CCP3CON : 0x97; 

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
 * ADCON2
 * 
 */
reg uint8 ADCON2 : 0x9b; 

/*
 * CMCON
 * 
 */
reg uint8 CMCON : 0x9c; 

/*
 * CVRCON
 * 
 */
reg uint8 CVRCON : 0x9d; 

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
 * LVDCON
 * 
 */
reg uint8 LVDCON : 0x109; 

/*
 * PMDATA
 * 
 */
reg uint8 PMDATA : 0x10c; 

/*
 * PMADR
 * 
 */
reg uint8 PMADR : 0x10d; 

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
 * PMCON1
 * 
 */
reg uint8 PMCON1 : 0x18c; 
}
