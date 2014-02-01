// equals and hashcode

package com.cloudwick.user;

public class User {
	private String name;
	private String city;
	private int age;
	private int zip;

	public User(String nData, String cData, int aData, int zData) {

		this.name = nData;
		this.city = cData;
		this.age = aData;
		this.zip = zData;

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}

	
	public boolean equals(Object o){
		if(o == null)
			return false;
		if(! (o instanceof User)){
			return false;
		}
		
		User uObj = (User)o;
		
		return((uObj.getName().equals(getName())) && (uObj.getCity().equals(this.getCity())) 
				&& (uObj.getAge() == this.getAge()) && (uObj.getZip()== this.getZip()));
	}
	
	
	public int hashCode(){
		int hash=7;
		hash=hash*3+(this.name==null?0:this.name.hashCode());
		hash=hash*3+(this.city==null?0:this.city.hashCode());
		hash=hash*3+this.age;
		hash=hash*3+this.zip;
		return hash;
	}
	
	
	

}
