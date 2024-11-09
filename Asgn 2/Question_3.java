package com.sunbeam;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearQueue q = new LinearQueue(3);
		int choice;
		do {
			System.out.println("1. push\n2. pop\n3. peek\n4. EXIT");
			System.out.print("enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if(q.isFull()) {
					System.out.println("Queue is full....");
				}
				else {
					System.out.print("Enter value : ");
					int value = sc.nextInt();
					q.push(value);
				}

				break;

			case 2:
				if(q.isEmpty()) {
					System.out.println("Queue is empty....");
				}
				else {
					System.out.println("poped data : " + q.pop());
				}

				break;

			case 3:
				if(q.isEmpty()) {
					System.out.println("Queue is empty....");
				}
				else {
					System.out.println("peeked data : " + q.peek());
				}

				break;

			default:
				break;
			}

		} while (choice != 4);

	}

}
