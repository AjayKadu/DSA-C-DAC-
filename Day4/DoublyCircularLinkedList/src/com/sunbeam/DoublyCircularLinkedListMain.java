package com.sunbeam;

public class DoublyCircularLinkedListMain {

	public static void main(String[] args) {
		
	  LinkedList li = new LinkedList();
	  
	  li.addFirst(50);
	  li.addFirst(40);
	  li.addFirst(30);
	  li.addFirst(20);
	  li.addFirst(10);
	  
	  li.displayForward();
	  li.displayBackward();
	  
	 // li.addLast(60);
	  
	  //li.addPosition(70, 4);
	  
	  //li.deleteFirst();
	  
	  //li.deleteLast();
	  
	  li.deletePosition(6);
	  
	  li.displayForward();
	  li.displayBackward();
	  

	}

}
