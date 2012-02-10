library microchip.pic16;

use e.platform;

/*
 * File register address
 */
type address = unsigned 9 bits;

/*
 * 20 bit code address
 */
type codeaddr = unsigned 13 bits;

const bool W = 0;
const bool F = 1;

ADDWF(address f, bool d=1){
	<b000111:6 d:1 f:7>
}

ANDWF(address f, bool d=1){
	<b000101:6 d:1 f:7>
}

CLRF(address f){
	<b0000011:7 f:7>
}

CLRW(){
	<b000001:6 b00000000:8>
}

COMF(address f, bool d=1){
	<b001001:6 d:1 f:7>
}

DECF(address f, bool d=1){
	<b000011:6 d:1 f:7>
}

DECFSZ(address f, bool d=1){
	<b001011:6 d:1 f:7>
}

INCF(address f, bool d=1){
	<b001010:6 d:1 f:7>
}

INCFSZ(address f, bool d=1){
	<b001111:6 d:1 f:7>
}

IORWF(address f, bool d=1){
	<b000100:6 d:1 f:7>
}

MOVF(address f, bool d=1){
	<b001000:6 d:1 f:7>
}

MOVWF(address f){
	<b000000:6 1:1 f:7>
}

NOP(){
	<0:14>
}

RLF(address f, bool d=1){
	<b001101:6 d:1 f:7>
}

RRF(address f, bool d=1){
	<b001100:6 d:1 f:7>
}

SUBWF(address f, bool d=1){
	<b000010:6 d:1 f:7>
}

SWAPF(address f, bool d=1){
	<b001110:6 d:1 f:7>
}

XORWF(address f, bool d=1){
	<b000110:6 d:1 f:7>
}

BCF(address f, bit b){
	<b01:2 b00:2 b:3 f:7>
}

BSF(address f, bit b){
	<b01:2 b01:2 b:3 f:7>
}

BTFSC(address f, bit b){
	<b01:2 b10:2 b:3 f:7>
}

BTFSS(address f, bit b){
	<b01:2 b11:2 b:3 f:7>
}

ADDLW(uint8 k){
	<b11:2 b1110:4 k:8>
}

ANDLW(uint8 k){
	<b11:2 b1001:4 k:8>
}

IORLW(uint8 k){
	<b11:2 b1000:4 k:8>
}

MOVLW(uint8 k){
	<b11:2 b0000:4 k:8>
}

RETLW(uint8 k){
	<b11:2 b0100:4 k:8>
}

SUBLW(uint8 k){
	<b11:2 b1100:4 k:8>
}

XORLW(uint8 k){
	<b11:2 b1010:4 k:8>
}

CALL(codeaddr k){
	<b100:3 k:11>
}

GOTO(codeaddr k){
	<b101:3 k:11>
}

CLRWDT(){
	<b00000001100100:14>
}

RETFIE(){
	<b00000000001001:14>
}

RETURN(){
	<b00000000001000:14>
}

SLEEP(){
	<b00000001100011:14>
}