/**
equals and hashcode
 * 
 */
package com.cloudwick.user;

/**
 * @author saikiran
 *
 */
public class EqualsManager {

	public static void main(String args[]){
		User userObj1 = new User("F","G",3,4);
		User userObj2 = new User("F","G",3,4);
		if(userObj1.equals(userObj2))
		{
			System.out.println("EQUALS");
		}
		else
			System.out.println("NOT EQUALS");
		
		if((userObj1.getName().equals(userObj2.getName())) && (userObj1.getCity().equals(userObj2.getCity())) 
				&& (userObj1.getAge() == userObj2.getAge()) && (userObj1.getZip()== userObj2.getZip())){
			
			System.out.println("EQUALS");
		}
		else
			
			System.out.println("NOT EQUALS");
		
	}
	
}
