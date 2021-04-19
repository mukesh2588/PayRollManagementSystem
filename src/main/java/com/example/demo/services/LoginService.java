package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.UserRepository;

@Service
public class LoginService {
	
	@Autowired
	UserRepository urepo;
	
	public String checkLogin(String emailid,String password)
	{
		return urepo.checkLogin(emailid,password);
	}

}
