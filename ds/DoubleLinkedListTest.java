package com.regnant.ds;

public class DoubleLinkedListTest {

	public static void main(String[] args) {
		DoubleLinkedList dll=new DoubleLinkedList();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);
		dll.stackRemove();
		dll.queueRemove();
		dll.add(50);
		System.out.println("Double Linked List Elements are:");
		dll.display();

	}

}
