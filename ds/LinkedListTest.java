package com.regnant.ds;

public class LinkedListTest {

	public static void main(String[] args) {
		Linkedlist l=new Linkedlist();
		l.add(10);
		l.add(20);
		l.add(30);
		l.removeData(10);
		l.add(40);
		l.add(50);
		l.removePos(4);		
		l.add(60);
		l.removePos(60);
		l.add(70);
		l.add(80);
		//l.removePos(5);	
		//l.removeData(10);
		System.out.println("Max Element: "+l.maxele());
		System.out.println("Min Element: "+l.minele());
		System.out.println("Size of the Linkedlist: "+l.size());
		System.out.print("Linked List Data: ");
		
		l.display();
		

	}

}
