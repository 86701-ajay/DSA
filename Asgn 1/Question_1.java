package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_1 {
	
	public static int linearSearch(int[] arr, int key) {
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = {10 ,4, 3, 5, 6, 9, 3, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key : ");
		int key = sc.nextInt();
		int index = linearSearch(arr, key);
		System.out.println("index of last occurance of key : " + index);
		
		
	}

}
