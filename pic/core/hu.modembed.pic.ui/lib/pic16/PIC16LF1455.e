/*
 * Library for PIC16LF1455
 * 
 * Architecture: 16Exxx
 */
library microchip.PIC16LF1455{

	use e.platform;
	use microchip.pic16.enchanced;

/*************************
 * Configuration
 ************************/
 

	const codeaddr configStartAddress = 0x8007
	/*
	 * Field: FOSC
	 * Oscillator Selection Bits
	 */
		/* ECH, External Clock, High Power Mode (4-20 MHz): device clock supplied to CLKIN pins */
		const uint16 CONFIG1_FOSC_ECH = 0x7*1;
		/* ECM, External Clock, Medium Power Mode (0.5-4 MHz): device clock supplied to CLKIN pins */
		const uint16 CONFIG1_FOSC_ECM = 0x6*1;
		/* ECL, External Clock, Low Power Mode (0-0.5 MHz): device clock supplied to CLKIN pins */
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
	 * Internal/External Switchover Mode
	 */
		/* Internal/External Switchover Mode is enabled */
		const uint16 CONFIG1_IESO_ON = 0x1*2048;
		/* Internal/External Switchover Mode is disabled */
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
		/* 000h to 1FFh write protected, 200h to 1FFFh may be modified by PMCON control */
		const uint16 CONFIG2_WRT_BOOT = 0x2*1;
		/* 000h to 0FFFh write protected, 1000h to 1FFFh may be modified by PMCON control */
		const uint16 CONFIG2_WRT_HALF = 0x1*1;
		/* 000h to 1FFFh write protected, no addresses may be modified by PMCON control */
		const uint16 CONFIG2_WRT_ALL = 0x0*1;
	/*
	 * Field: CPUDIV
	 * CPU System Clock Selection Bit
	 */
		/* CPU system clock divided by 6 */
		const uint16 CONFIG2_CPUDIV_CLKDIV6 = 0x3*4;
		/* CPU system clock divided by 3 */
		const uint16 CONFIG2_CPUDIV_CLKDIV3 = 0x2*4;
		/* CPU system clock divided by 2 */
		const uint16 CONFIG2_CPUDIV_CLKDIV2 = 0x1*4;
		/* NO CPU system divide */
		const uint16 CONFIG2_CPUDIV_NOCLKDIV = 0x0*4;
	/*
	 * Field: USBLSCLK
	 * USB Low SPeed Clock Selection bit
	 */
		/* System clock expects 48 MHz, FS/LS USB CLKENs divide-by is set to 8. */
		const uint16 CONFIG2_USBLSCLK_48MHz = 0x1*16;
		/* System clock expects 24 MHz, FS/LS USB CLKENs divide-by is set to 4. */
		const uint16 CONFIG2_USBLSCLK_24MHz = 0x0*16;
	/*
	 * Field: PLLMULT
	 * PLL Multipler Selection Bit
	 */
		/* 3x Output Frequency Selected */
		const uint16 CONFIG2_PLLMULT_3x = 0x1*32;
		/* 4x Output Frequency Selected */
		const uint16 CONFIG2_PLLMULT_4x = 0x0*32;
	/*
	 * Field: PLLEN
	 * PLL Enable Bit
	 */
		/* 3x or 4x PLL Enabled */
		const uint16 CONFIG2_PLLEN_ENABLED = 0x1*64;
		/* 3x or 4x PLL Disabled */
		const uint16 CONFIG2_PLLEN_DISABLED = 0x0*64;
	/*
	 * Field: STVREN
	 * Stack Overflow/Underflow Reset Enable
	 */
		/* Stack Overflow or Underflow will cause a Reset */
		const uint16 CONFIG2_STVREN_ON = 0x1*128;
		/* Stack Overflow or Underflow will not cause a Reset */
		const uint16 CONFIG2_STVREN_OFF = 0x0*128;
	/*
	 * Field: BORV
	 * Brown-out Reset Voltage Selection
	 */
		/* Brown-out Reset Voltage (Vbor), low trip point selected. */
		const uint16 CONFIG2_BORV_LO = 0x1*256;
		/* Brown-out Reset Voltage (Vbor), high trip point selected. */
		const uint16 CONFIG2_BORV_HI = 0x0*256;
	/*
	 * Field: LPBOR
	 * Low-Power Brown Out Reset
	 */
		/* Low-Power BOR is disabled */
		const uint16 CONFIG2_LPBOR_OFF = 0x1*512;
		/* Low-Power BOR is enabled */
		const uint16 CONFIG2_LPBOR_ON = 0x0*512;
	/*
	 * Field: DEBUG
	 * In-Circuit Debugger Mode
	 */
		/* In-Circuit Debugger disabled, ICSPCLK and ICSPDAT are general purpose I/O pins */
		const uint16 CONFIG2_DEBUG_OFF = 0x1*1024;
		/* In-Circuit Debugger enabled, ICSPCLK and ICSPDAT are dedicated to the debugger */
		const uint16 CONFIG2_DEBUG_ON = 0x0*1024;
	/*
	 * Field: LVP
	 * Low-Voltage Programming Enable
	 */
		/* Low-voltage programming enabled */
		const uint16 CONFIG2_LVP_ON = 0x1*2048;
		/* High-voltage on MCLR/VPP must be used for programming */
		const uint16 CONFIG2_LVP_OFF = 0x0*2048;

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
 * PORTC
 * 
 */
reg uint8 PORTC : 0xe; 

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
 * TRISC
 * PORTC Data Direction Control Register
 */
reg uint8 TRISC : 0x8e; 

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
 * OSCTUNE
 * 
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
 * Analog-to-Digital Control Register 2
 */
reg uint8 ADCON2 : 0x9f; 

/*
 * LATA
 * 
 */
reg uint8 LATA : 0x10c; 

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
 * Voltage Reference Control Register 0
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
 * ANSELA
 * 
 */
reg uint8 ANSELA : 0x18c; 

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
 * 
 */
reg uint8 RCSTA : 0x19d; 

/*
 * TXSTA
 * 
 */
reg uint8 TXSTA : 0x19e; 

/*
 * BAUDCON
 * 
 */
reg uint8 BAUDCON : 0x19f; 

/*
 * WPUA
 * 
 */
reg uint8 WPUA : 0x20c; 

/*
 * SSP1BUF
 * 
 */
reg uint8 SSP1BUF : 0x211; 

/*
 * SSP1ADD
 * 
 */
reg uint8 SSP1ADD : 0x212; 

/*
 * SSP1MSK
 * 
 */
reg uint8 SSP1MSK : 0x213; 

/*
 * SSP1STAT
 * 
 */
reg uint8 SSP1STAT : 0x214; 

/*
 * SSP1CON1
 * 
 */
reg uint8 SSP1CON1 : 0x215; 

/*
 * SSP1CON2
 * 
 */
reg uint8 SSP1CON2 : 0x216; 

/*
 * SSP1CON3
 * 
 */
reg uint8 SSP1CON3 : 0x217; 

/*
 * IOCAP
 * 
 */
reg uint8 IOCAP : 0x391; 

/*
 * IOCAN
 * 
 */
reg uint8 IOCAN : 0x392; 

/*
 * IOCAF
 * 
 */
reg uint8 IOCAF : 0x393; 

/*
 * CLKRCON
 * 
 */
reg uint8 CLKRCON : 0x39a; 

/*
 * CRCON
 * 
 */
reg uint8 CRCON : 0x39b; 

/*
 * CRRC
 * 
 */
reg uint16 CRRC : 0xe10; 

/*
 * TST_CRLT
 * 
 */
reg uint8 TST_CRLT : 0xe12; 

/*
 * ICDIO
 * 
 */
reg uint8 ICDIO : 0xf8c; 

/*
 * ICDCON0
 * 
 */
reg uint8 ICDCON0 : 0xf8d; 

/*
 * ICDSTAT
 * 
 */
reg uint8 ICDSTAT : 0xf91; 

/*
 * DEVSEL
 * 
 */
reg uint8 DEVSEL : 0xf95; 

/*
 * ICDINSTL
 * 
 */
reg uint8 ICDINSTL : 0xf96; 

/*
 * ICDINSTH
 * 
 */
reg uint8 ICDINSTH : 0xf97; 

/*
 * ICDBK0CON
 * 
 */
reg uint8 ICDBK0CON : 0xf9c; 

/*
 * ICDBK0L
 * 
 */
reg uint8 ICDBK0L : 0xf9d; 

/*
 * ICDBK0H
 * 
 */
reg uint8 ICDBK0H : 0xf9e; 

/*
 * BSRICDSHAD
 * 
 */
reg uint8 BSRICDSHAD : 0xfe3; 

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
 * 
 */
reg uint8 STKPTR : 0xfed; 

/*
 * TOSL
 * 
 */
reg uint8 TOSL : 0xfee; 

/*
 * TOSH
 * 
 */
reg uint8 TOSH : 0xfef; 
}
