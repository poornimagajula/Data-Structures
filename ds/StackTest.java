package com.regnant.ds;

import java.util.Arrays;

public class StackTest {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.setStack();
		try {
			s.push(5);
			s.push(6);
			s.push(8);
			s.push(9);
			System.out.println(Arrays.toString(s.stk));
			System.out.println(s.pop()+" Deleted from Stack");
			System.out.println(s.pop()+" Deleted from Stack");
			System.out.println(s.pop()+" Deleted from Stack");
			System.out.println(s.pop()+" Deleted from Stack");
		}catch(StackOverFlowException e) {
			System.out.println(e);
		}catch(StackUnderFlowException e) {
			System.out.println(e);
		}
		System.out.println("Cursor Position:"+s.cursor);
		System.out.println(Arrays.toString(s.stk));
				
	}

}
