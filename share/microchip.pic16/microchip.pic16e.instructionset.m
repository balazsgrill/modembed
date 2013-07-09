#!platform:/resource/e.core/syntax/instructionSet.syntax.m
instructionset microchip.pic16e.instructionset extends microchip.pic16.instructionset;

/* Add with carry W and f */
ADDWFC	(f d=1)		<0b111101:6  d:1  f:7>;

/* Arithmetic right shift */
ASRF	(f d=1)		<0b110111:6  d:1  f:7>;

/* Logical left shift */
LSLF	(f d=1)		<0b110101:6  d:1  f:7>;

/* Logical right shift */
LSRF	(f d=1)		<0b110110:6  d:1  f:7>;

/* Subtract with Borrow W from f */
SUBWFB	(f d=1)		<0b111011:6  d:1  f:7>;

/* Move literal to BSR */
MOVLB	(k)			<0b000000001:9  k:5>;

/* Move literal to PCLATH */
MOVLP	(k)			<0b1100011:7  k:7>;

/* Relative branch */
BRA		(k)			<0b11001:5  k:9>;

/* Relative branch with W */
BRW		()			<0b00000000001011:14>;

/* Call subroutine with W */
CALLW	()			<0b00000000001010:14>;

/* Load OPTION_REG with W */
OPTION	()			<0b00000001100010:14>;

/* Reset device */
RESET	()			<0b00000000000001:14>;

/* Load TRIS register with W */
TRIS 	(f)			<0b00000001100:11  f:3>;

/* Add literal k to FSRn */
ADDFSR	(n k)		<0b1100010:7  n:1  k:6>;

