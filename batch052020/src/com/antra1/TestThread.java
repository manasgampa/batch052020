package com.antra1;

public class TestThread {
	
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		
		ThreadEx1 t1=new ThreadEx1(a,b);
		ThreadEx2 t2=new ThreadEx2(b,a);
		t1.start();
		t2.start();
		
		
		
	}

}
