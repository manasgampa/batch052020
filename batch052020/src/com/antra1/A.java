package com.antra1;

public class A {
	
	public synchronized void foo(B b) {
		
		System.out.println("in A class foo method");
		b.last();
		System.out.println("in A class after B last method called");
	}
	public synchronized void last() {
		
		System.out.println("in last method of A class");
	}
}
