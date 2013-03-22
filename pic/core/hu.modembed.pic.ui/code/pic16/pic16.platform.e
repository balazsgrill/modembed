library pic16.platform;

use microchip.pic16.instructions;
use microchip.pic16.enchanced.instructions;
use e.platform;

function uint8_ASSIGNADD void(var uint8 d, const uint8 v) overrides ASSIGNADD{
	MOVLW(v);
	SELECTB(&d);
	ADDWF(&d);
}

function uint8_ASSIGNADD_v void(var uint8 d, var uint8 v) overrides ASSIGNADD{
	SELECTB(&v);
	MOVF(&v, 0);
	SELECTB(&d);
	ADDWF(&d);
}

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

function uint8_ASSIGNSUBTRACT void(var uint8 d, const uint8 v) overrides ASSIGNSUBTRACT{
	MOVLW(v);
	SELECTB(&d);
	SUBWF(&d);
}

function uint8_ASSIGNSUBTRACT_v void(var uint8 d, const uint8 v) overrides ASSIGNSUBTRACT{
	SELECTB(&v);
	MOVF(&v, 0);
	SELECTB(&d);
	SUBWF(&d);
}

function uint8_ADD uint8(uint8 d, uint8 v) overrides ADD{
	result = d;
	result += v;
}

function uint8_SUBTRACT uint8(uint8 d, uint8 v) overrides MINUS{
	result = d;
	result -= v;
}

function pic16_loop void(lazy do void()) overrides loop{
	label start;
	do();
	GOTO(start);
}