package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.services.LoginService;


@CrossOrigin(origins = "Http://localhost:3000")
@RestController
public class LoginController 
{
	@Autowired
	LoginService loservice;
	
	@GetMapping("/checkLogin")
	public String checkLogin(@RequestParam("emailid")String emailid,@RequestParam("password")String password)
	{
		return loservice.checkLogin(emailid, password);
	}
	
}	

