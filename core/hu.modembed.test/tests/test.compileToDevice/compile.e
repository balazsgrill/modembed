workflow compile;

compiler.toDevice{
	input = main
	output = main.asm
	platform = pic16.platformDef
	symmap = main.map
}