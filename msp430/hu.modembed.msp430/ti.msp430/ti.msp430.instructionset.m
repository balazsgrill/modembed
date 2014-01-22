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
RETIx (r x) <0b000100:6 0b110:3 0b0:1 0b01:2 r:4> <x:16>;

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
SWPBx (r x) <0b000100:6 0b1:3 0b0:1 0b01:2 r:4> <x:16>;

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
CALLx (r x) <0b000100:6 0b101:3 0b0:1 0b01:2 r:4> <x:16>;

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
SXTx (r x) <0b000100:6 0b11:3 0b0:1 0b01:2 r:4> <x:16>;

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
PUSHx (r x) <0b000100:6 0b100:3 0b0:1 0b01:2 r:4> <x:16>;

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
PUSHbx (r x) <0b000100:6 0b100:3 0b1:1 0b01:2 r:4> <x:16>;

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
RRCx (r x) <0b000100:6 0b0:3 0b0:1 0b01:2 r:4> <x:16>;

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
RRCbx (r x) <0b000100:6 0b0:3 0b1:1 0b01:2 r:4> <x:16>;

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
RRAx (r x) <0b000100:6 0b10:3 0b0:1 0b01:2 r:4> <x:16>;

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
RRAbx (r x) <0b000100:6 0b10:3 0b1:1 0b01:2 r:4> <x:16>;

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

/*
 * dest = src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Register addressing 
 */
MOV (rs rd ) <0b100:4 rs:4 0b0:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest = src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Register addressing
 * Byte form.
 */
MOVb (rs rd ) <0b100:4 rs:4 0b0:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest = src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indexed addressing 
 */
MOVy (rs rd  y) <0b100:4 rs:4 0b1:1 0b0:1 0b0:2 rd:4>  <y:16>;

/*
 * dest = src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indexed addressing
 * Byte form.
 */
MOVby (rs rd  y) <0b100:4 rs:4 0b1:1 0b1:1 0b0:2 rd:4>  <y:16>;
/*
 * dest = src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indirect addressing 
 */
MOVi (rs rd ) <0b100:4 rs:4 0b10:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest = src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indirect addressing
 * Byte form.
 */
MOVbi (rs rd ) <0b100:4 rs:4 0b10:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest = src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing 
 */
MOVii (rs rd ) <0b100:4 rs:4 0b11:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest = src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
MOVbii (rs rd ) <0b100:4 rs:4 0b11:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest = src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Register addressing 
 */
MOVx (rs rd  x) <0b100:4 rs:4 0b0:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest = src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Register addressing
 * Byte form.
 */
MOVbx (rs rd x) <0b100:4 rs:4 0b0:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest = src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indexed addressing 
 */
MOVxy (rs rd  x y) <0b100:4 rs:4 0b1:1 0b0:1 0b1:2 rd:4>  <x:16> <y:16>;

/*
 * dest = src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indexed addressing
 * Byte form.
 */
MOVbxy (rs rd x y) <0b100:4 rs:4 0b1:1 0b1:1 0b1:2 rd:4>  <x:16> <y:16>;
/*
 * dest = src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indirect addressing 
 */
MOVxi (rs rd  x) <0b100:4 rs:4 0b10:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest = src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indirect addressing
 * Byte form.
 */
MOVbxi (rs rd x) <0b100:4 rs:4 0b10:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest = src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing 
 */
MOVxii (rs rd  x) <0b100:4 rs:4 0b11:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest = src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
MOVbxii (rs rd x) <0b100:4 rs:4 0b11:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest += src
 * Source: Register addressing
 * Destination: Register addressing 
 */
ADD (rs rd ) <0b101:4 rs:4 0b0:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest += src
 * Source: Register addressing
 * Destination: Register addressing
 * Byte form.
 */
ADDb (rs rd ) <0b101:4 rs:4 0b0:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest += src
 * Source: Register addressing
 * Destination: Indexed addressing 
 */
ADDy (rs rd  y) <0b101:4 rs:4 0b1:1 0b0:1 0b0:2 rd:4>  <y:16>;

/*
 * dest += src
 * Source: Register addressing
 * Destination: Indexed addressing
 * Byte form.
 */
ADDby (rs rd  y) <0b101:4 rs:4 0b1:1 0b1:1 0b0:2 rd:4>  <y:16>;
/*
 * dest += src
 * Source: Register addressing
 * Destination: Indirect addressing 
 */
ADDi (rs rd ) <0b101:4 rs:4 0b10:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest += src
 * Source: Register addressing
 * Destination: Indirect addressing
 * Byte form.
 */
ADDbi (rs rd ) <0b101:4 rs:4 0b10:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest += src
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing 
 */
ADDii (rs rd ) <0b101:4 rs:4 0b11:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest += src
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
ADDbii (rs rd ) <0b101:4 rs:4 0b11:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest += src
 * Source: Indexed addressing
 * Destination: Register addressing 
 */
ADDx (rs rd  x) <0b101:4 rs:4 0b0:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest += src
 * Source: Indexed addressing
 * Destination: Register addressing
 * Byte form.
 */
ADDbx (rs rd x) <0b101:4 rs:4 0b0:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest += src
 * Source: Indexed addressing
 * Destination: Indexed addressing 
 */
ADDxy (rs rd  x y) <0b101:4 rs:4 0b1:1 0b0:1 0b1:2 rd:4>  <x:16> <y:16>;

/*
 * dest += src
 * Source: Indexed addressing
 * Destination: Indexed addressing
 * Byte form.
 */
ADDbxy (rs rd x y) <0b101:4 rs:4 0b1:1 0b1:1 0b1:2 rd:4>  <x:16> <y:16>;
/*
 * dest += src
 * Source: Indexed addressing
 * Destination: Indirect addressing 
 */
ADDxi (rs rd  x) <0b101:4 rs:4 0b10:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest += src
 * Source: Indexed addressing
 * Destination: Indirect addressing
 * Byte form.
 */
ADDbxi (rs rd x) <0b101:4 rs:4 0b10:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest += src
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing 
 */
ADDxii (rs rd  x) <0b101:4 rs:4 0b11:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest += src
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
ADDbxii (rs rd x) <0b101:4 rs:4 0b11:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest += src + C
 * Source: Register addressing
 * Destination: Register addressing 
 */
ADDC (rs rd ) <0b110:4 rs:4 0b0:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest += src + C
 * Source: Register addressing
 * Destination: Register addressing
 * Byte form.
 */
ADDCb (rs rd ) <0b110:4 rs:4 0b0:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest += src + C
 * Source: Register addressing
 * Destination: Indexed addressing 
 */
ADDCy (rs rd  y) <0b110:4 rs:4 0b1:1 0b0:1 0b0:2 rd:4>  <y:16>;

/*
 * dest += src + C
 * Source: Register addressing
 * Destination: Indexed addressing
 * Byte form.
 */
ADDCby (rs rd  y) <0b110:4 rs:4 0b1:1 0b1:1 0b0:2 rd:4>  <y:16>;
/*
 * dest += src + C
 * Source: Register addressing
 * Destination: Indirect addressing 
 */
ADDCi (rs rd ) <0b110:4 rs:4 0b10:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest += src + C
 * Source: Register addressing
 * Destination: Indirect addressing
 * Byte form.
 */
ADDCbi (rs rd ) <0b110:4 rs:4 0b10:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest += src + C
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing 
 */
ADDCii (rs rd ) <0b110:4 rs:4 0b11:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest += src + C
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
ADDCbii (rs rd ) <0b110:4 rs:4 0b11:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest += src + C
 * Source: Indexed addressing
 * Destination: Register addressing 
 */
ADDCx (rs rd  x) <0b110:4 rs:4 0b0:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest += src + C
 * Source: Indexed addressing
 * Destination: Register addressing
 * Byte form.
 */
ADDCbx (rs rd x) <0b110:4 rs:4 0b0:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest += src + C
 * Source: Indexed addressing
 * Destination: Indexed addressing 
 */
ADDCxy (rs rd  x y) <0b110:4 rs:4 0b1:1 0b0:1 0b1:2 rd:4>  <x:16> <y:16>;

/*
 * dest += src + C
 * Source: Indexed addressing
 * Destination: Indexed addressing
 * Byte form.
 */
ADDCbxy (rs rd x y) <0b110:4 rs:4 0b1:1 0b1:1 0b1:2 rd:4>  <x:16> <y:16>;
/*
 * dest += src + C
 * Source: Indexed addressing
 * Destination: Indirect addressing 
 */
ADDCxi (rs rd  x) <0b110:4 rs:4 0b10:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest += src + C
 * Source: Indexed addressing
 * Destination: Indirect addressing
 * Byte form.
 */
ADDCbxi (rs rd x) <0b110:4 rs:4 0b10:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest += src + C
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing 
 */
ADDCxii (rs rd  x) <0b110:4 rs:4 0b11:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest += src + C
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
ADDCbxii (rs rd x) <0b110:4 rs:4 0b11:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest += ~src + C
 * Source: Register addressing
 * Destination: Register addressing 
 */
SUBC (rs rd ) <0b111:4 rs:4 0b0:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest += ~src + C
 * Source: Register addressing
 * Destination: Register addressing
 * Byte form.
 */
SUBCb (rs rd ) <0b111:4 rs:4 0b0:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest += ~src + C
 * Source: Register addressing
 * Destination: Indexed addressing 
 */
SUBCy (rs rd  y) <0b111:4 rs:4 0b1:1 0b0:1 0b0:2 rd:4>  <y:16>;

/*
 * dest += ~src + C
 * Source: Register addressing
 * Destination: Indexed addressing
 * Byte form.
 */
SUBCby (rs rd  y) <0b111:4 rs:4 0b1:1 0b1:1 0b0:2 rd:4>  <y:16>;
/*
 * dest += ~src + C
 * Source: Register addressing
 * Destination: Indirect addressing 
 */
SUBCi (rs rd ) <0b111:4 rs:4 0b10:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest += ~src + C
 * Source: Register addressing
 * Destination: Indirect addressing
 * Byte form.
 */
SUBCbi (rs rd ) <0b111:4 rs:4 0b10:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest += ~src + C
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing 
 */
SUBCii (rs rd ) <0b111:4 rs:4 0b11:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest += ~src + C
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
SUBCbii (rs rd ) <0b111:4 rs:4 0b11:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest += ~src + C
 * Source: Indexed addressing
 * Destination: Register addressing 
 */
SUBCx (rs rd  x) <0b111:4 rs:4 0b0:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest += ~src + C
 * Source: Indexed addressing
 * Destination: Register addressing
 * Byte form.
 */
SUBCbx (rs rd x) <0b111:4 rs:4 0b0:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest += ~src + C
 * Source: Indexed addressing
 * Destination: Indexed addressing 
 */
SUBCxy (rs rd  x y) <0b111:4 rs:4 0b1:1 0b0:1 0b1:2 rd:4>  <x:16> <y:16>;

/*
 * dest += ~src + C
 * Source: Indexed addressing
 * Destination: Indexed addressing
 * Byte form.
 */
SUBCbxy (rs rd x y) <0b111:4 rs:4 0b1:1 0b1:1 0b1:2 rd:4>  <x:16> <y:16>;
/*
 * dest += ~src + C
 * Source: Indexed addressing
 * Destination: Indirect addressing 
 */
SUBCxi (rs rd  x) <0b111:4 rs:4 0b10:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest += ~src + C
 * Source: Indexed addressing
 * Destination: Indirect addressing
 * Byte form.
 */
SUBCbxi (rs rd x) <0b111:4 rs:4 0b10:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest += ~src + C
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing 
 */
SUBCxii (rs rd  x) <0b111:4 rs:4 0b11:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest += ~src + C
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
SUBCbxii (rs rd x) <0b111:4 rs:4 0b11:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Register addressing
 * Destination: Register addressing 
 */
SUB (rs rd ) <0b1000:4 rs:4 0b0:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Register addressing
 * Destination: Register addressing
 * Byte form.
 */
SUBb (rs rd ) <0b1000:4 rs:4 0b0:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Register addressing
 * Destination: Indexed addressing 
 */
SUBy (rs rd  y) <0b1000:4 rs:4 0b1:1 0b0:1 0b0:2 rd:4>  <y:16>;

/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Register addressing
 * Destination: Indexed addressing
 * Byte form.
 */
SUBby (rs rd  y) <0b1000:4 rs:4 0b1:1 0b1:1 0b0:2 rd:4>  <y:16>;
/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Register addressing
 * Destination: Indirect addressing 
 */
SUBi (rs rd ) <0b1000:4 rs:4 0b10:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Register addressing
 * Destination: Indirect addressing
 * Byte form.
 */
SUBbi (rs rd ) <0b1000:4 rs:4 0b10:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing 
 */
SUBii (rs rd ) <0b1000:4 rs:4 0b11:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
SUBbii (rs rd ) <0b1000:4 rs:4 0b11:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Indexed addressing
 * Destination: Register addressing 
 */
SUBx (rs rd  x) <0b1000:4 rs:4 0b0:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Indexed addressing
 * Destination: Register addressing
 * Byte form.
 */
SUBbx (rs rd x) <0b1000:4 rs:4 0b0:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Indexed addressing
 * Destination: Indexed addressing 
 */
SUBxy (rs rd  x y) <0b1000:4 rs:4 0b1:1 0b0:1 0b1:2 rd:4>  <x:16> <y:16>;

/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Indexed addressing
 * Destination: Indexed addressing
 * Byte form.
 */
SUBbxy (rs rd x y) <0b1000:4 rs:4 0b1:1 0b1:1 0b1:2 rd:4>  <x:16> <y:16>;
/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Indexed addressing
 * Destination: Indirect addressing 
 */
SUBxi (rs rd  x) <0b1000:4 rs:4 0b10:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Indexed addressing
 * Destination: Indirect addressing
 * Byte form.
 */
SUBbxi (rs rd x) <0b1000:4 rs:4 0b10:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing 
 */
SUBxii (rs rd  x) <0b1000:4 rs:4 0b11:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest -= src. Implemented as dest += ~src + 1.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
SUBbxii (rs rd x) <0b1000:4 rs:4 0b11:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Register addressing 
 */
CMP (rs rd ) <0b1001:4 rs:4 0b0:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Register addressing
 * Byte form.
 */
CMPb (rs rd ) <0b1001:4 rs:4 0b0:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Indexed addressing 
 */
CMPy (rs rd  y) <0b1001:4 rs:4 0b1:1 0b0:1 0b0:2 rd:4>  <y:16>;

/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Indexed addressing
 * Byte form.
 */
CMPby (rs rd  y) <0b1001:4 rs:4 0b1:1 0b1:1 0b0:2 rd:4>  <y:16>;
/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Indirect addressing 
 */
CMPi (rs rd ) <0b1001:4 rs:4 0b10:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Indirect addressing
 * Byte form.
 */
CMPbi (rs rd ) <0b1001:4 rs:4 0b10:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing 
 */
CMPii (rs rd ) <0b1001:4 rs:4 0b11:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
CMPbii (rs rd ) <0b1001:4 rs:4 0b11:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Register addressing 
 */
CMPx (rs rd  x) <0b1001:4 rs:4 0b0:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Register addressing
 * Byte form.
 */
CMPbx (rs rd x) <0b1001:4 rs:4 0b0:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Indexed addressing 
 */
CMPxy (rs rd  x y) <0b1001:4 rs:4 0b1:1 0b0:1 0b1:2 rd:4>  <x:16> <y:16>;

/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Indexed addressing
 * Byte form.
 */
CMPbxy (rs rd x y) <0b1001:4 rs:4 0b1:1 0b1:1 0b1:2 rd:4>  <x:16> <y:16>;
/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Indirect addressing 
 */
CMPxi (rs rd  x) <0b1001:4 rs:4 0b10:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Indirect addressing
 * Byte form.
 */
CMPbxi (rs rd x) <0b1001:4 rs:4 0b10:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing 
 */
CMPxii (rs rd  x) <0b1001:4 rs:4 0b11:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest - src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
CMPbxii (rs rd x) <0b1001:4 rs:4 0b11:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest += src + C, BCD.
 * Source: Register addressing
 * Destination: Register addressing 
 */
DADD (rs rd ) <0b1010:4 rs:4 0b0:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest += src + C, BCD.
 * Source: Register addressing
 * Destination: Register addressing
 * Byte form.
 */
DADDb (rs rd ) <0b1010:4 rs:4 0b0:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest += src + C, BCD.
 * Source: Register addressing
 * Destination: Indexed addressing 
 */
DADDy (rs rd  y) <0b1010:4 rs:4 0b1:1 0b0:1 0b0:2 rd:4>  <y:16>;

/*
 * dest += src + C, BCD.
 * Source: Register addressing
 * Destination: Indexed addressing
 * Byte form.
 */
DADDby (rs rd  y) <0b1010:4 rs:4 0b1:1 0b1:1 0b0:2 rd:4>  <y:16>;
/*
 * dest += src + C, BCD.
 * Source: Register addressing
 * Destination: Indirect addressing 
 */
DADDi (rs rd ) <0b1010:4 rs:4 0b10:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest += src + C, BCD.
 * Source: Register addressing
 * Destination: Indirect addressing
 * Byte form.
 */
DADDbi (rs rd ) <0b1010:4 rs:4 0b10:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest += src + C, BCD.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing 
 */
DADDii (rs rd ) <0b1010:4 rs:4 0b11:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest += src + C, BCD.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
DADDbii (rs rd ) <0b1010:4 rs:4 0b11:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest += src + C, BCD.
 * Source: Indexed addressing
 * Destination: Register addressing 
 */
DADDx (rs rd  x) <0b1010:4 rs:4 0b0:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest += src + C, BCD.
 * Source: Indexed addressing
 * Destination: Register addressing
 * Byte form.
 */
DADDbx (rs rd x) <0b1010:4 rs:4 0b0:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest += src + C, BCD.
 * Source: Indexed addressing
 * Destination: Indexed addressing 
 */
DADDxy (rs rd  x y) <0b1010:4 rs:4 0b1:1 0b0:1 0b1:2 rd:4>  <x:16> <y:16>;

/*
 * dest += src + C, BCD.
 * Source: Indexed addressing
 * Destination: Indexed addressing
 * Byte form.
 */
DADDbxy (rs rd x y) <0b1010:4 rs:4 0b1:1 0b1:1 0b1:2 rd:4>  <x:16> <y:16>;
/*
 * dest += src + C, BCD.
 * Source: Indexed addressing
 * Destination: Indirect addressing 
 */
DADDxi (rs rd  x) <0b1010:4 rs:4 0b10:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest += src + C, BCD.
 * Source: Indexed addressing
 * Destination: Indirect addressing
 * Byte form.
 */
DADDbxi (rs rd x) <0b1010:4 rs:4 0b10:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest += src + C, BCD.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing 
 */
DADDxii (rs rd  x) <0b1010:4 rs:4 0b11:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest += src + C, BCD.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
DADDbxii (rs rd x) <0b1010:4 rs:4 0b11:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Register addressing 
 */
BIT (rs rd ) <0b1011:4 rs:4 0b0:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Register addressing
 * Byte form.
 */
BITb (rs rd ) <0b1011:4 rs:4 0b0:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Indexed addressing 
 */
BITy (rs rd  y) <0b1011:4 rs:4 0b1:1 0b0:1 0b0:2 rd:4>  <y:16>;

/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Indexed addressing
 * Byte form.
 */
BITby (rs rd  y) <0b1011:4 rs:4 0b1:1 0b1:1 0b0:2 rd:4>  <y:16>;
/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Indirect addressing 
 */
BITi (rs rd ) <0b1011:4 rs:4 0b10:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Indirect addressing
 * Byte form.
 */
BITbi (rs rd ) <0b1011:4 rs:4 0b10:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing 
 */
BITii (rs rd ) <0b1011:4 rs:4 0b11:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
BITbii (rs rd ) <0b1011:4 rs:4 0b11:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Register addressing 
 */
BITx (rs rd  x) <0b1011:4 rs:4 0b0:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Register addressing
 * Byte form.
 */
BITbx (rs rd x) <0b1011:4 rs:4 0b0:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Indexed addressing 
 */
BITxy (rs rd  x y) <0b1011:4 rs:4 0b1:1 0b0:1 0b1:2 rd:4>  <x:16> <y:16>;

/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Indexed addressing
 * Byte form.
 */
BITbxy (rs rd x y) <0b1011:4 rs:4 0b1:1 0b1:1 0b1:2 rd:4>  <x:16> <y:16>;
/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Indirect addressing 
 */
BITxi (rs rd  x) <0b1011:4 rs:4 0b10:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Indirect addressing
 * Byte form.
 */
BITbxi (rs rd x) <0b1011:4 rs:4 0b10:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing 
 */
BITxii (rs rd  x) <0b1011:4 rs:4 0b11:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest & src. Sets status only; the destination is not written.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
BITbxii (rs rd x) <0b1011:4 rs:4 0b11:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Register addressing 
 */
BIC (rs rd ) <0b1100:4 rs:4 0b0:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Register addressing
 * Byte form.
 */
BICb (rs rd ) <0b1100:4 rs:4 0b0:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indexed addressing 
 */
BICy (rs rd  y) <0b1100:4 rs:4 0b1:1 0b0:1 0b0:2 rd:4>  <y:16>;

/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indexed addressing
 * Byte form.
 */
BICby (rs rd  y) <0b1100:4 rs:4 0b1:1 0b1:1 0b0:2 rd:4>  <y:16>;
/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indirect addressing 
 */
BICi (rs rd ) <0b1100:4 rs:4 0b10:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indirect addressing
 * Byte form.
 */
BICbi (rs rd ) <0b1100:4 rs:4 0b10:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing 
 */
BICii (rs rd ) <0b1100:4 rs:4 0b11:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
BICbii (rs rd ) <0b1100:4 rs:4 0b11:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Register addressing 
 */
BICx (rs rd  x) <0b1100:4 rs:4 0b0:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Register addressing
 * Byte form.
 */
BICbx (rs rd x) <0b1100:4 rs:4 0b0:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indexed addressing 
 */
BICxy (rs rd  x y) <0b1100:4 rs:4 0b1:1 0b0:1 0b1:2 rd:4>  <x:16> <y:16>;

/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indexed addressing
 * Byte form.
 */
BICbxy (rs rd x y) <0b1100:4 rs:4 0b1:1 0b1:1 0b1:2 rd:4>  <x:16> <y:16>;
/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indirect addressing 
 */
BICxi (rs rd  x) <0b1100:4 rs:4 0b10:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indirect addressing
 * Byte form.
 */
BICbxi (rs rd x) <0b1100:4 rs:4 0b10:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing 
 */
BICxii (rs rd  x) <0b1100:4 rs:4 0b11:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest &= ~src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
BICbxii (rs rd x) <0b1100:4 rs:4 0b11:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest |= src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Register addressing 
 */
BIS (rs rd ) <0b1101:4 rs:4 0b0:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest |= src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Register addressing
 * Byte form.
 */
BISb (rs rd ) <0b1101:4 rs:4 0b0:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest |= src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indexed addressing 
 */
BISy (rs rd  y) <0b1101:4 rs:4 0b1:1 0b0:1 0b0:2 rd:4>  <y:16>;

/*
 * dest |= src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indexed addressing
 * Byte form.
 */
BISby (rs rd  y) <0b1101:4 rs:4 0b1:1 0b1:1 0b0:2 rd:4>  <y:16>;
/*
 * dest |= src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indirect addressing 
 */
BISi (rs rd ) <0b1101:4 rs:4 0b10:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest |= src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indirect addressing
 * Byte form.
 */
BISbi (rs rd ) <0b1101:4 rs:4 0b10:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest |= src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing 
 */
BISii (rs rd ) <0b1101:4 rs:4 0b11:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest |= src. The status flags are NOT set.
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
BISbii (rs rd ) <0b1101:4 rs:4 0b11:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest |= src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Register addressing 
 */
BISx (rs rd  x) <0b1101:4 rs:4 0b0:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest |= src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Register addressing
 * Byte form.
 */
BISbx (rs rd x) <0b1101:4 rs:4 0b0:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest |= src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indexed addressing 
 */
BISxy (rs rd  x y) <0b1101:4 rs:4 0b1:1 0b0:1 0b1:2 rd:4>  <x:16> <y:16>;

/*
 * dest |= src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indexed addressing
 * Byte form.
 */
BISbxy (rs rd x y) <0b1101:4 rs:4 0b1:1 0b1:1 0b1:2 rd:4>  <x:16> <y:16>;
/*
 * dest |= src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indirect addressing 
 */
BISxi (rs rd  x) <0b1101:4 rs:4 0b10:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest |= src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indirect addressing
 * Byte form.
 */
BISbxi (rs rd x) <0b1101:4 rs:4 0b10:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest |= src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing 
 */
BISxii (rs rd  x) <0b1101:4 rs:4 0b11:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest |= src. The status flags are NOT set.
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
BISbxii (rs rd x) <0b1101:4 rs:4 0b11:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest ^= src
 * Source: Register addressing
 * Destination: Register addressing 
 */
XOR (rs rd ) <0b1110:4 rs:4 0b0:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest ^= src
 * Source: Register addressing
 * Destination: Register addressing
 * Byte form.
 */
XORb (rs rd ) <0b1110:4 rs:4 0b0:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest ^= src
 * Source: Register addressing
 * Destination: Indexed addressing 
 */
XORy (rs rd  y) <0b1110:4 rs:4 0b1:1 0b0:1 0b0:2 rd:4>  <y:16>;

/*
 * dest ^= src
 * Source: Register addressing
 * Destination: Indexed addressing
 * Byte form.
 */
XORby (rs rd  y) <0b1110:4 rs:4 0b1:1 0b1:1 0b0:2 rd:4>  <y:16>;
/*
 * dest ^= src
 * Source: Register addressing
 * Destination: Indirect addressing 
 */
XORi (rs rd ) <0b1110:4 rs:4 0b10:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest ^= src
 * Source: Register addressing
 * Destination: Indirect addressing
 * Byte form.
 */
XORbi (rs rd ) <0b1110:4 rs:4 0b10:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest ^= src
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing 
 */
XORii (rs rd ) <0b1110:4 rs:4 0b11:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest ^= src
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
XORbii (rs rd ) <0b1110:4 rs:4 0b11:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest ^= src
 * Source: Indexed addressing
 * Destination: Register addressing 
 */
XORx (rs rd  x) <0b1110:4 rs:4 0b0:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest ^= src
 * Source: Indexed addressing
 * Destination: Register addressing
 * Byte form.
 */
XORbx (rs rd x) <0b1110:4 rs:4 0b0:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest ^= src
 * Source: Indexed addressing
 * Destination: Indexed addressing 
 */
XORxy (rs rd  x y) <0b1110:4 rs:4 0b1:1 0b0:1 0b1:2 rd:4>  <x:16> <y:16>;

/*
 * dest ^= src
 * Source: Indexed addressing
 * Destination: Indexed addressing
 * Byte form.
 */
XORbxy (rs rd x y) <0b1110:4 rs:4 0b1:1 0b1:1 0b1:2 rd:4>  <x:16> <y:16>;
/*
 * dest ^= src
 * Source: Indexed addressing
 * Destination: Indirect addressing 
 */
XORxi (rs rd  x) <0b1110:4 rs:4 0b10:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest ^= src
 * Source: Indexed addressing
 * Destination: Indirect addressing
 * Byte form.
 */
XORbxi (rs rd x) <0b1110:4 rs:4 0b10:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest ^= src
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing 
 */
XORxii (rs rd  x) <0b1110:4 rs:4 0b11:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest ^= src
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
XORbxii (rs rd x) <0b1110:4 rs:4 0b11:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest &=- src
 * Source: Register addressing
 * Destination: Register addressing 
 */
AND (rs rd ) <0b1111:4 rs:4 0b0:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest &=- src
 * Source: Register addressing
 * Destination: Register addressing
 * Byte form.
 */
ANDb (rs rd ) <0b1111:4 rs:4 0b0:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest &=- src
 * Source: Register addressing
 * Destination: Indexed addressing 
 */
ANDy (rs rd  y) <0b1111:4 rs:4 0b1:1 0b0:1 0b0:2 rd:4>  <y:16>;

/*
 * dest &=- src
 * Source: Register addressing
 * Destination: Indexed addressing
 * Byte form.
 */
ANDby (rs rd  y) <0b1111:4 rs:4 0b1:1 0b1:1 0b0:2 rd:4>  <y:16>;
/*
 * dest &=- src
 * Source: Register addressing
 * Destination: Indirect addressing 
 */
ANDi (rs rd ) <0b1111:4 rs:4 0b10:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest &=- src
 * Source: Register addressing
 * Destination: Indirect addressing
 * Byte form.
 */
ANDbi (rs rd ) <0b1111:4 rs:4 0b10:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest &=- src
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing 
 */
ANDii (rs rd ) <0b1111:4 rs:4 0b11:1 0b0:1 0b0:2 rd:4> ;

/*
 * dest &=- src
 * Source: Register addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
ANDbii (rs rd ) <0b1111:4 rs:4 0b11:1 0b1:1 0b0:2 rd:4> ;
/*
 * dest &=- src
 * Source: Indexed addressing
 * Destination: Register addressing 
 */
ANDx (rs rd  x) <0b1111:4 rs:4 0b0:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest &=- src
 * Source: Indexed addressing
 * Destination: Register addressing
 * Byte form.
 */
ANDbx (rs rd x) <0b1111:4 rs:4 0b0:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest &=- src
 * Source: Indexed addressing
 * Destination: Indexed addressing 
 */
ANDxy (rs rd  x y) <0b1111:4 rs:4 0b1:1 0b0:1 0b1:2 rd:4>  <x:16> <y:16>;

/*
 * dest &=- src
 * Source: Indexed addressing
 * Destination: Indexed addressing
 * Byte form.
 */
ANDbxy (rs rd x y) <0b1111:4 rs:4 0b1:1 0b1:1 0b1:2 rd:4>  <x:16> <y:16>;
/*
 * dest &=- src
 * Source: Indexed addressing
 * Destination: Indirect addressing 
 */
ANDxi (rs rd  x) <0b1111:4 rs:4 0b10:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest &=- src
 * Source: Indexed addressing
 * Destination: Indirect addressing
 * Byte form.
 */
ANDbxi (rs rd x) <0b1111:4 rs:4 0b10:1 0b1:1 0b1:2 rd:4>  <x:16>;
/*
 * dest &=- src
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing 
 */
ANDxii (rs rd  x) <0b1111:4 rs:4 0b11:1 0b0:1 0b1:2 rd:4>  <x:16>;

/*
 * dest &=- src
 * Source: Indexed addressing
 * Destination: Indirect-autoincrement addressing
 * Byte form.
 */
ANDbxii (rs rd x) <0b1111:4 rs:4 0b11:1 0b1:1 0b1:2 rd:4>  <x:16>;

