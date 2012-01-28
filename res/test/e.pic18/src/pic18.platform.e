namespace e.platform;

library pic18_platform overrides e::platform{

use e.platform.u16::pic18_platform_u8;

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

}