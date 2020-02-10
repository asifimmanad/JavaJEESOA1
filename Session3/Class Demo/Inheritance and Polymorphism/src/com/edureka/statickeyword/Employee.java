package com.edureka.statickeyword;

public class Employee {

	static int employeeId;
	int employeeSalary;
	String employeeName;

	public Employee(String name, int salary) {
		// TODO Auto-generated constructor stub

		employeeId++;
		employeeSalary = salary;
		employeeName = name;
	}
	
	static {
		System.out.println("Static block1");
	}

	static void add(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a + b;

		System.out.println(sum);
	}

	private void displayEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Employee is:" + employeeId + employeeName + employeeSalary);
	}

	public static void main(String[] args) {

		System.out.println("Inside main");
		
		Employee e1 = new Employee("James Bond", 10000);
		e1.displayEmployee();

		Employee e2 = new Employee("BatMan", 20000);
		e2.displayEmployee();

		Employee e3 = new Employee("SuperMan", 15000);
		e3.displayEmployee();

		System.out.println(Employee.employeeId);
//		System.out.println(Employee.employeeName);

//		System.out.println(MyClass.myvar);

		System.out.println(e2.employeeId);

	//	Employee.displayEmployee();
		Employee.add(10, 20);
	}

}
