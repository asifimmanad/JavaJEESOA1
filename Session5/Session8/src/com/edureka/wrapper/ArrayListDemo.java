package com.edureka.wrapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> arr = new ArrayList<String>();

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Values:");

		// for (int i = 0; i < 3; i++) {
		// String name = sc.next();
		// arr.add(name);
		// }

		arr.add("BatMan"); // at index 0
		arr.add("SuperMan"); // at index 1
		arr.add("WonderWoman");
		arr.add("Hulk");
		arr.add("ShaktiMan");

		arr.add("SuperMan");
		arr.add("WonderWoman");

		// print data in arraylist
		System.out.println(arr);
		System.out.println("------For Loop------");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		System.out.println("------ForEach------");
		for (String str : arr) {
			System.out.println(str);
		}

		System.out.println("------Iterator------");

		Iterator<String> it = arr.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("------ListIterator------");

		ListIterator<String> it1 = arr.listIterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		System.out.println("------ListIterator Previous------");
		while (it1.hasPrevious()) {
			System.out.println(it1.previous());
		}

		System.out.println("Contains:" + arr.contains("Hulk"));

		boolean b = false;
		for (String string : arr) {
			if (arr.contains("Hulk")) {
				// arr.remove("Hulk");
				b = true;
			}
		}

		if (b == true) {
			arr.remove("Hulk");

		}

		// System.out.println("Removed:" + arr.remove("SuperMan"));

		System.out.println(arr);

		arr.set(3, "SpiderMan");

		System.out.println(arr);
		
		//arr.addAll(set) --> add any collection to collection
	}
}
