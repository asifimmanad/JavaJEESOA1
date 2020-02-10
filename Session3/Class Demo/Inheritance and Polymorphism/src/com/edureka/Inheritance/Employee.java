package com.edureka.Inheritance;

//parent
public class Employee {

	int employeeId = 101, employeeSalary = 10000;

	String employeeName = "James bond";

	public Employee(int id, String name, int salary) {
		// TODO Auto-generated constructor stub
		System.out.println("Employee Constructor");

		employeeId = id;
		employeeName = name;
		employeeSalary = salary;

	}

	void display() {
		// TODO Auto-generated method stub
		System.out.println("Employee is:" + employeeId + " " + employeeName + " " + employeeSalary);
		
		System.out.println(Client.a);
	}
	
	 void displayEmployee() {
		// TODO Auto-generated method stub
		 System.out.println("Display Employee");
	}

}
