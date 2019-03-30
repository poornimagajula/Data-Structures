package com.regnant.ds;

public class CircularDoublyLinkedList {
	Node head=null,current=null;
	
	void add(int data) {
		Node n=new Node();
		n.data=data;
		if(head==null) {
			head=n;
			current=n;
		}else {
			n.prev=current;
			current.next=n;
			current=n;
			current.next=head;	
			head.prev=current;
		}
	}
	void queueRemove() {
		Node n=head;
		head=n.next;
		n.prev=current.next;
		current.next=head;	
		
	}
	void stackRemove() {
		
	}
	void display() {
		Node n=head;
		while(head!=n.next) {
			System.out.println(n.data+"\t");
			n=n.next;
		}
		System.out.println(n.data+"\t");
	}

}
