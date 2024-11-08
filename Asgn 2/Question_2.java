package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Question_2 {
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee arr[] = {
				new Employee(1, "ram", 18000, "MECH"),
				new Employee(2, "sham", 15000, "IT"),
				new Employee(3, "anil", 12000, "CIVIL"),
				new Employee(4, "mukesh", 16000, "MECH"),
				new Employee(5, "suresh", 10000, "IT")
		};
		
	
             Employee e = new Employee();
             e.insertionSort(arr, arr.length);
	}

}
