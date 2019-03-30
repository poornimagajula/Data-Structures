package com.regnant.ds;

import java.util.Arrays;
import java.util.Scanner;

public class Queue {
	int que[],front=0,rear=0,que_size,ele;
	Scanner s=new Scanner(System.in);
	
	public void setQueue() {
		
		System.out.println("Enter the Queue Size:");
		que_size=s.nextInt();
		que=new int[que_size];
		System.out.println(Arrays.toString(que));	
		
	}
	public void push(int ele) throws QueueOverFlowException {
		if(rear>=que.length) {
			throw new QueueOverFlowException("Insufficient Space");
		}
		que[rear]=ele;
		rear++;
		System.out.println("Queue:"+Arrays.toString(que));
	}
	public int pop() throws QueueUnderFlowException{
		
		rear=rear-1;
		if(rear<0) {
			throw new QueueUnderFlowException("There is no Elements in Queue");
		}		
		ele=que[front];
		for(int i=0,j=1;i<que.length-1&&j<que.length;i++,j++) {
				que[i]=que[j];
				
		}
		que[rear]=0;
		return ele;
	}
}
