package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.entities.EmployeeRegister;
import com.example.demo.entities.Salary;
import com.example.demo.entities.User;
import com.example.demo.repositories.SalaryRepository;
import com.example.demo.services.EmployeeService;
import com.example.demo.services.SalaryService;
import com.example.demo.services.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("/api/v1/")
public class SalaryController 
{
	@Autowired
	SalaryService sservice;
	@Autowired
	SalaryRepository salrepo;
	@Autowired
	EmployeeService eservice;
	@Autowired
	UserService uservice;
	
	@PutMapping("/updatesalary")
	public void UpdateSalary(@RequestBody Salary salary)
	{
		System.out.println("####");
		System.out.println(salary);
		sservice.UpdateSalary(salary);
	}
	
	@GetMapping("/GetSalary")
	public List<Salary>GetSalary()
	{
		return sservice.getSalary();
	}
	
	@GetMapping("/empsal")
	public Salary getSalaryById(@RequestParam("emp_id")Integer emp_id)
	{
		Salary salary = salrepo.getSalary(emp_id);
		return salary;		
	}
	
	@PostMapping("/insertinfo")
	public Salary save(@RequestBody EmployeeRegister er)
	{
		User u = new User(er.getPassword(),"Employee",er.getSalutation(),er.getFname(),er.getMname(),er.getLname(),er.getContact_no(),er.getEmailid(),er.getDob(),er.getDoj(),er.getAddress(),er.getGender());
		User u1 = uservice.save(u);
		Employee e = new Employee(er.getOccupation(),er.getDesignation(),er.getAccount_no(),u1);
		Employee e1 = eservice.save(e);
		Salary s = new Salary(e1,er.getSalary_monthly_sal(),er.getSalary_pf(),er.getSalary_proftax());
		return sservice.save(s);
		}
}

