package com.edureka.Inheritance;

//child
public class Developer extends Employee {

	int pf = 1000, tax = 3000, hra = 5000; // extends

	public Developer(int id, String name, int salary, int pf, int tax, int hra) {
		// TODO Auto-generated constructor stub
		super(id, name, salary); // call goes to parent class constructor must be first statement in con
		System.out.println("Developer COnstructor");

		this.pf = pf;
		this.tax = tax;
		this.hra = hra;

	}

	// extends //overridden
	@Override
	void display() {
		// TODO Auto-generated method stub

		int netSalary = (employeeSalary + pf + hra) - tax; // employeeSalary is reused

		System.out.println("Display Devloper:" + employeeId + " " + employeeName + " " + netSalary);
		displayDeveloper();
		System.out.println(Client.a);
	}

	void displayDeveloper() {
		// TODO Auto-generated method stub
		System.out.println("Display Developer");
	}
}
