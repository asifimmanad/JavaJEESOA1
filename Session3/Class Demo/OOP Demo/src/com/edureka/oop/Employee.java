package com.edureka.oop;

public class Employee {

	int employeeId, employeeSalary;
	
	// empId and empSal local varaibles
	public Employee(int empId, int empSal) {

		System.out.println("Para Constructor");
		System.out.println(empId + empSal);
	}

	// constructor overloading
	public Employee() {
		// TODO Auto-generated constructor stub

		System.out.println("Default Constructor");
	}

	/*
	 * private void initEmployee(int empId, int empSal) { // TODO Auto-generated
	 * method stub
	 * 
	 * employeeId = empId; employeeSalary = empSal; }
	 */

	private void calculateSalary() {

		int pf = 5000;
		int hra = 20000;
		int grossSalary = employeeSalary + pf + hra;

		System.out.println("Employee Salary is:" + employeeId + " - " + grossSalary);
	}

	// non static method --> instance method
	private void displayEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Employee details are:" + employeeId + " : " + employeeSalary);
	}

	// client / controller
	public static void main(String[] args) {

		// default values --> 0,false,null

		Employee emp; // reference
		emp = new Employee(101, 100000); // new keyword to create object in heap --> Object or instance

		// emp.initEmployee(101, 100000);
		emp.calculateSalary();
		emp.displayEmployee(); // caller method call

	}
}
