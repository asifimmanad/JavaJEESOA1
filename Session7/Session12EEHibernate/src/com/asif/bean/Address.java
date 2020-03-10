package com.asif.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ADDRESS")
public class Address {
	
	
	Integer aid;
	String city;
	Integer zip;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(Integer aid, String city, Integer zip) {
		super();
		this.aid = aid;
		this.city = city;
		this.zip = zip;
	}

	
	@Id
	@GeneratedValue
	@Column(name = "AID")
	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	@Column(name = "CITY", nullable = false, length = 200)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Column(name = "ZIP", nullable = false, length = 200)
	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", zip=" + zip + "]";
	}
	
	
}
