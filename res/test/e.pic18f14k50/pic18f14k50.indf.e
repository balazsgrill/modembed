namespace e.indirect;

import e.types;
import microchip.pic18;
import microchip.pic18.assisted;
import microchip.PIC18F14K50;

type HWPointer = struct{
	address pointerreg,
	address valuereg
}

type HWPID = unsigned 2 bits;

const HWPID HWP0 = 0;
const HWPID HWP1 = 1;
const HWPID HWP2 = 2;

type HWPointerConfig = HWPointer[3];

const HWPointerConfig pointers = HWPointerConfig{
	HWPointer{addr(FSR0), addr(INDF0)},
	HWPointer{addr(FSR1), addr(INDF1)},
	HWPointer{addr(FSR2), addr(INDF2)}
};

indirect_set(var address dest, uint8 value){
	MOVFF(addr(dest),addr(FSR0L));
	MOVFF(addr(dest)+1,addr(FSR0H));
	if (isliteral(value)){
		MOVLW(value);
		aMOVWF(addr(INDF0));
	}else{
		MOVFF(addr(value), addr(INDF0));
	}
}

indirect_get(var address dest,var uint8 value){
	MOVFF(addr(dest),addr(FSR0L));
	MOVFF(addr(dest)+1,addr(FSR0H));
	MOVFF(addr(INDF0), addr(value));
}
