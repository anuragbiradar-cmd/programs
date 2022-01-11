package com.te.arrraylistimpl;
import java.util.Iterator;

public class Main {
	public static void main(String[]args) {
	     MyArrayList list=new MyArrayList(2);
	     list.add(10);
	     list.add(20);
	     list.add(30);
	     list.add(40);
	     list.remove(10);
	     list.add(10);
	     System.out.println(list.toString());
	     Iterator iterator= list.iterator();
	}

}
