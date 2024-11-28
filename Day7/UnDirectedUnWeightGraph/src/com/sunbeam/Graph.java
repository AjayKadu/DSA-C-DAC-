package com.sunbeam;

import java.util.Scanner;

public class Graph {
        
	private int vertexCount,edgeCount;
	private boolean arr[][];
	
	public Graph(int v) {
		
		vertexCount = v;
		arr = new boolean[vertexCount][vertexCount];
	}
	
	public void accept(Scanner sc) {
		
		System.out.print("Enter edge count: ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges : (src, dest) : ");
		
		for(int i=0; i<edgeCount; i++) {
			
			int src = sc.nextInt();
			int des = sc.nextInt();
			
			arr[src][des] = true;
			arr[des][src] = true;	
		}
	}
	
	public void print() {
		System.out.println("Graph : ");
		for(int i = 0 ; i < vertexCount ; i++) {
			for(int j = 0 ; j < vertexCount ; j++) {
				System.out.print(arr[i][j] ? "1 " : "0 ");
			}
			System.out.println();
		}
	}
	
}
