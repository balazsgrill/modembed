        LIST
; P16F726.INC  Standard Header File, Version 0.01    Microchip Technology, Inc.
        NOLIST

; This header file defines configurations, registers, and other useful bits of
; information for the PIC16F726 microcontroller.
; These names are taken to match the data sheets as closely as possible.  

; Note that the processor must be selected before this file is 
; included.  The processor may be selected the following ways:

;       1. Command line switch:
;               C:\ MPASM MYFILE.ASM /PIC16F726
;       2. LIST directive in the source file
;               LIST   P=PIC16F726
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

        IFNDEF __16F726
           MESSG "Processor-header file mismatch.  Verify selected processor."
#define	   __16F726
        ENDIF

;==========================================================================

	INCLUDE	"P16F72X.INC"

;==========================================================================
;
;       RAM Definition
;
;==========================================================================

	__BADRAM H'08'
	__BADRAM H'88'
        __BADRAM H'97', H'9A'-H'9B', H'9E'
        __BADRAM H'105'-H'109'
        __BADRAM H'187'-H'188', H'18D'-H'18F'

        LIST
