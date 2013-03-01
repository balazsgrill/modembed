workflow compile;

/*
 * Integrate libraries
 */
compiler.integrate{
	input = blink.main
	input = e.platform
	input = microchip.PIC16F1824
	input = pic16.platform
	output = blink.l3
}

/*
 * Resolve abstract function calls
 */
compiler.resolve{
	input = blink.l3
	output = blink.l2
}

/*
 * Flatten program
 */
compiler.flatten{
	input = blink.l2
	output = blink.l1
	entry = "main"
}

/*
 * Map variables to memory
 */
compiler.map{
	input = blink.l1
	output = blink.l0
	entry = "main"
	architecture = PIC16F1824.arch
}

/*
 * Convert to Assembler
 */
compiler.toasm{
	input = blink.l0
	entry = "main"
	output = blink.asm
}

/*
 * Assemble to binary
 */
hex.assemble{
	input = blink.asm
	output = "blink.hex"
	architecture = PIC16F1824.arch
}

/*
 * Convert PIC configuration bits to binary
 */
pic.config.tohex{
	input = blink.config
	output = "config.hex"
}

/*
 * Insert configuration to program
 */
hex.merge{
	input = "blink.hex"
	input = "config.hex"
	output = "blink_release.hex"
}