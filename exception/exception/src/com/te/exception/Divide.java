package com.te.exception;

public class Divide {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int res=0;
		try {
		if(b==0) {
			throw new Dividebyzeroexception("please enter diffrent divisor");
		}
		else {
		res=a/b;
		System.out.println(res);
		}
		}catch(RuntimeException e) {
			e.printStackTrace();
			
		}
	}

}
