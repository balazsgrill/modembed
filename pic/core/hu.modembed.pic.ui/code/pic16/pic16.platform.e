library pic16.platform;

use microchip.pic16.instructions;
use microchip.pic16.enchanced.instructions;
use e.platform;

function uint8_ASSIGN void(var uint8 d, const uint8 v) overrides ASSIGN{
	MOVLW(v);
	SELECTB(&d);
	MOVWF(&d);
}

function uint8_ASSIGN_v void(var uint8 d, var uint8 v) overrides ASSIGN{
	SELECTB(&v);
	MOVF(&v, 0);
	SELECTB(&d);
	MOVWF(&d);
}