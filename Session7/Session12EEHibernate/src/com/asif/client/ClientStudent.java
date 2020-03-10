package com.asif.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asif.bean.Student;

public class ClientStudent {

	public static void main(String[] args) {
		
		SessionFactory sf = null;
		Session session = null;
		Session session1 = null;
		Transaction tx1 = null;
		Transaction tx2 = null;
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");

			System.out.println("Config");

			sf = config.buildSessionFactory();

			session = sf.openSession();
			session1 = sf.openSession();
			tx1 = session.beginTransaction();
			
			tx2 = session1.beginTransaction();
			
		//	Student st1 = new Student();
		//	st1.setSname("Anish");
			
			
			Student s = (Student)session.get(Student.class, 1);
			
			Student s1 = (Student)session1.get(Student.class, 2);
			System.out.println(s);
			System.out.println(s1);
			
		//	session.save(st1);
		//	session.clear();
			tx1.commit();
			tx2.commit();

			
			session.close();
			sf.close();
			System.out.println("All Good");
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx1.rollback();
			tx2.rollback();
		}
	}
}
