/*
 * 
 * We have to make the access to the method single threaded
 * 
 * Enum are by default singleton and the best practise for doing singleton
 * 
 */

package com.cloudwick.singleton;

public class ConnectionManager1 {
	private static ConnectionManager1 obj;
	public int ssn;

	private ConnectionManager1() {

	}

	public static synchronized ConnectionManager1 getInstance() {
		if (obj == null) {
			obj = new ConnectionManager1();
		}
		return obj;
	}

}
