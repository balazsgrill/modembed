instructionset microchip.pic16.enchanced.instructions extends microchip.pic16.instructions;

/* Add with carry W and f */
ADDWFC f d=1	<b111101:6 $d:1 $f:7>

/* Arithmetic right shift */
ASRF f d=1		<b110111:6 $d:1 $f:7>

/* Logical left shift */
LSLF f d=1		<b111101:6 $d:1 $f:7>

/* Logical right shift */
LSRF f d=1		<b111101:6 $d:1 $f:7>

/* Subtract with Borrow W from f */
SUBWFB f d=1	<b111011:6 $d:1 $f:7>

/* Move literal to BSR */
MOVLB k			<b000000001:9 $k:5>
/* Alias instruction to MOVLB - SELECTB, which accepts full memory address */
SELECTB f		<b000000001:9 $f:5:7>

/* Move literal to PCLATH */
MOVLP k			<b1100011:7 $k:7>

/* Relative branch */
BRA k			<b11001:5 $k:9>

/* Relative branch with W */
BRW				<b00000000001011:14>

/* Call subroutine with W */
CALLW			<b00000000001010:14>

/* Clear watchdog timer */
CLRWDT			<b00000001100100:14>

/* Load OPTION_REG with W */
OPTION			<b00000001100010:14>

/* Reset device */
RESET			<b00000000000001:14>

/* Load TRIS register with W */
TRIS f			<b00000001100:11 $f:3>

/* Add literal k to FSRn */
ADDFSR n k		<b1100010:7 $n:1 $k:6>
