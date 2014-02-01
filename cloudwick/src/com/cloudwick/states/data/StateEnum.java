/**
 * 
 */
package com.cloudwick.states.data;

/**
 * @author saikiran
 *
 */
public enum StateEnum {
	
	CA("California", 94536),
	TX("Texas",77062),
	UT("Utah",32068);

private StateEnum(String state, int zip){
	this.statename = state;
	this.zipcode = zip;
}
private String statename;
private int zipcode;

public int getZip(){
	return this.zipcode;
}
public String getState(){
	return this.statename;
}

}
