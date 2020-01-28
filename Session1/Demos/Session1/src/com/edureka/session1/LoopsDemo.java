package com.edureka.session1;

public class LoopsDemo {

	public static void main(String[] args) {

		int num = 5;

		int i = 1;

		System.out.println(num * i); // 5
		i++;
		System.out.println(num * i); // 10
		i++;
		System.out.println(num * i); // 15
		i++;
		System.out.println(num * i); // 20
		i++;
		System.out.println(num * i);
		i++;
		System.out.println(num * i);
		i++;
		System.out.println(num * i);
		i++; // i = 10
		System.out.println(num * i);

		System.out.println("While loop to print table of 5");

		i = 1;
		while (i <= 10) { // condition is checked at the start or at entry
			System.out.println(num * i);
			i++;
		}

		System.out.println("Do While loop to print table of 5");
		i = 1;
		do { // condition is checked at the end
			System.out.println(num * i);

			i++;
		} while (i == 10);

//		for(init; condition; inr or dcr)
		System.out.println("For Loop to print table of 5");

		for (int j = 1; j <= 10; ++j) { // traverse over arrays

			System.out.println(num * j);

		}

	}
}
