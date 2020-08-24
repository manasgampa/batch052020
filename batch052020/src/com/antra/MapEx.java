package com.antra;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapEx {

	public static void main(String[] args) {
		
		//Map<Integer,String> map=new HashMap<>();//it follows HashTable DS//it is not orderd //keys cannot be duplicates but values can be duplicated
		//key can be any object like integer,float,student,string
		
	//	Map<Integer,String> map=new LinkedHashMap<Integer, String>();// it is orderd//it follows Hashtable and linkedlist DS
		
		ConcurrentHashMap<Integer, String> map=new ConcurrentHashMap<Integer, String>();
		//Hashtable<Integer, String> map=new Hashtable<>();
		map.put(67, "Manas");
		map.put(78, "Jatin");
		map.put(34, "Charlie");
		map.put(90, "Kexin Chai");
		map.put(22, "Bob");
		map.put(35, "Peter");
		map.put(89, "David");
		map.put(66, "Tom");
		
		map.get(67);
		
		Set<Integer> set=map.keySet();
		//System.out.println(set.getClass().getName());
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
			map.put(100, "Drake");
			
		}
		
		/*		m.put(1, "Manas");
		m.put(new Student(1,"Manas"), "kumar");
		m.put(54.32d, new Employee());
		m.put(1, "Jatin");
		m.put(4, "kumar");
		System.out.println(m);
*/		
	}
}
