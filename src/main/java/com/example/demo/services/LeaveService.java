package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Leave;
import com.example.demo.repositories.LeaveRepository;

@Service
public class LeaveService 
{
	@Autowired
	LeaveRepository lrepo;
	
	public List<Leave> getLeaves()
	{
		return lrepo.getAllEmployeeLeave();
	}
	
	public int  getAllLeave(int empid)
	{
		int count=0;
		List<Leave> leaves = getLeaves();
		System.out.println(leaves);
		List<Integer> allempid=new ArrayList<Integer>();
		
		for (Leave lt : leaves)  
			{
				allempid.add(lt.getEmp_id().getEmp_id());
				count++;	
			}
		System.out.println(allempid);
		return count;
	}
	
	
	public Leave getOne(int l_id)
	{
		Optional<Leave> leave = lrepo.findById(l_id);
		Leave l = null;
		try
		{
			l = leave.get();
		}
		catch(NoSuchElementException e1)
		{
			l = null;
		}
		return l;
	}
	
	public Leave save(Leave l)
	{
		return lrepo.save(l);
	}
	
	public Leave getLeave(int emp_id)
	{
	
		Optional<Leave> leave =  lrepo.findById(emp_id) ;
		Leave le=null;
	    try
	    {
	    	le=leave.get();
	    }
	    catch (NoSuchElementException e) 
	    {
			le=null;
		}
	     System.out.println(le); 
		return le;
	}
	
	public void RejectLeave(Leave leave)
	{
		
		leave.setReason("Reject");
		lrepo.getAllEmployeeLeave();
	}
	
	public void ApproveLeave(Leave leave)
	{
		leave.setReason("Approved");
		System.out.println(leave.getEmp_id().getEmp_id());
		System.out.println(leave.getReason());
		lrepo.updateLeaveDesc(leave.getEmp_id().getEmp_id(),leave.getReason());
	}
}
