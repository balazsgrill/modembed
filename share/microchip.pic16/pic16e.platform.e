library pic16e.platform;

use pic16.platform;
use microchip.pic16.enchanced.instructions;

function SELECTB void(const pointer<void> addr) overrides pic16.platform::SELECTB{
	MOVLB(addr/128);
}