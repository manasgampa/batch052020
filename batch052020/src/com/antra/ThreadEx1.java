package com.antra;

public class ThreadEx1 extends Thread{
	
	Calculator c;
	
	public ThreadEx1(Calculator c) {
		this.c=c;
	}
	
	@Override
	public void run() {
		
		c.mul(5);
	}
}
