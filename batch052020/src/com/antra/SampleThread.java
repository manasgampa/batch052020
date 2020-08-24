package com.antra;

public class SampleThread {

	public static void main(String[] args) {
		
		//Student st=new Student();//student lock object
		Calculator c=new Calculator();//lock
		
		ThreadEx1 t1=new ThreadEx1(c);
		t1.setName("Manas");
		t1.setPriority(5);//1 min priority// 5 norm priority //10 Max priority
		ThreadEx2 t2=new ThreadEx2(c);
		t2.setName("Kumar");
		t2.setPriority(1);
		t1.start();
		t2.start();
		
		/*ThreadEx1 t1=new ThreadEx1();
		ThreadEx2 t2=new ThreadEx2();
		
		t1.start();//-15min
		t2.start();//-15min
*/		
		/*ThreadEx2 t2=new ThreadEx2();
		Thread tx2=new Thread(t2);
		tx2.start();*/
		
		/*ThreadEx1 t1=new ThreadEx1();
		t1.start();*/
	}
}
