workflow compile;

compiler.integrate{
	input = blink.main
	input = e.platform
	input = microchip.PIC16F1824
	input = pic16.platform
	output = blink.l3
}
optimize.constants{
	input = blink.l3
	output = blink.l3.opt
}
compiler.resolve{
	input = blink.l3.opt
	output = blink.l2
}
compiler.flatten{
	input = blink.l2
	output = blink.l1
	entry = "main"
}
compiler.map{
	input = blink.l1
	output = blink.map
	entry = "main"
	architecture = PIC16F1824.arch
}
optimize.constants{
	input = blink.l1
	map = blink.map
	output = blink.l0
}
optimize.strip{
	input = blink.l0
	entry = "main"
	output = blink.l0.strip
}
compiler.toasm{
	input = blink.l0.strip
	entry = "main"
	output = blink.asm
}
hex.assemble{
	input = blink.asm
	output = "blink.hex"
	architecture = PIC16F1824.arch
}

pic.config.tohex{
	input = blink.config
	output = "config.hex"
}
hex.merge{
	input = "blink.hex"
	input = "config.hex"
	output = "blink_release.hex"
}