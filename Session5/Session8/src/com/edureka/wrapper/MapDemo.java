package com.edureka.wrapper;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		// key --> unique and sorted
		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(103, "Vadivu");

		map.put(102, "Sujatha");
		map.put(101, "Radhika");
		map.put(102, "Kushal");
		map.put(110, null);

		map.put(104, "Vijay");
		map.put(105, "Radhika");

		System.out.println(map);

		System.out.println(map.get(104));

		Iterator<Integer> it = map.keySet().iterator();
		// map.entrySet().iterator();

		while (it.hasNext()) {
			int i = it.next();
			System.out.println(i + " : " + map.get(i));
		}

//		Set<Entry<Integer, String>> entry = map.entrySet();

//		Iterator<Entry<Integer, String>> it1 = entry.iterator();

		Iterator<Entry<Integer, String>> it1 = map.entrySet().iterator();

		while (it1.hasNext()) {
			Entry<Integer, String> entry1 = it1.next();
			System.out.println(entry1.getKey() + entry1.getValue());
		}

	}

}
