package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Hr;
import com.example.demo.repositories.HrRepository;

@Service
public class HrService 
{
	@Autowired
	HrRepository hrepo;
	
	public List<Hr> getAll()
	{
		return hrepo.findAll();
	}
	
	public Hr getById(int hr_id)
	{
		Optional<Hr> hr = hrepo.findById(hr_id);
		Hr h = null;
		try
		{
			h = hr.get();
		}
		catch(NoSuchElementException e1)
		{
			h = null;
		}
		return h;
	}
}
