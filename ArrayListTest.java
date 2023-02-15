package com.monocept.test;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// Creating array list
		ArrayList<Integer> arr = new ArrayList<Integer>();

		// updating ArrayList
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		//Reading array list
		for(int x : arr)
			System.out.println(x);
		
		//deleting from arraylist
		arr.clear();
		
		System.out.println(arr);
		
	}

}
