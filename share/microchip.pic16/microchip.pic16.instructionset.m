instructionset microchip.pic16.instructionset;

ADDWF	(f d=1)	<0b000111:6  d:1  f:7>;
ANDWF	(f d=1)	<0b000101:6  d:1  f:7>; 
CLRF	(f)		<0b0000011:7  f:7>;
CLRW	()		<0b000001:6  0b00000000:8>;
COMF	(f d=1)	<0b001001:6  d:1  f:7>;
DECF	(f d=1)	<0b000011:6  d:1  f:7>;
DECFSZ	(f d=1)	<0b001011:6  d:1  f:7>;
INCF	(f d=1)	<0b001010:6  d:1  f:7>;
INCFSZ	(f d=1)	<0b001111:6  d:1  f:7>;
IORWF	(f d=1)	<0b000100:6  d:1  f:7>;
MOVF	(f d=1)	<0b001000:6  d:1  f:7>;
MOVWF 	(f)		<0b000000:6  0b1:1  f:7>;
NOP		()		<0b0:14>;
RLF 	(f d=1)	<0b001101:6  d:1  f:7>;
RRF 	(f d=1)	<0b001100:6  d:1  f:7>;
SUBWF 	(f d=1)	<0b000010:6  d:1  f:7>;
SWAPF 	(f d=1)	<0b001110:6  d:1  f:7>;
XORWF 	(f d=1)	<0b000110:6  d:1  f:7>;
BCF 	(f b)	<0b01:2  0b00:2  b:3  f:7>;
BSF 	(f b)	<0b01:2  0b01:2  b:3  f:7>;
BTFSC 	(f b)	<0b01:2  0b10:2  b:3  f:7>;
BTFSS 	(f b)	<0b01:2  0b11:2  b:3  f:7>;
ADDLW 	(k)		<0b11:2  0b1110:4  k:8>;
ANDLW 	(k)		<0b11:2  0b1001:4  k:8>;
IORLW 	(k)		<0b11:2  0b1000:4  k:8>;
MOVLW 	(k)		<0b11:2  0b0000:4  k:8>;
RETLW 	(k)		<0b11:2  0b0100:4  k:8>;
SUBLW 	(k)		<0b11:2  0b1100:4  k:8>;
XORLW 	(k)		<0b11:2  0b1010:4  k:8>;
CALL 	(k)		<0b100:3  k:11>;
GOTO 	(k)		<0b101:3  k:11>;
CLRWDT	()		<0b00000001100100:14>;
RETFIE	()		<0b00000000001001:14>;
RETURN	()		<0b00000000001000:14>;
SLEEP	()		<0b00000001100011:14>;
