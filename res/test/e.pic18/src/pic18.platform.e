library pic18.platform overrides e.platform;

use pic18.platform.u16;
use pic18.platform.u8;
use microchip.pic18.assisted;

operator ADD{
	add_u8,
	add_u16_u8,
	add_u16_u16
}

operator SUBTRACT{
	subtract_u8
}

operator BRANCH{
	branch_u8,
	branch_bool
}

operator UC_GOTO{
	aGOTO
}

operator SET{
	set_bool,
	set_u8,
	set_u16_u8,
	set_u16_u16
}

operator EQUALS{
	isequal_u8
}
