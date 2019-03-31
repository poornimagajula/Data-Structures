package com.regnant.ds;

public class CircularLinkedListTest {

	public static void main(String[] args) {
		CircularLinkedList cll=new CircularLinkedList();
		cll.add(10);
		cll.add(20);
		cll.add(30);
		cll.add(40);
		cll.Queueremove();
		cll.remove(20);
		System.out.println("Circular Linked List: ");
		cll.display();
		System.out.println("\nSize of the Circular Linked List:"+cll.size());
	}

}
