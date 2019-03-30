package com.regnant.ds;

public class CircularLinkedList {
	Node head=null,current=null;
	
	void add(int data) {
		Node n=new Node();
		n.data=data;
		if(head==null) {
			head=n;
			current=n;
		}else {
			current.next=n;
			current=n;
			current.next=head;
		}
	}
	void Queueremove() {
		Node n=head;
		head=n.next;
		current.next=head;
		
	}
	void display() {
		Node n=head;
		while(head!=n.next) {
			System.out.print(n.data+"\t");
			n=n.next;
		}
		System.out.print(n.data);
	}
	

}
