package com.cloudwick.collection;

public class User implements Comparable<User> {

	private int ssn;
	private String name;

	/**
	 * @return the ssn
	 */
	public int getSsn() {
		return ssn;
	}

	/**
	 * @param ssn
	 *            the ssn to set
	 */
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int compareTo(User o) {
		// TODO Auto-generated method stub

		int ssnData = o.getSsn();
		return this.ssn - ssnData;

	}

}
