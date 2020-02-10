package com.edureka.arithmetic;

public class PackageDemo {

	private int a = 10;
	
	
	
	public PackageDemo() {
		// TODO Auto-generated constructor stub
		System.out.println("Package Demo constructor");
	}
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show");
	}

	public static void main(String[] args) {

		PackageDemo obj = new PackageDemo();
		System.out.println(obj.a);
		obj.show();
	}
}
