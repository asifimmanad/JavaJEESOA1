package com.edureka.wrapper;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		// unique --
		HashSet<String> arr = new HashSet<String>();
		// equals --> true dont add

		arr.add("BatMan");
		arr.add("SuperMan");
		arr.add("WonderWoman");
		arr.add("Hulk");
		arr.add("ShaktiMan");

		arr.add("SuperMan");
		arr.add("WonderWoman");

		System.out.println(arr);

		Employee e1 = new Employee(102, "BatMan", 78078);
		Employee e2 = new Employee(101, "Hulk", 868978);
		Employee e3 = new Employee(102, "BatMan", 78078);

		HashSet<Employee> arr1 = new HashSet<Employee>();

		arr1.add(e1);		// first it checks hash bucket (HashCode) and then equals
		arr1.add(e2);
		arr1.add(e3);

		System.out.println(arr1);
		
		System.out.println(e1.equals(e3));	// diff address
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());

	}
}
