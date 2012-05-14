/*
 * Library for PIC16LF1903
 * 
 * Architecture: 16Exxx
 */
library microchip.PIC16LF1903{

	use e.platform;
	use microchip.pic16.enchanced;

/*************************
 * Configuration
 ************************/
 

	const codeaddr configStartAddress = 0x8007
	/*
	 * Field: FOSC
	 * Oscillator Selection
	 */
		/* ECH, External Clock, High Power Mode (4-32 MHz): device clock supplied to CLKIN pin */
		const uint16 CONFIG1_FOSC_ECH = 0x7*1;
		/* ECM, External Clock, Medium Power Mode (0.5-4 MHz): device clock supplied to CLKIN pin */
		const uint16 CONFIG1_FOSC_ECM = 0x6*1;
		/* ECL, External Clock, Low Power Mode (0-0.5 MHz): device clock supplied to CLKIN pin */
		const uint16 CONFIG1_FOSC_ECL = 0x5*1;
		/* INTOSC oscillator: I/O function on CLKIN pin */
		const uint16 CONFIG1_FOSC_INTOSC = 0x4*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable
	 */
		/* WDT enabled */
		const uint16 CONFIG1_WDTE_ON = 0x3*4;
		/* WDT enabled while running and disabled in Sleep */
		const uint16 CONFIG1_WDTE_NSLEEP = 0x2*4;
		/* WDT controlled by the SWDTEN bit in the WDTCON register */
		const uint16 CONFIG1_WDTE_SWDTEN = 0x1*4;
		/* WDT disabled */
		const uint16 CONFIG1_WDTE_OFF = 0x0*4;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable
	 */
		/* PWRT disabled */
		const uint16 CONFIG1_PWRTE_OFF = 0x1*16;
		/* PWRT enabled */
		const uint16 CONFIG1_PWRTE_ON = 0x0*16;
	/*
	 * Field: MCLRE
	 * MCLR Pin Function Select
	 */
		/* MCLR/VPP pin function is MCLR */
		const uint16 CONFIG1_MCLRE_ON = 0x1*32;
		/* MCLR/VPP pin function is digital input */
		const uint16 CONFIG1_MCLRE_OFF = 0x0*32;
	/*
	 * Field: CP
	 * Flash Program Memory Code Protection
	 */
		/* Program memory code protection is disabled */
		const uint16 CONFIG1_CP_OFF = 0x1*64;
		/* Program memory code protection is enabled */
		const uint16 CONFIG1_CP_ON = 0x0*64;
	/*
	 * Field: BOREN
	 * Brown-out Reset Enable
	 */
		/* Brown-out Reset enabled */
		const uint16 CONFIG1_BOREN_ON = 0x3*128;
		/* Brown-out Reset enabled while running and disabled in Sleep */
		const uint16 CONFIG1_BOREN_NSLEEP = 0x2*128;
		/* Brown-out Reset controlled by the SBOREN bit in the BORCON register */
		const uint16 CONFIG1_BOREN_SBODEN = 0x1*128;
		/* Brown-out Reset disabled */
		const uint16 CONFIG1_BOREN_OFF = 0x0*128;
	/*
	 * Field: CLKOUTEN
	 * Clock Out Enable
	 */
		/* CLKOUT function is disabled. I/O or oscillator function on the CLKOUT pin */
		const uint16 CONFIG1_CLKOUTEN_OFF = 0x1*512;
		/* CLKOUT function is enabled on the CLKOUT pin */
		const uint16 CONFIG1_CLKOUTEN_ON = 0x0*512;
	/*
	 * Field: WRT
	 * Flash Memory Self-Write Protection
	 */
		/* Write protection off */
		const uint16 CONFIG2_WRT_OFF = 0x3*1;
		/* 000h to 1FFh write protected, 200h to 7FFh may be modified by PMCON control */
		const uint16 CONFIG2_WRT_BOOT = 0x2*1;
		/* 000h to 3FFh write protected, 400h to 7FFh may be modified by PMCON control */
		const uint16 CONFIG2_WRT_HALF = 0x1*1;
		/* 000h to 7FFh write protected, no addresses may be modified by PMCON control */
		const uint16 CONFIG2_WRT_ALL = 0x0*1;
	/*
	 * Field: STVREN
	 * Stack Overflow/Underflow Reset Enable
	 */
		/* Stack Overflow or Underflow will cause a Reset */
		const uint16 CONFIG2_STVREN_ON = 0x1*4;
		/* Stack Overflow or Underflow will not cause a Reset */
		const uint16 CONFIG2_STVREN_OFF = 0x0*4;
	/*
	 * Field: BORV
	 * Brown-out Reset Voltage Selection
	 */
		/* Brown-out Reset Voltage (Vbor), low trip point selected. */
		const uint16 CONFIG2_BORV_LO = 0x1*8;
		/* Brown-out Reset Voltage (Vbor), high trip point selected. */
		const uint16 CONFIG2_BORV_HI = 0x0*8;
	/*
	 * Field: LPBOR
	 * Low-Power Brown-out Reset
	 */
		/* Low-Power BOR is disabled */
		const uint16 CONFIG2_LPBOR_OFF = 0x1*16;
		/* Low-Power BOR is enabled */
		const uint16 CONFIG2_LPBOR_ON = 0x0*16;
	/*
	 * Field: DEBUG
	 * In-Circuit Debugger Mode
	 */
		/* In-Circuit Debugger disabled, ICSPCLK and ICSPDAT are general purpose I/O pins */
		const uint16 CONFIG2_DEBUG_OFF = 0x1*32;
		/* In-Circuit Debugger enabled, ICSPCLK and ICSPDAT are dedicated to the debugger */
		const uint16 CONFIG2_DEBUG_ON = 0x0*32;
	/*
	 * Field: LVP
	 * Low-Voltage Programming Enable
	 */
		/* Low-voltage programming enabled */
		const uint16 CONFIG2_LVP_ON = 0x1*64;
		/* High-voltage on MCLR/VPP must be used for programming */
		const uint16 CONFIG2_LVP_OFF = 0x0*64;

/********************
 * Special function registers
 ********************/


/*
 * INDF0
 * 
 */
reg uint8 INDF0 : 0x0; 

/*
 * INDF1
 * 
 */
reg uint8 INDF1 : 0x1; 

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
 * FSR0
 * 
 */
reg uint16 FSR0 : 0x4; 

/*
 * FSR1
 * 
 */
reg uint16 FSR1 : 0x6; 

/*
 * BSR
 * 
 */
reg uint8 BSR : 0x8; 

/*
 * WREG
 * 
 */
reg uint8 WREG : 0x9; 

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
 * PORTA
 * 
 */
reg uint8 PORTA : 0xc; 

/*
 * PORTB
 * 
 */
reg uint8 PORTB : 0xd; 

/*
 * PORTC
 * 
 */
reg uint8 PORTC : 0xe; 

/*
 * PORTE
 * 
 */
reg uint8 PORTE : 0x10; 

/*
 * PIR1
 * 
 */
reg uint8 PIR1 : 0x11; 

/*
 * PIR2
 * 
 */
reg uint8 PIR2 : 0x12; 

/*
 * TMR0
 * 
 */
reg uint8 TMR0 : 0x15; 

/*
 * TMR1
 * 
 */
reg uint16 TMR1 : 0x16; 

/*
 * T1CON
 * 
 */
reg uint8 T1CON : 0x18; 

/*
 * T1GCON
 * 
 */
reg uint8 T1GCON : 0x19; 

/*
 * TRISA
 * PORTA Data Direction Control Register
 */
reg uint8 TRISA : 0x8c; 

/*
 * TRISB
 * PORTB Data Direction Control Register
 */
reg uint8 TRISB : 0x8d; 

/*
 * TRISC
 * PORTC Data Direction Control Register
 */
reg uint8 TRISC : 0x8e; 

/*
 * TRISE
 * 
 */
reg uint8 TRISE : 0x90; 

/*
 * PIE1
 * Peripheral Interrupt Enable Register 1
 */
reg uint8 PIE1 : 0x91; 

/*
 * PIE2
 * Peripheral Interrupt Enable Register 2
 */
reg uint8 PIE2 : 0x92; 

/*
 * OPTION_REG
 * Option Register
 */
reg uint8 OPTION_REG : 0x95; 

/*
 * PCON
 * Power Control Register
 */
reg uint8 PCON : 0x96; 

/*
 * WDTCON
 * Watchdog Timer Control Register
 */
reg uint8 WDTCON : 0x97; 

/*
 * OSCCON
 * Oscillator Control Register
 */
reg uint8 OSCCON : 0x99; 

/*
 * OSCSTAT
 * Oscillator Status Register
 */
reg uint8 OSCSTAT : 0x9a; 

/*
 * ADRES
 * 
 */
reg uint16 ADRES : 0x9b; 

/*
 * ADCON0
 * Analog-to-Digital Control Register 0
 */
reg uint8 ADCON0 : 0x9d; 

/*
 * ADCON1
 * Analog-to-Digital Control Register 1
 */
reg uint8 ADCON1 : 0x9e; 

/*
 * LATA
 * 
 */
reg uint8 LATA : 0x10c; 

/*
 * LATB
 * 
 */
reg uint8 LATB : 0x10d; 

/*
 * LATC
 * 
 */
reg uint8 LATC : 0x10e; 

/*
 * BORCON
 * Brown-out Reset Control Register
 */
reg uint8 BORCON : 0x116; 

/*
 * FVRCON
 * Voltage Reference Control Register 0
 */
reg uint8 FVRCON : 0x117; 

/*
 * ANSELA
 * 
 */
reg uint8 ANSELA : 0x18c; 

/*
 * ANSELB
 * 
 */
reg uint8 ANSELB : 0x18d; 

/*
 * PMADR
 * 
 */
reg uint16 PMADR : 0x191; 

/*
 * PMDAT
 * 
 */
reg uint16 PMDAT : 0x193; 

/*
 * PMCON1
 * 
 */
reg uint8 PMCON1 : 0x195; 

/*
 * PMCON2
 * 
 */
reg uint8 PMCON2 : 0x196; 

/*
 * WPUB
 * 
 */
reg uint8 WPUB : 0x20d; 

/*
 * WPUE
 * 
 */
reg uint8 WPUE : 0x210; 

/*
 * IOCBP
 * Interrupt-On-Change Positive Edge Register
 */
reg uint8 IOCBP : 0x394; 

/*
 * IOCBN
 * Interrupt-On-Change Negative Edge Register
 */
reg uint8 IOCBN : 0x395; 

/*
 * IOCBF
 * Interrupt-On-Change Flag Register
 */
reg uint8 IOCBF : 0x396; 

/*
 * LCDCON
 * LCD Control Register
 */
reg uint8 LCDCON : 0x791; 

/*
 * LCDPS
 * LCD Phase Register
 */
reg uint8 LCDPS : 0x792; 

/*
 * LCDREF
 * LCD Reference Voltage Control Register
 */
reg uint8 LCDREF : 0x793; 

/*
 * LCDCST
 * LCD Contrast Control Register
 */
reg uint8 LCDCST : 0x794; 

/*
 * LCDRL
 * LCD Reference Voltage Control Register
 */
reg uint8 LCDRL : 0x795; 

/*
 * LCDSE0
 * 
 */
reg uint8 LCDSE0 : 0x798; 

/*
 * LCDSE1
 * 
 */
reg uint8 LCDSE1 : 0x799; 

/*
 * LCDDATA0
 * 
 */
reg uint8 LCDDATA0 : 0x7a0; 

/*
 * LCDDATA1
 * 
 */
reg uint8 LCDDATA1 : 0x7a1; 

/*
 * LCDDATA3
 * 
 */
reg uint8 LCDDATA3 : 0x7a3; 

/*
 * LCDDATA4
 * 
 */
reg uint8 LCDDATA4 : 0x7a4; 

/*
 * LCDDATA6
 * 
 */
reg uint8 LCDDATA6 : 0x7a6; 

/*
 * LCDDATA7
 * 
 */
reg uint8 LCDDATA7 : 0x7a7; 

/*
 * LCDDATA9
 * 
 */
reg uint8 LCDDATA9 : 0x7a9; 

/*
 * LCDDATA10
 * 
 */
reg uint8 LCDDATA10 : 0x7aa; 

/*
 * LCDDATA12
 * 
 */
reg uint8 LCDDATA12 : 0x7ac; 

/*
 * LCDDATA15
 * 
 */
reg uint8 LCDDATA15 : 0x7af; 

/*
 * LCDDATA18
 * 
 */
reg uint8 LCDDATA18 : 0x7b2; 

/*
 * LCDDATA21
 * 
 */
reg uint8 LCDDATA21 : 0x7b5; 

/*
 * STATUS_SHAD
 * 
 */
reg uint8 STATUS_SHAD : 0xfe4; 

/*
 * WREG_SHAD
 * 
 */
reg uint8 WREG_SHAD : 0xfe5; 

/*
 * BSR_SHAD
 * 
 */
reg uint8 BSR_SHAD : 0xfe6; 

/*
 * PCLATH_SHAD
 * 
 */
reg uint8 PCLATH_SHAD : 0xfe7; 

/*
 * FSR0L_SHAD
 * 
 */
reg uint8 FSR0L_SHAD : 0xfe8; 

/*
 * FSR0H_SHAD
 * 
 */
reg uint8 FSR0H_SHAD : 0xfe9; 

/*
 * FSR1L_SHAD
 * 
 */
reg uint8 FSR1L_SHAD : 0xfea; 

/*
 * FSR1H_SHAD
 * 
 */
reg uint8 FSR1H_SHAD : 0xfeb; 

/*
 * STKPTR
 * Current Stack pointer
 */
reg uint8 STKPTR : 0xfed; 

/*
 * TOSL
 * Top of Stack Low byte
 */
reg uint8 TOSL : 0xfee; 

/*
 * TOSH
 * Top of Stack High byte
 */
reg uint8 TOSH : 0xfef; 
}
