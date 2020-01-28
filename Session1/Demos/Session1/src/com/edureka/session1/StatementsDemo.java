package com.edureka.session1;

public class StatementsDemo {

	public static void main(String[] args) {

		int age = 17;

		if (age >= 18) // true
		{
			System.out.println("Age greater than 18!!! Go vote..!!!");
		} else { // false
			System.out.println("No Voting Rights!!!");
		}

		/*
		 * if avg is > 80 then grade A ; if avg is <80 and >=60 then grade B if avg is
		 * <60 and >=40then grade C else fail
		 */
		int ph = 10;
		int ch = 10;
		int mt = 20;

		int avg = (ph + ch + mt) / 3;

		System.out.println(avg);

		if (avg >= 80) { // greater than 80
			System.out.println("Grade A is awarded for avg. " + avg);
		} else if (avg >= 60 && avg < 80) { // between 60 and 80
			System.out.println("Grade B is awarded for avg. " + avg);
		} else if (avg >= 40 && avg < 60) { // between 40 and 60
			System.out.println("Grade C is awarded for avg. " + avg);
		} else { // less than 40
			System.out.println("Grade D is awarded for avg. " + avg + "Failed..!!!");
		}

		String str = "Monday"; // jdk 7 and above

		switch (str) {
		case "Sunday":

			System.out.println("Sunday");
			break;
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;

		default:
			System.out.println("Invalid day");

		}

	}
}
