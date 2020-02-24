package com.edureka.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		// Java is OOP
		// int, char, float --> Integer, Character, Float
		// wrapper class --> primitive to object
		 
		int a = 10; // primitive data

		System.out.println(a);
		Integer i = new Integer(a); // i is object or wrapper over int a --> primitive to object

		System.out.println(i);

		// a.
		// i.

		int a1 = i.intValue(); // object to primitive

		// autoboxing --> 1.5 and above

		Integer i1 = a; // autoboxing --> auto primitive to objetc

		int a2 = i1; // autounboxing --> auto object to primitive

		//collections
		
		System.out.println(args[0]+args[1]);	//100+100 = 100100
		
		//setText
		//getText
		
		String str1 = args[0];
		String str2 = args[1];
		
		// parse methods to convert string to primitive data
		
		int b1 = Integer.parseInt(str1);	
		long l1 = Long.parseLong(str1);
		
		int b2 = Integer.parseInt(str2);	
		int sum = b1+b2;
		
		System.out.println(b1+b2);	// 100+100 = 200
		
		//valueOf method to convert Primitive to String
		String strsum = String.valueOf(sum);	
		
		//setText(strsum);
		
		System.out.println(strsum);
	}
}
