package com.cloudwick.collection;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person obj, Person obj2) {
		// TODO Auto-generated method stub
		String name = obj.getName();
		String name2 = obj2.getName();
		return name.compareTo(name2);
	}

}
