package com.antra;

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.println("in main before");
		doStuff();
		System.out.println("in main after");
	}
	
	public static void doStuff() {
		System.out.println("in do stuff before");
		doMoreStuff();
		System.out.println("in do stuff after");
	}
	
	public static void doMoreStuff() {
		System.out.println("in do more stuff");
		try {
		System.out.println(1/0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("in do more stuff after");
	}
	
}
