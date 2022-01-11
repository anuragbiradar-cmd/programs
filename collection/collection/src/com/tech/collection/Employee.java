package com.tech.collection;

import java.util.Comparator;

import com.te.arrraylistimpl.Sort;


public class Employee implements Comparator<Employee> {
	int empId;
	String name;
	double salary;

	public Employee(int empId, String name, double salary) {
		super();
		if(empId>0) {
		this.empId = empId;
		}
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

//	@Override
//	public int compareTo(Employee o) {
//	   double res=o.empId-this.empId;
//	   int sal=(int)res;
//	   return sal;
//	}

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int)(o1.salary-o2.salary);
	}
	


		
	}

    

