package com.edureka.demo;
//String final wrapper class are final
final class ParentClass {

	void show() {
		// TODO Auto-generated method stub

		int a = 10;
		a = 20;
		System.out.println("Show in Parent");
	}

	final static void show(int a) {
		// TODO Auto-generated method stub
		System.out.println("Show in Parent");
	}

}

public class FinalDemo  {

	/*
	 * @Override void show() { // TODO Auto-generated method stub
	 * System.out.println("Show in Parent"); }
	 */

	public static void main(String[] args) {

		final float pi = 3.14f; // constant

		final float pi1 = 3873f;

		System.out.println(pi);

		// pi = 2.37f; // compile time

		System.out.println(pi);

		ParentClass obj = new ParentClass();

		obj.show();

//		ParentClass.show();

	}

}
