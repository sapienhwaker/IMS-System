package com.cs.ds;

public class Real {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long abc = Long.MAX_VALUE;
		String s = Long.toBinaryString(abc);
		System.out.println(abc + "\nBinary Value: " + s + "\nLength: "+s.length());
	}

}
//9223372036854775807
//18446744073709551615
/*
byte 1 byte
short 2 bytes
int 4 bytes
long 8 bytes
float 4 bytes
double 8 bytes
*/