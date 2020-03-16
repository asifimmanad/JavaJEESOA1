package com.asif.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asif.bean.Login;
import com.asif.service.LoginService;

//http://localhost:8087/Session14SpringMVC

@Controller
public class LoginController {

	@Autowired
	LoginService service;
	
	public LoginService getService() {
		return service;
	}
	public void setService(LoginService service) {
		this.service = service;
	}

	// http://localhost:8087/Session14SpringMVC/home
	@RequestMapping(value = "/home")
	public String validateLogin(Model m) {
		// TODO Auto-generated method stub

		System.out.println("Inside LoginController");

		Login l = new Login(1, "asif", "asif");
		
		String str = service.validateUser(l);
		m.addAttribute("key", str);
		
		return "home";
	}

}
