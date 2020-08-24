package com.antra;

public class StaticControleFlowEx {
	
	static int i=10;
	
	static {
		
		System.out.println("static block 1");
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		m1();
		System.out.println("in main method");
	}

	static {
		
		System.out.println("in static block 2");
	}
	public static void m1() {
		
		System.out.println("m1 method");
		
	}
}
