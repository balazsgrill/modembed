workflow compile;

compiler.integrate{
	input = blink.main
	input = e.platform
	input = microchip.PIC16F1824
	input = pic16.platform
	output = blink.l3
}
compiler.resolve{
	input = blink.l3
	output = blink.l2
}
compiler.flatten{
	input = blink.l2
	output = blink.l1
	entry = "main"
}
compiler.map{
	input = blink.l1
	output = blink.l0
	entry = "main"
	architecture = PIC16F1824.arch
}
compiler.toasm{
	input = blink.l0
	entry = "main"
	output = blink.asm
}
hex.assemble{
	input = blink.asm
	output = "blink.hex"
	architecture = PIC16F1824.arch
}