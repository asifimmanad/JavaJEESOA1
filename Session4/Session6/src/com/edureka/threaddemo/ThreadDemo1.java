package com.edureka.threaddemo;

class Test1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10000; i++) {
			System.out.println(Thread.currentThread().getName());	
		}
		
	}

}

class Test2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10000; i++) {
			System.out.println(Thread.currentThread().getName());	
		}
	}

}

public class ThreadDemo1 {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		Test2 t2 = new Test2();

		t1.setName("one");
		t2.setName("two");
		
		t1.start();
		t2.start();

	}
}
