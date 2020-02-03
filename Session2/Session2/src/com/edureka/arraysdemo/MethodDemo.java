package com.edureka.arraysdemo;

import java.util.Scanner;

public class MethodDemo {

	//need to call this method
	//2 types method --> non static and static 
	
	//return type --> ack --> void, int, float,  double, long or Object
	//result --> return type --> primitive data type or object
	//input --> parameters --> primitive data type or object
	private static void add(int a, int b) {

		int sum = a + b;
		System.out.println(sum);
		
	}
	/*
	 * Method to calculate area of square
	 * return type: int --> return 
	 * modifier   : no modifier --> non static --> static or final
	 * arguments  : length
	 */
	private int square(int l) {

		int area = l * l;
		
		return area;
	}

	//3.14* radius * radius
	private float areaCircle(int radius) {

		float area = 3.14f * radius * radius; 
		
		return area;
	}

	// main is also a method -> JVM is calling main
	public static void main(String[] args) {

		int anything1 = 10, anything2 = 50;
		
		add(anything1,anything2);		//caller of method add
		
		add(80,100);
		
		MethodDemo obj = new MethodDemo();	//keep this aside
		int area = obj.square(10);		//calling non static method
		
		System.out.println("Area of a Square is:"+area);
		
		//is to take input from user --> java.util.*; --> lib/API
		Scanner sc = new Scanner(System.in);	//system.in is to take input from console
		
		System.out.println("Enter radius of circle:");
		
		int radius=sc.nextInt();		//next methods float--> nextFloat
		
		sc.close(); 					//close the stream
		
		
		float area1 = obj.areaCircle(radius);		//caller of Circle method
		
		System.out.println("Area of a circle:"+area1);
		
	}
}
