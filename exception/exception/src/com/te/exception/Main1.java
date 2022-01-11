package com.te.exception;

public class Main1 {
public static void main(String[] args) {
	Threading t=new Threading();
	Threadable2 t1=new Threadable2();
	
	Thread th=new Thread(t);
	Thread thr=new Thread(t1);

	th.start();
	thr.start();
}

T
}