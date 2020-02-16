package com.edureka.threaddemo;

class Account {

	private int balance = 10000;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	void withdraw(int i) {
		// TODO Auto-generated method stub

		int fbal = getBalance() - i;

		setBalance(fbal);

		System.out.println("Balance after withdraw:" + getBalance());

	}

	void deposit(int i) {
		// TODO Auto-generated method stub
		int fbal = getBalance() + i;		//10000+10000

		setBalance(fbal);

		System.out.println("Balance after deposit:" + getBalance());

	}

}

public class SynchDemo implements Runnable {

	Account acc = new Account();
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (Thread.currentThread().getName().equals("one")) {

				transaction("D");

			} else {
				
				transaction("W");
			}

		}
	}

	private synchronized void transaction(String mode) {
		// TODO Auto-generated method stub
		if(mode.equals("D")) {
			acc.deposit(10000);
		}else {
			acc.withdraw(10000);
		}
	}

	public static void main(String[] args) {

		SynchDemo obj = new SynchDemo();

		Thread t1 = new Thread(obj, "one");
		Thread t2 = new Thread(obj, "two");

		t1.start();
		t2.start();

	}
}
