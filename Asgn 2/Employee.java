package com.sunbeam;

public class Employee {
	int empid;
	String name;
	double salary;
	String dep;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, double salary, String dep) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", dep=" + dep + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}
	
	void insertionSort(Employee[] arr, int N) {
		
		for(int i=1; i<N; i++) {
			//1. pick one element of the array(2nd index)
			Double temp = arr[i].getSalary();
			int j;
			//2. compare  picked element with all its left neighbors
			for(j = i-1; j>=0 && arr[j].getSalary() > temp; j--) {
				//3. if the left neighbors is greater than picked element then move it one position ahead
				arr[j+1].salary = arr[j].getSalary();
			}
			//4. insert picked data at its appropriate position
				arr[j+1].salary = temp;
		}//5. repeat until array is sorted
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
