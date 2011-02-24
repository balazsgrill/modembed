; MCP250XX.ASM  Standard Assembly File, Version 2.00    Microchip Technology, Inc.

; This file generates data to program into an MCP2505x device.  It uses the
; standard header file to create the configuration words and place them in
; the correct locations.
; See MCP250xx.inc for example ASM file and function parameters.

#include "MCP250XX.INC"

; Configuration Word
	org  0x2007
	__config  _RST_ON & _HS_OSC
	
	org  0x0

; CAN Configuration Macros
  DEVICE                  MCP2505X
  RECEIVE_BUFFERS         0x7FF, STANDARD, 0x1FFFFFFF, EXTENDED, 0x338, STANDARD
  TRANSMIT_BUFFERS        0x33F, STANDARD, 0x339, STANDARD, 0x7FF, STANDARD
  CAN_BIT_TIMING		      1, 1, 2, 3, 4, TIMES_1, PHASE2, DISABLED
  CAN_MODE		            NORMAL, PWRUP_NORM, CMD_ACK, ERR_RECVRY_NORM, NO_TX_ON_ERR, SLEEP_DIS, MSG_TYPE_RTR, PWM_POR_UNCH, LO_TO_SLEEP_DIS
  SCHEDULED_TRANSMISSION	DISABLED, NONE, 0x10, X4096_4096TOSC
;
; Peripheral Configuration Macros
  CLOCK_OUT		        DISABLED, CLK_FOSC_8
  IO_DIRECTION		    INPUT, INPUT, INPUT, OUTPUT, INPUT, INPUT, INPUT
  IO_LATCH		        0, 0, 0, 0, 0, 0, 0
  IO_FUNCTION		      DIGITAL, DIGITAL, DIGITAL, DIGITAL
  IO_XMIT_ON_CHANGE   DISABLED, DISABLED, DISABLED, DISABLED, DISABLED, DISABLED, DISABLED, DISABLED
  IO_WEAK_PULLUPS		  ENABLED
  PWM1			          DISABLED, 0x00, 0x00, 0x190
  PWM2			          ENABLED, 0x10, 0xC8, 0x190
  ADC_SETUP		        DISABLED, TOSC32, ADC_FOSC_2, VDD, VSS, X1_64TOSC
  ADC_COMPARES		    0x3FF, 0x3FF, 0x3FF, 0x3FF
;
; User Defined Configuration Macros
	SET_USER0		0x01
	SET_USER1		0xFF
	SET_USER2		0xFF
	SET_USER3		0xFF
	SET_USER4		0xFF
	SET_USER5		0xFF
	SET_USER6		0xFF
	SET_USER7		0xFF
	SET_USER8		0xFF
	SET_USER9		0xFF
	SET_USERA		0xFF
	SET_USERB		0xFF
	SET_USERC		0xFF
	SET_USERD		0xFF
	SET_USERE		0xFF
	SET_USERF		0xFF
;
; Generate Configuration Information - REQUIRED!
        GENERATE

        END
