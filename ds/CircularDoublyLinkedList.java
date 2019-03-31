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
		Node n=current;
		current=n.prev;
		current.next=head;
		
	}
	public int size() {
		int count=1;
		Node n=head;
		while(head!=n.next) {
			count++;
			n=n.next;
		}
		return count;
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
