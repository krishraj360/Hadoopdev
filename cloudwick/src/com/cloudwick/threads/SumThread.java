package com.cloudwick.threads;

public class SumThread extends Thread {

	private int counter;

	public SumThread(int count) {
		this.counter = count;
	}

	public void run() {
		int sum = 0;
		for (int i = 0; i < counter; i++) {
			sum += i;
		}
		System.out.println("Sum of" + Thread.currentThread() + "is :" + sum);
	}
}
