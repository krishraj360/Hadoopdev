package com.cloudwick.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long starttime = System.currentTimeMillis();

		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 500; i++) {
			SumThread t = new SumThread(100000000 + i);
			service.execute(t);
		}
		service.shutdown(); // make sure no additional threads are created. It
							// will close the executor service
		do {

		} while (!service.isTerminated()); // this do-while loop is to make sure
											// that all the threads are
											// terminated. if any thread is
											// running we are making the code to
											// wait until all the threads are
											// executed
		System.out.println("All threads executed");
		long endtime = System.currentTimeMillis();
		System.out.println("Total time: " + (endtime - starttime));
	}

}

/*
 * In executors, threads are not started as in traditional way but it internally
 * start the thread when it is called using execute method
 */
