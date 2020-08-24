package com.antra1;

public class ThreadEx2 extends Thread{
	
	A a;
	B b;
	public ThreadEx2(B b, A a) {
		this.b=b;
		this.a=a;
	}
	
	public void run() {
		
		b.bar(a);
	}

}
