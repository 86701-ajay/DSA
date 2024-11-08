package com.sunbeam;

import java.util.Scanner;

public class Question_6 {
	
	public static int linearSearch(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			int cnt=0;
			for(int j=0; j<arr.length; j++) {
				if( i!=j && arr[i]==arr[j]) {
					cnt++;
				}
			}
			if(cnt==0)
			return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7,  8 };
		int ele = linearSearch(arr);
		System.out.println("first non-repeating element : " + ele);


	}

}
