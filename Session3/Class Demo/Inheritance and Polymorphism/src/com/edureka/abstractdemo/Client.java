package com.edureka.abstractdemo;



public class Client {

	public static void main(String[] args) {

		int a = 10;
		
		long l = a;
		
//		Shape s = new Shape();		//no object
		
		Shape s = new Circle(10);	// parent reference and child object
		
		Circle s1 = new Circle(10);

	//	s.area();
		s1.area();
		
		s = new Square();
		
		
	}
}
