package com.asif.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asif.bean.Employee;

public class Client {

	public static void main(String[] args) {

		SessionFactory sf = null;
		Session s = null;
		Transaction tx = null;
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");

			System.out.println("Config");

			sf = config.buildSessionFactory();

			s = sf.openSession();

			tx = s.beginTransaction();

			Employee e = new Employee(123, "Victor", "victor@gmail.com");

			s.save(e);

			tx.commit();

			System.out.println("Data Inserted");
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			tx.rollback();
			e.printStackTrace();
		
		} finally {
			s.close();
			sf.close();
		}

	}
}
