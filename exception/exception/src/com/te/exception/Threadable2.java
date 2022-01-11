package com.te.exception;

public class Threadable2 implements Runnable{

	@Override
	public void run() {
		for(char i='a';i<='z';i++) {
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
