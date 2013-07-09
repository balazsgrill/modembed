#!platform:/resource/e.core/syntax/device.syntax.m
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
	MOVLW(bvalue);
	BRW(); // Skip if set
	BCF(value, bit);
	XORLW(1); // Toggle W
	BRW();
	BSF(value, bit);
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
	MOVLW(dest<-8);
}