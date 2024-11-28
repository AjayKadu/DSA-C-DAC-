package com.sunbeam;

import java.util.Scanner;

public class UnDirectedWeightGraphMain {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the count of Vertex");
		
		int v = sc.nextInt();
		
		Graph g = new Graph(v);
		
		g.accept(sc);
		g.print();

	}

}
