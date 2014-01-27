module test.control;

global uint8 r;

global void test1(){
	var boolean b;
	r = 0;
	b = 0;
	
	if (b){
		r = 1;
	}else{
		r = 2;
	}
}

global void test2(){
	var boolean b;
	r = 0;
	b = 1;
	
	if (b){
		r = 1;
	}else{
		r = 2;
	}
}