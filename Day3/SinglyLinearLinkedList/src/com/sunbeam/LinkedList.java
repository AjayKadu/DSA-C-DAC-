package com.sunbeam;

public class LinkedList {
	
	private Node head;

	static class Node{
		
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
		}
		
	}
	
	public LinkedList() {
	   head = null;
	
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int val) {
		
		Node newNode = new Node(val);
		
		newNode.next = head;
		head = newNode;
		
	}
	
	public void display() {
		
		if(head == null)
			return;
		
		  Node trav = head;
		
		while(trav != null) {
			System.out.print(" " +trav.data);
			trav = trav.next;
		}
		
		System.out.println();
	}
	
	public void addLast(int val) {
		
		Node newNode = new Node(val);
		
		if(head == null)
			head = newNode;
		
		else {
			
			Node trav=head;
			
			while(trav.next != null) {
				trav=trav.next;
			}
			
			trav.next = newNode;
			
			
		}
			
	}
	
	public void addPosition(int val, int pos) {
		
		Node newNode = new Node(val);
		
		if(head == null)
			head = newNode;
		else if(pos <= 1)
			addFirst(val);
		else {
			
			Node trav = head;
			
			for(int i=1; i<pos-1 && trav.next != null; i++) 
				trav = trav.next;	
			
			
			newNode.next = trav.next;
			trav.next = newNode;
			
		}
	}
	
	
	public void deleteFirst() {
		
		if(head == null)
			return;
		
		head = head.next;
		
	}
	
	
	public void deleteLast() {
		
		
		if(head == null) {
			return;
		}
		
		else if(head.next == null) {
			deleteFirst();
			return;
		}
		else {
			
			Node trav = head;
			
			while(trav.next.next != null) {
				trav = trav.next;
			}
			
			trav.next = null;
		}
		
	}
	
	public void deletePosition(int pos) {
		
		if(head == null)
			return;
		else if(head.next == null) {
			deleteFirst();
			return;
		}
		else {
			
			Node trav = head;
			
			for (int i = 1; i < pos-1; i++)
				trav = trav.next;
			
			trav.next = trav.next.next;
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
