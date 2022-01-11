package com.te.arrraylistimpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class Sort implements Comparator<Employee> {
	public static void main()
	{
		ArrayList<Integer> arr=new ArrayList(4);
           arr.add(7);
           arr.add(6);
           arr.add(3);
           arr.add(2);
           Collections.sort(arr);
            
	}




	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

