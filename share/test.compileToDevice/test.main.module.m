#!sequential.syntax
module test device pic16e.test.device;

const0 : uint8 = 5;
v1 : uint8@mainram = 0;

main{
	set(v1, const0)
}
