package com.antra;

public class Employee{
 
	int id=89;
	String name="Manas";
	
	public String toString() {
		
		//return this.id+" "+this.name;
		return this.getClass().getName()+"@"+Integer.toHexString(hashCode());//int
	}
	
	public int hashCode() {
		return 1;
	}
	
}
