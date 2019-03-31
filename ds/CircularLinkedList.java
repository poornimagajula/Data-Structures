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
	public void remove(int data) {
		Node n=head,temp=null;
		while(head!=n.next) {
			if(n.data==data) {
				head=n.next;
			}
			n.next=head;
		}
	}
	public int size(){
		Node n=head;
		int count=1;
		while(head!=n.next) {
			count++;
			n=n.next;
		}
		return count;
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
