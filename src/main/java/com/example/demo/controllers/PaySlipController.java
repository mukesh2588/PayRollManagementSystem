package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.entities.PaySlip;
import com.example.demo.services.PaySlipService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("/api/v1/")
public class PaySlipController 
{
	@Autowired
	PaySlipService pservice;
	
	@GetMapping("/getallpayslip")
	public List<PaySlip> getAll()
	{
		return pservice.getAll();
	}
	
	@GetMapping("/getpaybyid")
	public PaySlip getOne(@RequestParam("p_id")int p_id)
	{
		return pservice.getOne(p_id);
	}
	
	/*@GetMapping("/genaratePayslip")
	public float generatePaySlipById(@RequestParam("emp_id") int emp_id)
	{
		float salary = pservice.generatePaySlipById(emp_id);
		System.out.println(salary);
		return pservice.generatePaySlipById(emp_id);
		
	}*/
	
	@GetMapping("/insertPayslip")
	public void insertPaySlipById(@RequestParam("emp_id")int emp_id)
	{
		
		System.out.println(emp_id);
		pservice.insertPayslip(emp_id);
		
	}
	
	@GetMapping("/getPayslipById")
	public PaySlip getPayslipById(@RequestParam("emp_id")int emp_id)
	{
		return pservice.getPayslipById(emp_id);
		
	}
	
	
}
