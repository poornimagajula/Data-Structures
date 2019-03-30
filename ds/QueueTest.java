package com.regnant.ds;

import java.util.Arrays;

public class QueueTest {

	public static void main(String[] args) {
		Queue q=new Queue();
		try {
		q.setQueue();
		q.push(1);
		q.push(2);
		q.push(3);
		System.out.println(q.pop()+ "Deleted fron Queue");
		q.push(4);
		System.out.println(q.pop()+ "Deleted fron Queue");
		q.push(5);
		q.push(6);
		System.out.println(q.pop()+ "Deleted fron Queue");
		System.out.println(q.pop()+ "Deleted fron Queue");
		System.out.println(q.pop()+ "Deleted fron Queue");
		System.out.println(q.pop()+ "Deleted fron Queue");
		
		}catch(QueueOverFlowException qofe) {
			System.out.println(qofe);
		}catch(QueueUnderFlowException qufe) {
			System.out.println(qufe);
		}
		System.out.println("Cursor Position:"+q.rear);
		System.out.println(Arrays.toString(q.que));

	}

}
