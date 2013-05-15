#!device.syntax
device pic16e.generic extends pic16.generic instructionset microchip.pic16e.instructionset;

operation add(dest : uint8@BRAM, value : uint8){
	MOVLW(value);
	MOVLB(dest->bank);
	MOVWF(dest);
};