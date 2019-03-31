package com.regnant.ds;

public class CircularDoublyLinkedListTest {

	public static void main(String[] args) {
		CircularDoublyLinkedList cdll=new CircularDoublyLinkedList();
		cdll.add(10);
		cdll.add(20);
		cdll.add(30);
		cdll.queueRemove();
		cdll.stackRemove();
		cdll.add(40);
		System.out.println("Circular Doubly Linked List :");
		cdll.display();
		System.out.println("Size of the Circular Doubly Linked List: "+cdll.size());
	}
	

}
