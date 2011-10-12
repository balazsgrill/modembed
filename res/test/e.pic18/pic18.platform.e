namespace e.platform;

import e.types;
import e.platform.u8;
import e.platform.u16;

operator ADD{
	add_u8,
	add_u16_u8,
	add_u16_u16
}

operator BRANCH{
	branch_u8
}

operator SET{
	set_u8,
	set_u16_u8,
	set_u16_u16
}
