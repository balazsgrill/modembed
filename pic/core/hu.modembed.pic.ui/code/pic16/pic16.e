/*
 * Mid-range (PIC16) instruction set
 */
instructionset microchip.pic16.instructions;

ADDWF f d=1		<b000111:6 $d:1 $f:7>
ANDWF f d=1		<b000101:6 $d:1 $f:7>
CLRF f			<b0000011:7 $f:7>
CLRW 			<b000001:6 b00000000:8>
COMF f d=1		<b001001:6 $d:1 $f:7>
DECF f d=1		<b000011:6 $d:1 $f:7>
DECFSZ f d=1	<b001011:6 $d:1 $f:7>
INCF f d=1		<b001010:6 $d:1 $f:7>
INCFSZ f d=1	<b001111:6 $d:1 $f:7>
IORWF f d=1		<b000100:6 $d:1 $f:7>
MOVF f d=1		<b001000:6 $d:1 $f:7>
MOVWF f			<b000000:6 1:1 $f:7>
NOP				<0:14>
RLF f d=1		<b001101:6 $d:1 $f:7>
RRF f d=1		<b001100:6 $d:1 $f:7>
SUBWF f d=1		<b000010:6 $d:1 $f:7>
SWAPF f d=1		<b001110:6 $d:1 $f:7>
XORWF f d=1		<b000110:6 $d:1 $f:7>
BCF f b			<b01:2 b00:2 $b:3 $f:7>
BSF f b			<b01:2 b01:2 $b:3 $f:7>
BTFSC f b		<b01:2 b10:2 $b:3 $f:7>
BTFSS f b		<b01:2 b11:2 $b:3 $f:7>
ADDLW k			<b11:2 b1110:4 $k:8>
ANDLW k			<b11:2 b1001:4 $k:8>
IORLW k			<b11:2 b1000:4 $k:8>
MOVLW k			<b11:2 b0000:4 $k:8>
RETLW k			<b11:2 b0100:4 $k:8>
SUBLW k			<b11:2 b1100:4 $k:8>
XORLW k			<b11:2 b1010:4 $k:8>
CALL k			<b100:3 $k:11>
GOTO k			<b101:3 $k:11>
CLRWDT			<b00000001100100:14>
RETFIE			<b00000000001001:14>
RETURN			<b00000000001000:14>
SLEEP			<b00000001100011:14>
