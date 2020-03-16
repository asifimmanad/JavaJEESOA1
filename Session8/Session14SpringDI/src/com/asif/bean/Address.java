package com.asif.bean;

public class Address {

	String city;
	String street;
	String zip;

	public Address() {
		System.out.println("Address COn");	}

	public Address(String city, String street, String zip) {
		System.out.println("Address para COn");
		this.city = city;
		this.street = street;
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", zip=" + zip + "]";
	}

}
