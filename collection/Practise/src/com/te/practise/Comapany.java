package com.te.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Comapany {
	public static void main(String[] args) {
		List<Employee> emp=new ArrayList();
		emp.add(new Employee(21,"anurag",45000));
		emp.add(new Employee(22,"bhushan",30000));
		
		
		Iterator<Employee> itr=emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//	Collections.sort(emp, (o1,o2)->{
//		return o1.name.compareTo(o2.name);
//	});
		Collections.sort(emp, new Sort());
	}
	


}
