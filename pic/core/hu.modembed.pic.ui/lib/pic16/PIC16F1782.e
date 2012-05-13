/*
 * Library for PIC16F1782
 * 
 * Architecture: 16Exxx
 */
library microchip.PIC16F1782{

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
		const uint8 CONFIG1_FOSC_ECH = 0x7*1;
		/* ECM, External Clock, Medium Power Mode (0.5-4 MHz): device clock supplied to CLKIN pin */
		const uint8 CONFIG1_FOSC_ECM = 0x6*1;
		/* ECL, External Clock, Low Power Mode (0-0.5 MHz): device clock supplied to CLKIN pin */
		const uint8 CONFIG1_FOSC_ECL = 0x5*1;
		/* INTOSC oscillator: I/O function on CLKIN pin */
		const uint8 CONFIG1_FOSC_INTOSC = 0x4*1;
		/* EXTRC oscillator: External RC circuit connected to CLKIN pin */
		const uint8 CONFIG1_FOSC_EXTRC = 0x3*1;
		/* HS Oscillator, High-speed crystal/resonator connected between OSC1 and OSC2 pins */
		const uint8 CONFIG1_FOSC_HS = 0x2*1;
		/* XT Oscillator, Crystal/resonator connected between OSC1 and OSC2 pins */
		const uint8 CONFIG1_FOSC_XT = 0x1*1;
		/* LP Oscillator, Low-power crystal connected between OSC1 and OSC2 pins */
		const uint8 CONFIG1_FOSC_LP = 0x0*1;
	/*
	 * Field: WDTE
	 * Watchdog Timer Enable
	 */
		/* WDT enabled */
		const uint8 CONFIG1_WDTE_ON = 0x3*8;
		/* WDT enabled while running and disabled in Sleep */
		const uint8 CONFIG1_WDTE_NSLEEP = 0x2*8;
		/* WDT controlled by the SWDTEN bit in the WDTCON register */
		const uint8 CONFIG1_WDTE_SWDTEN = 0x1*8;
		/* WDT disabled */
		const uint8 CONFIG1_WDTE_OFF = 0x0*8;
	/*
	 * Field: PWRTE
	 * Power-up Timer Enable
	 */
		/* PWRT disabled */
		const uint8 CONFIG1_PWRTE_OFF = 0x1*32;
		/* PWRT enabled */
		const uint8 CONFIG1_PWRTE_ON = 0x0*32;
	/*
	 * Field: MCLRE
	 * MCLR Pin Function Select
	 */
		/* MCLR/VPP pin function is MCLR */
		const uint8 CONFIG1_MCLRE_ON = 0x1*64;
		/* MCLR/VPP pin function is digital input */
		const uint8 CONFIG1_MCLRE_OFF = 0x0*64;
	/*
	 * Field: CP
	 * Flash Program Memory Code Protection
	 */
		/* Program memory code protection is disabled */
		const uint8 CONFIG1_CP_OFF = 0x1*128;
		/* Program memory code protection is enabled */
		const uint8 CONFIG1_CP_ON = 0x0*128;
	/*
	 * Field: CPD
	 * Data Memory Code Protection
	 */
		/* Data memory code protection is disabled */
		const uint8 CONFIG1_CPD_OFF = 0x1*256;
		/* Data memory code protection is enabled */
		const uint8 CONFIG1_CPD_ON = 0x0*256;
	/*
	 * Field: BOREN
	 * Brown-out Reset Enable
	 */
		/* Brown-out Reset enabled */
		const uint8 CONFIG1_BOREN_ON = 0x3*512;
		/* Brown-out Reset enabled while running and disabled in Sleep */
		const uint8 CONFIG1_BOREN_NSLEEP = 0x2*512;
		/* Brown-out Reset controlled by the SBOREN bit in the BORCON register */
		const uint8 CONFIG1_BOREN_SBODEN = 0x1*512;
		/* Brown-out Reset disabled */
		const uint8 CONFIG1_BOREN_OFF = 0x0*512;
	/*
	 * Field: CLKOUTEN
	 * Clock Out Enable
	 */
		/* CLKOUT function is disabled. I/O or oscillator function on the CLKOUT pin */
		const uint8 CONFIG1_CLKOUTEN_OFF = 0x1*2048;
		/* CLKOUT function is enabled on the CLKOUT pin */
		const uint8 CONFIG1_CLKOUTEN_ON = 0x0*2048;
	/*
	 * Field: IESO
	 * Internal/External Switchover
	 */
		/* Internal/External Switchover mode is enabled */
		const uint8 CONFIG1_IESO_ON = 0x1*4096;
		/* Internal/External Switchover mode is disabled */
		const uint8 CONFIG1_IESO_OFF = 0x0*4096;
	/*
	 * Field: FCMEN
	 * Fail-Safe Clock Monitor Enable
	 */
		/* Fail-Safe Clock Monitor is enabled */
		const uint8 CONFIG1_FCMEN_ON = 0x1*8192;
		/* Fail-Safe Clock Monitor is disabled */
		const uint8 CONFIG1_FCMEN_OFF = 0x0*8192;
	/*
	 * Field: WRT
	 * Flash Memory Self-Write Protection
	 */
		/* Write protection off */
		const uint8 CONFIG2_WRT_OFF = 0x3*1;
		/* 000h to 1FFh write protected, 200h to 7FFh may be modified by EECON control */
		const uint8 CONFIG2_WRT_BOOT = 0x2*1;
		/* 000h to 3FFh write protected, 400h to 7FFh may be modified by EECON control */
		const uint8 CONFIG2_WRT_HALF = 0x1*1;
		/* 000h to 7FFh write protected, no addresses may be modified by EECON control */
		const uint8 CONFIG2_WRT_ALL = 0x0*1;
	/*
	 * Field: VCAPEN0
	 * 
	 */
		/* Vcap functionality is disabled on RA0. */
		const uint8 CONFIG2_VCAPEN0_OFF = 0x1*4;
		/* Vcap functionality is enabled on RA0 (Vddcore is connected to the pad) */
		const uint8 CONFIG2_VCAPEN0_ON = 0x0*4;
	/*
	 * Field: VCAPEN1
	 * 
	 */
		/* Vcap functionality is disabled on RA6 */
		const uint8 CONFIG2_VCAPEN1_OFF = 0x1*8;
		/* Vcap functionality is enabled on RA6 (Vddcore is connected to the pad) */
		const uint8 CONFIG2_VCAPEN1_ON = 0x0*8;
	/*
	 * Field: PLLEN
	 * PLL Enable
	 */
		/* 4x PLL enabled */
		const uint8 CONFIG2_PLLEN_ON = 0x1*16;
		/* 4x PLL disabled */
		const uint8 CONFIG2_PLLEN_OFF = 0x0*16;
	/*
	 * Field: STVREN
	 * Stack Overflow/Underflow Reset Enable
	 */
		/* Stack Overflow or Underflow will cause a Reset */
		const uint8 CONFIG2_STVREN_ON = 0x1*32;
		/* Stack Overflow or Underflow will not cause a Reset */
		const uint8 CONFIG2_STVREN_OFF = 0x0*32;
	/*
	 * Field: BORV
	 * Brown-out Reset Voltage Selection
	 */
		/* Brown-out Reset Voltage (Vbor), low trip point selected. */
		const uint8 CONFIG2_BORV_LO = 0x1*64;
		/* Brown-out Reset Voltage (Vbor), high trip point selected. */
		const uint8 CONFIG2_BORV_HI = 0x0*64;
	/*
	 * Field: LPBOR
	 * Low Power Brown-Out Reset Enable Bit
	 */
		/* Low power brown-out is disabled */
		const uint8 CONFIG2_LPBOR_OFF = 0x1*128;
		/* Low power brown-out is enabled */
		const uint8 CONFIG2_LPBOR_ON = 0x0*128;
	/*
	 * Field: DEBUG
	 * In-Circuit Debugger Mode
	 */
		/* In-Circuit Debugger disabled, ICSPCLK and ICSPDAT are general purpose I/O pins */
		const uint8 CONFIG2_DEBUG_OFF = 0x1*256;
		/* In-Circuit Debugger enabled, ICSPCLK and ICSPDAT are dedicated to the debugger */
		const uint8 CONFIG2_DEBUG_ON = 0x0*256;
	/*
	 * Field: LVP
	 * Low-Voltage Programming Enable
	 */
		/* Low-voltage programming enabled */
		const uint8 CONFIG2_LVP_ON = 0x1*512;
		/* High-voltage on MCLR/VPP must be used for programming */
		const uint8 CONFIG2_LVP_OFF = 0x0*512;

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
 * PIR4
 * 
 */
reg uint8 PIR4 : 0x14; 

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
 * 
 */
reg uint8 TRISB : 0x8d; 

/*
 * TRISC
 * PORTB Data Direction Control Register
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
 * PIE4
 * 
 */
reg uint8 PIE4 : 0x94; 

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
 * OSCTUNE
 * Oscillator Tuning Register
 */
reg uint8 OSCTUNE : 0x98; 

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
 * ADCON2
 * 
 */
reg uint8 ADCON2 : 0x9f; 

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
 * CM1CON0
 * 
 */
reg uint8 CM1CON0 : 0x111; 

/*
 * CM1CON1
 * 
 */
reg uint8 CM1CON1 : 0x112; 

/*
 * CM2CON0
 * 
 */
reg uint8 CM2CON0 : 0x113; 

/*
 * CM2CON1
 * 
 */
reg uint8 CM2CON1 : 0x114; 

/*
 * CMOUT
 * Comparator Output Register
 */
reg uint8 CMOUT : 0x115; 

/*
 * BORCON
 * Brown-out Reset Control Register
 */
reg uint8 BORCON : 0x116; 

/*
 * FVRCON
 * Fixed Voltage Reference Control Register
 */
reg uint8 FVRCON : 0x117; 

/*
 * DACCON0
 * Voltage Reference Control Register 0
 */
reg uint8 DACCON0 : 0x118; 

/*
 * DACCON1
 * Voltage Reference Control Register 1
 */
reg uint8 DACCON1 : 0x119; 

/*
 * APFCON
 * Alternate Pin Function Control Register
 */
reg uint8 APFCON : 0x11d; 

/*
 * CM3CON0
 * 
 */
reg uint8 CM3CON0 : 0x11e; 

/*
 * CM3CON1
 * 
 */
reg uint8 CM3CON1 : 0x11f; 

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
 * EEADR
 * 
 */
reg uint16 EEADR : 0x191; 

/*
 * EEDAT
 * 
 */
reg uint16 EEDAT : 0x193; 

/*
 * EECON1
 * 
 */
reg uint8 EECON1 : 0x195; 

/*
 * EECON2
 * 
 */
reg uint8 EECON2 : 0x196; 

/*
 * VREGCON
 * 
 */
reg uint8 VREGCON : 0x197; 

/*
 * WPUA
 * 
 */
reg uint8 WPUA : 0x20c; 

/*
 * WPUB
 * 
 */
reg uint8 WPUB : 0x20d; 

/*
 * WPUC
 * 
 */
reg uint8 WPUC : 0x20e; 

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
 * ODCONA
 * 
 */
reg uint8 ODCONA : 0x28c; 

/*
 * ODCONB
 * 
 */
reg uint8 ODCONB : 0x28d; 

/*
 * ODCONC
 * 
 */
reg uint8 ODCONC : 0x28e; 

/*
 * CCPR1
 * 
 */
reg uint8 CCPR1 : 0x291; 

/*
 * CCP1CON
 * 
 */
reg uint8 CCP1CON : 0x291; 

/*
 * CCPR2
 * 
 */
reg uint8 CCPR2 : 0x296; 

/*
 * CCP2CON
 * 
 */
reg uint8 CCP2CON : 0x296; 

/*
 * SLRCONA
 * 
 */
reg uint8 SLRCONA : 0x30c; 

/*
 * SLRCONB
 * 
 */
reg uint8 SLRCONB : 0x30d; 

/*
 * SLRCONC
 * 
 */
reg uint8 SLRCONC : 0x30e; 

/*
 * INLVLA
 * 
 */
reg uint8 INLVLA : 0x38c; 

/*
 * INLVLB
 * 
 */
reg uint8 INLVLB : 0x38d; 

/*
 * INLVLC
 * 
 */
reg uint8 INLVLC : 0x38e; 

/*
 * INLVLE
 * 
 */
reg uint8 INLVLE : 0x390; 

/*
 * IOCAP
 * Interrupt-On-Change Positive Edge Register
 */
reg uint8 IOCAP : 0x391; 

/*
 * IOCAN
 * Interrupt-On-Change Negative Edge Register
 */
reg uint8 IOCAN : 0x392; 

/*
 * IOCAF
 * Interrupt-On-Change Flag Register
 */
reg uint8 IOCAF : 0x393; 

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
 * IOCCP
 * 
 */
reg uint8 IOCCP : 0x397; 

/*
 * IOCCN
 * 
 */
reg uint8 IOCCN : 0x398; 

/*
 * IOCCF
 * 
 */
reg uint8 IOCCF : 0x399; 

/*
 * IOCEP
 * 
 */
reg uint8 IOCEP : 0x39d; 

/*
 * IOCEN
 * 
 */
reg uint8 IOCEN : 0x39e; 

/*
 * IOCEF
 * 
 */
reg uint8 IOCEF : 0x39f; 

/*
 * OPA1CON
 * 
 */
reg uint8 OPA1CON : 0x511; 

/*
 * OPA2CON
 * 
 */
reg uint8 OPA2CON : 0x513; 

/*
 * CLKRCON
 * 
 */
reg uint8 CLKRCON : 0x51a; 

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
