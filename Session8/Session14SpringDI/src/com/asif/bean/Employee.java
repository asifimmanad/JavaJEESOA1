package com.asif.bean;

public class Employee {

	int empId;
	String empName;

	Address addr; // dependency --> byName --> addr
					// byType --> ClassName

//	MyInterface my;

	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee COn");
	}

	public Employee(int empId, String empName, Address addr) {
		System.out.println("Employee para COn");
		this.empId = empId;
		this.empName = empName;
		this.addr = addr;

	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Address getAddr() {
		return addr;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", addr=" + addr + "]";
	}

	public void initMethod() {
		// TODO Auto-generated method stub
		System.out.println("initMethod");
	}

	public void destroyMethod() {
		// TODO Auto-generated method stub
		System.out.println("destroyMethod");

	}

}
