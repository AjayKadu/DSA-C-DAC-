package com.sunbeam;

import java.util.Scanner;

public class BinaryWithRecursion {

	public static void main(String[] args) {

		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88 };

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a key to find: ");

		int key = sc.nextInt();

		int left = 0;

		int right = arr.length - 1;

		int index = binaryRecursion(arr, key, left, right);

		if (index == -1) {
			System.out.println("Key Not Found");
		} else {
			System.out.println("key found at index: " + index);
		}
	}

	private static int binaryRecursion(int[] arr, int key, int left, int right) {

		if (left > right)
			return -1;

		int mid = (left + right) / 2;

		if (key == arr[mid])
			return mid;

		else if (key < arr[mid])
			return binaryRecursion(arr, key, left, mid - 1);
		else
			return binaryRecursion(arr, key, mid + 1, right);

	}

}
