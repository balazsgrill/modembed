binary something hexfile;

use test;

link (
	memwidth = 8;
	pointersize = 12;
	mem 0x00..0xeff;
) {
	lib	pic18.platform;
	link{
		main();
	}
}at 0;
include configuration at 0;