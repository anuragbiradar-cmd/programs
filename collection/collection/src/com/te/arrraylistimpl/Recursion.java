package com.te.arrraylistimpl;

public class Recursion {
	int result;
	public   int   m1(int j) {
		
		while (j > 0) {
			
			result=j+ j * m1(j - 1);
			
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		Recursion recursion=new Recursion();
		System.out.println( recursion.m1(i));
		
		
	}

}
