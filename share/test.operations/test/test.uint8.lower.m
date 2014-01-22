seqmodule test.uint8.lower;

uint8 const0 = 0;
uint8 const5 = 5;
uint8 const100 = 100;

uint8 v1;
uint8 v2;
boolean r;

test1(){
	set(v1, const5)
	set(v2, const0)
	lower(r, v1, v2)
}

test2(){
	set(v1, const0)
	set(v2, const5)
	lower(r, v1, v2)
}

test3(){
	set(v1, const5)
	set(v2, const5)
	lower(r, v1, v2)
}

test1c(){
	set(v1, const5)
	lower(r, v1, const0)
}

test2c(){
	set(v1, const0)
	lower(r, v1, const5)
}

test3c(){
	set(v1, const5)
	lower(r, v1, const5)
}