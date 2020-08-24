package com.antra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListEx {
	
	public static void main(String[] args) {
		
		/*List<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(57);
		al.add(29);
		al.add("Manas");*/
		
		//Collection col=new Collection();
		//Collection col=new List();
		//List al=new List();
		List li=new ArrayList();//default size is 10//it follows Object ArrayData Structure//retriving the element is faster
		//List li=new LinkedList();//double linked list DS//insertion and deletion is easier//
		//List li=new Vector();//Re Sizeable array DS
		//List li=new Stack();//LIFO
		li.add(6);
		li.add("Manas");
		li.add(56.72d);
		li.add(new Student(1,"kumar"));
		li.add(true);
		li.add(6);
		
		Iterator it=li.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		List li1=Collections.unmodifiableList(li);
		li1.add(78);
		
		/*for(Object o:li) {
			System.out.println(o);
		}*/
		
		//li.remove(4);
		//li.add(2, new Parent());
		
		/*for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}*/
		
		
		
	}

}
