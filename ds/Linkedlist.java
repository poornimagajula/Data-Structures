package com.regnant.ds;

public class Linkedlist {
	Node head=null,current=null;
	public void add(int data)
	{
		Node n=new Node();
		n.data=data;
		if(head==null) {
			
			head=n;
			current=n;
		}
		else {
			current.next=n;
			current=n;
		}
						
	}
	// removing the last element
	/*public void removeLast() {
		Node n=head,temp=null;
		while(n!=null) {
			if(n.next==null) {
				temp.next=null;
		}
		temp=n;
		n=n.next;				
		}
	}*/
	//removing the element by passing data
	public void removeData(int data) {
		Node n=head,temp=null;
		while(n!=null) {
			if(data==head.data) {
				head=n.next;
			}else if(n.data==data) {
				temp.next=n.next;
			}
			temp=n;
			n=n.next;	
		}	
		if(n==null) {
			current=temp;
		}
	}
	//removing the element by using pos
	public void removePos(int p) {
		Node n=head,temp=null; 
		int pos=1;
		while(n!=null) {
			if(p==1) {
				head=n.next;
			}else if(pos==p) {
				temp.next=n.next;
			}
			pos++;
			temp=n;
			n=n.next;
		}
		if(n==null) {
			current=temp;
		}
	}
	public int maxele() {
		Node n=head,temp=null;
		int max=n.data;
		while(n!=null) {
			if(n.data>max) {
				max=n.data;
			}
			n=n.next;
		}
		return max;
	}
	public int minele() {
		Node n=head,temp=null;
		int min=n.data;
		while(n!=null) {
			if(n.data<min) {
				min=n.data;
			}
			n=n.next;
		}
		return min;
	}
	public int size() {
		int count=0;
		Node n=head,temp=null;
		while(n!=null) {
			count++;
			n=n.next;
		}
		return count;
		
	}
	
	public void display() {
		Node n=head;
		while(n!=null) {
			System.out.print(n.data+"\t");
			n=n.next;
		}
	}

}
