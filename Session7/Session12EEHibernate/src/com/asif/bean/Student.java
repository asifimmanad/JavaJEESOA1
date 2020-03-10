package com.asif.bean;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity(name = "STUDENT")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "RNO")
	Integer rollno;
	
	@Column(name = "SNAME")
	String sname;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String sname) {
		super();
		this.rollno = rollno;
		this.sname = sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + "]";
	}
	
	
	
}
