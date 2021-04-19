package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Salary;
import com.example.demo.repositories.SalaryRepository;

@Service
public class SalaryService 
{
	@Autowired
	SalaryRepository salrepo;
	
	public Salary getSalary(int emp_id)
	{
		return salrepo.getOne(emp_id);
	}
	
	public void UpdateSalary(Salary salary)
	{
		
		salrepo.insertSal(salary.getEmp_id().getEmp_id(),salary.getSalary_Monthly_sal(),salary.getSalary_pf() ,salary.getSalary_proftax());
		/*Salary sal=salrepo.getOne(salary_emp_id);
		sal.setSalary_Monthly_sal(salary.getSalary_Monthly_sal());
		sal.setSalary_pf(salary.getSalary_pf());
		sal.setSalary_proftax(salary.getSalary_proftax());
		return salrepo.save(salary);*/
	}
	
	public List<Salary> getSalary()
	{
		return salrepo.findAll();
	}
	
	public Salary save(Salary s)
	{
		System.out.println(s);
		return salrepo.save(s);
	}
}
