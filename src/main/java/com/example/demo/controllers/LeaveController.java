package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.Leave;

import com.example.demo.services.LeaveService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("/api")
public class LeaveController 
{
	@Autowired
	LeaveService lservice;
	
	@GetMapping("/allLeaves")
	 public List<Leave> getAll()
	 {
		return lservice.getLeaves();
	 }
	

	/*@GetMapping("/getleavebyid")
	public Leave getOne(@RequestParam("l_id")int id)
	{
		return lservice.getOne(id);
	}*/
	
	@PostMapping("/saveleave")
	public int save(@RequestBody Leave l)
	{
		System.out.println(l);
		Leave lt =lservice.save(l);
		return lt.getEmp_id().getEmp_id();
	}
	@GetMapping("/getleave/{emp_id}")
	public Leave getLeaveById(@PathVariable(value = "emp_id")int emp_id)
	{
		return lservice.getLeave(emp_id);	
	}
	
	@PutMapping("/approveleave")
	public void approvedLeave(@RequestBody Leave leave)
	{
		lservice.ApproveLeave(leave);
	}
	@PutMapping("/rejectLeave")
	public void rejectLeave(@RequestBody Leave leave)
	{
		lservice.RejectLeave(leave);
	}
}
