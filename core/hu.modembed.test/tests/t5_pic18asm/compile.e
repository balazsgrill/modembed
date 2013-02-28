workflow compile;

/* Extract config and disassemble*/
pic.config.extract{
	input = "fishlamp.hex"
	output = fishlamp.config
	architecture = PIC18F14K50.arch
}
hex.disassemble{
	input = "fishlamp.hex"
	output = fishlamp.asm
	architecture = PIC18F14K50.arch
}

/* Build it back again */
hex.assemble{
	input = fishlamp.asm
	output = "fishlamp.out.hex"
}
pic.config.tohex{
	input = fishlamp.config
	output = "config.hex"
}
hex.merge{
	input = "fishlamp.out.hex"
	input = "config.hex"
	output = "fishlamp_2.hex"
}