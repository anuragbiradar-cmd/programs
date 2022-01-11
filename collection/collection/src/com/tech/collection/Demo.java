package com.tech.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Demo {
public static void main(String[]args)
{
	Collection c=new ArrayList();
	c.add("String");
	c.add(10);
	c.add('a');
	c.add(10.10);
	c.add(true);
	c.add(null);
	Iterator iterator =c.iterator();
	ArrayList list=new ArrayList();	
	list.add(20);
	list.add("anything");
	System.out.println(list.contains(20));
	list.clear();
	c.addAll(list);
	
	}
}
