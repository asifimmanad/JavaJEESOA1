package com.edureka.threaddemo;

//runnable interface and thread class are in java.lang.*;
public class ThreadDemo implements Runnable {

	@Override
	public void run() {// assign a task to thread
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(500);			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (Thread.currentThread().getName().equals("one")) {

				System.out.println("one" + Thread.currentThread().getPriority());

			} else {

				System.out.println("two"+ Thread.currentThread().getPriority());

			}
		}

	}

	public static void main(String[] args) {

		// int n = Thread.activeCount();

		// System.out.println(n);

		// System.out.println(Thread.currentThread().getName());

		ThreadDemo obj = new ThreadDemo();

		Thread t1 = new Thread(obj); // born
		Thread t2 = new Thread(obj);

		t1.setName("one");
		t2.setName("two");
		
		t1.setPriority(1);	//min priority --> request 
		t2.setPriority(10); //max priority --> request
		
		
		t1.start();
		t2.start();

	}
}
