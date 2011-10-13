/*
 * PIC18F14K50 specific implementation of DIO
 */
namespace dio;

import e.types;
import microchip.pic18;
import microchip.pic18.assisted;
import microchip.PIC18F14K50;

type ChannelID = unsigned 8 bits;

const uint8 channelNum = 17;

const ChannelID RA0 = 0;
const ChannelID RA1 = 1;
const ChannelID RA3 = 2;
const ChannelID RA4 = 3;
const ChannelID RA5 = 4;

const ChannelID RB4 = 5;
const ChannelID RB5 = 6;
const ChannelID RB6 = 7;
const ChannelID RB7 = 8;

const ChannelID RC0 = 9;
const ChannelID RC1 = 10;
const ChannelID RC2 = 11;
const ChannelID RC3 = 12;
const ChannelID RC4 = 13;
const ChannelID RC5 = 14;
const ChannelID RC6 = 15;
const ChannelID RC7 = 16;

type TChannelConfig = struct{
	address port,
	address latch,
	bit pin
}
type TChannelConfigTable = TChannelConfig[channelNum];

const TChannelConfigTable channelConfigTable = TChannelConfigTable{
	TChannelConfig{addr(PORTA),addr(LATA),0}, //RA0
	TChannelConfig{addr(PORTA),addr(LATA),1}, //RA1
	TChannelConfig{addr(PORTA),addr(LATA),3}, //RA3
	TChannelConfig{addr(PORTA),addr(LATA),4}, //RA4
	TChannelConfig{addr(PORTA),addr(LATA),5}, //RA5
	
	TChannelConfig{addr(PORTB),addr(LATB),4}, //RB4
	TChannelConfig{addr(PORTB),addr(LATB),5}, //RB5
	TChannelConfig{addr(PORTB),addr(LATB),6}, //RB6
	TChannelConfig{addr(PORTB),addr(LATB),7}, //RB7
	
	TChannelConfig{addr(PORTC),addr(LATC),0}, //RC0
	TChannelConfig{addr(PORTC),addr(LATC),1}, //RC1
	TChannelConfig{addr(PORTC),addr(LATC),2}, //RC2
	TChannelConfig{addr(PORTC),addr(LATC),3}, //RC3
	TChannelConfig{addr(PORTC),addr(LATC),4}, //RC4
	TChannelConfig{addr(PORTC),addr(LATC),5}, //RC5
	TChannelConfig{addr(PORTC),addr(LATC),6}, //RC6
	TChannelConfig{addr(PORTC),addr(LATC),7}  //RC7
	
};

DIO_RawSet(address latch,const bit pin, uint8 v, bit b = 0){
	if (isliteral(v)){
		if (v){
			aBSF(latch,pin);
		}else{
			aBCF(latch,pin);
		}
	}else{
		aBTFSC(addr(v),b);
		GOTO(@true);
		//false
		aBCF(latch,pin);
		GOTO(@done);
		label true;
		//true
		aBSF(latch,pin);
		label done;
	}
}

DIO_Read(ChannelID channel, uint8 v, bit b = 0){
	aBCF(addr(v),b);
	aBTFSC(channelConfigTable[channel].port,channelConfigTable[channel].pin);
	aBSF(addr(v),b);
}

DIO_Set(ChannelID channel, uint8 v, bit b = 0){
	DIO_RawSet(
		channelConfigTable[channel].latch,
		channelConfigTable[channel].pin,
		v,b
	);
}


