package com.monocept.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// Creating HashMap
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// updating
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");

		// reading
		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		map.remove(2);
		System.out.println(map);
	}

}
