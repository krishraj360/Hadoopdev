package com.cloudwick.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List userlist = new ArrayList();

		User u = new User();
		u.setSsn(564);
		u.setName("Saikiran");
		userlist.add(u);

		User u2 = new User();
		u2.setName("Parepally");
		u2.setSsn(945);
		userlist.add(u2);

		Person p = new Person();
		p.setSsn(22);
		p.setName("Fremont");

		Person p2 = new Person();
		p2.setSsn(24);
		p2.setName("California");

		Collections.sort(userlist);
		System.out.println("User list");
		Iterator userItr = userlist.iterator();
		while (userItr.hasNext()) {
			System.out.println(((User) userItr.next()).getSsn());
		}

		List personlist = new ArrayList();
		personlist.add(p);
		personlist.add(p2);
		Collections.sort(personlist, new PersonComparator());
		System.out.println("Person list");
		Iterator personItr = personlist.iterator();
		while (personItr.hasNext()) {
			System.out.println(((Person) personItr.next()).getSsn());

		}

	}

}
