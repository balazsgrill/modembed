namespace e.platform.u8;

import e.types;
import microchip.pic18;
import microchip.pic18.assisted;

/*
 * dest += v
 */
add_u8(var uint8 dest, uint8 v){
	if(isliteral(v)){
		MOVLW(v);
	}else{
		aMOVF(addr(v),0);
	}
	aADDWF(addr(dest));
}

/*
 * dest = v
 */
set_u8(var uint8 dest, uint8 v){
	if(isliteral(v)){
		if (v == 0){
			aCLRF(addr(dest));
		}else{
			if (v == 0xFF){
				aSETF(addr(dest));
			}else{
				MOVLW(v);
				aMOVWF(addr(dest));
			}
		}
	}else{
		MOVFF(addr(dest),addr(v));
	}
}

branch_u8(var uint8 condition, const uint16 true, const uint16 false){
	aMOVF(addr(condition)); //Set Zero bit
	BZ(2);//Branch if zero (jump to false)
	GOTO(true);
	GOTO(false);
}

/*
 * dest = (d1 == d2)
 */
isequal_u8(var bool dest, uint8 d1, uint8 d2){
	uint8 v;
	set_u8(v,d2);
	if (isliteral(d1)){
		MOVLW(d1);
	}else{
		aMOVF(addr(d1),0);
	}
	aSUBWF(addr(v));
	//TODO: test if zero
}
