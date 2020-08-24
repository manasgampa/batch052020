package com.antra1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Features {

	
	public static void main(String[] args) {
		//m1(1,2);
		//System.out.println(k);
		
		List<Person> list=Arrays.asList(new Person("Sara","F",20),
				new Person("Sara","F",27),
				new Person("Bob","M",20),
				new Person("Paula","F",32),
				new Person("Paul","M",32),
				new Person("Jack","M",2),
				new Person("Jack","M",72),
				new Person("Jill","F",12)
				);
		
		//Predicate<Person> predicate=p->p.getGender().equals("M");
		
		//list.stream().filter(p->p.getGender().equals("M")).
		
		
		
		//Consumer<Person> c=(p)->System.out.println(p);
		
		//list.stream().forEach(p->System.out.println(p));
		//filter(p->p.getGender().equals("M")).
		List<Person> newList=list.stream().
		filter(p->p.getGender().equals("M")).
		map(p->{int age=p.getAge();
			p.setAge(age+1);
			return p;
		}).collect(Collectors.toList());
	
		
		
		
		newList.stream().forEach(p->{System.out.println(p.getAge());
	System.out.println(p.getName());
	});
		
		
		//Person p1=new Person("Manas","M",32);
		/*Predicate<Person> p=t->t.getAge()>25;
		p.test(p1);*/
		/*List<Person> newList=list.stream().filter(t->{if(t.getAge()>25) {
			return true;
		}else {
			return false;
		}
		}).collect(Collectors.toList());
	//	list.stream().forEach(p->System.out.println(p));
		newList.stream().forEach(p->System.out.println(p.getName()));
		*/
		/*ArrayList al=new ArrayList();
		for(Person p:list) {
			
			if(p.getAge()>25) {
				al.add(p);
			}
		}*/
		
		
		//list.stream().forEach(p->System.out.println(p));
		/*Stream<Person> stream=list.stream();
		
		//Consumer<Person> cm=p->System.out.println(p);
		stream.forEach(p->System.out.println(p));*/
		
		//Person p1=new Person("Manas","M",32);
		
		//Supplier<Double> s=()->{return Math.random();};//One Time Password
		//s.get();
		/*Function<Person, Person> f=p->{p.setName("Kumar");
		 return p;	
		};
		
		Person p2=f.apply(p1);
		
		System.out.println(p2.getName());*/
		/*Predicate<Person> pi=p->{if(p.getAge()>30) {
			return true;
		}else{
			return false;
		}};
		
		System.out.println(pi.test(p1));
		*/
		
		/*Stream<Person> stream=list.stream();
		stream.forEach();*/
		
		/*Iterator<Person> it=list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		
		/*List li3=new ArrayList<>();
		li3.add(new Person);
		li3.add(2);
		li3.add(3);
	List<Integer> li1=Arrays.asList(1,2,3,4);*/
		
		/*CalculateInter add=(i,j)->{return i+j;};
		System.out.println(add.calculate(1, 2));
		
		CalculateInter sub=(i,j)->{return i-j;};
		System.out.println(sub.calculate(2, 1));*/
		
		/*Comparator<Integer> cm=(i,j)->{return i+j;};
		
		I1 i1=(i)->System.out.println("in m1 of Annonumus ");
		i1.m1(1);
		
		User user=new User();
		user.UserDetails(i1);*/
		/*InterImpl impl=new InterImpl();
		
		impl.m1();
		impl.m2();
		
		I1.m3();*/
		
		
	}

}
