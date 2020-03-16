package com.asif.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asif.bean.Address;
import com.asif.bean.Employee;

public class Client {

	public static void main(String[] args) {

		/*
		 * Employee e = new Employee();
		 * 
		 * e.setEmpId(101); e.setEmpName("Asif");
		 * 
		 * System.out.println(e);
		 */
		// reads xml file with help of spring container
		AbstractApplicationContext config = new ClassPathXmlApplicationContext("config.xml");

		Employee e1 = config.getBean(Employee.class);

		Employee e2 = config.getBean(Employee.class);

		System.out.println(e1 == e2); // true

		System.out.println(e1);
		System.out.println(e1.hashCode());

		System.out.println(e2.hashCode());

		

		Address ad = config.getBean(Address.class);

		System.out.println(ad);
		
		config.registerShutdownHook(); // server stop
		
	}
}
