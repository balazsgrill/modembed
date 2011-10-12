        LIST
; P16F724.INC  Standard Header File, Version 0.01    Microchip Technology, Inc.
        NOLIST

; This header file defines configurations, registers, and other useful bits of
; information for the PIC16F724 microcontroller.
; These names are taken to match the data sheets as closely as possible.  

; Note that the processor must be selected before this file is 
; included.  The processor may be selected the following ways:

;       1. Command line switch:
;               C:\ MPASM MYFILE.ASM /PIC16F724
;       2. LIST directive in the source file
;               LIST   P=PIC16F724
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

        IFNDEF __16F724
           MESSG "Processor-header file mismatch.  Verify selected processor."
#define	   __16F724
        ENDIF

;==========================================================================

	INCLUDE	"P16F72X.INC"

;==========================================================================
;
;       RAM Definition
;
;==========================================================================

        __BADRAM H'97', H'9A'-H'9B', H'9E'
        __BADRAM H'105'-H'109'
	__BADRAM H'110'-H'11F',H'120'-H'16F'
        __BADRAM H'187', H'188', H'18D'-H'18F'
	__BADRAM H'190'-H'1EF'

        LIST
