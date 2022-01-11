package com.te.exception;

import java.util.Iterator;

public class Myarralist {
	Object[]array;
	int position;
	Myarralist(int size){
		array=new Object[size];
	}
	public void add(Object obj) {
		if(position>=array.length) {
			increaseCapacity();
		}
		array[position]=obj;
		position++;
	}
	private void increaseCapacity() {
		Object[]temp=new Object[array.length+3];
		for(int i=0;i<array.length;i++) {
			temp[i]=array[i];
		}
		array=temp;
	}
	public Iterator iterator() {
		return new MyItr();
	}
	public Object get(int index) {
		return array[index];
	}
	

}
