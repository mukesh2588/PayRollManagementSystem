package com.example.demo.services;


import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.entities.PaySlip;
import com.example.demo.entities.Salary;
import com.example.demo.repositories.PaySlipRepository;
import com.example.demo.repositories.SalaryRepository;

@Service
public class PaySlipService 
{
	@Autowired
	PaySlipRepository prepo;
	@Autowired
	EmployeeService eeservice;
	@Autowired
	SalaryService sservice;
	@Autowired
	LeaveService lservice;
	@Autowired
	SalaryRepository salrepo;
	
	public List<PaySlip> getAll()
	{
		return prepo.findAll();
	}
	
	public PaySlip getOne(int p_id)
	{
		Optional<PaySlip> pay = prepo.findById(p_id);
		PaySlip p = null;
		try
		{
			p = pay.get();
		}
		catch(NoSuchElementException e)
		{
			p = null;
		}
		return p;
	}
	
	
	public float generatePaySlipById(int empid)
	{
		   
		    Salary salary =salrepo.getSalary(empid);
	     
		    float calsal= (salary.getSalary_Monthly_sal()-(salary.getSalary_Monthly_sal()*salary.getSalary_proftax())-(salary.getSalary_Monthly_sal()*salary.getSalary_pf()));
            	
	       
		    return calsal;
		    
	}
	
	public void insertPayslip(int empid)
	{
		int workingDays= 25;
		Date date=new Date();
		float savePaySlip = generatePaySlipById(empid);
		prepo.setpayslip(date,savePaySlip,workingDays,empid);
	}
	
	public PaySlip getPayslipById(int emp_id)
	{
		return prepo.getPayslip(emp_id);
		
	}
	
	
	
}
