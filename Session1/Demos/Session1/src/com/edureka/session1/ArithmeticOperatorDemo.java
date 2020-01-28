package com.edureka.session1;

public class ArithmeticOperatorDemo {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int sum = a + b; // logic --> data(a,b) and operator(+)

		System.out.println(sum);

		System.out.println(10 / 3); // 3

		System.out.println(10.0 / 3); // 3.3333333333
		System.out.println(-10 / 3); // -3
		System.out.println(10 % 3); // 1
		System.out.println(-10 % 3); // -1

		System.out.println(0 / 10); // 0
//		System.out.println(10 / 0); // exception

		System.out.println(10.00 / 0);	//Infinity

	}
}
