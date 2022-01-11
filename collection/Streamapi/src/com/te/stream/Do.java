package com.te.stream;

public class Do {
public static void main(String[] args) {
CalculateMoney calculateMoney=new CalculateMoney();
calculateMoney.start();
synchronized (calculateMoney) {
	
	try {
		calculateMoney.wait();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(calculateMoney.total);
}
}
}
