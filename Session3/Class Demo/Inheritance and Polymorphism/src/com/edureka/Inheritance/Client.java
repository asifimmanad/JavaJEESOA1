package com.edureka.Inheritance;

//caller --> controller


public class Client {
	static int a = 10; // static can not be inheritaed

	public static void main(String[] args) {
//		Employee e = new Employee();
//		e.displayEmployee();

//		Employee e = new Employee(101, "asbhho", 987897);

		// parent reference and child object --> DMD pure polymorphic object
		// d type at compile time is employee
		// d type at runtime is developer
		Employee d = new Developer(110, "SuperMan", 20000, 1000, 2000, 5000); // developer --> employee
		d.display(); // compile time display is from employee
						// at runtime display is from developer

		d.displayEmployee();
//		d.displayDeveloper(); // compile time error

		Developer d1 = (Developer) d;
		d1.displayDeveloper();
		
	}
}
