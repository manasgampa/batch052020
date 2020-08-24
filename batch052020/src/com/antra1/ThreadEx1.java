package com.antra1;

public class ThreadEx1 extends Thread{

	A a;
	B b;
	
	ThreadEx1(A a, B b){
		this.a=a;
		this.b=b;
	}
	
	public void run() {
		
		a.foo(b);
	}
}
