package com.antra;

public class ThreadEx2 extends Thread{//implements Runnable

	Calculator c;
	
	public ThreadEx2(Calculator c) {
		
		this.c=c;
	}
	
	@Override
	public void run() {
			c.mul(10);
	}
	
}
