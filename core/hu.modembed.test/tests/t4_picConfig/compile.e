workflow compile;

pic.config.extract{
	input = "16f1824_blink.hex"
	output = config.blink
	architecture = PIC16F1824.arch
}
pic.config.tohex{
	input = config.blink
	output = "config.hex"
}
hex.merge{
	input = "16f1824_blink_wo_Config.hex"
	input = "config.hex"
	output = "blink_w_config.hex"
}