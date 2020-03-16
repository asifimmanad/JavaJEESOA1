package com.asif.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asif.bean.Login;
import com.asif.dao.LoginDAO;

@Service
public class LoginService {

	@Autowired
	LoginDAO dao;
	
	public void setDao(LoginDAO dao) {
		this.dao = dao;
	}
	
	public LoginDAO getDao() {
		return dao;
	}
	
	public String validateUser(Login l) {

		String str = null;
		System.out.println("Login Service");
		
		
		List<Login> list = dao.getUserDetails(l);
		System.out.println(list);
		
		for (Login login : list) {
			if (l.getUname().equalsIgnoreCase(login.getUname()) && l.getPass().equalsIgnoreCase(login.getPass())) {

				str = "User Validated...!!!" + l;
			} else {
				str = "Invalid User...!!! Please Register First!!!";
			}
		}

		return str;
	}

}
