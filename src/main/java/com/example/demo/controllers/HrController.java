package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Hr;
import com.example.demo.services.HrService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("/api/v1/")
public class HrController 
{
	@Autowired
	HrService hserv;
	
	@GetMapping("/getallhr")
	public List<Hr>getAll()
	{
		return hserv.getAll();
				
	}
	@GetMapping("/gethrbyid")
	public Hr getById(@RequestParam("hr_id")int id)
	{
		return hserv.getById(id);
	}
}
