        LIST
; P16F722.INC  Standard Header File, Version 0.01    Microchip Technology, Inc.
        NOLIST

; This header file defines configurations, registers, and other useful bits of
; information for the PIC16F722 microcontroller.
; These names are taken to match the data sheets as closely as possible.  

; Note that the processor must be selected before this file is 
; included.  The processor may be selected the following ways:

;       1. Command line switch:
;               C:\ MPASM MYFILE.ASM /PIC16F722
;       2. LIST directive in the source file
;               LIST   P=PIC16F722
;       3. Processor Type entry in the MPASM full-screen interface

;==========================================================================
;
;       Revision History
;
;==========================================================================

;Rev:   Date:    Reason:
;0.01	10/09/06 Initial template
 

;==========================================================================
;
;       Verify Processor
;
;==========================================================================

        IFNDEF __16F722
           MESSG "Processor-header file mismatch.  Verify selected processor."
#define	   __16F722
        ENDIF

;==========================================================================

	INCLUDE	"P16F72X.INC"
	
;==========================================================================
;
;       Bad RAM Definitions
;
;==========================================================================

        __BADRAM H'18'-H'1D'		; No USART, CCP2
	__BADRAM H'98'-H'99'		; No USART
	__BADRAM H'0D',H'8D'		; No PIR2, PIE2
	__BADRAM H'97',H'9A', H'9B'
	

        LIST
