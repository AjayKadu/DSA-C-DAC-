package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {

     public static int linearSearch(int arr[],int key){

        for (int i = 0; i < arr.length; i++) {
            
            if(key == arr[i])
            return i;
        }

        return -1;

     }


    public static void main(String[] args) {

        int arr[] = {88,44,33,99,55,11,77,11};

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a key to find: ");

        int key = sc.nextInt();

       int index = linearSearch(arr,key);

       if(index == -1){
        System.out.println("Key Not Found");
       }
       else{
        System.out.println("key found at index: "+ index);
       }
        
    }
}
