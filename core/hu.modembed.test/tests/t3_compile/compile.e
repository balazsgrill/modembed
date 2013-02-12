workflow compile;

L4toL3{
	input = blink
	input = e.platform
	input = microchip.PIC16F1824
	input = pic16.platform
	output = blink.l3
}
L3toL2{
	input = blink.l3
	output = blink.l2
}
L2toL1{
	input = blink.l2
	output = blink.l1
	entry = "main"
}
L1toL0{
	input = blink.l1
	output = blink.l0
	entry = "main"
	architecture = pic16f1824.arch
}
createAssemblerObject{
	input = blink.l0
	entry = "main"
	output = blink.assemblerObject
}