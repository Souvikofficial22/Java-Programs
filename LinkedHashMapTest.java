package com.monocept.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// creating
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		// updating
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		hm.replace(101, "Vinay");

		// reading

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		// deleting
		hm.remove(101);
		System.out.println(101);

	}

}
