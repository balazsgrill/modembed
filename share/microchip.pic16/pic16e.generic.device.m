
/*
 * Implementations of basic operations on enchanced PIC16 core.
 * Multi-byte numbers are little-endians. (Lower byte on lower address)  
 */
device pic16e.generic.device extends pic16.generic.device instructionset microchip.pic16e.instructionset;

pointerSize 2;

operation add(dest : uint8@BRAM, value : uint8){
	MOVLW(value);
	MOVLB(dest->bank);
	ADDWF(dest);
}

operation add(dest : uint8@BRAM, value : uint8@BRAM){
	MOVLB(value->bank);
	MOVF(value, 0);
	MOVLB(dest->bank);
	ADDWF(dest);
}

operation add(dest: uint16@BRAM, v: uint8){
	MOVLW(v);
	MOVLB(dest->bank);
	ADDWF(dest);
	MOVLW(0);
	ADDWFC(dest+1);
}

operation add(dest: uint16@BRAM, v: uint8@BRAM){
	MOVLB(v->bank);
	MOVF(v,0);
	MOVLB(dest->bank);
	ADDWF(dest);
	MOVLW(0);
	ADDWFC(dest+1);
}

operation getbit(value: uint8@BRAM, bit: uint8, dest: boolean@BRAM){
	CLRW();
	MOVLB(value->bank);
	BTFSC(value, bit);
	MOVLW(1);
	MOVLB(dest->bank);
	MOVWF(dest);
}

operation goto(l : label){
	GOTO(l);
}

operation setbit(value: uint8@BRAM, bit: uint8, bvalue: boolean){
	MOVLB(value->bank);
	if (bvalue==1){
		BSF(value, bit);
	}
	if (bvalue==0){
		BCF(value, bit);
	}
}

operation branch(condition: boolean@BRAM, true: label, false: label){
	MOVLB(condition->bank);
	BTFSC(condition, 0);
	GOTO(true);
	GOTO(false);
}

operation set(dest : uint8@BRAM, value : uint8){
	MOVLW(value);
	MOVLB(dest->bank);
	MOVWF(dest);
}

operation set(dest : uint8@BRAM, value : uint8@BRAM){
	MOVLB(value->bank);
	MOVF(value, 0);
	MOVLB(dest->bank);
	MOVWF(dest);
}

operation set(dest : uint16@BRAM, value : uint8){
	MOVLW(value);
	MOVLB(dest->bank);
	MOVWF(dest);
	CLRF(dest+1);
}

operation set(dest : uint16@BRAM, value : uint16){
	MOVLW(value);
	MOVLB(dest->bank);
	MOVWF(dest);
	MOVLW(value>>8);
	MOVWF(dest+1);
}

operation set(dest : uint16@BRAM, value : uint16@BRAM){
	/* Low byte */
	MOVLB(value->bank);
	MOVF(value, 0);
	MOVLB(dest->bank);
	MOVWF(dest);
	
	/* High byte */
	MOVLB(value->bank);
	MOVF(value+1, 0);
	MOVLB(dest->bank);
	MOVWF(dest+1);
}

/* dest = v1>v2 */
operation greater(dest: boolean@BRAM, v1:uint8@BRAM, v2:uint8@BRAM){
	MOVLB(dest->bank);
	CLRF(dest);
	
	MOVLB(v1->bank);
	MOVF(v1, 0);
	MOVLB(v2->bank);
	SUBWF(v2, 0);
	// IF v1>v2 -> C becomes 1
	MOVLB(dest->bank);
	MOVLW(1);
	BTFSC(3, 0); //Test STATUS:C. If not set, skip setting result
	MOVWF(dest);
}

operation greater(dest: boolean@BRAM, v1:uint16@BRAM, v2:uint16@BRAM){
	/* Method:
	 * Check high byte first
	 * Low byte only needs to be checked if high byte equals
	 */
	
	MOVLB(v1->bank);
	MOVF(v1+1, 0);
	MOVLB(v2->bank);
	SUBWF(v2+1, 0);
	// IF v1>v2 -> C becomes 1
	BTFSC(3, 0); //Test STATUS:C. If not set, skip jumping to true (if set, jump to true)
	GOTO(@true);
	
	// IF v1==v0 -> Z becomes 1 
	BTFSS(3,2); //Test STATUS:Z if not set, jump to false
	GOTO(@false);
	
	MOVLB(v1->bank);
	MOVF(v1, 0);
	MOVLB(v2->bank);
	SUBWF(v2, 0);
	
	// IF v1>v2 -> C becomes 1
	BTFSC(3, 0); //Test STATUS:C. If not set, skip jumping to true (if set, jump to true)
	GOTO(@true);
	
	false:
		MOVLB(dest->bank);
		CLRF(dest);	
		GOTO(@end);
	true:
		MOVLW(1);
		MOVLB(dest->bank);
		MOVWF(dest);
	end:
}

operation subtract(dest: uint16@BRAM, value:uint16@BRAM){
	/* 1 : Subtract low byte 
	 * 2 : Subtract high byte with carry */
	
	MOVLB(value->bank);
	MOVF(value);
	MOVLB(dest->bank);
	SUBWF(dest);
	
	MOVLB(value->bank);
	MOVF(value+1);
	MOVLB(dest->bank);
	SUBWFB(dest+1);
}

/* dest = v1<v2 */
operation lower(dest: boolean@BRAM, v1:uint8@BRAM, v2:uint8){
	MOVLB(dest->bank);
	CLRF(dest);
	
	MOVLW(v2);
	MOVLB(v1->bank);
	SUBWF(v1, 0); //v2-v1
	// IF v2>v1 -> C becomes 1
	MOVLB(dest->bank);
	MOVLW(1);
	BTFSC(3, 0); //Test STATUS:C. If not set, skip setting result
	MOVWF(dest);
}

/* dest = v1<v2 */
operation lower(dest: boolean@BRAM, v1:uint8@BRAM, v2:uint8@BRAM){
	MOVLB(dest->bank);
	CLRF(dest);
	
	MOVLB(v2->bank);
	MOVF(v2, 0);
	MOVLB(v1->bank);
	SUBWF(v1, 0); //v2-v1
	// IF v2>v1 -> C becomes 1
	MOVLB(dest->bank);
	MOVLW(1);
	BTFSC(0x3, 0); //Test STATUS:C. If not set, skip setting result
	MOVWF(dest);
}

/*
 * INDF0 = 0x0
 * FSR = 0x4
 */
operation setIndirect(dest: uint16@BRAM, v: uint8@BRAM){
	MOVLB(dest->bank);
	MOVF(dest,0);
	MOVLB(0);
	MOVWF(4);//FSRL
	
	MOVLB(dest->bank);
	MOVF(dest+1,0);
	MOVLB(0);
	MOVWF(5);//FSRH
	
	MOVLB(v->bank);
	MOVF(v,0);
	MOVLB(0);
	MOVWF(0);//IDNF0
}

/*
 * INDF0 = 0x0
 * FSR = 0x4
 */
operation getIndirect(dest: uint16@BRAM, v: uint8@BRAM){
	MOVLB(dest->bank);
	MOVF(dest,0);
	MOVLB(0);
	MOVWF(4);//FSRL
	
	MOVLB(dest->bank);
	MOVF(dest+1,0);
	MOVLB(0);
	MOVWF(5);//FSRH
	
	MOVF(0, 0);//INDF0
	MOVLB(v->bank);
	MOVWF(v);
}