package com.regnant.ds;

public class DoubleLinkedList {
	Node head=null, current=null;

	// Adding the element "data" into the Double Linked List
	void add(int data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
		} else {
			n.prev = current;
			current.next = n;
			current = n;

		}
	}

	// Removing the data from Double Linked List
	void stackRemove() {

		// If we are following the Stack Mechanism
		Node n = current;
		current = n.prev;
		current.next = null;
	}

	void queueRemove() {

		// If we are following the Queue Mechanism
		Node n = head;
		head = n.next;
		head.prev = null;
	}
	public void remove(int p) {
		Node n=head,temp=null;
		int pos=0;
		while(n!=null) {
			if(pos==p) {
				temp.next=null;
			}
			temp=n;
			n=n.next;		
		}		
	}
	public void reverse() {
		Node n=current;
		System.out.println();
		while(n!=null) {
			System.out.print(n.data+"\t");
			n=n.prev;
		}
	}
	public int size() {
		Node n=head;
		int count=0;
		while(n!=null) {
			count++;
			n=n.next;			
		}
		return count;
	}

	// Displaying the Double Linked List Data
	void display() {

		Node n = head;
		while (n != null) {
			System.out.print(n.data + "   ");
			n = n.next;
		}
	}

}
