library pic18.platform.u8;

use e.platform;
use microchip.pic18;
use microchip.pic18.assisted;

/*
 * dest += v
 */
add_u8(var uint8 dest, uint8 v){
	if(isliteral(v)){
		MOVLW(v);
	}else{
		aMOVF(&v,0);
	}
	aADDWF(&dest);
}

subtract_u8(var uint8 dest, uint8 v){
	if(isliteral(v)){
		MOVLW(v);
	}else{
		aMOVF(&v,0);
	}
	aSUBWF(&dest);
}

set_bool(var bool dest, bool v){
	if(isliteral(v)){
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

/*
 * dest = v
 */
set_u8(var uint8 dest, uint8 v){
	if(isliteral(v)){
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

branch_u8(var uint8 condition, const uint16 true, const uint16 false){
	aMOVF(&condition); //Set Zero bit
	BZ(2);//Branch if zero (jump to false)
	GOTO(true);
	GOTO(false);
}

branch_bool(var bool condition, const uint16 true, const uint16 false){
	aBTFSC(&condition,0);
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
		aCPFSEQ(&d2);
	}else{
		if (isliteral(d2)){
			MOVLW(d2);
		}else{
			aMOVF(&d2,0);
		}
		aCPFSEQ(&d1);
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

