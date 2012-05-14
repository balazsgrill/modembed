/*
 * Library for PIC16F1512
 * 
 * Architecture: 16Exxx
 */
library microchip.PIC16F1512;

	use e.platform;
	use microchip.pic16.enchanced;
	use microchip.pic16;

/*************************
 * Configuration
 ************************/
 

	const codeaddr configStartAddress = 0x8007;
	/*
	 * Field: FOSC
	 * Oscillator Selection
	 */
		/* ECH, External Clock, High Power Mode (4-20 MHz): device clock supplied to CLKIN pin */
		const uint16 CONFIG1_FOSC_ECH = 0x7*1;
		/* ECM, External Clock, Medium Power Mode (0.5-4 MHz): device clock supplied to CLKIN pin */
		const uint16 CONFIG1_FOSC_ECM = 0x6*1;
		/* ECL, External Clock, Low Power Mode (0-0.5 MHz): device clock supplied to CLKIN pin */
		const uint16 CONFIG1_FOSC_ECL = 0x5*1;
		/* INTOSC oscillator: I/O function on CLKIN pin */
		const uint16 CONFIG1_FOSC_INTOSC = 0x4*1;
		/* EXTRC oscillator: External RC circuit connected to CLKIN pin */
		const uint16 CONFIG1_FOSC_EXTRC = 0x3*1;
		/* HS Oscillator, High-speed crystal/resonator connected between OSC1 and OSC2 pins */
		const uint16 CONFIG1_FOSC_HS = 0x2*1;
		/* XT Oscillator, Crystal/resonator connected between OSC1 and OSC2 pins */
		const uint16 CONFIG1_FOSC_XT = 0x1*1;
		/* LP Oscillator, Low-power crystal connected between OSC1 and OSC2 pins */
		const uint16 CONFIG1_FOSC_LP = 0x0*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable
	 */
		/* WDT enabled */
		const uint16 CONFIG1_WDTE_ON = 0x3*8;
		/* WDT enabled while running and disabled in Sleep */
		const uint16 CONFIG1_WDTE_NSLEEP = 0x2*8;
		/* WDT controlled by the SWDTEN bit in the WDTCON register */
		const uint16 CONFIG1_WDTE_SWDTEN = 0x1*8;
		/* WDT disabled */
		const uint16 CONFIG1_WDTE_OFF = 0x0*8;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable
	 */
		/* PWRT disabled */
		const uint16 CONFIG1_PWRTE_OFF = 0x1*32;
		/* PWRT enabled */
		const uint16 CONFIG1_PWRTE_ON = 0x0*32;
	/*
	 * Field: MCLRE
	 * MCLR Pin Function Select
	 */
		/* MCLR/VPP pin function is MCLR */
		const uint16 CONFIG1_MCLRE_ON = 0x1*64;
		/* MCLR/VPP pin function is digital input */
		const uint16 CONFIG1_MCLRE_OFF = 0x0*64;
	/*
	 * Field: CP
	 * Flash Program Memory Code Protection
	 */
		/* Program memory code protection is disabled */
		const uint16 CONFIG1_CP_OFF = 0x1*128;
		/* Program memory code protection is enabled */
		const uint16 CONFIG1_CP_ON = 0x0*128;
	/*
	 * Field: BOREN
	 * Brown-out Reset Enable
	 */
		/* Brown-out Reset enabled */
		const uint16 CONFIG1_BOREN_ON = 0x3*256;
		/* Brown-out Reset enabled while running and disabled in Sleep */
		const uint16 CONFIG1_BOREN_NSLEEP = 0x2*256;
		/* Brown-out Reset controlled by the SBOREN bit in the BORCON register */
		const uint16 CONFIG1_BOREN_SBODEN = 0x1*256;
		/* Brown-out Reset disabled */
		const uint16 CONFIG1_BOREN_OFF = 0x0*256;
	/*
	 * Field: CLKOUTEN
	 * Clock Out Enable
	 */
		/* CLKOUT function is disabled. I/O or oscillator function on the CLKOUT pin */
		const uint16 CONFIG1_CLKOUTEN_OFF = 0x1*1024;
		/* CLKOUT function is enabled on the CLKOUT pin */
		const uint16 CONFIG1_CLKOUTEN_ON = 0x0*1024;
	/*
	 * Field: IESO
	 * Internal/External Switchover
	 */
		/* Internal/External Switchover mode is enabled */
		const uint16 CONFIG1_IESO_ON = 0x1*2048;
		/* Internal/External Switchover mode is disabled */
		const uint16 CONFIG1_IESO_OFF = 0x0*2048;
	/*
	 * Field: FCMEN
	 * Fail-Safe Clock Monitor Enable
	 */
		/* Fail-Safe Clock Monitor is enabled */
		const uint16 CONFIG1_FCMEN_ON = 0x1*4096;
		/* Fail-Safe Clock Monitor is disabled */
		const uint16 CONFIG1_FCMEN_OFF = 0x0*4096;
	/*
	 * Field: WRT
	 * Flash Memory Self-Write Protection
	 */
		/* Write protection off */
		const uint16 CONFIG2_WRT_OFF = 0x3*1;
		/* 000h to 1FFh write protected, 200h to 1FFFh may be modified by EECON control */
		const uint16 CONFIG2_WRT_BOOT = 0x2*1;
		/* 000h to FFFh write protected, 1000h to 1FFFh may be modified by EECON control */
		const uint16 CONFIG2_WRT_HALF = 0x1*1;
		/* 000h to 1FFFh write protected, no addresses may be modified by EECON control */
		const uint16 CONFIG2_WRT_ALL = 0x0*1;
	/*
	 * Field: VCAPEN
	 * Voltage Regulator Capacitor Enable bit
	 */
		/* VCAP pin function disabled */
		const uint16 CONFIG2_VCAPEN_OFF = 0x1*4;
		/* VCAP pin function enabled */
		const uint16 CONFIG2_VCAPEN_ON = 0x0*4;
	/*
	 * Field: STVREN
	 * Stack Overflow/Underflow Reset Enable
	 */
		/* Stack Overflow or Underflow will cause a Reset */
		const uint16 CONFIG2_STVREN_ON = 0x1*8;
		/* Stack Overflow or Underflow will not cause a Reset */
		const uint16 CONFIG2_STVREN_OFF = 0x0*8;
	/*
	 * Field: BORV
	 * Brown-out Reset Voltage Selection
	 */
		/* Brown-out Reset Voltage (Vbor), low trip point selected. */
		const uint16 CONFIG2_BORV_LO = 0x1*16;
		/* Brown-out Reset Voltage (Vbor), high trip point selected. */
		const uint16 CONFIG2_BORV_HI = 0x0*16;
	/*
	 * Field: LPBOR
	 * Low-Power Brown Out Reset
	 */
		/* Low-Power BOR is disabled */
		const uint16 CONFIG2_LPBOR_OFF = 0x1*32;
		/* Low-Power BOR is enabled */
		const uint16 CONFIG2_LPBOR_ON = 0x0*32;
	/*
	 * Field: DEBUG
	 * In-Circuit Debugger Mode
	 */
		/* In-Circuit Debugger disabled, ICSPCLK and ICSPDAT are general purpose I/O pins */
		const uint16 CONFIG2_DEBUG_OFF = 0x1*64;
		/* In-Circuit Debugger enabled, ICSPCLK and ICSPDAT are dedicated to the debugger */
		const uint16 CONFIG2_DEBUG_ON = 0x0*64;
	/*
	 * Field: LVP
	 * Low-Voltage Programming Enable
	 */
		/* Low-voltage programming enabled */
		const uint16 CONFIG2_LVP_ON = 0x1*128;
		/* High-voltage on MCLR/VPP must be used for programming */
		const uint16 CONFIG2_LVP_OFF = 0x0*128;

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
 * TMR2
 * 
 */
reg uint8 TMR2 : 0x1a; 

/*
 * PR2
 * 
 */
reg uint8 PR2 : 0x1b; 

/*
 * T2CON
 * 
 */
reg uint8 T2CON : 0x1c; 

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
 * ADRES0
 * 
 */
reg uint16 ADRES0 : 0x9b; 

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
 * APFCON
 * Alternate Pin Function Control Register
 */
reg uint8 APFCON : 0x11d; 

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
 * ANSELC
 * 
 */
reg uint8 ANSELC : 0x18e; 

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
 * VREGCON
 * 
 */
reg uint8 VREGCON : 0x197; 

/*
 * RCREG
 * 
 */
reg uint8 RCREG : 0x199; 

/*
 * TXREG
 * 
 */
reg uint8 TXREG : 0x19a; 

/*
 * SPBRGL
 * 
 */
reg uint8 SPBRGL : 0x19b; 

/*
 * SPBRGH
 * 
 */
reg uint8 SPBRGH : 0x19c; 

/*
 * RCSTA
 * Receive Status and Control Register
 */
reg uint8 RCSTA : 0x19d; 

/*
 * TXSTA
 * Transmit Status and Control Register
 */
reg uint8 TXSTA : 0x19e; 

/*
 * BAUDCON
 * Baud Rate Control Register
 */
reg uint8 BAUDCON : 0x19f; 

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
 * SSPBUF
 * 
 */
reg uint8 SSPBUF : 0x211; 

/*
 * SSPADD
 * 
 */
reg uint8 SSPADD : 0x212; 

/*
 * SSPMSK
 * 
 */
reg uint8 SSPMSK : 0x213; 

/*
 * SSPSTAT
 * 
 */
reg uint8 SSPSTAT : 0x214; 

/*
 * SSPCON1
 * 
 */
reg uint8 SSPCON1 : 0x215; 

/*
 * SSPCON2
 * 
 */
reg uint8 SSPCON2 : 0x216; 

/*
 * SSPCON3
 * 
 */
reg uint8 SSPCON3 : 0x217; 

/*
 * CCPR1L
 * 
 */
reg uint8 CCPR1L : 0x291; 

/*
 * CCPR1H
 * 
 */
reg uint8 CCPR1H : 0x292; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0x293; 

/*
 * CCPR2L
 * 
 */
reg uint8 CCPR2L : 0x298; 

/*
 * CCPR2H
 * 
 */
reg uint8 CCPR2H : 0x299; 

/*
 * CCP2CON
 * 
 */
reg uint8 CCP2CON : 0x29a; 

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

/*
 * AADCON0
 * 
 */
reg uint8 AADCON0 : 0x711; 

/*
 * AADCON1
 * 
 */
reg uint8 AADCON1 : 0x712; 

/*
 * AADCON2
 * 
 */
reg uint8 AADCON2 : 0x713; 

/*
 * AADCON3
 * 
 */
reg uint8 AADCON3 : 0x714; 

/*
 * AADSTAT
 * 
 */
reg uint8 AADSTAT : 0x715; 

/*
 * AADPRE
 * 
 */
reg uint8 AADPRE : 0x716; 

/*
 * AADACQ
 * 
 */
reg uint8 AADACQ : 0x717; 

/*
 * AADGRD
 * 
 */
reg uint8 AADGRD : 0x718; 

/*
 * AADCAP
 * 
 */
reg uint8 AADCAP : 0x719; 

/*
 * AADRES0L
 * 
 */
reg uint8 AADRES0L : 0x71a; 

/*
 * AADRES0H
 * 
 */
reg uint8 AADRES0H : 0x71b; 

/*
 * AADRES1L
 * 
 */
reg uint8 AADRES1L : 0x71c; 

/*
 * AADRES1H
 * 
 */
reg uint8 AADRES1H : 0x71d; 

