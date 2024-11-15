package com.assign.q2.a;


public class StackUsingLinkedList {

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

	public StackUsingLinkedList() {
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

	public int deleteLast() {

		if (capacity == 0)
			return -1;

		if (capacity == 1) {
			int temp = head.data;
			head = tail = null;
			capacity--;
			return temp;
		} else {
			Node trav = head;
			while (trav.next.next != head)
				trav = trav.next;

			int temp = trav.next.data;
			trav.next = head;
			tail = trav;
			capacity--;
			return temp;
		}
	}

	public void display() {
		if (tail == null)
			System.out.println("List is empty...");
		else
			System.out.println("peek = " + tail.data);
	}

}
