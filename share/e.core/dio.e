library e.dio;

use e.platform;

type ChannelID = unsigned 8 bits;

function DIO_Read void(ChannelID channel, uint8 v, bit b = 0){}

function DIO_Set void(ChannelID channel, uint8 v, bit b = 0){}