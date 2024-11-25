package com.sunbeam;

public class LinkedList {

	static class Node{
		
		private int data;
		private Node next;
		
		public Node(int val) {
			data = val;
			next = null;
		}
	}
	
	private Node head,tail;
	private int size;
	
	
	public LinkedList() {
		head = tail = null;
		size=0;
	}
	
	public boolean isEmpty() {
		return head == null && tail ==null;
	}
	
	
	public int Size() {
		return size;
	}
	
	
	public void addFirst(int val) {
		
		Node newNode = new Node(val);
		
		if(head == null) {
			
			head = tail = newNode;
			
			tail.next = head;
		}
		else {
			
			newNode.next = head;
			
			tail.next = newNode;
			
			head = newNode;
			
		}
		
		size++;
		
	}
	
	
	public void addLast(int val) {
		
		Node newNode = new Node(val);
		
		if(head == null) {
		    
			head = tail = newNode;
			
			tail.next = head;
			
		}
		else {
			
			newNode.next = head;
			
			tail.next = newNode;
			
			tail = newNode;
			
		}
		
		size++;
		
	}
	
	public void addPosition(int val, int pos) {
		
		if(pos < 1 || pos > size + 1)
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
		      
		      trav.next = newNode;
		}
		
		size++;
		
	}
	
	public void deleteFirst() {
		
		if(head == null)
			return;
		
		else if(head.next == null)
			head = tail = null;
		
		else {
			
			tail.next = head.next;
			
			head = head.next;	
		}
		
		size--;
	}
	
	public void deleteLast() {
		
		if(head == null)
			return;
		
		else if(head == tail)
			head = tail = null;
		
		else {
			
			Node trav = head;
			
			while(trav.next.next != head)
				trav = trav.next;
			
			trav.next = head;
			
			tail = trav;
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
		
		if(pos > size) {
			deleteLast();
			return;
		}
		
		if(head == null)
			return;
		
		else if(head == tail)
			head = tail = null;
		
		else {
			
			Node trav = head;
			
			for (int i = 1; i < pos-1; i++)
				trav = trav.next;
			
			trav.next = trav.next.next;
			
		}
		
		size--;
		
	}
	
	
	
	
	
	
	
	
	public void display() {
		
		if(head == null)
			return;
		
		System.out.print("List :: ");
		
		Node trav = head;
		
		do {
			
			System.out.print(" "+trav.data);
			trav = trav.next;
		
			
		}
		while(trav != head);
		
		System.out.println();
		
	}
	
}
