package com.sunbeam;

public class BSTree {
	
	static class Node{
		
		private int data;
		private Node left, right;
		
		public Node(int val) {
			
			data = val;
			left = right = null;
		}
		
	}
	
	private Node root;
	
	public BSTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void addNode(int val) {
		
		if(root == null)
		 root = new Node(val);
		else {
			addNodeTree(val, root);
		}
		
		
		
	}

	private void addNodeTree(int val, Node trav) {
		
		if(val < trav.data) {
			
			if(trav.left == null) 
				trav.left = new Node(val);
			else {
					addNodeTree(val,trav.left);
				}
		}
		
		else {
			
			if(trav.right == null)
				trav.right = new Node(val);
			else {
				addNodeTree(val, trav.right);
			}
		}
		
	}
	
	
	public boolean binarySearch(int key) {
		
		Node trav = root;
		
		if(root == null)
			return false;
		
		while(trav != null) {
		
		if(key == trav.data) {
			return true;
		}
		
		if(key < trav.data) {
			trav = trav.left;
		}
		
		else {
			trav = trav.right;
		}
		
		}
		return false;
	}
	
	
	
	public void inOrder(Node root) {
		
		if(root == null)
			return;
		
		inOrder(root.left);
		System.out.print(" "+ root.data);
		inOrder(root.right);	
	}
	
	public void inOrder() {
		
		System.out.print("Inorder: ");
		inOrder(root);
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
