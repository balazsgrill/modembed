/*
 * PIC18 instruction set 
 */
instructionset microchip.pic18.instructionset;

ADDWF	(f d=1 a=1)	<0b0010:4  0b01:2  d:1  a:1  f:8>;
ADDWFC	(f d=1 a=1)	<0b0010:4  0b00:2  d:1  a:1  f:8>;
ANDWF	(f d=1 a=1)	<0b0001:4  0b01:2  d:1  a:1  f:8>;
CLRF	(f a=1)		<0b0110:4  0b101:3  a:1  f:8>;
COMF	(f d=1 a=1)	<0b0001:4  0b11:2  d:1  a:1  f:8>;
CPFSEQ	(f a=1)		<0b0110:4  0b001:3  a:1  f:8>;
CPFSGT	(f a=1)		<0b0110:4  0b010:3  a:1  f:8>;
CPFSLT	(f a=1)		<0b0110:4  0b000:3  a:1  f:8>;
DECF	(f d=1 a=1)	<0b0000:4  0b01:2  d:1  a:1  f:8>;
DECFSZ	(f d=1 a=1)	<0b0010:4  0b11:2  d:1  a:1  f:8>;
DCFSNZ	(f d=1 a=1)	<0b0100:4  0b11:2  d:1  a:1  f:8>;
INCF	(f d=1 a=1)	<0b0010:4  0b10:2  d:1  a:1  f:8>;
INCFSZ	(f d=1 a=1)	<0b0011:4  0b11:2  d:1  a:1  f:8>;
INFSNZ	(f d=1 a=1)	<0b0100:4  0b10:2  d:1  a:1  f:8>;
IORWF	(f d=1 a=1)	<0b0001:4  0b00:2  d:1  a:1  f:8>;
MOVF	(f d=1 a=1)	<0b0101:4  0b00:2  d:1  a:1  f:8>;
MOVFF	(s d)		<0b1100:4  s:12>	<0b1111:4  d:12>;
MOVWF	(f a=1)		<0b0110:4  0b111:3  a:1  f:8>;
MULWF	(f a=1)		<0b0000:4  0b001:3  a:1  f:8>;
NEGF	(f a=1)		<0b0110:4  0b110:3  a:1  f:8>;
RLCF	(f d=1 a=1)	<0b0011:4  0b01:2  d:1  a:1  f:8>;
RLNCF	(f d=1 a=1) <0b0100:4  0b01:2  d:1  a:1  f:8>;
RRCF	(f d=1 a=1)	<0b0011:4  0b00:2  d:1  a:1  f:8>;
RRNCF	(f d=1 a=1) <0b0100:4  0b00:2  d:1  a:1  f:8>;
SETF	(f a=1)		<0b0110:4  0b100:3  a:1  f:8>;
SUBFWB	(f d=1 a=1) <0b0101:4  0b01:2  d:1  a:1  f:8>;
SUBWF	(f d=1 a=1) <0b0101:4  0b11:2  d:1  a:1  f:8>;
SUBWFB	(f d=1 a=1) <0b0101:4  0b10:2  d:1  a:1  f:8>;
SWAPF	(f d=1 a=1) <0b0011:4  0b10:2  d:1  a:1  f:8>;
TSTFSZ	(f a=1)	 	<0b0110:4  0b011:3  a:1  f:8>;
XORWF	(f d=1 a=1) <0b0001:4  0b10:2  d:1  a:1  f:8>;
BCF		(f b a=1)	<0b1001:4  b:3  a:1  f:8>;
BSF		(f b a=1)	<0b1000:4  b:3  a:1  f:8>;
BTFSC	(f b a=1)	<0b1011:4  b:3  a:1  f:8>;
BTFSS	(f b a=1)	<0b1010:4  b:3  a:1  f:8>;
BTG		(f b a=1)	<0b0111:4  b:3  a:1  f:8>;
BC		(n)			<0b1110:4  0b0010:4  n:8>;
BN		(n)			<0b1110:4  0b0110:4  n:8>;
BNC		(n)			<0b1110:4  0b0011:4  n:8>;
BNN		(n)			<0b1110:4  0b0111:4  n:8>;
BNOV	(n)			<0b1110:4  0b0101:4  n:8>;
BNZ		(n)			<0b1110:4  0b0001:4  n:8>;
BOV		(n)			<0b1110:4  0b0100:4  n:8>;
BRA		(n)			<0b11010:5  n:11>;
BZ		(n)			<0b1110:4  0b0000:4  n:8>;
CALL	(c s=1)		<0b1110:4  0b110:3  s:1  c:8> <0b1111:4  c:12:8>;
CLRWDT	()			<0b0000:4  0b0000:4  0b0000:4  0b0100:4>;
DAW		()			<0b0000:4  0b0000:4  0b0000:4  0b0111:4>;
GOTO	(c)			<0b1110:4  0b1111:4  c:8> <0b1111:4  c:12:8>;
NOP		()			<0b0:16>;
POP		()			<0b0000:4  0b0000:4  0b0000:4  0b0110:4>;
PUSH	()			<0b0000:4  0b0000:4  0b0000:4  0b0101:4>;
RCALL	(n)			<0b11010:5  n:11>;
RESET	()			<0b0000:4  0b0000:4  0b1111:4  0b1111:4>;
RETFIE	(s=1)		<0b0000:4  0b0000:4  0b0001:4  0b000:3  s:1>;
RETLW	(k)			<0b0000:4  0b1100:4  k:8>;
RETURN	(s=1)		<0b0000:4  0b0000:4  0b0001:4  0b001:3  s:1>;
SLEEP	()			<0b0000:4  0b0000:4  0b0000:4  0b0011:4>;
ADDLW	(k)			<0b0000:4  0b1111:4  k:8>;
ANDLW	(k)			<0b0000:4  0b1011:4  k:8>;
IORLW	(k)			<0b0000:4  0b1001:4  k:8>;
LFSR	(f k)		<0b1110:4  0b1110:4  0b00:2  f:2  k:4> <0b1111:4  0b0000:4  k:8:4>;
MOVLB	(k)			<0b0000:4  0b0001:4  0b0000:4  k:4>;
MOVLW	(k)			<0b0000:4  0b1110:4  k:8>;
MULLW	(k)			<0b0000:4  0b1101:4  k:8>;
SUBLW	(k)			<0b0000:4  0b1000:4  k:8>;
XORLW	(k)			<0b0000:4  0b1010:4  k:8>;
