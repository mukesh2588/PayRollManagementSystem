package com.example.demo.repositories;


import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;
import com.example.demo.entities.PaySlip;

@Repository
public interface PaySlipRepository extends JpaRepository<PaySlip, Integer>
{
	@Transactional
	@Modifying
	@Query(value="insert into payslip ( payslip_date, payslip_salary,payslip_workingdays,emp_id) "
			+ "values(:date,:sal,:wday,:empid)",nativeQuery = true)
    public void setpayslip(@Param("date")Date date,@Param("sal")Float sal,@Param("wday")Integer wday,@Param("empid")Integer empid);
	
	
	@Query(value="select * from payslip where emp_id=:emp_id ",nativeQuery = true)
	public PaySlip getPayslip(@Param("emp_id")Integer emp_id);
	

}
