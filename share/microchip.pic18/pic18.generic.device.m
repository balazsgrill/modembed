#!platform:/resource/e.core/syntax/device.syntax.m
device pic18.generic instructionset microchip.pic18.instructionset;

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

operation goto(label : label){
	GOTO(label);
}

operation add(dest: uint8@BRAM, v: uint8){
	MOVLW(v);
	MOVLB(dest->bank);
	ADDWF(dest, 0);
}

operation add(dest: uint8@BRAM, v: uint8@BRAM){
	MOVLB(v->bank);
	MOVF(v,0);
	MOVLB(dest->bank);
	ADDWF(dest, 0);
}

operation set(dest: uint8@BRAM, v: uint8){
	MOVLW(v);
	MOVLB(dest->bank);
	MOVWF(dest);
}

operation set(dest: uint8@BRAM, v: uint8@BRAM){
	MOVFF(v, dest);
}

operation equals(dest: boolean@BRAM, v1: uint8@BRAM, v2: uint8){
	MOVLB(v1->bank);
	MOVF(v1, 0, 0);
	XORLW(v2);
	//TODO equals if W==0
}

/* dest = v1>v2 */
operation greater(dest: boolean@BRAM, v1:uint8@BRAM, v2:uint8@BRAM){
	MOVLB(dest->bank);
	CLRF(dest, 0);
	
	MOVLB(v1->bank);
	MOVF(v1, 0, 0);
	MOVLB(v2->bank);
	SUBWF(v2, 0, 0);
	// IF v1>v2 -> C becomes 1
	MOVLB(dest->bank);
	MOVLW(1);
	BTFSC(0xD8, 0, 1); //Test STATUS:C. If not set, skip setting result
	MOVWF(dest, 0);
}
