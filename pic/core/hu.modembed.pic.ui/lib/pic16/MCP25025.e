/*
 * Library for MCP25025
 * 
 * Architecture: 16xxxx
 */
library microchip.MCP25025{

	use e.platform;
	use microchip.pic16;

/*************************
 * Configuration
 ************************/
 

	const codeaddr configStartAddress = 0x2007
	/*
	 * Field: OSC
	 * Oscillator
	 */
		/* HS */
		const uint16 CONFIG_OSC_ = 0x3*1;
		/* Reserved */
		const uint16 CONFIG_OSC_ = 0x2*1;
		/* XT */
		const uint16 CONFIG_OSC_ = 0x1*1;
		/* LP */
		const uint16 CONFIG_OSC_ = 0x0*1;
	/*
	 * Field: RSTEN
	 * Reset on GP7 Enable Bit
	 */
		/* Reset enabled on GP7 I/O pin */
		const uint16 CONFIG_RSTEN_ = 0x1*4;
		/* GP7 is general I/O */
		const uint16 CONFIG_RSTEN_ = 0x0*4;

/********************
 * Special function registers
 ********************/

}
