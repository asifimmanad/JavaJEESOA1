package com.asif.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asif.bean.Login;


//http://localhost:8087/Session14SpringMVC

@Controller
public class LoginController {

	// http://localhost:8087/Session14SpringMVC/home
	@RequestMapping(value = "/home")
	public String validateLogin(Model m) {
		// TODO Auto-generated method stub

		System.out.println("Inside LoginController");

		Login l = new Login(1, "asif", "asif");


		return "home";
	}

}
