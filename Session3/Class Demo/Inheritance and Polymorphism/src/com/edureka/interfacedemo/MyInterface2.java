package com.edureka.interfacedemo;

public interface MyInterface2 extends MyInterface {

	void myMethod2();
	void display();
	
	default void display1() {
		
	}
	
	static void display2() {
		
	}
}
