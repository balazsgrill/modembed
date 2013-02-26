workflow build;

compiler.toasm{
	input = blink
	entry = "main"
	output = blink.assemblerObject
}