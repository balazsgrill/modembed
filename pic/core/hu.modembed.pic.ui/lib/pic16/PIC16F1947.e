/*
 * Library for PIC16F1947
 * 
 * Architecture: 16Exxx
 */
library microchip.PIC16F1947{

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
	 * Field: CPD
	 * Data Memory Code Protection
	 */
		/* Data memory code protection is disabled */
		const uint16 CONFIG1_CPD_OFF = 0x1*256;
		/* Data memory code protection is enabled */
		const uint16 CONFIG1_CPD_ON = 0x0*256;
	/*
	 * Field: BOREN
	 * Brown-out Reset Enable
	 */
		/* Brown-out Reset enabled */
		const uint16 CONFIG1_BOREN_ON = 0x3*512;
		/* Brown-out Reset enabled while running and disabled in Sleep */
		const uint16 CONFIG1_BOREN_NSLEEP = 0x2*512;
		/* Brown-out Reset controlled by the SBOREN bit in the BORCON register */
		const uint16 CONFIG1_BOREN_SBODEN = 0x1*512;
		/* Brown-out Reset disabled */
		const uint16 CONFIG1_BOREN_OFF = 0x0*512;
	/*
	 * Field: CLKOUTEN
	 * Clock Out Enable
	 */
		/* CLKOUT function is disabled. I/O or oscillator function on the CLKOUT pin */
		const uint16 CONFIG1_CLKOUTEN_OFF = 0x1*2048;
		/* CLKOUT function is enabled on the CLKOUT pin */
		const uint16 CONFIG1_CLKOUTEN_ON = 0x0*2048;
	/*
	 * Field: IESO
	 * Internal/External Switchover
	 */
		/* Internal/External Switchover mode is enabled */
		const uint16 CONFIG1_IESO_ON = 0x1*4096;
		/* Internal/External Switchover mode is disabled */
		const uint16 CONFIG1_IESO_OFF = 0x0*4096;
	/*
	 * Field: FCMEN
	 * Fail-Safe Clock Monitor Enable
	 */
		/* Fail-Safe Clock Monitor is enabled */
		const uint16 CONFIG1_FCMEN_ON = 0x1*8192;
		/* Fail-Safe Clock Monitor is disabled */
		const uint16 CONFIG1_FCMEN_OFF = 0x0*8192;
	/*
	 * Field: WRT
	 * Flash Memory Self-Write Protection
	 */
		/* Write protection off */
		const uint16 CONFIG2_WRT_OFF = 0x3*1;
		/* 000h to 1FFh write protected, 200h to 3FFFh may be modified by EECON control */
		const uint16 CONFIG2_WRT_BOOT = 0x2*1;
		/* 000h to 1FFFh write protected, 2000h to 3FFFh may be modified by EECON control */
		const uint16 CONFIG2_WRT_HALF = 0x1*1;
		/* 000h to 3FFFh write protected, no addresses may be modified by EECON control */
		const uint16 CONFIG2_WRT_ALL = 0x0*1;
	/*
	 * Field: VCAPEN
	 * Voltage Regulator Capacitor Enable
	 */
		/* VCAP pin functionality is disabled */
		const uint16 CONFIG2_VCAPEN_OFF = 0x1*4;
		/* VCAP functionality is enabled on VCAP pin */
		const uint16 CONFIG2_VCAPEN_ON = 0x0*4;
	/*
	 * Field: PLLEN
	 * PLL Enable
	 */
		/* 4x PLL enabled */
		const uint16 CONFIG2_PLLEN_ON = 0x1*8;
		/* 4x PLL disabled */
		const uint16 CONFIG2_PLLEN_OFF = 0x0*8;
	/*
	 * Field: STVREN
	 * Stack Overflow/Underflow Reset Enable
	 */
		/* Stack Overflow or Underflow will cause a Reset */
		const uint16 CONFIG2_STVREN_ON = 0x1*16;
		/* Stack Overflow or Underflow will not cause a Reset */
		const uint16 CONFIG2_STVREN_OFF = 0x0*16;
	/*
	 * Field: BORV
	 * Brown-out Reset Voltage Selection
	 */
		/* Brown-out Reset Voltage (Vbor), low trip point selected. */
		const uint16 CONFIG2_BORV_LO = 0x1*32;
		/* Brown-out Reset Voltage (Vbor), high trip point selected. */
		const uint16 CONFIG2_BORV_HI = 0x0*32;
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
 * PORTD
 * 
 */
reg uint8 PORTD : 0xf; 

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
 * PIR3
 * 
 */
reg uint8 PIR3 : 0x13; 

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
 * CPSCON0
 * 
 */
reg uint8 CPSCON0 : 0x1e; 

/*
 * CPSCON1
 * 
 */
reg uint8 CPSCON1 : 0x1f; 

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
 * TRISD
 * PORTD Data Direction Control Register
 */
reg uint8 TRISD : 0x8f; 

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
 * PIE3
 * Peripheral Interrupt Enable Register 3
 */
reg uint8 PIE3 : 0x93; 

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
 * LATD
 * 
 */
reg uint8 LATD : 0x10f; 

/*
 * LATE
 * 
 */
reg uint8 LATE : 0x110; 

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
 * Voltage Reference Control Register 1
 */
reg uint8 DACCON0 : 0x118; 

/*
 * DACCON1
 * Voltage Reference Control Register 2
 */
reg uint8 DACCON1 : 0x119; 

/*
 * SRCON0
 * SR Latch Control Register 0
 */
reg uint8 SRCON0 : 0x11a; 

/*
 * SRCON1
 * SR Latch Control Register 1
 */
reg uint8 SRCON1 : 0x11b; 

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
 * ANSELE
 * 
 */
reg uint8 ANSELE : 0x190; 

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
 * RC1REG
 * 
 */
reg uint8 RC1REG : 0x199; 

/*
 * TX1REG
 * 
 */
reg uint8 TX1REG : 0x19a; 

/*
 * SP1BRGL
 * 
 */
reg uint8 SP1BRGL : 0x19b; 

/*
 * SP1BRGH
 * 
 */
reg uint8 SP1BRGH : 0x19c; 

/*
 * RC1STA
 * Receive Status and Control Register
 */
reg uint8 RC1STA : 0x19d; 

/*
 * TX1STA
 * Transmit Status and Control Register
 */
reg uint8 TX1STA : 0x19e; 

/*
 * BAUD1CON
 * Baud Rate Control Register
 */
reg uint8 BAUD1CON : 0x19f; 

/*
 * WPUB
 * 
 */
reg uint8 WPUB : 0x20d; 

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
 * SSP2BUF
 * 
 */
reg uint8 SSP2BUF : 0x219; 

/*
 * SSP2ADD
 * 
 */
reg uint8 SSP2ADD : 0x21a; 

/*
 * SSP2MSK
 * 
 */
reg uint8 SSP2MSK : 0x21b; 

/*
 * SSP2STAT
 * 
 */
reg uint8 SSP2STAT : 0x21c; 

/*
 * SSP2CON1
 * 
 */
reg uint8 SSP2CON1 : 0x21d; 

/*
 * SSP2CON2
 * 
 */
reg uint8 SSP2CON2 : 0x21e; 

/*
 * SSP2CON3
 * 
 */
reg uint8 SSP2CON3 : 0x21f; 

/*
 * PORTF
 * 
 */
reg uint8 PORTF : 0x28c; 

/*
 * PORTG
 * 
 */
reg uint8 PORTG : 0x28d; 

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
 * PWM1CON
 * 
 */
reg uint8 PWM1CON : 0x294; 

/*
 * CCP1AS
 * 
 */
reg uint8 CCP1AS : 0x295; 

/*
 * PSTR1CON
 * 
 */
reg uint8 PSTR1CON : 0x296; 

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
 * PWM2CON
 * 
 */
reg uint8 PWM2CON : 0x29b; 

/*
 * CCP2AS
 * 
 */
reg uint8 CCP2AS : 0x29c; 

/*
 * PSTR2CON
 * 
 */
reg uint8 PSTR2CON : 0x29d; 

/*
 * CCPTMRS0
 * 
 */
reg uint8 CCPTMRS0 : 0x29e; 

/*
 * CCPTMRS1
 * 
 */
reg uint8 CCPTMRS1 : 0x29f; 

/*
 * TRISF
 * 
 */
reg uint8 TRISF : 0x30c; 

/*
 * TRISG
 * 
 */
reg uint8 TRISG : 0x30d; 

/*
 * CCPR3L
 * 
 */
reg uint8 CCPR3L : 0x311; 

/*
 * CCPR3H
 * 
 */
reg uint8 CCPR3H : 0x312; 

/*
 * CCP3CON
 * 
 */
reg uint8 CCP3CON : 0x313; 

/*
 * PWM3CON
 * 
 */
reg uint8 PWM3CON : 0x314; 

/*
 * CCP3AS
 * 
 */
reg uint8 CCP3AS : 0x315; 

/*
 * PSTR3CON
 * 
 */
reg uint8 PSTR3CON : 0x316; 

/*
 * CCPR4L
 * 
 */
reg uint8 CCPR4L : 0x318; 

/*
 * CCPR4H
 * 
 */
reg uint8 CCPR4H : 0x319; 

/*
 * CCP4CON
 * 
 */
reg uint8 CCP4CON : 0x31a; 

/*
 * CCPR5L
 * 
 */
reg uint8 CCPR5L : 0x31c; 

/*
 * CCPR5H
 * 
 */
reg uint8 CCPR5H : 0x31d; 

/*
 * CCP5CON
 * 
 */
reg uint8 CCP5CON : 0x31e; 

/*
 * LATF
 * 
 */
reg uint8 LATF : 0x38c; 

/*
 * LATG
 * 
 */
reg uint8 LATG : 0x38d; 

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
 * ANSELF
 * 
 */
reg uint8 ANSELF : 0x40c; 

/*
 * ANSELG
 * 
 */
reg uint8 ANSELG : 0x40d; 

/*
 * TMR4
 * 
 */
reg uint8 TMR4 : 0x415; 

/*
 * PR4
 * 
 */
reg uint8 PR4 : 0x416; 

/*
 * T4CON
 * Timer2 Control Register
 */
reg uint8 T4CON : 0x417; 

/*
 * TMR6
 * 
 */
reg uint8 TMR6 : 0x41c; 

/*
 * PR6
 * 
 */
reg uint8 PR6 : 0x41d; 

/*
 * T6CON
 * Timer2 Control Register
 */
reg uint8 T6CON : 0x41e; 

/*
 * WPUG
 * 
 */
reg uint8 WPUG : 0x48d; 

/*
 * RC2REG
 * 
 */
reg uint8 RC2REG : 0x491; 

/*
 * TX2REG
 * 
 */
reg uint8 TX2REG : 0x492; 

/*
 * SP2BRGL
 * 
 */
reg uint8 SP2BRGL : 0x493; 

/*
 * SP2BRGH
 * 
 */
reg uint8 SP2BRGH : 0x494; 

/*
 * RC2STA
 * Receive Status and Control Register
 */
reg uint8 RC2STA : 0x495; 

/*
 * TX2STA
 * Transmit Status and Control Register
 */
reg uint8 TX2STA : 0x496; 

/*
 * BAUD2CON
 * Baud Rate Control Register
 */
reg uint8 BAUD2CON : 0x497; 

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
 * LCDSE2
 * 
 */
reg uint8 LCDSE2 : 0x79a; 

/*
 * LCDSE3
 * 
 */
reg uint8 LCDSE3 : 0x79b; 

/*
 * LCDSE4
 * 
 */
reg uint8 LCDSE4 : 0x79c; 

/*
 * LCDSE5
 * 
 */
reg uint8 LCDSE5 : 0x79d; 

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
 * LCDDATA2
 * 
 */
reg uint8 LCDDATA2 : 0x7a2; 

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
 * LCDDATA5
 * 
 */
reg uint8 LCDDATA5 : 0x7a5; 

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
 * LCDDATA8
 * 
 */
reg uint8 LCDDATA8 : 0x7a8; 

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
 * LCDDATA11
 * 
 */
reg uint8 LCDDATA11 : 0x7ab; 

/*
 * LCDDATA12
 * 
 */
reg uint8 LCDDATA12 : 0x7ac; 

/*
 * LCDDATA13
 * 
 */
reg uint8 LCDDATA13 : 0x7ad; 

/*
 * LCDDATA14
 * 
 */
reg uint8 LCDDATA14 : 0x7ae; 

/*
 * LCDDATA15
 * 
 */
reg uint8 LCDDATA15 : 0x7af; 

/*
 * LCDDATA16
 * 
 */
reg uint8 LCDDATA16 : 0x7b0; 

/*
 * LCDDATA17
 * 
 */
reg uint8 LCDDATA17 : 0x7b1; 

/*
 * LCDDATA18
 * 
 */
reg uint8 LCDDATA18 : 0x7b2; 

/*
 * LCDDATA19
 * 
 */
reg uint8 LCDDATA19 : 0x7b3; 

/*
 * LCDDATA20
 * 
 */
reg uint8 LCDDATA20 : 0x7b4; 

/*
 * LCDDATA21
 * 
 */
reg uint8 LCDDATA21 : 0x7b5; 

/*
 * LCDDATA22
 * 
 */
reg uint8 LCDDATA22 : 0x7b6; 

/*
 * LCDDATA23
 * 
 */
reg uint8 LCDDATA23 : 0x7b7; 

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
