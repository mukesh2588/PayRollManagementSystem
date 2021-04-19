package com.example.demo.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer> 
{
	@Query(value="select * from salary where emp_id=:emp_id",nativeQuery = true)
	public Salary getSalary(@Param("emp_id")Integer empid);
	
	
	@Transactional
	@Modifying
	@Query(value=" update salary s set s.salary_monthly_sal = :monthsal,s.salary_PF = :pf,s.salary_proftax = :tax where s.salary_emp_id = :emp_id",nativeQuery = true)
    public void insertSal(@Param("emp_id")Integer emp_id,@Param("monthsal")Float monthsal,@Param("pf")Float pf,@Param("tax")Float tax);
}
