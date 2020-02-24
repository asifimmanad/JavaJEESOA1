package com.edureka.wrapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// sorting and unique
		Set<String> arr = new TreeSet<String>();

		arr.add("BatMan");
		arr.add("SuperMan");
		arr.add("WonderWoman");
		arr.add("Hulk");
		arr.add("ShaktiMan");

		arr.add("SuperMan");
		arr.add("WonderWoman");

		// print data in arraylist
		System.out.println(arr);

		System.out.println("------ForEach------");
		for (String str : arr) {
			System.out.println(str);
		}

		System.out.println(arr.contains("ShaktiMan"));
		System.out.println(arr);

		Iterator<String> it = arr.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		List<String> arr1 = new ArrayList<String>();
		
		arr1.add("Umesh");
		arr1.add("Siva");
		arr1.add("Rangarajan");
		
		System.out.println(arr1);
		
		arr1.addAll(arr);
		
		System.out.println(arr1);
		
	}
}
