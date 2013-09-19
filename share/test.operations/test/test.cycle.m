#!module.syntax
module test.cycle;

const uint8 max = 16;
global uint8 i;

global void test1(){
	i = 0;
	loop while (i<max){
		i = i + 1;
	}
}