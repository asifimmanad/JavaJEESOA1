package com.asif.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asif.bean.Address;
import com.asif.bean.Person;

public class RelationClient {

	public static void main(String[] args) {
		SessionFactory sf = null;
		Session session = null;
		Transaction tx = null;
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");

			System.out.println("Config");

			sf = config.buildSessionFactory();

			session = sf.openSession();

			tx = session.beginTransaction();

			Address addr = new Address();

			addr.setCity("Mumbai");
			addr.setZip(5566566);

			Person p = new Person();

			p.setName("Suresh");
			p.setAddr(addr);

			session.save(p);

			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
		}
	}
}
