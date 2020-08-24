package com.antra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExceptionExample3 {
	
	public static void main(String[] args)throws FileNotFoundException{
		
		
		try {
			System.out.println(1/1);
			FileInputStream fis=new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("in finally block");
		}
		System.out.println("in Exception class");
		
		throw new EmployeeNotFoundException("No employee found");
		//throw new StudentNotFoundException("no student Available");
		
		//throw new ArrayIndexOutOfBoundsException();
		//ObjectInputStream obji=new ObjectInputStream(fis);
	}

}
