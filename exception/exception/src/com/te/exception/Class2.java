package com.te.exception;

public class Class2 extends Thread{
 public void run() {
	 for(int i='a';i<='z';i++) {
		 System.out.println((char)i);
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
 }

}
