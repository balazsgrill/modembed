#!platform:/resource/e.core/syntax/device.syntax.m
/*
 * Implementations of basic operations on enchanced PIC16 core.
 * Multi-byte numbers are big-endians. (Lower byte on lower address)  
 */
device pic16e.generic.device extends pic16.generic.device instructionset microchip.pic16e.instructionset;

operation add(dest : uint8@BRAM, value : uint8){
	MOVLW(value);
	MOVLB(dest->bank);
	MOVWF(dest);
}

operation getbit(value: uint8@BRAM, bit: uint8, dest: boolean@BRAM){
	CLRW();
	MOVLB(value->bank);
	BTFSC(value, bit);
	MOVLW(1);
	MOVLB(dest->bank);
	MOVWF(dest);
}

operation goto(label : label){
	GOTO(label);
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
	BTFSC(condition);
	GOTO(true);
	GOTO(false);
}

operation set(dest : uint8@BRAM, value : uint8){
	MOVLW(value);
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
	MOVLB(dest->bank);
	CLRF(dest);
	
	
}