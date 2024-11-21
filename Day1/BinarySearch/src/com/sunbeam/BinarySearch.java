package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {11,22,33,44,55,66,77,88,99};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the key to find: ");
		
		int key = sc.nextInt();

		int index = binarySearch(arr,key);
		
		 if(index == -1){
		        System.out.println("Key Not Found");
		       }
		       else{
		        System.out.println("key found at index: "+ index);
		       }
		

	}

	private static int binarySearch(int[] arr, int key) {
	
		int left = 0, right = arr.length-1;
		
		while(left <= right) {
			
			int mid = (left + right)/2;
			
			if(arr[mid] == key)
				return mid;
			
			else if(key < arr[mid])
				right = mid-1;
		
			else
				left = mid+1;
			
		}
		
		return -1;
	}

}
