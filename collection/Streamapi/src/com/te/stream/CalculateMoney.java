package com.te.stream;

public class CalculateMoney extends Thread {
	int total;

	public void run() {
		synchronized(this) {

		for (int i = 0; i < 10; i++) {
			total = total + 10;
		}
		this.notify();
		}
	}
}
