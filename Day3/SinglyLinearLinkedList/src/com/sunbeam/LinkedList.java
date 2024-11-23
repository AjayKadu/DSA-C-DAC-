package com.sunbeam;

public class LinkedList {
	
	private Node head, trav;

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
		
		   trav = head;
		
		while(trav != null) {
			System.out.print(" " +trav.data);
			trav = trav.next;
		}
	}
	
	public void addLast(int val) {
		
		if(head == null)
			addFirst(val);
		
		else {
			
			Node newNode = new Node(val);
			
			while(trav != null) {
				trav=trav.next;
			}
			
			newNode.next = trav;
			trav.next = newNode;
			
			
		}
			
	}
	
}
