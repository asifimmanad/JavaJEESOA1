package com.asif.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

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

			// Employee e = new Employee(515, "Swamya", "Swamya@gmail.com");
			// insert
			// s.save(e);
			// retrieve 1 employee
			// Employee e1 = (Employee)s.get(Employee.class, 222);

			// e1.setEname("Sandeep");
			// e1.setEmail("Sandeep@hotmail.com");
			// s.update(e1);

			// Employee e1 = (Employee)s.get(Employee.class, 222);

			// s.delete(e1);

			// HQL --> Internally converts hql to sql
			// HQL are on beans
			// SQL are on tables

			// select * from employee
			/*
			 * List<Employee> list = s.createQuery("from Employee where id > 500").list();
			 * 
			 * for (Employee employee : list) { System.out.println(employee); }
			 */

			
			for (int i = 0; i < 100; i++) {
				Employee e = new Employee();
				e.setEid(i);
				e.setEname("a"+i);
				e.setEmail("a@"+i);
				
				s.save(e);  
			}
			
			
			Criteria c = s.createCriteria(Employee.class);
			
			c.add(Restrictions.gt("eid", 500));

			List<Employee> list = c.list();
			
			for (Employee employee : list) {
				System.out.println(employee);
			
			}
			
			tx.commit();	// batch update is internal 	

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
