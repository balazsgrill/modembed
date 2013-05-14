#!device.syntax
device pic16.generic instructionset microchip.pic16.instructionset;

mtype program ROM(8);

mtype volatile data RAM(1);

mtype volatile data BRAM(2) { bank; };

operation add(dest : uint8@RAM, value : uint8){
	MOVLW(value);
	ADDWF(dest);
};

operation set(dest : uint8@RAM, value : uint8){
	MOVLW(value);
	MOVWF(dest);
};
