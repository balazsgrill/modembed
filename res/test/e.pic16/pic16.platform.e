library pic16.platform overrides e.platform;

use e.platform;
use microchip.pic16;
use microchip.pic16.enchanced;

set_u8 (var uint8 d, uint8 v){
	if (isliteral(v)){
		if (0 == v){
			CLRF(&d);
		}else{
			MOVLW(v);
			MOVWF(&d);
		}
	}else{
		MOVF(&v,W);
		MOVWF(&d);
	}
}

operator SET{
	set_u8
}