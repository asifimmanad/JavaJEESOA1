package com.edureka.Inheritance;

public class OverloadingDemo {

	private void add(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a + b;

		System.out.println(sum);
	}

	private void add(float a, int b) {
		// TODO Auto-generated method stub
		float sum = a + b ;

		System.out.println(sum);
		
		
	}

	public static void main(String[] args) {

		OverloadingDemo obj = new OverloadingDemo();
		obj.add(10, 20);
		obj.add(10, 20);

	}
}
