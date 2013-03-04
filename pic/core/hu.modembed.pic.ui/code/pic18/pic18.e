/*
 * PIC18 instruction set 
 */
instructionset microchip.pic18.instructions;

ADDWF f d=1 a=1		<b0010:4 b01:2 $d:1 $a:1 $f:8>
ADDWFC f d=1 a=1	<b0010:4 b00:2 $d:1 $a:1 $f:8>
ANDWF f d=1 a=1		<b0001:4 b01:2 $d:1 $a:1 $f:8>
CLRF f a=1			<b0110:4 b101:3 $a:1 $f:8>
COMF f d=1 a=1		<b0001:4 b11:2 $d:1 $a:1 $f:8>
CPFSEQ f a=1		<b0110:4 b001:3 $a:1 $f:8>
CPFSGT f a=1		<b0110:4 b010:3 $a:1 $f:8>
CPFSLT f a=1		<b0110:4 b000:3 $a:1 $f:8>
DECF f d=1 a=1		<b0000:4 b01:2 $d:1 $a:1 $f:8>
DECFSZ f d=1 a=1	<b0010:4 b11:2 $d:1 $a:1 $f:8>
DCFSNZ f d=1 a=1	<b0100:4 b11:2 $d:1 $a:1 $f:8>
INCF f d=1 a=1		<b0010:4 b10:2 $d:1 $a:1 $f:8>
INCFSZ f d=1 a=1	<b0011:4 b11:2 $d:1 $a:1 $f:8>
INFSNZ f d=1 a=1	<b0100:4 b10:2 $d:1 $a:1 $f:8>
IORWF f d=1 a=1		<b0001:4 b00:2 $d:1 $a:1 $f:8>
MOVF f d=1 a=1		<b0101:4 b00:2 $d:1 $a:1 $f:8>
MOVFF s d			<b1100:4 $s:12>	<b1111:4 $d:12>
MOVWF f a=1			<b0110:4 b111:3 $a:1 $f:8>
MULWF f a=1			<b0000:4 b001:3 $a:1 $f:8>
NEGF f a=1			<b0110:4 b110:3 $a:1 $f:8>
RLCF f d=1 a=1		<b0011:4 b01:2 $d:1 $a:1 $f:8>
RLNCF f d=1 a=1 	<b0100:4 b01:2 $d:1 $a:1 $f:8>
RRCF f d=1 a=1	 	<b0011:4 b00:2 $d:1 $a:1 $f:8>
RRNCF f d=1 a=1 	<b0100:4 b00:2 $d:1 $a:1 $f:8>
SETF f a=1		 	<b0110:4 b100:3 $a:1 $f:8>
SUBFWB f d=1 a=1 	<b0101:4 b01:2 $d:1 $a:1 $f:8>
SUBWF f d=1 a=1 	<b0101:4 b11:2 $d:1 $a:1 $f:8>
SUBWFB f d=1 a=1 	<b0101:4 b10:2 $d:1 $a:1 $f:8>
SWAPF f d=1 a=1 	<b0011:4 b10:2 $d:1 $a:1 $f:8>
TSTFSZ f a=1	 	<b0110:4 b011:3 $a:1 $f:8>
XORWF f d=1 a=1 	<b0001:4 b10:2 $d:1 $a:1 $f:8>
BCF f b a=1		 	<b1001:4 $b:3 $a:1 $f:8>
BSF f b a=1		 	<b1000:4 $b:3 $a:1 $f:8>
BTFSC f b a=1	 	<b1011:4 $b:3 $a:1 $f:8>
BTFSS f b a=1	 	<b1010:4 $b:3 $a:1 $f:8>
BTG f b a=1		 	<b0111:4 $b:3 $a:1 $f:8>
BC n			 	<b1110:4 b0010:4 $n:8>
BN n			 	<b1110:4 b0110:4 $n:8>
BNC n			 	<b1110:4 b0011:4 $n:8>
BNN n			 	<b1110:4 b0111:4 $n:8>
BNOV n			 	<b1110:4 b0101:4 $n:8>
BNZ n			 	<b1110:4 b0001:4 $n:8>
BOV n			 	<b1110:4 b0100:4 $n:8>
BRA n			 	<b11010:5 $n:11>
BZ n			 	<b1110:4 b0000:4 $n:8>
CALL c s=1			<b1110:4 b110:3 $s:1 $c:8> <b1111:4 $c:12:8>
CLRWDT				<b0000:4 b0000:4 b0000:4 b0100:4>
DAW					<b0000:4 b0000:4 b0000:4 b0111:4>
GOTO c				<b1110:4 b1111:4 $c:8> <b1111:4 $c:12:8>
NOP					<0:16>
POP					<b0000:4 b0000:4 b0000:4 b0110:4>
PUSH				<b0000:4 b0000:4 b0000:4 b0101:4>
RCALL n				<b11010:5 $n:11>
RESET				<b0000:4 b0000:4 b1111:4 b1111:4>
RETFIE s=1			<b0000:4 b0000:4 b0001:4 b000:3 $s:1>
RETLW k				<b0000:4 b1100:4 $k:8>
RETURN s=1			<b0000:4 b0000:4 b0001:4 b001:3 $s:1>
SLEEP				<b0000:4 b0000:4 b0000:4 b0011:4>
ADDLW k				<b0000:4 b1111:4 $k:8>
ANDLW k				<b0000:4 b1011:4 $k:8>
IORLW k				<b0000:4 b1001:4 $k:8>
LFSR f k			<b1110:4 b1110:4 b00:2 $f:2 $k:4> <b1111:4 b0000:4 $k:8:4>
MOVLB k				<b0000:4 b0001:4 b0000:4 $k:4>
SELECTB f			<b0000:4 b0001:4 b0000:4 $f:4:8>
MOVLW k				<b0000:4 b1110:4 $k:8>
MULLW k				<b0000:4 b1101:4 $k:8>
SUBLW k				<b0000:4 b1000:4 $k:8>
XORLW k				<b0000:4 b1010:4 $k:8>
