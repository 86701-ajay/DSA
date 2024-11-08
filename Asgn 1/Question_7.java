package com.sunbeam;

import java.util.Scanner;

public class Question_7 {

	public static int findRank(int[] arr, int x) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] <= x) {
				cnt++;
			}

		}
		return cnt;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.print("Enter element: ");
		int element = sc.nextInt();
		int rank = findRank(arr, element);
		System.out.println("Rank of "+ element + " is : " + rank);

	}

}
