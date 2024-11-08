package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

class Employee{
	int empid;
	String name;
	double salary;
	String dep;
	
	public Employee(int empid, String name, double salary, String dep) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.dep = dep;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", dep=" + dep + "]";
	}

	public static void findById(Employee arr[] ,Scanner sc) {
		System.out.print("Enter empid : ");
	    int id = sc.nextInt();
	    int flag=0;
	    for(int i=0; i<arr.length; i++) {
	    	if(arr[i].empid == id) {
	    		System.out.println(arr[i]);
	    	flag=1;
	    	}
	    }
		
	    if(flag==0) {
	    	System.out.println("Employee not found ...");
	    }
		
	}
	
	public static void findByName(Employee arr[] ,Scanner sc) {
		System.out.print("Enter name : ");
	    String name = sc.next();
	    int flag=0;
	    for(int i=0; i<arr.length; i++) {
	    	if(arr[i].name.equals(name)) {
	    		System.out.println(arr[i]);
	    	flag=1;
	    	}
	    }
		
	    if(flag==0) {
	    	System.out.println("Employee not found ...");
	    }
		
	}
	
}

public class Question_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee arr[] = {
				new Employee(1, "ram", 10000, "MECH"),
				new Employee(2, "sham", 15000, "IT"),
				new Employee(3, "anil", 12000, "CIVIL"),
				new Employee(4, "mukesh", 16000, "MECH"),
				new Employee(5, "suresh", 18000, "IT")
		};
		
		Employee e = new Employee();
//		e.findById(arr, sc);
		e.findByName(arr, sc);

	}

}
