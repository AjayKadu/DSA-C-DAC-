package com.sunbeam;

public class SingleCircularLinkedListMain {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
//		list.addLast(70);
//		
		list.display();
		
//		list.addPosition(60, 6);
//		
//		list.display();
		
//		list.deleteFirst();
//		
//		list.display();
		
//		list.deleteLast();
//		
//		list.display();
		
		list.deletePosition(4);
		list.display();

	}

}
