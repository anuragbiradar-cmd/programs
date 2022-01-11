package com.te.arrraylistimpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Treasea {
	public static void main(String[]args)
	{
		TreeSet<Integer> t=new TreeSet<>();
		t.add(-4);
		t.add(1);
		t.add(0);
		t.add(20);
		
		
        ArrayList<Integer> arr=new ArrayList<Integer>(t);
        ListIterator<Integer> listit=arr.listIterator(arr.size());
        while(listit.hasPrevious()) {
        	System.out.println(listit.previous());
        }
		
	}

}
