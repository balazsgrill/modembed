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

subtract_u8(var uint8 dest, uint8 v){
	if(isliteral(v)){
		MOVLW(v);
	}else{
		aMOVF(addr(v),0);
	}
	aSUBWF(addr(dest));
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
		MOVFF(addr(v),addr(dest));
	}
}

branch_u8(var uint8 condition, const uint16 true, const uint16 false){
	aMOVF(addr(condition)); //Set Zero bit
	BZ(2);//Branch if zero (jump to false)
	GOTO(true);
	GOTO(false);
}

branch_bool(var bool condition, const uint16 true, const uint16 false){
	aBTFSC(addr(condition),0);
	GOTO(true);
	GOTO(false);
}

/*
 * dest = (d1 == d2)
 */
isequal_u8(uint8 d1, uint8 d2){
	if (isliteral(d1)){
		MOVLW(d1);
		//d2 garanteed to be variable
		aCPFSEQ(addr(d2));
	}else{
		if (isliteral(d2)){
			MOVLW(d2);
		}else{
			aMOVF(addr(d2),0);
		}
		aCPFSEQ(addr(d1));
	}
	//Skipped if equal
	GOTO(@notequal);
	set_u8(result,1);
	GOTO(@end);
	label notequal;
	set_u8(result,0);
	GOTO(@end);
	label end;
} returns bool result;
