package com.sunbeam;

public class LinearQueue {
	int rear, front;
	int []arr;
	private final int SIZE;
	
	public LinearQueue(int size) {
		front = rear = 0;
		SIZE = size;
		arr = new int[SIZE];
	}

	public boolean isFull() {
		return rear == SIZE;
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
	
	public void push(int value) {
		arr[rear] = value;
		rear++;
	}
	
	public int pop() {
		int temp = arr[front];
		front++;
		return temp;
		
	}
	
	public int peek() {
		int temp = arr[front];
		return temp;
		
	}
	
}
