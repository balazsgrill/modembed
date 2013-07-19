#!platform:/resource/e.core/syntax/sequential.syntax.m
module test.bitops;

boolean false = 0;
boolean true = 1;
uint8 b0 = 0;
uint8 b1 = 1;
uint8 b2 = 2;
uint8 b3 = 3;
uint8 b4 = 4;
uint8 b5 = 5;
uint8 b6 = 6;
uint8 b7 = 7;
uint8 const0 = 0;
uint8 const255 = 255;

uint8 v;
boolean r;

test1(){
	set(v, const255)
	setbit(v, b0, false)
	getbit(v, b0, r)
}

test2(){
	set(v, const255)
	setbit(v, b3, false) 
	getbit(v, b2, r)
}

test3(){
	set(v, const0)
	setbit(v, b0, true) 
	getbit(v, b0, r)
}

test4(){
	set(v, const0)
	setbit(v, b3, true)
	getbit(v, b1, r)
}