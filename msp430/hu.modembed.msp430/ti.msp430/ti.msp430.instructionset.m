#!instructionSet.syntax
/*
 * MSP430 instruction set 
 */
instructionset ti.msp430.instructionset;
/*
 * Pop SP, then pop PC. Note that because flags like CPUOFF are in the stored status register, the CPU will normally return to the low-power mode it was previously in. This can be changed by adjusting the SR value stored on the stack before invoking RETI (see below). The operand field is unused.
 * Register addressing
 */
RETI (r) <0b000100:6 0b110:3 0b0:1 0b00:2 r:4>;

/*
 * Pop SP, then pop PC. Note that because flags like CPUOFF are in the stored status register, the CPU will normally return to the low-power mode it was previously in. This can be changed by adjusting the SR value stored on the stack before invoking RETI (see below). The operand field is unused.
 * Indexed addressing
 */
RETIx (r, x) <0b000100:6 0b110:3 0b0:1 0b01:2 r:4> <x:16>;

/*
 * Pop SP, then pop PC. Note that because flags like CPUOFF are in the stored status register, the CPU will normally return to the low-power mode it was previously in. This can be changed by adjusting the SR value stored on the stack before invoking RETI (see below). The operand field is unused.
 * Indirect addressing
 */
RETIi (r) <0b000100:6 0b110:3 0b0:1 0b10:2 r:4>;

/*
 * Pop SP, then pop PC. Note that because flags like CPUOFF are in the stored status register, the CPU will normally return to the low-power mode it was previously in. This can be changed by adjusting the SR value stored on the stack before invoking RETI (see below). The operand field is unused.
 * Indirect-autoincrement addressing
 */
RETIii (r) <0b000100:6 0b110:3 0b0:1 0b11:2 r:4>;
/*
 * Swap 8-bit register halves. No byte form.
 * Register addressing
 */
SWPB (r) <0b000100:6 0b1:3 0b0:1 0b00:2 r:4>;

/*
 * Swap 8-bit register halves. No byte form.
 * Indexed addressing
 */
SWPBx (r, x) <0b000100:6 0b1:3 0b0:1 0b01:2 r:4> <x:16>;

/*
 * Swap 8-bit register halves. No byte form.
 * Indirect addressing
 */
SWPBi (r) <0b000100:6 0b1:3 0b0:1 0b10:2 r:4>;

/*
 * Swap 8-bit register halves. No byte form.
 * Indirect-autoincrement addressing
 */
SWPBii (r) <0b000100:6 0b1:3 0b0:1 0b11:2 r:4>;
/*
 * Fetch operand, push PC, then assign operand value to PC. Note the immediate form is the most commonly used. There is no easy way to perform a PC-relative call; the PC-relative addressing mode fetches a word and uses it as an absolute address. This has no byte form.
 * Register addressing
 */
CALL (r) <0b000100:6 0b101:3 0b0:1 0b00:2 r:4>;

/*
 * Fetch operand, push PC, then assign operand value to PC. Note the immediate form is the most commonly used. There is no easy way to perform a PC-relative call; the PC-relative addressing mode fetches a word and uses it as an absolute address. This has no byte form.
 * Indexed addressing
 */
CALLx (r, x) <0b000100:6 0b101:3 0b0:1 0b01:2 r:4> <x:16>;

/*
 * Fetch operand, push PC, then assign operand value to PC. Note the immediate form is the most commonly used. There is no easy way to perform a PC-relative call; the PC-relative addressing mode fetches a word and uses it as an absolute address. This has no byte form.
 * Indirect addressing
 */
CALLi (r) <0b000100:6 0b101:3 0b0:1 0b10:2 r:4>;

/*
 * Fetch operand, push PC, then assign operand value to PC. Note the immediate form is the most commonly used. There is no easy way to perform a PC-relative call; the PC-relative addressing mode fetches a word and uses it as an absolute address. This has no byte form.
 * Indirect-autoincrement addressing
 */
CALLii (r) <0b000100:6 0b101:3 0b0:1 0b11:2 r:4>;
/*
 * Sign extend 8 bits to 16. No byte form.
 * Register addressing
 */
SXT (r) <0b000100:6 0b11:3 0b0:1 0b00:2 r:4>;

/*
 * Sign extend 8 bits to 16. No byte form.
 * Indexed addressing
 */
SXTx (r, x) <0b000100:6 0b11:3 0b0:1 0b01:2 r:4> <x:16>;

/*
 * Sign extend 8 bits to 16. No byte form.
 * Indirect addressing
 */
SXTi (r) <0b000100:6 0b11:3 0b0:1 0b10:2 r:4>;

/*
 * Sign extend 8 bits to 16. No byte form.
 * Indirect-autoincrement addressing
 */
SXTii (r) <0b000100:6 0b11:3 0b0:1 0b11:2 r:4>;
/*
 * Push operand on stack. Push byte decrements SP by 2. CPU BUG: PUSH #4 and PUSH #8 do not work when the short encoding using @r2 and @r2+ is used. The workaround, to use a 16-bit immediate, is trivial, so TI do not plan to fix this bug.
 * Register addressing
 */
PUSH (r) <0b000100:6 0b100:3 0b0:1 0b00:2 r:4>;

/*
 * Push operand on stack. Push byte decrements SP by 2. CPU BUG: PUSH #4 and PUSH #8 do not work when the short encoding using @r2 and @r2+ is used. The workaround, to use a 16-bit immediate, is trivial, so TI do not plan to fix this bug.
 * Indexed addressing
 */
PUSHx (r, x) <0b000100:6 0b100:3 0b0:1 0b01:2 r:4> <x:16>;

/*
 * Push operand on stack. Push byte decrements SP by 2. CPU BUG: PUSH #4 and PUSH #8 do not work when the short encoding using @r2 and @r2+ is used. The workaround, to use a 16-bit immediate, is trivial, so TI do not plan to fix this bug.
 * Indirect addressing
 */
PUSHi (r) <0b000100:6 0b100:3 0b0:1 0b10:2 r:4>;

/*
 * Push operand on stack. Push byte decrements SP by 2. CPU BUG: PUSH #4 and PUSH #8 do not work when the short encoding using @r2 and @r2+ is used. The workaround, to use a 16-bit immediate, is trivial, so TI do not plan to fix this bug.
 * Indirect-autoincrement addressing
 */
PUSHii (r) <0b000100:6 0b100:3 0b0:1 0b11:2 r:4>;
/*
 * Push operand on stack. Push byte decrements SP by 2. CPU BUG: PUSH #4 and PUSH #8 do not work when the short encoding using @r2 and @r2+ is used. The workaround, to use a 16-bit immediate, is trivial, so TI do not plan to fix this bug.
 * Register addressing, byte-form
 */
PUSHb (r) <0b000100:6 0b100:3 0b1:1 0b00:2 r:4>;

/*
 * Push operand on stack. Push byte decrements SP by 2. CPU BUG: PUSH #4 and PUSH #8 do not work when the short encoding using @r2 and @r2+ is used. The workaround, to use a 16-bit immediate, is trivial, so TI do not plan to fix this bug.
 * Indexed addressing, byte-form
 */
PUSHbx (r, x) <0b000100:6 0b100:3 0b1:1 0b01:2 r:4> <x:16>;

/*
 * Push operand on stack. Push byte decrements SP by 2. CPU BUG: PUSH #4 and PUSH #8 do not work when the short encoding using @r2 and @r2+ is used. The workaround, to use a 16-bit immediate, is trivial, so TI do not plan to fix this bug.
 * Indirect addressing, byte-form
 */
PUSHbi (r) <0b000100:6 0b100:3 0b1:1 0b10:2 r:4>;

/*
 * Push operand on stack. Push byte decrements SP by 2. CPU BUG: PUSH #4 and PUSH #8 do not work when the short encoding using @r2 and @r2+ is used. The workaround, to use a 16-bit immediate, is trivial, so TI do not plan to fix this bug.
 * Indirect-autoincrement addressing, byte-form
 */
PUSHbii (r) <0b000100:6 0b100:3 0b1:1 0b11:2 r:4>;
/*
 * 9-bit rotate right through carry. C->msbit->...->lsbit->C. Clear the carry bit beforehand to do a logical right shift. 
 * Register addressing
 */
RRC (r) <0b000100:6 0b0:3 0b0:1 0b00:2 r:4>;

/*
 * 9-bit rotate right through carry. C->msbit->...->lsbit->C. Clear the carry bit beforehand to do a logical right shift. 
 * Indexed addressing
 */
RRCx (r, x) <0b000100:6 0b0:3 0b0:1 0b01:2 r:4> <x:16>;

/*
 * 9-bit rotate right through carry. C->msbit->...->lsbit->C. Clear the carry bit beforehand to do a logical right shift. 
 * Indirect addressing
 */
RRCi (r) <0b000100:6 0b0:3 0b0:1 0b10:2 r:4>;

/*
 * 9-bit rotate right through carry. C->msbit->...->lsbit->C. Clear the carry bit beforehand to do a logical right shift. 
 * Indirect-autoincrement addressing
 */
RRCii (r) <0b000100:6 0b0:3 0b0:1 0b11:2 r:4>;
/*
 * 9-bit rotate right through carry. C->msbit->...->lsbit->C. Clear the carry bit beforehand to do a logical right shift. 
 * Register addressing, byte-form
 */
RRCb (r) <0b000100:6 0b0:3 0b1:1 0b00:2 r:4>;

/*
 * 9-bit rotate right through carry. C->msbit->...->lsbit->C. Clear the carry bit beforehand to do a logical right shift. 
 * Indexed addressing, byte-form
 */
RRCbx (r, x) <0b000100:6 0b0:3 0b1:1 0b01:2 r:4> <x:16>;

/*
 * 9-bit rotate right through carry. C->msbit->...->lsbit->C. Clear the carry bit beforehand to do a logical right shift. 
 * Indirect addressing, byte-form
 */
RRCbi (r) <0b000100:6 0b0:3 0b1:1 0b10:2 r:4>;

/*
 * 9-bit rotate right through carry. C->msbit->...->lsbit->C. Clear the carry bit beforehand to do a logical right shift. 
 * Indirect-autoincrement addressing, byte-form
 */
RRCbii (r) <0b000100:6 0b0:3 0b1:1 0b11:2 r:4>;
/*
 * Badly named, this is an 8-bit arithmetic right shift.
 * Register addressing
 */
RRA (r) <0b000100:6 0b10:3 0b0:1 0b00:2 r:4>;

/*
 * Badly named, this is an 8-bit arithmetic right shift.
 * Indexed addressing
 */
RRAx (r, x) <0b000100:6 0b10:3 0b0:1 0b01:2 r:4> <x:16>;

/*
 * Badly named, this is an 8-bit arithmetic right shift.
 * Indirect addressing
 */
RRAi (r) <0b000100:6 0b10:3 0b0:1 0b10:2 r:4>;

/*
 * Badly named, this is an 8-bit arithmetic right shift.
 * Indirect-autoincrement addressing
 */
RRAii (r) <0b000100:6 0b10:3 0b0:1 0b11:2 r:4>;
/*
 * Badly named, this is an 8-bit arithmetic right shift.
 * Register addressing, byte-form
 */
RRAb (r) <0b000100:6 0b10:3 0b1:1 0b00:2 r:4>;

/*
 * Badly named, this is an 8-bit arithmetic right shift.
 * Indexed addressing, byte-form
 */
RRAbx (r, x) <0b000100:6 0b10:3 0b1:1 0b01:2 r:4> <x:16>;

/*
 * Badly named, this is an 8-bit arithmetic right shift.
 * Indirect addressing, byte-form
 */
RRAbi (r) <0b000100:6 0b10:3 0b1:1 0b10:2 r:4>;

/*
 * Badly named, this is an 8-bit arithmetic right shift.
 * Indirect-autoincrement addressing, byte-form
 */
RRAbii (r) <0b000100:6 0b10:3 0b1:1 0b11:2 r:4>;

/*
 * Jump if Z==0 (if !=)
 */
JNZ (o) <0b001:3 0b0:3 o:10>;
/*
 * Jump if N==1 Note there is no "JP" if N==0!
 */
JN (o) <0b001:3 0b100:3 o:10>;
/*
 * Jump if N!=V (if signed <)
 */
JL (o) <0b001:3 0b110:3 o:10>;
/*
 * Jump unconditionally
 */
JMP (o) <0b001:3 0b111:3 o:10>;
/*
 * Jump if C==0 (if unsigned <)
 */
JNC (o) <0b001:3 0b10:3 o:10>;
/*
 * Jump if Z==1 (if ==)
 */
JZ (o) <0b001:3 0b1:3 o:10>;
/*
 * Jump if C==1 (if unsigned >=)
 */
JC (o) <0b001:3 0b11:3 o:10>;
/*
 * Jump if N==V (if signed >=)
 */
JGE (o) <0b001:3 0b101:3 o:10>;
