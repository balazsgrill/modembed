library pic18.platform;

use microchip.pic18.instructions;
use e.platform;

function uint8_ADD_l void(var uint8 dest, const uint8 v) overrides ADD{
	MOVLW(v);
	SELECTB(&dest);
	ADDWF(&dest);
}

function uint8_ADD_v void(var uint8 dest, var uint8 v) overrides ADD{
	SELECTB(&v);
	MOVF(&v,0);
	SELECTB(&dest);
	ADDWF(&dest);
}

function uint8_ASSIGN_l void(var uint8 dest, const uint8 v) overrides ASSIGN{
	MOVLW(v);
	SELECTB(&dest);
	MOVWF(&dest);
}

function uint8_ASSIGN_v void(var uint8 dest, var uint8 v) overrides ASSIGN{
	MOVFF(&v, &dest);
}