package com.sunbeam;

public class LinkedList {

	static class Node {

		private int data;
		private Node next, prev;

		public Node(int val) {
			data = val;
			next = prev = null;
		}

	}

	private Node head, tail;
	private int size;

	public LinkedList() {

		head = tail = null;
		size=0;
	}

	public boolean isEmpty() {

		return head == null && tail == null;
	}
	
	public int Size() {
		return size;
	}

	public void addFirst(int val) {

		Node newNode = new Node(val);

		if (head == null) {

			head = tail = newNode;
		} 
		else {

			newNode.next = head;

			head.prev = newNode;

			head = newNode;

		}
		size++;

	}
	
	
	
	public void addLast(int val) {
		
		Node newNode = new Node(val);
		
		if(head == null)
			head = tail = newNode;
		
		else {
			
			tail.next = newNode;
			
			newNode.prev = tail;
			
			tail = newNode;
		}
		
		size++;
		
	}
	
	public void addPosition(int val, int pos) {

		if(pos == 1) {
			addFirst(val);
			return;
		}
		
		if(pos == size) {
			addLast(val);
		return;
		}
		
		Node newNode = new Node(val);
		
		if(head == null)
			head =  tail = newNode;

		
		else {
			
			Node trav = head;
			
			for (int i = 1; i < pos-1; i++)
			trav = trav.next;
			
			newNode.next = trav.next;
			
			newNode.prev = trav;
			
			trav.next.prev = newNode;
			
			trav.next = newNode;
			
		}
		
		size++;
	}
	
	public void deleteFirst() {
		
		if(head == null)
			return;
		
		if(head == tail)
			head = tail = null;
		
		else {
			head = head.next;
			
			head.prev = null;
		}
		size--;
	}
	
	public void deleteLast() {
		
		if(head == null)
			return;
		
	    if(head == tail)
	    	head = tail = null;
	    
	    else {
	    	
	    tail = tail.prev;
	    
	    tail.next = null;
	    	
	    }
	    size--;
	}
	
	public void deletePosition(int pos) {
		
		if(pos < 1 || pos > size)
			return;
		
		if(pos == 1) {
			deleteFirst();
			return;
		}
		
		else if(pos == size) {
			deleteLast();
			return;
		}
		
		else {
			
			Node trav = head;
			
			for (int i = 1; i < pos-1; i++)
				trav = trav.next;
			
			trav.next = trav.next.next;
			
			trav.next.prev = trav;
			
		}
		size--;
	}
	

	public void display() {

		Node trav = head;

		System.out.print("Forward List: ");

		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}

		System.out.println();
	}

	
	public void backWard() {

		Node trav = tail;
		
		System.out.print("Backward List: ");

		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.prev;
		}
		System.out.println();

	}

}
