package com.sunbeam;

import java.util.Scanner;

public class Question_5 {
	
	public static int linearSearch(int[] arr, int key, int oc) {
		int cnt=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				cnt++;
			if(cnt == oc)
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = {10 ,4, 3, 5, 6, 9, 3, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key : ");
		int key = sc.nextInt();
		System.out.print("Enter Occurence : ");
		int oc = sc.nextInt();
		int index = linearSearch(arr, key,oc);
		System.out.println("index of last occurance of key : " + index);

	}

}
