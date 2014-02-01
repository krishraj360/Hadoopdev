package com.cloudwick.states.data;

public class EnumManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(StateEnum.CA.getState());
		System.out.println(StateEnum.CA.getZip());
		for (StateEnum st : StateEnum.values()) {
			System.out.println(st.getState());
			System.out.println(st.getZip());
		}
	}

}
