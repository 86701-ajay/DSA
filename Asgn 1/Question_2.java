package com.sunbeam;

import java.util.Scanner;

public class Question_2 {

	public static int linearSearch(int[] arr, int key) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			cnt++;
			if (arr[i] == key) {
				return cnt++;
			}

		}
		return cnt;
	}

	public static int binarySearch(int[] arr, int key) {
		int cnt = 0;
		int left = 0;
		int right = arr.length - 1;
		int mid;
		while (left <= right) {
			cnt++;
			mid = (left + right) / 2;
//		System.out.println("left : "+ left);
//		System.out.println("right : "+ right);
//		System.out.println("mid : "+ mid);
			if (key == arr[mid]) {

				return cnt;
			} else if (key < arr[mid])
				right = mid - 1;

			else
				left = mid + 1;

		}

		return cnt;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key : ");
		int key = sc.nextInt();
		int cnt = linearSearch(arr, key);
		System.out.println("no of comparisions(linear search) : " + cnt);
		int bcnt = binarySearch(arr, key);
		System.out.println("no of comparisions(binary search) : " + bcnt);

	}

}
