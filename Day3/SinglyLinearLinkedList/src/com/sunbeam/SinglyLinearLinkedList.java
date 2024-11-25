package com.sunbeam;

public class SinglyLinearLinkedList {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addFirst(50);
		
		list.display();
		
//		list.addLast(5);
//		
//		list.display();
		
//		list.addPosition(22, 3);
//		
//		list.display();
		
//		list.deleteFirst();
//		list.display();
		
//		list.deleteLast();
//		list.display();
		
		list.deletePosition(3);
		list.display();
	}

}
