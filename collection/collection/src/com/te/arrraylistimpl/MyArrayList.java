package com.te.arrraylistimpl;
import java.util.Iterator;

import java.util.Arrays;

public class MyArrayList {
	Object[] array;
	int position;

	public MyArrayList(int size) {
		array = new Object[size];
	}

	public void add(Object obj) {
		if (position >= array.length) {
			increaseCapacity();
		}
		array[position] = obj;
		position++;
	}
	private void increaseCapacity() {
          Object[] temp=new Object[array.length+3];
          for(int i=0;i<array.length;i++) {
        	  temp[i]=array[i];
          }
          array=temp;
	}
	public void remove(int index) {
		for(int i=0;i<position;i++) {
			array[i]=array[i+1];
		}
	}


	class MyItr implements Iterator{
		int index;
		public boolean hasNext() {
			return (index<position)?true:false;
			
		}
		@Override
		public Object next() {
			return array[index++];
		}
		
	}
	@Override
	public String toString() {
	String s="MyArrayList [array=" + Arrays.toString(array) + ", position=" + position + "]";
	return s;
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyItr();
	}
    	
}
