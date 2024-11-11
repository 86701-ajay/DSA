package com.sunbeam;

public class SinglyCircularLinked {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
   
//	    list.addLast(50);	
//		list.addPosition(50, 2);
//		list.deleteFirst();
//		list.deleteLast();
		list.deletePosition(3);
	    list.display();
	    System.out.println("size : "+list.size());
	}

}
