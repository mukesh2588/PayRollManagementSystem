package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.entities.EmployeeRegister;
import com.example.demo.entities.PaySlip;
import com.example.demo.entities.User;
import com.example.demo.services.EmployeeService;
import com.example.demo.services.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("/api/v1/")
public class EmployeeController 
{
	@Autowired
	EmployeeService eservice;
	@Autowired
	UserService uservice;
	
	@GetMapping("/getallemp")
	public List<Employee> getAll()
	{
		return eservice.getAll();
	}
	
	@GetMapping("/getempbyid")
	public Employee getOne(@RequestParam("emp_id")int emp_id)
	{
		return eservice.getOne(emp_id);
	}
	@PostMapping("/saveemp")
	public Employee save(@RequestBody EmployeeRegister er)
	{
			User u = new User(er.getPassword(),"Employee",er.getSalutation(),er.getFname(),er.getMname(),er.getLname(),er.getContact_no(),er.getEmailid(),er.getDob(),er.getDoj(),er.getAddress(),er.getGender());
			User u1 = uservice.save(u);
			Employee e = new Employee(er.getOccupation(),er.getDesignation(),er.getAccount_no(),u1);
			return eservice.save(e);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestParam("emp_id")int emp_id) 
	{
	    System.out.println(emp_id);
	    eservice.deleteById(emp_id);
	}
	
	/*@RequestMapping(method =RequestMethod.POST,value="/delete")
	public String deleteEmployeeById(@RequestBody String emp_id)
	{
		Employee emp = eservice.getAppointmentById(Integer.parseInt(app_id));
		if(!service.deleteAppointment(emp))
			return "Appointment with id: " + app_id + " has been successfully deleted.";
		else
			return "An error occurred during the deleting of Appointment with id: " + app_id + ". Please try again later.";
	}*/
}
