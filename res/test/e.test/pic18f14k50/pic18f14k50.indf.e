namespace e.indirect;

import e.types;
import microchip.pic18;
import microchip.pic18.assisted;
import microchip.PIC18F14K50;

indirect_set(var address dest, uint8 value){
	MOVFF(addr(dest),addr(FSR0L));
	MOVFF(addr(dest)+1,addr(FSR1L));
	if (isliteral(value)){
		MOVLW(value);
		aMOVWF(addr(INDF0));
	}else{
		MOVFF(addr(value), addr(INDF0));
	}
}

indirect_get(var address dest,var uint8 value){
	MOVFF(addr(dest),addr(FSR0L));
	MOVFF(addr(dest)+1,addr(FSR1L));
	MOVFF(addr(INDF0), addr(value));
}
