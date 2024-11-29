package com.sunbeam;

public class BSTMain {

	public static void main(String[] args) {
	
		BSTree tr = new BSTree();
		
		tr.addNode(8);
		tr.addNode(3);
		tr.addNode(9);
		tr.addNode(23);
		tr.addNode(45);
		tr.addNode(4);
		tr.addNode(14);
		
		tr.inOrder();
		
		System.out.println(tr.binarySearch(23));

	}

}
