#!platform:/resource/e.core/syntax/device.syntax.m
device pic18.generic instructionset microchip.pic18.instructionset;

mtype program ROM(8);

mtype volatile data BRAM(2) { bank; };

operation getbit(value: uint8@BRAM, bit: uint8, dest: boolean@BRAM){
	MOVLW(0);
	MOVLB(value->bank);
	BTFSC(value, bit);
	MOVLW(1);
	MOVLB(dest->bank);
	MOVWF(dest);
}

operation branch(condition: boolean@BRAM, true: label, false: label){
	MOVLB(condition->bank);
	BTFSC(condition);
	GOTO(true);
	GOTO(false);
}

operation setbit(value: uint8@BRAM, bit: uint8, bvalue: boolean){
	MOVLB(value->bank);
	MOVLW(bvalue);
	BRW(); // Skip if set
	BCF(value, bit);
	XORLW(1); // Toggle W
	BRW();
	BSF(value, bit);
}

operation goto(label : label){
	GOTO(label);
}

operation add(dest: uint8@BRAM, v: uint8){
	MOVLW(v);
	MOVLB(dest->bank);
	ADDWF(dest);
}

operation add(dest: uint8@BRAM, v: uint8@BRAM){
	MOVLB(v->bank);
	MOVF(v,0);
	MOVLB(dest->bank);
	ADDWF(dest);
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
	MOVF(v1, 0);
	XORLW(v2);
	//TODO equals if W==0
}
