package com.antra;

public class Parent{
	
	int id=70;
	 int parentId=200;

	public void parentM1() {
		System.out.println("in parent m1");
	}
	
	public int parentM1(int i) {
		return 1;
	}
	
	public void m1(int a) {
		System.out.println("in m1 of parent");
	}
	
}
