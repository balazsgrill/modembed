#!sequential.syntax
program test;
symbol const1 : uint8;
symbol const2 : uint8;
symbol v1 : uint8;
symbol v2 : uint8;

set(v1, const1);
set(v2, const1);
add(v1, v2);
add(v2, const2);
