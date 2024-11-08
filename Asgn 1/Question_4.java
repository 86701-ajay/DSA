package com.sunbeam;

public class Question_4 {

	public static void main(String[] args) {
		
		int []arr = { 99,88,77,66,55,44,33,22,11};
		 int index = binarySearch(arr,22);
		 System.out.println("index : "+ index);

	}

	private static int binarySearch(int[] arr ,int key) {
		int left=0;
		int right= arr.length-1;
		int mid;
		
		while(left <= right) {
			mid = (left + right)/2;
			
			if( key < arr[mid])
				left = mid+1;
			else if(key > arr[mid])
				right = mid-1;
			else
				return mid;
		}
		return -1;
		
	}

}
