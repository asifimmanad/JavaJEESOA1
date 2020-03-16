package com.asif.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.asif.bean.Login;


@Repository
public class LoginDAO {

	@Autowired
	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public List<Login> getUserDetails(Login l) {
		// TODO Auto-generated method stub
		
		System.out.println("Login DAO");
		SessionFactory sf = template.getSessionFactory();
		
		List<Login> list = sf.openSession().createQuery("from Login").list();
		
		return list;
	}

}
