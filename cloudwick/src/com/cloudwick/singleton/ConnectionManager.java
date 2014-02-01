/*
 * Singleton is the design pattern.
 * 
 * By making the constructor private, no one create an object to the class
 */

package com.cloudwick.singleton;

public class ConnectionManager {

	private static ConnectionManager obj;
	public int ssn;

	private ConnectionManager() {

	}

	static {
		obj = new ConnectionManager();
	}

	public static ConnectionManager getInstance() {
		return obj;
	}

}
