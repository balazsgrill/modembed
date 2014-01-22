seqmodule test.math;

uint8 const0 = 0;
uint8 const5 = 5;

uint8 v1;
uint8 v2;

add_test1(){
	set(v1, const0)
	set(v2, const5)
	add(v1, v2)
}

add_test2(){
	set(v1, const5)
	set(v2, const5)
	add(v1, v2)
}

add_test1c(){
	set(v1, const0)
	add(v1, const5)
}

add_test2c(){
	set(v1, const5)
	add(v1, const5)
}
