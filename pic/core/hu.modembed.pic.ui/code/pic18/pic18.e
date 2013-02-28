/*
 * PIC18 instruction set 
 */
instructionset microchip.pic18.instructions;

/*
 * Add W to F
 * ADDWF	#f #d=1 #a=1	0010 01 	d1:d0 a1:a0 f8:f0
 */
ADDWF f d=1 a=1		<b0010:4 b01:2 $d:1 $a:1 $f:8>

/*
 * ADDWFC	#f #d=1 #a=1	0010 00 	d1:d0 a1:a0 f8:f0
 */
ADDWFC f d=1 a=1	<b0010:4 b00:2 $d:1 $a:1 $f:8>


/*
 * ANDWF	#f #d=1 #a=1	0001 01 	d1:d0 a1:a0 f8:f0
 */
ANDWF f d=1 a=1		<b0001:4 b01:2 $d:1 $a:1 $f:8>

/*
 * CLRF	#f #a=1			0110 101	a1:a0 f8:f0
 */
CLRF f a=1			<b0110:4 b101:3 $a:1 $f:8>

/*
 * COMF	#f #d=1 #a=1	0001 11		d1:d0 a1:a0 f8:f0
 */
COMF f d=1 a=1		<b0001:4 b11:2 $d:1 $a:1 $f:8>

/*
 * CPFSEQ	#f #a=1			0110 001	a1:a0 f8:f0
 */
CPFSEQ f a=1		<b0110:4 b001:3 $a:1 $f:8>

/*
 * CPFSGT	#f #a=1			0110 010	a1:a0 f8:f0
 */
CPFSGT f a=1		<b0110:4 b010:3 $a:1 $f:8>

/*
 * CPFSLT	#f #a=1			0110 000	a1:a0 f8:f0
 */
CPFSLT f a=1		<b0110:4 b000:3 $a:1 $f:8>

 
/*
 * DECF	#f #d=1 #a=1	0000 01		d1:d0 a1:a0 f8:f0
 */
DECF f d=1 a=1		<b0000:4 b01:2 $d:1 $a:1 $f:8>
 
/*
 * DECFSZ	#f #d=1 #a=1	0010 11		d1:d0 a1:a0 f8:f0
 */
DECFSZ f d=1 a=1	<b0010:4 b11:2 $d:1 $a:1 $f:8>

/*
 * DCFSNZ	#f #d=1 #a=1	0100 11		d1:d0 a1:a0 f8:f0
 */
DCFSNZ f d=1 a=1	<b0100:4 b11:2 $d:1 $a:1 $f:8>

/*
 * INCF	#f #d=1 #a=1	0010 10		d1:d0 a1:a0 f8:f0
 */
INCF f d=1 a=1		<b0010:4 b10:2 $d:1 $a:1 $f:8>

/*
 * INCFSZ	#f #d=1 #a=1	0011 11		d1:d0 a1:a0 f8:f0
 */
INCFSZ f d=1 a=1	<b0011:4 b11:2 $d:1 $a:1 $f:8>

/*
 * INFSNZ	#f #d=1 #a=1	0100 10		d1:d0 a1:a0 f8:f0
 */
INFSNZ f d=1 a=1	<b0100:4 b10:2 $d:1 $a:1 $f:8>
 
 
/*
 * IORWF	#f #d=1 #a=1	0001 00		d1:d0 a1:a0 f8:f0
 */
IORWF f d=1 a=1		<b0001:4 b00:2 $d:1 $a:1 $f:8>
 
 
/*
 * MOVF	#f #d=1 #a=1	0101 00		d1:d0 a1:a0 f8:f0
 */
MOVF f d=1 a=1		<b0101:4 b00:2 $d:1 $a:1 $f:8>
 
 
/*
 * MOVFF	#s #d			1100 f12:s0 1111 f12:d0
 */
 MOVFF s d			<b1100:4 $s:12>	<b1111:4 $d:12>
 
/*
 * MOVWF	#f #a=1			0110 111	a1:a0 f8:f0
 */
MOVWF f a=1			<b0110:4 b111:3 $a:1 $f:8>

 
/*
 * MULWF	#f #a=1			0000 001	a1:a0 f8:f0
 */
MULWF f a=1			<b0000:4 b001:3 $a:1 $f:8>


/*
 * NEGF	#f #a=1			0110 110	a1:a0 f8:f0
 */
NEGF f a=1			<b0110:4 b110:3 $a:1 $f:8>

 
/*
 * RLCF	#f #d=1 #a=1	0011 01		d1:d0 a1:a0 f8:f0
 */
RLCF f d=1 a=1		<b0011:4 b01:2 $d:1 $a:1 $f:8>


/*
 * RLNCF	#f #d=1 #a=1	0100 01		d1:d0 a1:a0 f8:f0
 */
RLNCF f d=1 a=1 	<b0100:4 b01:2 $d:1 $a:1 $f:8>
 
 
/*
 * RRCF	#f #d=1 #a=1	0011 00		d1:d0 a1:a0 f8:f0
 */
RRCF f d=1 a=1	 	<b0011:4 b00:2 $d:1 $a:1 $f:8>
 
 
/*
 * RRNCF	#f #d=1 #a=1	0100 00		d1:d0 a1:a0 f8:f0
 */
RRNCF f d=1 a=1 	<b0100:4 b00:2 $d:1 $a:1 $f:8>

 
/*
 * SETF	#f #a=1			0110 100	a1:a0 f8:f0
 */
SETF f a=1		 	<b0110:4 b100:3 $a:1 $f:8>


/*
 * SUBFWB	#f #d=1 #a=1	0101 01		d1:d0 a1:a0 f8:f0
 */
SUBFWB f d=1 a=1 	<b0101:4 b01:2 $d:1 $a:1 $f:8>
 
 
/*
 * SUBWF	#f #d=1 #a=1	0101 11		d1:d0 a1:a0 f8:f0
 */
SUBWF f d=1 a=1 	<b0101:4 b11:2 $d:1 $a:1 $f:8>
 
 
/*
 * SUBWFB	#f #d=1 #a=1	0101 10		d1:d0 a1:a0 f8:f0
 */
SUBWFB f d=1 a=1 	<b0101:4 b10:2 $d:1 $a:1 $f:8>
 
 
/*
 * SWAPF	#f #d=1 #a=1	0011 10		d1:d0 a1:a0 f8:f0
 */
SWAPF f d=1 a=1 	<b0011:4 b10:2 $d:1 $a:1 $f:8>


/*
 * TSTFSZ	#f #a=1			0110 011	a1:a0 f8:f0
 */
TSTFSZ f a=1	 	<b0110:4 b011:3 $a:1 $f:8>

 
/*
 * XORWF	#f #d=1 #a=1	0001 10		d1:d0 a1:a0 f8:f0
 */
XORWF f d=1 a=1 	<b0001:4 b10:2 $d:1 $a:1 $f:8>

 
/*
 * BCF		#f #b #a=1		1001		b3:b0 a1:a0 f8:f0
 */
BCF f b a=1		 	<b1001:4 b:3 $a:1 $f:8>

 
/*
 * BSF		#f #b #a=1		1000		b3:b0 a1:a0 f8:f0
 */
BSF f b a=1		 	<b1000:4 b:3 $a:1 $f:8>


/*
 * BTFSC	#f #b #a=1		1011		b3:b0 a1:a0 f8:f0
 */
BTFSC f b a=1	 	<b1011:4 b:3 $a:1 $f:8>
 
 
/*
 * BTFSS	#f #b #a=1		1010		b3:b0 a1:a0 f8:f0
 */
BTFSS f b a=1	 	<b1010:4 b:3 $a:1 $f:8>
 
 
/*
 * BTG		#f #b #a=1		0111		b3:b0 a1:a0 f8:f0
 */
BTG f b a=1		 	<b0111:4 b:3 $a:1 $f:8>

 
/*
 * BC		#n				1110 0010	n8:n0
 */
BC n			 	<b1110:4 b0010:4 $n:8>

 
/*
 * BN		#n				1110 0110	n8:n0
 */
BN n			 	<b1110:4 b0110:4 $n:8>


/*
 * BNC		#n				1110 0011	n8:n0
 */
BNC n			 	<b1110:4 b0011:4 $n:8>


/*
 * BNN		#n				1110 0111	n8:n0
 */
BNN n			 	<b1110:4 b0111:4 $n:8>


/*
 * BNOV	#n				1110 0101	n8:n0
 */
BNOV n			 	<b1110:4 b0101:4 $n:8>
 
 
/*
 * BNZ		#n				1110 0001	n8:n0
 */
BNZ n			 	<b1110:4 b0001:4 $n:8>
 
 
/*
 * BOV		#n				1110 0100	n8:n0
 */
BOV n			 	<b1110:4 b0100:4 $n:8>
 
 
/*
 * BRA		#n				1101 0 		n11:n0
 */
BRA n			 	<b11010:5 $n:11>
 
 
/*
 * BZ		#n				1110 0000	n8:n0
 */
BZ n			 	<b1110:4 b0000:4 $n:8>
  
 
/*
 * CALL	#c #s=1			1110 110 s1:s0 c8:c0 1111 c12:c8
 */
CALL c s=1			<b1110:4 b110:3 $s:1 $c:8> <b1111:4 $c:12:8>


/*
 * CLRWDT	0000 0000 0000 0100
 */
CLRWDT				<b0000:4 b0000:4 b0000:4 b0100:4>
 
 
/*
 * DAW		0000 0000 0000 0111
 */
DAW					<b0000:4 b0000:4 b0000:4 b0111:4>
  
 
/*
 * GOTO	#c			1110 1111 c8:c0 1111 c12:c8
 */
GOTO c				<b1110:4 b1111:4 $c:8> <b1111:4 $c:12:8>


/* NOP		0000 0000 0000 0000 */
NOP					<0:16>


/*
 * POP	0000 0000 0000 0110
 */
POP					<b0000:4 b0000:4 b0000:4 b0110:4>
  
 
/*
 * PUSH	0000 0000 0000 0101
 */
PUSH				<b0000:4 b0000:4 b0000:4 b0101:4>
  
 
/*
 * RCALL	#n	1101 1		n11:n0
 */
RCALL n				<b11010:5 $n:11>
 
 
/*
 * RESET	0000 0000 1111 1111
 */
RESET				<b0000:4 b0000:4 b1111:4 b1111:4>

 
/*
 * RETFIE	#s=1	0000 0000 0001 000 s1:s0
 */
RETFIE s=1			<b0000:4 b0000:4 b0001:4 b000:3 $s:1>
  
 
/*
 * RETLW	#k		0000 1100	k8:k0
 */
RETLW k				<b0000:4 b1100:4 $k:8>

 
/*
 * RETURN	#s=1	0000 0000 0001 001 s1:s0
 */
RETURN s=1			<b0000:4 b0000:4 b0001:4 b001:3 $s:1>

 
/*
 * SLEEP	0000 0000 0000 0011
 */
SLEEP				<b0000:4 b0000:4 b0000:4 b0011:4>
   
 
/*
 * ADDLW	#k		0000 1111	k8:k0
 */
ADDLW k				<b0000:4 b1111:4 $k:8>

 
/*
 * ANDLW	#k		0000 1011	k8:k0
 */
ANDLW k				<b0000:4 b1011:4 $k:8>
 
 
/*
 * IORLW	#k		0000 1001	k8:k0
 */
IORLW k				<b0000:4 b1001:4 $k:8>
 
 
/*
 * LFSR	#f #k	1110 1110 00 f2:f0 k4:k0 1111 0000 k8:k4
 */
LFSR f k			<b1110:4 b1110:4 b00:2 $f:2 $k:4> <b1111:4 b0000:4 $k:8:4>
 
 
/*
 * MOVLB	#k		0000 0001 0000 k4:k0
 */
MOVLB k				<b0000:4 b0001:4 b0000:4 $k:4>
  
 
/*
 * SELECTB	#k		0000 0001 0000 k4:k8
 */
SELECTB f			<b0000:4 b0001:4 b0000:4 $f:4:8>
  
 
/*
 * MOVLW	#k		0000 1110 k8:k0
 */
MOVLW k				<b0000:4 b1110:4 $k:8>


/*
 * MULLW	#k		0000 1101 k8:k0
 */
MULLW k				<b0000:4 b1101:4 $k:8>
 
 
/*
 * SUBLW	#k		0000 1000 k8:k0
 */
SUBLW k				<b0000:4 b1000:4 $k:8>
 
 
/*
 * XORLW	#k		0000 1010 k8:k0
 */
XORLW k				<b0000:4 b1010:4 $k:8>


