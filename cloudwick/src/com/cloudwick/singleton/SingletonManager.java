package com.cloudwick.singleton;

public class SingletonManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConnectionManager1 obj = ConnectionManager1.getInstance();
		obj.ssn = 123;
		System.out.println(obj.ssn);
		ConnectionManager1 obj2 = ConnectionManager1.getInstance();
		System.out.println(obj2.ssn);
	}

}
