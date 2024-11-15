package com.assign.q2.a;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		StackUsingLinkedList list = new StackUsingLinkedList();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println(
					"\n1.push\n2.pop\n3.peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter element :");
				list.addLast(sc.nextInt());
				break;
				
			case 2: {
				int ele = list.deleteLast();
				if (ele == -1)
					System.out.println("You can't pop element. List is empty..");
				else
					System.out.println("pop = " + ele);
			}
			break;
			case 3:
				list.display();
				break;

			case 10:
				System.out.println("Thanks for visiting...");
				break;

			default:
				System.out.println("Invalid choice...");
				break;
			}

		} while (choice != 10);

		sc.close();
	}
}
