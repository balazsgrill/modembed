namespace e.platform;

import e.types;
import e.platform.u8;
import e.platform.u16;
import microchip.pic18;

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
	GOTO
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