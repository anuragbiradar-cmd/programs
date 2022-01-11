package com.tech.collection;
import java.util.ArrayList;
import java.util.Collections;

public class Company implements Comparable<Employee>{
	public static void main(String[]args)
	{
		ArrayList<Employee> arraylist=new ArrayList();
		Employee employee=new Employee(21,"Anurag",500000);
		arraylist.add(employee);
		arraylist.add(new Employee(2,"ranjitha",200000));
		arraylist.add(new Employee(3,"ankita",250000));
		System.out.println(arraylist.get(0));
		arraylist.set(1,new Employee(10,"messi",12000));
		for(Employee e:arraylist) {
			System.out.println(e);
			
			
		}
		System.out.println("=================");

		
		
		Collections.sort(arraylist,new Company());
		for(Employee e:arraylist) {
			System.out.println(e);
		}
		
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}


	

}
