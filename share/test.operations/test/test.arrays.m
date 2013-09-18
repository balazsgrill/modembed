#!module.syntax
module test.arrays;

const uint8 bufferSize = 16;

uint8[bufferSize] buffer;

global void test1(){
	var uint8 i = 0;
	loop while (i<bufferSize){
		buffer[i] = i;
		i = i + 1;
	}
}

