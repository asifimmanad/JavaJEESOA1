package com.edureka.arraysdemo;


public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int arizonaDem = 126;
		int arizonaRep = 152;
		
		int floridaDem = 32;
		int floridaRep = 85;
		
		int vermontDem = 230;
		int vermontRep = 121;
		
		int voteDem[] = {126, 32, 230, 21, 200};	//array --> multivalue container size = 5 index starts with 0
		int voteRep[] = {152, 85, 121, 215, 13};	//array for rep party
		
		System.out.println(arizonaDem);	//126
		System.out.println(voteDem);	//address of array
		System.out.println(voteDem[0]);	//126
		
		System.out.println(voteRep[2]);	//121
		
	//	System.out.println(voteDem[5]);	//execption arryindexoutofbonds
		
		System.out.println(voteDem.length);
		
		int voteDem1[] = new int[5];	//empty array of length 5
										//collections can grow dynamically --> arraylist
		
		voteDem1[0] = 567;
		voteDem1[1] = 343;
		voteDem1[2] = 678;
		voteDem1[3] = 767;
		voteDem1[4] = 355;
		
		for (int i = 2; i < voteDem1.length-1; i++) {
			
			if(voteDem1[i] > 500) {
				
				System.out.println(voteDem1[i]);
			}
			
		}
		
		System.out.println("For each:");
		//foreach --> java 5  --> for(int i = 0; i < voteDem1.length; i++ )
		//no index
		//increment only by 1 index start with 0 till the length 
		//for arrays and collection to traverse from start to end
		for (int var : voteDem1) {
			System.out.println(var);
		}
		
		
		
		
	}
}
