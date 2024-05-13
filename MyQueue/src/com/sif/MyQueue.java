package com.sif;

import java.util.Arrays;
public class MyQueue {
	

	    private int maxSize;
	    private int[] StackArray;
	    private int top;
		private int[] stackArray;

	    public void Stack(int size) {
	        this.maxSize = size;
	        this.stackArray = new int[maxSize];
	        this.top = -1;
	    }

	    public void push(int value) {
	        if (top == maxSize - 1) {
	            System.out.println("Stack is full. Cannot push " + value);
	        } else {
	            stackArray[++top] = value;
	            System.out.println(value + " pushed into the stack");
	        }
	    }

	    public int pop() {
	        if (top == -1) {
	            System.out.println("Stack is empty. Cannot pop");
	            return -1;
	        } else {
	            int value = stackArray[top--];
	            System.out.println(value + " popped from the stack");
	            return value;
	        }
	    }

	    public static void main(String[] args) {
	        Stack stack = new Stack();
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);

	        stack.push(60); 

	        stack.pop();
	        stack.pop();
	        stack.pop();
	        stack.pop();
	        stack.pop();

	        stack.pop(); 
	    }
	}


