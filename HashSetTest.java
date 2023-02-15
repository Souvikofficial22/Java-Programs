package com.monocept.test;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		//creating hashset
		HashSet<String> set = new HashSet<String>();
		
		//updating hashset
		set.add("souvik");
		set.add("souvik");
		set.add("abhi");
		
		//reading set
		for(String name : set)
			System.out.println(name);
		
		//deleting from hash set
		set.remove("souvik");
		System.out.println(set);
		
	}

}
