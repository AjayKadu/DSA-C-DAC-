package com.sunbeam;

import java.util.Scanner;

public class Graph {

	private final int INF = 99;
	private int vertexCount,edgeCount;
	private int arr[][];
	
	public Graph(int v) {
		vertexCount = v;
		arr = new int[vertexCount][vertexCount];
		for(int i = 0 ; i < vertexCount ; i++)
			for(int j = 0 ; j < vertexCount ; j++)
				arr[i][j] = INF;
	}
	
	public void accept(Scanner sc) {
		
		System.out.print("Enter the edge count: ");
		edgeCount = sc.nextInt();
		
		System.out.println("Enter edges : (src, dest, wt) : ");	
	       	
		for(int i=0; i<edgeCount; i++) {
			
			int src = sc.nextInt();
			int des = sc.nextInt();
			int wt = sc.nextInt();
			
			arr[src][des] = wt;
			arr[des][src] = wt;
		}
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
