workflow compile;

compiler.integrate{
	input = addNumbers
	input = e.platform
	input = microchip.PIC16F1824
	input = pic16.platform
	input = pic16e.platform
	output = addNumbers.l3
}
optimize.constants{
	input = addNumbers.l3
	output = addNumbers.l3.opt
}
compiler.resolve{
	input = addNumbers.l3.opt
	output = addNumbers.l2
}
compiler.flatten{
	input = addNumbers.l2
	output = addNumbers.l1
	entry = "main"
}
compiler.map{
	input = addNumbers.l1
	output = addNumbers.map
	entry = "main"
	architecture = PIC16F1824.arch
}
optimize.constants{
	input = addNumbers.l1
	map = addNumbers.map
	output = addNumbers.l0
}
optimize.strip{
	input = addNumbers.l0
	entry = "main"
	output = addNumbers.l0.strip
}
compiler.toasm{
	input = addNumbers.l0.strip
	entry = "main"
	output = addNumbers.asm
}
