package com.antra;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
	
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet(new SortedEx());//it allowes homo genious objects
		
		ts.add(89);
		ts.add(102);
		ts.add(55);
		ts.add(115);
		ts.add(78);
		ts.add(104);
		ts.add(62);
		ts.add(112);
		ts.add(150);
		ts.add(116);
		ts.add(1);
		ts.add(12);
		ts.add(99);
		
		System.out.println(ts);
		
		/*//Set set=new HashSet();//not ordered//no duplicates//HashTable DS
		Set set=new LinkedHashSet();//it is orderd//no duplicates//HashTable and Linked List DS
		set.add(56);
		set.add(new String("Manas"));
		set.add(98.54);
		set.add(new Student(1,"kumar"));
		set.add(true);
		set.add(56);
		set.add(false);
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		/*for(Object o:set) {//java 7
			System.out.println(o);
		}*/
		
		//System.out.println(set);
		
		
	}

}
