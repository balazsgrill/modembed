library pic18.platform.u16;

use e.platform;
use microchip.pic18;
use microchip.pic18.assisted;

add_u16_u8(var uint16 dest, uint8 v){
	if (isliteral(v)){
		MOVLW(v);
	}else{
		aMOVF(&v,0);
	}
	aADDWF(&dest);
	MOVLW(0);
	aADDWFC((&dest)+1);
}

add_u16_u16(var uint16 dest, uint16 v){
	if (isliteral(v)){
		MOVLW(v);
	}else{
		aMOVF(&v,0);
	}
	aADDWF(&dest);
	if (isliteral(v)){
		MOVLW(v/256);
	}else{
		aMOVF((&v)+1,0);
	}
	aADDWFC(&dest+1);
}

set_u16_u8(var uint16 dest, uint8 v){
	aCLRF((&dest)+1);
	if (isliteral(v)){
		if (v == 0){
			aCLRF(&dest);
		}else{
			if (v == 0xFF){
				aSETF(&dest);
			}else{
				MOVLW(v);
				aMOVWF(&dest);
			}
		}
	}else{
		MOVFF(&v,&dest);
	}
}

set_u16_u16(var uint16 dest, uint16 v){
	if (isliteral(v)){
		if (v%0xFF == 0){
			aCLRF(&dest);
		}else{
			if (v%0xFF == 0xFF){
				aSETF(&dest);
			}else{
				MOVLW(v%0xFF);
				aMOVWF(&dest);
			}
		}
		if (v/0xFF == 0){
			aCLRF(&dest);
		}else{
			if (v/0xFF == 0xFF){
				aSETF(&dest);
			}else{
				MOVLW(v/0xFF);
				aMOVWF(&dest);
			}
		}
	}else{
		MOVFF(&v,&dest);
		MOVFF((&v)+1,(&dest)+1);
	}
}
