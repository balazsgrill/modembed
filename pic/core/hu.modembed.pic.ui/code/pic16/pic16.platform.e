library pic16.platform overrides e.platform;

use e.platform;
use microchip.pic16;
use microchip.pic16.enchanced;
use pic16.bankselect;

/*
 * Core STATUS register
 */
reg uint8 STATUS : 0x03;
const bit Z = 2;

subtract_u8(var uint8 d, uint8 v){
	if (isliteral(v)){
		MOVLW(v);
	}else{
		SELECTB(&v);
		MOVF(&v,W);	
	}
	SELECTB(&d);
	SUBWF(&d,F);
}

add_u8(var uint8 d, uint8 v){
	if (isliteral(v)){
		MOVLW(v);
	}else{
		SELECTB(&v);
		MOVF(&v,W);	
	}
	SELECTB(&d);
	ADDWF(&d,F);
}

set_u8 (var uint8 d, uint8 v){
	if (isliteral(v)){
		if (0 == v){
			SELECTB(&d);
			CLRF(&d);
		}else{
			MOVLW(v);
			SELECTB(&d);
			MOVWF(&d);
		}
	}else{
		SELECTB(&v);
		MOVF(&v,W);
		SELECTB(&d);
		MOVWF(&d);
	}
}

equals_u8(uint8 d1, uint8 d2){
	if (isliteral(d1)){
		// d2 cannot be literal
		MOVLW(d1);
		SELECTB(&d2);
		SUBWF(&d2,W);
	}else{
		if (isliteral(d2)){
			MOVLW(d2);	
		}else{
			SELECTB(&d2);
			MOVF(&d2,W);	
		}
		SELECTB(&d1);
		SUBWF(&d1,W);
	}
	//no need to select bank before using status
	//we can select bank for result in advance
	SELECTB(&result);
	BCF(&result,0);
	BTFSS(&STATUS,Z);
	//This is skipped if ZERO (d1 and d2 equals):
	GOTO(false);
	BSF(&result,0);
	label false;
} returns bool result;

branch_bool(var bool condition, const codeaddr true, const codeaddr false){
	SELECTB(&condition);
	BTFSC(&condition, 0);
	GOTO(true);
	GOTO(false);
}

operator UC_GOTO{
	GOTO
}

operator BRANCH{
	branch_bool
}

operator EQUALS{
	equals_u8
}

operator ADD{
	add_u8
}

operator SUBTRACT{
	subtract_u8
}

operator SET{
	set_u8
}