package com.antra;

import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter i value:");
		int i=sc.nextInt();
		System.out.println("enter j value:");
		int j=sc.nextInt();
		
		try {
		System.out.println("div:"+i/j);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("in finally block");
		}
		System.out.println("add:"+ (i+j));
	}
}
