package com.antra;
//uncheck exception example
public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException(String str) {
		super(str);
	}
}
