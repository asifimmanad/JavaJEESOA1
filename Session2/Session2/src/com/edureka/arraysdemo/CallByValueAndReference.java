package com.edureka.arraysdemo;

public class CallByValueAndReference {

	private static void add(int a, int b) {

		a = 300;

	}

	private static void callByReference(int arr[]) {
		// TODO Auto-generated method stub
		arr[1] = 777;
	}

	public static void main(String[] args) {

		int a = 10, b = 20;
		
		add(a, b); // call by value

		System.out.println(a);		//

		int array[] = { 10, 20, 30 };

		callByReference(array); // call by reference --> If you pass array or object

		System.out.println(array); // address
		
		System.out.println(array[1]);
	}
}
