package com.antra;

public  class Calculator {
	
	public int add(int a,int b) {
		
		return a+b;
	}
	
	public synchronized void mul(int num) {
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(num+"*"+i+"="+(i*num));
		}
	}

}
