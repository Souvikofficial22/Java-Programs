package com.monocept.test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		//Creating linked list
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//Updating the list
		list.add(1);
		list.addFirst(2);
		list.addLast(3);
		
		//reading the list
		for(int x : list)
			System.out.println(x);
		
		//Removing from the list
		list.remove();
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		
	}

}
