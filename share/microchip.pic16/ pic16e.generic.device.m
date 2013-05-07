#!device.syntax
device pic16e.generic extends pic16.generic instructionset microchip.pic16e.instructionset;

operation add(dest : uint8(BRAM@1), value : uint8(0)){
	MOVLW(value);
	MOVLB(dest->bank);
	MOVWF(dest);
};