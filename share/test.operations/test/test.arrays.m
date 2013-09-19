#!module.syntax
module test.arrays;

const uint8 bufferSize = 16;

global uint8[bufferSize] buffer;
global uint8 sum;

global void test1(){
	var uint8 i = 0;
	loop while (i<bufferSize){
		buffer[i] = i;
		i = i + 1;
	}
}

global void test2(){
	test1();
	sum = 0;
	loop while (i<bufferSize){
		sum = sum + buffer[i];
		i = i + 1;
	}
}

