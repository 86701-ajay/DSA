package com.assign.q2.b;


public class QueueUsingLinkedList {

	static class Node {
		int data;
		Node next;

		public Node(int ele) {
			super();
			data = ele;
			next = null;
		}

	}

	private Node head, tail;
	private int capacity;

	public QueueUsingLinkedList() {
		super();
		head = tail = null;
		capacity = 0;
	}

	public boolean isEmpty() {
		return capacity == 0;
	}

	public void addLast(int ele) {
		Node newNode = new Node(ele);
		if (capacity == 0) {
			head = tail = newNode;
			tail.next = head;
		} else {
			newNode.next = head;
			tail.next = newNode;
			tail = newNode;
		}

		capacity++;
	}

	public int deleteFirst() {
		if (capacity == 0)
			return -1;

		if (capacity == 1) {
			int temp = head.data;
			head = tail = null;
			capacity--;
			return temp;
		} else {
			int temp = head.data;
			tail.next = head.next;
			head = head.next;
			capacity--;
			return temp;
		}

	}
	

	public void display() {
		if (tail == null)
			System.out.println("List is empty...");
		else
			System.out.println("peek = " + head.data);
	}

}
