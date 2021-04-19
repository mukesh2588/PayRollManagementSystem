package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.entities.User;
import com.example.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepository erepo;
	
	public List<Employee> getAll()
	{
		return erepo.findAll();
	}
	
	public void deleteById(Integer emp_id) 
	{
		Employee employee = erepo.findById(emp_id).get();
	    erepo.delete(employee);
	}
	
	public Employee getOne(int emp_id)
	{
		Optional<Employee> emp = erepo.findById(emp_id);
		Employee e = null;
		try
		{
			e = emp.get();
		}
		catch(NoSuchElementException e1)
		{
			e=null;
		}
		return e;
	}
	
	public Employee save(Employee e)
	{
		System.out.println(e);
		return erepo.save(e);
	}
}
