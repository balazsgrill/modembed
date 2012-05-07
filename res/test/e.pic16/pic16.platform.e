library pic16.platform overrides e.platform;

use e.platform;
use microchip.pic16;
use microchip.pic16.enchanced;
use pic16.bankselect;


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

operator SET{
	set_u8
}