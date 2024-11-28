package com.sunbeam;

import java.util.Scanner;
import java.util.Stack;

public class Graph {

	private int vertexCount,edgeCount;
	private boolean arr[][];
	
	public Graph(int v) {
		vertexCount = v;
		arr = new boolean[vertexCount][vertexCount];
	}
	
	public void accept(Scanner sc) {
		
		System.out.print("Enter the edge count: ");
		edgeCount = sc.nextInt();
		
		System.out.println("Enter edges : (src, dest) : ");	
	       	
		for(int i=0; i<edgeCount; i++) {
			
			int src = sc.nextInt();
			int des = sc.nextInt();
			
			
			arr[src][des] = true;
			arr[des][src] = true;
		}
	}
	
	
	
	public void DFS(int start) {
		
		Stack<Integer> st = new Stack<>();
		boolean marked[] = new boolean[vertexCount];
		
		st.push(start);
		marked[start] = true;
		
		while(!st.isEmpty()) {
			
		  int u = st.pop();
		  
		  System.out.println(" "+ u);

		  for(int v=0; v<vertexCount; v++) {
			  
			  if(!marked[v] && arr[u][v]) {
				  
				  st.push(v);
				  marked[v] = true;
			  }
			  
		  }
		}
		System.out.println();
	}
	
	
	
	
	
	public void print() {
		System.out.println("Graph : ");
		for(int i = 0 ; i < vertexCount ; i++) {
			for(int j = 0 ; j < vertexCount ; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}
	
}
