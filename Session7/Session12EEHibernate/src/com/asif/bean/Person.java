package com.asif.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "PERSON")
public class Person {

	Integer pid;
	String name;

	Address addr;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(Integer pid, String name, Address addr) {
		super();
		this.pid = pid;
		this.name = name;
		this.addr = addr;
	}

	@Id
	@GeneratedValue
	@Column(name = "PID")
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Column(name = "NAME", nullable = false, length = 200)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToOne(cascade = CascadeType.ALL)
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", addr=" + addr + "]";
	}

}
