package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.EmployeeService;
import com.example.demo.services.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("/api/v1/")
public class UserController 
{
	@Autowired
	UserService uservice;
	@Autowired
	EmployeeService eservice;
	@Autowired
	UserRepository urepo;
	
	@GetMapping("/getalluser")
	public List<User> getAll()
	{
		return uservice.getAll();
	}
	
	@GetMapping("/getuserbyid")
	public User getEmployeeById(@RequestParam("u_id") int u_id)
	{
		return uservice.getUserById(u_id);
	}

	@PostMapping("/insertuser")
	public User save(@RequestBody User u)
	{
		return uservice.save(u);
	}
	
	@DeleteMapping("/delete/{u_id}")
	public void delete(@PathVariable(value="u_id") int u_id) 
	{
	    System.out.println(u_id);
	    uservice.deleteUserById(u_id);
	}
	
	@GetMapping("/getbyutype")
	public List<User> getByUType(@RequestParam("u_type")String u_type)
	{
		return uservice.getByUType(u_type);
	}

	/*@PutMapping("/updateuser")
	public User updateUser(@RequestParam("u_id")int u_id, @RequestBody User userdetails)
	{
		return uservice.updateUser(u_id,userdetails);
	}*/
	
	/*@PutMapping("/employees/{id}")
	public ResponseEntity<User> updateEmployee(@PathVariable int u_id, @RequestBody User userDetails){
		Optional<User> user = urepo.findById(u_id);
				
		user.setFname(userDetails.getFname());
		user.setLname(userDetails.getLname());
		user.setEmailid(userDetails.getEmailid());
		
		User updatedEmployee = employeeRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}*/
	
	@PutMapping("/EditProfile/{u_id}")
	public User updateProfile(@RequestBody User user, @PathVariable int u_id) {
		System.out.println(u_id);
		System.out.println(user);
		User u1= uservice.getUserById(u_id);
		System.out.println(u1);
		u1.setPassword(user.getPassword());
		
		u1.setFname(user.getFname());
		u1.setMname(user.getMname());
		u1.setLname(user.getLname());
		u1.setContact_no(user.getContact_no());
		u1.setAddress(user.getAddress());
		
		
		return uservice.addUser(user);
		
	}

}
