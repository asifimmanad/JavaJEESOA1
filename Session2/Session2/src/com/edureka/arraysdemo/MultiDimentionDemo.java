package com.edureka.arraysdemo;

public class MultiDimentionDemo {

	public static void main(String[] args) {

		int populationOfState1[] = { 4327, 98273, 827823 };

		int populationOfState2[] = { 3545, 23134, 67543 };

		int[] populationOfState3 = { 245435, 65776, 76544 };
		
		
		
		
		
		

		int populationOfCountry[][] = { // 3 rows and 5 columns
				{ 4327, 98273, 827823,8678 }, 
				{ 3545, 23134, 67543, 6896, 9098 }, 
				{ 245435, 65776, 76544 } 
				};

		System.out.println(populationOfCountry.length); // 3
		System.out.println(populationOfCountry); // address
		System.out.println(populationOfCountry[0].length); // 3
		System.out.println(populationOfCountry[1][1]); // 23134

		int sum = 0;

	

		for (int i = 0; i < populationOfCountry.length; i++) {	//run for 3 times
			for (int j = 0; j < populationOfCountry[i].length; j++) {
				System.out.println(populationOfCountry[i][j]);
			}
		}
		
		
		
		
		
	}
}
