package com.edureka.abstractdemo;

public class Circle extends Shape {

	int r;

	public Circle(int r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		float area = 3.14f * r * r;

		System.out.println("Area of a circle is:" + area);
	}
}
