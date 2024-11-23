package com.sunbeam;

public class Stack {
	
	private int []arr;
	private int top;
	private final int SIZE;
	
	public Stack(int size) {
		SIZE = size;
		arr = new int[size];
		top = -1;
	}
	
	public void push(int value) {
		arr[++top] = value;
	}
	
	public int pop() {
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
	    return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE-1;
	}

}
