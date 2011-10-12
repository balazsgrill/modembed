namespace e.platform.u16;

import e.types;
import microchip.pic18;
import microchip.pic18.assisted;
import e.platform.u8;

add_u16_u8(var uint16 dest, uint8 v){
	if (isliteral(v)){
		MOVLW(v);
	}else{
		aMOVF(addr(v),0);
	}
	aADDWF(addr(dest));
	MOVLW(0);
	aADDWFC(addr(dest)+1);
}

add_u16_u16(var uint16 dest, uint16 v){
	if (isliteral(v)){
		MOVLW(v);
	}else{
		aMOVF(addr(v),0);
	}
	aADDWF(addr(dest));
	if (isliteral(v)){
		MOVLW(v/256);
	}else{
		aMOVF(addr(v)+1,0);
	}
	aADDWFC(addr(dest)+1);
}

set_u16_u8(var uint16 dest, uint8 v){
	aCLRF(addr(dest)+1);
	if (isliteral(v)){
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
		MOVFF(addr(v),addr(dest));
	}
}

set_u16_u16(var uint16 dest, uint16 v){
	if (isliteral(v)){
		if (v%0xFF == 0){
			aCLRF(addr(dest));
		}else{
			if (v%0xFF == 0xFF){
				aSETF(addr(dest));
			}else{
				MOVLW(v%0xFF);
				aMOVWF(addr(dest));
			}
		}
		if (v/0xFF == 0){
			aCLRF(addr(dest));
		}else{
			if (v/0xFF == 0xFF){
				aSETF(addr(dest));
			}else{
				MOVLW(v/0xFF);
				aMOVWF(addr(dest));
			}
		}
	}else{
		MOVFF(addr(v),addr(dest));
		MOVFF(addr(v)+1,addr(dest)+1);
	}
}
