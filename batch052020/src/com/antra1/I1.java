package com.antra1;

@FunctionalInterface
public interface I1 {
	
	public abstract void m1(int i);
	
	public default void m2() {
		System.out.println("in default m2 method");
	}
	
	public static void m3() {
		
		System.out.println("in static m3 if interface I1");
	}
	
	

}
