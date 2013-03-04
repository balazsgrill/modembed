library e.platform;

/*
 * 8 bit literal, one byte
 */
type uint8 = unsigned 8 bits;

/*
 * one bit boolean value
 */
type bool = unsigned 1 bits;

type uint16 = unsigned 16 bits;

type uint24 = unsigned 24 bits;

type uint32 = unsigned 32 bits;

/*
 * the index of one bit in a byte
 */
type bit = unsigned 3 bits;

function ADD void(void a, void b){}

function ASSIGN void(void d, void s){}

function REFERENCE void(void d){}

/*
 * Infinite loop
 */
function loop void(lazy do void()){}
