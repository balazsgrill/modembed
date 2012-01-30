namespace microchip.pic18f14k50;

library indirection{

use e::platform;
use microchip.pic18::pic18;
use microchip.pic18.assisted::pic18_assisted;
use microchip.PIC18F14K50::device;

type HWPointer = struct{
	address pointerreg,
	address valuereg
}

type HWPID = unsigned 2 bits;

const HWPID HWP0 = 0;
const HWPID HWP1 = 1;
const HWPID HWP2 = 2;

type HWPointerConfig = array [3] of HWPointer

const HWPointerConfig pointers = HWPointerConfig{
	HWPointer{&FSR0, &INDF0},
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

}
