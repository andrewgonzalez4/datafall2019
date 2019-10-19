package edu.uprm.cse.ds.stack.maintest;

import edu.uprm.cse.ds.stack.ArrayStack;
import edu.uprm.cse.ds.stack.Stack;

public class StackTester {

	public static void main(String[] args) {
		ArrayStack<String> stacky = new ArrayStack<String>();
		stacky.push("Mami");
		stacky.push("Papi");
		stacky.push("Andy");
		stacky.push("Ednielys");
		stacky.push("Andy");
		stacky.push("Mama");
		
		deleteFromStack(stacky,"Andy");
		
		while(!stacky.isEmpty()) {
			System.out.println(stacky.pop());
		}
		
	
	}
	
	public static void deleteFromStack(ArrayStack<String> S, String obj) {
		ArrayStack<String> buffer = new ArrayStack<String>();
		while(!S.isEmpty()) {
			if(S.top().equals(obj)) {
				S.pop();
			}
			
			else {
				buffer.push(S.pop());
			}
		}
		
		S.clear();
		
		while(!buffer.isEmpty()) {
			S.push(buffer.pop());
		}
	
		
	}

}
