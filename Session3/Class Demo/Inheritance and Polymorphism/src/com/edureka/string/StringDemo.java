package com.edureka.string;

//import java.lang.*;

public class StringDemo {

	public static void main(String[] args) {

		String str1 = "Asif"; // pool
		String str2 = "Asif"; // pool
		String str3 = new String("Asif"); // heap
		String str4 = new String("asif");

		System.out.println(str1 == str2);	//address
		
		System.out.println(str2 == str3);

		System.out.println(str3 == str4);	//address
		
		System.out.println(str1.equals(str2));	// value
		
		System.out.println(str2.equals(str3));
		
		System.out.println(str3.equals(str4));	//false
		
		System.out.println(str3.equalsIgnoreCase(str4));	//true
		
		
	//	str1 = "Immanad";			// new string will be stored in diff address
		
	//	System.out.println(str1);
		
		
		str1 = str1.concat(" Immanad");

		
		System.out.println(str1);
		
		System.out.println(str1.charAt(2));
		
		
		
	}
}
