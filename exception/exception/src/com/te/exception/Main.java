package com.te.exception;

public class Main {
	public static void main(String[] args) {
		Class1 c1=new Class1();
		Class2 c2=new Class2();
		
		
		c1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c2.start();
	
	
	}

}
