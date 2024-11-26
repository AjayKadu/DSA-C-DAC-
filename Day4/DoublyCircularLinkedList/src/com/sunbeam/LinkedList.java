package com.sunbeam;

public class LinkedList {
	
	static class Node{
		
		private int data;
		private Node next,prev;
		
		public Node(int val) {
			data = val;
			next = prev = null;
			
		}
	}
	
	private Node head;
	private int size;
	
	public LinkedList() {
		head = null;
	}
	
	public int Size() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int val) {
		
		Node newNode = new Node(val);
		
		if(head == null) {
			head = newNode;
			
			newNode.next = newNode.prev = newNode;
		}
		else {
			
			newNode.next = head;
			
			newNode.prev = head.prev;
			
			head.prev.next = newNode;
			
			head.prev = newNode;
			
			head = newNode;
			
		}
		size++;
	}
	
	public void addLast(int val) {
		
		Node newNode = new Node(val);
		
		if(head == null) {
			head = newNode;
			newNode.next = newNode.prev = newNode;
		}
		else {
			
			newNode.next = head;
			
			newNode.prev = head.prev;
			
			head.prev.next = newNode;
			
			head.prev = newNode;
			
		}
		size++;
	}
	
	
	public void addPosition(int val, int pos) {
		
		if(pos < 1 || pos > size+1)
			return;
		
		Node newNode = new Node(val);
		
		if(pos == 1) {
			addFirst(val);
			return;
		}
		
		else if(pos == size+1) {
			addLast(val);
			return;
		}
		
	
		
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
		
		if(head.next == null)
			head = null;
		
		else {
		
		head.prev.next = head.next;
		
		head.next.prev = head.prev;
		
		head = head.next;
		}
		
		size--;
	}
	
	public void deleteLast() {
		
		if(head == null)
			return;
		
		if(head.next == null) 
			head = null;
			
		else {
			   
			  head.prev.prev.next = head;
			  
			  head.prev = head.prev.prev;
			}
		size--;
	}
	
	
	public void deletePosition(int pos) {
		
		if(pos < 1 || pos > size+1)
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
			
			
			trav.next.next.prev = trav;
			
			trav.next = trav.next.next;
			
			
			
			
		}
		
		size--;
		
	}
	
	
	
	
	
	public void displayForward() {
		
		if(head == null)
			return;
		
		Node trav = head;
		
		System.out.print("Forward: ");
		
		do {
		    
		System.out.print(" "+ trav.data);
		
		trav = trav.next;
			
		}
		while(trav != head);
		
		System.out.println();
		
	}
	
	public void displayBackward() {
		
		if(head == null)
			return;
		
		Node trav = head.prev;
		
		System.out.print("Backward: ");
		
		do {
			
			System.out.print(" "+ trav.data);
			
			trav = trav.prev;
				
		}
		while(trav != head.prev);
		
		System.out.println();
		
		
	}
	
	
	
	
	
	
	
	
	

}
