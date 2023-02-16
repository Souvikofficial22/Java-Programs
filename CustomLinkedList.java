package com.monocept.model;

public class CustomLinkedList {
	private Node head;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
		}
		else {
			Node current = head;
			while(current.getNextNode()!=null) {
				current = current.getNextNode();
			}
			current.setNextNode(newNode);
		}
	}
	
	public void delete(int index) {
		Node current = head;
		if(current==null) {
			System.out.println("Nothing to delete.");
			return ;
		}
		if(index==1) {
			Node temp = head;
			head = temp.getNextNode();
			temp.setNextNode(null);
			return;
		}
		for(int i=0;i<index-2;i++) {
			current = current.getNextNode();
		}
		current.setNextNode(current.getNextNode().getNextNode());
	}
	
	public void display() {
		Node current = head;
		if(current == null) {
			System.out.println("Linked list is empty.");
			return;
		}
		
		while(current!=null) {
			System.out.print(current.getData()+" -> ");
			current = current.getNextNode();
		}
		System.out.println("null");
	}
}
