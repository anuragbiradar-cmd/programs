package com.te.exception;

public class Classs {
	public static void main(String[] args) {
		Classs c=new Classs();
		MyThread my=new MyThread();
		Thread t=new Thread(my,"anurag");
		t.start();
		System.out.println(t.getName());
		System.out.println(t.getId());
	}

}
