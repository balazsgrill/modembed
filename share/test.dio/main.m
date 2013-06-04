#!sequential.syntax
module main;

boolean TRUE = 1;
boolean FALSE = 0;

main(){
	boolean state;
	read_dio1(state)
	branch(state, true, false)
	true:
		write_dio2(TRUE)
		goto(end)
	false:
		write_dio2(FALSE)
		goto(end)
	end:
}
