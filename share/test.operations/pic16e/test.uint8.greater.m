#!platform:/resource/e.core/syntax/sequential.syntax.m
module test.uint8.greater device pic16e.test.device;

uint8 const0 = 0;
uint8 const5 = 5;
uint8 const100 = 100;

uint8 v1;
uint8 v2;
boolean r;

test1(){
	set(v1, const5)
	set(v2, const0)
	greater(r, v1, v2)
}