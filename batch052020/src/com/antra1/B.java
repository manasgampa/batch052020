package com.antra1;

public class B {

	public synchronized void bar(A a) {
		
		System.out.println("in B class Bar method");
		a.last();
		System.out.println("in B class after A last method called ");
	}
	
	public synchronized void last() {
		
		System.out.println("in last method of B class");
	}
}
