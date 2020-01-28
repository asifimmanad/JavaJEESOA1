package com.edureka.session1;

public class DataTypes {

	public static void main(String[] args) {

		byte b = 127; // -128 to 127

		int i = 123456789;

		long l1 = i; //

		System.out.println(l1);

		long l = 99999999999999l;

		System.out.println(l);

		float f = 74893.982738f; // 4 byte

		System.out.println(f);

		double d = 1476.89;	// 8 byte 

		System.out.println(d);

		char c = 'A';

		char c1 = 90; // ASCII value A-Z 65-90

		System.out.println(c);

		System.out.println(c1);

		char c2 = '\u0024'; // unicode of $

		System.out.println(c2);

		char c3 = '\u0905';

		System.out.println(c3);

		
		System.out.println(" "+c1+c2+c3);	//overloaded operator
		
		
		boolean bol = false;

		int x = 50;
		int y = 30;

		bol = x > y;

		System.out.println(bol );
		
		
	}
}
