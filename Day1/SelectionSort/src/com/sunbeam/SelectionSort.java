package com.sunbeam;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class SelectionSort {

	public static void main(String[] args) {
		
		
		int arr[] = { 18, 22, 73, 94, 55, 63, 11, 27 };
         
		
		System.out.println("Array before sorting: "+ Arrays.toString(arr)); 
		
		selectionSort(arr, arr.length-1);
	     
		System.out.println("Array after sorting: "+ Arrays.toString(arr)); 

		
	
	}

	private static void selectionSort(int[] arr, int len) {
		
		for (int i = 0; i < arr.length-1; i++) {
			
			int minIndex = i;
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[j] < arr[minIndex])
					minIndex = j;
				
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;	
			
		}
		
	}

}
