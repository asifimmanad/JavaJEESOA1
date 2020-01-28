package com.edureka.session1;

public class IncrementOperatorDemo {

	public static void main(String[] args) {

		int n = 10;
		System.out.println(n); // 10
		n++; // postincrement
		System.out.println(n); // 11
		++n; // preincrement
		System.out.println(n); // 12

		System.out.println(n++); // 12
		System.out.println(n); // 13
		System.out.println(++n); // 14

		int age = 17;

		System.out.println(age > 18);

		System.out.println(age != 18); // =

		System.out.println(age == 20); // compare

		System.out.println(age <= 18);

		System.out.println(age < 18 && age == 17); // if both true then return true

		System.out.println(age > 18 || age == 17); // if any one condition is true then true

		int sum = 1;			//assignment  

	//	sum = sum + 1;

		sum += 1;  //-=, *=
		
		System.out.println(sum);
		
		if(sum == 10) {
			
		}
		
		
	}
}
