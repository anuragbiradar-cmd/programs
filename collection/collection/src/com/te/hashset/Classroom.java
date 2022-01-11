package com.te.hashset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Classroom {
	public static void main(String[] args) {	
	HashSet<Student> stud=new HashSet<>();
	stud.add(new Student(21,"anurag",66));
	stud.add(new Student(22,"anura",66));
	
	Iterator<Student> iterator=stud.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
		
		
	}
	ArrayList<Student> arraylist= new ArrayList(stud);
	
	Collections.sort(arraylist,new SortByName());
	
	
	Iterator<Student> iterator1=arraylist.iterator();
	
	while(iterator1.hasNext())
	{
		System.out.println(iterator1.next());
	}

}
}
