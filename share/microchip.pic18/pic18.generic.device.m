device pic18.generic instructionset microchip.pic18.instructionset;

pointerSize 2;

mtype program ROM(8);

mtype volatile data BRAM(2) { bank; };

operation getbit(value: uint8@BRAM, bit: uint8, dest: boolean@BRAM){
	MOVLW(0);
	MOVLB(value->bank);
	BTFSC(value, bit, 0);
	MOVLW(1);
	MOVLB(dest->bank);
	MOVWF(dest, 0);
}

operation branch(condition: boolean@BRAM, true: label, false: label){
	MOVLB(condition->bank);
	BTFSC(condition, 0, 0);
	GOTO(true);
	GOTO(false);
}

operation setbit(value: uint8@BRAM, bit: uint8, bvalue: boolean){
	MOVLB(value->bank);
	if (bvalue==1){
		BSF(value, bit, 0);
	}
	if (bvalue==0){
		BCF(value, bit, 0);
	}
}

operation goto(l : label){
	GOTO(l);
}

operation add(dest: uint8@BRAM, v: uint8){
	MOVLW(v);
	MOVLB(dest->bank);
	ADDWF(dest, 1, 0);
}

operation add(dest: uint8@BRAM, v: uint8@BRAM){
	MOVLB(v->bank);
	MOVF(v,0);
	MOVLB(dest->bank);
	ADDWF(dest, 1, 0);
}

operation add(dest: uint16@BRAM, v: uint8){
	MOVLW(v);
	MOVLB(dest->bank);
	ADDWF(dest, 1, 0);
	MOVLW(0);
	ADDWFC(dest, 1, 0);
}

operation add(dest: uint16@BRAM, v: uint8@BRAM){
	MOVLB(v->bank);
	MOVF(v,0);
	MOVLB(dest->bank);
	ADDWF(dest, 1, 0);
	MOVLW(0);
	ADDWFC(dest, 1, 0);
}

operation set(dest: uint8@BRAM, v: uint8){
	MOVLW(v);
	MOVLB(dest->bank);
	MOVWF(dest, 0);
}

operation set(dest: uint8@BRAM, v: uint8@BRAM){
	MOVFF(v, dest);
}

operation set(dest: boolean@BRAM, v: boolean@BRAM){
	MOVFF(v, dest);
}

operation equals(dest: boolean@BRAM, v1: uint8@BRAM, v2: uint8){
	MOVLB(v1->bank);
	MOVF(v1, 0, 0);
	XORLW(v2);
	//TODO equals if W==0
}

operation set(dest: uint16@BRAM, v:uint16){
	MOVLW(v);
	MOVLB(dest->bank);
	MOVWF(dest, 0);
	MOVLW(v>>8);
	MOVWF(dest+1, 0);
}

operation set(dest: uint16@BRAM, value: uint16@BRAM){
	MOVFF(value, dest);
	MOVFF(value+1, dest+1);
}

/* dest = v1<v2 */
operation lower(dest: boolean@BRAM, v1:uint8@BRAM, v2:uint8){
	MOVLB(dest->bank);
	CLRF(dest, 0);
	
	MOVLW(v2);
	MOVLB(v1->bank);
	SUBWF(v1, 0, 0); //v2-v1
	// IF v2>v1 -> C becomes 1
	MOVLB(dest->bank);
	MOVLW(1);
	BTFSC(0xD8, 0, 1); //Test STATUS:C. If not set, skip setting result
	MOVWF(dest, 0);
}

/* dest = v1<v2 */
operation lower(dest: boolean@BRAM, v1:uint8@BRAM, v2:uint8@BRAM){
	MOVLB(dest->bank);
	CLRF(dest, 0);
	
	MOVLB(v2->bank);
	MOVF(v2, 0, 0);
	MOVLB(v1->bank);
	SUBWF(v1, 0, 0); //v2-v1
	// IF v2>v1 -> C becomes 1
	MOVLB(dest->bank);
	MOVLW(1);
	BTFSC(0xD8, 0, 1); //Test STATUS:C. If not set, skip setting result
	MOVWF(dest, 0);
}

/* dest = v1>v2 */
operation greater(dest: boolean@BRAM, v1:uint8@BRAM, v2:uint8@BRAM){
	MOVLB(dest->bank);
	CLRF(dest, 0);
	
	MOVLB(v1->bank);
	MOVF(v1, 0, 0);
	MOVLB(v2->bank);
	SUBWF(v2, 0, 0); //v1-v2
	// IF v1>v2 -> C becomes 1
	MOVLB(dest->bank);
	MOVLW(1);
	BTFSC(0xD8, 0, 1); //Test STATUS:C. If not set, skip setting result
	MOVWF(dest, 0);
}

operation greater(dest: boolean@BRAM, v1:uint16@BRAM, v2:uint16@BRAM){
	/* Method:
	 * Check high byte first
	 * Low byte only needs to be checked if high byte equals
	 */
	
	MOVLB(v1->bank);
	MOVF(v1+1, 0, 0);
	MOVLB(v2->bank);
	SUBWF(v2+1, 0, 0);
	// IF v1>v2 -> C becomes 1
	BTFSC(0xD8, 0, 1); //Test STATUS:C. If not set, skip jumping to true (if set, jump to true)
	GOTO(@true);
	
	// IF v1==v0 -> Z becomes 1 
	BTFSS(0xD8,2, 1); //Test STATUS:Z if not set, jump to false
	GOTO(@false);
	
	MOVLB(v1->bank);
	MOVF(v1, 0, 0);
	MOVLB(v2->bank);
	SUBWF(v2, 0, 0);
	
	// IF v1>v2 -> C becomes 1
	BTFSC(0xD8, 0, 1); //Test STATUS:C. If not set, skip jumping to true (if set, jump to true)
	GOTO(@true);
	
	false:
		MOVLB(dest->bank);
		CLRF(dest, 0);	
		GOTO(@end);
	true:
		MOVLW(1);
		MOVLB(dest->bank);
		MOVWF(dest, 0);
	end:
}

operation subtract(dest: uint16@BRAM, value:uint16@BRAM){
	/* 1 : Subtract low byte 
	 * 2 : Subtract high byte with carry */
	
	MOVLB(value->bank);
	MOVF(value, 0);
	MOVLB(dest->bank);
	SUBWF(dest, 1, 0);
	
	MOVLB(value->bank);
	MOVF(value+1, 0);
	MOVLB(dest->bank);
	SUBWFB(dest+1, 1, 0);
}

/*
 * INDF0 = 0xFEF
 * FSRL = 0xFE9
 * FSRH = 0xFEA
 */
operation setIndirect(dest: uint16@BRAM, v: uint8@BRAM){
	MOVFF(dest, 0xFE9);
	MOVFF(dest+1, 0xFEA);
	MOVFF(v, 0xFEF);
}

/*
 * INDF0 = 0xFEF
 * FSRL = 0xFE9
 * FSRH = 0xFEA
 */
operation getIndirect(dest: uint16@BRAM, v: uint8@BRAM){
	MOVFF(dest, 0xFE9);
	MOVFF(dest+1, 0xFEA);
	MOVFF(0xFEF, v);
}