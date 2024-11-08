package com.sunbeam;

import java.util.Arrays;

public class Question_1 {

	public static void main(String[] args) {

		int arr[] = { 55, 44, 22, 66, 11, 33 };

		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr, int N) {
		for(int i=1; i<N; i++) {
			int temp = arr[i];
			int j;
			for(j=i-1; j>=0 && arr[j] < temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
			
		}
		
	}

}
