package com.asif.bean;

public class Employee {

	Integer eid;
	String ename;
	String email;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer eid, String ename, String email) {
		
		this.eid = eid;
		this.ename = ename;
		this.email = email;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + "]";
	}
	
	
}
