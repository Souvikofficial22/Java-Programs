package com.monocept.test;

import com.monocept.model.*;

public class CustomLinkedListTest {

	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		
		list.add(1);
		list.add(2);
		list.add(5);
		
		list.display();
		
		list.delete(3);
		
		list.display();
	}

}
