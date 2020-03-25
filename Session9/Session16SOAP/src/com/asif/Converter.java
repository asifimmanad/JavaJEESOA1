package com.asif;

public class Converter {

	public String sayHello() {

		return "Hello From sayHello Service!!!";
	}

	public int dollarToRupees(int d) {

		int rupees = d * 75;

		return rupees;

	}

	public int mtrsToCms(int mtrs) {

		int cms = mtrs * 100;

		return cms;
	}

}
