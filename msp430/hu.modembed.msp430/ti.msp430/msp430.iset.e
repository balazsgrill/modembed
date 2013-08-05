instructionset msp430.instructions;

/*
 * Addressing modes:
 * 00 : Register direct
 * 01 : Register indexed
 * 10 : Register indirect
 * 11 : Register indirect autoincrement
 */
 
/*
 * Three forms of instruction:
 * SO : Single-operand
 * RJ : Relative jump
 * DO : Double-operand
 */
 
 /*
  * Signle-operand instruction:
  * o : opcode
  * d : Addressing mode
  * r : Destination register
  * x : X argument (depends on d)
  * b : Byte-mode
  */
SO o d r x=0 b=0 <b000100:6 $o:3 $b:1 $d:2 $r:4> <$x:16> ? d & 1 = 1 
 
 /*
  * Relative jump instruction:
  * c : condition
  * o : offset
  */
RJ c o <b001:3 $c:3 $o:10>
 
 /*
  * Double-operand instruction:
  * o : opcode
  * r : source reg
  * a : source addressing mode
  * w : destination reg
  * d : destination addressing mode
  * x : Source argument
  * y : Destination argument
  * b : Byte-mode
  */
 DO o r a w d x=0 y=0 b=0 <$o:4 $r:4 $d:1 $b:1 $a:2 $w:4> <$x:16> ? a & 1 = 1 <$y:16> ? d & 1 = 1