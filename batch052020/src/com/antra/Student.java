package com.antra;

public class Student {

	private int id;
	private String name;
	//private static Student st;

	public Student(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	/*private Student() {
		System.out.println("in student constructor");
	}
*/	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		
		Student st=(Student)obj;
		int id1=this.id;
		String name1=this.name;
		if(id1==st.id && name1.equals(st.name)) {
			
			return true;
		}else {
			
			return false;
		}
		
		
	}
	
	/*public int hashCode() {
		return 1;
	}*/
	
	/*public Student(int id,String name) {
	this.id=id;
	this.name=name;
	System.out.println("in constructor");
}*/
	
/*	static{
		st=new Student();
		System.out.println("in static block");
	}
	
	public static Student getStudentInstance() {
		
		return st;
	}
	{
		//st=new Student();
		//System.out.println("in instance block");
	}*/
	
}
