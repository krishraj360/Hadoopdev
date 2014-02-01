package com.cloudwick.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Thread> threadlist = new ArrayList <Thread>();
		for (int i = 0; i < 500; i++) {
			SumThread t = new SumThread(100000000 + i);
			t.setName("cloudwick" + i);
			if (i > 10 && i < 20) {
				t.setPriority(1);
			}
			t.start();
			threadlist.add(t);
		}

		int running = 0;
		do {
			running = 0;
			for (Thread s : threadlist) {
				if (s.isAlive()) {
					running++;
				}
			}

		} while (running > 0);
		System.out.println("All threads completed");
	}

}
