package com.sunbeam;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {

		int choice;
		Scanner sc = new Scanner(System.in);

		Stack st = new Stack(4);

		do {

			System.out.println("1. pop().\n2. push().\n3. peek().\n0. Exit");
			System.out.print("Enter the choice");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
                     if(st.isEmpty()) {
                    	 System.out.println("Stack is empty");
                     }
                     else
                    	 System.out.println(st.pop());
				break;

			case 2:
				if(st.isFull()) {
					System.out.println("Stack is Full");
				}
				else
					System.out.println("Enter the Value");
				    int val = sc.nextInt();
					st.push(val);
				break;

			case 3:
				if(st.isEmpty()) {
					System.out.println("Stack is empty");
				}
				else
					System.out.println(st.peek());

				break;
				
			case 0:
				System.exit(0);
				break;

			default:
				System.out.println("Enter valid choice");
				break;
			}

		} while (choice != 0);
		
		sc.close();

	}

}
