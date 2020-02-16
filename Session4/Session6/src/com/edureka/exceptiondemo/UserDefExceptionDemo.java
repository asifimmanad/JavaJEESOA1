package com.edureka.exceptiondemo;

//define this class as exception
class AgeInvalidException extends Exception {

	public AgeInvalidException(String str) {
		// TODO Auto-generated constructor stub
		System.out.println(str);
	}

	void invalidAge() {
		// TODO Auto-generated method stub

		System.out.println("Age is less than 18!!!");
	}

}

// throw vs throws
public class UserDefExceptionDemo {

	private void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}

	// throws is to prapogate the exception to caller
	private void validateAge(int age) throws AgeInvalidException, NullPointerException {
		// TODO Auto-generated method stub

		UserDefExceptionDemo obj = null;

		if (age < 18) {
			throw new AgeInvalidException("Age less than 18"); // explicit exception throw
			// throw looks for catch
			// System.out.println("Invalid age");

		} else {

			System.out.println("Go ahead and Vote!!!");
		}

	}

	// 3 ppl --> you got job
	// 2 --> whos knows you got job
	// 3 --> doent know you got job

	/*
	 * try {
	 * 
	 * classname.main();
	 * 
	 * }catch(Throwbale t) { t. }
	 */

	public static void main(String[] args) throws AgeInvalidException {

		int age = 17;

		UserDefExceptionDemo obj = new UserDefExceptionDemo();

		obj.validateAge(age);
		
		System.out.println("End main");

	}
}
