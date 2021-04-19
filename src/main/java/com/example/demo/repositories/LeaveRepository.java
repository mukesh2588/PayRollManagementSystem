package com.example.demo.repositories;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Integer> {
	
	@Query(value="select * from leaves ",nativeQuery = true)
	public List<Leave> getAllEmployeeLeave();
	
	@Transactional
	@Modifying
	@Query
	(value="insert into leave(reason, start_date, end_date,sick_leave,casual_leave, emp_id) "
			+ "values(:reason,:start_date,:end_date,:sick,:casual,:emp_id)",nativeQuery = true)
    public void insertLeave(@Param("reason")String reason,@Param("start_date")Date start_date,@Param("end_date")Date end_date,@Param("sick")String sick_leave,@Param("casual")String casual_leave,@Param("emp_id")Integer emp_id);
	
	
	@Transactional
	@Modifying
	@Query
	(value=" update leaves l set l.reason = :reason where l.emp_id = :emp_id",nativeQuery = true)
    public void updateLeaveDesc(@Param("emp_id")Integer i,@Param("reason")String reason);
}
