#!platform:/resource/e.core/syntax/sequential.syntax.m
module test.uint16.greater;

uint16 const0 = 0;
uint16 const5 = 5;
uint16 const100 = 100;
uint16 const1000 = 1000;
uint16 const5000 = 5000;

uint16 v1;
uint16 v2;
boolean r;

test1(){
	set(v1, const5)
	set(v2, const0)
	greater(r, v1, v2) //1
}

test2(){
	set(v1, const0)
	set(v2, const5)
	greater(r, v1, v2) //0
}

test3(){
	set(v1, const5)
	set(v2, const5)
	greater(r, v1, v2) //0
}

test4(){
	set(v1, const1000)
	set(v2, const100)
	greater(r, v1, v2) //1
}

test5(){
	set(v1, const5000)
	set(v2, const1000)
	greater(r, v1, v2) //1
}

test6(){
	set(v1, const1000)
	set(v2, const5000)
	greater(r, v1, v2) //0
}