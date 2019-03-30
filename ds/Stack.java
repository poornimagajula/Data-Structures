package com.regnant.ds;
import java.util.Scanner;
public class Stack {
	int stk[],cursor=0,stk_size,ele;
	Scanner s=new Scanner(System.in);
	
	public void setStack() {
		System.out.println("Enter the Stack size:");
		stk_size=s.nextInt();
		stk=new int[stk_size];
	}
	
	public void push(int ele) throws StackOverFlowException {
		
			if(cursor == stk.length) {
				throw new StackOverFlowException("Stack Overflow ");
			}
			stk[cursor]=ele;
			cursor++;
			
			//System.out.println("Stack:"+Arrays.toString(stk));
	}
	
	public int pop()throws StackUnderFlowException{
		int ele;
		cursor=cursor-1;
		if(cursor<0) {
			throw new StackUnderFlowException("Stack Underflow");
		}
		else {
			
			ele=stk[cursor];
			stk[cursor]=0;
		}		
		return ele;
	}
}
