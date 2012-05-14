library pic16.bankselect;

use microchip.pic16;
use microchip.pic16.enchanced;

annotation bankSelectOptimization;

SELECTB(address f){
	#bankSelectOptimization;
	<b000000001:9 f:5:7>
}