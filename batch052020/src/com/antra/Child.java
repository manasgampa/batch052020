package com.antra;

public class Child extends Parent{
	
	int id=97;
	public int childId=100;

	
	public void m1(String str) {
		System.out.println("in m1 of child");
		//return 45;
	}
	
	
	public void childM1() {
		System.out.println(this.id);
	}
	public void childM1(int id) {
		this.id=id;
	}
	public void childM1(byte b) {
		
		
	}
}
