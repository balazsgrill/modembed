#!device.syntax
device pic16e.generic extends pic16.generic instructionset microchip.pic16e.instructionset;

operation add(dest : uint8@BRAM, value : uint8){
	MOVLW(value);
	MOVLB(dest->bank);
	MOVWF(dest);
};

operation getbit(value: uint8@BRAM, bit: uint8, dest: boolean@BRAM){
	CLRW();
	MOVLB(value->bank);
	BTFSC(value, bit);
	MOVLW(1);
	MOVLB(dest->bank);
	MOVWF(dest);
}