package com.sunbeam;

public class LinkedList {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node tail;
	private int size;
	
	public LinkedList() {
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return tail == null;
	}
	
	public int size() {
		return size;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			tail = newnode;
			tail.next = tail;
		}
		else {
			newnode.next = tail.next;
			tail.next  = newnode;
		}
		size++;
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			tail = newnode;
			tail.next = tail;
		}
		else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		size++;
	}
	
	public void addPosition(int value, int pos) {
		Node newnode = new Node(value);
		if(pos < 1 || pos > size+1)
			return;
		if(isEmpty()) {
			tail = newnode;
			tail.next = tail;
		}
		else if(pos == 1) {
			addFirst(value);
			return;
		}
		else if(pos == size) {
			addLast(value);
			return;
		}
		else {
			Node trav = tail.next;
			for(int i=1; i<pos-1; i++)
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
		size++;
	}
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(size == 1) 
			tail = null;
		else {
			tail.next = tail.next.next;
		}
		size--;
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(size == 1)
			tail = null;
		else {
			Node trav = tail.next;
			while(trav.next.next != tail.next)
				trav = trav.next;
			trav.next = tail.next;
			tail = trav;
		}
		size--;
	}
	
	public void deletePosition(int pos) {
		if(pos < 1 || pos > size)
			return;
		if(isEmpty())
			return;
		else if(size == 1)
			tail = null;
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		else if(pos == size) {
			deleteLast();
			return;
		}
		else {
			Node trav = tail.next;
			for(int i=1; i<pos-1; i++)
				trav = trav.next;
			trav.next = trav.next.next;
		}
		size--;
	}

	public void display() {
		if(isEmpty()) {
			System.err.println("list is empty...");
			return;
		}
		Node trav = tail.next;
		System.out.print("List :");
		do {
			System.out.print("  "+trav.data);
			trav = trav.next;
		}while(trav != tail.next);
		System.out.println();
		System.out.println("last node: " + tail.data);
	}
}
