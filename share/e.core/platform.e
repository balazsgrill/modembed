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

function ASSIGN void(void d, void s){}
function ASSIGNADD void(void a, void b){}
function ASSIGNSUBTRACT void(void a, void b){}

function AND void(void a, void b){}
function OR void(void a, void b){}

function DIV void(void a, void b){}
function MOD void(void a, void b){}
function MUL void(void a, void b){}

function ADD void(void a, void b){}

function MINUS void(void a, void b){}

function REFERENCE void(void d){}
function DEREFERENCE void(void d){}
function NOT void(void d){}
function UNARY_MINUS void(void d){}

function EQUALS void(void a, void b){}
function GT void(void a, void b){}
function LT void(void a, void b){}
function NOTEQUALS void(void a, void b){}
function GTE void(void a, void b){}
function LTE void(void a, void b){}

/*
 * Infinite loop
 */
function loop void(lazy do void()){}

/*
 * Conditional
 */
function if void(bool condition, lazy do void()){}

/*
 * IF-ELSE structure
 */
function ifelse void(bool condition, lazy do void(), lazy dofalse void()){}
