package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService 
{
	@Autowired
	UserRepository urepo;
	
	public List<User> getAll()
	{
		return urepo.findAll();
	}
	
	public User save(User u)
	{
		System.out.println(u);
		return urepo.save(u);
	}
	
	public void deleteUserById(Integer u_id) 
	{
		User user = urepo.findById(u_id).get();
	    urepo.delete(user);
	}
	
	public User getUserById(int u_id)
	{
		Optional<User> us =  urepo.findById(u_id) ;
		User user=null;
	    try
	    {
	    	user = us.get();
	    }
	    catch (NoSuchElementException e) 
	    {
	    	user = null;
		}
		return user;
		
	}
	public User getOneUser(int u_id)
	{
		User user=urepo.getOne(u_id);
		return user;
	}
	
	public List<User> getByUType(String u_type)
	{
		return urepo.getByUType(u_type);
	}
	
	/*public User updateUser(int u_id,User userdetails)
	{
		 User user = getOneUser(u_id);
		 user.setPassword(userdetails.getPassword());
		 
		 user.setSalutation(userdetails.getSalutation());
		 user.setFname(userdetails.getFname());
		 user.setMname(userdetails.getMname());
		 user.setLname(userdetails.getLname());
		 user.setGender(userdetails.getGender());
		 user.setContact_no(userdetails.getContact_no());
		 user.setDob(userdetails.getDob());
		 user.setDoj(userdetails.getDoj());
		 user.setAddress(userdetails.getAddress());
	 
		 return save(user);
	}*/
	
	public User addUser(User user) {
		return urepo.save(user);
	}
	
	
}
