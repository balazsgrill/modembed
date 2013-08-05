library ti.msp430;

use e.platform;
use msp430.instructions;

type Reg = unsigned 4 bits;

/* Program counter */
const Reg PC = 0;

/* Stack pointer */
const Reg SP = 1;

/* Status register */
const Reg SR = 2;

/* Constant generator register */
const Reg CGR = 3;

type AMode = unsigned 2 bits;

const bool WORD_MODE = 0;
const bool BYTE_MODE = 1;

/*
 * Relative address
 */
type RAddr = signed 10 bits;

function RRC void(const Reg r, const AMode Ad, const uint16 X){
	SO(b000, Ad, r, X, WORD_MODE);
}

function RRC_B void(const Reg r, const AMode Ad, const uint16 X){
	SO(b000, Ad, r, X, BYTE_MODE);
}

function SWAPB void(const Reg r, const AMode Ad, const uint16 X){
	SO(b001, Ad, r, X, WORD_MODE);
}

function RRA void(const Reg r, const AMode Ad, const uint16 X){
	SO(b010, Ad, r, X, WORD_MODE);
}

function RRA_B void(const Reg r, const AMode Ad, const uint16 X){
	SO(b010, Ad, r, X, BYTE_MODE);
}

function SXT void(const Reg r, const AMode Ad, const uint16 X){
	SO(b011, Ad, r, X, WORD_MODE);
}

function PUSH void(const Reg r, const AMode Ad, const uint16 X){
	SO(b100, Ad, r, X, WORD_MODE);
}

function PUSH_B void(const Reg r, const AMode Ad, const uint16 X){
	SO(b100, Ad, r, X, BYTE_MODE);
}

function CALL void(const Reg r, const AMode Ad, const uint16 X){
	SO(b101, Ad, r, X, WORD_MODE);
}

function RETI void(const Reg r, const AMode Ad, const uint16 X){
	SO(b110, Ad, r, X, WORD_MODE);
}

function JNE void(const RAddr addr){
	RJ(b000, addr);
}

function JEQ void(const RAddr addr){
	RJ(b001, addr);
}

function JNC void(const RAddr addr){
	RJ(b010, addr);
}

function JC void(const RAddr addr){
	RJ(b011, addr);
}

function JN void(const RAddr addr){
	RJ(b100, addr);
}

function JGE void(const RAddr addr){
	RJ(b101, addr);
}

function JL void(const RAddr addr){
	RJ(b110, addr);
}

function JMP void(const RAddr addr){
	RJ(b111, addr);
}

function MOV void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b0100, source, As, dest, Ad, X, Y, WORD_MODE);
}

function MOV_B void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b0100, source, As, dest, Ad, X, Y, BYTE_MODE);
}

function ADD void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b0101, source, As, dest, Ad, X, Y, WORD_MODE);
}

function ADD_B void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b0101, source, As, dest, Ad, X, Y, BYTE_MODE);
}

function ADDC void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b0110, source, As, dest, Ad, X, Y, WORD_MODE);
}

function ADDC_B void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b0110, source, As, dest, Ad, X, Y, BYTE_MODE);
}

function SUBC void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b0111, source, As, dest, Ad, X, Y, WORD_MODE);
}

function SUBC_B void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b0111, source, As, dest, Ad, X, Y, BYTE_MODE);
}

function SUB void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1000, source, As, dest, Ad, X, Y, WORD_MODE);
}

function SUB_B void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1000, source, As, dest, Ad, X, Y, BYTE_MODE);
}

function CMP void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1001, source, As, dest, Ad, X, Y, WORD_MODE);
}

function CMP_B void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1001, source, As, dest, Ad, X, Y, BYTE_MODE);
}

function DADD void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1010, source, As, dest, Ad, X, Y, WORD_MODE);
}

function DADD_B void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1010, source, As, dest, Ad, X, Y, BYTE_MODE);
}

function BIT void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1011, source, As, dest, Ad, X, Y, WORD_MODE);
}

function BIT_B void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1011, source, As, dest, Ad, X, Y, BYTE_MODE);
}

function BIC void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1100, source, As, dest, Ad, X, Y, WORD_MODE);
}

function BIC_B void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1100, source, As, dest, Ad, X, Y, BYTE_MODE);
}

function BIS void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1101, source, As, dest, Ad, X, Y, WORD_MODE);
}

function BIS_B void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1101, source, As, dest, Ad, X, Y, BYTE_MODE);
}

function XOR void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1110, source, As, dest, Ad, X, Y, WORD_MODE);
}

function XOR_B void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1110, source, As, dest, Ad, X, Y, BYTE_MODE);
}

function AND void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1111, source, As, dest, Ad, X, Y, WORD_MODE);
}

function AND_B void(const Reg source, const AMode As, const Reg dest, const bool Ad, const uint16 X, const uint16 Y){
	DO(b1111, source, As, dest, Ad, X, Y, BYTE_MODE);
}

function NOP void(){
	MOV(3, 0, 3, 0, 0, 0);
}

function POP void(const Reg dest, const bool Ad, const uint16 destAddr){
	MOV(SP, b11, dest, Ad, 0, destAddr);
}