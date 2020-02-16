package com.edureka.exceptiondemo;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {

	private void display() {
		// TODO Auto-generated method stub

		System.out.println("Display");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number:");

		int a = sc.nextInt();

		System.out.println("Enter 2nd Number:");

		int b = sc.nextInt();

		ExceptionDemo obj = null; // default value

		try {

			int result = a / b; // arithmetic operation

			obj.display(); // NullPointerException

			System.out.println("Result:" + result); // executed?

		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();

		}catch (Exception e) {
			// TODO: handle exception

			System.out.println("Try Again!!!");

		}finally {	//resource release
			
		//	file.close();
		//	jdbc.close();
			System.out.println("Always execute!!!");
		}

		System.out.println("All is well!!! Go ahead!!!");

	}
}
